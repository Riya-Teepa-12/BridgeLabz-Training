package com.linkedlist.doublylinkedlist.undoredoFunctionality;

import java.util.Scanner;

public class TextState {
	 String content;
	    TextState prev;
	    TextState next;

	    TextState(String content) {
	        this.content = content;
	        this.prev = null;
	        this.next = null;
	    }
}
