---
layout: default
title: Loops
parent: Class Definitions
nav_order: 2
grand_parent: Experiment
---

# Experiments with writing Loops (Repetitive Blocks)
{: .no_toc}

<details open markdown="block">
  <summary>
    Topics
  </summary>
  {: .text-delta }
  1. [Basic Experiments](#basic-experiments-what-could-go-wrong)
     {:toc}
  2. [Tricky Experiments](#tricky-experiments)
     {:toc}
  3. [Variations of the for loop](#variations-of-the-for-loop)
     {:toc}
  2. [Logical Mistakes in Loop conditions](#logical-mistakes-in-loop-conditions)
     {:toc}
</details>

## Basic Experiments (What Could Go Wrong)

### **Experiment 1: Infinite Loop with `while` Loop**

**Scenario**: Write a `while` loop to print numbers from 1 to 5, but forget to increment the loop variable.

```java
int i = 1;
while (i <= 5) {
    System.out.println(i);  // Missing increment i++
}
```

**What Could Go Wrong**:
- This loop will run infinitely because `i` is never incremented and will always be `1`.

**Solution**:
- Always ensure you update the loop variable inside the loop body.
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;  // Incrementing i
}
```

### **Experiment 2: Off-by-One Error in `for` Loop**

**Scenario**: Write a `for` loop to print numbers from 1 to 10 but accidentally start the loop at 0.

```java
for (int i = 0; i <= 10; i++) {
    System.out.println(i);
}
```

**What Could Go Wrong**:
- The loop will print numbers from 0 to 10 instead of 1 to 10 because it starts at 0.

**Solution**:
- Make sure the initialization is correct and starts from 1.
```java
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
```

### **Experiment 3: Using `break` Incorrectly in a Loop**

**Scenario**: Write a loop that should continue until it finds a specific number in an array, but accidentally place the `break` statement outside the `if` condition.

```java
int[] arr = {10, 20, 30, 40, 50};
for (int i = 0; i < arr.length; i++) {
    if (arr[i] == 30) {
        System.out.println("Found at index: " + i);
    }
    break;  // This will exit the loop after the first iteration
}
```

**What Could Go Wrong**:
- The loop will break after the first iteration regardless of whether the target is found.

**Solution**:
- Place the `break` statement inside the `if` block to ensure it only exits when the target is found.
```java
for (int i = 0; i < arr.length; i++) {
    if (arr[i] == 30) {
        System.out.println("Found at index: " + i);
        break;  // Only break when the target is found
    }
}
```

## Tricky Experiments

Here are several experiments designed to focus on nuances related to loops, including the use of single-line versus multiple-line statements, common mistakes with semicolons, and variations of loops. These exercises help beginners spot common logical and syntactical mistakes while mastering the proper use of loops.

### **Experiment 1: Single-Line vs. Multiple-Line Statements Inside a Loop**

**Scenario**: Write a `for` loop to print numbers from 1 to 5.

- **Single-Line Statement**:
```java
for (int i = 1; i <= 5; i++)
    System.out.println(i);  // Only one statement inside the loop
```
- **Multiple-Line Statement**:
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);   // Multiple statements inside the loop
    System.out.println("Looping...");
}
```

**What to Observe**:
- In the single-line version, the lack of braces means only the first line after the loop runs as part of the loop.
- In the multiple-line version, braces ensure that multiple lines are treated as part of the loop body.

---

### **Experiment 2: Semicolon at the End of the `while` Condition**

**Scenario**: Write a `while` loop to print numbers from 1 to 5, but accidentally put a semicolon at the end of the `while` condition.

- **Incorrect Version (With Semicolon)**:
```java
int i = 1;
while (i <= 5);  // This semicolon causes the loop to do nothing
{
    System.out.println(i);  // This runs only once, after the loop ends
    i++;
}
```

**What Happens**:
- The semicolon makes the `while` loop an empty loop, and the block inside the braces runs only once after the loop.

- **Correct Version**:
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

**What to Observe**:
- Removing the semicolon ensures the code inside the braces runs as part of the loop.

---

### **Experiment 3: Semicolon at the End of the `for` Loop**

**Scenario**: Write a `for` loop to print numbers from 1 to 5, but accidentally put a semicolon at the end of the `for` condition.

- **Incorrect Version (With Semicolon)**:
```java
for (int i = 1; i <= 5; i++);  // This semicolon makes the loop do nothing
{
    System.out.println(i);  // This causes an error because `i` is out of scope
}
```

**What Happens**:
- The semicolon makes the `for` loop an empty loop. The loop runs, but nothing happens inside it.

- **Correct Version**:
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

**What to Observe**:
- Removing the semicolon ensures that the loop body executes.

---

### **Experiment 4: Infinite Loop with a `while` Loop**

**Scenario**: Write a `while` loop that prints numbers from 1 to 5, but forget to increment the loop variable.

```java
int i = 1;
while (i <= 5) {
    System.out.println(i);  // i is never incremented, so this will loop infinitely
}
```

**What Happens**:
- This creates an infinite loop because `i` is never incremented, so the condition `i <= 5` is always true.

**Solution**:
- Add the increment statement inside the loop.
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;  // Increment i to avoid infinite loop
}
```

---

### **Experiment 5: Missing Braces in Loops with Multiple Statements**

**Scenario**: Write a `for` loop that prints numbers and a custom message, but omit the braces around multiple statements.

- **Incorrect Version (Missing Braces)**:
```java
for (int i = 1; i <= 5; i++)
    System.out.println(i);  // Only this line is inside the loop
    System.out.println("Looping...");  // This line is outside the loop
```

**What Happens**:
- The second `System.out.println()` statement runs after the loop finishes, not during each iteration.

- **Correct Version (With Braces)**:
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
    System.out.println("Looping...");
}
```

**What to Observe**:
- Using braces groups the multiple statements together inside the loop.

---

### **Experiment 6: Nested Loops**

**Scenario**: Write a nested `for` loop to print a simple pattern of numbers.

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.print(j + " ");
    }
    System.out.println();  // Move to the next line
}
```

---

**What Happens**:
- The outer loop controls the number of lines, and the inner loop prints numbers on each line.

**Variation**: Try changing the ranges or swapping `i` and `j` to explore different patterns.

---

## Variations of the `for` Loop

### **1. `for` Loop with Multiple Variables**

**Scenario**: Write a `for` loop that uses two variables, one incrementing and one decrementing.

```java
for (int i = 1, j = 10; i <= 5; i++, j--) {
    System.out.println("i = " + i + ", j = " + j);
}
```

**What Happens**:
- The loop increments `i` and decrements `j` simultaneously in each iteration.

---

### **2. `for` Loop Without Initialization**

**Scenario**: Write a `for` loop where the initialization of the loop variable happens outside the loop.

```java
int i = 1;
for (; i <= 5; i++) {
    System.out.println(i);
}
```

**What Happens**:
- The loop works without initialization inside the `for` loop header, showing that the initialization step is optional.

---

### **3. `for` Loop Without Condition**

**Scenario**: Write a `for` loop that uses a `break` statement to terminate instead of a condition in the loop header.

```java
for (int i = 1;; i++) {  // No condition in the loop header
    if (i > 5) {
        break;  // Terminate the loop when i > 5
    }
    System.out.println(i);
}
```

**What Happens**:
- The loop doesn’t have a condition, but it terminates with a `break` when `i > 5`.

---

### **4. `for` Loop Without Update**

**Scenario**: Write a `for` loop where the update step happens inside the loop body instead of in the loop header.

```java
for (int i = 1; i <= 5;) {  // No update in the loop header
    System.out.println(i);
    i++;  // Update i inside the loop body
}
```

**What Happens**:
- The loop works without an update step in the loop header, showing that the update step is optional.

---

## Logical Mistakes in Loop Conditions

### **Mistake 1: Off-By-One Error in Loop Condition**

**Scenario**: Write a loop that prints numbers from 1 to 5, but mistakenly use `i < 5` instead of `i <= 5`.

```java
for (int i = 1; i < 5; i++) {
    System.out.println(i);  // Will print 1 to 4, not 1 to 5
}
```

**What Happens**:
- The loop prints numbers from 1 to 4 because the condition `i < 5` excludes 5.

**Solution**:
- Use `i <= 5` to include 5 in the loop.
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);  // Will print 1 to 5
}
```

