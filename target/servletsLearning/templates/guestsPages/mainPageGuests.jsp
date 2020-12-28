<%@ page contentType="text/html;charset=utf-8" %>
<html>
<head>
   <jsp:include page="../../commonForPages/commonSettings.jsp"></jsp:include>
</head>

<body>
<jsp:include page="/commonForPages/footerGuests.jsp"></jsp:include>

<img src="../../images/gorod-doroga-trava-planeta.jpg" class="d-block w-100" alt="...">

<div class="jumbotron" style="height: 300px ">
    <h1 class="display-4" style="line-height: 55px">SerialsHere Forum!</h1>
    <p class="lead">It's  SerialsHere Forum.</p>
    <hr class="my-4">
    <p>Please log in or register to view the Forum content.</p>
    <p class="lead">
        <a class="btn btn-primary btn-lg" href="#" role="button">Registration</a>
        <a class="btn btn-primary btn-lg" href="#" role="button">Log in</a>
    </p>
</div>

<%--сделать одну карту и лист--%>
<div class="card-deck">
    <div class="card">
        <img src="../../images/hot.jpg" class="card-img-top" alt="...">
        <div class="card-body">
            <h5 class="card-title">The most talked about reviews</h5>
            <p class="card-text">List - 3 objects</p>
            <a href="#" class="btn btn-primary">Watch more...</a>
        </div>
    </div>
    <div class="card">
        <img src="../../images/comment.jpg" class="card-img-top" alt="...">
        <div class="card-body">
            <h5 class="card-title">New reviews</h5>
            <p class="card-text">List - 3 objects</p>
            <a href="#" class="btn btn-primary">Watch more...</a>
        </div>
    </div>
    <div class="card">
        <img src="../../images/best.jpg" class="card-img-top" alt="...">
        <div class="card-body">
            <h5 class="card-title">The most liked reviews</h5>
            <p class="card-text">List - 3 objects</p>
            <a href="#" class="btn btn-primary">Watch more...</a>
        </div>
    </div>
</div>

<div class="alert alert-primary" role="alert">
    <img src="/images/lion.png" width="30" height="30" class="d-inline-block align-top" alt="" loading="lazy">
<a href="#" class="alert-link">New posters!</a>
</div>
<%--Карточка для отображения 10 новых постеров через лист--%>
<div class="card">
    <img src="../../images/first-mandalorian.jpg" class="card-img-top" alt="...">
    <div class="card-body">
        <h5 class="card-title">Название карточки</h5>
        <p class="card-text">This card has supporting text below as a natural lead-in to additional content.</p>
        <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
    </div>
</div>

</body>

