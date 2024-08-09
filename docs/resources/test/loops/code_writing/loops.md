---
layout: default
title: Code Writing Questions
parent: Loops
nav_order: 4
grand_parent: Test Yourself
---

# Practice Questions (Code Writing)
## Loops

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

<details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
2. [Easy CodeCheck Questions](#codecheck-questions)
   {:toc}
4. [Medium CodeCheck Questions](#medium-codecheck-questions)
   {:toc}
</details>

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
1. Your task is to write a method getVowels that gets the vowels in a string. For example, the call getVowels("Hello, World!") should return the string "eoo".  

   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-loop-101)

2. Your task is to write a method evenSum that computes the sum of all even numbers between two given numbers. For example, the call evenSum(3, 8) should return 4 + 6 + 8 = 18.  

   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-loop-102)

3. Your task is to write a method stutter that repeats all letters t in a string. For example, the call stutter("stutter") should return "sttutttter".  

   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-loop-103)

5. Your task is to write a method countSevens that counts the number of digits equal to 7 in a given number. For example, the call countSevens(1797) should return 2 since the number contains two digits 7.  

   *Hint:* Repeatedly compute % 10 and / 10.  

   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-loop-105)

6. When people enter their telephone numbers into a form they use many different formats. Some examples are:  

   (444) 999-1234  
   4449991234  
   444.999.1234  
   In the `PhoneNumbers` class below, complete the `cleanNumber` method. It takes a string and extracts the numeric digits from the string. If there are exactly 10 numeric digits, the number is reformatted: `(###) ###-####` and returned. If there are any other number of digits, the string "Error" is returned.  
   *Hint:* Use the `Character.isDigit` method to check whether a character is a digit.  

   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-loop-106)

[Back to Top](#top)

<!-- ### Medium Level Code Writing Questions
1. Suppose you want to implement a class `TimeDepositAccount`. A time deposit account has a fixed interest rate that should be set in the constructor, together with the initial balance. Provide a method to get the current balance. Provide a method to add the earned interest to the account. This method should have no arguments because the interest rate is already known. It should have no return value because you already provided a method for obtaining the current balance. It is not possible to deposit additional funds into this account. Provide a withdraw method that removes the entire balance. Partial withdrawals are not allowed.

2. 

[Back to Top](#top) -->

### Medium CodeCheck Questions

1. Your task is to write a method countPerfectSquares that counts all perfect squares in a given range. For example, the call countPerfectSquares(5, 25) should return 3 (since 9, 16, and 25 are perfect squares between 5 and 25).  

   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-loop-104)

2. A simple technique for compressing an image is run-length encoding. The color of each pixel or area is specified for an image. The color pallette can be specified by the first letter of each color (R, G, B, C, M, Y, K, W) - red, green, blue, cyan, magenta, yellow, black, white. An example 6 by 4 image is:  

    RRRGGGYYYYWBWWRGBBBBBRRR  

   Run-length encoding counts the number of each color in a group and replaces the individual color values by a number and the color. For our example, this would give:  

   3R3G4Y1W1B2W1R1G5B3R  

   Complete the compressImage method to run-length compress a string of characters.  

   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-loop-108)

[Back to Top](#top)

<!-- ### Hard Level Code Writing Questions
1. 

[Back to Top](#top) -->
