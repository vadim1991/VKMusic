<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Home page</title>
    <jsp:include page="../views/main/header.jsp"/>
</head>
<body>
<h1>My home page</h1>

<div class="container">
    <div>
        <a class="btn btn-flat btn-warning" href="/tracks"
           title="Tracks">Tracks</a>
        ${tracks}
    </div>
</div>
</body>
</html>