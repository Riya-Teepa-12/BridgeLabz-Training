# 📅 Week 3 – Day 1  
## 📌 Topic: Linked Lists (Singly, Doubly & Circular)

This module focuses on understanding and implementing different types of **Linked Lists**, a core Data Structures concept.  
The objective is to strengthen traversal logic, pointer manipulation, and CRUD operations using real-world problem statements.

---

## 🔗 Linked List Types Covered

### 1️⃣ Singly Linked List
Each node contains:
- Data
- Reference to the next node

**Operations Implemented:**
- Add node at:
  - Beginning  
  - End  
  - Specific position  
- Delete node by ID  
- Search node by ID or Name  
- Update node data  
- Display all nodes  

**Use Case Examples:**
- Student Record Management  
- Inventory Management System  
- Employee Management System  

---

### 2️⃣ Doubly Linked List
Each node contains:
- Data
- Reference to the previous node
- Reference to the next node

**Operations Implemented:**
- Add node at beginning, end, or specific position  
- Remove node by unique ID  
- Search by title or author  
- Update availability/status  
- Display list:
  - Forward traversal  
  - Backward traversal  

**Use Case Example:**
- Library Management System  

---

### 3️⃣ Circular Linked List
The last node points back to the first node instead of `null`.

**Operations Implemented:**
- Add node at the end  
- Remove node by unique ID  
- Search by customer name or category  
- Display all nodes in circular manner  

**Use Case Example:**
- Online Ticket Reservation System  

---

## 🎯 Learning Outcomes
- Understand differences between Singly, Doubly, and Circular Linked Lists  
- Implement efficient traversal and deletion logic  
- Handle edge cases (empty list, single node, head/tail deletion)  
- Apply linked list concepts to real-world problems  
- Improve problem-solving and pointer manipulation skills  

---

## 🛠️ Tech Stack
- **Language:** Java  
- **IDE:**  Eclipse  
- **Input Handling:** Scanner (No hard-coded values)  

**Code Link**
[LinkedList](https://github.com/Riya-Teepa-12/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-code-base/DSA/src/com/linkedlist)


**🗓️ Day 2: Stack, Queue, HashMap & Hashing Function**
🔹 Topics Covered

-Stack

-Queue

-HashMap

-Hashing Function

**📌 1. Stack**

A Stack is a linear data structure that works on the LIFO (Last In, First Out) principle. The element inserted last is removed first. All operations happen from one end called the top.

✔ Key Operations

-Push – Insert an element at the top

-Pop – Remove the top element

-Peek / Top – View the top element without removing it

-isEmpty – Check whether the stack is empty

✔ Applications

Function call management (Call Stack)

-Undo / Redo functionality

-Expression evaluation and parenthesis checking

**📌 2. Queue**

A Queue is a linear data structure that follows the FIFO (First In, First Out) principle. The element inserted first is removed first. Insertion happens at the rear, and deletion happens from the front.

✔ Key Operations

-Enqueue – Insert an element at the rear

-Dequeue – Remove an element from the front

-Peek / Front – View the front element

-isEmpty – Check whether the queue is empty

✔ Types of Queues

-Simple Queue

-Circular Queue

-Priority Queue

-Deque (Double Ended Queue)

✔ Applications

-CPU scheduling

-Task and request handling

-Printer queue

-Breadth First Search (BFS)

**📌 3. HashMap**

A HashMap is a data structure that stores data in key-value pairs. It uses a hashing technique to provide fast access to values based on keys.

✔ Features

-Average time complexity of O(1) for insert, delete, and search

-Keys are unique

-Values can be duplicated

✔ Common Operations

-put(key, value) – Insert a key-value pair

-get(key) – Retrieve value using key

-remove(key) – Delete a key-value pair

-containsKey(key) – Check if a key exists

**📌 4. Hashing Function**

A Hashing Function converts a given key into an index of a hash table where the corresponding value is stored.

✔ Characteristics of a Good Hash Function

-Uniform distribution of keys

-Minimizes collisions

-Fast computation

**🎯 Learning Outcome**

-Clear understanding of Stack and Queue operations

-Learned how HashMap works internally using hashing

-Understood the role of hashing functions and collision handling

**🚀 Next Steps**

Practice implementation-based and problem-solving questions using Stack, Queue, and HashMap to strengthen DSA fundamentals.

**Code Link**
[Stack , Queue and HashMap](https://github.com/Riya-Teepa-12/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-code-base/DSA/src/com)

# Day 3 – Submission of Sorting Algorithms

## 📌 Overview

This submission focuses on understanding and implementing fundamental **sorting algorithms**. Sorting is a core concept in data structures and algorithms, widely used to organize data efficiently for searching, processing, and analysis.

The following sorting techniques are covered:

* Bubble Sort
* Insertion Sort
* Merge Sort
* Quick Sort

---

## 🔹 1. Bubble Sort

**Concept:**
Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order. With each pass, the largest element “bubbles up” to its correct position.

**Key Points:**

* Simple and easy to understand
* Not efficient for large datasets
* Stable sorting algorithm

**Time Complexity:**

* Best Case: O(n)
* Average Case: O(n²)
* Worst Case: O(n²)

---

## 🔹 2. Insertion Sort

**Concept:**
Insertion Sort builds the sorted array one element at a time by inserting each element into its correct position among previously sorted elements.

**Key Points:**

* Efficient for small or nearly sorted datasets
* Stable sorting algorithm
* Used in real-world scenarios like card sorting

**Time Complexity:**

* Best Case: O(n)
* Average Case: O(n²)
* Worst Case: O(n²)

---

## 🔹 3. Merge Sort

**Concept:**
Merge Sort follows the **divide and conquer** approach. It divides the array into smaller subarrays, sorts them recursively, and then merges them back together.

**Key Points:**

* Very efficient for large datasets
* Requires extra memory
* Stable sorting algorithm

**Time Complexity:**

* Best Case: O(n log n)
* Average Case: O(n log n)
* Worst Case: O(n log n)

---

## 🔹 4. Quick Sort

**Concept:**
Quick Sort selects a **pivot element**, partitions the array around the pivot, and recursively sorts the subarrays.

**Key Points:**

* Very fast in practice
* Not stable by default
* Performance depends on pivot selection

**Time Complexity:**

* Best Case: O(n log n)
* Average Case: O(n log n)
* Worst Case: O(n²)

---

## 🎯 Learning Outcomes

* Understood different sorting techniques
* Compared time and space complexities
* Learned when to use which sorting algorithm
* Strengthened problem-solving and algorithmic thinking

---

## ✅ Conclusion

Sorting algorithms are essential for efficient data handling. While simple algorithms like Bubble and Insertion Sort help build foundational understanding, advanced algorithms like Merge Sort and Quick Sort are preferred for real-world applications.

**Code Link**
[Sorting](https://github.com/Riya-Teepa-12/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-code-base/DSA/src/com/sorting)

---




