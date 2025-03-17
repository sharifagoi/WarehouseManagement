/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package warehouse.frontend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import warehouse.backend.CustomerModel;
import warehouse.backend.DatabaseConnection;
import warehouse.backend.OrdertableModel;
import warehouse.backend.ProductModel;
import warehouse.backend.UserDAO;
import static warehouse.backend.UserDAO.selectCustomers;
import static warehouse.backend.UserDAO.selectProducts;

/**
 *
 * @author agoi-sharif
 */
public class Order extends javax.swing.JFrame {

    /**
     * Creates new form Order
     */
    
    public Order () {
        initComponents();
        selectProducts();
        selectCustomers();
        populateData();
        getToday();
        
        

    }

    private void getToday() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        date.setText(dtf.format(now));
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

        List<CustomerModel> customers = UserDAO.selectCustomers();

// Check if customers were retrieved successfully
        if (customers != null && !customers.isEmpty()) {
            // Define table model
            DefaultTableModel tableModel = new DefaultTableModel(
                    new String[]{"Customerid", "Name", "Phone", "Email",}, 0); // Adjust column names as needed

            for (CustomerModel customer : customers) {
                tableModel.addRow(customer.toRowTable());
            }

            customertable.setModel(tableModel); // Assuming the table name is 'customerTable'
        }

    }

    private void update() {

        int newQuantity = oldquantity - Integer.parseInt(quantity.getText());

        String sql = "UPDATE product SET quantity = ? WHERE productId = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, newQuantity); // Set the new quantity
            ps.setInt(2, productId); // Assuming you have the product ID

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        producttable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        customertable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        orderid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        Addorder = new javax.swing.JButton();
        addorderbtn = new javax.swing.JButton();
        vieworderbtn = new javax.swing.JButton();
        homebtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        billtable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        totalamount = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        printbtn = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        prodname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Container.setBackground(new java.awt.Color(255, 255, 0));
        Container.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        Container.setPreferredSize(new java.awt.Dimension(1000, 600));

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

        customertable.setBackground(new java.awt.Color(242, 242, 242));
        customertable.setFont(new java.awt.Font("Liberation Serif", 0, 14)); // NOI18N
        customertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CustomerID", "Name", "Phone", "Email"
            }
        ));
        customertable.setSelectionForeground(new java.awt.Color(153, 0, 0));
        customertable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customertableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(customertable);

        jLabel1.setText("Orderid");

        jLabel2.setText("CustomerName");

        jLabel3.setText("Date");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        date.setText("Date");

        jLabel4.setText("Quantity");

        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });

        Addorder.setText("AddToOrder");
        Addorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddorderMouseClicked(evt);
            }
        });
        Addorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddorderActionPerformed(evt);
            }
        });

        addorderbtn.setText("ADD ORDER");
        addorderbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addorderbtnMouseClicked(evt);
            }
        });
        addorderbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addorderbtnActionPerformed(evt);
            }
        });

        vieworderbtn.setText("VIEW ORDER");
        vieworderbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vieworderbtnActionPerformed(evt);
            }
        });

        homebtn.setText("HOME");
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });

        billtable.setBackground(new java.awt.Color(242, 242, 242));
        billtable.setFont(new java.awt.Font("Liberation Serif", 0, 12)); // NOI18N
        billtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductID", "Name", "Quantity", "Price", "Total"
            }
        ));
        billtable.setSelectionForeground(new java.awt.Color(153, 0, 0));
        billtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billtableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(billtable);

        jLabel5.setFont(new java.awt.Font("Liberation Serif", 1, 30)); // NOI18N
        jLabel5.setText("WAREHOUSE PRODUCT MANAGEMENT SYSTEM");

        jLabel6.setText("CUSTOMER LIST");

        totalamount.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        totalamount.setText("AMOUNT");
        totalamount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                totalamountMouseClicked(evt);
            }
        });

        jLabel8.setText("PRODUCT LIST");

        jLabel9.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        jLabel9.setText("MANAGE ORDER");

        jLabel10.setText("Amount Charged");

        printbtn.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        printbtn.setText("PRINT");
        printbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printbtnMouseClicked(evt);
            }
        });

        jLabel7.setText("Productname");

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ContainerLayout.createSequentialGroup()
                                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(ContainerLayout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(ContainerLayout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel7)
                                        .addGap(27, 27, 27)
                                        .addComponent(prodname, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ContainerLayout.createSequentialGroup()
                                        .addComponent(addorderbtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(vieworderbtn))))
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(jLabel6))
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(homebtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(181, 181, 181))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel1)
                                .addGap(37, 37, 37)
                                .addComponent(orderid, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Addorder)))))
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(totalamount)
                .addGap(91, 91, 91)
                .addComponent(printbtn)
                .addGap(195, 195, 195))
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel5))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(1, 1, 1)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orderid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Addorder)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(prodname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vieworderbtn)
                            .addComponent(addorderbtn))
                        .addGap(18, 18, 18)
                        .addComponent(homebtn))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalamount)
                    .addComponent(printbtn))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int flag = 0, productId, oldquantity;
    private void producttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_producttableMouseClicked

        DefaultTableModel model = (DefaultTableModel) producttable.getModel();
        int Myindex = producttable.getSelectedRow();
        productId = Integer.valueOf(model.getValueAt(Myindex, 0).toString());
        Name = model.getValueAt(Myindex, 1).toString();
        oldquantity = Integer.valueOf(model.getValueAt(Myindex, 2).toString());
        //pricetxt.setText(model.getValueAt(Myindex, 3).toString());
        //description.setText(model.getValueAt(Myindex, 4).toString());
        flag = 1;
    }//GEN-LAST:event_producttableMouseClicked

    private void billtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billtableMouseClicked
    }//GEN-LAST:event_billtableMouseClicked

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        // TODO add your handling code here:
        HomeForm homeform = new HomeForm();
        homeform.setVisible(true);
        homeform.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_homebtnActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void vieworderbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vieworderbtnActionPerformed
        // TODO add your handling code here:

        Ordertable ordertable = new Ordertable();
        ordertable.setVisible(true);
        ordertable.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_vieworderbtnActionPerformed

    private void customertableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customertableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) customertable.getModel();
        int Myindex = customertable.getSelectedRow();
        // customerid.setText(model.getValueAt(Myindex,0).toString());
        txtName.setText(model.getValueAt(Myindex, 1).toString());
        //phonetxt.setText(model.getValueAt(Myindex, 2).toString());
        //emailtxt.setText(model.getValueAt(Myindex, 3).toString());

    }//GEN-LAST:event_customertableMouseClicked
    int i = 1, Uprice, tot = 0, total;
    String Name;
    private void AddorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddorderActionPerformed

        if (flag == 0 || quantity.getText().isEmpty() || price.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Select Product and enter Quantity ");

        } else {
            Uprice = Integer.valueOf(price.getText());
            tot = Uprice * Integer.valueOf(quantity.getText());
            Vector v = new Vector();
            v.add(i);
            v.add(Name);
            v.add(quantity.getText());
            v.add(Uprice);
            v.add(tot);
            DefaultTableModel dt = (DefaultTableModel) billtable.getModel();
            dt.addRow(v);
            total = total + tot;
            totalamount.setText("Kshs." + total);
            update();
            i++;
        }
    }//GEN-LAST:event_AddorderActionPerformed

    private void AddorderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddorderMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AddorderMouseClicked

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void printbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printbtnMouseClicked

        if (billtable.getRowCount() > 0) {
            try {
                billtable.print();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "No data to print.");
        }
    }//GEN-LAST:event_printbtnMouseClicked

    private void addorderbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addorderbtnActionPerformed

    }//GEN-LAST:event_addorderbtnActionPerformed

    private void addorderbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addorderbtnMouseClicked
        // TODO add your handling code here:
       if (orderid.getText().isEmpty() || txtName.getText().isEmpty() ||quantity.getText().isEmpty()|| date.getText().isEmpty() || totalamount.getText().isEmpty()) {
    JOptionPane.showMessageDialog(this, "All fields are required");
} else {
    String name = txtName.getText();
    //String Quantity =quantity.getText()
    String Date = date.getText();
     String Totalamountcharged = totalamount.getText();
    
    

    // Parse the total amount as an integer, handling potential exceptions
   
    try {
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Invalid total amount charged. Please enter a valid number.");
        return; // Exit the method if parsing fails
    }

    OrdertableModel order= new OrdertableModel(0, name, Date, Totalamountcharged);

    UserDAO.insertOrdertable(order);
    JOptionPane.showMessageDialog(this, "Deliverables added successfully!");
    // clearTextFields(); // Assuming a method to clear text fields
       }
    }//GEN-LAST:event_addorderbtnMouseClicked

    private void totalamountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalamountMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_totalamountMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addorder;
    private javax.swing.JPanel Container;
    private javax.swing.JButton addorderbtn;
    private javax.swing.JTable billtable;
    private javax.swing.JTable customertable;
    private javax.swing.JTextField date;
    private javax.swing.JButton homebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField orderid;
    private javax.swing.JTextField price;
    private javax.swing.JLabel printbtn;
    private javax.swing.JTextField prodname;
    private javax.swing.JTable producttable;
    private javax.swing.JTextField quantity;
    private javax.swing.JLabel totalamount;
    private javax.swing.JTextField txtName;
    private javax.swing.JButton vieworderbtn;
    // End of variables declaration//GEN-END:variables

}
