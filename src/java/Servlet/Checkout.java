/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAO.DAO;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    String url = "";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {

            DAO sql = new DAO();
            HttpSession session = request.getSession();
            Random rng = new Random();

            // Get the current date
            LocalDate currentDate = LocalDate.now();

            // Create a formatter for yyyy-MM-dd format
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            // Format the current date using the formatter
            String formattedDate = currentDate.format(formatter);

            int order_id = rng.nextInt(99999) + 100000;
            int order_item_id = rng.nextInt(99999) + 100000;
            String total_price = request.getParameter("subtotal").substring(0, request.getParameter("subtotal").length() - 8);
            String[] products = request.getParameterValues("title");
            String[] quantities = request.getParameterValues("quantity");
            String username = request.getParameter("txtUsername");
            String mail = request.getParameter("txtMail");
            String phone_number = request.getParameter("txtPhoneNumber");
            String address = request.getParameter("txtAddress");
            
            String productList = quantities [0] + " " + products[0];
            for (int i = 1; i < products.length; i++) {
                productList = productList + " | " + quantities[i] + " " + products[i];
                sql.updateQuantity(Integer.parseInt(quantities[i]),products[i]);
            }
            if (username == "" || mail == "" || phone_number == "" || address == "") {
                session.setAttribute("LackOfInformation", "true");
                url = "checkout.jsp";
            } else {
                if (sql.getID(mail) > 0) {
                    sql.insertOrderToDB(order_id, sql.getID(mail), formattedDate, Integer.parseInt(total_price), "WAITING");
                    sql.insertOrderDetail(order_item_id, order_id, productList, Integer.parseInt(total_price), phone_number, address, username);
                    url = "ProductPage.jsp";
                } else {
                    sql.insertOrderToDB(order_id, 0, formattedDate, Integer.parseInt(total_price), "WAITING");
                    sql.insertOrderDetail(order_item_id, order_id, productList, Integer.parseInt(total_price), phone_number, address, username);
                    url = "ProductPage.jsp";
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NamingException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
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
        processRequest(request, response);
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
        processRequest(request, response);
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
