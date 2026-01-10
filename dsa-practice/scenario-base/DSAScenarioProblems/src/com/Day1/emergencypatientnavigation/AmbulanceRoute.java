package com.Day1.emergencypatientnavigation;

public class AmbulanceRoute {
	
	private UnitNode head;

    // Add a new hospital unit
    public void addUnit(String name, boolean available) {
        UnitNode newNode = new UnitNode(name, available);

        if (head == null) {
            head = newNode;
            newNode.next = head; // circular link
            return;
        }

        UnitNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    // Find nearest available unit
    public void findAvailableUnit() {
        if (head == null) {
            System.out.println("No units available.");
            return;
        }

        UnitNode temp = head;
        do {
            if (temp.available) {
                System.out.println("Patient redirected to: " + temp.unitName);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("All units are busy.");
    }

    // Remove unit under maintenance
    public void removeUnit(String unitName) {
        if (head == null) return;

        UnitNode curr = head;
        UnitNode prev = null;

        do {
            if (curr.unitName.equals(unitName)) {
                // Only one node
                if (curr == head && curr.next == head) {
                    head = null;
                }
                // Removing head
                else if (curr == head) {
                    UnitNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                }
                // Removing middle node
                else {
                    prev.next = curr.next;
                }
                System.out.println(unitName + " is removed (under maintenance).");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

}
