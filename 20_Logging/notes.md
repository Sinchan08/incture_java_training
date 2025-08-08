# Java Logging & Logging Levels

## 1. Introduction to Logging
Logging is the process of recording information about a program's execution for:
- **Debugging** – Identify issues and fix bugs.
- **Monitoring** – Track application behavior in production.
- **Auditing** – Keep records for compliance or investigations.

### Why Logging is Important
- **Error Diagnosis**: Helps find root causes without replicating issues.
- **Performance Monitoring**: Track slow operations.
- **User Support**: Provide better customer service with detailed logs.
- **Security**: Record suspicious activities.
- **Replace print statements**: `System.out.println` is not suitable for production; logging frameworks offer more control.

---

## 2. Logging Frameworks in Java
Popular frameworks:
- **java.util.logging** (JUL) – Built into Java.
- **Log4j / Log4j2**
- **SLF4J** – Simple Logging Facade for Java (works with other frameworks underneath).

---

## 3. Logging Levels
Logging levels represent the severity/importance of the log message.

| Level   | Purpose |
|---------|---------|
| **SEVERE / ERROR** | Critical issues causing major failures. |
| **WARNING** | Potential problems that might cause errors later. |
| **INFO** | General information about program execution. |
| **CONFIG** | Configuration-related messages (mainly JUL). |
| **DEBUG / FINE** | Detailed information for debugging. |
| **TRACE / FINER / FINEST** | Very detailed logs, often for deep troubleshooting. |

**Order of Severity (Highest → Lowest):**
SEVERE (ERROR)
WARNING
INFO
CONFIG
DEBUG (FINE)
TRACE (FINER, FINEST)

pgsql
Copy code

---

## 4. Example (java.util.logging)
```java
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingExample {
    private static final Logger logger = Logger.getLogger(LoggingExample.class.getName());

    public static void main(String[] args) {
        logger.setLevel(Level.ALL); // Set minimum level to log

        logger.severe("This is a SEVERE message");
        logger.warning("This is a WARNING message");
        logger.info("This is an INFO message");
        logger.config("This is a CONFIG message");
        logger.fine("This is a FINE (debug) message");
        logger.finer("This is a FINER (trace) message");
        logger.finest("This is a FINEST (trace) message");
    }
}
5. Best Practices for Logging
Use the appropriate log level for each situation.

Avoid logging sensitive data (passwords, personal info).

Keep logs concise and meaningful.

Use parameterized logging instead of string concatenation for performance.

Rotate and archive logs to manage file size.

6. SLF4J Example
java
Copy code
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JExample {
    private static final Logger logger = LoggerFactory.getLogger(SLF4JExample.class);

    public static void main(String[] args) {
        logger.error("Error message");
        logger.warn("Warning message");
        logger.info("Info message");
        logger.debug("Debug message");
        logger.trace("Trace message");
    }
}
