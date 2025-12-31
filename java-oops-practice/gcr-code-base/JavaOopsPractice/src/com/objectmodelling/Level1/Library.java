package com.objectmodelling.Level1;
import java.util.*;
public class Library {

	   private List<Book> list =  new ArrayList<>();
	   public void addBook(Book bk){
	      list.add(bk);
	   }
	   
	   public void displayBook() {
		   for(int i=0;i<list.size();i++) {
			   Book b = list.get(i);
			   System.out.println("Title :"+b.getTitle());
			   System.out.println("Author :"+b.getAuthor());
			   System.out.println("------------");
			   
		   }
	   }

}
