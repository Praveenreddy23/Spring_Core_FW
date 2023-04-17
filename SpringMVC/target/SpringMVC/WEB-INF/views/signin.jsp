<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 09-04-2023
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>

<!doctype html>
<html lang="en">
<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

  <title>Sign Up</title>
</head>
<body bgcolor="#7fffd4" text="#8a2be2">

<div class="container" mt-5>

  <div class="text-center">

    <h2 style="color: coral">${Author}</h2>
    <h3 style="color: chocolate">${CodeIn}</h3>
    <hr style="color: deeppink">

  </div>

  <form action="processform" method="post">

    <h1 class="text-center" style="color: coral">Register</h1>
    <p class="text-center">It`s quick and easy...</p>
    <hr>

    <div class="mb-3">
      <%--               <label for="exampleInputEmail1" class="form-label">User Name</label>--%>
      <input type="text" class="form-control" id="userName" aria-describedby="emailHelp"
             placeholder="Enter User Name" name="userName">
    </div>

    <div class="mb-3">
      <%--               <label for="exampleInputEmail1" class="form-label">Email address</label>--%>
      <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Email" name="userEmail">
      <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
    </div>

    <div class="mb-3">
      <%--               <label for="exampleInputPassword1" class="form-label">Password</label>--%>
      <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Enter Password" name="userPassword">
    </div>

    <div class="mb-3 form-check">
      <input type="checkbox" class="form-check-input" id="exampleCheck1">
      <label class="form-check-label" for="exampleCheck1">Check me out</label>
    </div>

    <div class="container text-center">
      <button type="submit" class="btn btn-primary">Sign In</button>
    </div>

  </form>


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
