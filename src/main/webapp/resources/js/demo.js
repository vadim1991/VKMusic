var listTrack;
var player;
            $.ajax({
                url: "/tracks",
                method: "get",
                contentType: "application/json; charset=utf-8",
                dataType: "json",
                success: function (data) {
                    listTrack = data;
                    player = new APlayer({
                        element: document.getElementById('player4'),
                        narrow: false,
                        autoplay: false,
                        showlrc: false,
                        mutex: true,
                        theme: '#26c17e',
                        music: listTrack
                    });
                    player.init();
                    $(".aplayer-list").scroll(function(){
                    console.log($(this)[0].scrollHeight);
                    console.log($(this).outerHeight());
                    console.log($(this).scrollTop());
                        if($(this)[0].scrollHeight - $(this).scrollTop() === $(this).outerHeight()) {
                                player.option.music = player.option.music.concat(listTrack);
                                console.log(player);
                        };
                    });
                }
            });

function getTracks() {
    var listTrack;
    $.ajax({
        url: "/tracks",
        method: "get",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function (data) {
            listTrack = data;
    )};
    return listTrack;
};

function initPlayer(tracks) {
    player = new APlayer({
        element: document.getElementById('player4'),
        narrow: false,
        autoplay: false,
        showlrc: false,
        mutex: true,
        theme: '#26c17e',
        music: tracks
    });
}
