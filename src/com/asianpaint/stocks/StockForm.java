package com.asianpaint.stocks;

/**
 *
 * @author Mathuragini
 */
public class StockForm extends javax.swing.JFrame {

    public StockForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTxt_stk_date = new javax.swing.JTextField();
        jTxt_stk_qty = new javax.swing.JTextField();
        jTxt_stk_itm_name = new javax.swing.JTextField();
        jTxt_stk_type = new javax.swing.JTextField();
        jTxt_stk_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        stock_add_btn = new javax.swing.JButton();
        stock_delt_btn = new javax.swing.JButton();
        stock_clr_btn = new javax.swing.JButton();
        stock_edit_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Stock ID");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Stock Type");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Item ID");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Quantity");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Date");

        jTxt_stk_date.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jTxt_stk_qty.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jTxt_stk_itm_name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jTxt_stk_type.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTxt_stk_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt_stk_typeActionPerformed(evt);
            }
        });

        jTxt_stk_id.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTxt_stk_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt_stk_idActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel1.setText("Stock Details");

        stock_add_btn.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        stock_add_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add1.png"))); // NOI18N
        stock_add_btn.setText("ADD");
        stock_add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock_add_btnActionPerformed(evt);
            }
        });

        stock_delt_btn.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        stock_delt_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel1.png"))); // NOI18N
        stock_delt_btn.setText("DELETE");
        stock_delt_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock_delt_btnActionPerformed(evt);
            }
        });

        stock_clr_btn.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        stock_clr_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clear-icon.png"))); // NOI18N
        stock_clr_btn.setText("CLEAR");
        stock_clr_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock_clr_btnActionPerformed(evt);
            }
        });

        stock_edit_btn.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        stock_edit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button-Reload-icon.png"))); // NOI18N
        stock_edit_btn.setText("UPDATE");
        stock_edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock_edit_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxt_stk_date, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxt_stk_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxt_stk_id, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxt_stk_type, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxt_stk_itm_name, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(stock_add_btn)
                        .addGap(46, 46, 46)
                        .addComponent(stock_delt_btn)
                        .addGap(28, 28, 28)
                        .addComponent(stock_clr_btn)
                        .addGap(18, 18, 18)
                        .addComponent(stock_edit_btn)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxt_stk_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxt_stk_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxt_stk_itm_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTxt_stk_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTxt_stk_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stock_edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stock_clr_btn)
                    .addComponent(stock_delt_btn)
                    .addComponent(stock_add_btn))
                .addContainerGap(109, Short.MAX_VALUE))
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

    private void jTxt_stk_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt_stk_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxt_stk_typeActionPerformed

    private void jTxt_stk_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt_stk_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxt_stk_idActionPerformed

    private void stock_add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stock_add_btnActionPerformed

    }//GEN-LAST:event_stock_add_btnActionPerformed

    private void stock_delt_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stock_delt_btnActionPerformed

    }//GEN-LAST:event_stock_delt_btnActionPerformed

    private void stock_clr_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stock_clr_btnActionPerformed
        //refresh();
    }//GEN-LAST:event_stock_clr_btnActionPerformed

    private void stock_edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stock_edit_btnActionPerformed

    }//GEN-LAST:event_stock_edit_btnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxt_stk_date;
    private javax.swing.JTextField jTxt_stk_id;
    private javax.swing.JTextField jTxt_stk_itm_name;
    private javax.swing.JTextField jTxt_stk_qty;
    private javax.swing.JTextField jTxt_stk_type;
    private javax.swing.JButton stock_add_btn;
    private javax.swing.JButton stock_clr_btn;
    private javax.swing.JButton stock_delt_btn;
    private javax.swing.JButton stock_edit_btn;
    // End of variables declaration//GEN-END:variables
}
