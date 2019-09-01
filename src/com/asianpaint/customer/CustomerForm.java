package com.asianpaint.customer;

import com.asianpaint.login.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Mathuragini
 */
public class CustomerForm extends javax.swing.JFrame {
    //Get the connection by calling connection class    

    Connection connection = DbConnection.dbconnect();        //connecting system with database
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    public CustomerForm() {
        initComponents();
        Show_Customer_In_JTable();
    }

//Method to clear the textfield         
    public void refresh() {
        jTxt_cusId.setText("");
        jTxt_cusName.setText("");
        jTxt_cusAddress.setText("");
        jTxt_cusTP.setText("");
        jTxt_cusMail.setText("");

    }

// get a list of Customer from mysql database
    public ArrayList<Customer> getUsersList() {
        ArrayList<Customer> customerList = new ArrayList<Customer>();

        String query = "SELECT * FROM  `customer` ";

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);

            Customer customer;

            while (rs.next()) {
                customer = new Customer(rs.getInt("id"), rs.getString("cus_name"), rs.getString("cus_address"), rs.getInt("cus_tp"), rs.getString("cus_mail"));
                customerList.add(customer);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return customerList;
    }

// Display Data In JTable
    public void Show_Customer_In_JTable() {
        ArrayList<Customer> list = getUsersList();
        DefaultTableModel model = (DefaultTableModel) jTable_customer.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getCustomerId();
            row[1] = list.get(i).getCustomerName();
            row[2] = list.get(i).getAddress();
            row[3] = list.get(i).getTpNumber();
            row[4] = list.get(i).getEmail();

            model.addRow(row);
        }
    }

    public void executeSQlQuery(String query, String message) {

        try {
            st = connection.createStatement();
            if ((st.executeUpdate(query)) == 1) {
                // refresh jtable data
                DefaultTableModel model = (DefaultTableModel) jTable_customer.getModel();
                model.setRowCount(0);
                Show_Customer_In_JTable();

                JOptionPane.showMessageDialog(null, "Data " + message + " Succefully");
            } else {
                JOptionPane.showMessageDialog(null, "Data Not " + message);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxt_cusName = new javax.swing.JTextField();
        jTxt_cusTP = new javax.swing.JTextField();
        jTxt_cusAddress = new javax.swing.JTextField();
        jTxt_cusMail = new javax.swing.JTextField();
        cus_clr_btn = new javax.swing.JButton();
        cus_delt_btn = new javax.swing.JButton();
        cus_add_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_customer = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        cus_edit_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTxt_cusId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Customer Details");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Customer Name");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Customer TP_Number");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Customer Address");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Email");

        jTxt_cusMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt_cusMailActionPerformed(evt);
            }
        });

        cus_clr_btn.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        cus_clr_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clear-icon.png"))); // NOI18N
        cus_clr_btn.setText("CLEAR");

        cus_delt_btn.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        cus_delt_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel1.png"))); // NOI18N
        cus_delt_btn.setText("DELETE");
        cus_delt_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_delt_btnActionPerformed(evt);
            }
        });

        cus_add_btn.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        cus_add_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add1.png"))); // NOI18N
        cus_add_btn.setText("ADD");
        cus_add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_add_btnActionPerformed(evt);
            }
        });

        jTable_customer.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTable_customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustomerID", "CustomerName", "CustomerAddress", "TP_No", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_customerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_customer);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customer.png"))); // NOI18N

        cus_edit_btn.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        cus_edit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button-Reload-icon.png"))); // NOI18N
        cus_edit_btn.setText("UPDATE");
        cus_edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_edit_btnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setText("CustomerID");

        jTxt_cusId.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(cus_add_btn)
                                .addGap(46, 46, 46)
                                .addComponent(cus_delt_btn)
                                .addGap(28, 28, 28)
                                .addComponent(cus_clr_btn)
                                .addGap(18, 18, 18)
                                .addComponent(cus_edit_btn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(127, 127, 127)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(193, 193, 193)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTxt_cusName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTxt_cusId, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel3))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxt_cusTP, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxt_cusAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxt_cusMail, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxt_cusId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTxt_cusName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxt_cusAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTxt_cusTP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxt_cusMail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(37, 37, 37))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cus_edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cus_clr_btn)
                    .addComponent(cus_delt_btn)
                    .addComponent(cus_add_btn))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxt_cusMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt_cusMailActionPerformed

    }//GEN-LAST:event_jTxt_cusMailActionPerformed

    private void cus_add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_add_btnActionPerformed
        //add customer deatils
        String query = "INSERT INTO `customer`(`cus_name`, `cus_address`, `cus_tp`,`cus_mail`) VALUES ('" + jTxt_cusName.getText() + "','" + jTxt_cusAddress.getText() + "'," + jTxt_cusTP.getText() + ",'" + jTxt_cusMail.getText() + "')";

        executeSQlQuery(query, "Inserted");
        refresh();
    }//GEN-LAST:event_cus_add_btnActionPerformed

    private void jTable_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_customerMouseClicked
        // Get The Index Of The Slected Row 
        int i = jTable_customer.getSelectedRow();

        TableModel model = jTable_customer.getModel();

        // Display Slected Row In JTexteFields
        jTxt_cusId.setText(model.getValueAt(i, 0).toString());
        jTxt_cusName.setText(model.getValueAt(i, 1).toString());

        jTxt_cusAddress.setText(model.getValueAt(i, 2).toString());

        jTxt_cusTP.setText(model.getValueAt(i, 3).toString());

        jTxt_cusMail.setText(model.getValueAt(i, 4).toString());


    }//GEN-LAST:event_jTable_customerMouseClicked

    private void cus_edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_edit_btnActionPerformed
        String query = "UPDATE `customer` SET `cus_name`='" + jTxt_cusName.getText() + "',`cus_address`='" + jTxt_cusAddress.getText() + "',`cus_tp`=" + jTxt_cusTP.getText() + " ,`cus_mail`='" + jTxt_cusMail.getText() + "' WHERE `id` = " + jTxt_cusId.getText();
        executeSQlQuery(query, "Updated");
    }//GEN-LAST:event_cus_edit_btnActionPerformed

    private void cus_delt_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_delt_btnActionPerformed
        String query = "DELETE FROM `customer` WHERE id = " + jTxt_cusId.getText();
        executeSQlQuery(query, "Deleted");
        refresh();
    }//GEN-LAST:event_cus_delt_btnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerForm().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cus_add_btn;
    private javax.swing.JButton cus_clr_btn;
    private javax.swing.JButton cus_delt_btn;
    private javax.swing.JButton cus_edit_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_customer;
    private javax.swing.JTextField jTxt_cusAddress;
    private javax.swing.JTextField jTxt_cusId;
    private javax.swing.JTextField jTxt_cusMail;
    private javax.swing.JTextField jTxt_cusName;
    private javax.swing.JTextField jTxt_cusTP;
    // End of variables declaration//GEN-END:variables
}
