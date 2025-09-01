Day 10: Java 8 Functional Interfaces & Predicates (24th July)

✅ Topics Covered

1. Functional Interface

An interface with only one abstract method.

Can have default and static methods.

Used as a target for lambda expressions.

✅ Example:
@FunctionalInterface
interface MyFunctionalInterface {
    void show();
}

2. Built-in Functional Interfaces

Java 8 provides commonly used functional interfaces in java.util.function package:

Interface

Type

Abstract Method

Purpose

Predicate

Functional

boolean test(T t)

Returns true/false based on condition.

Function<T,R>

Functional

R apply(T t)

Takes input, returns output.

Consumer

Functional

void accept(T t)

Takes input, no return.

Supplier

Functional

T get()

No input, returns output.

3. Predicate

Used for condition checking.

Can be joined using:

and()

or()

negate()

✅ Example:
Predicate<Integer> isEven = i -> i % 2 == 0;
Predicate<Integer> isGT10 = i -> i > 10;

System.out.println(isEven.and(isGT10).test(12)); // true
System.out.println(isEven.or(isGT10).test(9));   // false
System.out.println(isEven.negate().test(3));     // true

Function<T, R>

Takes a type T input and returns type R output.

✅ Example:
Function<String, Integer> strLength = s -> s.length();
System.out.println(strLength.apply("Hello")); // 5

Consumer

Accepts a value and performs operation without returning result.

✅ Example:
Consumer<String> printUpper = s -> System.out.println(s.toUpperCase());
printUpper.accept("java"); // Output: JAVA

6. Supplier

Supplies a value with no input.

✅ Example:
Supplier<String> greet = () -> "Hello World!";
System.out.println(greet.get()); // Hello World!

📝 Summary Table

Interface

Input

Output

Use Case

Predicate

T

boolean

Conditions, filters

Function

T

R

Convert one type to another

Consumer

T

void

Print/log/consume data

Supplier

()

T

Random/default/generate data