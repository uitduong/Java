/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManagement;

import LibraryManagement.Constant;
import LibraryManagement.Helpers.Tools;
import LibraryManagement.Helpers.Users;
import LibraryManagement.Login;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.Object;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
/**
 *
 * @author duong
 */
public class Borrow extends javax.swing.JFrame {
    
    
    /**
     * Creates new form Homepage
     */
    public String sqlCond = "";
    public Borrow() {
        initComponents();
        seticon();
        Users user = new Users();
        user.getCurrentUser();
        if(user.type == Constant.type_admin || user.type == Constant.type_employee){
            btnAddBook.setVisible(true);
            btnDelete.setVisible(true);
            btnEdit.setVisible(true);
            btnDelete.setEnabled(false);
            btnEdit.setEnabled(false);
            btnSetComplete.setEnabled(false);
            btnSetComplete.setVisible(true);
        } else {
            btnAddBook.setVisible(false);
            btnDelete.setVisible(false);
            btnEdit.setVisible(false);
            btnSetComplete.setVisible(false);
            sqlCond = " AND user_id = " + user.id;
        }
    }
     public void seticon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("favicon.png")));
    }
      public void search(){
        String inputSearch = txtSearch.getText();
        JDBC db = new JDBC();
        String sql = "SELECT br.id, us.name, bk.name, br.borrowed_date, br.expected_pay_date,br.real_pay_date FROM `borrows` br JOIN books bk JOIN users us ON bk.id = br.book_id and us.id = br.user_id "
                + " Where (bk.name like '%" + inputSearch + "%' "
                + " or us.name like '%" + inputSearch + "%' ) " + sqlCond;
                //+ " Or b.description like '%" + inputSearch + "%'";
                //+ " Or a.name like '%" + inputSearch + "%'";
        Object[][] arrayBook = db.getObjectData(sql);
        String[] arrayTitle = new String[] {"ID", "Tên user", "Tên sách", "Ngày mượn","Hạn trả","Đã trả"};
        jTable1.setModel(new javax.swing.table.DefaultTableModel(arrayBook, arrayTitle));
    }
      
    public void refreshTable(){
        JDBC jDB = new JDBC();
        String sql = "SELECT br.id, us.name, bk.name, br.borrowed_date, br.expected_pay_date,br.real_pay_date FROM `borrows` br JOIN books bk JOIN users us ON bk.id = br.book_id and us.id = br.user_id "+sqlCond+" ORDER BY `id`  ASC";
        Object[][] arrayBook = jDB.getObjectData(sql);

        String[] arrayTitle = new String[] {"ID", "Tên user", "Tên sách", "Ngày mượn","Hạn trả","Đã trả"};
        jTable1.setModel(new javax.swing.table.DefaultTableModel(arrayBook, arrayTitle));
    }
    
    public void refreshTableAt(JTable tb){
        JDBC jDB = new JDBC();
        String sql = "SELECT br.id, us.name, bk.name, br.borrowed_date, br.expected_pay_date,br.real_pay_date FROM `borrows` br JOIN books bk JOIN users us ON bk.id = br.book_id and us.id = br.user_id "+sqlCond+" ORDER BY `id`  ASC";
        Object[][] arrayBook = jDB.getObjectData(sql);

        String[] arrayTitle = new String[] {"ID", "Tên user", "Tên sách", "Ngày mượn","Hạn trả","Đã trả"};
        tb.setModel(new javax.swing.table.DefaultTableModel(arrayBook, arrayTitle));
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
        rSButtonMetro4 = new rsbuttom.RSButtonMetro();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAddBook = new rsbuttom.RSButtonMetro();
        btnDelete = new rsbuttom.RSButtonMetro();
        btnEdit = new rsbuttom.RSButtonMetro();
        btnSetComplete = new rsbuttom.RSButtonMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phần mềm quản lý thư viện");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        rSButtonMetro4.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonMetro4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        rSButtonMetro4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryManagement/img/tim button.png"))); // NOI18N
        rSButtonMetro4.setColorHover(new java.awt.Color(255, 255, 255));
        rSButtonMetro4.setColorNormal(new java.awt.Color(255, 255, 255));
        rSButtonMetro4.setColorPressed(new java.awt.Color(0, 204, 204));
        rSButtonMetro4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonMetro4MouseClicked(evt);
            }
        });
        rSButtonMetro4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro4ActionPerformed(evt);
            }
        });

        txtSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
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

        jTable1.setDefaultEditor(Object.class, null);
        JDBC jDB = new JDBC();
        Users user = new Users();
        user.getCurrentUser();
        if(user.type == Constant.type_user){
            sqlCond = " AND user_id = " + user.id;
        }
        String sql = "SELECT br.id, us.name, bk.name, br.borrowed_date, br.expected_pay_date,br.real_pay_date FROM `borrows` br JOIN books bk JOIN users us ON bk.id = br.book_id and us.id = br.user_id "+sqlCond+" ORDER BY `id`  ASC";
        Object[][] arrayBook = jDB.getObjectData(sql);

        String[] arrayTitle = new String[] {"ID", "Tên user", "Tên sách", "Ngày mượn","Hạn trả","Đã trả"};
        jTable1.setModel(new javax.swing.table.DefaultTableModel(arrayBook, arrayTitle));
        jTable1.setRowHeight(25);

        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnAddBook.setBackground(new java.awt.Color(255, 255, 255));
        btnAddBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryManagement/img/them.png"))); // NOI18N
        btnAddBook.setColorHover(new java.awt.Color(255, 255, 255));
        btnAddBook.setColorNormal(new java.awt.Color(255, 255, 255));
        btnAddBook.setColorPressed(new java.awt.Color(0, 204, 204));
        btnAddBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddBookMouseClicked(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryManagement/img/sotrac.png"))); // NOI18N
        btnDelete.setColorHover(new java.awt.Color(255, 255, 255));
        btnDelete.setColorNormal(new java.awt.Color(255, 255, 255));
        btnDelete.setColorPressed(new java.awt.Color(0, 204, 204));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryManagement/img/butchi.png"))); // NOI18N
        btnEdit.setColorHover(new java.awt.Color(255, 255, 255));
        btnEdit.setColorNormal(new java.awt.Color(255, 255, 255));
        btnEdit.setColorPressed(new java.awt.Color(0, 204, 204));
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });

        btnSetComplete.setBackground(new java.awt.Color(255, 255, 255));
        btnSetComplete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryManagement/img/check.png"))); // NOI18N
        btnSetComplete.setColorHover(new java.awt.Color(255, 255, 255));
        btnSetComplete.setColorNormal(new java.awt.Color(255, 255, 255));
        btnSetComplete.setColorPressed(new java.awt.Color(0, 204, 204));
        btnSetComplete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSetCompleteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearch)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonMetro4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSetComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSButtonMetro4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSetComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addGap(180, 180, 180))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
