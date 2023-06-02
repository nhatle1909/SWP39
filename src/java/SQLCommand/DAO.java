/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQLCommand;

import Utility.DBUtility;
import Utility.DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;

/**
 *
 * @author ADMIN
 */
public class DAO {

    public List<DTO> getListAccount() {
        return listAccount;
    }


    private List<DTO> listAccount;
    
    
    
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
     public boolean insertAccount(int user_id, String username,String password, String mail) throws SQLException{
        Connection con = null;
        PreparedStatement stm = null;
        try{
            con = DBUtility.makeConnection();
            if(con != null){
                String sql = "Insert into dbo.Account_User (user_id,username,password,mail) Values (?,?,?,?)";
                stm = con.prepareStatement(sql);
                stm.setInt(1, user_id);
                stm.setString(2, username);
                stm.setString(3, password);
                stm.setString(4, mail);
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
     public boolean insertProfile(int user_id, String username,String mail,String address, String phoneNumber, String role) throws SQLException{
        Connection con = null;
        PreparedStatement stm = null;
        try{
            con = DBUtility.makeConnection();
            if(con != null){
                String sql = "Insert into dbo.ProfileUser (user_id,username,mail,address,phone_number,role) Values (?,?,?,?,?,?)";
                stm = con.prepareStatement(sql);
                stm.setInt(1, user_id);
                stm.setString(2, username);
                stm.setString(3, mail);
                stm.setString(4, address);
                stm.setString(5, phoneNumber);
                stm.setString(6, role);
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
     public boolean updatePassword(String mail, String password) throws SQLException{
        Connection con = null;
        PreparedStatement stm = null;
        try{
            con = DBUtility.makeConnection();
            if(con != null){
                String sql = "Update dbo.Account_User set password = ? where mail = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, password);
                stm.setString(2, mail);
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
     public void searchUser(String mail) throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtility.makeConnection();
            if (con != null) {
                String sql = "Select * from dbo.ProfileUser where mail like ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, mail);
                rs = stm.executeQuery();
                while (rs.next()) {
                    int user_id = rs.getInt("user_id");
                    String username = rs.getString("username");
                    mail = rs.getString("mail");
                    String address = rs.getString("address");
                    String phone_number = rs.getString("phone_number");
                    String role = rs.getString("role");

                    DTO dto = new DTO(user_id, username, mail, address, phone_number, role);
                    if (this.listAccount == null) {
                        this.listAccount = new ArrayList<DTO>();
                    }
                    this.listAccount.add(dto);
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
    }
     public boolean uniqueID(int user_id) throws SQLException{
         Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtility.makeConnection();
            if (con != null) {
                String sql = "Select user_id from dbo.Account_User where user_id = ?";
                stm = con.prepareStatement(sql);
                stm.setInt(1, user_id);
                rs = stm.executeQuery();
                while (rs.next()) {
                   return false;
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
        return true;
     }
     public boolean uniqueMail(String mail) throws SQLException{
         Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtility.makeConnection();
            if (con != null) {
                String sql = "Select mail from dbo.Account_User where mail = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, mail);
                rs = stm.executeQuery();
                while (rs.next()) {
                   return false;
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
        return true;
     }
}
