package com.Day10.ticketbooking;

public class AVLTree {
       
	private EventNode root;

    private int height(EventNode n) {
        return n == null ? 0 : n.height;
    }

    private int balance(EventNode n) {
        return n == null ? 0 : height(n.left) - height(n.right);
    }

    private EventNode rightRotate(EventNode y) {
        EventNode x = y.left;
        EventNode t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    private EventNode leftRotate(EventNode x) {
        EventNode y = x.right;
        EventNode t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public void addEvent(int time, String name) {
        root = insert(root, time, name);
    }

    private EventNode insert(EventNode node, int time, String name) {
        if (node == null)
            return new EventNode(time, name);

        if (time < node.startTime)
            node.left = insert(node.left, time, name);
        else
            node.right = insert(node.right, time, name);

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int bf = balance(node);

        if (bf > 1 && time < node.left.startTime)
            return rightRotate(node);

        if (bf < -1 && time > node.right.startTime)
            return leftRotate(node);

        if (bf > 1 && time > node.left.startTime) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (bf < -1 && time < node.right.startTime) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public void cancelEvent(int time) {
        root = delete(root, time);
    }

    private EventNode delete(EventNode node, int time) {
        if (node == null) return null;

        if (time < node.startTime)
            node.left = delete(node.left, time);
        else if (time > node.startTime)
            node.right = delete(node.right, time);
        else {
            if (node.left == null || node.right == null)
                node = (node.left != null) ? node.left : node.right;
            else {
                EventNode temp = min(node.right);
                node.startTime = temp.startTime;
                node.eventName = temp.eventName;
                node.right = delete(node.right, temp.startTime);
            }
        }

        if (node == null) return null;

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int bf = balance(node);

        if (bf > 1 && balance(node.left) >= 0)
            return rightRotate(node);

        if (bf > 1 && balance(node.left) < 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (bf < -1 && balance(node.right) <= 0)
            return leftRotate(node);

        if (bf < -1 && balance(node.right) > 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    private EventNode min(EventNode n) {
        while (n.left != null) n = n.left;
        return n;
    }

    public void showUpcomingEvents() {
        inorder(root);
    }

    private void inorder(EventNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.println(node.eventName + " at " + node.startTime);
        inorder(node.right);
    }
}
