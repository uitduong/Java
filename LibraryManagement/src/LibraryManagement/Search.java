/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManagement;

import java.awt.Point;
import java.awt.event.KeyEvent;
import javax.swing.*;

/**
 *
 * @author duong
 */
public class Search extends javax.swing.JFrame {

    /**
     * Creates new form Search
     */
    public Search() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jBtnSearch = new javax.swing.JButton();
        btnAddBook = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(154, 195, 202));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(719, 762));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jTable1.setDefaultEditor(Object.class, null);
        JDBC jDB = new JDBC();
        String sql = "Select id, name, author, description from books";
        Object[][] arrayBook = jDB.getObjectData(sql);

        String[] arrayTitle = new String[] {"ID", "Tên", "Tác giả", "Mô tả"};
        jTable1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(arrayBook, arrayTitle));
        jTable1.setGridColor(new java.awt.Color(153, 255, 255));
        jTable1.setRowHeight(30);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 691;
        gridBagConstraints.ipady = 216;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 54, 0, 0);
        jPanel2.add(jScrollPane1, gridBagConstraints);

        btnEdit.setBackground(new java.awt.Color(255, 255, 255));
        btnEdit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(0, 204, 204));
        btnEdit.setText("SỬA");
        btnEdit.setEnabled(false);
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 7, 0, 24);
        jPanel2.add(btnEdit, gridBagConstraints);

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 204, 204));
        btnDelete.setText("XÓA");
        btnDelete.setEnabled(false);
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 7, 0, 24);
        jPanel2.add(btnDelete, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryManagement/Images/EZ LIBRARY.png"))); // NOI18N
        jLabel1.setAlignmentX(0.5F);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 69;
        gridBagConstraints.ipady = -22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 108, 0, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 204));
        jButton1.setText("QUAY LẠI");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(38, 12, 13, 0);
        jPanel2.add(jButton1, gridBagConstraints);

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 712;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 54, 0, 0);
        jPanel2.add(txtSearch, gridBagConstraints);

        jBtnSearch.setBackground(new java.awt.Color(255, 255, 255));
        jBtnSearch.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jBtnSearch.setForeground(new java.awt.Color(0, 204, 204));
        jBtnSearch.setText("TÌM");
        jBtnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnSearchMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 0, 24);
        jPanel2.add(jBtnSearch, gridBagConstraints);

        btnAddBook.setBackground(new java.awt.Color(255, 255, 255));
        btnAddBook.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAddBook.setForeground(new java.awt.Color(0, 204, 204));
        btnAddBook.setText("THÊM");
        btnAddBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddBookMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 7, 0, 24);
        jPanel2.add(btnAddBook, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void jBtnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnSearchMouseClicked
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_jBtnSearchMouseClicked

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            search();
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Homepage().setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void btnAddBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddBookMouseClicked
        // TODO add your handling code here:
        new crud_books("Thêm sách","OK").setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddBookMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        btnEdit.setEnabled(true);
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        int selectedRow = jTable1.getSelectedRow();
        String sql = "Select id, name, author, description from books";
        JDBC jDB = new JDBC();
        Object[][] book = jDB.getObjectData(sql);
        int id = Integer.parseInt((String)book[selectedRow][0]);
        new crud_books("Cập nhật thông tin sách", "Cập nhật", Constant.type_update, id).setVisible(true);
    }//GEN-LAST:event_btnEditMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        String sql = "Select id, name, author, description from books";
        JDBC jDB = new JDBC();
        Object[][] arrayBook = jDB.getObjectData(sql);
        sql = "Delete from books where id = " + arrayBook[selectedRow][0];
        jDB.execute(sql);
        refreshTable();
    }//GEN-LAST:event_btnDeleteMouseClicked

    public void refreshTable(){
        JDBC jDB = new JDBC();
        String sql = "Select id, name, author, description from books";
        Object[][] arrayBook = jDB.getObjectData(sql);

        String[] arrayTitle = new String[] {"ID", "Tên", "Tác giả", "Mô tả"};
        jTable1.setModel(new javax.swing.table.DefaultTableModel(arrayBook, arrayTitle));
    }
    
    public void search(){
        String inputSearch = txtSearch.getText();
        JDBC db = new JDBC();
        String sql = "Select id, name, author, description "
                + " From books"
                + " Where name like '%" + inputSearch + "%' ";
                //+ " Or b.description like '%" + inputSearch + "%'";
                //+ " Or a.name like '%" + inputSearch + "%'";
        Object[][] arrayBook = db.getObjectData(sql);
        String[] arrayTitle = new String[] {"ID", "Tên", "Tác giả", "Mô tả"};
        jTable1.setModel(new javax.swing.table.DefaultTableModel(arrayBook, arrayTitle));
    }
    
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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBook;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton jBtnSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}