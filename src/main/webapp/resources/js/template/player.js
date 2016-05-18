	$(document).ready(function(){
	var listTrack;
    var player;
                $.ajax({
                    url: "/tracks",
                    method: "get",
                    contentType: "application/json; charset=utf-8",
                    dataType: "json",
                    success: function (data) {
                        listTrack = data;
		new jPlayerPlaylist({
			jPlayer: "#jquery_jplayer_1",
			cssSelectorAncestor: "#jp_container_1"
		}, listTrack, {
			swfPath: "./assets/js/jplayer/",
			supplied: "mp3, oga",
			smoothPlayBar: true,
		});
        }
    });
		// CALL PLAYLIST CUSTOM FUNCTION
		$("#jquery_jplayer_1").bind($.jPlayer.event.loadeddata, function(event) {
			jPlayerPlus();
   		});
	});
