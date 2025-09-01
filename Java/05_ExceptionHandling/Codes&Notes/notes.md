Day 5 – Java Exception Handling
18-7-2025

What is an Exception?
An exception is an unwanted or unexpected event that occurs during the execution of a program, disrupting its normal flow.

🧱 Exception Hierarchy in Java
                Throwable
                /       \
        Exception       Error
        /       \
  Checked     Unchecked (RuntimeException)


Throwable: Superclass of all errors and exceptions.

Exception: Indicates conditions that a program might want to catch.

Error: Serious problems that applications should not try to catch (e.g., OutOfMemoryError).

RuntimeException: Unchecked exceptions like NullPointerException, ArithmeticException.

📂 Types of Exceptions
| Type      | Examples                                  | Description             |
| --------- | ----------------------------------------- | ----------------------- |
| Checked   | IOException, SQLException                 | Handled at compile-time |
| Unchecked | ArithmeticException, NullPointerException | Handled at runtime      |

🧪 Common Runtime Exceptions
ArithmeticException – e.g., division by zero

NullPointerException – accessing methods/variables on a null object

ArrayIndexOutOfBoundsException

NumberFormatException

🛡️ Exception Handling Mechanisms
try-catch block
Used to catch exceptions and handle them gracefully.

java
Copy code
try {
    // Risky code
} catch (ExceptionType e) {
    // Exception handler
}
throws keyword
Declares that a method may throw an exception.

java
Copy code
public void readFile() throws IOException {
    // code that might throw IOException
}
throw keyword
Used to throw an exception manually.

java
Copy code
throw new IllegalArgumentException("Invalid input");


📄 Exception Object – Ways to Print Exception Details
java
Copy code
try {
    // risky code
} catch (Exception e) {
    System.out.println(e);           // 1. className: message
    System.out.println(e.getMessage()); // 2. message only
    e.printStackTrace();             // 3. full stack trace
}

🔄 finally block
Always executes whether exception occurs or not.

Used for clean-up activities like closing files, DB connections.

java
Copy code
try {
    // code
} catch (Exception e) {
    // handler
} finally {
    // always executes
}

🛠️ Custom (User-Defined) Exceptions
Create a class extending Exception or RuntimeException

Provide constructors

Use throw to throw it

java
Copy code
class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}

throw new MyException("Custom error occurred");

🧵 Summary
Exceptions help manage errors gracefully.

Use try-catch to catch and handle exceptions.

Use throws in method signature to declare exceptions.

Use throw to manually trigger exceptions.

finally block ensures important code always runs.