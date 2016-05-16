<!DOCTYPE html>
<html>
<jsp:include page="main/head.jsp">
    <jsp:param name="pageName" value="Home | Page"></jsp:param>
</jsp:include>
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<body>
<div class="container">
    <jsp:include page="sidebar.jsp"></jsp:include>
    <div class="content-wrapper">
        <main class="content">
            <article class="article" id="about-me">
                <h2 class="article-title">Player</h2>
                <div id="player4" class="aplayer"></div>
            </article>

        </main>
        <footer>
            <a href="#0" class="button to-top-button">
                <i class="fa fa-chevron-up"></i>
            </a>
        </footer>
    </div>
</div>
</body>
<jsp:include page="main/footer.jsp">
    <jsp:param name="pageName" value="Login | Page"></jsp:param>
</jsp:include>
</html>