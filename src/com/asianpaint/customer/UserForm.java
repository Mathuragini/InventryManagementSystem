
package com.asianpaint.customer;

import com.asianpaint.login.DbConnection;
import com.asianpaint.stocks.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class UserForm extends javax.swing.JFrame {
    //Get the connection by calling connection class    
     Connection connection = DbConnection.dbconnect();        //connecting system with database
     PreparedStatement ps;   
     Statement st;
     ResultSet rs;

    public UserForm() {
        initComponents();
        Show_User_In_JTable();
    }
public void refresh(){
    jTxt_user_id.setText("");
    jTxt_user_name.setText("");
     jTxt_user_pass.setText("");
     jTxt_user_tp.setText("");
     jTxt_user_mail.setText("");
  
}
public ArrayList<User> getUserList()
   {
       ArrayList<User>userList = new ArrayList<User>();
      
       
       String query = "SELECT * FROM asianpaint.user ";
      
       
       try {
           st = connection.createStatement();
           rs = st.executeQuery(query);

           User user;

           while(rs.next())
           {
   user = new User(rs.getInt("id"),rs.getString("username"),rs.getString("pword"),rs.getString("mail"),rs.getInt("tp"),rs.getString("role"));
               userList.add(user);
           }

       } 
      catch (Exception e) {
           e.printStackTrace();
       }
       return userList;
   }

// Display Data In JTable
   
   public void Show_User_In_JTable()
   {
       ArrayList<User> list = getUserList();
       DefaultTableModel model = (DefaultTableModel)jTable_user_details.getModel();
       Object[] row = new Object[6];
       for(int i = 0; i < list.size(); i++)
       {
           row[0] = list.get(i).getUserId();
           row[1] = list.get(i).getUsername();
           row[2] = list.get(i).getPassword();
           row[3] = list.get(i).getMail();
           row[4] = list.get(i).getTp();
           row[5] = list.get(i).getRole();
           
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
               DefaultTableModel model = (DefaultTableModel)jTable_user_details.getModel();
               model.setRowCount(0);
               Show_User_In_JTable();
               
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
        jLabel6 = new javax.swing.JLabel();
        jTxt_user_id = new javax.swing.JTextField();
        jTxt_user_name = new javax.swing.JTextField();
        jTxt_user_pass = new javax.swing.JTextField();
        jTxt_user_tp = new javax.swing.JTextField();
        jTxt_user_mail = new javax.swing.JTextField();
        jCombo_user_role = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_user_details = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        user_delt_btn = new javax.swing.JButton();
        user_clr_btn = new javax.swing.JButton();
        user_edit_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("User ID");

        jLabel2.setText("UserName");

        jLabel3.setText("Password");

        jLabel4.setText("TP_No");

        jLabel5.setText("Mail");

        jLabel6.setText("Role");

        jTxt_user_id.setEditable(false);

        jTxt_user_tp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt_user_tpActionPerformed(evt);
            }
        });

        jCombo_user_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Cashier", "StockKeeper" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTxt_user_id)
                    .addComponent(jTxt_user_name)
                    .addComponent(jTxt_user_pass)
                    .addComponent(jTxt_user_tp)
                    .addComponent(jTxt_user_mail)
                    .addComponent(jCombo_user_role, 0, 112, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxt_user_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxt_user_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxt_user_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxt_user_tp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTxt_user_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCombo_user_role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable_user_details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserID", "Username", "Password", "TP_No", "Mail", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_user_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_user_detailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_user_details);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        user_delt_btn.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        user_delt_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel1.png"))); // NOI18N
        user_delt_btn.setText("DELETE");
        user_delt_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_delt_btnActionPerformed(evt);
            }
        });

        user_clr_btn.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        user_clr_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clear-icon.png"))); // NOI18N
        user_clr_btn.setText("CLEAR");
        user_clr_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_clr_btnActionPerformed(evt);
            }
        });

        user_edit_btn.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        user_edit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button-Reload-icon.png"))); // NOI18N
        user_edit_btn.setText("UPDATE");
        user_edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_edit_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(359, Short.MAX_VALUE)
                .addComponent(user_edit_btn)
                .addGap(26, 26, 26))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addComponent(user_delt_btn)
                    .addGap(28, 28, 28)
                    .addComponent(user_clr_btn)
                    .addContainerGap(207, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(user_edit_btn)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(user_clr_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(user_delt_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setText("User Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(385, 385, 385)
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxt_user_tpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt_user_tpActionPerformed
       
    }//GEN-LAST:event_jTxt_user_tpActionPerformed

    private void user_delt_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_delt_btnActionPerformed
        String query = "DELETE FROM `user` WHERE id = "+jTxt_user_id.getText();
        executeSQlQuery(query, "Deleted");
        refresh();
    }//GEN-LAST:event_user_delt_btnActionPerformed

    private void user_clr_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_clr_btnActionPerformed
        refresh();
    }//GEN-LAST:event_user_clr_btnActionPerformed

    private void user_edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_edit_btnActionPerformed
        String query = "UPDATE `user` SET `username`='"+jTxt_user_name.getText()+"',`pword`='"+jTxt_user_pass.getText()+"',`mail`='"+jTxt_user_mail.getText()+"',`tp`="+jTxt_user_tp.getText()+",`role`='"+jCombo_user_role.getSelectedItem().toString()+"' WHERE `id` = "+jTxt_user_id.getText();
        executeSQlQuery(query, "Updated");
    }//GEN-LAST:event_user_edit_btnActionPerformed

    private void jTable_user_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_user_detailsMouseClicked
        // Get The Index Of The Slected Row 
        int i = jTable_user_details.getSelectedRow();

        TableModel model = jTable_user_details.getModel();
        
         // Display Slected Row In JTexteFields
         jTxt_user_id.setText(model.getValueAt(i,0).toString());
        jTxt_user_name.setText(model.getValueAt(i,1).toString());

        jTxt_user_pass.setText(model.getValueAt(i,2).toString());
         jTxt_user_mail.setText(model.getValueAt(i,3).toString());
          jTxt_user_tp.setText(model.getValueAt(i,4).toString());

        jCombo_user_role.setSelectedItem( model.getValueAt(i,5).toString());
       
    }//GEN-LAST:event_jTable_user_detailsMouseClicked

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCombo_user_role;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_user_details;
    private javax.swing.JTextField jTxt_user_id;
    private javax.swing.JTextField jTxt_user_mail;
    private javax.swing.JTextField jTxt_user_name;
    private javax.swing.JTextField jTxt_user_pass;
    private javax.swing.JTextField jTxt_user_tp;
    private javax.swing.JButton user_clr_btn;
    private javax.swing.JButton user_delt_btn;
    private javax.swing.JButton user_edit_btn;
    // End of variables declaration//GEN-END:variables
}