---

### **Mistake 2: Using Post-Increment Instead of Pre-Increment**

**Scenario**: Write a loop to increment `i` after printing, but mistakenly use `i++` in the condition.

```java
int i = 1;
while (i++ <= 5) {
    System.out.println(i);  // Prints values from 2 to 6, not 1 to 5
}
```

**What Happens**:
- The post-increment `i++` increments `i` after the condition is evaluated, so it prints 2 to 6 instead of 1 to 5.

**Solution**:
- Use pre-increment in the condition or update `i` separately.
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

---

### Summary of Experiments

- **Single-Line vs. Multiple-Line Statements**: Observe the importance of braces in controlling which statements belong to the loop.
- **Semicolon Errors**: Avoid placing a semicolon at the end of the loop condition, which can lead to empty loops.
- **Variations of Loops**: Explore different forms of loops by omitting parts of the `for` loop header, such as initialization, condition, or update.
- **Logical Mistakes**: Be cautious of off-by-one errors, improper incrementing, or misunderstanding loop condition behavior.

These experiments are designed to help beginners identify and avoid common mistakes while gaining confidence with loops.

Would you like to proceed with the practice exercises now?

[Back to Top](#top)

#### Practice Exercises
Practice [Loops](../practice/java/foundations/loops) with exercises.

#### Next Topic: 
Go to [Arrays](../learn/java/foundations/arrays) to learn more with examples.
