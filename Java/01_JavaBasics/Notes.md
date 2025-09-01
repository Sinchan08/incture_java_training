# Day 1 - Java Basics

**Date:** 14-07-2025

---

## ✅ Topics Covered:
- What is Java? Why it is platform independent
- JVM, JRE, JDK
- Variables & Data Types
- Static, Instance, Local variables
- Access Modifiers
- Type Casting: Implicit and Explicit
- Wrapper Classes

---

## 🧠 Key Concepts

### 🔹 Why Java is Platform Independent?
Java code is compiled into **bytecode** by the compiler, which runs on the **Java Virtual Machine (JVM)**. Since JVM exists for all platforms (Windows, Linux, Mac), the same bytecode can run anywhere.

### 🔹 JVM vs JRE vs JDK
- **JVM**: Java Virtual Machine — runs the bytecode.
- **JRE**: Java Runtime Environment — JVM + libraries to run Java apps.
- **JDK**: Java Development Kit — JRE + tools to develop Java (compiler, debugger).

### 🔹 Types of Variables
| Type     | Defined Where | Scope            |
|----------|---------------|------------------|
| Local    | Inside method | Only within method |
| Instance | Inside class  | Each object gets its own |
| Static   | Inside class  | Shared among all objects |

### 🔹 Access Modifiers
- `public`: Accessible everywhere
- `private`: Only within the class
- `protected`: Same package + subclasses
- *default* (no keyword): Only within the same package

### 🔹 Data Types in Java
| Type     | Example       |
|----------|---------------|
| int      | 5             |
| double   | 5.5           |
| boolean  | true / false  |
| char     | 'A'           |
| String   | "Hello" 
     |

### 🔹 Type Casting
- **Implicit (Widening)**: `int → long → float → double`
   >It is done automatically by complier
- **Explicit (Narrowing)**: `double → float → int` (needs cast)
   >It is done by developer and compiler wont

```java
int x = (int) 10.5; // Explicit casting

🔹 Wrapper Classes
Each primitive has a class:

int → Integer

double → Double

char → Character
Useful for using primitives in collections like ArrayList.

✍️ Summary
Today I learned how Java runs on any platform using JVM, the difference between JDK/JRE/JVM, and various types of variables and casting in Java. These are the building blocks for understanding Java programs and memory management.