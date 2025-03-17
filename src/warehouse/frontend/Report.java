/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package warehouse.frontend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import warehouse.backend.DatabaseConnection;
import warehouse.backend.IncomingStockModel;
import warehouse.backend.ReportModel;
import warehouse.backend.UserDAO;

/**
 *
 * @author agoi-sharif
 */
public class Report extends javax.swing.JFrame {

    /**
     * Creates new form RecordSoldStock
     */
    public Report() {
        initComponents();
        populateData();
    }

    private void populateData() {
        List<ReportModel> reports = UserDAO.selectReport();

        // Check if products were retrieved successfully
        if (reports != null && !reports.isEmpty()) {
            // Define table model
            DefaultTableModel tableModel = new DefaultTableModel(
                    new String[]{"ProductID", "Productname", "Shippername", "Customername", "Quantityreturned", "Reason", "Datereturned",}, 0);

            for (ReportModel report : reports) {
                tableModel.addRow(report.toRowTable());
            }

            reporttable.setModel(tableModel);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reporttable = new javax.swing.JTable();
        ProductID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Prodname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        custname = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        savebtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        homebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        shipname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        reason = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 500));
        setPreferredSize(new java.awt.Dimension(900, 500));

        Container.setBackground(new java.awt.Color(255, 255, 0));
        Container.setMaximumSize(new java.awt.Dimension(900, 500));
        Container.setMinimumSize(new java.awt.Dimension(700, 500));
        Container.setPreferredSize(new java.awt.Dimension(900, 500));

        jLabel2.setBackground(new java.awt.Color(255, 255, 0));
        jLabel2.setFont(new java.awt.Font("Liberation Serif", 1, 30)); // NOI18N
        jLabel2.setText("WAREHOUSE PRODUCT MOVEMENT SYSTEM");

        reporttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ProductID", "Product Name", "Shipper Name", "Customer Name", "Quanity", "Reason", "Date"
            }
        ));
        reporttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporttableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(reporttable);
        if (reporttable.getColumnModel().getColumnCount() > 0) {
            reporttable.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setText("ProductID");

        jLabel3.setText("Shipper Name");

        jLabel4.setText("Customer Name");

        jLabel5.setText("Quantity Returned");

        savebtn.setText("SAVE");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        editbtn.setText("UPDATE");
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });

        homebtn.setText("HOME");
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });

        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Product Name");

        jLabel7.setText("Reason");

        jLabel8.setText("Date Returned");

        jLabel9.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        jLabel9.setText("ITEMS RETURNED");

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(savebtn)
                    .addComponent(homebtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(custname)
                    .addComponent(shipname)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Prodname, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                .addComponent(ProductID, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(quantity, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(reason, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(date, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(deletebtn)
                                .addComponent(editbtn)))))
                .addGap(18, 18, 18)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(22, 22, 22)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Prodname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(custname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(reason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(shipname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(savebtn)
                                .addGap(18, 18, 18)
                                .addComponent(homebtn)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deletebtn)
                                .addGap(73, 73, 73))))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        // TODO add your handling code here:
        if (ProductID.getText().isEmpty() || Prodname.getText().isEmpty() || shipname.getText().isEmpty() || custname.getText().isEmpty() || quantity.getText().isEmpty() || reason.getText().isEmpty() || date.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all required fields.");
        } else {
            String sql = "UPDATE report SET productname = ?, shippername =?,customername =?,quantityreturned = ?, reason= ?,datereturned =? WHERE ProductID= ?";
            try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, Prodname.getText());
                ps.setString(2, shipname.getText()); // Treat quantity as a string
                ps.setString(3, custname.getText());
                ps.setString(4, quantity.getText());
                ps.setString(5, reason.getText());
                ps.setString(6, date.getText());
                ps.setInt(7, Integer.parseInt(ProductID.getText())); // Assuming productId is an integer

                int rowsUpdated = ps.executeUpdate();
                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(this, "Items updated successfully.");
                    populateData(); // Refresh the user table or other UI elements
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to update items.");
                }
            } catch (SQLException e) {
                e.printStackTrace(); // Log the exception for debugging
                JOptionPane.showMessageDialog(this, "Error updating items: " + e.getMessage());
            }
        }

    }//GEN-LAST:event_editbtnActionPerformed

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        // TODO add your handling code here:\
        HomeForm homeform = new HomeForm();
        homeform.setVisible(true);
        homeform.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_homebtnActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
        if (Prodname.getText().isEmpty()
                || shipname.getText().isEmpty() || custname.getText().isEmpty()
                || quantity.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required");
        } else {
            String Productname = Prodname.getText();
            String Shipname = shipname.getText();
            String Custname = custname.getText();
            String Quantity = quantity.getText();
            String Reason= reason.getText();
            String Date = date.getText();

            ReportModel report = new ReportModel(0, Productname, Shipname, Custname, Quantity, Reason, Date);

            UserDAO.insertReport(report);
            JOptionPane.showMessageDialog(this, "Items added successfully!");
            // clearTextFields(); // Assuming a method to clear text fields

        }


    }//GEN-LAST:event_savebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = reporttable.getSelectedRow();
        if (selectedRow >= 0) {
            // Assuming the product ID is an integer in the first column
            int selectedProductID = (Integer) reporttable.getValueAt(selectedRow, 0);

            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete stock with ID " + selectedProductID + "?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                String sql = "DELETE FROM report WHERE ProductID = ?";
                try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
                    ps.setInt(1, selectedProductID); // Set the parameter as an integer
                    int rowsDeleted = ps.executeUpdate();
                    if (rowsDeleted > 0) {
                        JOptionPane.showMessageDialog(this, "Items deleted successfully.");
                        populateData(); // Refresh the table
                    } else {
                        JOptionPane.showMessageDialog(this, "Failed to delete items.");
                    }
                } catch (SQLException e) {
                    e.printStackTrace(); // Log the exception for debugging
                    JOptionPane.showMessageDialog(this, "Error deleting Stock: " + e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a stock to delete.");
        }


    }//GEN-LAST:event_deletebtnActionPerformed

    private void reporttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporttableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) reporttable.getModel();
        int Myindex = reporttable.getSelectedRow();
        ProductID.setText(model.getValueAt(Myindex, 0).toString());
        Prodname.setText(model.getValueAt(Myindex, 1).toString());
        shipname.setText(model.getValueAt(Myindex, 2).toString());
        custname.setText(model.getValueAt(Myindex, 3).toString());
        quantity.setText(model.getValueAt(Myindex, 4).toString());
        reason.setText(model.getValueAt(Myindex, 5).toString());
        date.setText(model.getValueAt(Myindex, 6).toString());


    }//GEN-LAST:event_reporttableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JTextField Prodname;
    private javax.swing.JTextField ProductID;
    private javax.swing.JTextField custname;
    private javax.swing.JTextField date;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton editbtn;
    private javax.swing.JButton homebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField reason;
    private javax.swing.JTable reporttable;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField shipname;
    // End of variables declaration//GEN-END:variables
}
