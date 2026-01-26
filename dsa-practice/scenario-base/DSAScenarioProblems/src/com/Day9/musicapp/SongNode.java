package com.Day9.musicapp;

public class SongNode {
	int trackId;
    String title;
    String artist;
    SongNode left;
    SongNode right;

    public SongNode(int trackId, String title, String artist) {
        this.trackId = trackId;
        this.title = title;
        this.artist = artist;
        this.left = null;
        this.right = null;
    }
}
