---
layout: default
title: Recursion
parent: Class Definitions
nav_order: 3
grand_parent: Experiment
---

# Experiments with Recursion
{: .no_toc}

<details open markdown="block">
  <summary>
    Topics
  </summary>
  {: .text-delta }
  1. [Experiment 1](#experiment-1-missing-base-case)
     {:toc}
  2. [Experiment 2](#experiment-2-incorrect-recursive-case)
     {:toc}
  3. [Experiment 3](#experiment-3-redundant-recursive-calls-in-fibonacci)
     {:toc}
</details>

## Experiments (What Could Go Wrong)

### **Experiment 1: Missing Base Case**

**Scenario**: Write a recursive method to calculate the sum of numbers from `n` to `0`, but forget the base case.

```java
public int sumToZero(int n) {
    return n + sumToZero(n - 1);  // Missing base case
}
```

**What Could Go Wrong**:
- This will cause infinite recursion and eventually a `StackOverflowError` because there’s no base case to stop the recursion.

**Solution**:
- Add a base case to stop the recursion when `n` reaches 0.

```java
public int sumToZero(int n) {
    if (n == 0) {
        return 0;  // Base case
    }
    return n + sumToZero(n - 1);
}
```

### **Experiment 2: Incorrect Recursive Case**

**Scenario**: Write a recursive method to calculate the factorial of `n`, but make a mistake in the recursive call.

```java
public int factorial(int n) {
    return n * factorial(n + 1);  // Incorrect recursive call
}
```

**What Could Go Wrong**:
- This will cause infinite recursion because `n` is increasing, not decreasing, so it will never reach the base case.

**Solution**:
- Ensure that the recursive call works towards the base case by decreasing `n`.

```java
public int factorial(int n) {
    if (n == 0) {
        return 1;  // Base case
    }
    return n * factorial(n - 1);  // Correct recursive call
}
```

### **Experiment 3: Redundant Recursive Calls in Fibonacci**

**Scenario**: Write a recursive method to calculate the Fibonacci sequence, but don’t account for the overlapping subproblems.

```java
public int fibonacci(int n) {
    if (n == 0) {
        return 0;
    } else if (n == 1) {
        return 1;
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2);  // Overlapping subproblems
    }
}
```

**What Could Go Wrong**:
- This implementation recalculates the same Fibonacci numbers multiple times, leading to inefficiency for large `n`.

**Solution**:
- Use memoization to store already-calculated Fibonacci values to avoid redundant calculations.

```java
public int fibonacci(int n, int[] memo) {
    if (n == 0 || n == 1) {
        return n;
    }
    if (memo[n] == 0) {
        memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
    }
    return memo[n];
}
```

[Back to Top](#top)

#### Practice Exercises
Practice [Recursion](../practice/java/foundations/recursion) with exercises.

<!-- #### Next Topic: 
Go to [Conditionals](../learn/java/foundations/decisions) to learn more with examples. -->
