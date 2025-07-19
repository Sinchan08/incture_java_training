Day 6: Java Multithreading
19-7-2025

1. Introduction to Multitasking

Multitasking is the process of executing multiple tasks simultaneously.

Two types:

Process-based Multitasking: Each task is a separate process (e.g., opening browser + playing music).

Thread-based Multitasking: Each task is a separate thread within a process (e.g., multiple tabs running in a browser).

2. Thread in Java

Java supports thread-based multitasking using:

Thread class (by extending it)

Runnable interface (by implementing it)

✅ Creating Thread - Two Ways

(a) Extending Thread Class:
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}
(b) Implementing Runnable Interface:
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable thread is running...");
    }
}
3. start() vs run()

start() method:

Allocates new call stack and invokes run() internally.

Starts new thread.

run() method:

Executes in current thread (no new thread created).

4. Thread Lifecycle (States)

New: Thread is created.

Runnable: After start() is called.

Running: The thread scheduler picks it to run.

Blocked/Waiting: Thread is waiting for some resource or action.

Terminated: Thread completes execution or is stopped.

5. Thread Priority

Thread class has 3 constants:

Thread.MIN_PRIORITY = 1

Thread.NORM_PR``IORITY = 5 (default)

Thread.MAX_PRIORITY = 10

Set using setPriority(int) and get using getPriority().

Scheduler may prefer high-priority threads (but not guaranteed).

6. Thread Methods

✅ yield()

Static method.

Causes current thread to pause and give chance to equal priority threads.

✅ sleep(ms)

Causes thread to sleep for given milliseconds.

Throws InterruptedException.

✅ join()

Waits for another thread to finish before continuing execution.

thread1.join(); // Waits for thread1 to finish

🔁 Summary

Concept

Purpose

Thread

Allows multitasking in Java

start()

Starts a new thread

run()

Contains thread logic

sleep()

Pauses thread temporarily

yield()

Gives up CPU to other threads

join()

Waits for thread to finish

Priority

Influences thread scheduling