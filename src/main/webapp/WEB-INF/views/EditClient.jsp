<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" type="text/css"
          href="webjars/bootstrap/5.3.3/css/bootstrap.min.css" />
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Client Edition</title>
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
                        <a class="nav-link" href="ClientList">Clients
                            List</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <!-- Navbar -->
    <!-- Jumbotron -->
    <div class="p-1 text-center bg-light">
        <h1 class="mb-3">Client Edition - JSP</h1>
    </div>
    <!-- Jumbotron -->
</header>
<main class="container mt-5">

    <form action="updateClient" method="post">
        <div class="form-group">
            <label class ="form-label" hidden="hidden" for="id">id : </label>
            <input class="form-control" hidden="hidden" type="text" id="id" name="id" value="${clientView.id}">
        </div>
        <div class="form-group">
            <label class ="form-label" for="firstName">First Name : </label>
            <input class="form-control" type="text" id="firstName" name="firstName" value="${clientView.firstName}">
        </div>
        <div class="form-group">
            <label class ="form-label" for="lastName">Last Name : </label>
            <input type="text" id="lastName" name="lastName" value="${clientView.lastName}">
        </div>
        <div class="form-group">
            <label class ="form-label" for="email">Email : </label>
            <input class="form-control" type="email" id="email" name="email" value="${clientView.email}">
        </div>
        <div class="form-group">
            <label class ="form-label" for="phoneNumber">Phone Number : </label>
            <input class="form-control" type="tel" id="phoneNumber" name="phoneNumber" value="${clientView.phoneNumber}">
        </div>
        <div class="form-group">
            <label class ="form-label" for="address">Address : </label>
            <input class="form-control" type="text" id="address" name="address" value="${clientView.address}">
        </div>
        <div class="form-group">
            <label class ="form-label" for="city">City : </label>
            <input class="form-control" type="text" id="city" name="city" value="${clientView.city}">
        </div>
        <div class="form-group">
            <label class ="form-label" for="postalCode">Postal Code : </label>
            <input class="form-control" type="text" id="postalCode" name="postalCode" value="${clientView.postalCode}">
        </div>
        <div class="form-group">
            <label class ="form-label" for="country">Country : </label>
            <input class="form-control" type="text" id="country" name="country"value="${clientView.country}">
        </div>
        <div>
            <input class="form-control btn btn-primary " type="submit" value="Update">
        </div>
    </form>

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