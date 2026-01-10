package com.Day1.tabhistorymanager;

public class Node {
    
	 private Node previousPage;
	 private String data;
	 private Node nextPage;
	 
	 public Node getPreviousPage() {
		return previousPage;
	}

	 public void setPreviousPage(Node previousPage) {
		 this.previousPage = previousPage;
	 }

	 public String getData() {
		 return data;
	 }

	 public void setData(String data) {
		 this.data = data;
	 }

	 public Node getNextPage() {
		 return nextPage;
	 }

	 public void setNextPage(Node nextPage) {
		 this.nextPage = nextPage;
	 }
    
	 public Node(String data) {
		this.previousPage = previousPage;
		this.data = data;
		this.nextPage = nextPage;
	 }
	 
	
	 
	 
	 
}
