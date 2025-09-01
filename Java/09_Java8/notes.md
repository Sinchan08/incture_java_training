📝 Day 9: Comparator, Comparable, Map, and Java 8 (Lambda Expressions)
23-7-2025
✅ 1. Comparable Interface (java.lang.Comparable)
Used for natural ordering of objects.

Implemented by the class whose objects are to be sorted.

Must override compareTo(Object o) method.

java
Copy
Edit
public class Student implements Comparable<Student> {
    int marks;
    public int compareTo(Student s) {
        return this.marks - s.marks;
    }
}
Returns:

0 → both objects are equal

< 0 → current object < passed object

> 0 → current object > passed object

✅ 2. Comparator Interface (java.util.Comparator)
Used for custom sorting logic.

Implemented externally, allowing multiple sorting sequences.

java
Copy
Edit
class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;
    }
}
🔄 Difference Between Comparable vs Comparator
Feature	Comparable	Comparator
Package	java.lang	java.util
Method	compareTo(Object o)	compare(Object o1, o2)
Sorting Logic	Inside the class	Outside the class
Flexibility	One way sorting only	Multiple ways possible

✅ 3. Map Interface (Key-Value Pair Structure)
Cannot contain duplicate keys.

Common Implementations:

HashMap (no order)

LinkedHashMap (insertion order)

TreeMap (sorted by key)

java
Copy
Edit
Map<String, Integer> map = new HashMap<>();
map.put("apple", 10);
map.put("banana", 20);
map.get("apple"); // 10
Important Methods:

put(K key, V value)

get(Object key)

containsKey(Object key)

entrySet(), keySet(), values()

☕️ Java 8 Features Intro
✅ 1. Lambda Expressions
Introduced in Java 8 to support functional programming.

Syntax: (arguments) -> expression/body

java
Copy
Edit
// Traditional
Runnable r1 = new Runnable() {
    public void run() {
        System.out.println("Hello");
    }
};

// Lambda
Runnable r2 = () -> System.out.println("Hello");
Example with Comparator:

java
Copy
Edit
List<String> list = Arrays.asList("banana", "apple", "cherry");
Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
✅ 2. Benefits of Lambda
Reduces boilerplate code

Used with functional interfaces (interfaces with only one abstract method)

🧠 Quick Recap
Use Comparable for natural sorting (e.g., by ID).

Use Comparator when you need multiple sorting logic (e.g., by name, age).

Map is a powerful key-value structure—learn HashMap, TreeMap.

Lambda Expressions simplify anonymous classes and are the foundation for Java 8 Stream API.