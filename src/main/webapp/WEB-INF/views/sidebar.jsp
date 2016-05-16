<aside class="sidebar">
    <div class="person-box">
        <div class="photo round">
            <img src="${sessionScope.profile.photoUrl}" alt="${sessionScope.profile.lastName}" width="100" height="100"/>
        </div>
        <h1 class="name">${sessionScope.profile.firstName} ${sessionScope.profile.lastName}</h1>
    </div>
    <nav class="main-nav">
        <a href="#0" class="menu-button button">
            <i class="fa fa-bars"></i>
        </a>
        <ul class="menu">
            <li class="menu-item">
                <a href="#my-tracks" class="menu-link"><i class="fa fa-music menu-icon"></i><span>My tracks</span></a>
            </li>
            <li class="menu-item">
                <a href="#education" class="menu-link"><i class="fa fa-graduation-cap menu-icon"></i><span>Education</span></a>
            </li>
            <li class="menu-item">
                <a href="#experience" class="menu-link"><i class="fa fa-pencil menu-icon"></i><span>Experience</span></a>
            </li>
            <li class="menu-item">
                <a href="#skills" class="menu-link"><i class="fa fa-diamond menu-icon"></i><span>Skills</span></a>
            </li>
            <li class="menu-item">
                <a href="#portfolio" class="menu-link"><i class="fa fa-suitcase menu-icon"></i><span>Portfolio</span></a>
            </li>
            <li class="menu-item">
                <a href="#contacts" class="menu-link"><i class="fa fa-location-arrow menu-icon"></i><span>Contacts</span></a>
            </li>
            <li class="menu-item">
                <a href="#feedbacks" class="menu-link"><i class="fa fa-comment-o menu-icon"></i><span>Feedbacks</span></a>
            </li>
        </ul>
    </nav>
    <div class="go-back-block">
        <a href="index.html" class="go-back button"><i class="fa fa-chevron-left"></i><span>Go back</span></a>
    </div>
</aside>