---
layout: default
title: Loops
nav_order: 7
parent: Class Definitions
grand_parent: Learn
---

# Learn writing Loops (Repetitive Blocks)

<details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. [Why?](#why-motivation-to-use-loops)
   {:toc}
2. [How and Where?](#how-syntax--tester-code-and-where-logical-placement)
   {:toc}
3. [When?](#when-scenarios-of-situations-when-loops-can-be-used)
   {:toc}
4. [How to Decide what to use?](#how-to-decide---any-general-confusions-for-absolute-beginners)
   {:toc}
</details>

## Why (Motivation to Use Loops)

**Scenario 1: Repeating Tasks Multiple Times**
Loops allow you to perform repetitive tasks efficiently. For example, if you want to print numbers from 1 to 100, a loop can automate this instead of writing 100 print statements.

**Scenario 2: Traversing Data Structures**
Loops are frequently used to traverse data structures like arrays, lists, or other collections. If you want to process each item in an array or list, a loop allows you to iterate through them efficiently.

**Scenario 3: Automating Complex Calculations**
In more complex applications, loops can be used to automate calculations that require repetitive operations, such as summing up values, finding averages, or applying a specific operation to a sequence of numbers.

Let’s move on to understanding the different types of loops and how they are structured.

## How (Syntax + Tester Code) and Where (Logical Placement)

### **Types of Loops in Java**

1. **`while` Loop**
2. **`for` Loop**
3. **`do-while` Loop**
4. **Enhanced `for` Loop (for-each)**

### **1. `while` Loop**

**Syntax**:
```java
while (condition) {
    // Code to be executed
}
```

**Example**: Keep asking the user to enter a number greater than 0. The loop continues until a valid number is entered. Here, we don’t know how many times the loop will run, which justifies using a `while` loop.

```java
import java.util.Scanner;

public class LoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = -1;  // Initialize with an invalid value

        while (number <= 0) {
            System.out.print("Enter a number greater than 0: ");
            number = scanner.nextInt();
        }

        System.out.println("You entered: " + number);
    }
}
```

**What Happens**:
- The `while` loop keeps prompting the user to enter a valid number until the user provides input that satisfies the condition (`number > 0`).
- The number of iterations is not fixed beforehand; it depends on the user’s input.

### **2. `for` Loop**

**Syntax**:
```java
for (initialization; condition; update) {
    // Code to be executed
}
```

**Example**: Print numbers from 1 to 5.

```java
public class LoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
```

**What Happens**:
- The loop initializes the variable `i = 1`, checks the condition (`i <= 5`), and prints the value of `i`.
- After each iteration, `i` is incremented by 1 (`i++`).
- The loop stops when `i > 5`.

### **3. `do-while` Loop**

**Syntax**:
```java
do {
    // Code to be executed
} while (condition);
```

**Example**: Print numbers from 1 to 5.

```java
public class LoopExample {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
}
```

**What Happens**:
- The `do-while` loop will execute the code block **at least once**, even if the condition is false on the first check, because the condition is evaluated after the loop body.

### **4. Enhanced `for` Loop (for-each)**

**Syntax**:
```java
for (type variable : collection) {
    // Code to be executed
}
```

**Example**: Print all elements in an array.

```java
public class LoopExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
```

**What Happens**:
- The loop iterates over each element of the array (`numbers`), assigns it to `num`, and prints it.

## When (Scenarios of Situations When Loops Can Be Used)

### **1. Repeating a Task a Set Number of Times**
- **Scenario**: You want to print numbers from 1 to 100.
- **Loop to Use**: Use a `for` loop when you know exactly how many times the loop should run.

```java
for (int i = 1; i <= 100; i++) {
    System.out.println(i);
}
```

### **2. Searching Through an Array or List**
- **Scenario**: You have an array of integers and want to find the index of a specific value.
- **Loop to Use**: Use a `for` or enhanced `for` loop to traverse the array.

```java
int[] arr = {10, 20, 30, 40, 50};
int target = 30;
for (int i = 0; i < arr.length; i++) {
    if (arr[i] == target) {
        System.out.println("Found at index: " + i);
        break;
    }
}
```

### **3. Repeating a Task Until a Condition Is Met**
- **Scenario**: You want to keep asking the user for input until they enter a valid number.
- **Loop to Use**: Use a `while` loop when you don’t know in advance how many times the loop will run.

```java
Scanner scanner = new Scanner(System.in);
int number;
do {
    System.out.print("Enter a number greater than 0: ");
    number = scanner.nextInt();
} while (number <= 0);
```

### **4. Traversing a Collection or Array**
- **Scenario**: You want to print all elements in an array or collection.
- **Loop to Use**: Use an enhanced `for` loop (for-each) when you want to iterate through all elements of a collection.

```java
String[] fruits = {"Apple", "Banana", "Cherry"};
for (String fruit : fruits) {
    System.out.println(fruit);
}
```

## How to Decide - Any General Confusions for Absolute Beginners

### **How to Decide Which Loop to Use**

1. **`for` Loop vs. `while` Loop**
   - **Use a `for` loop** when you know the exact number of iterations needed, such as iterating through a range of numbers.
   - **Use a `while` loop** when the number of iterations isn’t known in advance, but you know the condition that will stop the loop.

2. **`while` vs. `do-while`**
   - **Use a `while` loop** if the loop might not need to run even once (the condition is checked first).
   - **Use a `do-while` loop** if the loop should run at least once (the condition is checked after the loop body).

3. **Enhanced `for` Loop (for-each)**
   - Use an enhanced `for` loop when you are simply iterating over an array or collection and do not need the index or to modify the collection.

[Back to Top](#top)

#### Conditionals Experiments
Experiment with [Loops](../../../experiment/loops) exercises.

#### Practice Exercises
Practice [Loops](../../../practice/java/foundations/loops) with exercises.