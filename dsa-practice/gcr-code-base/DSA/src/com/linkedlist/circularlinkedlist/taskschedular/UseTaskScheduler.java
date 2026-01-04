package com.linkedlist.circularlinkedlist.taskschedular;
 
import java.util.*;

public class UseTaskScheduler {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskScheduler scheduler = new TaskScheduler();

        while (true) {
            System.out.println("\n--- Task Scheduler Menu ---");
            System.out.println("1. Add Task at Beginning");
            System.out.println("2. Add Task at End");
            System.out.println("3. Add Task at Position");
            System.out.println("4. Remove Task by ID");
            System.out.println("5. View Current & Move to Next Task");
            System.out.println("6. Display All Tasks");
            System.out.println("7. Search Task by Priority");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Enter Task ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Task Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Priority: ");
                    int priority = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Due Date: ");
                    String dueDate = sc.nextLine();

                    if (choice == 1)
                        scheduler.addAtBeginning(id, name, priority, dueDate);
                    else if (choice == 2)
                        scheduler.addAtEnd(id, name, priority, dueDate);
                    else {
                        System.out.print("Enter Position: ");
                        int pos = sc.nextInt();
                        scheduler.addAtPosition(id, name, priority, dueDate, pos);
                    }
                    break;

                case 4:
                    System.out.print("Enter Task ID to Remove: ");
                    scheduler.removeTask(sc.nextInt());
                    break;

                case 5:
                    scheduler.viewNextTask();
                    break;

                case 6:
                    scheduler.displayAllTasks();
                    break;

                case 7:
                    System.out.print("Enter Priority to Search: ");
                    scheduler.searchByPriority(sc.nextInt());
                    break;

                case 8:
                    System.out.println("Exiting Task Scheduler...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

}
