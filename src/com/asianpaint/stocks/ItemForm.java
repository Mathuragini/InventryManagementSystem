
package com.asianpaint.stocks;

public class ItemForm extends javax.swing.JFrame {

    
    public ItemForm() {
        initComponents();
    }
    
    void refresh(){
        jTxt_itm_id.setText("");
                                 
       
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTxt_itm_id = new javax.swing.JTextField();
        jTxt_prod_id = new javax.swing.JTextField();
        jTxt_itm_name = new javax.swing.JTextField();
        jTxt_itm_price = new javax.swing.JTextField();
        jTxt_itm_wash = new javax.swing.JTextField();
        jTxt_itm_coverage = new javax.swing.JTextField();
        jTxt_itm_finish = new javax.swing.JTextField();
        jTxt_itm_warranty = new javax.swing.JTextField();
        jTxt_itm_shade = new javax.swing.JTextField();
        item_add_btn = new javax.swing.JButton();
        item_delt_btn = new javax.swing.JButton();
        item_clr_btn = new javax.swing.JButton();
        item_edit_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel1.setText("Item Details");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Item ID");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Product ID");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Item Name");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Price Range");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Washability");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Coverage");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Finish");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Warranty");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Shade Range");

        jTxt_itm_id.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTxt_itm_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt_itm_idActionPerformed(evt);
            }
        });

        jTxt_prod_id.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTxt_prod_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt_prod_idActionPerformed(evt);
            }
        });

        jTxt_itm_name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jTxt_itm_price.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jTxt_itm_wash.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jTxt_itm_coverage.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jTxt_itm_finish.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jTxt_itm_warranty.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jTxt_itm_shade.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        item_add_btn.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        item_add_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add1.png"))); // NOI18N
        item_add_btn.setText("ADD");
        item_add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_add_btnActionPerformed(evt);
            }
        });

        item_delt_btn.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        item_delt_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel1.png"))); // NOI18N
        item_delt_btn.setText("DELETE");
        item_delt_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_delt_btnActionPerformed(evt);
            }
        });

        item_clr_btn.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        item_clr_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clear-icon.png"))); // NOI18N
        item_clr_btn.setText("CLEAR");
        item_clr_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_clr_btnActionPerformed(evt);
            }
        });

        item_edit_btn.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        item_edit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button-Reload-icon.png"))); // NOI18N
        item_edit_btn.setText("UPDATE");
        item_edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_edit_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxt_itm_wash, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTxt_itm_warranty, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                        .addComponent(jTxt_itm_coverage)
                                        .addComponent(jTxt_itm_finish))
                                    .addComponent(jTxt_itm_price, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)))
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxt_itm_id, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxt_prod_id, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxt_itm_name, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(item_add_btn)
                        .addGap(46, 46, 46)
                        .addComponent(item_delt_btn)
                        .addGap(28, 28, 28)
                        .addComponent(item_clr_btn)
                        .addGap(18, 18, 18)
                        .addComponent(item_edit_btn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel10)
                        .addGap(65, 65, 65)
                        .addComponent(jTxt_itm_shade, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel1)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTxt_itm_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTxt_prod_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTxt_itm_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTxt_itm_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTxt_itm_wash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTxt_itm_coverage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxt_itm_finish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(66, 66, 66))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxt_itm_warranty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxt_itm_shade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item_edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item_clr_btn)
                    .addComponent(item_delt_btn)
                    .addComponent(item_add_btn))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxt_itm_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt_itm_idActionPerformed
      
    }//GEN-LAST:event_jTxt_itm_idActionPerformed

    private void jTxt_prod_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt_prod_idActionPerformed
        
    }//GEN-LAST:event_jTxt_prod_idActionPerformed

    private void item_add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_add_btnActionPerformed
        
    }//GEN-LAST:event_item_add_btnActionPerformed

    private void item_delt_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_delt_btnActionPerformed
        
    }//GEN-LAST:event_item_delt_btnActionPerformed

    private void item_clr_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_clr_btnActionPerformed
        refresh();
    }//GEN-LAST:event_item_clr_btnActionPerformed

    private void item_edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_edit_btnActionPerformed
       
    }//GEN-LAST:event_item_edit_btnActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton item_add_btn;
    private javax.swing.JButton item_clr_btn;
    private javax.swing.JButton item_delt_btn;
    private javax.swing.JButton item_edit_btn;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxt_itm_coverage;
    private javax.swing.JTextField jTxt_itm_finish;
    private javax.swing.JTextField jTxt_itm_id;
    private javax.swing.JTextField jTxt_itm_name;
    private javax.swing.JTextField jTxt_itm_price;
    private javax.swing.JTextField jTxt_itm_shade;
    private javax.swing.JTextField jTxt_itm_warranty;
    private javax.swing.JTextField jTxt_itm_wash;
    private javax.swing.JTextField jTxt_prod_id;
    // End of variables declaration//GEN-END:variables
}
