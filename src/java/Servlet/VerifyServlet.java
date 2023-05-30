package Servlet;


import SQLCommand.SQLCommand;
import java.io.*;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;

public class VerifyServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("txtUsername");
        String password = (String) session.getAttribute("txtPassword");
        String email = (String) session.getAttribute("txtMail");
        String phoneNumber = (String) session.getAttribute("txtPhone");
        String address = (String) session.getAttribute("txtAddress");
        String code = request.getParameter("code");

        Random rand = new Random();
        int user_id = rand.nextInt(900000) + 100000;

        String expectedCode = (String) session.getAttribute("txtVerifyCode");

        if (code.equals(expectedCode)) {
            // Verification successful, create user account
            SQLCommand sql = new SQLCommand();
            try {
                boolean result = sql.insertAccount(user_id, username, password, address, phoneNumber, email); // TODO: Add code to insert user details into database
                sql.insertProfile(user_id, username, phoneNumber, email, "CUSTOMER");
                if (result){
                response.sendRedirect("birds.html");
                }
            } catch (SQLException ex) {
                Logger.getLogger(VerifyServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
		
        } else {
            // Verification failed, redirect back to verification page with error message

            request.setAttribute("errorMessage", "Invalid verification code. Please try again.");
            request.setAttribute("txtUsername", username);
            request.setAttribute("txtMail", email);
            RequestDispatcher rd = request.getRequestDispatcher("verify.jsp");
            rd.forward(request, response);
        }
    }
}
