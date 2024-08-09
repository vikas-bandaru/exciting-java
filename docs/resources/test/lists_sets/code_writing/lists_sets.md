---
layout: default
title: Code Writing Questions
parent: Lists & Sets
nav_order: 4
grand_parent: Test Yourself
---

# Practice Questions (Code Writing)
## Lists & Sets

<!-- <details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. [Easy Level Code Writing Questions](#easy-level-code-writing-questions)
   {:toc}
2. [Easy CodeCheck Questions](#codecheck-questions)
   {:toc}
3. [Medium Level Code Writing Questions](#medium-level-code-writing-questions)
   {:toc}
4. [Medium CodeCheck Questions](#medium-codecheck-questions)
   {:toc}
5. [Hard Level Code Writing Questions](#hard-level-code-writing-questions)
   {:toc}
</details> -->

<!-- ### Easy Level Code Writing Questions

1. Consider the following implementation of a class `Square`:  

   ```java
   public class Square
   {
      private int sideLength; 
      private int area; // Not a good idea 

      public Square(int length)
      {
         sideLength = length;
      } 
      public int getArea() {
         area = sideLength * sideLength; return area;
      } 
   }
   ```

   Why is it not a good idea to introduce an instance variable for the area? Rewrite the class so that area is a local variable.

2. 

[Back to Top](#top) -->

### CodeCheck Questions
1. You want to collect all “short” words in an array of words, that is, words with at most three characters. Since you don't know in advance how many short words there are, collect them in an array list, not an array.  

   For example, if you are passed an array containing the words

   "Mary", "had", "a", "little", "lamb"  

   you would return an array list containing the words

   "had", "a"  

   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-array-102)

2. You want to pick a particular “short” word in an array of words, that is, words with at most three characters.

   For example, if you are passed an array containing the words

   "Mary", "had", "a", "little", "lamb"

   and you are asked to return the second short word, you would return

   "a"  

   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-array-103)

3. You are given a class similar to the TicTacToe board in Section 7.6, but the board can have more than 3 rows and columns.

   Your task is to complete a method that fills the two diagonals with asterisks, like this:

   ```
   *      *
    *    * 
     *  *  
      **   
      **   
     *  *  
    *    * 
   *      *
   ```
   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-array-104)

4. You are given a class similar to the TicTacToe board in Section 7.6, but the board can have more than 3 rows and columns.

   Your task is to complete a method that fills the four borders (that is, all cells at the left, right, top, and bottom boundary) with asterisks, like this:

   ```
   ********
   *      *
   *      *
   *      *
   *      *
   *      *
   *      *
   ********  
   ```
   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-array-105)

[Back to Top](#top)

<!-- ### Medium Level Code Writing Questions
1. Suppose you want to implement a class `TimeDepositAccount`. A time deposit account has a fixed interest rate that should be set in the constructor, together with the initial balance. Provide a method to get the current balance. Provide a method to add the earned interest to the account. This method should have no arguments because the interest rate is already known. It should have no return value because you already provided a method for obtaining the current balance. It is not possible to deposit additional funds into this account. Provide a withdraw method that removes the entire balance. Partial withdrawals are not allowed.

2. 

[Back to Top](#top) -->

<!-- ### Medium CodeCheck Questions

1. The "elite hackers" like to make their text look cool by replacing characters with similar-looking symbols: e becomes 3, i becomes 1, l becomes 7, and o becomes 0. Write a program to carry out these replacements with a sample string.  
   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-object-101)

2. 

[Back to Top](#top) -->

<!-- ### Hard Level Code Writing Questions
1. 

[Back to Top](#top) -->
