#  Java Training Notes - Day 7 (21-07-2025)

## 📌 Topics Covered
- Synchronization in Java
- Purpose of Synchronization
- Inter-thread Communication
  - wait()
  - notify()
  - notifyAll()

---

## 🔐 1. Synchronization

### 🔸 What is Synchronization?
- Synchronization is the process of controlling access to shared resources by multiple threads.
- It ensures that only **one thread at a time** can execute a **critical section** (shared resource).

### 🔸 Why Synchronization is Needed?
- To avoid **race conditions**, **data inconsistency**, and **thread interference**.
- Especially important when **multiple threads** access the same object.

### 🔸 Synchronized Method
```java
synchronized void wish(String name) {
    for (int i = 0; i < 5; i++) {
        System.out.print("Good Morning: ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
        System.out.println(name);
    }
}
The synchronized keyword ensures only one thread at a time can call wish() on the same object.

🔸 Synchronized Block
java
Copy
Edit
void display() {
    synchronized (this) {
        // Critical section
    }
}
Useful when you want to synchronize only part of the code, not the whole method.

🔁 2. Inter-thread Communication
📘 Purpose:
Used to avoid polling.

Helps threads communicate with each other using shared resources.

⚙️ Key Methods from Object class:
Method	Description
wait()	Causes current thread to wait until another thread calls notify() or notifyAll() on the same object
notify()	Wakes up one thread that is waiting on the object's monitor
notifyAll()	Wakes up all the threads that are waiting on the object's monitor

✅ Points to Remember:
These methods must be called from a synchronized context.

wait() releases the lock and enters waiting state.

notify() does not release the lock immediately. The notified thread must wait until the current thread exits the synchronized block.

🔄 Example:
java
Copy
Edit
class Shared {
    synchronized void produce() {
        System.out.println("Producing...");
        try {
            wait();
        } catch (InterruptedException e) {}
        System.out.println("Resumed producing after notification.");
    }

    synchronized void consume() {
        System.out.println("Consuming...");
        notify();
    }
}
💡 Summary
Use synchronization to ensure thread-safe operations.

Use wait/notify for efficient thread communication.

Avoid using busy-wait loops. Use inter-thread communication instead.