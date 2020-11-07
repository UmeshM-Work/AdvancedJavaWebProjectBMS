<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>    
<%@page import="com.cdac.dto.Admin"%>
<%@ include file="cache_control.jsp" %>
<%	
	Admin admin = (Admin)session.getAttribute("admin");
	if(admin !=null && admin.getAdminId()>0)
	{

%>




<!DOCTYPE html>



<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>

<body style="background-color: rgb( 209, 209, 209);">

    <div class="container-fluid">

        <div class="row " style="box-shadow: 2px 5px 10px 2px black;opacity: 0.8;backdrop-filter: blur(3px);">

            <div class="col-9 d-flex  " style="letter-spacing: 2px; font-family: ROG fonts;">
                <h2 style="opacity: 1;">

                    <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-book" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                    <path fill-rule="evenodd" d="M1 2.828v9.923c.918-.35 2.107-.692 3.287-.81 1.094-.111 2.278-.039 3.213.492V2.687c-.654-.689-1.782-.886-3.112-.752-1.234.124-2.503.523-3.388.893zm7.5-.141v9.746c.935-.53 2.12-.603 3.213-.493 1.18.12 2.37.461 3.287.811V2.828c-.885-.37-2.154-.769-3.388-.893-1.33-.134-2.458.063-3.112.752zM8 1.783C7.015.936 5.587.81 4.287.94c-1.514.153-3.042.672-3.994 1.105A.5.5 0 0 0 0 2.5v11a.5.5 0 0 0 .707.455c.882-.4 2.303-.881 3.68-1.02 1.409-.142 2.59.087 3.223.877a.5.5 0 0 0 .78 0c.633-.79 1.814-1.019 3.222-.877 1.378.139 2.8.62 3.681 1.02A.5.5 0 0 0 16 13.5v-11a.5.5 0 0 0-.293-.455c-.952-.433-2.48-.952-3.994-1.105C10.413.809 8.985.936 8 1.783z"/>
                  </svg>
                    <tr>BMS</tr>

                </h2>
            </div>


            <div class="col-1  d-flex  justify-content-end " style="letter-spacing: 2px; font-family: ROG fonts;">
                <h2 style="opacity: 1;">


                  <button class="btn btn-small btn-outline-danger"><a href="aboutus.htm">About</a></button>




                </h2>
            </div>
            <div class="col-2 d-flex  justify-content-end" style="letter-spacing: 2px; font-family: ROG fonts;">
                <h2 style="opacity: 1;">


                     <button class="btn btn-small btn-outline-danger"><a href="logout.jsp">Logout</a></button>




                </h2>
            </div>




        </div>
         <div class="row justify-content-center" style="margin-top:10vh;" >
            <button class="btn-uccess btn btn-outline-dark mx-2"><a href="book_list.htm">Show all</button>

         <button class="btn-daner btn btn-outline-dark mx-2" > <a href="prep_book_add_form.htm">Add Books</a> </button>


        </div>


        <div class="row " style="height:10vh;margin-top: 10vh;font-family:ROG fonts;text-decoration:underline;font-size:large   ;">
            <div class="col-4">


               ADD BOOK
            </div>
        </div>

        <table class="table table-hover table-dark">
            <thead>
            
            
                <tr>
					<th scope="col">Book ID</th>
					
                    <th scope="col">Book Name</th>
                    <th scope="col">Book-Author</th>
                    <th scope="col">Price(Rs)</th>
                    <th scope="col">Quantity</th>

                    
                </tr>
            </thead>
            <tbody>
            <spr:form action="book_add.htm" method="post" commandName="book">
                <tr>
						<td><spr:hidden path="bookId"/></td>
                    <td><spr:input placeholder="Enter Book Name" path="bookName"/></td>
                        <td><spr:input placeholder="Enter Book Author" path="bookAuthor"/></td>
                        <td><spr:input placeholder="Enter Price" path="bookPrice"/></td>
                        <td><spr:input placeholder="Enter Quantity" path="bookQty"/></td>
                     <td><button type="submit" value="add" class="btn-warning btn btn-sm ">add</button></td>
                </tr>

            </tbody>
            </spr:form>
        </table>









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