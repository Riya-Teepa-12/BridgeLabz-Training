package com.Day1.tabhistorymanager;

import java.util.*;
public class UseBrowser {
		  public static void main(String[] args) {
			  
			   Tab tab = new Tab();

		        // Open websites
		        tab.addWebsite("google.com");
		        tab.addWebsite("youtube.com");
		        tab.addWebsite("github.com");
		        tab.addWebsite("stackoverflow.com");

		        System.out.println("Full browsing history:");
		        tab.showForwardHistory();

		        // Navigate back
		        tab.backward();
		        tab.backward();

		        // Navigate forward
		        tab.forward();

		        // Close current tab
		        tab.closeTab();

		        // Restore last closed tab
		        tab.restoreTab();

		        // Final history
		        System.out.println("\nFinal browsing history:");
		        tab.showForwardHistory();
		    }
			  
  }

