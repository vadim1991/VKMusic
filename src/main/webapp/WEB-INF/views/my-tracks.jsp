<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<jsp:include page="main/head.jsp">
    <jsp:param name="pageName" value="My Tracks | Page"></jsp:param>
</jsp:include>

<body>

<c:set var="imagePath" value="../resources/images/template/"/>

<!-- ## LOGO ## -->
<aside id="logo-bar">
    <div id="logo"><a href="http://themeforest.quadcodes.com/site/musicvent/index.html"><img src="${imagePath}logo.png"
                                                                                             alt="LOGO"></a></div>
    <div id="ajax-load"></div>
</aside>

<!-- ## PAGE GLOBAL ## -->
<section id="page-global">

    <!-- ## NAV HEADER ## -->
    <jsp:include page="main/header.jsp">
        <jsp:param name="pageName" value="my-tracks"></jsp:param>
    </jsp:include>
    <!-- ## NAV HEADER END ## -->

    <!-- ## PAGE WRAPPER ## -->
    <div id="page-wrapper">

        <!-- ## PAGE ## -->
        <section id="page">

            <!-- ## FIXY WRAPPER ## -->
            <div id="fixy">
                <!-- ## PAGE HEADER ## -->
                <header id="page-header">
                    <h1>My tracks. <span>Browse through tracks </span></h1>
                </header>

                <!-- ## CONTENT META ## -->
                <nav id="content-meta">
                    <div class="container">

                        <!-- ## SOCIAL ## -->
                        <ul class="social-share">
                            <li>Share +
                                <ul class="clearfix">
                                    <li><a class="facebook"
                                           href="http://themeforest.quadcodes.com/site/musicvent/album-single.html#"><i
                                            class="icon-facebook"></i></a></li>
                                    <li><a class="twitter"
                                           href="http://themeforest.quadcodes.com/site/musicvent/album-single.html#"><i
                                            class="icon-twitter"></i></a></li>
                                    <li><a class="gplus"
                                           href="http://themeforest.quadcodes.com/site/musicvent/album-single.html#"><i
                                            class="icon-gplus"></i></a></li>
                                    <li><a class="pinterest"
                                           href="http://themeforest.quadcodes.com/site/musicvent/album-single.html#"><i
                                            class="icon-pinterest"></i></a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </nav>

            </div>
            <!-- ## FIXY WRAPPER END ## -->

            <!-- ## PAGE CONTENT ## -->
            <div class="container">
                <section id="page-content" class="albumPadding">

                    <!-- BLOG-META START -->
                    <div class="blog-meta">
                        <div class="text-gradient-blog"></div>
                        <div class="hover-post-head clearfix">
                            <div class="hover-post-title">
                                <h2 class="pf-heading"><i class="icon-music-1"></i>&nbsp; AudioJungle - Envato</h2>
                            </div>
                        </div>
                        <div class="hover-post-meta clearfix">
                            <div class="hover-post-metas">
                                <i class="icon-heart-1"></i>
                                <a class="hover-post-meta-like"
                                   href="http://themeforest.quadcodes.com/site/musicvent/album-single.html#">
                                    <span>03</span>
                                    <span>LIKES</span>
                                </a>
                            </div>
                            <div class="hover-post-metas">
                                <i class="icon-clock-1"></i>
                                <a class="hover-post-meta-date"
                                   href="http://themeforest.quadcodes.com/site/musicvent/album-single.html#">
                                    <span>March</span>
                                    <span>2013</span>
                                </a>
                            </div>
                            <div class="hover-post-metas last">
                                <i class="icon-chat"></i>
                                <a class="hover-post-meta-comment"
                                   href="http://themeforest.quadcodes.com/site/musicvent/album-single.html#">
                                    <span>03</span>
                                    <span>COMMENTS</span>
                                </a>
                            </div>
                        </div>
                    </div>
                    <!-- BLOG-META END -->

                    <!-- ## PLAYER ## -->
                    <div id="jp_container_1" class="jp-audio">
                        <div class="jp-type-playlist">
                            <div id="jquery_jplayer_1" class="jp-jplayer" style="width: 0px; height: 0px;"><img
                                    id="jp_poster_0" style="width: 0px; height: 0px; display: none;">
                                <audio id="jp_audio_0" preload="metadata"
                                       src="http://3.s3.envato.com/files/5513511/preview.mp3"></audio>
                            </div>
                            <div class="album-wrapper clearfix">
                                <!-- ## ALBUM POSTER IMAGE ## -->
                                <div class="album-base">
                                    <img src="${imagePath}2.jpg" alt="Album Poster">
                                </div>
                                <div class="album-controls">
                                    <!-- ## TRACK INFO ## -->
                                    <div class="track-info">
                                        <h3 class="track-heading"><i class="icon-note-beamed"></i> <span id="th-title">Whistle Blower</span>
                                        </h3>
                                        <p class="track-by"><i class="icon-user-1"></i> <span id="th-artist">by Adam Jamescuz</span>
                                        </p>
                                    </div>
                                    <!-- ## CONTROLS ## -->
                                    <div class="jp-gui jp-interface">
                                        <ul class="jp-controls clearfix">
                                            <li><a href="javascript:;" class="jp-previous" tabindex="1"><i
                                                    class="icon-backward"></i></a></li>
                                            <li><a href="javascript:;" class="jp-play" tabindex="1"><i
                                                    class="icon-play"></i></a></li>
                                            <li><a href="javascript:;" class="jp-pause" tabindex="1"
                                                   style="display: none;"><i class="icon-pause"></i></a></li>
                                            <li><a href="javascript:;" class="jp-next" tabindex="1"><i
                                                    class="icon-forward"></i></a></li>
                                            <li><a href="javascript:;" class="jp-stop" tabindex="1"><i
                                                    class="icon-stop"></i></a></li>
                                        </ul>
                                        <!-- ## PROGRESS BAR ## -->
                                        <div class="jp-progress">
                                            <div class="jp-seek-bar" style="width: 100%;">
                                                <div class="jp-play-bar" style="width: 0%;"></div>
                                            </div>
                                            <div class="jp-current-time">00:00</div>
                                            <div class="jp-duration">03:56</div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <!-- ## PLAY LIST ## -->
                            <div class="playlist-heading">Track List
                                <!-- ## SHUFFLE/REPEAT ## -->
                                <ul class="jp-toggles clearfix">
                                    <li><a href="javascript:;" class="jp-shuffle" tabindex="1" title="shuffle"><i
                                            class="icon-shuffle-1"></i> Shuffle</a></li>
                                    <li><a href="javascript:;" class="jp-shuffle-off" tabindex="1" title="shuffle off"
                                           style="display: none;"><i class="icon-shuffle-1"></i>Shuffle Off</a></li>
                                    <li><a href="javascript:;" class="jp-repeat" tabindex="1" title="repeat"><i
                                            class="icon-loop"></i> Repeat</a></li>
                                    <li><a href="javascript:;" class="jp-repeat-off" tabindex="1" title="repeat off"
                                           style="display: none;"><i class="icon-loop"></i> Repeat Off</a></li>
                                </ul>
                            </div>
                            <!-- ## TRACK LIST ## -->
                            <div class="jp-playlist">
                                <ul></ul>
                            </div>
                            <!-- ## PLAYER FALLBACK ## -->
                            <div class="jp-no-solution" style="display: none;">
                                <span>Update Required</span>
                                To play the media you will need to either update your browser to a recent version or
                                update your <a href="http://get.adobe.com/flashplayer/" target="_blank">Flash plugin</a>.
                            </div>
                        </div>
                    </div>
                    <!-- ## PLAYER END ## -->

                    <!-- POST CONTENT -->
                    <div class="postContent transparent">
                        Lorem ipsum dolor sit amet, consectetur adipisicing elit. Repudiandae facere quam officiis
                        magnam asperiores id quibusdam quidem eaque sed incidunt! Modi magni deleniti veritatis expedita
                        doloribus aperiam alias autem numquam! Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                        Dolor voluptatum laudantium quibusdam iusto molestias ut suscipit illo quisquam culpa atque.
                        Voluptatibus quis cupiditate error tenetur optio doloremque. Sed sit optio.
                    </div>
                    <!-- POST CONTENT END -->

                </section>
            </div>
            <!-- ## PAGE CONTENT END ## -->

        </section>
        <!-- ## PAGE END ## -->

    </div>
    <!-- ## PAGE WRAPPER END ## -->

    <!-- ## WIDGET AREA ## -->
    <section id="widgetArea">
        <div class="container">
            <div class="row">
                <!-- ## WIDGET 1 ## -->
                <div class="col-4 col">
                    <div class="widget">
                        <h3 class="widgetTitle">Flickr Widget</h3>
                        <!-- FLICKR -->
                        <ul id="flickr" class="clearfix">
                            <li><a href="http://farm4.staticflickr.com/3940/15647274066_2ee48c3fe9_b.jpg"
                                   rel="prettyPhoto[pp_gal]"><img class="flickr"
                                                                  src="${imagePath}15647274066_2ee48c3fe9_s.jpg"
                                                                  alt="Halloween 2014 at Envato in Melbourne"></a></li>
                            <li><a href="http://farm4.staticflickr.com/3945/15485436268_846ccca178_b.jpg"
                                   rel="prettyPhoto[pp_gal]"><img class="flickr"
                                                                  src="${imagePath}15485436268_846ccca178_s.jpg"
                                                                  alt="Halloween 2014 at Envato in Melbourne"></a></li>
                            <li><a href="http://farm4.staticflickr.com/3956/15668911091_4ef20118b5_b.jpg"
                                   rel="prettyPhoto[pp_gal]"><img class="flickr"
                                                                  src="${imagePath}15668911091_4ef20118b5_s.jpg"
                                                                  alt="Halloween 2014 at Envato in Melbourne"></a></li>
                            <li><a href="http://farm6.staticflickr.com/5605/15484954949_a4e97a9dc5_b.jpg"
                                   rel="prettyPhoto[pp_gal]"><img class="flickr"
                                                                  src="${imagePath}15484954949_a4e97a9dc5_s.jpg"
                                                                  alt="Halloween 2014 at Envato in Melbourne"></a></li>
                            <li><a href="http://farm8.staticflickr.com/7490/15647103116_1e4b9033f0_b.jpg"
                                   rel="prettyPhoto[pp_gal]"><img class="flickr"
                                                                  src="${imagePath}15647103116_1e4b9033f0_s.jpg"
                                                                  alt="Halloween 2014 at Envato in Melbourne"></a></li>
                            <li><a href="http://farm6.staticflickr.com/5599/15668909741_eaf3db4054_b.jpg"
                                   rel="prettyPhoto[pp_gal]"><img class="flickr"
                                                                  src="${imagePath}15668909741_eaf3db4054_s.jpg"
                                                                  alt="Halloween 2014 at Envato in Melbourne"></a></li>
                            <li><a href="http://farm8.staticflickr.com/7544/15670834825_5f55bb7e4e_b.jpg"
                                   rel="prettyPhoto[pp_gal]"><img class="flickr"
                                                                  src="${imagePath}15670834825_5f55bb7e4e_s.jpg"
                                                                  alt="Halloween 2014 at Envato in Melbourne"></a></li>
                            <li><a href="http://farm4.staticflickr.com/3946/15485435298_7848e85e0a_b.jpg"
                                   rel="prettyPhoto[pp_gal]"><img class="flickr"
                                                                  src="${imagePath}15485435298_7848e85e0a_s.jpg"
                                                                  alt="Halloween 2014 at Envato in Melbourne"></a></li>
                            <li><a href="http://farm4.staticflickr.com/3937/15647100406_34599445cf_b.jpg"
                                   rel="prettyPhoto[pp_gal]"><img class="flickr"
                                                                  src="${imagePath}15647100406_34599445cf_s.jpg"
                                                                  alt="Halloween 2014 at Envato in Melbourne"></a></li>
                            <li><a href="http://farm8.staticflickr.com/7505/15484952219_c43ae000b4_b.jpg"
                                   rel="prettyPhoto[pp_gal]"><img class="flickr"
                                                                  src="${imagePath}15484952219_c43ae000b4_s.jpg"
                                                                  alt="Halloween 2014 at Envato in Melbourne"></a></li>
                        </ul>
                    </div>
                </div>
                <!-- ## WIDGET 2 ## -->
                <div class="col-4 col">
                    <div class="widget">
                        <h3 class="widgetTitle">Text Widget</h3>
                        <p class="textBlock">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Commodi
                            voluptates sint deleniti quia cumque libero nam laborum sequi</p>
                    </div>
                </div>
                <!-- ## WIDGET 3 ## -->
                <div class="col-4 col">
                    <div class="widget">
                        <h3 class="widgetTitle">Social Link Widget</h3>
                        <!-- ## SOCIAL NETWORKS List ## -->
                        <ul id="qcSocialIntro" class="clearfix">
                            <li><a href="http://themeforest.quadcodes.com/site/musicvent/album-single.html#"><img
                                    alt="image" src="${imagePath}facebook.png" class="tips" original-title="FACEBOOK"></a>
                            </li>
                            <li><a href="http://themeforest.quadcodes.com/site/musicvent/album-single.html#"><img
                                    alt="image" src="${imagePath}twitter.png" class="tips" original-title="TWITTER"></a>
                            </li>
                            <li><a href="http://themeforest.quadcodes.com/site/musicvent/album-single.html#"><img
                                    alt="image" src="${imagePath}dribbble.png" class="tips" original-title="DRIBBBLE"></a>
                            </li>
                            <li><a href="http://themeforest.quadcodes.com/site/musicvent/album-single.html#"><img
                                    alt="image" src="${imagePath}flickr.png" class="tips" original-title="FLICKR"></a></li>
                            <li><a href="http://themeforest.quadcodes.com/site/musicvent/album-single.html#"><img
                                    alt="image" src="${imagePath}google.png" class="tips" original-title="GOOGLE"></a></li>
                            <li><a href="http://themeforest.quadcodes.com/site/musicvent/album-single.html#"><img
                                    alt="image" src="${imagePath}youtube.png" class="tips" original-title="YOUTUBE"></a>
                            </li>
                            <li><a href="http://themeforest.quadcodes.com/site/musicvent/album-single.html#"><img
                                    alt="image" src="${imagePath}vimeo.png" class="tips" original-title="VIMEO"></a></li>
                            <li><a href="http://themeforest.quadcodes.com/site/musicvent/album-single.html#"><img
                                    alt="image" src="${imagePath}skype.png" class="tips" original-title="SKYPE"></a></li>
                            <li><a href="http://themeforest.quadcodes.com/site/musicvent/album-single.html#"><img
                                    alt="image" src="${imagePath}linkedin.png" class="tips" original-title="LINKEDIN"></a>
                            </li>
                            <li><a href="http://themeforest.quadcodes.com/site/musicvent/album-single.html#"><img
                                    alt="image" src="${imagePath}digg.png" class="tips" original-title="DIGG"></a></li>
                        </ul>
                    </div>
                </div>

            </div>
        </div>
    </section>
    <!-- ## WIDGET AREA END ## -->

    <!-- ## FOOTER ## -->
    <footer id="PriFooter">
        <div class="container clearfix">
            <!-- ## COPYRIGHTS ## -->
            <p id="copyrights">Copyright © 2016 <a href="#" target="_blank">VKMusic</a>
                Hand-Crafted by <a href="#" target="_blank">EB Team</a></p>
            <!-- ## FOOTER NAV ## -->
            <nav id="footerNav">
                <ul>
                    <li><a href="#">About</a></li>
                    <li><a href="#">Privacy</a></li>
                    <li><a href="#">Contact</a></li>
                </ul>
            </nav>
        </div>
        <jsp:include page="main/footer.jsp">
            <jsp:param name="pageName" value="Login | Page"></jsp:param>
        </jsp:include>
    </footer>
    <!-- ## FOOTER END ## -->

</section>
<!-- ## PAGE GLOBAL END ## -->

</body>
</html>