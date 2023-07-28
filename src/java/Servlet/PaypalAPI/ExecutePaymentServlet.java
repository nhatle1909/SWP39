package Servlet.PaypalAPI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import DAO.DAO;
import Utility.EmailUtility;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.paypal.api.payments.*;
import com.paypal.base.rest.PayPalRESTException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.naming.NamingException;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ADMIN
 */
public class ExecutePaymentServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public ExecutePaymentServlet() {
    }
    private String host = "smtp.gmail.com";
    private String port = "587";
    private String user = "bmossystem@gmail.com";
    private String pass = "yhtegccgzzmptrzq";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String paymentId = request.getParameter("paymentId");
        String payerId = request.getParameter("PayerID");
        DAO sql = new DAO();
        Random rng = new Random();
        HttpSession session = request.getSession();
        LocalDate currentDate = LocalDate.now();

        // Create a formatter for yyyy-MM-dd format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Format the current date using the formatter
        String formattedDate = currentDate.format(formatter);
        int order_id = rng.nextInt(900000) + 100000;
        int order_item_id = rng.nextInt(900000) + 100000;

        String username = (String) session.getAttribute("USERNAME");
        String mail = (String) session.getAttribute("MAIL");
        String phone_number = (String) session.getAttribute("PHONE_NUMBER");
        String address = (String) session.getAttribute("ADDRESS");
        int user_id = (int) session.getAttribute("USERID");
        String[] products = (String[]) session.getAttribute("PRODUCT");
        String[] quantities = (String[]) session.getAttribute("QUANTITY");
        session.removeAttribute("USERNAME");
        session.removeAttribute("MAIL");
        session.removeAttribute("USERID");
        session.removeAttribute("PHONE_NUMBER");
        session.removeAttribute("ADDRESS");
        session.removeAttribute("QUANTITY");
        session.removeAttribute("PRODUCT");
        session.removeAttribute("Status1");

        try {
            PaymentServices paymentServices = new PaymentServices();
            Payment payment = paymentServices.executePayment(paymentId, payerId);

            PayerInfo payerInfo = payment.getPayer().getPayerInfo();
            Transaction transaction = payment.getTransactions().get(0);

            request.setAttribute("payer", payerInfo);
            request.setAttribute("transaction", transaction);

            for (int i = 0; i < products.length; i++) {
                sql.updateQuantity(Integer.parseInt(quantities[i]), products[i]);
            }
            sql.insertOrderToDB(order_id, user_id, formattedDate, Float.parseFloat(transaction.getAmount().getTotal()), "WAITING");
            sql.insertOrderDetail(order_item_id, order_id, transaction.getDescription(), Float.parseFloat(transaction.getAmount().getTotal()), phone_number, address, username);
            String subject = "BIFO - Order Confirmation";
            String content = "Dear " + username + "\n"
                    + "\n"
                    + "Thank you for your recent order with our shop. We are excited to confirm that your order has been received and is currently being processed. Below are the details of your order:\n"
                    + "\n"
                    + "Order Number:" + Integer.toString(order_id) + "\n"
                    + "Order Date: " + formattedDate + "\n"
                    + "Shipping Address: "+address+"\n"
                    + "\n"
                    + "Items Ordered:" + transaction.getDescription() + "\n"
                    + "Subtotal: $" + Float.parseFloat(transaction.getAmount().getTotal()) / 1.02 + "\n"
                    + "Tax: $" + Float.parseFloat(transaction.getAmount().getTotal()) * 0.02 + "\n"
                    + "Total Amount: $" + Float.parseFloat(transaction.getAmount().getTotal()) + "\n"
                    + "\n"
                    + "Payment Method: Pay with Paypal\n"
                    + "\n"
                    + "If you have any questions or concerns regarding your order, please feel free to contact us at bmossystem@gmail.com\n"
                    + "\n"
                    + "Please note that this email serves as a confirmation of your order and does not indicate that your order has been shipped. You will receive a separate email with tracking information once your order has been dispatched.\n"
                    + "\n"
                    + "Thank you for choosing our Shop. We appreciate your business!\n"
                    + "\n"
                    + "Best regards,";
            EmailUtility.sendEmail(host, port, user, pass, mail, subject,
                    content);
            response.sendRedirect("ProductPage.jsp");

        } catch (PayPalRESTException ex) {
            request.setAttribute("errorMessage", ex.getMessage());
            ex.printStackTrace();
            request.getRequestDispatcher("error.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ExecutePaymentServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NamingException ex) {
            Logger.getLogger(ExecutePaymentServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(ExecutePaymentServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
