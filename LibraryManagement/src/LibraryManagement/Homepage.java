/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManagement;

import LibraryManagement.Helpers.Users;
import java.awt.Toolkit;

/**
 *
 * @author duong
 */
public class Homepage extends javax.swing.JFrame {

    
    /**
     * Creates new form Homepage
     */
    public Homepage() {
        initComponents();
        seticon();
        Users user = new Users();
        user.getCurrentUser();
    }
    public void seticon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("favicon.png")));
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
        jPanel2 = new javax.swing.JPanel();
        rSButtonMetro1 = new rsbuttom.RSButtonMetro();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        rSButtonMetro2 = new rsbuttom.RSButtonMetro();
        rSButtonMetro3 = new rsbuttom.RSButtonMetro();
        btnSearch = new rsbuttom.RSButtonMetro();
        btnBorrow = new rsbuttom.RSButtonMetro();
        logoutBtn = new rsbuttom.RSButtonMetro();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phần mềm quản lý thư viện");

        jPanel1.setBackground(new java.awt.Color(246, 248, 250));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonMetro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryManagement/img/menu.png"))); // NOI18N
        rSButtonMetro1.setColorHover(new java.awt.Color(0, 204, 204));
        rSButtonMetro1.setColorNormal(new java.awt.Color(0, 204, 204));
        rSButtonMetro1.setColorPressed(new java.awt.Color(0, 204, 204));
        rSButtonMetro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMetro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, 74, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryManagement/Images/ez logo.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 180, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        rSButtonMetro2.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonMetro2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 0));
        rSButtonMetro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryManagement/img/TIMSINHVIEN.png"))); // NOI18N
        rSButtonMetro2.setText("SINH VIÊN");
        rSButtonMetro2.setColorBorde(new javax.swing.border.MatteBorder(null));
        rSButtonMetro2.setColorHover(new java.awt.Color(204, 204, 204));
        rSButtonMetro2.setColorNormal(new java.awt.Color(255, 255, 255));
        rSButtonMetro2.setColorPressed(new java.awt.Color(0, 204, 204));
        rSButtonMetro2.setColorTextHover(new java.awt.Color(0, 0, 0));
        rSButtonMetro2.setColorTextNormal(new java.awt.Color(153, 153, 153));
        rSButtonMetro2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSButtonMetro2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        rSButtonMetro2.setIconTextGap(25);
        rSButtonMetro2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonMetro2MouseClicked(evt);
            }
        });

        rSButtonMetro3.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonMetro3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 0));
        rSButtonMetro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryManagement/img/home.png"))); // NOI18N
        rSButtonMetro3.setText("TRANG CHỦ");
        rSButtonMetro3.setColorBorde(new javax.swing.border.MatteBorder(null));
        rSButtonMetro3.setColorHover(new java.awt.Color(204, 204, 204));
        rSButtonMetro3.setColorNormal(new java.awt.Color(255, 255, 255));
        rSButtonMetro3.setColorPressed(new java.awt.Color(0, 204, 204));
        rSButtonMetro3.setColorTextHover(new java.awt.Color(0, 0, 0));
        rSButtonMetro3.setColorTextNormal(new java.awt.Color(153, 153, 153));
        rSButtonMetro3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSButtonMetro3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        rSButtonMetro3.setIconTextGap(25);
        rSButtonMetro3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonMetro3MouseClicked(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 0));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryManagement/img/searchSACH.png"))); // NOI18N
        btnSearch.setText("TÌM KIẾM SÁCH");
        btnSearch.setColorBorde(new javax.swing.border.MatteBorder(null));
        btnSearch.setColorHover(new java.awt.Color(204, 204, 204));
        btnSearch.setColorNormal(new java.awt.Color(255, 255, 255));
        btnSearch.setColorPressed(new java.awt.Color(0, 204, 204));
        btnSearch.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnSearch.setColorTextNormal(new java.awt.Color(153, 153, 153));
        btnSearch.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSearch.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSearch.setIconTextGap(25);
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });

        btnBorrow.setBackground(new java.awt.Color(255, 255, 255));
        btnBorrow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 0));
        btnBorrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryManagement/img/collection.png"))); // NOI18N
        btnBorrow.setText("ĐANG MƯỢN");
        btnBorrow.setColorBorde(new javax.swing.border.MatteBorder(null));
        btnBorrow.setColorHover(new java.awt.Color(204, 204, 204));
        btnBorrow.setColorNormal(new java.awt.Color(255, 255, 255));
        btnBorrow.setColorPressed(new java.awt.Color(0, 204, 204));
        btnBorrow.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnBorrow.setColorTextNormal(new java.awt.Color(153, 153, 153));
        btnBorrow.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBorrow.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBorrow.setIconTextGap(25);
        btnBorrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrowMouseClicked(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(255, 255, 255));
        logoutBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 0));
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryManagement/img/DANGXUAT.png"))); // NOI18N
        logoutBtn.setText("ĐĂNG XUẤT");
        logoutBtn.setActionCommand("ĐĂNG X");
        logoutBtn.setColorBorde(new javax.swing.border.MatteBorder(null));
        logoutBtn.setColorHover(new java.awt.Color(204, 204, 204));
        logoutBtn.setColorNormal(new java.awt.Color(255, 255, 255));
        logoutBtn.setColorPressed(new java.awt.Color(0, 204, 204));
        logoutBtn.setColorTextHover(new java.awt.Color(0, 0, 0));
        logoutBtn.setColorTextNormal(new java.awt.Color(153, 153, 153));
        logoutBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        logoutBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        logoutBtn.setIconTextGap(25);
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSButtonMetro3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBorrow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rSButtonMetro2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(rSButtonMetro3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnBorrow, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(rSButtonMetro2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryManagement/img/book nen.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(86, 86, 86))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMetro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMetro1ActionPerformed

    private void btnBorrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrowMouseClicked
        new Borrow().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBorrowMouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        new Book().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSearchMouseClicked

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        // TODO add your handling code here:
        Users user           = new Users();
        user.getCurrentUser();
        user.setStatusById(user.id, Constant.status_inactive);
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_logoutBtnMouseClicked

    private void rSButtonMetro3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonMetro3MouseClicked
        // TODO add your handling code here:
//        new Homepage().setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_rSButtonMetro3MouseClicked

    private void rSButtonMetro2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonMetro2MouseClicked
        // TODO add your handling code here:
        new Students().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_rSButtonMetro2MouseClicked
            
    // Đăng xuất

    
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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btnBorrow;
    private rsbuttom.RSButtonMetro btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private rsbuttom.RSButtonMetro logoutBtn;
    private rsbuttom.RSButtonMetro rSButtonMetro1;
    private rsbuttom.RSButtonMetro rSButtonMetro2;
    private rsbuttom.RSButtonMetro rSButtonMetro3;
    // End of variables declaration//GEN-END:variables
}
