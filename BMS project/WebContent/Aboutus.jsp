<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
     <%@page import="com.cdac.dto.User"%>
<%@ include file="cache_control.jsp" %>
<%	
	User user = (User)session.getAttribute("user");
	if(user !=null && user.getUserId()>0)
	{

%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>

<body style="background-color: rgb(197, 197, 197);">
    <div class="container-fluid ">
    
    
    <div class="row sticky-top " style="box-shadow: 2px 5px 10px 2px black;opacity: 0.8;backdrop-filter: blur(3px);">

            <div class="col-6 d-flex  " style="letter-spacing: 2px; font-family: ROG fonts;">
                <h2 style="opacity: 1;">

                    <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-book" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                    <path fill-rule="evenodd" d="M1 2.828v9.923c.918-.35 2.107-.692 3.287-.81 1.094-.111 2.278-.039 3.213.492V2.687c-.654-.689-1.782-.886-3.112-.752-1.234.124-2.503.523-3.388.893zm7.5-.141v9.746c.935-.53 2.12-.603 3.213-.493 1.18.12 2.37.461 3.287.811V2.828c-.885-.37-2.154-.769-3.388-.893-1.33-.134-2.458.063-3.112.752zM8 1.783C7.015.936 5.587.81 4.287.94c-1.514.153-3.042.672-3.994 1.105A.5.5 0 0 0 0 2.5v11a.5.5 0 0 0 .707.455c.882-.4 2.303-.881 3.68-1.02 1.409-.142 2.59.087 3.223.877a.5.5 0 0 0 .78 0c.633-.79 1.814-1.019 3.222-.877 1.378.139 2.8.62 3.681 1.02A.5.5 0 0 0 16 13.5v-11a.5.5 0 0 0-.293-.455c-.952-.433-2.48-.952-3.994-1.105C10.413.809 8.985.936 8 1.783z"/>
                  </svg>
                    <tr><a href="home.htm">BMS</a></tr>

                </h2>
            </div>


            <div class="col-1  d-flex  justify-content-end " style="letter-spacing: 2px; font-family: ROG fonts;">
                <h2 style="opacity: 1;">


                    <button class="btn btn-small btn-outline-danger"><a href="aboutus.htm">About</a></button>




                </h2>
            </div>
            <div class="col-2 d-flex  justify-content-end" style="letter-spacing: 2px; font-family: ROG fonts;">
                <h2 style="opacity: 1;">


                    <button class="btn btn-small btn-outline-danger"><a href="show_order.htm">Myorders</a></button>




                </h2>
            </div>
             <div class="col-2 d-flex  justify-content-end" style="letter-spacing: 2px; font-family: ROG fonts;">
                <h2 style="opacity: 1;">


                    <button class="btn btn-small btn-outline-danger"><a href="logout.jsp">Logout</a></button>




                </h2>
            </div>
            
             <div class="col-1 d-flex  justify-content-end" style="letter-spacing: 2px; font-family: ROG fonts;">
                <h2 style="opacity: 1;">


                  <a href="show_cart.htm"><svg width="2em" height="1em" viewBox="0 0 16 16" class="bi bi-cart-check-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                    <path fill-rule="evenodd" d="M.5 1a.5.5 0 0 0 0 1h1.11l.401 1.607 1.498 7.985A.5.5 0 0 0 4 12h1a2 2 0 1 0 0 4 2 2 0 0 0 0-4h7a2 2 0 1 0 0 4 2 2 0 0 0 0-4h1a.5.5 0 0 0 .491-.408l1.5-8A.5.5 0 0 0 14.5 3H2.89l-.405-1.621A.5.5 0 0 0 2 1H.5zM4 14a1 1 0 1 1 2 0 1 1 0 0 1-2 0zm7 0a1 1 0 1 1 2 0 1 1 0 0 1-2 0zm.354-7.646a.5.5 0 0 0-.708-.708L8 8.293 6.854 7.146a.5.5 0 1 0-.708.708l1.5 1.5a.5.5 0 0 0 .708 0l3-3z"/>
                  </svg></a>




                </h2>
            </div>
	



        </div>




        <div class="container ">

            <div class="row  justify-content-center  align-items-center mb-5 " style="height: 50vh;font-size: 90px;">
                <div class=" d-flex justify-content-center align-items-center" style="font-family: ROG FONTS;text-shadow: -5px 0px 6px black;">About us</div>
            </div>
            <div class="row" style="font-size: 30px;font-family: ROG FONTS;border-bottom: solid 2px rgb(111, 111, 111);">Our project</div>
            <div class="row mb-5    ">Shop books online on Indian book stores -  compare book prices fast  Get best offers  BMS provides you with all that.
            </div>


            <div class="row mb-5 " style="font-size: 30px;font-family: ROG FONTS;border-bottom: solid 2px rgb(93, 93, 93); box-shadow: 0px 0px 10px 0px black;"> Our team</div>

            <div class="row justify-content-around mt-3 ">





                <div class=" col-12 col-md-3 border " style="box-shadow: 0px 0px 10px 5px grey; ">
                    <div class="row justify-content-center ">
                        <div class="col-11 ">

                            <div class="row mt-2 " style="height: 45vh ;border-radius:50%;background-image: url(music2.jpg);border:double black"> </div>

                            <div class="row justify-content-center mt-2 ">
                                <h style="font-family:ROG FONTS ">Umesh Manjare</h4>
                            </div>
                            <div class="row justify-content-center ">CDAC </div>





                        </div>
                    </div>
                </div>

                <div class=" col-12 col-md-3 border " style="box-shadow: 0px 0px 5px 5px grey;">
                    <div class="row justify-content-center ">
                        <div class="col-11 ">

                            <div class="row mt-2 " style="height: 45vh ;padding:0px;border-radius:50%;background-image: url(music2.jpg);border:double black"> </div>

                            <div class="row justify-content-center mt-2 ">
                                <h style="font-family:ROG FONTS ">Akash Chaudhari</h4>
                            </div>
                            <div class="row justify-content-center ">CDAC </div>





                        </div>
                    </div>
                </div>




            </div>




        </div>
        <footer class="bg-dark pb-3 mt-5 ">
            <div class="container text-center ">
                <p class="font-italic text-muted mb-0 ">&copy; Copyrights BMS.com All rights reserved.</p>
            </div>
        </footer>
</body>

</html>

<% 
	}
	else
	{
		response.sendRedirect("index.jsp");
	}
%>