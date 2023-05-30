/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQLCommand;

import Utility.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;

/**
 *
 * @author ADMIN
 */
public class SQLCommand {
     public static boolean checkLogin(String mail, String password) throws SQLException, NamingException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtility.makeConnection();
            if (con != null) {
                String sql = "select * From dbo.Account_User Where mail = ? And password = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, mail);
                stm.setString(2, password);
                rs = stm.executeQuery();
                if (rs.next()) {
                    return true;
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }
     public boolean insertAccount(int user_id, String username,String password, String address, String phoneNumber, String mail) throws SQLException{
        Connection con = null;
        PreparedStatement stm = null;
        try{
            con = DBUtility.makeConnection();
            if(con != null){
                String sql = "Insert into dbo.Account_User (user_id,username,password,address,phone_number,mail) Values (?,?,?,?,?,?)";
                stm = con.prepareStatement(sql);
                stm.setInt(1, user_id);
                stm.setString(2, username);
                stm.setString(3, password);
                stm.setString(4, address);
                stm.setString(5, phoneNumber);
                stm.setString(6, mail);
                int row = stm.executeUpdate();
                if (row > 0){
                    return true;
                }
            }
        }finally{
            if (stm != null) stm.close();
            if (con != null) con.close();
        }
        return false;
    }
     public boolean insertProfile(int user_id, String username,String mail, String phoneNumber, String role) throws SQLException{
        Connection con = null;
        PreparedStatement stm = null;
        try{
            con = DBUtility.makeConnection();
            if(con != null){
                String sql = "Insert into dbo.ProfileUser (user_id,username,mail,phone_number,role) Values (?,?,?,?,?)";
                stm = con.prepareStatement(sql);
                stm.setInt(1, user_id);
                stm.setString(2, username);
                stm.setString(3, mail);
                stm.setString(4, phoneNumber);
                stm.setString(5, role);
                int row = stm.executeUpdate();
                if (row > 0){
                    return true;
                }
            }
        }finally{
            if (stm != null) stm.close();
            if (con != null) con.close();
        }
        return false;
    }
     public String getRole(String mail) throws SQLException{
        Connection con = null;
        PreparedStatement stm = null;
        String Role = "";
        try{
            con = DBUtility.makeConnection();
            if(con != null){
                String sql = "select role from dbo.ProfileUser where mail like ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, mail);
                ResultSet row = stm.executeQuery();
                if (row.next()){
                    Role = row.getString("role");
                    return Role;
                }
            }
        }finally{
            if (stm != null) stm.close();
            if (con != null) con.close();
        }
        return Role;
    }
}
