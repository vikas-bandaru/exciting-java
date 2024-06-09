---
layout: default
title: Self Check
parent: Objects and Classes
nav_order: 1
grand_parent: Practice Questions
---

# Check Your Understanding
## Soft Intro to Java with BlueJ (Objects & Classes)

<details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. [Problem Domains and Real World Objects](#problem-domains-and-real-world-objects)
   {:toc}
2. [Reading Documentation](#reading-documentation)
   {:toc}
3. [Variable Declaration](#variable-declaration)
   {:toc}
4. [Assignment Statements & Expressions](#assignment-statements--expressions)
   {:toc}
5. [Methods: Header and Parameters](#methods-header-and-parameters)
   {:toc}
6. [String and its methods](#string-and-its-methods)
   {:toc}
7. [Object Creation](#object-creation)
   {:toc}
</details>

### Problem Domains and Real World Objects
1. In Java, objects are grouped into classes according to their behavior. Would a window object and a water heater object belong to the same class or to different classes? Why?

2. Some light bulbs use a glowing filament, others use a fluorescent gas. If you consider a light bulb a Java object with an “illuminate” method, would you need to know which kind of bulb it is?

### Reading Documentation
1. Give three examples of objects that belong to the String class. Give an example of an object that belongs to the PrintStream class. Name two methods that belong to the String class but not the PrintStream class. Name a method of the PrintStream class that
does not belong to the String class.

2. Consult the API documentation to find methods for 
   - Concatenating two strings, that is, making a string consisting of the first string, followed by the second string.
   - Removing leading and trailing white space of a string. 
   - Converting a rectangle to a string. 
   - Computing the smallest rectangle that contains two given rectangles. 
   - Returning a random floating-point number.  
   
   For each method, list the class in which it is defined, the return type, the method name, and the types of the arguments.

### Variable Declaration
1. Declare and initialize variables for holding the price and the description of an item that is available for sale.

### Assignment Statements & Expressions
1. What is the value of mystery after this sequence of statements?  
   ```java
   int mystery = 1;   
   mystery = 1 - 2 * mystery;  
   mystery = mystery + 1;  
   ```

2. What is wrong with the following sequence of statements?  
   ```java
   int mystery = 1;  
   mystery = mystery + 1;  
   int mystery = 1 - 2 * mystery;
   ```

3. Explain the difference between the = symbol in Java and in mathematics. 

### Methods: Header and Parameters
4. Give an example of a method that has an argument of type `int`. Give an example of a method that has a return value of type `int`. Repeat for the type `String`.

### String and its methods
5. Write Java statements that initialize a string `message` with "Hello" and then change it to "HELLO". Use the `toUpperCase` method.

6. Write Java statements that initialize a string `message` with "Hello" and then change it to "hello". Use the `replace` method.

7. Explain the difference between an object and an object variable. 

### Object Creation
8. Give the Java code for constructing an *object* of class `Rectangle`, and for declaring an *object variable* of class `Rectangle`.

9. Give Java code for objects with the following descriptions:  
   1. A rectangle with center (100, 100) and all side lengths equal to 50  
   2. A string with the contents “Hello, Dave”  
   
   Create objects, not object variables.

10. Repeat above exercise, but now declare object variables that are initialized with the required objects.

11. Write a Java statement to initialize a variable square with a rectangle object whose top-left corner is (10, 20) and whose sides all have length 40. Then write a statement that replaces square with a rectangle of the same size and top-left corner (20, 20).

12. Find the errors in the following statements:  
    1. `Rectangle r = (5, 10, 15, 20);`  
    2. `double width = Rectangle(5, 10, 15, 20).getWidth();`  
    3. `Rectangle r;`  
       `r.translate(15, 25);`  
    4. `r = new Rectangle();`  
       `r.translate("far, far away!");`

