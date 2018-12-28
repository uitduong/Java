/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManagement.Helpers;

import LibraryManagement.Constant;
import LibraryManagement.JDBC;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author duong
 */
public class Users {
    public  int    id;
    public  String username;
    public  String password;
    public  String email;
    public  String name;
    public  String school;
    public  String phone;
    public  String dob;
    public  int    type;
    public  String created_date;
    public  String ip;
    public  String mac;
    public  int    status;
    
    public Users(String un, String pw, String em, String n, String sch, String p, String bd, int t){
        em       = em.equals("") ? null : em;
        sch      = sch.equals("") ? null : sch;
        p        = p.equals("") ? null : p;
        username = un;
        password = pw;
        email    = em;
        name     = n;
        school   = sch;
        phone    = p;
        dob      = bd;
        type     = t;
    }
    
    public Users(){}
    
    public void getUserById(int id){
        try {
            JDBC db = new JDBC();
            String sql = "SELECT * FROM users Where id = " + id;
            db.stmt = db.conn.createStatement();
            db.rs = db.stmt.executeQuery(sql);
            while (db.rs.next())
            {
                this.id             = db.rs.getInt("id");
                this.username       = db.rs.getString("username");
                this.password       = db.rs.getString("password");
                this.email          = db.rs.getString("email");
                this.name           = db.rs.getString("name");
                this.school         = db.rs.getString("school");
                this.phone          = db.rs.getString("phone");
                this.dob            = db.rs.getString("dob");
                this.type           = db.rs.getInt("type");
                this.created_date   = db.rs.getString("created_date");
                this.ip             = db.rs.getString("ip");
                this.mac            = db.rs.getString("mac");
                this.status         = db.rs.getInt("status");
            }
            db.stmt.close();
        } catch (Exception e) {
            System.out.println("Error getUserById");
        }
    }
    
