package com.linkedlist.circularlinkedlist.roundrobinalgorithm;

public class RoundRobinScheduler {
	private ProcessNode head;
    private int timeQuantum;
    private int totalProcesses = 0;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    // Add process at end
    public void addProcess(int pid, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(pid, burstTime, priority);

        if (head == null) {
            head = newNode;
        } else {
            ProcessNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        totalProcesses++;
        System.out.println("Process added successfully.");
    }

    // Execute Round Robin Scheduling
    public void execute() {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int currentTime = 0;
        ProcessNode current = head;

        System.out.println("\n--- Round Robin Scheduling Start ---");

        while (head != null) {
            if (current.remainingTime > 0) {
                int execTime = Math.min(timeQuantum, current.remainingTime);
                current.remainingTime -= execTime;
                currentTime += execTime;

                System.out.println("Process " + current.pid +
                        " executed for " + execTime + " units.");

                // Update waiting time for others
                updateWaitingTime(current, execTime);

                if (current.remainingTime == 0) {
                    current.turnaroundTime = currentTime;
                    removeProcess(current.pid);
                    current = head;
                } else {
                    current = current.next;
                }
                displayQueue();
            }
        }

        calculateAverages();
    }

    // Update waiting time
    private void updateWaitingTime(ProcessNode executed, int time) {
        if (head == null) return;

        ProcessNode temp = head;
        do {
            if (temp != executed && temp.remainingTime > 0) {
                temp.waitingTime += time;
            }
            temp = temp.next;
        } while (temp != head);
    }

    // Remove process by PID
    private void removeProcess(int pid) {
        if (head == null) return;

        ProcessNode temp = head;
        ProcessNode prev = null;

        do {
            if (temp.pid == pid) {
                if (temp == head && temp.next == head) {
                    head = null;
                } else if (temp == head) {
                    ProcessNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = temp.next;
                }
                System.out.println("Process " + pid + " completed.");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    // Display current queue
    private void displayQueue() {
        if (head == null) {
            System.out.println("Queue is empty.\n");
            return;
        }

        ProcessNode temp = head;
        System.out.print("Current Queue: ");
        do {
            System.out.print("[P" + temp.pid +
                    " RT=" + temp.remainingTime + "] ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("\n");
    }

    // Calculate averages
    private void calculateAverages() {
        double totalWT = 0, totalTAT = 0;

        System.out.println("\n--- Final Process Statistics ---");
        for (ProcessNode p : completedProcesses) {
            totalWT += p.waitingTime;
            totalTAT += p.turnaroundTime;

            System.out.println("Process " + p.pid +
                    " | Waiting Time: " + p.waitingTime +
                    " | Turnaround Time: " + p.turnaroundTime);
        }

        System.out.println("\nAverage Waiting Time: " + (totalWT / completedProcesses.size()));
        System.out.println("Average Turnaround Time: " + (totalTAT / completedProcesses.size()));
    }

    // Store completed processes
    private java.util.List<ProcessNode> completedProcesses = new java.util.ArrayList<>();

    private void removeProcess(ProcessNode p) {
        completedProcesses.add(p);
        removeProcess(p.pid);
    }
}

