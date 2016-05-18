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
                }
            });
