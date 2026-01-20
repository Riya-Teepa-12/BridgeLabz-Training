package com.collections.listinterface;

import java.util.*;

public class NElement{

    public static String findNthFromEnd(LinkedList<String> list, int n) {

        Iterator<String> fast = list.iterator();
        Iterator<String> slow = list.iterator();

        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (!fast.hasNext()) {
                return "N is larger than the list size";
            }
            fast.next();
        }

        // Move both pointers until fast reaches end
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        return slow.next();
    }

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int n = 2;
        System.out.println("Nth element from end: " + findNthFromEnd(list, n));
    }
}
