---
layout: default
title: Brute Force
nav_order: 1
parent: Problem Solving Techniques
grand_parent: Learn
---

# Problem Solving Technique: Brute Force

Here’s a list of common techniques using **loops** and **conditionals** that you should master before diving into optimization techniques. These basic concepts form the foundation for most problem-solving approaches.

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

## 1. **Simple Loops**
   - **Description**: Use loops to iterate over elements (e.g., arrays, lists, strings).
   - **Example**: Print numbers from 1 to 10.
   - **When to use**: For basic iterations over a range of numbers or collections.
   - **Key Practice**:
     - `for` loop
     - `while` loop
     - `do-while` loop
   - **Difficulty**: ★☆☆☆☆ (Easy)

## 2. **Nested Loops**
   - **Description**: Place loops inside loops to handle multi-dimensional data (e.g., 2D arrays).
   - **Example**: Print a multiplication table.
   - **When to use**: When iterating through multiple dimensions or comparing elements pairwise.
   - **Key Practice**:
     - 2D arrays
     - Matrices
   - **Difficulty**: ★★☆☆☆ (Moderate)

## 3. **Conditional Statements**
   - **Description**: Use `if`, `else if`, and `else` statements to make decisions based on conditions.
   - **Example**: Check if a number is positive, negative, or zero.
   - **When to use**: For making decisions within loops or standalone logic.
   - **Key Practice**:
     - `if` condition
     - `else if`
     - `else`
   - **Difficulty**: ★☆☆☆☆ (Easy)

## 4. **Loop with Conditionals**
   - **Description**: Combine loops with conditional statements to solve problems based on specific criteria.
   - **Example**: Find all even numbers in an array.
   - **When to use**: Problems where you need to iterate through data and apply some condition to each element.
   - **Key Practice**:
     - Filtering elements in arrays
     - Counting specific elements
   - **Difficulty**: ★★☆☆☆ (Moderate)

## 5. **Finding Maximum/Minimum**
   - **Description**: Iterate through a collection and use conditionals to find the maximum or minimum value.
   - **Example**: Find the largest number in an array.
   - **When to use**: For problems where you need to identify extreme values in a set.
   - **Key Practice**:
     - Iterating with comparisons (`>`, `<`)
   - **Difficulty**: ★★☆☆☆ (Moderate)

## 6. **Summation and Product**
   - **Description**: Use loops to calculate the sum or product of elements in a collection.
   - **Example**: Calculate the sum of all elements in an array.
   - **When to use**: Any problem that requires accumulation of values.
   - **Key Practice**:
     - Accumulator variables (e.g., `sum`, `product`)
   - **Difficulty**: ★☆☆☆☆ (Easy)

## 7. **Counting Elements**
   - **Description**: Count occurrences of a specific condition or value using loops and conditionals.
   - **Example**: Count the number of vowels in a string.
   - **When to use**: For problems that require counting based on specific criteria.
   - **Key Practice**:
     - Using a counter variable with a loop
   - **Difficulty**: ★★☆☆☆ (Moderate)

## 8. **Reversing a List or String**
   - **Description**: Iterate through a list or string and reverse its order.
   - **Example**: Reverse a string.
   - **When to use**: String manipulation or reversing sequences.
   - **Key Practice**:
     - Use a loop to swap elements from both ends of the array/string.
   - **Difficulty**: ★★☆☆☆ (Moderate)

## 9. **Linear Search**
   - **Description**: Search for an element in an array by checking each element one by one.
   - **Example**: Find if a number exists in an array.
   - **When to use**: Basic search tasks on unsorted data.
   - **Key Practice**:
     - Sequential comparison using loops
   - **Difficulty**: ★☆☆☆☆ (Easy)

## 10. **Palindrome Check**
   - **Description**: Use loops and conditionals to check if a string or number is the same when reversed.
   - **Example**: Check if "madam" is a palindrome.
   - **When to use**: Problems involving symmetry or string reversal.
   - **Key Practice**:
     - Comparing characters from both ends of a string
   - **Difficulty**: ★★☆☆☆ (Moderate)

## 11. **Swapping Elements**
   - **Description**: Use conditionals and temporary variables to swap two elements.
   - **Example**: Swap two numbers in an array.
   - **When to use**: When rearranging or sorting data.
   - **Key Practice**:
     - Temporary variables for holding values
   - **Difficulty**: ★☆☆☆☆ (Easy)

## 12. **Pattern Printing**
   - **Description**: Use nested loops to print patterns (e.g., triangles, squares, pyramids).
   - **Example**: Print a right-angled triangle of stars.
   - **When to use**: For visual patterns or grid problems.
   - **Key Practice**:
     - Control inner and outer loops for different rows and columns
   - **Difficulty**: ★★☆☆☆ (Moderate)

## 13. **Checking Prime Numbers**
   - **Description**: Use loops and conditionals to check if a number is divisible only by 1 and itself.
   - **Example**: Check if a number is prime.
   - **When to use**: Problems related to number theory and primes.
   - **Key Practice**:
     - Loops up to *sqrt(n)*
   - **Difficulty**: ★★☆☆☆ (Moderate)

## 14. **Factorial Calculation**
   - **Description**: Use loops to calculate the factorial of a number (e.g., *n! = n x (n-1) x ... x 1* ).
   - **Example**: Calculate 5! = 5 × 4 × 3 × 2 × 1 = 120.
   - **When to use**: Problems requiring multiplicative accumulation.
   - **Key Practice**:
     - Loop from 1 to *n*, multiplying each value.
   - **Difficulty**: ★☆☆☆☆ (Easy)

## 15. **Fibonacci Series**
   - **Description**: Generate the Fibonacci sequence using loops.
   - **Example**: Print the first 10 Fibonacci numbers.
   - **When to use**: Number sequence generation problems.
   - **Key Practice**:
     - Track the last two numbers in the sequence using variables.
   - **Difficulty**: ★★☆☆☆ (Moderate)

---

## Summary:

- **Easiest Techniques**: Simple loops, conditionals, summation/product, linear search, swapping elements.
- **Moderate Difficulty**: Nested loops, pattern printing, prime number checking, palindrome checks, reversing strings/lists.
  
Mastering these basic techniques will make it easier to tackle more advanced topics like recursion, sorting algorithms, and optimization.

[Back to Top](#top)

#### Brute Force Experiments
Experiment with [Brute Force](../../../experiment/bruteforce) exercises.

#### Brute Force Exercises
Practice [Brute Force](../../../practice/java/foundations/bruteforce) with exercises.