    // Save a user to database
    public boolean save(){
        try {
            if( username.equals("") ||
                password.equals("") ||
                name.equals("") ||
                dob.equals("") ){
                System.out.println("Empty required field!");
                return false;
            }
            JDBC db = new JDBC();
            PreparedStatement stm = db.conn.prepareStatement("INSERT INTO users (username, password, email, name, school, phone, dob, type) VALUES (?,?,?,?,?,?,?,?)");
            stm.setString(1, username);
            stm.setString(2, password);
            stm.setString(3, email);
            stm.setString(4, name);
            stm.setString(5, school);
            stm.setString(6, phone);
            stm.setString(7, dob);
            stm.setInt(8, type);
            stm.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean update(){
        try {
            JDBC db = new JDBC();
            PreparedStatement stm = db.conn.prepareStatement("UPDATE users SET username = ?, password = ?, email = ?, name = ?, school = ?, phone = ?, dob = ?, type = ? WHERE id = " + id);
            stm.setString(1, username);
            stm.setString(2, password);
            stm.setString(3, email);
            stm.setString(4, name);
            stm.setString(5, school);
            stm.setString(6, phone);
            stm.setString(7, dob);
            stm.setInt(8, type);
            stm.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    // Check login infomation
    public boolean checkLogin(String un, String pw){
        try {
            JDBC db = new JDBC();
            String sql = "SELECT * FROM users";
            db.stmt = db.conn.createStatement();
            db.rs = db.stmt.executeQuery(sql);
            while (db.rs.next())
            {
                String usernameInput = db.rs.getString("username");
                String passwordInput = db.rs.getString("password");
                //Date dateCreated = db.rs.getDate("date_created");
                if(un.equals(usernameInput) && pw.equals(passwordInput)) return true;
            }
            db.stmt.close();
            return false;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean checkExists(String un){
        try {
            JDBC db = new JDBC();
            String sql = "SELECT * FROM users";
            db.stmt = db.conn.createStatement();
            db.rs = db.stmt.executeQuery(sql);
            while (db.rs.next())
            {
                String usernameInput = db.rs.getString("username");
                if(un.equals(usernameInput)) return true;
            }
            db.stmt.close();
            return false;
        } catch (Exception e) {
            System.out.println("Error checkExists");
            return false;
        }
    }
    
    public int getIdUser(String un){
        try {
            JDBC db = new JDBC();
            String sql = "SELECT * FROM users";
            db.stmt = db.conn.createStatement();
            db.rs = db.stmt.executeQuery(sql);
            while (db.rs.next())
            {
                String usernameInput = db.rs.getString("username");
                int id = db.rs.getInt("id");
                //Date dateCreated = db.rs.getDate("date_created");
                if(un.equals(usernameInput)){
                    return id;
                }
            }
            db.stmt.close();
            return 0;
        } catch (Exception e) {
            return 0;
        }
    }
    
    public int getIdUserByIp(String ip){
        try {
            JDBC db = new JDBC();
            String sql = "SELECT * FROM users Where ip = '" + ip + "'";
            db.stmt = db.conn.createStatement();
            db.rs = db.stmt.executeQuery(sql);
            while (db.rs.next())
            {
                return db.rs.getInt("id");
            }
            db.stmt.close();
            return 0;
        } catch (Exception e) {
            return 0;
        }
    }
    
    public int getIdUserByMac(String mac){
        try {
            JDBC db = new JDBC();
            String sql = "SELECT * FROM users Where mac = '" + mac + "'";
            db.stmt = db.conn.createStatement();
            db.rs = db.stmt.executeQuery(sql);
            while (db.rs.next())
            {
                return db.rs.getInt("id");
            }
            db.stmt.close();
            return 0;
        } catch (Exception e) {
            return 0;
        }
    }
    
    public void setStatusById(int id, int stt){
        String sql;
        if(stt == Constant.status_active){
            String ip  = Tools.getIp();
            String mac = Tools.getMac();
            sql = "UPDATE users SET status = "+stt+", ip = '"+ip+"', mac = '"+mac+"' WHERE id = "+id;
        } else {
            sql = "UPDATE users SET status = "+stt+" WHERE id = "+id;
        }
        try {
            JDBC db = new JDBC();
            db.stmt = db.conn.createStatement();
            db.stmt.executeUpdate(sql);
            db.stmt.close();
        } catch (Exception e) {
            System.out.println("Error Set Status");
        }
    }
    
    public void getCurrentUser(){
        try {
            String mac = Tools.getMac();
            JDBC db = new JDBC();
            String sql = "SELECT * FROM users Where mac = '" + mac + "' AND status = " + Constant.status_active;
            db.stmt = db.conn.createStatement();
            db.rs = db.stmt.executeQuery(sql);
            int id = 0;
            while (db.rs.next())
            {
                id = db.rs.getInt("id");
            }
            db.stmt.close();
            this.getUserById(id);
        } catch (Exception e) {
            System.out.println("Error getCurrentUser");
        }
    }
    
    public void findByMssv(String mssv){
        if(mssv.equals("")) return;
        try {
            JDBC db = new JDBC();
            String sql = "SELECT * FROM users Where school like '" + mssv + "%'";
            db.stmt = db.conn.createStatement();
            db.rs = db.stmt.executeQuery(sql);
            while (db.rs.next())
            {
                id              = db.rs.getInt("id");
                username        = db.rs.getString("username");
                password        = db.rs.getString("password");
                email           = db.rs.getString("email");
                name            = db.rs.getString("name");
                school          = db.rs.getString("school");
                phone           = db.rs.getString("phone");
                dob             = db.rs.getString("dob");
                type            = db.rs.getInt("type");
                created_date    = db.rs.getString("created_date");
                ip              = db.rs.getString("ip");
                mac             = db.rs.getString("mac");
                status          = db.rs.getInt("status");
                break;
            }
            db.stmt.close();
        } catch (SQLException e) {
            System.out.println("Error Users findByMssv: " + e.getMessage());
        }
    }
}
