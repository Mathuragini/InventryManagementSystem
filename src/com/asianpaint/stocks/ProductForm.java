package com.asianpaint.stocks;

import com.asianpaint.customer.Customer;
import com.asianpaint.login.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ProductForm extends javax.swing.JFrame {

    //Get the connection by calling connection class    
    Connection connection = DbConnection.dbconnect();        //connecting system with database
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    public ProductForm() {
        initComponents();
        Show_Product_In_JTable();
    }

    //Method to clear the textfield         
    public void refresh() {
        jTxt_pid.setText("");
        jTxt_pName.setText("");
        jTxt_pDes.setText("");

    }

// get a list of Product from mysql database
    public ArrayList<Product> getProductList() {
        ArrayList<Product> ProductList = new ArrayList<Product>();

        String query = "SELECT * FROM  `product` ";

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);

            Product product;

            while (rs.next()) {
                product = new Product(rs.getInt("productId"), rs.getString("name"), rs.getString("description"), rs.getString("applyTo"));
                ProductList.add(product);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ProductList;
    }

// Display Data In JTable
    public void Show_Product_In_JTable() {
        ArrayList<Product> list = getProductList();
        DefaultTableModel model = (DefaultTableModel) jTable_product_table.getModel();
        Object[] row = new Object[4];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getProductId();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getDescription();
            row[3] = list.get(i).getApplyTo();

            model.addRow(row);
        }
    }

    public void executeSQlQuery(String query, String message) {

        try {
            st = connection.createStatement();
            if ((st.executeUpdate(query)) == 1) {
                // refresh jtable data
                DefaultTableModel model = (DefaultTableModel) jTable_product_table.getModel();
                model.setRowCount(0);
                Show_Product_In_JTable();

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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxt_pid = new javax.swing.JTextField();
        jTxt_pName = new javax.swing.JTextField();
        jTxt_pDes = new javax.swing.JTextField();
        jCombo_pApply = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_product_table = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        product_clr_btn = new javax.swing.JButton();
        product_edit_btn = new javax.swing.JButton();
        product_add_btn = new javax.swing.JButton();
        product_delt_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Product Details");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Product ID");

        jLabel3.setText("Product Name");

        jLabel4.setText("Description");

        jLabel5.setText("Apply To");

        jTxt_pid.setEditable(false);

        jTxt_pDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt_pDesActionPerformed(evt);
            }
        });

        jCombo_pApply.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "InteriorWall", "ExteriorWall", "DesignArt" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTxt_pName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxt_pDes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxt_pid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jCombo_pApply, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxt_pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxt_pName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxt_pDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCombo_pApply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable_product_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Description", "ApplyTo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_product_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_product_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_product_table);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        product_clr_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        product_clr_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clear-icon.png"))); // NOI18N
        product_clr_btn.setText("CLEAR");
        product_clr_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_clr_btnActionPerformed(evt);
            }
        });

        product_edit_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        product_edit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button-Reload-icon.png"))); // NOI18N
        product_edit_btn.setText("UPDATE");
        product_edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_edit_btnActionPerformed(evt);
            }
        });

        product_add_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        product_add_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add1.png"))); // NOI18N
        product_add_btn.setText("ADD");
        product_add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_add_btnActionPerformed(evt);
            }
        });

        product_delt_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        product_delt_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel1.png"))); // NOI18N
        product_delt_btn.setText("DELETE");
        product_delt_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_delt_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(product_add_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(product_delt_btn)
                .addGap(18, 18, 18)
                .addComponent(product_edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(product_clr_btn)
                .addGap(14, 14, 14))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(product_edit_btn)
                    .addComponent(product_clr_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(product_add_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(product_delt_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel1)))
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(117, Short.MAX_VALUE))
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

    private void product_add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_add_btnActionPerformed
        //add customer deatils
        String query = "INSERT INTO `product`(`name`, `description`, `applyTo`) VALUES ('" + jTxt_pName.getText() + "','" + jTxt_pDes.getText() + "','" + jCombo_pApply.getSelectedItem().toString() + "')";

        executeSQlQuery(query, "Inserted");
        refresh();
    }//GEN-LAST:event_product_add_btnActionPerformed

    private void product_delt_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_delt_btnActionPerformed
        String query = "DELETE FROM `product` WHERE productId = " + jTxt_pid.getText();
        executeSQlQuery(query, "Deleted");
        refresh();
    }//GEN-LAST:event_product_delt_btnActionPerformed

    private void product_edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_edit_btnActionPerformed
        String query = "UPDATE `product` SET `name`='" + jTxt_pName.getText() + "',`description`='" + jTxt_pDes.getText() + "',`applyTo`='" + jCombo_pApply.getSelectedItem().toString() + "' WHERE `productId` = " + jTxt_pid.getText();
        executeSQlQuery(query, "Updated");
    }//GEN-LAST:event_product_edit_btnActionPerformed

    private void product_clr_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_clr_btnActionPerformed
        refresh();
    }//GEN-LAST:event_product_clr_btnActionPerformed

    private void jTable_product_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_product_tableMouseClicked
        // Get The Index Of The Slected Row 
        int i = jTable_product_table.getSelectedRow();

        TableModel model = jTable_product_table.getModel();

        // Display Slected Row In JTexteFields
        jTxt_pid.setText(model.getValueAt(i, 0).toString());
        jTxt_pName.setText(model.getValueAt(i, 1).toString());

        jTxt_pDes.setText(model.getValueAt(i, 2).toString());

        jCombo_pApply.setSelectedItem(model.getValueAt(i, 3).toString());


    }//GEN-LAST:event_jTable_product_tableMouseClicked

    private void jTxt_pDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt_pDesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxt_pDesActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCombo_pApply;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_product_table;
    private javax.swing.JTextField jTxt_pDes;
    private javax.swing.JTextField jTxt_pName;
    private javax.swing.JTextField jTxt_pid;
    private javax.swing.JButton product_add_btn;
    private javax.swing.JButton product_clr_btn;
    private javax.swing.JButton product_delt_btn;
    private javax.swing.JButton product_edit_btn;
    // End of variables declaration//GEN-END:variables
}
