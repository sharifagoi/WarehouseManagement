package warehouse.backend;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    public static UserWithRole UserWithRole;

    public static boolean insertUser(String name, String email, String phone, String role, String password) {
        String checkUsernameQuery = "SELECT COUNT(*) FROM users WHERE username = ?";
        String checkEmailQuery = "SELECT COUNT(*) FROM users WHERE email = ?";
        String insertQuery = "INSERT INTO users (username, email, userphone, userrole, password) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement checkUsernameStmt = connection.prepareStatement(checkUsernameQuery);
             PreparedStatement checkEmailStmt = connection.prepareStatement(checkEmailQuery)) {

            checkUsernameStmt.setString(1, name);
            ResultSet usernameRs = checkUsernameStmt.executeQuery();
            if (usernameRs.next() && usernameRs.getInt(1) > 0) {
                System.out.println("User with this username already exists.");
                return false;
            }

            checkEmailStmt.setString(1, email);
            ResultSet emailRs = checkEmailStmt.executeQuery();
            if (emailRs.next() && emailRs.getInt(1) > 0) {
                System.out.println("User with this email already exists.");
                return false;
            }

            try (PreparedStatement insertStmt = connection.prepareStatement(insertQuery)) {
                insertStmt.setString(1, name);
                insertStmt.setString(2, email);
                insertStmt.setString(3, phone);
                insertStmt.setString(4, role);
                insertStmt.setString(5, password); // Password is now hashed

                return insertStmt.executeUpdate() > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Use a logging framework here
            return false;
        }
   }
   public static UserWithRole checkLoginCredentials(String email, String password) {
    String sql = "SELECT password, userrole FROM users WHERE email = ?";
    try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setString(1, email);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            String storedPassword = rs.getString("password");
            String userRole = rs.getString("userrole");
            if (password.equals(storedPassword)) {
                return new UserWithRole(email, userRole); // Return user and role
            } else {
                System.out.println("Incorrect password for email: " + email);
                return null;
            }
        } else {
            System.out.println("User not found with email: " + email);
            return null;
        }
    } catch (SQLException e) {
        e.printStackTrace();
        return null;
    }
}

// Helper class to hold user and role
public static class UserWithRole {
    public String email;
    public String role;

