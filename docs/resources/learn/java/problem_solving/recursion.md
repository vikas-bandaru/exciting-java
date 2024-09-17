---
layout: default
title: Recursion
nav_order: 8
parent: Problem Solving Techniques
grand_parent: Learn
---

# Methods: Recursion

Let's break down the concept of recursion, starting from the basics, followed by how to construct recursive functions, and finally, practice some common recursive problems to establish a clear understanding.

<details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. [Why Recursion?](#1-why-motivation-to-use-recursion)
   {:toc}
2. [How and Where?](#2-how-syntax--tester-code-and-where-logical-placement)
   {:toc}
3. [When?](#3-when-scenarios-of-situations-when-recursion-can-be-used)
   {:toc}
4. [General Confusions](#4-how-to-decide---any-general-confusions-for-absolute-beginners)
   {:toc}
</details>

## 1. Why (Motivation to Use Recursion)

### **Why Use Recursion?**

**Scenario 1: Solving Problems with Repetitive Structure**
Recursion is used when a problem can be broken down into smaller subproblems that are similar to the original problem. For example, calculating the factorial of a number is naturally recursive because the factorial of `n` can be defined in terms of the factorial of `n-1`.

**Scenario 2: Working with Recursive Data Structures**
In scenarios such as navigating tree-like structures (e.g., file systems or hierarchical data), recursion simplifies the traversal. Problems like traversing a binary tree or searching directories are handled elegantly with recursion.

**Scenario 3: Simplifying Code for Complex Problems**
Some problems, like finding the Fibonacci sequence or solving the Tower of Hanoi, can be expressed more clearly using recursion. While these problems can be solved using loops, recursion often provides a more intuitive and cleaner solution.

Let’s move on to understanding how recursion works syntactically and how to structure a recursive method.

## 2. How (Syntax + Tester Code) and Where (Logical Placement)

### **How to Structure a Recursive Method**

**Key Points of a Recursive Method**:
1. **Base Case**: The condition under which the recursion stops, preventing infinite loops.
2. **Recursive Case**: The part of the method where the method calls itself with a smaller or simpler input.

Here’s the basic structure of a recursive function:

```java
public returnType recursiveMethod(parameters) {
    if (base case condition) {
        return base case value;  // Stop recursion
    } else {
        // Recursive call with a simpler or smaller problem
        return recursiveMethod(smallerProblem);
    }
}
```

### **Example: Factorial**

**Scenario**: Calculate the factorial of a number `n`, where the factorial of `n` is `n * factorial(n-1)`.

**Base Case**: When `n` is 0, the factorial is 1.

**Recursive Case**: For any number greater than 0, the factorial of `n` is `n * factorial(n-1)`.

```java
public int factorial(int n) {
    if (n == 0) {  // Base case
        return 1;
    } else {  // Recursive case
        return n * factorial(n - 1);
    }
}
```

**Test**:
```java
public class RecursionTester {
    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));  // Should print 120
    }
}
```

**Where to Use Recursion**:
- Use recursion when the problem involves repetitive tasks where each step is smaller than the last, like calculating factorial, Fibonacci, or tree traversal.
- Ensure there’s a **clear base case** to stop the recursion, preventing infinite calls.

## 3. When (Scenarios of Situations When Recursion Can Be Used)

### **1. Factorial Calculation**
- **Scenario**: Factorial calculation is an example where the problem naturally breaks down into smaller subproblems. Factorial of `n` is `n * factorial(n-1)` until `n` equals 0.

### **2. Fibonacci Sequence**
- **Scenario**: Calculating the Fibonacci sequence, where each number in the sequence is the sum of the two preceding ones, can be solved recursively.

```java
public int fibonacci(int n) {
    if (n == 0) {
        return 0;  // Base case
    } else if (n == 1) {
        return 1;  // Base case
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive case
    }
}
```

### **3. Binary Tree Traversal**
- **Scenario**: Traversing a binary tree (e.g., inorder, preorder, or postorder traversal) is a recursive process. Each node in the tree can be thought of as the root of its own subtree, and the traversal problem breaks down into the traversal of smaller subtrees.

### **4. Tower of Hanoi**
- **Scenario**: In the Tower of Hanoi problem, you need to move disks between rods under specific constraints. This classic problem is easier to conceptualize using recursion because the solution to the problem of moving `n` disks involves solving the problem for `n-1` disks.

Let’s move on to how you can decide whether to use recursion and how to structure the recursive function based on the problem.

## 4. How to Decide - Any General Confusions for Absolute Beginners

### **How to Decide When to Use Recursion**

**1. Can the Problem Be Broken Down?**
- **Question**: Can you break down the problem into smaller versions of the same problem? If so, recursion might be a good fit.
- **Guideline**: Use recursion for problems like factorials, Fibonacci sequence, and tree traversal where solving smaller subproblems can be combined to solve the larger problem.

**2. Is There a Clear Base Case?**
- **Question**: Is there a natural stopping point for the recursion? Can you define a base case that terminates the recursive calls?
- **Guideline**: Every recursive function should have a clear base case to prevent infinite recursion.

**3. Does the Problem Involve a Hierarchical Structure?**
- **Question**: Is the problem structured in layers, such as a tree or graph? If so, recursion often simplifies the code by allowing you to process one layer at a time.
- **Guideline**: Use recursion for tree-like structures (e.g., binary trees, file systems) where each node or folder can be broken down into smaller parts.

**4. Is Iteration More Efficient?**
- **Question**: Could the problem be solved more efficiently using loops? Recursion can be elegant but might be less efficient than iteration for large inputs.
- **Guideline**: For problems that require deep recursion, consider whether iteration might be a better fit. For example, Fibonacci numbers can be calculated more efficiently with loops to avoid redundant calculations.

### **Common Confusions for Beginners**

**1. Forgetting the Base Case**
- **Explanation**: A common mistake for beginners is to forget to define the base case, leading to infinite recursion. Always define a base case that will stop the recursion at some point.

**2. Overusing Recursion**
- **Explanation**: Not every problem is suited for recursion. Beginners might overuse recursion when a loop would be more efficient. Be mindful of when recursion is truly needed.

**3. Stack Overflow**
- **Explanation**: Recursion depth is limited by the stack size. Beginners might encounter stack overflow errors if the recursion depth is too large (e.g., calculating Fibonacci for a large `n`).

Now that we have covered how to decide when to use recursion, let’s experiment with recursive methods to better understand their behavior.

[Back to Top](#top)

#### Recursion Experiments
Experiment with [Recursion](../../../experiment/recursion) exercises.

#### Practice Exercises
Practice [Recursion](../../../practice/java/foundations/recursion) with exercises.