---
layout: default
title: Code Writing Questions
parent: Objects and Classes
nav_order: 3
grand_parent: Practice Questions
---

# Practice Questions
## Soft Intro to Java (Objects & Classes)
### Code Writing

1. Calculate the number of days a person lived given their birth and death dates:
   ```java
   // Assume the person was born on January 1, 2000, and died on December 31, 2020.
   ```
   <details markdown="block">
     <summary>Answer</summary>
     The person lived for 7661 days.
   </details>

2. Write a line of code to declare a variable `temperature` and assign it a value of `36.6`.
   
   <details markdown="block">
     <summary>Answer</summary>
     double temperature = 36.6;
   </details>

3. Write a line of code to declare a `String` variable `greeting` and assign it the value `"Hello, World!"`.
   
   <details markdown="block">
     <summary>Answer</summary>
     String greeting = "Hello, World!";
   </details>

4. Given the following line of code:
   ```java
   int score = 10;
   ```
   Write the line of code to assign the value `50` to `score`.
   ```java
   score = 50;
   ```
   <details markdown="block">
     <summary>Answer</summary>
     score = 50;
   </details>

12. Complete the code snippet to print the following result:
    ```java
    +----------+
    |   Code   |
    +----------+
    public class NameInBox
    {
       public static void main(String[] args)
       {
          // TODO print Code in a box made from
          // characters - | +
       }
    }
    ```
    <details markdown="block">
      <summary>Answer</summary>
      ```java
      public class NameInBox
      {
         public static void main(String[] args)
         {
            System.out.println("+----------+");
            System.out.println("|   Code   |");
            System.out.println("+----------+");
         }
      }
      ```
    </details>

13. Write the code to construct a `Circle` with its center at `(150, 75)` and a radius of `25`. Assign it to a variable named `circle`. Use this construction parameters: (int x, int y, int radius)
    
    <details markdown="block">
      <summary>Answer</summary>
      Circle circle = new Circle(150, 75, 25);
    </details>

14. Write the code to construct a triangle with vertices at `(0, 0)`, `(10, 0)`, and `(5, 8.66)`. Assign it to a variable named `triangle`. Use this construction parameters: (int x1, int y1, int x2, int y2, int x3, int y3)
    
    <details markdown="block">
      <summary>Answer</summary>
      Triangle triangle = new Triangle(0, 0, 10, 0, 5, 8.66);
    </details>
