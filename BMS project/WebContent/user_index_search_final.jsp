<%@page import="com.cdac.dto.User"%>
<%@ include file="cache_control.jsp" %>
<%	
	User user = (User)session.getAttribute("user");
	if(user !=null && user.getUserId()>0)
	{

%>





<%@page import="com.cdac.dto.Book"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>   
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>

<body style="background-color: rgb(209, 209, 209);">

    <div class="container-fluid">

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




        <div class="row " style="background-image:url(assets/images/dj3.jpg);height: 30vh;background-size:cover;background-repeat: no-repeat;box-shadow: 0px 0px 30px ;border-radius: 0px 0px 50px 50px ; ">

            <div class=" col-3 "></div>
            <div class="col-6 d-flex justify-content-center align-items-center">


                <div class="row flex-column ">
                    <div class=" d-flex justify-content-center "><i class='fas fa-cloud-download-alt' style='font-size:50px;color:rgb(83, 25, 25)(114, 33, 33)'></i></div>
                    <div class="text-muted justify-content-center">
                        <h2 style="font-family: ROG FONTS;font-style: italic; "></h2>
                    </div>
                    <div class="d-flex justify-content-center mt-3 text-white">
                        <h3 style="font-family: ROG FONTS;font-style: italic;font-size: 50px;text-shadow: 5px -2px black;letter-spacing: 3px; ">Shop now</h3>
                    </div>
                    <div class="d-flex justify-content-center  text-muted" style="font-family:Impact, Haettenschweiler, 'Arial Narrow Bold', sans-serif ;letter-spacing: 1px ">Limited Books</div>


                </div>



            </div>

            <div class=" col-3 "></div>

        </div>



      <spr:form action="user_list_search_1.htm" method="get" commandName="book" >

        <div class="row mt-4 mb-4 justify-content-center">


            <div class="col-4 " style="border: 4px double;box-shadow: 7px 7px 0px 3px grey;">
                <div class="row justify-content-center mt-2 mx-2"><button class="btn btn-block btn-dark">Browse Books</button></div>
                <div class="row justify-content-between mt-2 mx-2"><span style="text-decoration: underline;">Author Name</span> <span><spr:input placeholder="Enter Author Name" path="bookAuthor"/></span></div>
                
                <div class="row justify-content-end mt-3 mx-2 mb-2"><button type="submit" value="Search" class="btn btn-block btn-danger">Search</button></div>
            </div>

        </div>
        </spr:form>

        <table class="table table-hover">
            <thead class="bg-dark text-light">
                <tr>
                    
                    <th scope="col">BookID</th>	
                     <th scope="col">Book Author</th>	
                    <th scope="col">Book Name</th>
                   
                    <th scope="col">Price(Rs)</th>
                  
                    <th scope="col">Buy</th>
                     <th scope="col"></th>

                </tr>
            </thead>
            <tbody>
            <% 
		
             List<Book> elist = (List<Book>)request.getAttribute("bookList");
		for(Book exp : elist){
		%> 
                <tr>
                   
                    <td><%=exp.getBookId()%></td>
                     <td><%=exp.getBookAuthor()%></td>
                    <td><%=exp.getBookName()%></td>
                    <td><%=exp.getBookPrice()%></td>
                   
                    
                  
                 
                    <td><button class="btn-warning btn btn-sm "><a href="book_add_cart.htm?CbookAuthor=<%=	exp.getBookAuthor()%>&CbookName=<%=exp.getBookName()%>&CbookPrice=<%=exp.getBookPrice()%>">Buy</a></button></td>

                </tr>
                
                 <% } %>
                
              
               

            </tbody>
        </table>


        <div class="mt-5 ">
            <div class="row text-light align-items-center " style="background-color: rgb(0, 0, 0); height: 40px;opacity: 0.8;box-shadow: 0px 0px 50px 8px black; "><a href="user_list.htm">Browse all books</a></div>
        </div>









    </div>

</body>

</html>
<% 
	}
	else
	{
		response.sendRedirect("index.jsp");
	}
%>