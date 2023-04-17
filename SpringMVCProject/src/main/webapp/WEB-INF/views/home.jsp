<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 09-04-2023
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<%--css--%>
    <link href="<spring:url value="/menu/css/style.css"/> ">
<%--    java Script--%>
   <script src="<spring:url value="/menu/script/script.js"/> "></script>

    <title>Search Page</title>
</head>
<body>
<h1 style="color: coral">Welcome TO My Page</h1>
<%--images--%>
<img src="menu/images/images.png"/>
<img src="<spring:url value=" /menu/images/images.png"/>"/>


    <div class="container" >
        <div class="card mx-auto mt-4 bg-primary" style="width:60%"   >
            <div class="card-body">

                <form action="search">

                    <div class="form-group">

                        <input type="text" name="query" placeholder="search" class="form-control"/>

                    </div>
                    <center>
                    <div class="container">

                        <button  type="button" class="btn btn-success mt-2" >Search</button>

                    </div>
                    </center>

                </form>


            </div>
        </div>

    </div>

<!-- Optional JavaScript; choose one of the two! -->

<!-- Option 1: Bootstrap Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<!-- Option 2: Separate Popper and Bootstrap JS -->
<!--
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
-->
</body>
</html>
