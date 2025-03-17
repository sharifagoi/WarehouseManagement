/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package warehouse.frontend;

import java.sql.Connection;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import warehouse.backend.DatabaseConnection;
import warehouse.backend.ProductModel;
import warehouse.backend.UserDAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

 
public class Product1 extends javax.swing.JFrame {

    /**
     * Creates new form Product1
     */
    public Product1() {
        initComponents();
        populateData();
        

        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                // Check if the window is maximized
                if ((getExtendedState() & MAXIMIZED_BOTH) == MAXIMIZED_BOTH) {
                    // Set background color of JFrame when maximized
                    getContentPane().setBackground(new Color(0, 51, 51));
                    // Center jPanel1
                    Container.setLocation((getWidth() - Container.getWidth()) / 2,
                            (getHeight() - Container.getHeight()) / 2);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        description = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        homebtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        producttable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        productidtxt = new javax.swing.JTextField();
        categoryTxt = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        Container.setBackground(new java.awt.Color(255, 255, 0));
        Container.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel1.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        jLabel1.setText("MANAGE PRODUCT");

        jLabel3.setText("Name");

        jLabel4.setText("Quantity");

        jLabel5.setText("Description");

        jLabel6.setText("Category");

        addbtn.setText("ADD");
        addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtnMouseClicked(evt);
            }
        });
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        editbtn.setText("EDIT");
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });

        deletebtn.setText("DELETE");
        deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebtnMouseClicked(evt);
            }
        });

        homebtn.setText("HOME");
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });

        producttable.setBackground(new java.awt.Color(242, 242, 242));
        producttable.setFont(new java.awt.Font("Liberation Serif", 0, 12)); // NOI18N
        producttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ProductID", "Name", "Quantity", "Description", "Category"
            }
        ));
        producttable.setSelectionForeground(new java.awt.Color(153, 0, 0));
        producttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                producttableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(producttable);

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel7.setText("PRODUCT LIST");

        jLabel2.setText("ProductID");

        categoryTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverages", "Food", "Alchohol", "Furniture", "Electronics", "Juice", " " }));
        categoryTxt.setActionCommand("");

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel1))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ContainerLayout.createSequentialGroup()
                                        .addComponent(deletebtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(homebtn))
                                    .addGroup(ContainerLayout.createSequentialGroup()
                                        .addComponent(addbtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(editbtn)
                                            .addComponent(categoryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2))
                                .addGap(26, 26, 26)
                                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(quantity, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(description)
                                    .addComponent(nametxt)
                                    .addComponent(productidtxt))))
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jLabel7))
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(357, Short.MAX_VALUE))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(jLabel7)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(60, 60, 60)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(categoryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addbtn)
                            .addComponent(editbtn))
                        .addGap(18, 18, 18)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deletebtn)
                            .addComponent(homebtn)))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addComponent(productidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(415, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, 1129, Short.MAX_VALUE)
                .addGap(334, 334, 334))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void addbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseClicked

    }//GEN-LAST:event_addbtnMouseClicked
