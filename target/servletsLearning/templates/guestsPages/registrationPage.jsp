<%@ page contentType="text/html;charset=utf-8" %>
<html>
<head>
   <jsp:include page="/commonForPages/commonSettings.jsp"></jsp:include>
</head>

<body>
<jsp:include page="/commonForPages/footerGuests.jsp"></jsp:include>

<form style="margin-left: 500px; margin-top: 15px; margin-right: 500px ">
    <div class="form-group" class="shadow p-3 mb-5 bg-white rounded">
        <label for="formGroupExampleInput">Email</label>
        <input type="email" class="form-control" id="formGroupExampleInput" placeholder="sevsnape123@gmail.com"
               required oninvalid="this.setCustomValidity('The field must be filled')">
    </div>
    <div class="form-group">
        <label for="formGroupExampleInput2">Firstname</label>
        <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="Severus"
               required oninvalid="this.setCustomValidity('The field must be filled')">
    </div>
    <div class="form-group">
        <label for="formGroupExampleInput2">Lastname</label>
        <input type="text" class="form-control" id="formGroupExampleInput3" placeholder="Snape"
               required oninvalid="this.setCustomValidity('The field must be filled')">
    </div>
    <div class="form-group">
        <label for="formGroupExampleInput2">Username</label>
        <input type="text" class="form-control" id="formGroupExampleInput4" placeholder="Wizard123"
               required oninvalid="this.setCustomValidity('The field must be filled')">
    </div>
    <div class="form-group">
        <label for="formGroupExampleInput2">Age</label>
        <input type="date" class="form-control" id="formGroupExampleInput5"
               required oninvalid="this.setCustomValidity('The field must be filled')">
    </div>
    <button type="submit" class="btn btn-primary">Send</button>
</form>

</body>

