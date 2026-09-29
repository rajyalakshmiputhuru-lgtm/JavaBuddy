# JavaBuddy - Interactive Java Learning & Coding CLI Platform

> An offline, menu-driven Java console application and interactive live web demo designed for students and beginners to learn core Java concepts, practice MCQs, master Data Structures & Algorithms, solve TCS-style placement coding challenges, and assess readiness with timed mock tests.

[![Live Demo](https://img.shields.io/badge/Live%20Demo-Open%20JavaBuddy-brightgreen?style=for-the-badge&logo=googlechrome&logoColor=white)](https://rajyalakshmiputhuru-lgtm.github.io/JavaBuddy/)
[![GitHub Repo](https://img.shields.io/badge/GitHub-Repository-blue?style=for-the-badge&logo=github)](https://github.com/rajyalakshmiputhuru-lgtm/JavaBuddy)

🌐 **Live Web Demo**: [https://rajyalakshmiputhuru-lgtm.github.io/JavaBuddy/](https://rajyalakshmiputhuru-lgtm.github.io/JavaBuddy/)  
*(Runs directly in your browser with zero installations, no command prompt, and no login required!)*

---

## 📌 Problem Statement

Computer Science students preparing for college campus placements and technical interviews often face fragmented resources:
- Theoretical tutorials are scattered and disconnected from active recall.
- Placement tests (like TCS NQT) emphasize fundamental algorithmic patterns, number manipulation, and quick problem-solving, which beginners struggle to practice in an organized manner.
- Many online platforms require constant high-speed internet connections, accounts, or complex framework installations, creating barriers for students wanting focused, distraction-free practice.

---

## 💡 Solution

**JavaBuddy** provides an all-in-one, zero-dependency, offline console-based environment implemented in core Java. It integrates structured theoretical refreshers, topic-wise MCQ practice with instant score tracking, interactive DSA problem runners, placement-focused coding challenges, and a full 20-question mock assessment into a single intuitive terminal interface.

---

## ✨ Features

- **📖 Learn Java**: Quick, concise reference guides and syntax examples covering 12 core Java topics.
- **📝 Practice Modules**: Topic-by-topic multiple-choice quizzes with immediate answer feedback and explanations.
- **⚡ Data Structures & Algorithms (DSA)**: Interactive implementations and visualizations across arrays, strings, searching, sorting, linked lists, stacks, queues, binary trees, and hashing.
- **🎯 TCS Coding Problems**: Real placement-oriented coding patterns including number manipulation, prime sequences, Armstrong numbers, GCD/LCM, and consecutive prime sums.
- **⏱️ Mock Test**: Comprehensive 20-question placement simulation test covering core concepts, OOPs, collections, and DSA.
- **📊 Real-time Progress Tracking**: Persistent session statistics tracking total questions attempted, correct answers, and accuracy percentage.
- **🛡️ Robust Input Handling**: Safe input scanner routines that prevent crashes from unexpected strings, invalid choices, or out-of-bounds indices.

---

## 🛠️ Technologies Used

| Category | Technology / Specification |
| :--- | :--- |
| **Language** | Java (Standard Edition) |
| **JDK Compatibility** | JDK 17 LTS (or higher) |
| **Architecture** | Object-Oriented Programming (OOP) & Procedural CLI |
| **Collections / Libraries** | `java.util.*` (`Scanner`, `Arrays`, `LinkedList`, `Stack`, `Queue`, `HashMap`) |
| **External Dependencies** | None (Zero external libraries / Pure Core Java) |
| **Version Control** | Git & GitHub |

---

## 🚀 How to Compile and Run

Ensure you have Java Development Kit (JDK 17 or higher) installed on your system.

### Prerequisites Check
```bash
javac -version
java -version
```

### Steps to Run

1. **Clone or Download the Repository**:
   ```bash
   git clone https://github.com/rajyalakshmiputhuru-lgtm/JavaBuddy.git
   cd JavaBuddy
   ```

2. **Compile the Application**:
   ```bash
   javac Main.java
   ```

3. **Run the Application**:
   ```bash
   java Main
   ```

---

## 📋 Main Menu Overview

When launched, JavaBuddy presents the following central dashboard:

```text
==========================================
              JAVABUDDY
       Learn Java. Practice. Code.
==========================================
1. Learn Java
2. Practice
3. DSA
4. TCS Coding Problems
5. Mock Test
6. My Progress
7. Exit
==========================================
```

---

## 📚 Detailed Modules

### 1. Learn Java
Concise study notes with code syntax for fast revision before interviews:
- Variables & Data Types
- Operators (Arithmetic, Relational, Logical, Assignment)
- Decision Making (If-Else)
- Control Flow & Loops (for, while, do-while)
- Arrays & Strings
- Methods & Modular Programming
- Object-Oriented Programming (Classes, Objects, Encapsulation, Inheritance, Polymorphism, Abstraction)
- Exception Handling (try, catch, finally, throw, throws)
- Java Collections Framework overview
- Recursion fundamentals

### 2. Practice (MCQ-Based Drills)
Interactive quizzes testing fundamental syntax and edge cases across:
1. Variables Practice
2. Operators Practice
3. If-Else Practice
4. Loops Practice
5. Arrays Practice
6. Strings Practice
7. OOP Practice
8. Collections Practice

Each question gives real-time feedback (Correct/Wrong), updates overall performance counters, and reveals the correct answer.

### 3. Data Structures & Algorithms (DSA)
Interactive demonstration and testing of fundamental algorithms:
- **Array Problems**: Array Sum, Maximum Element, Minimum Element, Array Reverse, Second Distinct Largest Element.
- **String Problems**: String Reverse, Palindrome Checker, Vowel Counter, Character Count, Anagram Validation.
- **Searching**: Linear Search, Binary Search (with pre-sorting and index lookup).
- **Sorting**: Bubble Sort algorithm trace, Built-in Java Dual-Pivot Quicksort (`Arrays.sort`).
- **Recursion**: Recursive Factorial calculation, Recursive Fibonacci sequence.
- **Linked List**: Dynamic singly linked list operations (Add, Remove first, Display).
- **Stack**: LIFO data structure operations (Push, Pop, Peek, Display).
- **Queue**: FIFO data structure operations (Enqueue, Dequeue, Peek, Display).
- **Trees**: Binary Tree traversal demonstrations (Preorder, Inorder, Postorder).
- **HashMap**: Frequency map generation for character occurrences in user input strings.

### 4. TCS Coding Practice
Curated selection of classic aptitude and technical round coding problems:
1. **Prime Number**: Efficient $O(\sqrt{N})$ prime validation.
2. **Palindrome Number**: Arithmetic digit reversal verification.
3. **Armstrong Number**: Dynamic digit count and narcissistic power sum calculation.
4. **Fibonacci Series**: First $N$ terms generation.
5. **Factorial**: Iterative calculation with validation for non-negative bounds.
6. **GCD & LCM**: Euclidean algorithm for greatest common divisor and least common multiple.
7. **Reverse Number**: Sign-preserving integer digit reversal.
8. **Sum of Digits**: Arithmetic modulo extraction and summation.
9. **Count Digits**: Iterative count of integer digits.
10. **Prime Numbers in Range**: Sieve-style range inspection between custom bounds.
11. **Frequency of Digits**: Frequency array counting occurrences of 0-9 in integer strings.
12. **Consecutive Prime Sum**: Verifies if a number can be partitioned into a sum of consecutive prime numbers starting from 2.

### 5. Mock Test
A comprehensive 20-question timed/untimed assessment containing questions across Java syntax, data structures, algorithm complexities, and OOP concepts. Evaluates placement readiness and delivers an aggregated score out of 20.

### 6. My Progress
Tracks user performance throughout the active CLI session:
- Total questions attempted across practice drills and mock tests.
- Total correct answers.
- Real-time accuracy percentage ($(\text{Correct} / \text{Attempted}) \times 100\%$).

---

## 🖥️ Sample Execution Walkthrough

```text
==========================================
              JAVABUDDY
       Learn Java. Practice. Code.
==========================================
1. Learn Java
2. Practice
3. DSA
4. TCS Coding Problems
5. Mock Test
6. My Progress
7. Exit
==========================================
Enter your choice: 2

========== PRACTICE ==========
1. Variables
2. Operators
3. If-Else
4. Loops
5. Arrays
6. Strings
7. OOP
8. Collections
9. Back
Choose: 1

Which keyword is used for integer?
1. int
2. integer
3. num
4. number
Your answer: 1
Correct!

Which data type stores decimal values?
1. int
2. double
3. char
4. boolean
Your answer: 2
Correct!

...
Score: 5/5

Enter your choice: 6

========== MY PROGRESS ==========
Questions Attempted : 5
Correct Answers     : 5
Accuracy            : 100.00%
```

---

## 📁 Project Structure

```text
JavaBuddy/
│
├── .gitignore          # Clean Git ignore file for Java artifacts
├── Main.java           # Complete standalone Java application source code
└── README.md           # Professional project documentation
```

---

## 🔮 Future Enhancements

- [ ] File-based persistence (saving user progress and test history to JSON/text files across sessions).
- [ ] Additional TCS / Infosys / Wipro placement coding patterns (Matrix operations, Bit manipulation).
- [ ] Custom test mode allowing users to set a timer limit per question.
- [ ] Modular packaging (`com.javabuddy.*`) if scaling beyond single-file simplicity.

---

## 👩‍💻 Author

**Rajya Lakshmi Puthuru**  
*B.Tech in Computer Science and Engineering (CSE)*  
GitHub: [@rajyalakshmiputhuru-lgtm](https://github.com/rajyalakshmiputhuru-lgtm)
