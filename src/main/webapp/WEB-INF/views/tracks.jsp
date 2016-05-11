<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home page</title>
    <jsp:include page="../views/main/header.jsp"/>
</head>
<body>
<h1>My home page</h1>

<div class="container">
    <div>
        <c:forEach var="track" items="${tracks}">
            <p>${track.title}</p>
            <a href="${track.url}" download="sound">Скачайте музыку</a>.
            <audio controls>
                <source src="${track.url}">
            </audio>
        </c:forEach>
    </div>
</div>
</body>
</html>