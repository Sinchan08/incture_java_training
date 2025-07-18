# 📘 Day 4 – Java Strings, StringBuffer, and StringBuilder
17-07-2025

---
## 🔹 String (Immutable)

- Strings in Java are **immutable** – once created, they cannot be changed.
- Stored in the **String Constant Pool**.
- Every time we modify a string, a **new object** is created.

### Common String Methods:
| Method | Description |
|--------|-------------|
| `length()` | Returns the length of the string |
| `charAt(index)` | Returns character at given index |
| `substring(start, end)` | Returns substring |
| `equals(str)` | Compares content (case-sensitive) |
| `equalsIgnoreCase(str)` | Compares ignoring case |
| `toUpperCase() / toLowerCase()` | Case conversions |
| `trim()` | Removes spaces from both ends |
| `replace(a, b)` | Replaces characters |
| `split()` | Splits based on regex/delimiter |

---

## 🔹 StringBuffer (Mutable & Thread-Safe)

- Used when **multiple modifications** are needed.
- Stored in **heap memory** and is **thread-safe** (synchronized).
- Slower compared to StringBuilder due to synchronization.

### Common Methods:
| Method | Description |
|--------|-------------|
| `append(str)` | Adds string at end |
| `insert(pos, str)` | Inserts at position |
| `replace(start, end, str)` | Replaces substring |
| `delete(start, end)` | Deletes part of string |
| `reverse()` | Reverses string |
| `capacity()` | Returns current buffer capacity |

---

## 🔹 StringBuilder (Mutable & Not Thread-Safe)

- Similar to `StringBuffer` but **faster** because it is **not synchronized**.
- Best suited for **single-threaded** environments.

---

## 🧠 Difference Between String, StringBuffer, and StringBuilder

| Feature | String | StringBuffer | StringBuilder |
|--------|--------|--------------|---------------|
| Mutability | Immutable | Mutable | Mutable |
| Thread Safety | Yes (Immutable) | Yes (Synchronized) | No |
| Performance | Low | Medium | High |
| Use Case | Fixed string | Multi-threaded app | Fast single-threaded |

---

## 🔍 Example:
```java
String name = "Java";
name.concat(" Programming"); // new object created, original not changed

StringBuffer sb = new StringBuffer("Hello");
sb.append(" World"); // modifies existing object

StringBuilder sb2 = new StringBuilder("Data");
sb2.append(" Science");
