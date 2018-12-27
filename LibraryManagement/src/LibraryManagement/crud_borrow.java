/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManagement;

import LibraryManagement.Helpers.Books;
import LibraryManagement.Helpers.Borrows;
import LibraryManagement.Helpers.Tools;
import LibraryManagement.Helpers.Users;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Luong Hung
 */
public class crud_borrow extends javax.swing.JFrame {

    /**
     * Creates new form add_borrow
     */
    public String lblTitle;
    public String btnText;
    public int type;
    public int id;
    
    public crud_borrow() {
        initComponents();
        type = Constant.type_create;
        txtDateBorrow.setText(Tools.convertDate(Tools.now()));
        txtPayDate.setText(Tools.convertDate(Tools.addDate(Tools.now(), 14)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtDateBorrow = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPayDate = new javax.swing.JTextField();
        txtMssv = new javax.swing.JTextField();
        txtBook = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        spId = new javax.swing.JLabel();
        spName = new javax.swing.JLabel();
        spAuthor = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        stId = new javax.swing.JLabel();
        stName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(0, 204, 204));
        txtTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitle.setText("THÊM MƯỢN");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel2.setText("MSSV");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel3.setText("Tên sách: ");

        btnConfirm.setBackground(new java.awt.Color(0, 204, 204));
        btnConfirm.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("THÊM");
        btnConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel4.setText("Ngày mượn:");

        txtDateBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateBorrowActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel5.setText("Hạn trả:");

        txtMssv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMssvActionPerformed(evt);
            }
        });
        txtMssv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMssvKeyReleased(evt);
            }
        });

        txtBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookActionPerformed(evt);
            }
        });
        txtBook.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBookKeyReleased(evt);
            }
        });

        jLabel6.setText("ID:");

        jLabel7.setText("Name:");

        jLabel8.setText("Author:");

        spId.setText("   ");

        spName.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        spName.setText("   ");

        spAuthor.setText("   ");

        jLabel9.setText("ID:");

        jLabel10.setText("Name:");

        stId.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        stId.setText("   ");

        stName.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        stName.setText("   ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBook)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                .addGap(9, 9, 9))
                            .addComponent(txtDateBorrow)
                            .addComponent(txtPayDate)
                            .addComponent(txtMssv, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(168, 168, 168))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(spName)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(spId)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(spAuthor)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(stName))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(40, 40, 40)
                                .addComponent(stId)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMssv, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(stId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(stName))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBook, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(spId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(spName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(spAuthor))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDateBorrow, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDateBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateBorrowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateBorrowActionPerformed

    private void txtMssvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMssvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMssvActionPerformed

    private void txtBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookActionPerformed
    
    public crud_borrow(String title, String btnText, int type, int id) {
        initComponents();
        txtTitle.setText(title);
        btnConfirm.setText(btnText);
        this.type = type;
        this.id   = id;
        if(this.type == Constant.type_update){
            String sql = "Select u.name, u.id, u.school, b.name, b.author, b.id, br.borrowed_date, expected_pay_date FROM borrows br JOIN books b JOIN users u ON br.user_id = u.id AND b.id = br.book_id where br.id = " + id;
            JDBC jDB = new JDBC();
            Object[][] book = jDB.getObjectData(sql);
            stName.setText( (String) book[0][0] );
            stId.setText( (String) book[0][1] );
            txtMssv.setText( (String) book[0][2] );
            spName.setText( (String) book[0][3] );
            txtBook.setText( (String) book[0][3] );
            spAuthor.setText( (String) book[0][4] );
            spId.setText( (String) book[0][5] );
            txtDateBorrow.setText( (String) book[0][6] );
            txtPayDate.setText( (String) book[0][7] );
        }
    }
    
    private void btnConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseClicked
        // TODO add your handling code here:
        Borrows br           = new Borrows();
        br.user_id           = stId.getText();
        br.book_id           = spId.getText();
        br.borrowed_date     = Tools.convertDate(txtDateBorrow.getText());
        br.expected_pay_date = Tools.convertDate(txtPayDate.getText());
        if(br.user_id.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "MSSV KHÔNG được để trống!");
            return;
        }
        if(br.book_id.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Tên sách KHÔNG được để trống!");
            return;
        }
        if(br.borrowed_date.equals("")){
            JOptionPane.showMessageDialog(null, "Ngày mượn KHÔNG được để trống!");
            return;
        }
        if(type == Constant.type_create){
            br.save();
        } else {
            br.id = Integer.toString(id);
            br.update();
        }
        JOptionPane.showMessageDialog(null, "Thêm thành công!");
    }//GEN-LAST:event_btnConfirmMouseClicked

    private void txtBookKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBookKeyReleased
        // TODO add your handling code here:
        String txt = txtBook.getText();
        Books b = new Books();
        System.out.println(txt);
        b.findByName(txt);
        if(b.name != null){
            spAuthor.setText(b.author);
            spName.setText(b.name);
            spId.setText(Integer.toString(b.id));
        }
    }//GEN-LAST:event_txtBookKeyReleased

    private void txtMssvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMssvKeyReleased
        // TODO add your handling code here:
        String txt = txtMssv.getText();
        Users us = new Users();
        us.findByMssv(txt);
        if(us.name != null){
            stName.setText(us.name);
            stId.setText(Integer.toString(us.id));
        }
    }//GEN-LAST:event_txtMssvKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(crud_borrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crud_borrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crud_borrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crud_borrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crud_borrow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
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
    private javax.swing.JLabel spAuthor;
    private javax.swing.JLabel spId;
    private javax.swing.JLabel spName;
    private javax.swing.JLabel stId;
    private javax.swing.JLabel stName;
    private javax.swing.JTextField txtBook;
    private javax.swing.JTextField txtDateBorrow;
    private javax.swing.JTextField txtMssv;
    private javax.swing.JTextField txtPayDate;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
