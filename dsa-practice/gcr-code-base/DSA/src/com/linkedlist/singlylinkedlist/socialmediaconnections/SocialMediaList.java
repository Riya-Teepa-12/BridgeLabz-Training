package com.linkedlist.singlylinkedlist.socialmediaconnections;

public class SocialMediaList {
	private UserNode head;

    // Add User
    public void addUser(int id, String name, int age) {
        UserNode newNode = new UserNode(new User(id, name, age));
        if (head == null) {
            head = newNode;
            return;
        }
        UserNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    // Find user by ID
    private User findUser(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.user.userId == id)
                return temp.user;
            temp = temp.next;
        }
        return null;
    }

    // Search user by name
    public void searchByName(String name) {
        UserNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.user.name.equalsIgnoreCase(name)) {
                displayUser(temp.user);
                found = true;
            }
            temp = temp.next;
        }
        if (!found)
            System.out.println("User not found.");
    }

    // Add friend connection
    public void addFriend(int id1, int id2) {
        User u1 = findUser(id1);
        User u2 = findUser(id2);

        if (u1 == null || u2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        if (!u1.friends.contains(id2))
            u1.friends.add(id2);
        if (!u2.friends.contains(id1))
            u2.friends.add(id1);

        System.out.println("Friend connection added.");
    }

    // Remove friend connection
    public void removeFriend(int id1, int id2) {
        User u1 = findUser(id1);
        User u2 = findUser(id2);

        if (u1 == null || u2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        u1.friends.remove(Integer.valueOf(id2));
        u2.friends.remove(Integer.valueOf(id1));
        System.out.println("Friend connection removed.");
    }

    // Display friends of a user
    public void displayFriends(int id) {
        User user = findUser(id);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Friends of " + user.name + ":");
        for (int fid : user.friends) {
            User friend = findUser(fid);
            if (friend != null)
                System.out.println("ID: " + friend.userId + ", Name: " + friend.name);
        }
    }

    // Mutual friends
    public void mutualFriends(int id1, int id2) {
        User u1 = findUser(id1);
        User u2 = findUser(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Mutual Friends:");
        for (int f : u1.friends) {
            if (u2.friends.contains(f)) {
                User mf = findUser(f);
                if (mf != null)
                    System.out.println(mf.name);
            }
        }
    }

    // Count friends
    public void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            System.out.println(temp.user.name + " has " + temp.user.friends.size() + " friends.");
            temp = temp.next;
        }
    }

    // Display user
    public void displayUser(User user) {
        System.out.println("ID: " + user.userId + ", Name: " + user.name + ", Age: " + user.age);
    }

}
