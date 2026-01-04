package com.linkedlist.doublylinkedlist.playlistmanagement;

import java.util.*;


public class SongNode {
	String songName;
    String artist;
    double duration;
    SongNode next;

    public SongNode(String songName, String artist, double duration) {
        this.songName = songName;
        this.artist = artist;
        this.duration = duration;
        this.next = this; 
    }
}
