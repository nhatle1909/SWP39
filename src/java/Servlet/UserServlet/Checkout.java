/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet.UserServlet;

import DAO.DAO;
import Utility.EmailUtility;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ADMIN
 */
public class Checkout extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String url = "ProductPage.jsp";
    private String host = "smtp.gmail.com";
    private String port = "587";
    private String user = "bmossystem@gmail.com";
    private String pass = "yhtegccgzzmptrzq";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, MessagingException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            boolean valid = true;
            DAO sql = new DAO();
            HttpSession session = request.getSession();
            Random rng = new Random();

            // Get the current date
            LocalDate currentDate = LocalDate.now();

            // Create a formatter for yyyy-MM-dd format
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            // Format the current date using the formatter
            String formattedDate = currentDate.format(formatter);

            int order_id = rng.nextInt(900000) + 100000;
            int order_item_id = rng.nextInt(99999) + 100000;
            String total_price = request.getParameter("total").substring(1, request.getParameter("total").length());
            String[] products = request.getParameterValues("title");
            String[] quantities = request.getParameterValues("quantity");
            String username = request.getParameter("txtUsername");
            String mail = request.getParameter("txtMail");
            String phone_number = request.getParameter("txtPhoneNumber");
            String address = request.getParameter("txtAddress");
            String subtotal = request.getParameter("subtotal");
            String tax = request.getParameter("tax");
            String productList = quantities[0] + " " + products[0];

            for (int i = 0; i < products.length; i++) {
                if (sql.getProductQuantity(products[i]) < Integer.parseInt(quantities[i])) {
                    session.setAttribute("InvalidQuantity", "TRUE");
                    valid = false;
                }
            }
            if (valid) {
                sql.updateQuantity(Integer.parseInt(quantities[0]), products[0]);
                for (int i = 1; i < products.length; i++) {
                    productList = productList + " | " + quantities[i] + " " + products[i];
                    sql.updateQuantity(Integer.parseInt(quantities[i]), products[i]);
                }
                if (username == "" || mail == "" || phone_number == "" || address == "") {
                    session.setAttribute("LackOfInformation", "true");
                } else {
                    if (sql.getID(mail) > 0) {
                        sql.insertOrderToDB(order_id, sql.getID(mail), formattedDate, Float.parseFloat(total_price), "WAITING");
                        sql.insertOrderDetail(order_item_id, order_id, productList, Float.parseFloat(total_price), phone_number, address, username);
                    } else {
                        sql.insertOrderToDB(order_id, 0, formattedDate, Float.parseFloat(total_price), "WAITING");
                        sql.insertOrderDetail(order_item_id, order_id, productList, Float.parseFloat(total_price), phone_number, address, username);

                    }
                    String subject = "BIFO - Order Confirmation";
                    String content = "Dear " + username + "\n"
                            + "\n"
                            + "Thank you for your recent order with our shop. We are excited to confirm that your order has been received and is currently being processed. Below are the details of your order:\n"
                            + "\n"
                            + "Order Number:" + Integer.toString(order_id) + "\n"
                            + "Order Date: " + formattedDate + "\n"
                            + "Shipping Address: "+address + "\n"
                            + "\n"
                            + "Items Ordered:" + productList + "\n"
                            + "Subtotal: " + subtotal + "\n"
                            + "Tax: " + tax + "\n"
                            + "Total Amount: $" + total_price + "\n"
                            + "\n"
                            + "Payment Method: Pay with Cash\n"
                            + "\n"
                            + "If you have any questions or concerns regarding your order, please feel free to contact us at bmossystem@gmail.com \n"
                            + "\n"
                            + "Please note that this email serves as a confirmation of your order and does not indicate that your order has been shipped. You will receive a separate email with tracking information once your order has been dispatched.\n"
                            + "\n"
                            + "Thank you for choosing our Shop. We appreciate your business!\n"
                            + "\n"
                            + "Best regards,";
                    EmailUtility.sendEmail(host, port, user, pass, mail, subject,
                            content);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NamingException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            url = "ProductPage.jsp";
            response.sendRedirect(url);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (MessagingException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (MessagingException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
