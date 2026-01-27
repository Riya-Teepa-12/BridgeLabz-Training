# 💻 BridgeLabz-Training  
## 🗓 Week 4 : Collections Framework in Java  

---

## 📘 Section A : Training Learning Progress  

### 🗓 Day 22 – Java Generics Fundamentals  
**📅 Date:** 16-Jan-2026  

#### 🔧 Project Setup
Revised and structured the `java-collections-practice` branch.
```
BridgeLabz-Training/
│── java-collections-practice/
│ │── gcr-codebase/
│ | └── CollectionsConcepts/
│ | └── src/
│ | └── com/
│ | │── generics/
│ | │── listinterface/
│ | │── setinterface/
│ | │── queueinterface/
│ | │── mapinterface/
│ | │── examples/
│ | └── streams/
│ | └── exceptionhandling/
│ | └── annotations/
│ | └── reflection/
│ |
│ │── leet-code-codebase/
│ └── scenario-based-codebase/
└── README.md
```

#### 📚 Learning Highlights
- Learned Java Generics for type-safe and reusable collection handling  
- Understood **Type Parameters** (`T`, `E`, `K`, `V`) and their role in APIs  
- Implemented **Generic Classes** and **Generic Methods**  
- Used **Bounded Types** (`extends`, `super`) to restrict and control types  
- Applied **Wildcards** (`?`, `? extends`, `? super`) for flexible collections  
- Followed generics best practices:
  - No raw types  
  - Safe bounds  
  - Readable design  

