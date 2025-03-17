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
import warehouse.backend.OrdertableModel;
import warehouse.backend.UserDAO;

/**
 *
 * @author agoi-sharif
 */
public class Ordertable extends javax.swing.JFrame {
     
    public Ordertable() {
        initComponents();
        populateData();
    }
    
    private void populateData() {
        List<OrdertableModel> ordertables = UserDAO.selectOrdertables();

        // Check if products were retrieved successfully
        if (ordertables != null && !ordertables.isEmpty()) {
            // Define table model
            DefaultTableModel tableModel = new DefaultTableModel(
                    new String[]{"dispatchid", "Name", "Date", "Totalamountcharged"}, 0);

            for (OrdertableModel ordertable : ordertables) {
                tableModel.addRow(ordertable.toRowTable());
            }

           ordertable.setModel(tableModel);
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ordertable = new javax.swing.JTable();
        backbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        deletebtn = new javax.swing.JButton();
        backbtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Container.setBackground(new java.awt.Color(255, 255, 0));
        Container.setMaximumSize(new java.awt.Dimension(600, 500));
        Container.setMinimumSize(new java.awt.Dimension(600, 500));
        Container.setPreferredSize(new java.awt.Dimension(600, 500));

        ordertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Orderid", "Customername", "Product Name", "Quantity", "Date", "Total Amount"
            }
        ));
        jScrollPane1.setViewportView(ordertable);

        backbtn.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        backbtn.setText("BACK");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        jLabel6.setText("ITEMS TO BE DELIVERED");

        jLabel5.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        jLabel5.setText("WAREHOUSE PRODUCT MANAGEMENT SYSTEM");

        deletebtn.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        backbtn1.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        backbtn1.setText("HOME");
        backbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel6))
                    .addComponent(jLabel5)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(deletebtn)
                .addGap(49, 49, 49)
                .addComponent(backbtn1)
                .addGap(40, 40, 40)
                .addComponent(backbtn)
                .addGap(101, 101, 101))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backbtn)
                    .addComponent(deletebtn)
                    .addComponent(backbtn1))
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        Order order = new Order();
       order.setVisible(true);
        order.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_backbtnActionPerformed

   private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {
    int selectedRow = ordertable.getSelectedRow();
    if (selectedRow >= 0) {
        int selectedorderid = (Integer) ordertable.getValueAt(selectedRow, 0);
        
        int confirm = JOptionPane.showConfirmDialog(
            this, 
            "Are you sure you want to delete order with ID " + selectedorderid + "?", 
            "Confirm Deletion", 
            JOptionPane.YES_NO_OPTION
        );
        
        if (confirm == JOptionPane.YES_OPTION) {
            String sql = "DELETE FROM ordertable WHERE orderid = ?";
            try (Connection conn = DatabaseConnection.getConnection();
                 PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, selectedorderid);
                int rowsDeleted = ps.executeUpdate();
                
                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(this, "Order deleted successfully.");
                    populateData();
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to delete order.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error deleting order: " + e.getMessage());
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a order to delete.");
    }
}

    private void backbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn1ActionPerformed
        // TODO add your handling code here:
        HomeForm homeform =new HomeForm();
        homeform.setVisible(true);
        homeform.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_backbtn1ActionPerformed

    
      
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JButton backbtn;
    private javax.swing.JButton backbtn1;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTable ordertable;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
