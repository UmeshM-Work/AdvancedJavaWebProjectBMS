<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

        <style>
            #btn1,
            #btn2 {
                transition: 0.9s;
            }
            
            #btn1:hover,
            #btn2:hover {
                transform: scale(1.12);
                transition-delay: 0.3s;
            }
        </style>

    </head>

    <body class="text-light" style="background-image: url(1.jpg);background-size: cover;backdrop-filter: blur(3px);">

        <div class="container-fluid ">

            <div class=" ">

                <div class="row  mx-5  " style="height:">

                    <div class="col-12 d-flex justify-content-center align-items-center" style="font-family: ROG fonts;font-size: 100px;text-shadow: 5px 5px 8px black;">
                        <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-book" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                    <path fill-rule="evenodd" d="M1 2.828v9.923c.918-.35 2.107-.692 3.287-.81 1.094-.111 2.278-.039 3.213.492V2.687c-.654-.689-1.782-.886-3.112-.752-1.234.124-2.503.523-3.388.893zm7.5-.141v9.746c.935-.53 2.12-.603 3.213-.493 1.18.12 2.37.461 3.287.811V2.828c-.885-.37-2.154-.769-3.388-.893-1.33-.134-2.458.063-3.112.752zM8 1.783C7.015.936 5.587.81 4.287.94c-1.514.153-3.042.672-3.994 1.105A.5.5 0 0 0 0 2.5v11a.5.5 0 0 0 .707.455c.882-.4 2.303-.881 3.68-1.02 1.409-.142 2.59.087 3.223.877a.5.5 0 0 0 .78 0c.633-.79 1.814-1.019 3.222-.877 1.378.139 2.8.62 3.681 1.02A.5.5 0 0 0 16 13.5v-11a.5.5 0 0 0-.293-.455c-.952-.433-2.48-.952-3.994-1.105C10.413.809 8.985.936 8 1.783z"/>
                  </svg>
                        <tr>BMS</tr>


                    </div>
                </div>



                <div class="row  mx-5 my-5  " style="height:">

                    <div class="col-6 justify-content-center  d-flex">


                        <a href="prep_user_reg.htm"> <button id="btn1" class="btn btn-dark" style="box-shadow: 7px 7px 10px 0px black;"><svg width="5em" height="5em" viewBox="0 0 16 16" class="bi bi-signpost-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                        <path d="M7 1.414V4h2V1.414a1 1 0 0 0-2 0zM1 5a1 1 0 0 1 1-1h10.532a1 1 0 0 1 .768.36l1.933 2.32a.5.5 0 0 1 0 .64L13.3 9.64a1 1 0 0 1-.768.36H2a1 1 0 0 1-1-1V5zm6 5h2v6H7v-6z"/>
                      </svg><br>
                    
                  <div class="" style="font-family: ROG Fonts;font-style:inherit;">REGISTER</div>
                    </button></a>





                    </div>

                    <div class="col-6 justify-content-center d-flex">


                        <a href="prep_user_log1.htm">

                            <button id="btn2" class="btn btn-dark " style="box-shadow: 7px 7px 10px 0px black;"><svg width="5em" height="5em" viewBox="0 0 16 16" class="bi bi-door-open-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                            <path fill-rule="evenodd" d="M1.5 15a.5.5 0 0 0 0 1h13a.5.5 0 0 0 0-1H13V2.5A1.5 1.5 0 0 0 11.5 1H11V.5a.5.5 0 0 0-.57-.495l-7 1A.5.5 0 0 0 3 1.5V15H1.5zM11 2v13h1V2.5a.5.5 0 0 0-.5-.5H11zm-2.5 8c-.276 0-.5-.448-.5-1s.224-1 .5-1 .5.448.5 1-.224 1-.5 1z"/>
                          </svg><br>
                        
                      <div class="" style="font-family: ROG Fonts;font-style:inherit;">LOGIN <span style="font-family:Impact, Haettenschweiler, 'Arial Narrow Bold', sans-serif;color:black" > [ user ]</span></div>
                        </button>

                        </a>
                        <a class="ml-3" href="prep_admin_log1.htm">

                            <button id="btn2" class="btn btn-dark " style="box-shadow: 7px 7px 10px 0px black;"><svg width="5em" height="5em" viewBox="0 0 16 16" class="bi bi-door-open-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                            <path fill-rule="evenodd" d="M1.5 15a.5.5 0 0 0 0 1h13a.5.5 0 0 0 0-1H13V2.5A1.5 1.5 0 0 0 11.5 1H11V.5a.5.5 0 0 0-.57-.495l-7 1A.5.5 0 0 0 3 1.5V15H1.5zM11 2v13h1V2.5a.5.5 0 0 0-.5-.5H11zm-2.5 8c-.276 0-.5-.448-.5-1s.224-1 .5-1 .5.448.5 1-.224 1-.5 1z"/>
                          </svg><br>
                        
                      <div class="" style="font-family: ROG Fonts;font-style:inherit;">LOGIN<span style="font-family:Impact, Haettenschweiler, 'Arial Narrow Bold', sans-serif;color:black" > [ admin ]</span></div>
                        </button>

                        </a>


                    </div>
                </div>


                <div class="row  mx-5  my-5 justify-content-center align-items-center" style="font-family: ROG fonts;font-size: 28px;box-shadow: 2px 2px 30px 10px;border-radius: 10px; background-color:black;">

                    Become an member
                </div>



                <div class="row  mx-5  my-5 justify-content-center align-items-center bg-dark" style="">

                    <div class="col-6 d-flex justify-content-center align-items-center" style="font-family: ROG fonts;font-size: 20px;">
                        Search


                    </div>
                    <div class="col-6 d-flex justify-content-center align-items-center">
                       Search and find BMS your best source to buy cheap book online, make online book purchase, making us the best book website in India to read book online.

                    </div>
                </div>

                <div class="row  mx-5  my-5 justify-content-center align-items-center bg-dark" style="height:">

                    <div class="col-6 d-flex justify-content-center align-items-center" style="">
                        Buying books online will make sure that every member of your family has a book that suits their reading needs. Books by All and for All. From toddlers to grownups and all generation of this world.

                    </div>
                    <div class="col-6 d-flex justify-content-center align-items-center" style="font-size: 20px;font-family: ROG fonts;">
                        Buy books

                    </div>
                </div>

            </div>

        </div>
    </body>

    </html>