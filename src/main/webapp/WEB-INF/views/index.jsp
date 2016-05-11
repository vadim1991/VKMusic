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
        <a class="btn btn-flat btn-warning" href="http://oauth.vk.com/authorize?client_id=5450850&redirect_uri=http%3A%2F%2Flocalhost%3A8080%2Fvklogin&response_type=code&display=page&scope=friends,audio,photos,notify"
           title="Зайти через ВКонтакте">Зайти через ВКонтакте</a>
    </div>
</div>
</body>
</html>