private void getcategory (String categoryToFind) { // Pass the category to filter by
    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement("SELECT name FROM category WHERE name = ?")) {

        // Set the parameter value with the actual category
        ps.setString(1, categoryToFind);

        ResultSet rs = ps.executeQuery();

        // Clear the combo box (optional)
        categoryTxt.removeAllItems(); 

        while (rs.next()) {
            String categoryName = rs.getString("categoryname");
            categoryTxt.addItem(categoryName);
        }

        if (!rs.isBeforeFirst()) { // Check if no rows were found
            categoryTxt.addItem("No categories found");
        }

    } catch (SQLException e) {
        e.printStackTrace(); // Log or display an error message
    }

}
    private void populateData() {
        List<ProductModel> products = UserDAO.selectProducts();

        // Check if products were retrieved successfully
        if (products != null && !products.isEmpty()) {
            // Define table model
            DefaultTableModel tableModel = new DefaultTableModel(
                    new String[]{"ProductID", "Name", "Quantity", "Description", "Category"}, 0);

            for (ProductModel product : products) {
                tableModel.addRow(product.toRowTable());
            }

            producttable.setModel(tableModel);
        }

    }
   
    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
        if (nametxt.getText().isEmpty()
                || quantity.getText().isEmpty()
                || description.getText().isEmpty() || categoryTxt.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "All fields are required");
        } else {
            String name = nametxt.getText();
            String Quantity = quantity.getText();
            String Description = description.getText();
            String selectedCategory = (String) categoryTxt.getSelectedItem();

            ProductModel product = new ProductModel(0, name, Quantity, Description, selectedCategory);

            UserDAO.insertProduct(product);
            JOptionPane.showMessageDialog(this, "Product added successfully!");
            // clearTextFields(); // Assuming a method to clear text fields

        }
    }//GEN-LAST:event_addbtnActionPerformed


    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        // TODO add your handling code here:
        HomeForm homeformframe = new HomeForm();
        homeformframe.setVisible(true);
        homeformframe.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_homebtnActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        if (productidtxt.getText().isEmpty() || nametxt.getText().isEmpty() || quantity.getText().isEmpty() || description.getText().isEmpty() || categoryTxt.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Please fill in all required fields.");
        } else {
            String sql = "UPDATE product SET name = ?, quantity = ?, description = ?, category = ? WHERE productId = ?";
            try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, nametxt.getText());
                ps.setString(2, quantity.getText()); // Treat quantity as a string
                ps.setString(3, description.getText());
                ps.setString(4, categoryTxt.getSelectedItem().toString()); // Get the selected category from the ComboBox
                ps.setInt(5, Integer.parseInt(productidtxt.getText())); // Assuming productId is an integer

                int rowsUpdated = ps.executeUpdate();
                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(null, "Product updated successfully.");
                    // Refresh the product table or other UI elements
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to update product.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace(); // Log the exception for debugging
                JOptionPane.showMessageDialog(null, "Error updating product: " + ex.getMessage());
            }
        }


    }//GEN-LAST:event_editbtnActionPerformed

    private void deletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtnMouseClicked
        // TODO add your handling code here:   
        int selectedRow = producttable.getSelectedRow();
        if (selectedRow >= 0) {
            // Assuming the product ID is an integer in the first column
            int selectedProductId = (Integer) producttable.getValueAt(selectedRow, 0);

            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete product with ID " + selectedProductId + "?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                String sql = "DELETE FROM product WHERE productId = ?";
                try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
                    ps.setInt(1, selectedProductId); // Set the parameter as an integer
                    int rowsDeleted = ps.executeUpdate();
                    if (rowsDeleted > 0) {
                        JOptionPane.showMessageDialog(this, "Product deleted successfully.");
                        populateData(); // Refresh the table
                    } else {
                        JOptionPane.showMessageDialog(this, "Failed to delete product.");
                    }
                } catch (SQLException e) {
                    e.printStackTrace(); // Log the exception for debugging
                    JOptionPane.showMessageDialog(this, "Error deleting product: " + e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a product to delete.");
        }

    }//GEN-LAST:event_deletebtnMouseClicked

    private void producttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_producttableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) producttable.getModel();
        int Myindex = producttable.getSelectedRow();
        productidtxt.setText(model.getValueAt(Myindex, 0).toString());
        nametxt.setText(model.getValueAt(Myindex, 1).toString());
        quantity.setText(model.getValueAt(Myindex, 2).toString());
        description.setText(model.getValueAt(Myindex, 3).toString());

    }//GEN-LAST:event_producttableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JButton addbtn;
    private javax.swing.JComboBox<String> categoryTxt;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTextField description;
    private javax.swing.JButton editbtn;
    private javax.swing.JButton homebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField productidtxt;
    private javax.swing.JTable producttable;
    private javax.swing.JTextField quantity;
    // End of variables declaration//GEN-END:variables
}
