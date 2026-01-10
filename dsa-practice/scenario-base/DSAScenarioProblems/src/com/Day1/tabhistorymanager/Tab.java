package com.Day1.tabhistorymanager;

import java.util.Stack;

public class Tab {

    private Node head;
    private Node tail;
    private Node current;

    Stack<Node> closedTabs = new Stack<>();

    // Add website
    public void addWebsite(String s) {
        Node newNode = new Node(s);

        if (head == null) {
            head = tail = current = newNode;
            return;
        }

        current.setNextPage(newNode);
        newNode.setPreviousPage(current);
        current = newNode;
        tail = newNode;
    }

    // Forward navigation
    public void forward() {
        if (current != null && current.getNextPage() != null) {
            current = current.getNextPage();
            System.out.println("Forward to: " + current.getData());
        } else {
            System.out.println("No forward history");
        }
    }

    // Backward navigation
    public void backward() {
        if (current != null && current.getPreviousPage() != null) {
            current = current.getPreviousPage();
            System.out.println("Back to: " + current.getData());
        } else {
            System.out.println("No backward history");
        }
    }

    // Close tab
    public void closeTab() {
        if (current != null) {
            closedTabs.push(current);
            System.out.println("Tab closed: " + current.getData());
            current = current.getPreviousPage();
        }
    }

    // Restore last closed tab
    public void restoreTab() {
        if (!closedTabs.isEmpty()) {
            current = closedTabs.pop();
            System.out.println("Tab restored: " + current.getData());
        } else {
            System.out.println("No tab to restore");
        }
    }

    // Show full forward history
    public void showForwardHistory() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " -> ");
            temp = temp.getNextPage();
        }
        System.out.println("null");
    }
}
