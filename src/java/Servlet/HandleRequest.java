/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAO.DAO;
import Utility.EmailUtility;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ADMIN
 */
public class HandleRequest extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private String host = "smtp.gmail.com";
    private String port = "587";
    private String user = "bmossystem@gmail.com";
    private String pass = "yhtegccgzzmptrzq";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, MessagingException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        DAO sql = new DAO();

        String subject = "";
        String content = "";
        String button = (String) session.getAttribute("Button");
        session.removeAttribute("Button");
        int request_ID = Integer.parseInt(request.getParameter("RequestID"));
        String reply = request.getParameter("Reply");
        String mail = sql.getMailbyRequest(request_ID);
        if (button.equals("Reply")) {
            subject = "Reply Refund Request";
            content = "Refund ID : " + request_ID + "\n" + "Your refund request is accepted \n" + reply;
            sql.HandleRequest(request_ID);
            sql.DeleteRequest(request_ID);
            EmailUtility.sendEmail(host, port, user, pass, mail, subject,
                    content);

            response.sendRedirect("refundList.jsp");
        }
        if (button.equals("Ignore")) {
            subject = "Reply Refund Request";
            content = "Refund ID : " + request_ID + "\n" + "Your refund request is decline \n" + reply;
            sql.DeleteRequest(request_ID);
            EmailUtility.sendEmail(host, port, user, pass, mail, subject,
                    content);

            response.sendRedirect("refundList.jsp");
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
            Logger.getLogger(HandleRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HandleRequest.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(HandleRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HandleRequest.class.getName()).log(Level.SEVERE, null, ex);
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