    public UserWithRole(String email, String role) {
        this.email = email;
        this.role = role;
    }
}

    public static void insertAppUser(AppUserModel appuser) {
        String sql = "INSERT INTO appuser (name, mobileno, email, password) VALUES (?, ?, ?, ?)";
        try (Connection con = DatabaseConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, appuser.getName());
            ps.setString(2, appuser.getMobile());
            ps.setString(3, appuser.getEmail());
            ps.setString(4, appuser.getPassword());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Use a logging framework here
        }
    }

    public static void insertCategory(CategoryModel category) {
        String sql = "INSERT INTO category (name) VALUES (?)";
        try (Connection con = DatabaseConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, category.getName()); // Assuming CategoryModel has a getName() method
            ps.executeUpdate();
        } catch (SQLException e) {
            // Use a logging framework instead of printStackTrace()
            e.printStackTrace(); // Consider using a logger for proper error handling
        }
    }

    public static List<CategoryModel> selectCategories() {
        List<CategoryModel> categories = new ArrayList<>();
        String sql = "SELECT * FROM category;"; // Assuming table name is 'category'

        try (Connection con = DatabaseConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                // Assuming your CategoryModel has a constructor with name
                CategoryModel category = new CategoryModel(
                        rs.getInt("categoryId"),
                        rs.getString("name")
                );
                categories.add(category);
            }

        } catch (SQLException e) {
            // Use a logging framework instead of printStackTrace()
            e.printStackTrace(); // Consider using a logger for proper error handling
        }

        return categories;
    }

    public static void insertProduct(ProductModel product) {
        String sql = "INSERT INTO product (Name, Quantity,  Description, Category) VALUES (?, ?, ?, ?)";
        try (Connection con = DatabaseConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, product.getName());
            ps.setString(2, product.getQuantity()); // Assuming quantity is an integer
            ps.setString(3, product.getDescription());
            ps.setString(4, product.getCategory());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Use a logging framework here
        }
    }

    public static void insertCustomer(CustomerModel customer) {
        String sql = "INSERT INTO customer (name, phone, email) VALUES (?,?, ?)";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, customer.getName());
            ps.setString(2, customer.getPhone());
            ps.setString(3, customer.getEmail());

            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Customer inserted successfully.");
            } else {
                System.out.println("Failed to insert customer.");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Consider using a logging framework
            System.out.println("Error inserting customer: " + e.getMessage());
        }

    }

    public static List<CustomerModel> selectCustomers() {
        List<CustomerModel> customers = new ArrayList<>();
        String sql = "SELECT * FROM customer;"; // Assuming table name is 'customer'

        try (Connection con = DatabaseConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                CustomerModel customer = new CustomerModel(
                        rs.getInt("CustomerID"), // Use "customerID" (case-sensitive)
                        rs.getString("name"),
                        rs.getString("phone"),
                        rs.getString("email")
                );
                customers.add(customer);
            }

        } catch (SQLException e) {
            // Use a logging framework instead of printStackTrace()
            e.printStackTrace(); // Consider using a logger for proper error handling
        }

        return customers;
    }

    public static void insertIncomingStock(IncomingStockModel incomingstock) {
        String sql = "INSERT INTO incomingstock (name, amountcharged,quantity,  supplier, date, location) VALUES (?, ?,?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, incomingstock.getName());
            ps.setString(2, incomingstock.getQuantity());
            ps.setString(3, incomingstock.getAmountcharged());
            ps.setString(4, incomingstock.getSupplier());
            ps.setString(5, incomingstock.getDate());
            ps.setString(6, incomingstock.getLocation());

            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Stock inserted successfully.");
            } else {
                System.out.println("Failed to insert Stock.");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Consider using a logging framework
            System.out.println("Error inserting stock: " + e.getMessage());
        }
    }

    public static List<IncomingStockModel> selectIncomingStock() {
        List<IncomingStockModel> incomingstocks = new ArrayList<>();
        String sql = "SELECT *FROM incomingstock;";

        try (Connection con = DatabaseConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                IncomingStockModel incomingstock = new IncomingStockModel(
                        rs.getInt("prodid"),
                        rs.getString("name"),
                        rs.getString("quantity"),
                        rs.getString("amountcharged"),
                        rs.getString("supplier"),
                        rs.getString("date"),
                        rs.getString("location")
                );
                incomingstocks.add(incomingstock);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Use a logging framework here
        }
        return incomingstocks;
    }

    public static void insertReport(ReportModel report) {
        String sql = "INSERT INTO report (productname,shippername,customername, Quantityreturned,reason,Datereturned) VALUES ( ?,?,?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, report.getProductname());
            ps.setString(2, report.getShippername());
            ps.setString(3, report.getCustomername());
            ps.setString(4, report.getQuantityreturned());
            ps.setString(5, report.getReason());
            ps.setString(6, report.getDatereturned());

            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Items inserted successfully.");
            } else {
                System.out.println("Failed to insert items.");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Consider using a logging framework
            System.out.println("Error inserting items: " + e.getMessage());
        }
    }

    public static List<ReportModel> selectReport() {
        List<ReportModel> reports = new ArrayList<>();
        String sql = "SELECT *FROM report;";

        try (Connection con = DatabaseConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                ReportModel report = new ReportModel(
                        rs.getInt("productid"),
                        rs.getString("productname"),
                        rs.getString("shippername"),
                        rs.getString("customername"),
                        rs.getString("quantityreturned"),
                        rs.getString("reason"),
                        rs.getString("datereturned"));
                reports.add(report);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Use a logging framework here
        }
        return reports;
    }

    public static List<AppUserModel> selectAppUsers() {
        List<AppUserModel> users = new ArrayList<>();
        String sql = "SELECT * FROM appuser;";

        try (Connection con = DatabaseConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                AppUserModel user = new AppUserModel(
                        rs.getInt("appuserid"),
                        rs.getString("name"),
                        rs.getString("mobileno"),
                        rs.getString("email"),
                        rs.getString("password")
                );
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Use a logging framework here
        }
        return users;
    }

    public static List<ProductModel> selectProducts() {
        List<ProductModel> products = new ArrayList<>();
        String sql = "Select  *  FROM product;";

        try (Connection con = DatabaseConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                ProductModel product = new ProductModel(
                        rs.getInt("ProductID"),
                        rs.getString("Name"),
                        rs.getString("Quantity"), // Assuming Quantity is an integer
                        rs.getString("Description"),
                        rs.getString("Category")
                );
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Use a logging framework here
        }
        return products;
    }

    public static boolean updatePassword(String email, String password) {
        String sql = "UPDATE users SET password = ? WHERE email = ?";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, password);
            pstmt.setString(2, email);
            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace(); // Use a logging framework here
            return false;
        }
    }

    public static void insertOrdertable(OrdertableModel ordertable) {
        String sql = "INSERT INTO ordertable (name, date, totalamountcharged) VALUES (  ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, ordertable.gettxtName());
            ps.setString(2, ordertable.getDate());
            ps.setString(3, ordertable.getTotalamountcharged());

            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Deliverable inserted successfully.");
            } else {
                System.out.println("Failed to insert Deliverable.");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Consider using a logging framework
            System.out.println("Error inserting order: " + e.getMessage());
        }
    }

    public static List<OrdertableModel> selectOrdertables() {
        List<OrdertableModel> Ordertables = new ArrayList<>();
        String sql = "Select  *  FROM ordertable;";

        try (Connection con = DatabaseConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                OrdertableModel ordertable = new OrdertableModel(
                        rs.getInt("orderid"),
                        rs.getString("Name"),
                        rs.getString("Date"), // Assuming Quantity is an integer
                        rs.getString("Totalamountcharged")
                );
                Ordertables.add(ordertable);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Use a logging framework here
        }
        return Ordertables;

    }
}
