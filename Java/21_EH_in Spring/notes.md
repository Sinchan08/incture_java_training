# Exception Handling in Spring Boot

## 1. What is Exception Handling?
Exception handling is the process of responding to the occurrence of exceptions (unexpected events or errors) during program execution, preventing application crashes and ensuring user-friendly error responses.

---

## 2. Why Exception Handling is Important in Spring Boot
- **Improves user experience**: Provides meaningful error messages instead of raw stack traces.
- **Centralizes error management**: Avoids repeating try-catch everywhere.
- **Ensures proper logging**: Helps in debugging and maintenance.
- **Maintains application stability**: Prevents crashes and allows graceful recovery.

---

## 3. Ways to Handle Exceptions in Spring Boot

### a) **Using `@ExceptionHandler`**
- Handles specific exceptions in a controller.
- Example:
```java
@RestController
public class MyController {

    @GetMapping("/test")
    public String test() {
        throw new RuntimeException("Something went wrong!");
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntimeException(RuntimeException ex) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Error: " + ex.getMessage());
    }
}
b) Using @ControllerAdvice
Global exception handler for all controllers.

Example:

java
Copy code
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleAllExceptions(Exception ex) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Global Error: " + ex.getMessage());
    }
}
c) Using ResponseStatusException
Throw exceptions with HTTP status codes directly.

Example:

java
Copy code
@GetMapping("/resource")
public String getResource() {
    throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found");
}
d) Custom Exception Classes
Create application-specific exceptions for better clarity.

Example:

java
Copy code
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
Use with @ExceptionHandler or @ControllerAdvice.

4. Common Annotations Used
@ExceptionHandler → Handles specific exceptions in a controller or globally.

@ControllerAdvice → Makes exception handling global.

@ResponseStatus → Maps an exception to an HTTP status code.

ResponseStatusException → Programmatically set HTTP status and message.

5. Best Practices
Use custom exceptions for clarity.

Avoid exposing internal details in error messages.

Log exceptions for debugging.

Return meaningful HTTP status codes (e.g., 404 Not Found, 400 Bad Request).

Centralize handling using @ControllerAdvice.