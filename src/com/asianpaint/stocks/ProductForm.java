
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
public void refresh(){
    jTxt_pid.setText("");
    jTxt_pName.setText("");
     jTxt_pDes.setText("");
  
}

// get a list of Product from mysql database
public ArrayList<Product> getProductList()
   {
       ArrayList<Product> ProductList = new ArrayList<Product>();
      
       
       String query = "SELECT * FROM  `product` ";
      
       
       try {
           st = connection.createStatement();
           rs = st.executeQuery(query);

           Product product;

           while(rs.next())
           {
   product = new Product(rs.getInt("productId"),rs.getString("name"),rs.getString("description"),rs.getString("applyTo"));
               ProductList.add(product);
           }

       } 
      catch (Exception e) {
           e.printStackTrace();
       }
       return ProductList;
   }

// Display Data In JTable
   
   public void Show_Product_In_JTable()
   {
       ArrayList<Product> list = getProductList();
       DefaultTableModel model = (DefaultTableModel)jTable_product_table.getModel();
       Object[] row = new Object[4];
       for(int i = 0; i < list.size(); i++)
       {
           row[0] = list.get(i).getProductId();
           row[1] = list.get(i).getName();
           row[2] = list.get(i).getDescription();
           row[3] = list.get(i).getApplyTo();
           
           model.addRow(row);
       }
    }
   
    public void executeSQlQuery(String query, String message)
   {
 
       try{
           st = connection.createStatement();
           if((st.executeUpdate(query)) == 1)
           {
               // refresh jtable data
               DefaultTableModel model = (DefaultTableModel)jTable_product_table.getModel();
               model.setRowCount(0);
               Show_Product_In_JTable();
               
               JOptionPane.showMessageDialog(null, "Data "+message+" Succefully");
           }else{
               JOptionPane.showMessageDialog(null, "Data Not "+message);
           }
       }catch(Exception ex){
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
        jTxt_pid = new javax.swing.JTextField();
        jTxt_pName = new javax.swing.JTextField();
        jTxt_pDes = new javax.swing.JTextField();
        product_add_btn = new javax.swing.JButton();
        product_delt_btn = new javax.swing.JButton();
        product_clr_btn = new javax.swing.JButton();
        product_edit_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_product_table = new javax.swing.JTable();
        jCombo_pApply = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Product Details");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Product ID");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Product Name");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Description");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Apply To");

        jTxt_pid.setEditable(false);
        jTxt_pid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jTxt_pName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jTxt_pDes.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        product_add_btn.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        product_add_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add1.png"))); // NOI18N
        product_add_btn.setText("ADD");
        product_add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_add_btnActionPerformed(evt);
            }
        });

        product_delt_btn.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        product_delt_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel1.png"))); // NOI18N
        product_delt_btn.setText("DELETE");
        product_delt_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_delt_btnActionPerformed(evt);
            }
        });

        product_clr_btn.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        product_clr_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clear-icon.png"))); // NOI18N
        product_clr_btn.setText("CLEAR");
        product_clr_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_clr_btnActionPerformed(evt);
            }
        });

        product_edit_btn.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        product_edit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button-Reload-icon.png"))); // NOI18N
        product_edit_btn.setText("UPDATE");
        product_edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_edit_btnActionPerformed(evt);
            }
        });

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

        jCombo_pApply.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jCombo_pApply.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "InteriorWall", "ExteriorWall", "DesignArt" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(67, 67, 67)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTxt_pDes)
                                    .addComponent(jCombo_pApply, 0, 134, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTxt_pName, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(jTxt_pid))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(product_add_btn)
                                .addGap(46, 46, 46)
                                .addComponent(product_delt_btn)
                                .addGap(28, 28, 28)
                                .addComponent(product_clr_btn)
                                .addGap(18, 18, 18)
                                .addComponent(product_edit_btn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(jLabel1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTxt_pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTxt_pName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTxt_pDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jCombo_pApply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(product_edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product_clr_btn)
                    .addComponent(product_delt_btn)
                    .addComponent(product_add_btn))
                .addGap(120, 120, 120))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void product_add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_add_btnActionPerformed
        //add customer deatils
        String query = "INSERT INTO `product`(`name`, `description`, `applyTo`) VALUES ('"+jTxt_pName.getText()+"','"+jTxt_pDes.getText()+"','"+jCombo_pApply.getSelectedItem().toString()+"')";

        executeSQlQuery(query, "Inserted");
        refresh();
    }//GEN-LAST:event_product_add_btnActionPerformed

    private void product_delt_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_delt_btnActionPerformed
        String query = "DELETE FROM `product` WHERE productId = "+jTxt_pid.getText();
        executeSQlQuery(query, "Deleted");
        refresh();
    }//GEN-LAST:event_product_delt_btnActionPerformed

    private void product_edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_edit_btnActionPerformed
        String query = "UPDATE `product` SET `name`='"+jTxt_pName.getText()+"',`description`='"+jTxt_pDes.getText()+"',`applyTo`='"+jCombo_pApply.getSelectedItem().toString()+"' WHERE `productId` = "+jTxt_pid.getText();
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
         jTxt_pid.setText(model.getValueAt(i,0).toString());
        jTxt_pName.setText(model.getValueAt(i,1).toString());

        jTxt_pDes.setText(model.getValueAt(i,2).toString());

        jCombo_pApply.setSelectedItem( model.getValueAt(i,3).toString());
       

      
    }//GEN-LAST:event_jTable_product_tableMouseClicked

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
