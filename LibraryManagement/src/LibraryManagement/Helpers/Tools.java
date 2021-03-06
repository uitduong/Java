/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManagement.Helpers;

import java.lang.reflect.Field;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author duong
 */
public class Tools {
    
    public static String getIp(){
        try(final DatagramSocket socket = new DatagramSocket()){
            socket.connect(InetAddress.getByName("8.8.8.8"), 10002);
            return socket.getLocalAddress().getHostAddress();
        } catch (SocketException | UnknownHostException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public static String getMac(){
        try {
            Enumeration<NetworkInterface> networks;
            networks = NetworkInterface.getNetworkInterfaces();
            NetworkInterface inter;
            String res = "";
            while (networks.hasMoreElements()) {
                inter = networks.nextElement();
                byte[] mac = inter.getHardwareAddress();
                if (mac != null) {
                    for (int i = 0; i < mac.length; i++) {
                        res += String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
                    }
                }
            }
            return res;
        } catch (SocketException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public List<String> getProperties(Object cls){
        String[] res;
        List<String> mysclass = new ArrayList<>();
        for (Field field : cls.getClass().getDeclaredFields()) {
            field.setAccessible(true); // You might want to set modifier to public first.
            String value = field.getName();
            if (value != null) {
                mysclass.add(value);
            }
        }
        return mysclass;
    }
    
    public static String addDate(String date, int number){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar c = Calendar.getInstance();
            c.setTime(sdf.parse(date));
            c.add(Calendar.DATE, number);  // number of days to add
            date = sdf.format(c.getTime());  // dt is now the new date
            return date;
        } catch (ParseException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static String now(){
        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();
        return year + "-" + String.format("%02d", month) + "-" + String.format("%02d", day);
    }
    
    // Convert Y-m-d to D-m-y and nguoc lai
    public static String convertDate(String date){
        String[] split = date.split("-");
        StringBuilder sb = new StringBuilder();
        for (int i = split.length-1; i >= 0; i--) {
            sb.append(split[i]);
            if (i != 0) {
                sb.append("-");
            }
        }
        String joined = sb.toString();
        return joined;
    }

}
