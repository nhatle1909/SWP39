<%-- 
    Document   : checkout
    Created on : Jun 18, 2023, 6:01:54 PM
    Author     : ADMIN
--%>

<%@page import="Utility.UserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- custom css file link  -->
        <link rel="stylesheet" href="css/check.css">



    </head>
    <body>
        <%         UserDTO userDTO = (UserDTO) session.getAttribute("User_info");
        %>

        <div class="container">

            <form action="MainController" method="POST">

                <div class="row">

                    <div class="col">
                        <%if (userDTO != null) {%>
                        <h3 class="title">billing address</h3>

                        <div class="inputBox">
                            <span>full name :</span>
                            <input type="text" name="txtUsername" placeholder="john deo" value="<%=userDTO.getUsername()%>">
                        </div>
                        <div class="inputBox">
                            <span>email :</span>
                            <input type="email" name="txtMail" placeholder="example@example.com" value="<%=userDTO.getMail()%>"> 
                        </div>
                        <div class="inputBox">
                            <span>address :</span>
                            <input type="text" name="txtAddress"placeholder="room - street - locality" value="<%=userDTO.getAddress()%>">
                        </div>
                        <div class="inputBox">
                            <span>Phone Number :</span>
                            <input type="text" name="txtPhoneNumber" value="<%=userDTO.getPhone_number()%>">
                        </div>
                        <%} else {%>
                        <h3 class="title">billing address</h3>

                        <div class="inputBox">
                            <span>full name :</span>
                            <input type="text" name="txtUsername" placeholder="john deo">
                        </div>
                        <div class="inputBox">
                            <span>email :</span>
                            <input type="email" name="txtMail"placeholder="example@example.com">
                        </div>
                        <div class="inputBox">
                            <span>address :</span>
                            <input type="text" name="txtAddress"placeholder="room - street - locality">
                        </div>
                        <div class="inputBox">
                            <span>Phone Number :</span>
                            <input type="text" name="txtPhoneNumber">
                        </div>
                        <%}%>

                    </div>

                    <div class="col">
                        <h3 class="title">Payment</h3>
                        <div class="inputBox">
                            <label for="pay-on-receive">
                                <input type="radio" id="pay-on-receive" name="payment-method" value="pay-on-receive">
                                Pay when receive
                            </label>
                        </div>
                        <div class="inputBox">
                            <label for="card-payment">
                                <input type="radio" id="card-payment" name="payment-method" value="card-payment">
                                Card payment
                            </label>
                        </div>
                        <div id="card-details">
                            <div class="inputBox">
                                <span>Cards accepted :</span>
                                <img src="images/card_img.png" alt="">
                            </div>
                            <div class="inputBox">
                                <span>Name on card :</span>
                                <input type="text" placeholder="Mr. John Deo">
                            </div>
                            <div class="inputBox">
                                <span>Credit card number :</span>
                                <input type="number" placeholder="1111-2222-3333-4444">
                            </div>
                            <div class="inputBox">
                                <span>Exp month :</span>
                                <input type="text" placeholder="January">
                            </div>
                            <div class="flex">
                                <div class="inputBox">
                                    <span>Exp year :</span>
                                    <input type="text" placeholder="2025">
                                </div>
                                <div class="inputBox">
                                    <span>CVV :</span>
                                    <input type="text" placeholder="123">
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col cart-col">

                        <!-- cart details container -->
                        <div id="products" class="cart-details">
                            <h3 class="title">cart details</h3>
                            <ul id="productList"></ul>
                            <label for="subtotal">Subtotal:</label>
                            <input type="readonly" id="subtotal" name="subtotal">

                        </div>

                    </div>

                </div>

                        <input type="submit" name="btAction" value="proceed to checkout" class="submit-btn"> 
                        <br/>
                        <br/>
                <a href="ProductPage.jsp" class="submit-btn">Return</a>
            </form>

        </div>    
        <script>
            var products = JSON.parse(localStorage.getItem("products"));
            var productsDiv = document.getElementById("products");

            for (var i = 0; i < products.length; i++) {
                var product = products[i];

                var productDiv = document.createElement("div");
                var title = document.createElement("input");
                var img = document.createElement("img");
                var price = document.createElement("input");

                title.type = "readonly";
                title.name = "title";
                title.value = product.title;

                img.src = product.imgSrc;

                price.type = "readonly";
                price.name = "price";
                price.value = String(product.price);

                productDiv.appendChild(title);
                productDiv.appendChild(img);
                productDiv.appendChild(price);

                productsDiv.appendChild(productDiv);
            }
            var subtotal = localStorage.getItem("cartTotal");
            document.getElementById('subtotal').value = subtotal + ".000 VND";

        </script>
        <script>
            <%String check = (String) session.getAttribute("LackOfInformation");
                 if (check != null && check.equals("true")) {%>
            alert("The Information is not filled up ");
            <%}
                session.removeAttribute("LackOfInformation");%>
        </script>
        <script>
            const payOnReceiveRadio = document.getElementById("pay-on-receive");
const cardPaymentRadio = document.getElementById("card-payment");
const cardDetailsDiv = document.getElementById("card-details");

// Hide card payment details initially
cardDetailsDiv.style.display = "none";

// Add event listener for payment radio buttons
payOnReceiveRadio.addEventListener("change", () => {
  if (payOnReceiveRadio.checked) {
    cardDetailsDiv.style.display = "none";
  }
});

cardPaymentRadio.addEventListener("change", () => {
  if (cardPaymentRadio.checked) {
    cardDetailsDiv.style.display = "block";
  } else {
    cardDetailsDiv.style.display = "none";
  }
});
        </script>
    </body>
</html>