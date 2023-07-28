<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="UTF-8">
        <title>Review</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/review.css">
        <style type="text/css">
            table {
                border: 0;
            }

            table td {
                padding: 9px;
            }
        </style>
    </head>

    <body>
        <%String check = (String) session.getAttribute("Status1");
        if (check != null && check.equals("TRUE")) {%>
        <div class="container" align="center">
            <h1>Please Review Before Paying</h1>
            <form action="execute_payment" method="post">
                <table class="border-box">
                    <tr>
                        <td colspan="2"><b>Transaction Details:</b></td>
                        <td>
                            <input type="hidden" name="paymentId" value="${param.paymentId}" />
                            <input type="hidden" name="PayerID" value="${param.PayerID}" />
                        </td>
                    </tr>
                    <tr>
                        <td>Description:</td>
                        <td>${transaction.description}</td>
                    </tr>
                    <tr>
                        <td>Subtotal:</td>
                        <td>$${transaction.amount.details.subtotal} </td>
                    </tr>
                    <tr>
                        <td>Shipping:</td>
                        <td>$${transaction.amount.details.shipping} </td>
                    </tr>
                    <tr>
                        <td>Tax:</td>
                        <td>$${transaction.amount.details.tax} </td>
                    </tr>
                    <tr>
                        <td>Total:</td>
                        <td>$${transaction.amount.total}</td>
                    </tr>
                    <tr>
                        <td><br /></td>
                    </tr>
                    <tr>
                        <td colspan="2"><b>Payer Information:</b></td>
                    </tr>
                    <tr>
                        <td>Full Name:</td>
                        <td><%=(String) session.getAttribute("USERNAME")%></td>
                    </tr>

                    <tr>
                        <td>Email:</td>
                        <td><%=(String) session.getAttribute("MAIL")%></td>
                    </tr>
                    <tr>
                        <td>Phone_Number:</td>
                        <td><%=(String) session.getAttribute("PHONE_NUMBER")%></td>
                    </tr>
                    <tr>
                        <td><br /></td>
                    </tr>
                    <tr>
                        <td colspan="2"><b>Shipping Address:</b></td>
                    </tr>
                    <tr>
                        <td>Address:</td>
                        <td><%=(String) session.getAttribute("ADDRESS")%></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center">
                            <input type="submit" value="Pay Now" class="pay-button" />
                        </td>
                    </tr>
                </table>
            </form>
        </div>
        <%} else {
        response.sendRedirect("ProductPage.jsp");
            }%>
    </body>

</html>