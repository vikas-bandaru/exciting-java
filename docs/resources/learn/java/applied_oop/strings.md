---
layout: default
title: Strings
nav_order: 1
parent: Applied OOP
grand_parent: Learn
---

# Learn Strings and it's methods

<details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. [Why?](#why-motivation-to-use-strings)
   {:toc}
2. [How and Where?](#how-syntax--tester-code-and-where-logical-placement)
   {:toc}
3. [When?](#when-scenarios-of-situations-when-strings-can-be-used)
   {:toc}
4. [How to Decide what to use?](#how-to-decide---any-general-confusions-for-absolute-beginners)
   {:toc}
</details>

## Strings in Java

Strings in Java are objects that represent sequences of characters. Working with Strings is essential because they are widely used in many real-world scenarios, such as user input handling, data formatting, and text manipulation.

## Why (Motivation to Use Strings)

### **Why Use Strings?**

**Scenario 1: Representing Text Data**
Strings allow developers to work with sequences of characters, which can be anything from user names, sentences, product descriptions, or paragraphs.

**Scenario 2: Text Manipulation**
Strings provide numerous methods to manipulate text data. Whether it's formatting, splitting, or searching for specific patterns, Java’s `String` class offers a wide variety of methods that simplify text handling.

**Scenario 3: Immutability**
Java strings are **immutable**, meaning once created, they cannot be changed. This ensures that Strings are thread-safe, making them highly useful for applications where concurrency is involved.

---

## How (Syntax + Tester Code) and Where (Logical Placement)

### **How to Use Strings**

In Java, strings are treated as objects of the `String` class, and they come with numerous built-in methods for manipulation.

1. **Creating Strings**:
    - Using string literals:
      ```java
      String greeting = "Hello, World!";
      ```
    - Using the `new` keyword:
      ```java
      String welcome = new String("Welcome");
      ```

2. **Common String Operations**:
    - **Length**: `length()` returns the number of characters in the string.
      ```java
      int len = greeting.length();  // Returns 13
      ```
    - **Concatenation**: Strings can be concatenated using the `+` operator or the `concat()` method.
      ```java
      String fullName = "John" + " " + "Doe";  // John Doe
      String fullName2 = "John".concat(" ").concat("Doe");  // John Doe
      ```
    - **Substring**: Extract part of a string using `substring()`.
      ```java
      String hello = greeting.substring(0, 5);  // Returns "Hello"
      ```
    - **Character at a Specific Index**: `charAt()` returns the character at a specific index.
      ```java
      char firstLetter = greeting.charAt(0);  // 'H'
      ```

### **Example**: Basic String Operations

```java
public class StringExample {
    public static void main(String[] args) {
        String greeting = "Hello, World!";
        System.out.println("Length: " + greeting.length());  // Output: 13
        System.out.println("Substring: " + greeting.substring(0, 5));  // Output: Hello
        System.out.println("Character at index 1: " + greeting.charAt(1));  // Output: e
    }
}
```

---

## When (Scenarios of Situations When Strings Can Be Used)

### **1. Storing User Input**
- **Scenario**: Usernames, passwords, or any text input from users can be represented as strings. For example, getting user input and storing it as a string for validation.

### **2. File and Data Handling**
- **Scenario**: Reading or writing files involves working with text data, which is stored in strings. A file containing a list of products or users can be processed as a string.

### **3. Search and Text Matching**
- **Scenario**: Strings allow searching for patterns, characters, or substrings. For instance, verifying if an email address contains "@" or if a paragraph contains a specific word.

---

## How to Decide - Any General Confusions for Absolute Beginners

### **1. Strings vs. StringBuilder/StringBuffer**
- **Question**: Should I use `String` or `StringBuilder`?
- **Guideline**: If you need to manipulate the string (e.g., frequent appending), use `StringBuilder` or `StringBuffer`. `StringBuilder` is faster but not thread-safe, while `StringBuffer` is thread-safe but slower.

### **2. Mutable vs. Immutable**
- **Explanation**: Strings in Java are immutable, which means every time you modify a string, a new object is created. This is memory-inefficient when doing many modifications. Use `StringBuilder` for mutable strings.

### **3. Understanding Zero-Based Indexing**
- **Explanation**: String indexing in Java starts at 0. This is often confusing for beginners who might mistakenly assume the first character is at index 1.

---

## Summary of String Concepts

- **Why Use Strings**: Representing and manipulating text data is essential in programming, whether it’s user input, file handling, or formatting output.
- **Basic Operations**: Operations such as concatenation, substring extraction, and searching for characters or patterns are crucial for working with strings.
- **Common Pitfalls**: Beginners often face issues with string comparison, accessing invalid indices, or inefficient string concatenation.
- **Practice Exercises**: Help reinforce concepts by solving problems such as reversing strings, checking for palindromes, counting vowels, and more.

[Back to Top](#top)

#### Conditionals Experiments
Experiment with [Strings](../../../experiment/applied-oop/strings) exercises.

#### Practice Exercises
Practice [Strings](../../../practice/java/applied-oop/strings) with exercises.