# 📘 Java Testing with JUnit & Mockito

JUnit is a unit testing framework for Java.

### 📌 Basic Annotations
| Annotation         | Description                             |
|--------------------|------------------------------------------|
| @Test              | Marks a test method                      |
| @BeforeEach        | Runs before each test                    |
| @AfterEach         | Runs after each test                     |
| @BeforeAll         | Runs once before all tests (static)      |
| @AfterAll          | Runs once after all tests (static)       |
| @Disabled          | Skips the test                           |
| @DisplayName       | Custom test name                         |

### 🧪 Example
```java
import org.junit.jupiter.api.*;

public class CalculatorTest {

    Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    void testAdd() {
        Assertions.assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testSubtract() {
        Assertions.assertEquals(1, calc.subtract(3, 2));
    }
}