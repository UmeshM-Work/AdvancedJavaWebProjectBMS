<%@page import="com.cdac.dto.Cart"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.util.List"%>
     
     
     <%@page import="com.cdac.dto.User"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>

<body>


    <div class="container  border" style="margin-top: 10vh;margin-bottom: 10vh;box-shadow: 5px 5px 7px 2px rgb(86, 85, 85);">


        <div class="row border p-3 justify-content-center" style="background-color:rgb(126, 125, 125)">


            <div class="col-12">
                <h1>Order reciept</h1>
            </div>

        </div>

        <div class="row border p-3">


            <div class="col-10">
                <h3>Order Details
                </h3>
            </div>

        </div>
        <div class="row border p-3 justify-content-between">


            <div class="col-6 border">
                <div class="row border  p-2 mr-2 ml-2 mt-2 mb-2">

                    <div class="col-5"><b>Order no</b> </div>
                    <div class="col-7">
                        <b>T0S972J</b>
                    </div>
                </div>
                <div class="row border ml-2 mr-2 p-2 mb-2">

                    <div class="col-5"><b>Customer Name</b> </div>
                    <div class="col-7">
                        <b><%=session.getAttribute("user_name_1") %></b>
                    </div>
                </div>
                  <div class="row border ml-2 mr-2 p-2 mb-2">

                    <div class="col-5"><b>Mobile number</b> </div>
                    <div class="col-7">
                        <%=session.getAttribute("user_mobile_2") %>
                    </div>
                </div>
                <div class="row border ml-2 mr-2 p-2 mb-2">

                    <div class="col-5"><b>Supplier</b> </div>
                    <div class="col-7">
                        <b>BMS Inc</b>
                    </div>
                </div>
                <div class="row border ml-2 mr-2 p-2 mb-2">

                    <div class="col-3">
                        <b>Address Supplier</b></div>
                    <div class="col-8">
                        <i>Champ de Mars, 5 Avenue Anatole France, 75007 Paris, France</i>
                    </div>
                </div>


            </div>
            <div class="col-5 ">

                <div class="row border ml-2 mr-2 p-2 mb-2 ">

                    <div class="col-4"><b>Delivery date</b> </div>
                    <div class="col-8">10th November 2020</div>

                </div>
                <div class="row border ml-2 mr-2 p-2 mb-2">
                    <div class="col-4"><b>Status</b></div>
                    <div class="col-8"><button class="btn btn-success btn-sm  btn-outline-light">Approved</button></div>
                </div>


            </div>

        </div>

        <div class="row justify-content-center  mt-3">

            <div class="col-12  ">
                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th scope="col">Author Name</th>
                            <th scope="col">Book Name</th>
                            <th scope="col">Unit</th>
                            <th scope="col">Price</th>


                        </tr>
                    </thead>
                    <tbody>
                    
                    <% float totalPrice=0.0f; %>
 <%  List<Cart> elist = (List<Cart>)request.getAttribute("cartList");
		for(Cart exp : elist){
		%> 
                        <tr>
                            <th scope="row"><%=exp.getCbookAuthor() %></th>
                            <td><%=exp.getCbookName() %></td>
                            <td>Single</td>
                            <td><%=exp.getCbookPrice()%></td>

                        </tr>
                        
                         <% totalPrice=totalPrice+exp.getCbookPrice() ;
    	session.setAttribute("total_price", totalPrice);
    
    %>
    
 <% } %>

                    </tbody>
                </table>
            </div>



        </div>

        <div class="row justify-content-center  mt-2">

            <div class="col-12">
                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th scope="col">Total price</th>
                            <th scope="col">Rs.<%=totalPrice %></th>



                        </tr>
                    </thead>

                </table>
            </div>



        </div>
        <div class="row justify-content-center mb-2 mt-2">

            <div class="col-8" style="font-size:12px">
                The amount invoiced shall be paid in accordance with the payment terms recorded in the invoice.The invoice date shall be decisive for the entitlement to a cash discount, insofar as such an option has been agreed upon.In the event of default in payment,
                default interest at the rate of 5% shall be possible.
            </div>



        </div>


    </div>

    <div class="container mb-5">

        <div class="row justify-content-end">

 <button class="btn-sm btn btn-success btn-outline-warning  "><a href="order_add.htm">Done</a></button>
    
        </div>


    </div>

</body>

</html>