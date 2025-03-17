package warehouse.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

    private static final String URL = "jdbc:sqlite:UserData.db";
    private static Connection conn = null;

    public static Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(URL);
                System.out.println("Connection established.");
                Runtime.getRuntime().addShutdownHook(new Thread(DatabaseConnection::closeConnection));
                initializeDatabase();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Database connection closed.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

   private static void initializeDatabase() {
   createTable("CREATE TABLE IF NOT EXISTS users ("
            + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
            + "username TEXT NOT NULL UNIQUE, "
            + "email TEXT NOT NULL UNIQUE, "
            + "userphone TEXT NOT NULL, "
            + "userrole TEXT NOT NULL, "
            + "password TEXT NOT NULL)");

        createTable("CREATE TABLE IF NOT EXISTS appuser ("
                + "appuserid INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "name TEXT NOT NULL, "
                + "mobileno TEXT UNIQUE NOT NULL, "
                + "email TEXT NOT NULL, "
                + "password TEXT NOT NULL DEFAULT 'USER123')");

        createTable("CREATE TABLE IF NOT EXISTS category ("
                + "categoryId  INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "name TEXT NOT NULL)");

        createTable("CREATE TABLE IF NOT EXISTS product ("
                + "Productid INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "Name TEXT NOT NULL, "
                + "Quantity TEXT NOT NULL, "
                + "Description TEXT NOT NULL, "
                + "Category TEXT NOT NULL)");

        createTable("CREATE TABLE IF NOT EXISTS customer ("
                + "customerid INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "name TEXT NOT NULL, "
                + "phone TEXT NOT NULL, "
                + "email TEXT NOT NULL)");

        createTable("CREATE TABLE IF NOT EXISTS ordertable ("
                + "orderid INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "name TEXT NOT NULL,"
                + "date TEXT NOT NULL,"
                + "totalamountcharged TEXT NOT NULL)");

        createTable("CREATE TABLE IF NOT EXISTS incomingstock ("
                + "prodid INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "name TEXT NOT NULL,"
                + "quantity TEXT NOT NULL,"
                + "amountcharged REAL NOT NULL,"
                + "supplier TEXT NOT NULL,"
                + "date TEXT NOT NULL,"
                + "location TEXT NOT NULL) ");
        createTable("CREATE TABLE IF NOT EXISTS report ("
                + "productid INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "productname TEXT NOT NULL,"
                + "shippername TEXT NOT NULL,"
                + "customername TEXT NOT NULL,"
                + "quantityreturned TEXT NOT NULL,"
                + "reason TEXT NOT NULL,"
                + "datereturned TEXT NOT NULL)");

    }

    private static void createTable(String createTableSQL) {
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(createTableSQL);
            System.out.println("Table created (if it didn't already exist).");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
