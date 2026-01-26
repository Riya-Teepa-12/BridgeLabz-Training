package com.Day9.musicapp;

public class UseMusic {
    public static void main(String[] args) {

        MusicBST library = new MusicBST();

        library.root = library.insert(library.root, 201, "Believer", "Imagine Dragons");
        library.insert(library.root, 205, "Closer", "Chainsmokers");
        library.insert(library.root, 203, "Attention", "Charlie Puth");
        library.insert(library.root, 210, "Perfect", "Ed Sheeran");

        System.out.println("Playlist (Alphabetical Order)");
        library.inorder(library.root);
        
        System.out.println();
        System.out.println("Searching for Track ID 203");

        SongNode song = library.searchByTrackId(library.root, 203);

        if (song != null) 
        	System.out.println("Song Found : " + song.title + " by " + song.artist);
    	else 
            System.out.println("Song not found");
        
    }
}
