package com.linkedlist.singlylinkedlist.socialmediaconnections;

import java.util.*;

public class User {
	int userId;
    String name;
    int age;
    List<Integer> friends;

    User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
    }

}
