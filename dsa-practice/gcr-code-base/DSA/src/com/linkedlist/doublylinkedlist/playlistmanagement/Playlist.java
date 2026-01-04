package com.linkedlist.doublylinkedlist.playlistmanagement;

public class Playlist {
	    private SongNode head;
	    private SongNode current;

	    // Add at beginning
	    public void addAtBeginning(String name, String artist, double duration) {
	        SongNode newNode = new SongNode(name, artist, duration);

	        if (head == null) {
	            head = current = newNode;
	        } else {
	            SongNode temp = head;
	            while (temp.next != head) {
	                temp = temp.next;
	            }
	            newNode.next = head;
	            temp.next = newNode;
	            head = newNode;
	        }
	        System.out.println("Song added at beginning.");
	    }

	    // Add at end
	    public void addAtEnd(String name, String artist, double duration) {
	        SongNode newNode = new SongNode(name, artist, duration);

	        if (head == null) {
	            head = current = newNode;
	        } else {
	            SongNode temp = head;
	            while (temp.next != head) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	            newNode.next = head;
	        }
	        System.out.println("Song added at end.");
	    }

	    // Add at specific position
	    public void addAtPosition(String name, String artist, double duration, int position) {
	        if (position <= 1 || head == null) {
	            addAtBeginning(name, artist, duration);
	            return;
	        }

	        SongNode newNode = new SongNode(name, artist, duration);
	        SongNode temp = head;
	        int count = 1;

	        while (count < position - 1 && temp.next != head) {
	            temp = temp.next;
	            count++;
	        }

	        newNode.next = temp.next;
	        temp.next = newNode;
	        System.out.println("Song added at position " + position);
	    }

	    // Delete by song name
	    public void deleteSong(String songName) {
	        if (head == null) {
	            System.out.println("Playlist is empty.");
	            return;
	        }

	        SongNode temp = head;
	        SongNode prev = null;

	        do {
	            if (temp.songName.equalsIgnoreCase(songName)) {
	                if (temp == head) {
	                    SongNode last = head;
	                    while (last.next != head) {
	                        last = last.next;
	                    }
	                    head = head.next;
	                    last.next = head;
	                } else {
	                    prev.next = temp.next;
	                }

	                if (current == temp) {
	                    current = temp.next;
	                }

	                System.out.println("Song deleted successfully.");
	                return;
	            }
	            prev = temp;
	            temp = temp.next;
	        } while (temp != head);

	        System.out.println("Song not found.");
	    }

	    // Play next song
	    public void playNext() {
	        if (current == null) {
	            System.out.println("Playlist is empty.");
	            return;
	        }
	        current = current.next;
	        System.out.println("Now Playing: " + current.songName + " by " + current.artist);
	    }

	    // Display playlist
	    public void displayPlaylist() {
	        if (head == null) {
	            System.out.println("Playlist is empty.");
	            return;
	        }

	        SongNode temp = head;
	        System.out.println("\n🎶 Playlist:");
	        do {
	            System.out.println("Song: " + temp.songName +
	                    ", Artist: " + temp.artist +
	                    ", Duration: " + temp.duration + " mins");
	            temp = temp.next;
	        } while (temp != head);
	    }

}
