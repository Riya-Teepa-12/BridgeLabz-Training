package com.linkedlist.singlylinkedlist.inventorysystem;

import com.linkedlist.singlylinkedlist.employeemanagement.EmployeeNode;

public class InventoryLinkedList {
	
	private InventoryNode head;
	
	//adding in the beginning
	 public void addAtBeginning(int itemid, String itemname, int quantity, double price) {
   	  InventoryNode newNode = new InventoryNode(itemid , itemname ,quantity,price);
   	    newNode.next =  head;
   	    head= newNode;
   	 }
	 
	 //adding in the end
	 public void addAtEnd(int itemid, String itemname, int quantity, double price) {
		 InventoryNode newNode = new InventoryNode(itemid , itemname ,quantity,price);
         if (head == null) {
             head = newNode;
             return;
         }

            InventoryNode temp = head;
            while (temp.next != null) {
             temp = temp.next;
         }
         temp.next = newNode;
     }
     
     public void addAtSpecificPosition(int position, int itemid, String itemname, int quantity, double price) {
    	 InventoryNode newNode = new InventoryNode(itemid , itemname ,quantity,price);

   	  if (position <= 1) {
             addAtBeginning(itemid,itemname,quantity,price);
             return;
         }
         InventoryNode temp = head;
         for (int i = 1; i < position - 1 && temp != null; i++) {
             temp = temp.next;
         }

         if (temp == null) {
             System.out.println("Invalid position");
             return;
         }

         newNode.next = temp.next;
         temp.next = newNode;
     }
     
     public void deleteNode(int itemid) {
   	  if (head == null) return;

         if (head.itemId == itemid) {
             head = head.next;
             return;
         }

         InventoryNode temp = head;
         while (temp.next != null && temp.next.itemId != itemid) {
             temp = temp.next;
         }

         if (temp.next == null) {
             System.out.println("Employee not found");
         } else {
             temp.next = temp.next.next;
             System.out.println("Employee deleted successfully.");
         }
   	     
     }
	 
     public void updateQuantity(int id, int newQty) {
         InventoryNode temp = head;
         while (temp != null) {
             if (temp.itemId == id) {
                 temp.quantity = newQty;
                 return;
             }
             temp = temp.next;
         }
         System.out.println("Item not found");
     }
    
     public void searchById(int id) {
         InventoryNode temp = head;
         while (temp != null) {
             if (temp.itemId == id) {
                 displayItem(temp);
                 return;
             }
             temp = temp.next;
         }
         System.out.println("Item not found");
     }

     public void searchByName(String name) {
         InventoryNode temp = head;
         boolean found = false;
         while (temp != null) {
             if (temp.itemName.equalsIgnoreCase(name)) {
                 displayItem(temp);
                 found = true;
             }
             temp = temp.next;
         }
         if (!found) System.out.println("Item not found");
     } 
     
     public double calculateTotalValue() {
         double total = 0;
         InventoryNode temp = head;
         while (temp != null) {
             total += temp.price * temp.quantity;
             temp = temp.next;
         }
         return total;
     }

    

     public void displayInventory() {
         if (head == null) {
             System.out.println("Inventory is empty");
             return;
         }
         InventoryNode temp = head;
         while (temp != null) {
             displayItem(temp);
             temp = temp.next;
         }
     }

     private void displayItem(InventoryNode item) {
         System.out.println(
                 "ID: " + item.itemId +
                 ", Name: " + item.itemName +
                 ", Qty: " + item.quantity +
                 ", Price: " + item.price
         );
     }

     public void sortByName(boolean ascending) {
         head = mergeSort(head, ascending, true);
     }

     public void sortByPrice(boolean ascending) {
         head = mergeSort(head, ascending, false);
     }

     private InventoryNode mergeSort(InventoryNode node, boolean asc, boolean byName) {
         if (node == null || node.next == null)
             return node;

         InventoryNode middle = getMiddle(node);
         InventoryNode nextOfMiddle = middle.next;
         middle.next = null;

         InventoryNode left = mergeSort(node, asc, byName);
         InventoryNode right = mergeSort(nextOfMiddle, asc, byName);

         return sortedMerge(left, right, asc, byName);
     }
     private InventoryNode sortedMerge(InventoryNode a, InventoryNode b, boolean asc, boolean byName) {
         if (a == null) return b;
         if (b == null) return a;

         boolean condition;
         if (byName) {
             condition = asc
                     ? a.itemName.compareToIgnoreCase(b.itemName) <= 0
                     : a.itemName.compareToIgnoreCase(b.itemName) > 0;
         } else {
             condition = asc ? a.price <= b.price : a.price > b.price;
         }

         InventoryNode result;
         if (condition) {
             result = a;
             result.next = sortedMerge(a.next, b, asc, byName);
         } else {
             result = b;
             result.next = sortedMerge(a, b.next, asc, byName);
         }
         return result;
     }
     private InventoryNode getMiddle(InventoryNode head) {
         if (head == null) return head;
         InventoryNode slow = head, fast = head.next;
         while (fast != null && fast.next != null) {
             slow = slow.next;
             fast = fast.next.next;
         }
         return slow;
     }
	 

}
