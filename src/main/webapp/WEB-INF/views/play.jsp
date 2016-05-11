<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en-US">
<head>
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html">
    <title>HTML5 Audio Player UI - Design Shack Demo</title>
    <meta name="author" content="Jake Rocheleau">
    <link rel="shortcut icon" href="http://designshack.net/favicon.ico">
    <link rel="icon" href="http://designshack.net/favicon.ico">
    <link rel="stylesheet" type="text/css" media="all" href="../resources/css/styles.css">
    <script type="text/javascript" src="../resources/js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="../resources/js/mediaelement-and-player.min.js"></script>
</head>

<body>
<div id="topbar">
    <a href="http://designshack.net">Back to Design Shack</a>
</div>

<div id="w">
    <div id="content">
        <h1>Customized HTML5 Audio Player</h1>

        <div class="audio-player">
                <h2>${tracks[0].title}</h2>
                <audio id="audio-player" src="${tracks[0].url}" type="audio/mp3" controls="controls"></audio>
        </div><!-- @end .audio-player -->
        <div class="audio-player">
            <h2>${tracks[1].title}</h2>
            <audio id="audio-player" src="${tracks[1].url}" type="audio/mp3" controls="controls"></audio>
        </div>
    </div><!-- @end #content -->
</div><!-- @end #w -->
<script type="text/javascript">
$(function(){
  $('#audio-player').mediaelementplayer({
    alwaysShowControls: true,
    features: ['playpause','progress','volume'],
    audioVolume: 'horizontal',
    audioWidth: 450,
    audioHeight: 70,
    iPadUseNativeControls: true,
    iPhoneUseNativeControls: true,
    AndroidUseNativeControls: true
  });
});



</script>
</body>
</html>

