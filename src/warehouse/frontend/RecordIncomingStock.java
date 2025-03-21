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
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import warehouse.backend.DatabaseConnection;
import warehouse.backend.IncomingStockModel;
import warehouse.backend.UserDAO;

/**
 *
 * @author agoi-sharif
 */
public class RecordIncomingStock extends javax.swing.JFrame {

    /**
     * Creates new form RecordIncomingStock
     */
    public RecordIncomingStock() {
        initComponents();
        populateData();
        getToday();
    }
 private void getToday() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        date.setText(dtf.format(now));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        incomingstocktable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        prodid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        Amountchargedtxt = new javax.swing.JTextField();
        suppliertxt = new javax.swing.JTextField();
        deletebtn = new javax.swing.JButton();
        savebtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        homebtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        location = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1100, 500));
        setMinimumSize(new java.awt.Dimension(1100, 500));

        Container.setBackground(new java.awt.Color(255, 255, 0));
        Container.setMaximumSize(new java.awt.Dimension(1100, 500));
        Container.setMinimumSize(new java.awt.Dimension(1100, 500));
        Container.setPreferredSize(new java.awt.Dimension(1100, 500));

        jLabel2.setFont(new java.awt.Font("Liberation Serif", 1, 36)); // NOI18N
        jLabel2.setText("WAREHOUSE PRODUCT MOVEMENT SYSTEM\n");

        jScrollPane1.setPreferredSize(new java.awt.Dimension(800, 500));

        incomingstocktable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ProductID", "Name", "Quantity", "Price", "Supplier", "Date", "Location"
            }
        ));
        incomingstocktable.setPreferredSize(new java.awt.Dimension(600, 300));
        incomingstocktable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                incomingstocktableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(incomingstocktable);

        jLabel1.setText("ProductID\n");

        jLabel3.setText("Name");

        jLabel4.setText("Quantity");

        jLabel5.setText("Price");

        jLabel6.setText("Supplier");

        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });

        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });

        Amountchargedtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountchargedtxtActionPerformed(evt);
            }
        });

        suppliertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppliertxtActionPerformed(evt);
            }
        });

        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        savebtn.setText("SAVE");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        homebtn.setText("BACK");
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });

        jLabel7.setText("Date");

        jLabel8.setText("Location");

        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deletebtn)
                                    .addComponent(savebtn))
                                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ContainerLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(homebtn))
                                    .addGroup(ContainerLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(updatebtn))))
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(suppliertxt)
                                        .addComponent(location, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                        .addComponent(date))
                                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(prodid, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Amountchargedtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(prodid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(19, 19, 19)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Amountchargedtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(suppliertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(savebtn)
                            .addComponent(updatebtn)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homebtn)
                    .addComponent(deletebtn))
                .addContainerGap(35, Short.MAX_VALUE))
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

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void AmountchargedtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountchargedtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmountchargedtxtActionPerformed

    private void suppliertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppliertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suppliertxtActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        if (prodid.getText().isEmpty() || nametxt.getText().isEmpty() || quantity.getText().isEmpty() || Amountchargedtxt.getText().isEmpty() || suppliertxt.getText().isEmpty() || date.getText().isEmpty() || location.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all required fields.");
        } else {
            String sql = "UPDATE incomingstock SET name = ?, quantity = ?, Amountcharged = ?, supplier = ?, date =?,location = ? WHERE prodid = ?";
            try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, nametxt.getText());
                ps.setString(2, quantity.getText()); // Treat quantity as a string
                ps.setDouble(3, Double.parseDouble(Amountchargedtxt.getText())); // Assuming price is a double
                ps.setString(4, suppliertxt.getText());
                ps.setString(5, date.getText());
                ps.setString(6, location.getText());
                ps.setInt(7, Integer.parseInt(prodid.getText())); // Assuming productId is an integer

                int rowsUpdated = ps.executeUpdate();
                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(this, "Stock updated successfully.");
                    populateData(); // Refresh the user table or other UI elements
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to update stock.");
                }
            } catch (SQLException e) {
                e.printStackTrace(); // Log the exception for debugging
                JOptionPane.showMessageDialog(this, "Error updating stock: " + e.getMessage());
            }
        }

    }//GEN-LAST:event_updatebtnActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_dateActionPerformed

    private void locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationActionPerformed

    private void populateData() {
        List<IncomingStockModel> incomingstocks = UserDAO.selectIncomingStock();

        // Check if products were retrieved successfully
        if (incomingstocks != null && !incomingstocks.isEmpty()) {
            // Define table model
            DefaultTableModel tableModel = new DefaultTableModel(
                    new String[]{"ProdID", "Name", "Quantity", "Price", "Supplier", "Date", "Location"}, 0);

            for (IncomingStockModel incomigstock : incomingstocks) {
                tableModel.addRow(incomigstock.toRowTable());
            }

            incomingstocktable.setModel(tableModel);
        }
    }
    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
        if (nametxt.getText().isEmpty()
                || quantity.getText().isEmpty() || Amountchargedtxt.getText().isEmpty()
                || suppliertxt.getText().isEmpty() || date.getText().isEmpty() || location.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required");
        } else {
            String name = nametxt.getText();
            String Quantity = quantity.getText();
            String Price = Amountchargedtxt.getText();
            String Supplier = suppliertxt.getText();
            String Date = date.getText();
            String Location = location.getText();
            IncomingStockModel incomingstock = new IncomingStockModel(0, name, Quantity, Price, Supplier, Date, Location);

            UserDAO.insertIncomingStock(incomingstock);
            JOptionPane.showMessageDialog(this, "Stock added successfully!");
            // clearTextFields(); // Assuming a method to clear text fields

        }

    }//GEN-LAST:event_savebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = incomingstocktable.getSelectedRow();
        if (selectedRow >= 0) {
            // Assuming the product ID is an integer in the first column
            int selectedProductId = (Integer) incomingstocktable.getValueAt(selectedRow, 0);

            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete stock with ID " + selectedProductId + "?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                String sql = "DELETE FROM incomingstock WHERE prodid = ?";
                try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
                    ps.setInt(1, selectedProductId); // Set the parameter as an integer
                    int rowsDeleted = ps.executeUpdate();
                    if (rowsDeleted > 0) {
                        JOptionPane.showMessageDialog(this, "Stock deleted successfully.");
                        populateData(); // Refresh the table
                    } else {
                        JOptionPane.showMessageDialog(this, "Failed to delete Stock.");
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

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        // TODO add your handling code here:
        HomeForm homeform = new HomeForm();
        homeform.setVisible(true);
        homeform.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_homebtnActionPerformed

    private void incomingstocktableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_incomingstocktableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) incomingstocktable.getModel();
        int Myindex = incomingstocktable.getSelectedRow();
        prodid.setText(model.getValueAt(Myindex, 0).toString());
        nametxt.setText(model.getValueAt(Myindex, 1).toString());
        quantity.setText(model.getValueAt(Myindex, 2).toString());
        Amountchargedtxt.setText(model.getValueAt(Myindex, 3).toString());
        suppliertxt.setText(model.getValueAt(Myindex, 3).toString());
        date.setText(model.getValueAt(Myindex, 3).toString());
        location.setText(model.getValueAt(Myindex, 3).toString());


    }//GEN-LAST:event_incomingstocktableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Amountchargedtxt;
    private javax.swing.JPanel Container;
    private javax.swing.JTextField date;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton homebtn;
    private javax.swing.JTable incomingstocktable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField location;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField prodid;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField suppliertxt;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
