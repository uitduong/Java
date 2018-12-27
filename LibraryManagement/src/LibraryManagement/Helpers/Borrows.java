/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManagement.Helpers;

import LibraryManagement.JDBC;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;

/**
 *
 * @author duong
 */
public class Borrows {
    public String id;
    public String user_id;
    public String book_id;
    public String borrowed_date;
    public String expected_pay_date;
    public String real_pay_date;
    public String note;
    
    public boolean save(){
        try {
            borrowed_date = Tools.now();
            expected_pay_date = Tools.addDate(borrowed_date, 14);
            JDBC db = new JDBC();
            PreparedStatement stm = db.conn.prepareStatement("INSERT INTO borrows (user_id, book_id, borrowed_date, expected_pay_date) VALUES (?,?,?,?)");
            stm.setString(1, user_id);
            stm.setString(2, book_id);
            stm.setString(3, borrowed_date);
            stm.setString(4, expected_pay_date);
            stm.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean update(){
        try {
            borrowed_date = Tools.now();
            expected_pay_date = Tools.addDate(borrowed_date, 14);
            JDBC db = new JDBC();
            PreparedStatement stm = db.conn.prepareStatement("UPDATE borrows set user_id = ?, book_id = ?, borrowed_date = ?, expected_pay_date = ? WHERE id = "+id);
            stm.setString(1, user_id);
            stm.setString(2, book_id);
            stm.setString(3, borrowed_date);
            stm.setString(4, expected_pay_date);
            stm.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}


