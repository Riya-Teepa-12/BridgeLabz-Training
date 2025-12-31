package com.objectmodelling.Level1;

public class UseLibrary {
   public static void main(String []args) {
	     Book b1 = new Book("Geeta","vedvyas");
	     Book b2 = new Book("Alone","Megan E. Freeman");
	      
	      Library lib = new Library();
	      lib.addBook(b1);
	      lib.addBook(b2);
	      lib.displayBook();
	     
   }
}
