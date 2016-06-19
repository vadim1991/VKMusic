$("#search").click(function () {
	var listTrack;
	var searchText = $("#search-text").val();
	var audioSearchBean = {};
	audioSearchBean["count"] = 100;
	audioSearchBean["offset"] = 0;
	audioSearchBean["searchText"] = searchText;
		console.log(JSON.stringify(audioSearchBean));
    var player;
                $.ajax({
                    url: "/search",
                    method: "post",
                    contentType: "application/json; charset=utf-8",
                    dataType: "json",
                    data: JSON.stringify(audioSearchBean),
                    success: function (data) {
                        listTrack = data;
		var player = new jPlayerPlaylist({
			jPlayer: "#jquery_jplayer_2",
			cssSelectorAncestor: "#jp_container_2"
		}, listTrack, {
			swfPath: "./assets/js/jplayer/",
			supplied: "mp3",
			smoothPlayBar: true,
		});
		console.log(player);
        }
    });
    })