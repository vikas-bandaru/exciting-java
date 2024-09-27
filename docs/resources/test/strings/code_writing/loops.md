---
layout: default
title: Code Writing Questions
parent: Strings
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
1. Complete the program below so that it prompts for a string of characters, prints out the last character of the string, followed by the first character of the string, followed the three middle characters of the string. You may assume that all the inputs string are of odd length and have at least five characters.  
   For example, if the user enters the string aforesaid, you should print  
   dares  
   [Solve it here](https://codecheck.io/files/wiley/codecheck-bjlo-1-fundat-105)
2. Complete the program below so that it prompts for a string and an integer n, that is no larger than the length of the string, and then prints out the last n characters of that string. For example, given the input string, "Hello, World!" along with the integer 5, the output should be  
   orld!  
   [Solve it here](https://codecheck.io/files/wiley/codecheck-bjlo-1-fundat-104)
3. Write a method getLastFirst whose parameter is a string containing a name such as "Harry Smith" and that returns a string with the last name followed by a comma and the first name, like this: "Smith, Harry"  
   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-fundat-109)
4. Complete the program below, named Initials.java, to read in a first name, a middle name, and a last name, and then print out the three initials as a single string. For example, if the three input names are James, Paul, and Jones, then the output should be JPJ.  
   [Solve it here](https://codecheck.io/files/wiley/codecheck-bjlo-1-fundat-109)
5. Complete the initials method in the class below. For example, the call initials("Harry", "Joseph", "Hacker") should return the string "HJH".  
   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-fundat-104)

[Back to Top](#top)

<!-- ### Medium Level Code Writing Questions
1. Suppose you want to implement a class `TimeDepositAccount`. A time deposit account has a fixed interest rate that should be set in the constructor, together with the initial balance. Provide a method to get the current balance. Provide a method to add the earned interest to the account. This method should have no arguments because the interest rate is already known. It should have no return value because you already provided a method for obtaining the current balance. It is not possible to deposit additional funds into this account. Provide a withdraw method that removes the entire balance. Partial withdrawals are not allowed.

2. 

[Back to Top](#top) -->

### Medium CodeCheck Questions


[Back to Top](#top)

<!-- ### Hard Level Code Writing Questions
1. 

[Back to Top](#top) -->
