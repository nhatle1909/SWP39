/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQLCommand;

import Utility.BirdDTO;
import Utility.DBUtility;
import Utility.FavoriteDTO;
import Utility.FeedbackDTO;
import Utility.OrderDTO;
import Utility.ProductListDTO;
import Utility.UserDTO;
import java.sql.Connection;
import java.sql.Date;
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

    private List<BirdDTO> listBird;
    private List<FavoriteDTO> listFavorite;
    private List<UserDTO> listAccount;
    private List<ProductListDTO> listProduct;
    private List<OrderDTO> listOrder;
    private List<FeedbackDTO> listFeedback;

    public List<UserDTO> getListAccount() {
        return listAccount;
    }

    public List<OrderDTO> getListOrder() {
        return listOrder;
    }

    public List<FavoriteDTO> getListFavorite() {
        return listFavorite;
    }

    public List<ProductListDTO> getListProduct() {
        return listProduct;
    }

    public List<BirdDTO> getListBird() {
        return listBird;
    }

    public List<FeedbackDTO> getListFeedback() {
        return listFeedback;
    }

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

    public boolean insertAccount(int user_id, String username, String password, String mail) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtility.makeConnection();
            if (con != null) {
                String sql = "Insert into dbo.Account_User (user_id,username,password,mail) Values (?,?,?,?)";
                stm = con.prepareStatement(sql);
                stm.setInt(1, user_id);
                stm.setString(2, username);
                stm.setString(3, password);
                stm.setString(4, mail);
                int row = stm.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }

    public boolean insertProfile(int user_id, String username, String mail, String address, String phoneNumber, String role) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtility.makeConnection();
            if (con != null) {
                String sql = "Insert into dbo.ProfileUser (user_id,username,mail,address,phone_number,role) Values (?,?,?,?,?,?)";
                stm = con.prepareStatement(sql);
                stm.setInt(1, user_id);
                stm.setString(2, username);
                stm.setString(3, mail);
                stm.setString(4, address);
                stm.setString(5, phoneNumber);
                stm.setString(6, role);
                int row = stm.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }

    public String getRole(String mail) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        String Role = "";
        try {
            con = DBUtility.makeConnection();
            if (con != null) {
                String sql = "select role from dbo.ProfileUser where mail like ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, mail);
                ResultSet row = stm.executeQuery();
                if (row.next()) {
                    Role = row.getString("role");
                    return Role;
                }
            }
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return Role;
    }

    public boolean updatePassword(String mail, String password) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtility.makeConnection();
            if (con != null) {
                String sql = "Update dbo.Account_User set password = ? where mail = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, password);
                stm.setString(2, mail);
                int row = stm.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
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

                    UserDTO dto = new UserDTO(user_id, username, mail, address, phone_number, role);
                    if (this.listAccount == null) {
                        this.listAccount = new ArrayList<UserDTO>();
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

    public boolean uniqueID(int user_id) throws SQLException {
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

    public boolean uniqueMail(String mail) throws SQLException {
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

    public void orderHistory(int user_id) throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtility.makeConnection();
            if (con != null) {
                String sql = "Select top 10 * from dbo.OrderList where user_id = ?";
                stm = con.prepareStatement(sql);
                stm.setInt(1, user_id);
                rs = stm.executeQuery();
                while (rs.next()) {
                    int order_id = rs.getInt("order_id");
                    user_id = rs.getInt("user_id");
                    Date date = rs.getDate("order_date");
                    int totalPrice = rs.getInt("total_price");
                    String status = rs.getString("status");

                    OrderDTO orderDTO = new OrderDTO(order_id, user_id, date, totalPrice, status);
                    if (this.listOrder == null) {
                        this.listOrder = new ArrayList<OrderDTO>();
                    }
                    this.listOrder.add(orderDTO);
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

    public boolean updateInformation(String mail, String phone_number, String address) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtility.makeConnection();
            if (con != null) {
                String sql = "Update dbo.ProfileUser set phone_number = ?,address = ? where mail = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, phone_number);
                stm.setString(2, address);
                stm.setString(3, mail);
                int row = stm.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }

    public void searchFavoriteProduct(int user_id) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtility.makeConnection();
            if (con != null) {
                String sql = "SELECT Product_list.product_id, product_name,price\n"
                        + "FROM Product_list\n"
                        + "JOIN favorite\n"
                        + "ON Product_list.product_id = dbo.Favorite.product_id\n"
                        + "WHERE dbo.Favorite.user_id = ?";
                stm = con.prepareStatement(sql);
                stm.setInt(1, user_id);
                rs = stm.executeQuery();
                while (rs.next()) {
                    int product_id = rs.getInt("product_id");
                    String product_name = rs.getString("product_name");
                    int price = rs.getInt("price");

                    FavoriteDTO favoriteDTO = new FavoriteDTO(product_id, product_name, price);
                    if (this.listFavorite == null) {
                        this.listFavorite = new ArrayList<FavoriteDTO>();
                    }
                    this.listFavorite.add(favoriteDTO);
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

    public boolean removeFavoriteProduct(int user_id, int product_id) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtility.makeConnection();
            if (con != null) {
                String sql = "Delete from dbo.Favorite where user_id = ? and product_id = ?";
                stm = con.prepareStatement(sql);
                stm.setInt(1, user_id);
                stm.setInt(2, product_id);
                int row = stm.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }

    public void searchProduct(String product_name) throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtility.makeConnection();
            if (con != null) {
                String sql = "select * from dbo.Product_List where product_name like ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, "%" + product_name + "%");
                rs = stm.executeQuery();
                while (rs.next()) {
                    int product_id = rs.getInt("product_id");
                    product_name = rs.getString("product_name");
                    int price = rs.getInt("price");
                    int quantity = rs.getInt("quantity");
                    String desc = rs.getString("description");
                    String image_url = rs.getString("Images");
                    String birds = rs.getString("birds");
                    ProductListDTO productListDTO = new ProductListDTO(product_id, product_name, price, quantity, desc, image_url, birds);
                    if (this.listProduct == null) {
                        this.listProduct = new ArrayList<ProductListDTO>();
                    }
                    this.listProduct.add(productListDTO);
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

    public void sortProductByPrice(String product_name) throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtility.makeConnection();
            if (con != null) {
                String sql = "select * from dbo.Product_List where product_name like ? order by price";
                stm = con.prepareStatement(sql);
                stm.setString(1, "%" + product_name + "%");
                rs = stm.executeQuery();
                while (rs.next()) {
                    int product_id = rs.getInt("product_id");
                    product_name = rs.getString("product_name");
                    int price = rs.getInt("price");
                    int quantity = rs.getInt("quantity");
                    String desc = rs.getString("description");
                    String image_url = rs.getString("Images");
                    String birds = rs.getString("birds");
                    ProductListDTO productListDTO = new ProductListDTO(product_id, product_name, price, quantity, desc, image_url, birds);
                    if (this.listProduct == null) {
                        this.listProduct = new ArrayList<ProductListDTO>();
                    }
                    this.listProduct.add(productListDTO);
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

    public void sortProductByQuantity(String product_name) throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtility.makeConnection();
            if (con != null) {
                String sql = "select * from dbo.Product_List where product_name like ? order by quantity";
                stm = con.prepareStatement(sql);
                stm.setString(1, "%" + product_name + "%");
                rs = stm.executeQuery();
                while (rs.next()) {
                    int product_id = rs.getInt("product_id");
                    product_name = rs.getString("product_name");
                    int price = rs.getInt("price");
                    int quantity = rs.getInt("quantity");
                    String desc = rs.getString("description");
                    String image_url = rs.getString("Images");
                    String birds = rs.getString("birds");
                    ProductListDTO productListDTO = new ProductListDTO(product_id, product_name, price, quantity, desc, image_url, birds);
                    if (this.listProduct == null) {
                        this.listProduct = new ArrayList<ProductListDTO>();
                    }
                    this.listProduct.add(productListDTO);
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

    public void sortProductByName(String product_name) throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtility.makeConnection();
            if (con != null) {
                String sql = "select * from dbo.Product_List where product_name like ? order by product_name";
                stm = con.prepareStatement(sql);
                stm.setString(1, "%" + product_name + "%");
                rs = stm.executeQuery();
                while (rs.next()) {
                    int product_id = rs.getInt("product_id");
                    product_name = rs.getString("product_name");
                    int price = rs.getInt("price");
                    int quantity = rs.getInt("quantity");
                    String desc = rs.getString("description");
                    String image_url = rs.getString("Images");
                    String birds = rs.getString("birds");
                    ProductListDTO productListDTO = new ProductListDTO(product_id, product_name, price, quantity, desc, image_url, birds);
                    if (this.listProduct == null) {
                        this.listProduct = new ArrayList<ProductListDTO>();
                    }
                    this.listProduct.add(productListDTO);
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

    public int getID(String mail) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        int id = 0;
        try {
            con = DBUtility.makeConnection();
            if (con != null) {
                String sql = "select user_id from dbo.ProfileUser where mail like ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, mail);
                ResultSet row = stm.executeQuery();
                if (row.next()) {
                    id = row.getInt("user_id");
                    return id;
                }
            }
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return id;
    }

    public boolean addToFavorite(int code, int user_id, int product_id) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtility.makeConnection();
            if (con != null) {
                String sql = "Insert into dbo.Favorite (id,user_id,product_id) Values (?,?,?)";
                stm = con.prepareStatement(sql);
                stm.setInt(1, code);
                stm.setInt(2, user_id);
                stm.setInt(3, product_id);
                int row = stm.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }

    public void searchBird(String bird_name) throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtility.makeConnection();
            if (con != null) {
                String sql = "select * from dbo.BIRD where bird_name like ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, "%" + bird_name + "%");
                rs = stm.executeQuery();
                while (rs.next()) {
                    int bird_id = rs.getInt("bird_id");
                    bird_name = rs.getString("bird_name");
                    String product_name = rs.getString("product_name");
                    int product_id = rs.getInt("product_id");
                    String species = rs.getString("species");
                    String image_url = rs.getString("Images");
                    String desc_order = rs.getString("description_order");
                    BirdDTO birdList = new BirdDTO(bird_id, bird_name, product_id, product_name, desc_order, species, image_url);
                    if (this.listBird == null) {
                        this.listBird = new ArrayList<BirdDTO>();
                    }
                    this.listBird.add(birdList);
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

    public void showFeedback(String product_id) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtility.makeConnection();
            if (con != null) {
                String sql = "SELECT account_user.username, feedback.date_feedback, feedback.comment\n"
                        + "FROM feedback\n"
                        + "INNER JOIN account_user ON feedback.user_id = account_user.user_id WHERE feedback.product_id = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, product_id);
                rs = stm.executeQuery();
                while (rs.next()) {
                    String username = rs.getString("username");
                    Date date_feedback = rs.getDate("date_feedback");
                    String comment = rs.getString("comment");

                    FeedbackDTO feedbackDTO = new FeedbackDTO(username, date_feedback, comment);
                    if (this.listFeedback == null) {
                        this.listFeedback = new ArrayList<FeedbackDTO>();
                    }
                    this.listFeedback.add(feedbackDTO);
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

    public void getProductDetail(String product_id) throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtility.makeConnection();
            if (con != null) {
                String sql = "select * from dbo.Product_List where product_id = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, product_id);
                rs = stm.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt("product_id");
                    String product_name = rs.getString("product_name");
                    int price = rs.getInt("price");
                    int quantity = rs.getInt("quantity");
                    String desc = rs.getString("description");
                    String image_url = rs.getString("Images");
                    String birds = rs.getString("birds");
                    ProductListDTO productListDTO = new ProductListDTO(id, product_name, price, quantity, desc, image_url, birds);
                    if (this.listProduct == null) {
                        this.listProduct = new ArrayList<ProductListDTO>();
                    }
                    this.listProduct.add(productListDTO);
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

    public void getBirdDetail(int bird_id) throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtility.makeConnection();
            if (con != null) {
                String sql = "select * from dbo.BIRD where bird_id = ?";
                stm = con.prepareStatement(sql);
                stm.setInt(1, bird_id);
                rs = stm.executeQuery();
                while (rs.next()) {
                    bird_id = rs.getInt("bird_id");
                    String bird_name = rs.getString("bird_name");
                    String product_name = rs.getString("product_name");
                    int product_id = rs.getInt("product_id");
                    String species = rs.getString("species");
                    String image_url = rs.getString("Images");
                    String desc_order = rs.getString("description_order");
                    BirdDTO birdList = new BirdDTO(bird_id, bird_name, product_id, product_name, desc_order, species, image_url);
                    if (this.listBird == null) {
                        this.listBird = new ArrayList<BirdDTO>();
                    }
                    this.listBird.add(birdList);
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

    public boolean insertOrderToDB(int order_id, int user_id, String order_date, int total_price, String status) throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtility.makeConnection();
            if (con != null) {
                String sql = "insert dbo.OrderList (order_id,user_id,order_date,total_price,status) values (?,?,?,?,?)";
                stm = con.prepareStatement(sql);
                stm.setInt(1, order_id);
                stm.setInt(2, user_id);
                stm.setString(3, order_date);
                stm.setInt(4, total_price);
                stm.setString(5, status);
                int row = stm.executeUpdate();
                if (row > 0) {
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

    public boolean insertOrderDetail(int order_item_id, int order_id, String product_list, int total_price, String phone_number, String address, String username) throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtility.makeConnection();
            if (con != null) {
                String sql = "insert dbo.OrderDetail (order_item_id,order_id,product_list,price,phone_number,address,username) values (?,?,?,?,?,?,?)";
                stm = con.prepareStatement(sql);
                stm.setInt(1, order_item_id);
                stm.setInt(2, order_id);
                stm.setString(3, product_list);
                stm.setInt(4, total_price);
                stm.setString(5, phone_number);
                stm.setString(6, address);
                stm.setString(7, username);
                int row = stm.executeUpdate();
                if (row > 0) {
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

    public boolean cancelOrder(int Order_id) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtility.makeConnection();
            if (con != null) {
                String sql = "DELETE FROM dbo.OrderDetail\n"
                        + "WHERE order_id = ?;\n"
                        + "\n"
                        + "DELETE FROM dbo.OrderList\n"
                        + "WHERE order_id = ?;";
                stm = con.prepareStatement(sql);
                stm.setInt(1, Order_id);
                stm.setInt(2, Order_id);
                int row = stm.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }
     public boolean addProduct(int product_id, String product_name, int price, int quantity, String desc, String birds,String image_url) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtility.makeConnection();
            if (con != null) {
                String sql = "Insert into dbo.Product_List (product_id,product_name,price,quantity,images,description,birds) Values (?,?,?,?,?,?,?)";
                stm = con.prepareStatement(sql);
                stm.setInt(1, product_id);
                stm.setString(2, product_name);
                stm.setInt(3, price);
                stm.setInt(4, quantity);
                stm.setString(5, image_url);
                stm.setString(6, desc);
                stm.setString(7, birds);
                int row = stm.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }

    public boolean deleteProduct(int product_id) throws SQLException {
         Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtility.makeConnection();
            if (con != null) {
                String sql = "Delete from dbo.Product_List where product_id = ?";
                stm = con.prepareStatement(sql);
                stm.setInt(1, product_id);
                int row = stm.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }
}
