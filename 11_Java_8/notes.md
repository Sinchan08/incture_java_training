 Day 11: Java 8 - Method Reference, Stream API, and Optional

1. Method Reference (Java 8)

Shorthand notation of lambda expressions to call a method directly.

Syntax:
ClassName::methodName

Types:

1.Reference to a static method:
MyClass::staticMethod

2.Reference to an instance method of a particular object:
obj::instanceMethod


2. Stream API

Used for processing collections of objects in a functional way.

Stream is a sequence of elements supporting sequential and parallel aggregate operations.

Created from collections using .stream() or .parallelStream()

Common Stream Methods:

Method

Description

filter()

Filters elements based on condition

map()

Transforms elements

forEach()

Performs action on each element

sorted()

Sorts stream elements

collect()

Collects result into list, set, etc.

count()

Returns number of elements

findFirst()

Returns first element of stream (optional)

anyMatch()

Checks if any element matches given predicate

Example:
List<String> names = Arrays.asList("John", "Alice", "Bob");
names.stream()
     .filter(name -> name.startsWith("A"))
     .forEach(System.out::println);


3. Optional Class

Introduced to avoid NullPointerException.

Acts as a container object that may or may not contain a non-null value.

Creating Optional:
Optional<String> opt = Optional.of("Hello");
Optional<String> empty = Optional.empty();
Optional<String> nullable = Optional.ofNullable(null);

Useful Methods:

Method

Description

isPresent()

Checks if value is present

get()

Returns value if present (use carefully)

orElse()

Returns value or default

ifPresent()

Runs action if value is present

Example:
Optional<String> opt = Optional.of("Java");
opt.ifPresent(val -> System.out.println(val));
System.out.println(opt.orElse("Default"));