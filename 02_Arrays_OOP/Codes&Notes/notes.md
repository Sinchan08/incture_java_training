# Day 2 - Arrays and Introduction to OOP

**Date:** 15-07-2025

---

## ✅ Topics Covered:

- Arrays
  - Single Dimensional Arrays
  - For, While, Do-While Loops
- Introduction to OOPs
  - Class Structure
  - Methods
    - Parameterized Methods
    - Method Overloading
    - Method Overriding
  - Constructors
    - Constructor Overloading
    - Constructor Overriding
- 4 Pillars of OOP in Java
  - Inheritance *(just started today)*
  - Polymorphism *(to be continued)*
  - Encapsulation *(to be continued)*
  - Abstraction *(to be continued)*

---

## 📌 Notes Summary

## 🧠 Key Notes

### 🔸 Single Dimensional Array

```java
int[] numbers = new int[5];
numbers[0] = 10;
numbers[1] = 20;
// ...

// For Loop
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

// While Loop
int i = 0;
while (i < numbers.length) {
    System.out.println(numbers[i]);
    i++;
}

// Do-While Loop
int j = 0;
do {
    System.out.println(numbers[j]);
    j++;
} while (j < numbers.length);


🔸 Class & Object
class Student {
    String name;
    int age;

    void showInfo() {
        System.out.println(name + " is " + age + " years old.");
    }
}
🔸 Parameterized Method
 class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}

🔸 Method Overloading
class Printer {
    void print(String text) {
        System.out.println(text);
    }

    void print(int number) {
        System.out.println(number);
    }
}
🔸 Method Overriding (Inheritance)
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
🔸 Constructors
.overriding and overloading
class Car {
    String brand;

    // Default Constructor
    Car() {
        brand = "Honda";
    }

    // Parameterized Constructor
    Car(String brandName) {
        brand = brandName;
    }
}
📌 Summary
Today I learned about:

Handling data using arrays and loops

Writing modular and reusable code using methods

Core concepts of OOP like class, object, constructor

Differences between overloading and overriding

A brief intro to inheritance


