package com.vkmusic.entity.vk;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by Vadym_Vlasenko on 5/9/2016.
 */
public class Track implements Serializable {

    private String aid;
    @JsonProperty("owner_id")
    private String ownerID;
    private String artist;
    private String title;
    private String url;
    @JsonProperty("lyrics_id")
    private String lyricsID;
    private int duration;
    private int genre;
    private String album;

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    @JsonProperty("mp3")
    public String getMp3() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLyricsID() {
        return lyricsID;
    }

    public void setLyricsID(String lyricsID) {
        this.lyricsID = lyricsID;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Track{" +
                "aid='" + aid + '\'' +
                ", ownerID='" + ownerID + '\'' +
                ", artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", lyricsID='" + lyricsID + '\'' +
                ", duration=" + duration +
                ", genre=" + genre +
                ", album='" + album + '\'' +
                '}';
    }
}
