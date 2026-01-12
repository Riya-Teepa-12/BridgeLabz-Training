package com.Day2.texteditor;

public class UseTextEditor {
    
	 public static void main(String[] args) {

	        TextEditor editor = new TextEditor();

	        editor.insert("jai ");
	        editor.insert("Shree Ram");
	        editor.showContent();

	        editor.delete(5);
	        editor.showContent();

	        editor.undo();
	        editor.showContent();

	        editor.redo();
	        editor.showContent();
	    }
}
