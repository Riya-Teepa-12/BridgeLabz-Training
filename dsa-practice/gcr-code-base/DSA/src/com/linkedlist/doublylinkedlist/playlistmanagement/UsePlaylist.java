package com.linkedlist.doublylinkedlist.playlistmanagement;
 
import java.util.Scanner;

public class UsePlaylist {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Playlist playlist = new Playlist();

	        while (true) {
	            System.out.println("\n--- Playlist Menu ---");
	            System.out.println("1. Add Song at Beginning");
	            System.out.println("2. Add Song at End");
	            System.out.println("3. Add Song at Position");
	            System.out.println("4. Delete Song");
	            System.out.println("5. Play Next Song");
	            System.out.println("6. Display Playlist");
	            System.out.println("7. Exit");
	            System.out.print("Enter choice: ");

	            int choice = sc.nextInt();
	            sc.nextLine(); // consume newline

	            switch (choice) {
	                case 1:
	                case 2:
	                case 3:
	                    System.out.print("Enter Song Name: ");
	                    String name = sc.nextLine();
	                    System.out.print("Enter Artist: ");
	                    String artist = sc.nextLine();
	                    System.out.print("Enter Duration (minutes): ");
	                    double duration = sc.nextDouble();

	                    if (choice == 1)
	                        playlist.addAtBeginning(name, artist, duration);
	                    else if (choice == 2)
	                        playlist.addAtEnd(name, artist, duration);
	                    else {
	                        System.out.print("Enter Position: ");
	                        int pos = sc.nextInt();
	                        playlist.addAtPosition(name, artist, duration, pos);
	                    }
	                    break;

	                case 4:
	                    System.out.print("Enter Song Name to Delete: ");
	                    playlist.deleteSong(sc.nextLine());
	                    break;

	                case 5:
	                    playlist.playNext();
	                    break;

	                case 6:
	                    playlist.displayPlaylist();
	                    break;

	                case 7:
	                    System.out.println("Exiting Playlist Manager...");
	                    sc.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice!");
	            }
	        }
	    }
}
