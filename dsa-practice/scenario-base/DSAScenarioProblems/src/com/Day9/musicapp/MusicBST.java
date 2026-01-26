package com.Day9.musicapp;

public class MusicBST {
     
	 SongNode root;

	    public SongNode insert(SongNode root, int trackId, String title, String artist) {
	        if (root == null) {
	            return new SongNode(trackId, title, artist);
	        }

	        if (title.compareToIgnoreCase(root.title) < 0) {
	            root.left = insert(root.left, trackId, title, artist);
	        } else if (title.compareToIgnoreCase(root.title) > 0) {
	            root.right = insert(root.right, trackId, title, artist);
	        }

	        return root;
	    }

	    public SongNode searchByTrackId(SongNode root, int trackId) {
	        if (root == null) {
	            return null;
	        }

	        if (root.trackId == trackId) {
	            return root;
	        }

	        SongNode leftResult = searchByTrackId(root.left, trackId);
	        if (leftResult != null) {
	            return leftResult;
	        }

	        return searchByTrackId(root.right, trackId);
	    }

	    public void inorder(SongNode root) {
	        if (root != null) {
	            inorder(root.left);
	            System.out.println("Title : " + root.title + " , Artist : " + root.artist + " , Track ID : " + root.trackId);
	            inorder(root.right);
	        }
	    }
}