//        new Borrow().setVisible(true);
//        this.setVisible(false);
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

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void rSButtonMetro4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMetro4ActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            search();
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void btnAddBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddBookMouseClicked
        // TODO add your handling code here:
        Window[] wd = Window.getWindows();
        int i = 0;
        for(Window w : wd){
            if(w.isShowing()){
                i++;
            }
        }
        if(i >= 2) return;
        crud_borrow ab = new crud_borrow();
        ab.setVisible(true);
        JTable tb = jTable1;
        ab.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent evt) {
                refreshTableAt(tb);
            }
        });
    }//GEN-LAST:event_btnAddBookMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        btnEdit.setEnabled(true);
        btnDelete.setEnabled(true);
        btnSetComplete.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        String id = jTable1.getModel().getValueAt(selectedRow, 0).toString();
        crud_borrow c = new crud_borrow("Cập nhật thông tin mượn", "Cập nhật", Constant.type_update, Integer.parseInt(id));
        c.setVisible(true);
        JTable tb = jTable1;
        c.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                refreshTableAt(tb);
            }
        });
    }//GEN-LAST:event_btnEditMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // TODO add your handling code here:
        int choose = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa?");
        if(choose == 0){
            int selectedRow = jTable1.getSelectedRow();
            String id = jTable1.getModel().getValueAt(selectedRow, 0).toString();
            JDBC jDB = new JDBC();
            String sql = "Delete from borrows where id = " + id;
            jDB.execute(sql);
            refreshTable();
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void rSButtonMetro3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonMetro3MouseClicked
        // TODO add your handling code here:
        new Homepage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_rSButtonMetro3MouseClicked

    private void rSButtonMetro2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonMetro2MouseClicked
        // TODO add your handling code here:
        new Students().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_rSButtonMetro2MouseClicked

    private void btnSetCompleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSetCompleteMouseClicked
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        String id = jTable1.getModel().getValueAt(selectedRow, 0).toString();
        JDBC jDB = new JDBC();
        String sql = "Update borrows set real_pay_date = '"+Tools.now()+"' where id = " + id;
        jDB.execute(sql);
        refreshTable();
    }//GEN-LAST:event_btnSetCompleteMouseClicked

    private void rSButtonMetro4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonMetro4MouseClicked
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_rSButtonMetro4MouseClicked
            
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
            java.util.logging.Logger.getLogger(Borrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Borrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Borrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Borrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Borrow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btnAddBook;
    private rsbuttom.RSButtonMetro btnBorrow;
    private rsbuttom.RSButtonMetro btnDelete;
    private rsbuttom.RSButtonMetro btnEdit;
    private rsbuttom.RSButtonMetro btnSearch;
    private rsbuttom.RSButtonMetro btnSetComplete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    javax.swing.JTable jTable1;
    private rsbuttom.RSButtonMetro logoutBtn;
    private rsbuttom.RSButtonMetro rSButtonMetro1;
    private rsbuttom.RSButtonMetro rSButtonMetro2;
    private rsbuttom.RSButtonMetro rSButtonMetro3;
    private rsbuttom.RSButtonMetro rSButtonMetro4;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
