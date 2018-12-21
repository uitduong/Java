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
import java.util.ArrayList;
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
}
