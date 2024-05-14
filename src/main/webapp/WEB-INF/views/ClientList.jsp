<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" type="text/css"
          href="webjars/bootstrap/5.3.3/css/bootstrap.min.css" />
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customers List</title>
</head>
<body>
<header>
    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-light bg-white">
        <div class="container-fluid">
            <button
                    class="navbar-toggler"
                    type="button"
                    data-mdb-toggle="collapse"
                    data-mdb-target="#navbarExample01"
                    aria-controls="navbarExample01"
                    aria-expanded="false"
                    aria-label="Toggle navigation"
            >
                <i class="fas fa-bars"></i>
            </button>
            <div class="collapse navbar-collapse" id="navbarExample01">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item active">
                        <a class="nav-link" href="createCustomer">Create
                            Customer</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <!-- Navbar -->
    <!-- Jumbotron -->
    <div class="p-1 text-center bg-light">
        <h1 class="mb-3">Customers List - JSP</h1>
    </div>
    <!-- Jumbotron -->
</header>
<main class="container mt-5">
    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">id</th>
            <th scope="col">firstname</th>
            <th scope="col">lastname</th>
            <th scope="col">email</th>
            <th scope="col">phoneNumber</th>
            <th scope="col">address</th>
            <th scope="col">city</th>
            <th scope="col">postalCode</th>
            <th scope="col">country</th>
        </tr>

        </thead>
        <tbody>
        <c:forEach items="${clients}" var="client" >
            <tr>
                <td>${client.id}</td>
                <td>${client.firstname}</td>
                <td>${client.lastname}</td>
                <td>${client.email}</td>
                <td>${client.phoneNumber}</td>
                <td>${client.address}</td>
                <td>${client.city}</td>
                <td>${client.postalCode}</td>
                <td>${client.country}</td>
                <td>
                    <a
                            onclick="return confirm('Are you sure to delete this client?')"
                            href="deleteClient?id=${client.id}">
                        Delete
                    </a>
                </td><td>
                    <a
                            href="editClient?id=${client.id}">
                        Edit
                    </a>
                </td>


            </tr>

        </c:forEach>
        </tbody>


    </table>

</main>
<footer class="text-center text-lg-start bg-light text-muted">
    <div class="text-center p-4" style="background-color: rgba(0, 0, 0,
0.05);">
        © 2023 Copyright:
        <a class="text-reset fw-bold"
           href="http://6solutions.com/">6solutions.com</a>
    </div>
</footer>
</body>
</html>