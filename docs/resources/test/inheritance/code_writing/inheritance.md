---
layout: default
title: Code Writing Questions
parent: Inheritance
nav_order: 4
grand_parent: Test Yourself
---

# Practice Questions (Code Writing)
## Inheritance

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
1. A labeled point has an x- and y-position and a label.

   Implement the toString method of the LabeledPoint class.  

   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-inher-103)

2. All vehicles used for transportation in the U.S. must have identification, which varies according to the type of vehicle. For example, all automobiles have a unique Vehicle Identification Number (VIN) assigned by the manufacturer, plus a license plate number assigend by the state in which the auto is registerd.

   Modify the `Auto` class to include an instance variable for the license plate number. Implement the constructor so that an `Auto` can be constructed with a VIN and a license plate number.

   Override the `getID()` method to return the id of the auto as shown in this format: `VIN=1234567890,plate=ABC123` (without any spaces).  

   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-inher-106)

3. Complete the `Car` class below so that it inherits from the given `Vehicle` class. Cars lose value over time. In this example, you should assume that the value is reduced by 25 cents per mile driven, until it reaches zero.

   Do *not* add *any* instance variables to the `Car` class.  

   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-inher-107)

[Back to Top](#top)

<!-- ### Medium Level Code Writing Questions
1. Suppose you want to implement a class `TimeDepositAccount`. A time deposit account has a fixed interest rate that should be set in the constructor, together with the initial balance. Provide a method to get the current balance. Provide a method to add the earned interest to the account. This method should have no arguments because the interest rate is already known. It should have no return value because you already provided a method for obtaining the current balance. It is not possible to deposit additional funds into this account. Provide a withdraw method that removes the entire balance. Partial withdrawals are not allowed.

2. 

[Back to Top](#top) -->

### Medium CodeCheck Questions

1. You are given a class Rectangle that produces “ASCII art” rectangles such as the following:

   ```
   +-------------+  
   |             |  
   |             |  
   |             |  
   |             |  
   |             |  
   +-------------+  
   ```
   The code is given below.

   Your task is to produce a subclass FilledRectangle that produces figures such as

   ```
   +-------------+  
   |#############|  
   |#############|  
   |#############|  
   |#############|  
   |#############|  
   +-------------+  
   ```
   (when the fill character is #).  

   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-inher-101)

2. You are given a class Rectangle that produces “ASCII art” rectangles such as the following:

   ```
   +-------------+  
   |             |  
   |             |  
   |             |  
   |             |  
   |             |  
   +-------------+  
   ```
   The code is given below.

   Your task is to produce a subclass TitledRectangle that produces figures such as

   ```
   +-------------+  
   |             |  
   |             |  
   |    Hello    |  
   |             |  
   |             |  
   +-------------+  
   ```
   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-inher-102)

[Back to Top](#top)

<!-- ### Hard Level Code Writing Questions
1. 

[Back to Top](#top) -->
