<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>    




<!DOCTYPE html>



<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

</head>

<body class="text-light" style="background-image: url(1.jpg);background-size: cover;">

    <spr:form action="prep_user_log.htm" method="post" commandName="user">
        <div class="container-fluid">


            <div class="row  justify-content-center " style="box-shadow: 2px 5px 10px 2px black;opacity: 0.8;backdrop-filter: blur(3px);">

                <div class="col-4 d-flex justify-content-center " style="letter-spacing: 2px; font-family: ROG fonts;">
                    <h2 style="opacity: 1;">

                        <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-book" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                        <path fill-rule="evenodd" d="M1 2.828v9.923c.918-.35 2.107-.692 3.287-.81 1.094-.111 2.278-.039 3.213.492V2.687c-.654-.689-1.782-.886-3.112-.752-1.234.124-2.503.523-3.388.893zm7.5-.141v9.746c.935-.53 2.12-.603 3.213-.493 1.18.12 2.37.461 3.287.811V2.828c-.885-.37-2.154-.769-3.388-.893-1.33-.134-2.458.063-3.112.752zM8 1.783C7.015.936 5.587.81 4.287.94c-1.514.153-3.042.672-3.994 1.105A.5.5 0 0 0 0 2.5v11a.5.5 0 0 0 .707.455c.882-.4 2.303-.881 3.68-1.02 1.409-.142 2.59.087 3.223.877a.5.5 0 0 0 .78 0c.633-.79 1.814-1.019 3.222-.877 1.378.139 2.8.62 3.681 1.02A.5.5 0 0 0 16 13.5v-11a.5.5 0 0 0-.293-.455c-.952-.433-2.48-.952-3.994-1.105C10.413.809 8.985.936 8 1.783z"/>
                      </svg>
                        <tr>BMS</tr>




                    </h2>
                </div>
            </div>



            <div class="row justify-content-center mt-5">



                <div class="col-10 col-md-3">

                    <div class="row justify-content-center" style="height:fit-content;">

                        <div class="col bg-dark " style="box-shadow: 0px 0px 10px 6px rgb(34, 32, 32);border-radius: 10px;opacity: 0.9;">



                            <div class="row  justify-content-center" style="box-shadow: 0px 10px 30px 4px black; font-family:ROG fonts;border-radius:20px;border:3px solid ;opacity:1.0">


                                Forgot password

                            </div>




                            <div class="row mt-4  justify-content-between ">


                                <div class=" ml-2" style="text-decoration: underline;">Email</div>
                                <div class="mr-2 ">
                                    <input type="text form-control-sm" placeholder="enter email" style="border:1px solid black;"></div>

                            </div>
                            <div class=" row mb-3 mt-4 justify-content-center">



                                <div class="mx-2 col bg-success justify-content-center d-flex align-items-center" style="color:white;border-radius:10px">**Please make sure to write your registered email id</div>
                                <div class="mx-2 bg-warning  col" style="color:rgb(255, 255, 255);border-radius: 10px;">Your password will be sent onto your mail</div>

                            </div>

                            <div class="row mb-3 mt-4 justify-content-center ">

                                <div class="col d-flex justify-content-between ">
                                                    <div> <button class="btn btn-light btn-sm btn-outline-danger "><a href="index.jsp" >Back</a></button></div>
                                    <div> <button type="submit" class="btn btn-light btn-sm btn-outline-danger ">Submit</button></div>
                                </div>




                            </div>


                        </div>



                    </div>


                </div>

            </div>








        </div>
    </spr:form>
</body>

</html>