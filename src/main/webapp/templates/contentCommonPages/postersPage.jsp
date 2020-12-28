<%@ page contentType="text/html;charset=utf-8" %>
<html>
<head>
   <jsp:include page="/commonForPages/commonSettings.jsp"></jsp:include>
</head>

<body>
<jsp:include page="/commonForPages/footerUsers.jsp"></jsp:include>

<%--Панель поиска--%>
<div class="form-row" style="margin-top: 10px">
    <div class="form-group col-md-6">
        <form method="get" action="/main" class="form-inline">
            <input type="text" name="filter" class="form-control" value="" placeholder="Search by tag" />
            <button type="submit" class="btn btn-info" style="margin-left: 8px">Search</button>
        </form>
    </div>
</div>

<%--Карточка для отображения постеров через лист--%>
<div class="card">
    <img src="/images/first-mandalorian.jpg" class="card-img-top" alt="...">
    <div class="card-body">
        <h5 class="card-title">Название карточки</h5>
        <p class="card-text">This card has supporting text below as a natural lead-in to additional content.</p>
        <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
    </div>
    <a class="col align-self-center" href="#">
        <%--        Лайки - картинка--%>
        <%--        <#if message.meLiked>--%>
        <i class="fas fa-heart"></i>
        <%--        <#else>--%>
        <%--        <i class="far fa-heart"></i>--%>
        <%--    </#if>--%>
        <%--    ${message.likes}--%>
    </a>
</div>

</body>

