 # 🚀 Java Training Notes-Day 8 (22-07-2025)
## 🧵 1. Deadlock

### 🔹 What is Deadlock?
- Deadlock is a situation where **two or more threads are blocked forever**, waiting for each other to release a lock.

### 🔹 Example:
```java
class A {
    synchronized void methodA(B b) {
        System.out.println("Thread A: locked A");
        try { Thread.sleep(100); } catch (Exception e) {}
        b.last();
    }

    synchronized void last() {
        System.out.println("Inside A.last()");
    }
}

class B {
    synchronized void methodB(A a) {
        System.out.println("Thread B: locked B");
        try { Thread.sleep(100); } catch (Exception e) {}
        a.last();
    }

    synchronized void last() {
        System.out.println("Inside B.last()");
    }
}

 2. Java Collections Framework (JCF)
🔹 Overview
JCF provides ready-to-use data structures and algorithms.

Includes interfaces like List, Set, Map, and classes like ArrayList, HashSet, etc.

3. List Interface and Its Implementations
🔸 List Interface
Ordered collection (can contain duplicates).

Allows index-based access.

🔹 Classes:
✅ ArrayList
Dynamic array.

Fast for reading, slow for insert/delete in the middle.

✅ LinkedList
Doubly-linked list.

Good for frequent insertions/deletions.

✅ Vector (Legacy Class)
Synchronized version of ArrayList.

✅ Stack
Subclass of Vector.

LIFO (Last In First Out).

📂 4. Set Interface and Its Implementations
🔸 Set Interface
No duplicates allowed.

✅ HashSet
Unordered, no duplicates.

Backed by a HashMap.

✅ LinkedHashSet
Maintains insertion order.

✅ TreeSet
Sorted set (natural order or custom using Comparator).

Implements NavigableSet and SortedSet.

🔁 5. Cursors in Java
🔹 Enumeration (Legacy)
Used to traverse legacy classes (like Vector, Stack).

🔹 Iterator
Universal cursor for all collections.

remove() supported.

🔹 ListIterator
Only for List.

Can traverse both directions.

Can add, remove, and update elements.

🌲 6. SortedSet and NavigableSet
✅ SortedSet
Extends Set to provide sorting.

Implemented by TreeSet.

✅ NavigableSet
Extends SortedSet for navigation operations (like lower(), higher(), ceiling()).

⚖️ 7. Comparable vs Comparator
🔸 Comparable (java.lang)
Natural ordering.

compareTo() method.

Class itself defines comparison.

java
Copy
Edit
public class Student implements Comparable<Student> {
    int marks;
    public int compareTo(Student s) {
        return this.marks - s.marks;
    }
}
🔸 Comparator (java.util)
Custom sorting logic.

compare() method.

java
Copy
Edit
Comparator<Student> byName = new Comparator<Student>() {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
};
✅ Summary
Avoid deadlocks using lock ordering or using tryLock.

Understand the difference between legacy and modern collections.

Use TreeSet for sorted data and HashSet for fast lookups.

Comparable for natural sorting, Comparator for custom sorting.

Enumeration, Iterator, and ListIterator help traverse collections with different capabilities.

