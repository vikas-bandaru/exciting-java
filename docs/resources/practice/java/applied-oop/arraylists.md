---
layout: default
title: ArrayLists
parent: Applied OOP
nav_order: 1
grand_parent: Practice
---

# Practice ArrayLists
{: .no_toc}

<details open markdown="block">
  <summary>
    Topics
  </summary>
  {: .text-delta }
  1. [Reverse and it's Variants](#1-reverse-a-string)
     {:toc}
  2. [Palindrome and it's Variants](#2-check-if-a-string-is-a-palindrome)
     {:toc}
  3. [Vowel Count and it's Variants](#3-count-the-number-of-vowels-in-a-string)
     {:toc}
  4. [Anagrams and it's Variants](#4-check-if-two-strings-are-anagrams)
     {:toc}
  5. [Count of occurrences and it's Variants](#5-count-the-occurrences-of-a-substring)
     {:toc}
</details>

Here’s a detailed set of **variations** for the practice exercises given earlier. These variations will deepen understanding by presenting different angles of working with ArrayLists in practical scenarios.

### **Exercise 1: Add and Retrieve Elements**

#### **Problem**: Create an `ArrayList` of integers. Add 10 random integers to the list and print all elements.

<details markdown="block">
   <summary>Solution</summary>

   ```java
   ArrayList<Integer> numbers = new ArrayList<>();
   for (int i = 0; i < 10; i++) {
       numbers.add((int) (Math.random() * 100));  // Add random integers between 0 and 99
   }
   for (int num : numbers) {
       System.out.println(num);
   }

   ```
</details>

1. **Add Even Numbers Only**
   **Problem**: Modify the exercise so that only random even numbers between 1 and 100 are added to the ArrayList.
2. **Add Numbers Without Duplicates**
   **Problem**: Create an `ArrayList` that does not allow duplicate integers. If a duplicate number is generated, do not add it to the list.

   <details markdown="block">
      <summary>Solution</summary>

      ```java
      ArrayList<Integer> numbers = new ArrayList<>();
      while (numbers.size() < 10) {
          int randomNum = (int) (Math.random() * 100);
          if ( _________ ) {  // Check for duplicates
              numbers.add(randomNum);
          }
      }
      System.out.println(numbers);
      ```
   </details>
3. **Add Numbers Greater Than 50**
**Problem**: Create an `ArrayList` that only stores numbers greater than 50.

```java
ArrayList<Integer> numbers = new ArrayList<>();
for (int i = 0; i < 10; i++) {
    int randomNum = (int) (Math.random() * 100);
    if (randomNum > 50) {
        numbers.add(randomNum);
    }
}
System.out.println(numbers);
```

---

#### **Variation 4: Add and Retrieve Floating-Point Numbers**
**Problem**: Create an `ArrayList` of doubles. Add 10 random floating-point numbers between 0 and 1, then print the elements.

```java
ArrayList<Double> numbers = new ArrayList<>();
for (int i = 0; i < 10; i++) {
    double randomNum = Math.random();  // Generates a random number between 0 and 1
    numbers.add(randomNum);
}
System.out.println(numbers);
```

---

### **Exercise 2: Find and Remove an Element**

#### **Problem**: Create an `ArrayList` of integers. Find and remove the number `50` if it exists in the list.

<details markdown="block">
   <summary>Solution</summary>

   ```java
   
   ```
</details>

#### **Variation 1: Remove the First Occurrence of a Number**
**Problem**: Modify the exercise to remove only the **first occurrence** of the number `50` if it appears multiple times.

```java
ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(50, 20, 50, 40));
if (numbers.contains(50)) {
    numbers.remove(Integer.valueOf(50));  // Remove only the first occurrence
}
System.out.println(numbers);
```

---

#### **Variation 2: Remove All Occurrences of a Number**
**Problem**: Create an `ArrayList` of integers, and remove **all occurrences** of the number `50` from the list.

```java
ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(50, 20, 50, 40, 50));
numbers.removeAll(Arrays.asList(50));  // Remove all occurrences of 50
System.out.println(numbers);
```

---

#### **Variation 3: Remove an Element Greater Than a Threshold**
**Problem**: Write a program to remove the first element that is greater than `30` in an `ArrayList` of integers.

```java
ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 35, 40));
for (int i = 0; i < numbers.size(); i++) {
    if (numbers.get(i) > 30) {
        numbers.remove(i);  // Remove the first element greater than 30
        break;
    }
}
System.out.println(numbers);
```

---

#### **Variation 4: Remove Element Using Iterator**
**Problem**: Remove all even numbers from an `ArrayList` using an `Iterator`.

```java
ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 15, 20, 25));
Iterator<Integer> iterator = numbers.iterator();
while (iterator.hasNext()) {
    if (iterator.next() % 2 == 0) {
        iterator.remove();  // Safe removal using Iterator
    }
}
System.out.println(numbers);
```

---

### **Exercise 3: Update Elements in an ArrayList**

#### **Original Problem**: Create an `ArrayList` of strings. Replace every occurrence of "Java" with "Python".

<details markdown="block">
   <summary>Solution</summary>

   ```java
   
   ```
</details>

#### **Variation 1: Replace Based on Length**
**Problem**: Replace every string with length greater than 4 in the `ArrayList` with the word "LongString".

```java
ArrayList<String> words = new ArrayList<>(Arrays.asList("Java", "C++", "Python", "HTML"));
for (int i = 0; i < words.size(); i++) {
    if (words.get(i).length() > 4) {
        words.set(i, "LongString");  // Replace words longer than 4 characters
    }
}
System.out.println(words);
```

---

#### **Variation 2: Update Elements Starting with a Specific Letter**
**Problem**: Replace every word in an `ArrayList` that starts with "P" with "PHP".

```java
ArrayList<String> words = new ArrayList<>(Arrays.asList("Python", "Java", "Perl", "C++"));
for (int i = 0; i < words.size(); i++) {
    if (words.get(i).startsWith("P")) {
        words.set(i, "PHP");  // Replace words starting with "P"
    }
}
System.out.println(words);
```

---

#### **Variation 3: Convert Strings to Uppercase**
**Problem**: Replace all strings in an `ArrayList` with their uppercase versions.

```java
ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "python", "c++"));
for (int i = 0; i < words.size(); i++) {
    words.set(i, words.get(i).toUpperCase());  // Convert to uppercase
}
System.out.println(words);
```

---

#### **Variation 4: Increment All Elements in a List of Integers**
**Problem**: Create an `ArrayList` of integers and increment all elements by 5.

```java
ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30));
for (int i = 0; i < numbers.size(); i++) {
    numbers.set(i, numbers.get(i) + 5);  // Increment each number by 5
}
System.out.println(numbers);
```

---

### **Exercise 4: Check if an ArrayList is Empty**

#### **Problem**: Write a method that takes an `ArrayList` as input and prints whether the list is empty or not.

<details markdown="block">
   <summary>Solution</summary>

   ```java
   
   ```
</details>

#### **Variation 1: Check if an ArrayList Contains Only Null Values**
**Problem**: Modify the method to check if an `ArrayList` contains only `null` values.

```java
ArrayList<String> list = new ArrayList<>(Arrays.asList(null, null, null));
boolean allNull = true;
for (String item : list) {
    if (item != null) {
        allNull = false;
        break;
    }
}
if (allNull) {
    System.out.println("The list contains only null values.");
} else {
    System.out.println("The list contains non-null values.");
}
```

---

#### **Variation 2: Check If All Elements Are Equal**
**Problem**: Write a method to check if all elements in an `ArrayList` are equal.

```java
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 5, 5, 5));
boolean allEqual = true;
int first = list.get(0);
for (int number : list) {
    if (number != first) {
        allEqual = false;
        break;
    }
}
if (allEqual) {
    System.out.println("All elements are equal.");
} else {
    System.out.println("Elements are not equal.");
}
```

---

#### **Variation 3: Check If Any Element Meets a Condition**
**Problem**: Write a method to check if any element in the list is greater than a given value.

```java
ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 15, 20, 25));
boolean anyGreaterThan20 = false;
for (int num : numbers) {
    if (num > 20) {
        anyGreaterThan20 = true;
        break;
    }
}
if (anyGreaterThan20) {
    System.out.println("There is at least one element greater than 20.");
} else {
    System.out.println("No element greater than 20.");
}
```

---

## **Exercise 5: Reverse an ArrayList**

### **Original Problem**: Write a method to reverse the elements of an `ArrayList` of integers.

<details markdown="block">
   <summary>Solution</summary>

   ```java
   
   ```
</details>

### **Variation 1: Reverse Every Two Elements**
**Problem**: Reverse every two consecutive elements in the `ArrayList`.

```java
ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
for (int i = 0; i < numbers.size() - 1; i += 2) {
    int temp = numbers.get(i);
    numbers.set(i, numbers.get(i + 1));
    numbers.set(i + 1, temp);  // Swap every two consecutive elements
}
System.out.println(numbers);
```

### **Variation 2: Reverse List of Custom Objects**
**Problem**: Create a class `Person` with a `name` and `age`. Write a method to reverse a list of `Person` objects.

```java
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

ArrayList<Person> people = new ArrayList<>();
people.add(new Person("Alice", 25));
people.add(new Person("Bob", 30));

Collections.reverse(people);  // Reverse list of custom objects
System.out.println(people);
```

### **Variation 3: Reverse a List of Booleans**
**Problem**: Reverse the elements of an `ArrayList` of booleans.

```java
ArrayList<Boolean> flags = new ArrayList<>(Arrays.asList(true, false, true, false));
Collections.reverse(flags);
System.out.println(flags);  // Output: [false, true, false, true]
```

### **Variation 4: Reverse and Print Alternating Elements**
**Problem**: Reverse the list and print every second element after reversing.

```java
ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
Collections.reverse(numbers);
for (int i = 0; i < numbers.size(); i += 2) {
    System.out.println(numbers.get(i));  // Print every second element
}
```

## Summary of Practice Variations

- **Add and Retrieve Elements**: Variations include adding even numbers, numbers without duplicates, numbers greater than a threshold, and using floating-point numbers.
- **Find and Remove an Element**: Variations include removing the first occurrence, all occurrences, or elements greater than a threshold.
- **Update Elements**: Variations include replacing based on length, starting letters, converting to uppercase, and incrementing numbers.
- **Check ArrayList State**: Variations include checking for null values, checking if all elements are equal, and checking conditions for elements.
- **Reverse an ArrayList**: Variations include reversing specific groups of elements, reversing custom objects, and alternating elements.

These exercises will help broaden understanding and strengthen skills in working with ArrayLists in different scenarios.

### Next Topic: 
Go to [ArrayLists](../../../learn/java/oop/arraylists) to learn a new topic.

### Back to Learn: 
Go to [Strings](../../../learn/java/oop/strings) to learn more with examples.