$(document).ready(function () {
    var listTrack;
    var param = '{"count": 20, "offset":0}';
    var playlist;
    $.ajax({
        url: "/tracks",
        method: "post",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        data: param,
        success: function (data) {
            listTrack = data;
            console.log(data);
            playlist = new jPlayerPlaylist({
                jPlayer: "#jquery_jplayer_1",
                cssSelectorAncestor: "#jp_container_1"
            }, listTrack, {
                playlistOptions: {
                    enableRemoveControls: true
                },
                swfPath: "./assets/js/jplayer/",
                supplied: "mp3",
                smoothPlayBar: true,
                audioFullScreen: true
            });
            console.log($("#jquery_jplayer_1").jPlayer("setMedia", data[1]));
            $("#jquery_jplayer_1").bind($.jPlayer.event.loadeddata, function (event) {
                jPlayerPlus();
            });
            $(document).on("click", '.soundcloud', function(event) {
                alert($(this).parent().parent().index());
                console.log(playlist.playlist[$(this).parent().parent().index()]);
                $(this).addClass("green");
                $.ajax({
                    url: "/share",
                    method: "post",
                    contentType: "application/json; charset=utf-8",
                    dataType: "json",
                    data: {
                        id: playlist.playlist[$(this).parent().parent().index()].aid
                    },
                    success: function (data) {
                        $(this).addClass("green");
                        console.log(data);
                    }
                });
            });
        }
    });

    $("#jquery_jplayer_1").bind($.jPlayer.event.loadeddata, function (event) {
        // $("#jquery_jplayer_1").jPlayer("clearMedia");
        jPlayerPlus();
    });
});

$("#loadMore").click(function () {
    $.ajax({
        url: "/tracks",
        method: "post",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        data: '{"count": 20, "offset":20}',
        success: function (data) {
            console.log(data);
            // var cssSelector = { jPlayer: "#jquery_jplayer_1", cssSelectorAncestor: "#jp_container_1" };
            // var playlist = []; // Empty playlist
            // var options = { swfPath: "./assets/js/jplayer/", supplied: "ogv, m4v, oga, mp3" };
            // var myPlaylist = new jPlayerPlaylist(cssSelector, playlist, options);
            playlist.add(data);
            $("#jquery_jplayer_1").bind($.jPlayer.event.loadeddata, function (event) {
                // $("#jquery_jplayer_1").jPlayer("clearMedia");
                jPlayerPlus();
            });
        }
    })
});