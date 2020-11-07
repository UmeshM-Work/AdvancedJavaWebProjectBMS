<%@page import="com.cdac.dto.Admin"%>
<%@page import="com.cdac.dto.Book"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="java.util.List"%>



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


    <style>
        #a1,
        #a2 {
            transition: 0.7s;
        }
        
        #a1:hover,
        #a2:hover {
            transform: scale(0.9);
        }
    </style>

</head>

<body style="background-color: rgb(209, 209, 209);">

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







        <div class="row  justify-content-center" style="margin-top: 20vh;">
            <div class="col-4"></div>
            <div class="col-2 d-flex justify-content-center "><button id="a1" class="btn btn-light  btn-outline-light" style="box-shadow:10px 10px 10px 10px grey;border-radius: 10px;"><a href="book_list.htm"><svg width="10em" height="10em" viewBox="0 0 16 16" class="bi bi-book-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                <path fill-rule="evenodd" d="M8 1.783C7.015.936 5.587.81 4.287.94c-1.514.153-3.042.672-3.994 1.105A.5.5 0 0 0 0 2.5v11a.5.5 0 0 0 .707.455c.882-.4 2.303-.881 3.68-1.02 1.409-.142 2.59.087 3.223.877a.5.5 0 0 0 .78 0c.633-.79 1.814-1.019 3.222-.877 1.378.139 2.8.62 3.681 1.02A.5.5 0 0 0 16 13.5v-11a.5.5 0 0 0-.293-.455c-.952-.433-2.48-.952-3.994-1.105C10.413.809 8.985.936 8 1.783z"/>
              </svg><tr>Show Books</tr></button></div>
            <div class="col-2 d-flex justify-content-center "> <button id="a2" class="btn btn-light btn-outline-light " style="box-shadow:10px 10px 10px 10px grey;border-radius: 10px;"> <a href="prep_book_add_form.htm"><svg width="10em" height="10em" viewBox="0 0 16 16" class="bi bi-journal-plus" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                <path d="M3 0h10a2 2 0 0 1 2 2v12a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2v-1h1v1a1 1 0 0 0 1 1h10a1 1 0 0 0 1-1V2a1 1 0 0 0-1-1H3a1 1 0 0 0-1 1v1H1V2a2 2 0 0 1 2-2z"/>
                <path d="M1 5v-.5a.5.5 0 0 1 1 0V5h.5a.5.5 0 0 1 0 1h-2a.5.5 0 0 1 0-1H1zm0 3v-.5a.5.5 0 0 1 1 0V8h.5a.5.5 0 0 1 0 1h-2a.5.5 0 0 1 0-1H1zm0 3v-.5a.5.5 0 0 1 1 0v.5h.5a.5.5 0 0 1 0 1h-2a.5.5 0 0 1 0-1H1z"/>
                <path fill-rule="evenodd" d="M8 5.5a.5.5 0 0 1 .5.5v1.5H10a.5.5 0 0 1 0 1H8.5V10a.5.5 0 0 1-1 0V8.5H6a.5.5 0 0 1 0-1h1.5V6a.5.5 0 0 1 .5-.5z"/>
              </svg>Add Books</a> </button></div>
            <div class="col-4"></div>

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