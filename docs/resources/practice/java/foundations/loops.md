---
layout: default
title: Loops
parent: Class Definitions
nav_order: 7
grand_parent: Practice
---

# Practice Writing Loops (Repetitive Blocks)
{: .no_toc}

<details open markdown="block">
  <summary>
    Topics
  </summary>
  {: .text-delta }
  1. [Sum and it's Variants](#exercise-1-sum-of-natural-numbers)
     {:toc}
  2. [Product and it's Variants](#exercise-2-factorial-of-a-number)
     {:toc}
  3. [Max/Min and it's Variants](#exercise-3-find-maximum-element-in-array)
     {:toc}
  4. [Counting and it's Variants](#exercise-4-count-even-numbers-in-array)
     {:toc}
  5. [Reverse and it's Variants](#exercise-5-reverse-an-array)
     {:toc}
</details>

## Practice Exercises

### **Exercise 1: Sum of Natural Numbers**

**Problem**: Write a `for` loop to calculate the sum of the first `n` natural numbers.

<details markdown="block">
   <summary>Solution</summary>

   ```java
   int sum = 0;
   for (int i = 1; i <= n; i++) {
      sum += i;
   }
   System.out.println("Sum: " + sum);
   ```
</details>

### Variants
1. **Sum of Even Numbers**  
   **Problem:** Write a `for` loop to calculate the sum of the first `n` even numbers.
2. **Sum of Odd Numbers**  
   **Problem:** Write a `for` loop to calculate the sum of the first `n` odd numbers.
3. **Sum of Multiples of 3**  
   **Problem:** Write a `for` loop to calculate the sum of the first `n` multiples of 3.
4. **Sum of Squares of Numbers**  
   **Problem:** Write a `for` loop to calculate the sum of the squares of the first `n` natural numbers.

### **Exercise 2: Factorial of a Number**

**Problem**: Write a `while` loop to calculate the factorial of a number `n`.

<details markdown="block">
   <summary>Solution</summary>

   ```java
   int factorial = 1;
   int i = n;
   while (i > 0) {
      factorial *= i;
      i--;
   }
   System.out.println("Factorial: " + factorial);
   ```
</details>

### Variants
1. **Product of Even Numbers**  
   **Problem:** Write a `while` loop to calculate the product of the first `n` even numbers.
2. **Product of Odd Numbers**  
   **Problem:** Write a `while` loop to calculate the product of the first `n` odd numbers.
3. **Double Factorial**  
   **Problem:** Write a `while` loop to calculate the double factorial of a number `n`, which is the product of all integers of the same parity as n.  
   If `n` is odd, calculate `n * (n - 2) * (n - 4) * ... * 1`.  
   If `n` is even, calculate `n * (n - 2) * (n - 4) * ... * 2`.  

### **Exercise 3: Find Maximum Element in Array**

**Problem**: Write a `for` loop to find the maximum value in an array.

<details markdown="block">
   <summary>Solution</summary>

   ```java
   int[] arr = {10, 50, 30, 70, 20};
   int max = arr[0];
   for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
         max = arr[i];
      }
   }
   System.out.println("Max value: " + max);
   ```
</details>

### Variants
1. **Find Minimum Element in Array**  
   **Problem:** Write a `for` loop to find the minimum value in an array.
2. **Find Second Maximum Element in Array**  
   **Problem:** Write a `for` loop to find the second maximum value in an array.
3. **Find Index of Maximum Element**  
   **Problem:** Write a `for` loop to find the index of the maximum value in an array.

### **Exercise 4: Count Even Numbers in Array**

**Problem**: Write an enhanced `for` loop (for-each) to count how many even numbers are in an array.

<details markdown="block">
   <summary>Solution</summary>

   ```java
   int[] arr = {1, 2, 3, 4, 5, 6};
   int evenCount = 0;
   for (int num : arr) {
      if (num % 2 == 0) {
         evenCount++;
      }
   }
   System.out.println("Even numbers count: " + evenCount);
   ```
</details>

### Variants
1. **Count Odd Numbers in Array**  
   **Problem:** Write an enhanced `for` loop to count how many odd numbers are in an array.
2. **Count Prime Numbers in Array**  
   **Problem:** Write an enhanced `for` loop to count how many prime numbers are in an array.
3. **Count Numbers Greater Than a Threshold**  
   **Problem:** Write an enhanced `for` loop to count how many numbers in an array are greater than a given threshold value `k`.

### **Exercise 5: Reverse an Array**

**Problem**: Write a `for` loop to reverse the elements of an array.

<details markdown="block">
   <summary>Solution</summary>

   ```java
   int[] arr = {1, 2, 3, 4, 5};
   for (int i = 0; i < arr.length / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
   }
   System.out.println(Arrays.toString(arr));  // Prints reversed array
   ```
</details>

### Variants
1. **Reverse a String**  
   **Problem:** Write a for loop to reverse a string.
2. **Reverse Digits of a Number**  
   **Problem:** Write a `while` loop to reverse the digits of a number.
3. **Reverse Every Word in a Sentence**  
   **Problem:** Write a `for` loop to reverse every word in a given sentence.

---

### Summary

Loops are essential for repeating tasks, traversing data structures, and automating calculations. By understanding the different types of loops (`for`, `while`, `do-while`, enhanced `for`), their syntax, and common use cases, you can efficiently solve a variety of problems in programming. These practice exercises help reinforce these concepts.

[Back to Top](#top)

#### Next Topic: 
Go to [Arrays](../../../learn/java/foundations/arrays) to learn more with examples.