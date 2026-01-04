package com.linkedlist.singlylinkedlist.socialmediaconnections;

import java.util.Scanner;

public class UseSocialMediaApp {
	  public static void main(String[] args) {
		   //create scanner object to take input from the user
	        Scanner sc = new Scanner(System.in);
	        
	        //creating object of socialmedialist
	        SocialMediaList list = new SocialMediaList();

	        while (true) {
	            System.out.println("\n1.Add User\n2.Add Friend\n3.Remove Friend\n4.Display Friends");
	            System.out.println("5.Mutual Friends\n6.Search User by Name\n7.Count Friends\n8.Exit");
	            System.out.print("Choose option: ");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("User ID: ");
	                    int id = sc.nextInt();
	                    sc.nextLine();
	                    System.out.print("Name: ");
	                    String name = sc.nextLine();
	                    System.out.print("Age: ");
	                    int age = sc.nextInt();
	                    list.addUser(id, name, age);
	                    break;

	                case 2:
	                    System.out.print("User1 ID: ");
	                    int u1 = sc.nextInt();
	                    System.out.print("User2 ID: ");
	                    int u2 = sc.nextInt();
	                    list.addFriend(u1, u2);
	                    break;

	                case 3:
	                    System.out.print("User1 ID: ");
	                    u1 = sc.nextInt();
	                    System.out.print("User2 ID: ");
	                    u2 = sc.nextInt();
	                    list.removeFriend(u1, u2);
	                    break;

	                case 4:
	                    System.out.print("User ID: ");
	                    id = sc.nextInt();
	                    list.displayFriends(id);
	                    break;

	                case 5:
	                    System.out.print("User1 ID: ");
	                    u1 = sc.nextInt();
	                    System.out.print("User2 ID: ");
	                    u2 = sc.nextInt();
	                    list.mutualFriends(u1, u2);
	                    break;

	                case 6:
	                    sc.nextLine();
	                    System.out.print("Enter name: ");
	                    name = sc.nextLine();
	                    list.searchByName(name);
	                    break;

	                case 7:
	                    list.countFriends();
	                    break;

	                case 8:
	                    System.exit(0);
	            }
	        }
	    }

}
