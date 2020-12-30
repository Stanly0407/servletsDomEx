<%@ page contentType="text/html;charset=utf-8" %>

<html>
<head>
    <jsp:include page="/commonForPages/commonSettings.jsp"></jsp:include>
</head>
<body>
<nav class="navbar navbar-light bg-light">
    <a class="navbar-brand" href="index.jsp">
        <img src="images/house.png" width="30" height="30" class="d-inline-block align-top" alt="">
        Товарищество собственников "Уютный дом"
    </a>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
            </ul>
        </div>
    </nav>
</nav>

<div align="center" style="margin-top: 20px">
    <form style="width: 400px">
        <div class="form-group">
            <label for="exampleInputEmail1">Email</label>
            <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">Пароль</label>
            <input type="password" class="form-control" id="exampleInputPassword1">
        </div>
        <div class="form-group form-check">
            <input type="checkbox" class="form-check-input" id="exampleCheck1"
                   required oninvalid="this.setCustomValidity('The field must be filled')">
            <label class="form-check-label" for="exampleCheck1">Запомнить меня</label>
        </div>
        <button type="submit" class="btn btn-primary">Вход</button>
    </form>
</div>
</body>
</html>