<%@ page contentType="text/html;charset=utf-8" %>
<html>
<head>
    <jsp:include page="/commonForPages/commonSettings.jsp"></jsp:include>
</head>

<body>
<jsp:include page="/commonForPages/footerGuests.jsp"></jsp:include>

<div align="center" style="margin-top: 20px">
    <form style="width: 400px" >
        <div class="form-group"  >
            <label for="exampleInputEmail1">Email address</label>
            <input  type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
                    required oninvalid="this.setCustomValidity('The field must be filled')">
            <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">Password</label>
            <input type="password" class="form-control" id="exampleInputPassword1">
        </div>
        <div class="form-group form-check">
            <input type="checkbox" class="form-check-input" id="exampleCheck1"
                   required oninvalid="this.setCustomValidity('The field must be filled')">
            <label class="form-check-label" for="exampleCheck1">Remember me</label>
        </div>
        <button type="submit" class="btn btn-primary">Sign in</button>
    </form>
</div>
</body>