🔗 **Code Link:**  
👉 [Generics ](https://github.com/Riya-Teepa-12/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-code-base/JavaCollectionsProblem/src/com/collectionsGenerics) 

---

### 🗓 Day 23 – Java Collections Framework (List, Set, Queue & Map)  
**📅 Date:** 17-Jan-2026  

#### 📘 Concepts Covered
- Studied Java Collections Framework architecture and hierarchy  
- Understood the role of **Collection** and **Map** interfaces  

#### 📋 List Interface
**Implementations:**
- ArrayList  
- LinkedList  
- Vector  

**Operations Practiced:**
- Add, remove, update, search  
- Iteration using:
  - for-each loop  
  - Iterator  
  - ListIterator  

#### 🔁 Set Interface
**Implementations:**
- HashSet  
- LinkedHashSet  
- TreeSet  

**Key Learnings:**
- Uniqueness  
- Ordering  
- Sorting behavior  

#### 🗺 Map Interface
**Implementations:**
- HashMap  
- LinkedHashMap  
- TreeMap  

**Operations Practiced:**
- Insertion  
- Deletion  
- Retrieval  
- Iteration using:
  - `entrySet()`  
  - `keySet()`  
  - `values()`  

#### 📬 Queue Interface
**Implementations:**
- PriorityQueue  
- ArrayDeque  

**Operations:**
- Enqueue  
- Dequeue  
- Peek  
- Poll  

**Concepts:**
- FIFO behavior  
- Priority-based processing  

- Understood internal working, use cases, and performance considerations  
- Practiced real-time examples  
- Committed and pushed all work  

🔗 **Code Link:**  
👉[ List, Set, Queue & Map ] (https://github.com/Riya-Teepa-12/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-code-base/JavaCollectionsProblem/src/com/collections)

---

### 🗓 Day 24 – Java I/O Streams  
**📅 Date:** 19-Jan-2026  

#### 📘 Topics Covered
- Java I/O Streams architecture  
- Stream-based data handling  

#### 📂 Streams Implemented
**Byte Streams & Character Streams:**
- FileInputStream / FileOutputStream  
- FileReader / FileWriter  

**Buffered Streams:**
- BufferedInputStream / BufferedOutputStream  
- BufferedReader / BufferedWriter  

**Object Streams:**
- ObjectInputStream  
- ObjectOutputStream  
- Serialization & Deserialization  

**In-Memory Streams:**
- ByteArrayInputStream  
- ByteArrayOutputStream  

**Bridge Streams:**
- InputStreamReader  
- OutputStreamWriter  

#### 🧠 Best Practices
- try-with-resources  
- Buffering for performance  
- Efficient large-file handling  

- Solved practical problems:
  - File copy  
  - Serialization  
  - Large-file reading  
- Committed and pushed all work  

🔗 **Code Link:**  
👉[ Java I/O Streams]  (https://github.com/Riya-Teepa-12/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-code-base/JavaCollectionsProblem/src/com/streams)

---

### 🗓 Day 25 – Exception Handling  
**📅 Date:** 20-Jan-2026  

#### 📘 Concepts Covered
- Java exception hierarchy  
- Checked vs unchecked exceptions  

#### 🧪 Implementations
- try, catch, finally  
- Multiple catch blocks  
- Nested try-catch  
- throw and throws  
- Custom exceptions for business rules  
- try-with-resources for resource management  

- Solved scenario-based problems  
- Committed and pushed all work  

🔗 **Code Link:**  
👉 [Exception Handling] (https://github.com/Riya-Teepa-12/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-code-base/JavaCollectionsProblem/src/com/exceptionalhandling)  

---

### 🗓 Day 26 – Regex & JUnit Testing  
**📅 Date:** 21-Jan-2026  

#### 🔍 Regular Expressions
- Studied `java.util.regex` API  
- Used Pattern and Matcher classes  
- Practiced metacharacters and quantifiers  

**Validations Implemented:**
- Email addresses  
- Password strength  
- Phone numbers  

**Regex Operations:**
- `find()`  
- `matches()`  
- `replaceAll()`  

**Data Extraction:**
- Dates  
- Hashtags  
- Domain names  

#### 🧪 JUnit Testing
- Learned testing lifecycle  
- Used JUnit 5 annotations:
  - `@Test`  
  - `@BeforeEach`, `@AfterEach`  
  - `@BeforeAll`, `@AfterAll`  

**Advanced Testing:**
- Parameterized tests  
- Repeated tests  
- Exception testing using `assertThrows`  

**Assertions Used:**
- `assertEquals`  
- `assertTrue`  
- `assertAll`  

- Followed **Arrange–Act–Assert (AAA)** pattern  
- Automated test execution  
- Committed and pushed all work  

🔗 **Code Links:**  
👉 [Regex] (https://github.com/Riya-Teepa-12/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-code-base/JavaCollectionsProblem/src/com/regex) 
👉 [JUnit Testing] (https://github.com/Riya-Teepa-12/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-code-base/JavaCollectionsProblem/src/com/junit)

---

### 🗓 Day 27 – Annotations & Reflection  
**📅 Date:** 22-Jan-2026  

#### 🏷 Annotations
- Used standard annotations:
  - `@Override`  
  - `@Deprecated`  
  - `@SuppressWarnings`  

- Created custom annotations with attributes and defaults  
- Built repeatable annotations using `@Repeatable`  
- Retrieved annotation metadata using Reflection  

**Use Cases Implemented:**
- Field & method validation  
- Role-based access control  
- Annotation-driven utilities:
  - JSON mapping  
  - Caching mechanisms  

#### 🔎 Reflection
- Inspected classes, fields, methods, constructors  
- Dynamic object creation  
- Method invocation  
- Accessed private and static members  

**Advanced Implementations:**
- Execution-time logging  
- JSON generation  
- Dependency injection simulation  

- Solved scenario-based problems  
- Committed work  

🔗 **Code Links:**  
👉 [Annotations] (https://github.com/Riya-Teepa-12/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-code-base/JavaCollectionsProblem/src/com/annotation)
👉 [Reflection] (https://github.com/Riya-Teepa-12/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-code-base/JavaCollectionsProblem/src/com/reflection) 

---

## 🧩 Section B : Scenario-Based Problems Progress  


---

## 🧮 Section C : LeetCode-based Problems Progress  


