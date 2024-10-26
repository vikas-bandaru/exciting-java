---
layout: default
title: Strings
parent: OOP
nav_order: 1
grand_parent: Experiment
---

# Experiments with Strings
{: .no_toc}

<details open markdown="block">
  <summary>
    Topics
  </summary>
  {: .text-delta }
  1. [Experiments - What could go wrong?](#experiments-what-could-go-wrong)
     {:toc}
  1. [Basic Experiments](#basic-experiments-straight-usage-of-string-methods)
     {:toc}
  2. [Tricky Experiments](#tricky-experiments-with-string-methods)
     {:toc}
  3. [Strings with loops](#strings-with-while-for-and-for-each-loops)
     {:toc}
  2. [Logical Mistakes in Loop conditions](#logical-mistakes-in-loop-conditions)
     {:toc}
</details>

## Experiments (What Could Go Wrong)

### **1. Accessing Invalid Index**

**Scenario**: Try accessing an index that is out of bounds, which will throw a `StringIndexOutOfBoundsException`.

```java
String word = "hello";
System.out.println(word.charAt(10));  // Accessing an index out of range
```

**What Happens**: This will throw a `StringIndexOutOfBoundsException` because index 10 is outside the valid range (0 to `length - 1`).

**Solution**: Always ensure the index is within bounds before accessing a character.
```java
if (word.length() > 10) {
    System.out.println(word.charAt(10));
} else {
    System.out.println("Index out of bounds");
}
```

---

### **2. String Comparison**

**Scenario**: Compare two strings using the `==` operator instead of the `equals()` method, which leads to unexpected results due to string interning.

```java
String s1 = new String("hello");
String s2 = new String("hello");
System.out.println(s1 == s2);  // false, comparing references
System.out.println(s1.equals(s2));  // true, comparing values
```

**What Happens**: The `==` operator compares object references, not the content. This can lead to false results when comparing strings created with `new String()`.

**Solution**: Use `equals()` to compare string values.

```java
if (s1.equals(s2)) {
    System.out.println("Strings are equal");
}
```

---

### **3. String Concatenation in Loops**

**Scenario**: Concatenating strings inside a loop, which creates many unnecessary string objects due to immutability, leading to memory inefficiency.

```java
String result = "";
for (int i = 0; i < 100; i++) {
    result += i;  // Inefficient due to string immutability
}
System.out.println(result);
```

**What Happens**: Each concatenation creates a new string, leading to inefficient memory usage.

**Solution**: Use `StringBuilder` for better performance.

```java
StringBuilder result = new StringBuilder();
for (int i = 0; i < 100; i++) {
    result.append(i);
}
System.out.println(result.toString());
```

## Basic Experiments (Straight Usage of String Methods)

These experiments cover the basic and most common string manipulation methods that beginners should be familiar with.

### **Experiment 1: Converting Strings to Uppercase and Lowercase**

**Scenario**: Convert a string to uppercase and lowercase using `toUpperCase()` and `toLowerCase()` methods.

```java
String greeting = "Hello, World!";
String upperCaseGreeting = greeting.toUpperCase();  // Converts to "HELLO, WORLD!"
String lowerCaseGreeting = greeting.toLowerCase();  // Converts to "hello, world!"
System.out.println("Uppercase: " + upperCaseGreeting);
System.out.println("Lowercase: " + lowerCaseGreeting);
```

### **Experiment 2: Checking if a String Contains a Substring**

**Scenario**: Use the `contains()` method to check if a given substring exists within the string.

```java
String sentence = "Java is a powerful programming language.";
boolean containsWord = sentence.contains("powerful");
System.out.println("Contains 'powerful': " + containsWord);  // Output: true
```

### **Experiment 3: Replacing Characters or Substrings**

**Scenario**: Replace all occurrences of a character or substring using `replace()`.

```java
String original = "apple, apple, apple";
String replaced = original.replace("apple", "orange");  // Replace all "apple" with "orange"
System.out.println(replaced);  // Output: "orange, orange, orange"
```

### **Experiment 4: Splitting a String into an Array**

**Scenario**: Use the `split()` method to break a string into an array of substrings based on a delimiter.

```java
String fruits = "apple,banana,orange";
String[] fruitArray = fruits.split(",");  // Splitting by commas
for (String fruit : fruitArray) {
    System.out.println(fruit);
}
// Output: apple, banana, orange
```

### **Experiment 5: Trimming Whitespace**

**Scenario**: Use the `trim()` method to remove leading and trailing whitespace from a string.

```java
String nameWithSpaces = "  John Doe  ";
String trimmedName = nameWithSpaces.trim();  // Trims whitespace
System.out.println("Trimmed name: '" + trimmedName + "'");
// Output: 'John Doe'
```

## Tricky Experiments (With String Methods)

These experiments highlight more subtle uses of string methods that might lead to unexpected behavior if not understood properly.

### **Experiment 1: Case-Sensitive Comparison**

**Scenario**: Use the `equals()` method to compare two strings, and observe that it is case-sensitive.

```java
String s1 = "Hello";
String s2 = "hello";
System.out.println(s1.equals(s2));  // Output: false (case-sensitive comparison)
```

**Tricky Solution**: Use `equalsIgnoreCase()` to compare strings in a case-insensitive manner.

```java
System.out.println(s1.equalsIgnoreCase(s2));  // Output: true
```

### **Experiment 2: Finding the Index of a Substring**

**Scenario**: Use the `indexOf()` method to find the position of a substring within a string.

```java
String sentence = "Programming in Java";
int index = sentence.indexOf("Java");
System.out.println("Index of 'Java': " + index);  // Output: 16
```

**Tricky Case**: Check what happens when the substring is not found.

```java
int notFoundIndex = sentence.indexOf("Python");
System.out.println("Index of 'Python': " + notFoundIndex);  // Output: -1
```

### **Experiment 3: Replace vs ReplaceAll**

**Scenario**: Use `replaceAll()` to replace a pattern using regular expressions.

```java
String text = "123abc456def";
String replaced = text.replaceAll("[0-9]", "");  // Removes all digits using regex
System.out.println(replaced);  // Output: "abcdef"
```

**Tricky Case**: Compare this with `replace()`, which treats its arguments as literal strings rather than regex.

```java
String text2 = "123abc456def";
String replacedLiteral = text2.replace("123", "");  // Only replaces the literal "123"
System.out.println(replacedLiteral);  // Output: "abc456def"
```

### **Experiment 4: Substring Out of Bounds**

**Scenario**: Use the `substring()` method with incorrect indices, which can lead to an `IndexOutOfBoundsException`.

```java
String word = "hello";
String sub = word.substring(6);  // This will throw IndexOutOfBoundsException because index 6 is out of bounds
```

**Solution**: Always ensure the indices are valid and within the length of the string.

```java
if (word.length() >= 6) {
    System.out.println(word.substring(6));
} else {
    System.out.println("Invalid index");
}
```

### **Experiment 5: Splitting by Multiple Delimiters**

**Scenario**: Use a regular expression to split a string by multiple delimiters (e.g., space or comma).

```java
String data = "apple, banana orange; grape";
String[] fruits = data.split("[,; ]+");  // Split by commas, semicolons, or spaces
for (String fruit : fruits) {
    System.out.println(fruit);
}
```

## Strings with `while`, `for`, and `for-each` Loops

These experiments explore the use of different types of loops with strings for various tasks like character traversal and word manipulation.

### **Experiment 1: `for` Loop for Traversing a String**

**Scenario**: Use a traditional `for` loop to iterate through each character of a string and print it.

```java
String word = "example";
for (int i = 0; i < word.length(); i++) {
    System.out.println(word.charAt(i));  // Print each character
}
```

### **Experiment 2: `for-each` Loop for Traversing a String (Using `toCharArray`)**

**Scenario**: Use a `for-each` loop to iterate through each character of a string by converting it to a `char[]`.

```java
String word = "example";
for (char ch : word.toCharArray()) {
    System.out.println(ch);  // Print each character
}
```

### **Experiment 3: `while` Loop for Counting a Specific Character**

**Scenario**: Use a `while` loop to count the occurrences of a specific character in a string.

```java
String sentence = "banana";
int count = 0;
int index = 0;

while (index < sentence.length()) {
    if (sentence.charAt(index) == 'a') {
        count++;
    }
    index++;
}
System.out.println("Number of 'a's: " + count);  // Output: 3
```

### **Experiment 4: Reverse a String Using `while` Loop**

**Scenario**: Reverse a string by using a `while` loop.

```java
String word = "hello";
String reversed = "";
int index = word.length() - 1;

while (index >= 0) {
    reversed += word.charAt(index);
    index--;
}
System.out.println(reversed);  // Output: "olleh"
```

## Logical Mistakes in Strings (That May Lead to Exceptions)

These experiments cover common logical mistakes that beginners might make when working with strings, which can lead to exceptions or bugs.

### **Experiment 1: Null Strings and `NullPointerException`**

**Scenario**: Attempt to call a method on a `null` string, which will throw a `NullPointerException`.

```java
String nullString = null;
System.out.println(nullString.length());  // Throws NullPointerException
```

**Solution**: Always check if the string is `null` before accessing its methods.

<details markdown="block">
   <summary>Solution</summary>

   ```java
   if (nullString != null) {
       System.out.println(nullString.length());
   } else {
       System.out.println("The string is null.");
   }
   ```
</details>

### **Experiment 2: Case-Sensitive Comparison with `==`**

**Scenario**: Use `==` to compare two strings, which compares references rather than values.

```java
String s1 = "Hello";
String s2 = new String("Hello");

if (s1 == s2) {
    System.out.println("Strings are equal (==)");
} else {
    System.out.println("Strings are not equal (==)");  // Output: Strings are not equal (==)
}
```

**Solution**: Use the `equals()` method to compare string values.

<details markdown="block">
   <summary>Solution</summary>

   ```java
   if (s1.equals(s2)) {
       System.out.println("Strings are equal (equals)");
   }
   ```
</details>

### **Experiment 3: Incorrect Index in `substring()`**

**Scenario**: Use the `substring()` method with a starting index greater than the ending index, which will throw an `IndexOutOfBoundsException`.

```java
String word = "example";
System.out.println(word.substring(5, 3));  // Throws IndexOutOfBoundsException
```

**Solution**: Ensure the start index is less than or equal to the end index when using `substring()`.

<details markdown="block">
   <summary>Solution</summary>

   ```java
   if (5 <= 3) {
       System.out.println(word.substring(5, 3));
   } else {
       System.out.println("Start index is greater than end index.");
   }
   ```
</details>

### **Experiment 4: Modifying Immutable Strings in a Loop**

**Scenario**: Attempt to repeatedly modify a string inside a loop, which creates unnecessary string objects due to immutability.

```java
String sentence = "repeat";
for (int i = 0; i < 10; i++) {
    sentence += i;  // Each iteration creates a new string object
}
System.out.println(sentence);
```

**Solution**: Use a `StringBuilder` to modify strings efficiently.

<details markdown="block">
   <summary>Solution</summary>

   ```java
   StringBuilder sentence = new StringBuilder("repeat");
   for (int i = 0; i < 10; i++) {
       sentence.append(i);  // Efficiently appends without creating new objects
   }
   System.out.println(sentence.toString());
   ```
</details>

These experiments should help solidify an understanding of how to handle strings efficiently and avoid common mistakes.

[Back to Top](#top)

#### Practice Exercises
Practice [Strings](../../practice/java/applied-oop/strings) with exercises.

#### Next Topic: 
Go to [ArrayLists](../../learn/java/applied_oop/arraylists) to learn more with examples.
