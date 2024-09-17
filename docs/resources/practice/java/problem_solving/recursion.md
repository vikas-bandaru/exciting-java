---
layout: default
title: Recursion
parent: Problem Solving Techniques
nav_order: 3
grand_parent: Practice
---

# Practice Recursion

<details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. [Simple Recursion Exercises](#simple-recursion-exercises)
   {:toc}
2. [Medium Recursion Exercises](#medium-recursion-exercises)
   {:toc}
3. [Advanced Recursion Exercises](#advanced-recursion-exercises-with-memoization)
   {:toc}
</details>

## Recursion Practice Problems

Let’s start with some simple recursion exercises to build a solid understanding, then move to medium-level problems, and finally tackle exercises that require memoization or optimization.

## **Simple Recursion Exercises**

### **1. Sum of Natural Numbers**
Write a recursive method `sumToN(int n)` that returns the sum of natural numbers from 1 to `n`.

**Test Case**:
```java
sumToN(5);  // Output: 15 (1 + 2 + 3 + 4 + 5)
```

<details markdown="block">
   <summary>Answer</summary>
   ```java
   public int sumToN(int n) {
      if (n == 0) {  // Base case
         return 0;
      }
      return n + sumToN(n - 1);  // Recursive case
   }
   ```
</details>

### **2. Factorial**
Write a recursive method `factorial(int n)` that returns the factorial of `n`.

**Test Case**:
```java
factorial(5);  // Output: 120 (5 * 4 * 3 * 2 * 1)
```

<details markdown="block">
   <summary>Answer</summary>
   ```java
   public int factorial(int n) {
      if (n == 0) {  // Base case
         return 1;
      }
      return n * factorial(n - 1);  // Recursive case
   }
   ```
</details>

### **3. Power of a Number**
Write a recursive method `power(int base, int exp)` that returns `base` raised to the power of `exp`.

**Test Case**:
```java
power(2, 4);  // Output: 16 (2^4)
```

<details markdown="block">
   <summary>Answer</summary>
   ```java
   public int power(int base, int exp) {
      if (exp == 0) {  // Base case
         return 1;
      }
      return base * power(base, exp - 1);  // Recursive case
   }
   ```
</details>

### **4. Print Numbers from N to 1**
Write a recursive method `printToOne(int n)` that prints numbers from `n` to `1`.

**Test Case**:
```java
printToOne(5);  // Output: 5, 4, 3, 2, 1
```

<details markdown="block">
   <summary>Answer</summary>
   ```java
   public void printToOne(int n) {
      if (n == 0) {  // Base case
         return;
      }
      System.out.println(n);
      printToOne(n - 1);  // Recursive case
   }
   ```
</details>

### **5. Reverse a String**
Write a recursive method `reverseString(String s)` that returns the reverse of the string `s`.

**Test Case**:
```java
reverseString("hello");  // Output: "olleh"
```

<!-- <details markdown="block">
   <summary>Answer</summary>
   ```java
   public String reverseString(String s) {
      if (s.isEmpty()) {  // Base case
         return s;
      }
      return reverseString(s.substring(1)) + s.charAt(0);  // Recursive case
   }
   ```
</details> -->

## **Medium Recursion Exercises**

### **6. Fibonacci Sequence**
Write a recursive method `fibonacci(int n)` that returns the `n`th Fibonacci number.

**Test Case**:
```java
fibonacci(5);  // Output: 5 (Fibonacci sequence: 0, 1, 1, 2, 3, 5)
```

<!-- <details markdown="block">
   <summary>Answer</summary>
   ```java
   public int fibonacci(int n) {
      if (n == 0) {  // Base case
         return 0;
      } else if (n == 1) {
         return 1;
      }
      return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive case
   }
   ```
</details> -->

### **7. Count the Digits of a Number**
Write a recursive method `countDigits(int n)` that returns the number of digits in `n`.

**Test Case**:
```java
countDigits(12345);  // Output: 5
```

<details markdown="block">
   <summary>Answer</summary>
   ```java
   public int countDigits(int n) {
      if (n == 0) {  // Base case
         return 0;
      }
      return 1 + countDigits(n / 10);  // Recursive case
   }
   ```
</details>

### **8. Sum of Digits**
Write a recursive method `sumOfDigits(int n)` that returns the sum of the digits of `n`.

**Test Case**:
```java
sumOfDigits(123);  // Output: 6 (1 + 2 + 3)
```

<!-- <details markdown="block">
   <summary>Answer</summary>
   ```java
   public int sumOfDigits(int n) {
      if (n == 0) {  // Base case
         return 0;
      }
      return (n % 10) + sumOfDigits(n / 10);  // Recursive case
   }
   ```
</details> -->

### **9. Greatest Common Divisor (GCD)**
Write a recursive method `gcd(int a, int b)` that returns the greatest common divisor of `a` and `b`.

**Test Case**:
```java
gcd(48, 18);  // Output: 6
```

<!-- <details markdown="block">
   <summary>Answer</summary>
   ```java
   public int gcd(int a, int b) {
      if (b == 0) {  // Base case
         return a;
      }
      return gcd(b, a % b);  // Recursive case
   }
   ```
</details> -->

### **10. Decimal to Binary Conversion**
Write a recursive method `decimalToBinary(int n)` that returns the binary representation of `n` as a string.

**Test Case**:
```java
decimalToBinary(10);  // Output: "1010"
```

<!-- <details markdown="block">
   <summary>Answer</summary>
   ```java
   public String decimalToBinary(int n) {
      if (n == 0) {  // Base case
         return "0";
      }
      if (n == 1) {
         return "1";
      }
      return decimalToBinary(n / 2) + (n % 2);  // Recursive case
   }
   ```
</details> -->

## **Advanced Recursion Exercises (With Memoization)**

### **11. Fibonacci with Memoization**
Improve the Fibonacci sequence method using memoization to store already computed values.

**Test Case**:
```java
int[] memo = new int[6];  // Initialize memo array
fibonacciMemo(5, memo);  // Output: 5
```

<details markdown="block">
   <summary>Answer</summary>
   ```java
   public int fibonacciMemo(int n, int[] memo) {
      if (n == 0 || n == 1) {
         return n;  // Base case
      }
      if (memo[n] == 0) {  // Only compute if not already in memo
         memo[n] = fibonacciMemo(n - 1, memo) + fibonacciMemo(n - 2, memo);  // Recursive case
      }
      return memo[n];
   }
   ```
</details>

### **12. Climbing Stairs Problem**
There are `n` stairs, and you can climb 1 or 2 stairs at a time. Write a method `climbStairs(int n)` to calculate the number of distinct ways to reach the top.

**Test Case**:
```java
int[] memo = new int[6];
climbStairs(5, memo);  // Output: 8
```

<details markdown="block">
   <summary>Answer</summary>
   ```java
   public int climbStairs(int n, int[] memo) {
      if (n == 0 || n == 1) {  // Base cases
         return 1;
      }
      if (memo[n] == 0) {  // Only compute if not already in memo
         memo[n] = climbStairs(n - 1, memo) + climbStairs(n - 2, memo);  // Recursive case
      }
      return memo[n];
   }
   ```
</details>

### **13. Minimum Path Sum (2D Grid)**
Write a recursive method `minPathSum(int[][] grid)` that calculates the minimum path sum from the top-left to the bottom-right corner of a grid, using memoization.

**Test Case**:
```java
int[][] grid = { {1, 3, 1}, {1, 5, 1}, {4, 2, 1} };
int[][] memo = new int[3][3];
minPathSum(grid, 0, 0, memo);  // Output: 7
```

<details markdown="block">
   <summary>Answer</summary>
   ```java
   public int minPathSum(int[][] grid, int i, int j, int[][] memo) {
      if (i == grid.length - 1 && j == grid[0].length - 1) {  // Base case: reached bottom-right
         return grid[i][j];
      }
      if (i >= grid.length || j >= grid[0].length) {  // Out of bounds
         return Integer.MAX_VALUE;
      }
      if (memo[i][j] == 0) {
         int down = minPathSum(grid, i + 1, j, memo);
         int right = minPathSum(grid, i, j + 1, memo);
         memo[i][j] = grid[i][j] + Math.min(down, right);  // Recursive case
      }
      return memo[i][j];
   }
   ```
</details>

### **14. Longest Increasing Subsequence (LIS) with Memoization**
Write a recursive method `lis(int[] arr)` to find the length of the longest increasing subsequence in an array using memoization.

**Test Case**:
```java
int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80};
int[] memo = new int[arr.length + 1];
lis(arr, arr.length, memo);  // Output: 6
```

<details markdown="block">
   <summary>Answer</summary>
   ```java
   public int lis(int[] arr, int n, int[] memo) {
      if(n == 1) {  // Base case
         return 1;
      }
      if (memo[n] != 0) {
         return memo[n];
      }
      int maxEndingHere = 1;  // Initialize with length 1
      for (int i = 1; i < n; i++) {
         int res = lis(arr, i, memo);
         if (arr[i - 1] < arr[n - 1]) {
               maxEndingHere = Math.max(maxEndingHere, res + 1);
         }
      }
      memo[n] = maxEndingHere;
      return memo[n];
   }
   ```
</details>

### **15. Coin Change Problem**
Write a recursive method `coinChange(int[] coins, int amount)` that calculates the minimum number of coins needed to make up a given amount, using memoization.

**Test Case**:
```java
int[] coins = {1, 2, 5};
int[] memo = new int[12];
coinChange(coins, 11, memo);  // Output: 3 (11 = 5 + 5 + 1)
```

<details markdown="block">
   <summary>Answer</summary>
   ```java
   public int coinChange(int[] coins, int amount, int[] memo) {
      if (amount == 0) {  // Base case
         return 0;
      }
      if (memo[amount] != 0) {
         return memo[amount];
      }
      int minCoins = Integer.MAX_VALUE;
      for (int coin : coins) {
         if (amount - coin >= 0) {
               int result = coinChange(coins, amount - coin, memo);
               if (result >= 0 && result < minCoins) {
                  minCoins = result + 1;
               }
         }
      }
      memo[amount] = (minCoins == Integer.MAX_VALUE) ? -1 : minCoins;
      return memo[amount];
   }
   ```
</details>

These problems should help you gradually strengthen your understanding of recursion, from simple base case-recursive case exercises to more complex memoization-based optimization problems.

[Back to Top](#top)

<!-- #### Next Topic: 
Go to [Static](../../../learn/java/foundations/static) to learn more with examples. -->