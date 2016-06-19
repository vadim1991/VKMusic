<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html charset=us-ascii"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
</head>
<jsp:include page="main/head.jsp">
    <jsp:param name="pageName" value="Login | Page"></jsp:param>
</jsp:include>
<body>
<main class="intro container">
    <section class="profile">
        <div class="photo round">
            <img src="../resources/images/fon_inner.jpg" alt="Vadym Vlasenko">
        </div>

        <h2 class="job-title">VK Music Player</h2>

        <div>
            <a class="button" href="http://oauth.vk.com/authorize?client_id=5450850&redirect_uri=http%3A%2F%2Flocalhost%3A8180%2Fvklogin&response_type=code&display=page&scope=friends,audio,photos,notify"
               title="Зайти через ВКонтакте">Sign in with VK</a>
        </div>
    </section>
</main>
</body>
</html>