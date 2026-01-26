package com.Day10.gamingapp;

public class AVLTree {
	  private PlayerNode root; 

	    private int height(PlayerNode n) {
	        return n == null ? 0 : n.height;
	    }

	    private int balance(PlayerNode n) {
	        return n == null ? 0 : height(n.left) - height(n.right);
	    }

	    private PlayerNode rightRotate(PlayerNode y) {
	        PlayerNode x = y.left;
	        PlayerNode t2 = x.right;

	        x.right = y;
	        y.left = t2;

	        y.height = Math.max(height(y.left), height(y.right)) + 1;
	        x.height = Math.max(height(x.left), height(x.right)) + 1;

	        return x;
	    }

	    private PlayerNode leftRotate(PlayerNode x) {
	        PlayerNode y = x.right;
	        PlayerNode t2 = y.left;

	        y.left = x;
	        x.right = t2;

	        x.height = Math.max(height(x.left), height(x.right)) + 1;
	        y.height = Math.max(height(y.left), height(y.right)) + 1;

	        return y;
	    }


	    public void insert(int id, String name, int score) {
	        root = insert(root, id, name, score);
	    }

	    private PlayerNode insert(PlayerNode node, int id, String name, int score) {
	        if (node == null)
	            return new PlayerNode(id, name, score);

	        if (score < node.score)
	            node.left = insert(node.left, id, name, score);
	        else
	            node.right = insert(node.right, id, name, score);

	        node.height = 1 + Math.max(height(node.left), height(node.right));
	        int bf = balance(node);

	        if (bf > 1 && score < node.left.score)
	            return rightRotate(node);

	        if (bf < -1 && score > node.right.score)
	            return leftRotate(node);

	        if (bf > 1 && score > node.left.score) {
	            node.left = leftRotate(node.left);
	            return rightRotate(node);
	        }

	        if (bf < -1 && score < node.right.score) {
	            node.right = rightRotate(node.right);
	            return leftRotate(node);
	        }

	        return node;
	    }

	    public void delete(int score) {
	        root = delete(root, score);
	    }

	    private PlayerNode delete(PlayerNode node, int score) {
	        if (node == null) return null;

	        if (score < node.score)
	            node.left = delete(node.left, score);
	        else if (score > node.score)
	            node.right = delete(node.right, score);
	        else {
	            if (node.left == null || node.right == null)
	                node = (node.left != null) ? node.left : node.right;
	            else {
	                PlayerNode temp = min(node.right);
	                node.score = temp.score;
	                node.name = temp.name;
	                node.playerId = temp.playerId;
	                node.right = delete(node.right, temp.score);
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

	    private PlayerNode min(PlayerNode n) {
	        while (n.left != null) n = n.left;
	        return n;
	    }

	    public void printTopPlayers() {
	        printTopPlayers(root, new int[]{0});
	    }

	    private void printTopPlayers(PlayerNode node, int[] count) {
	        if (node == null || count[0] == 10) return;

	        printTopPlayers(node.right, count);

	        if (count[0] < 10) {
	            System.out.println(node.name + " → " + node.score);
	            count[0]++;
	        }

	        printTopPlayers(node.left, count);
	    }
}
