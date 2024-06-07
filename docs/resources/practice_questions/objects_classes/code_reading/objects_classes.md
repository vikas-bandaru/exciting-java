---
layout: default
title: Code Snippets Questions
parent: Objects and Classes
nav_order: 2
grand_parent: Practice Questions
---

# Practice Questions
## Soft Intro to Java (Objects & Classes)
### Multiple Choice Questions (Code Snippets)

1. Given a `Person` class with a constructor that initializes the name and age of a person and a method `getName` that returns the name, what will be the output of the following code snippet?
   ```java
   Person p = new Person("Alice", 30);
   System.out.println(p.getName());
   ```
   <form>
     <input type="radio" name="q1" value="a"> Alice<br>
     <input type="radio" name="q1" value="b"> 30<br>
     <input type="radio" name="q1" value="c"> null<br>
     <input type="radio" name="q1" value="d"> Compilation error
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     a) Alice
   </details>

2. Given a `Rectangle` class with a constructor that initializes its width and height, and a method `area` that returns the area of the rectangle, what will be the return value of the given method call?
   ```java
   Rectangle rect = new Rectangle(3, 4);
   rect.area();
   ```
   <form>
     <input type="radio" name="q2" value="a"> 7<br>
     <input type="radio" name="q2" value="b"> 12<br>
     <input type="radio" name="q2" value="c"> 0<br>
     <input type="radio" name="q2" value="d"> Compilation error
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     b) 12
   </details>

3. What will be the output of the following code snippet?
   ```java
   int a = 10;
   int b = 20;
   System.out.println(a + b + "" + a + a + "" + b);
   ```
   <form>
     <input type="radio" name="q3" value="a"> 1020101020<br>
     <input type="radio" name="q3" value="b"> 30101020<br>
     <input type="radio" name="q3" value="c"> 302010<br>
     <input type="radio" name="q3" value="d"> 10202010
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     b) 30101020
   </details>

4. Given a `Calculator` class with a method `addAndPrint` that takes two integer parameters, adds them, and prints the result, what will be the return value of the given method call in the following code snippet?
   ```java
   Calculator calc = new Calculator();
   calc.addAndPrint(7, 5);
   ```
   <form>
     <input type="radio" name="q4" value="a"> 12<br>
     <input type="radio" name="q4" value="b"> 75<br>
     <input type="radio" name="q4" value="c"> Compilation error<br>
     <input type="radio" name="q4" value="d"> 0
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     a) 12
   </details>

5. Given a `Printer` class with a method `printGreeting` that takes a `String` parameter and prints a greeting message including the provided name, what will be the return value of the given method call in the following code snippet?
   ```java
   Printer printer = new Printer();
   printer.printGreeting("Alice");
   ```
   <form>
     <input type="radio" name="q5" value="a"> Hello, Alice!<br>
     <input type="radio" name="q5" value="b"> Hello, name!<br>
     <input type="radio" name="q5" value="c"> Alice<br>
     <input type="radio" name="q5" value="d"> Compilation error
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     a) Hello, Alice!
   </details>
6. What is the variable name in the following declaration?
   ```java
   Car myCar = new Car("Toyota");
   ```
   <form>
     <input type="radio" name="q1" value="a"> Car<br>
     <input type="radio" name="q1" value="b"> myCar<br>
     <input type="radio" name="q1" value="c"> new<br>
     <input type="radio" name="q1" value="d"> Toyota
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     b) myCar
   </details>

7. What is the type of the variable in the following declaration?
   ```java
   double price = 19.99;
   ```
   <form>
     <input type="radio" name="q2" value="a"> double<br>
     <input type="radio" name="q2" value="b"> price<br>
     <input type="radio" name="q2" value="c"> 19.99
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     a) double
   </details>

8. What is the initial value of the variable in the following declaration?
   ```java
   boolean isActive = true;
   ```
   <form>
     <input type="radio" name="q3" value="a"> boolean<br>
     <input type="radio" name="q3" value="b"> isActive<br>
     <input type="radio" name="q3" value="c"> true<br>
     <input type="radio" name="q3" value="d"> there is no initial value
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     c) true
   </details>

9. What is the value of `result` after the following sequence of statements?
   ```java
   int result = 5;
   result = result + 10;
   result = result - 3;
   ```
   <form>
     <input type="radio" name="q8" value="a"> 5<br>
     <input type="radio" name="q8" value="b"> 12<br>
     <input type="radio" name="q8" value="c"> 15<br>
     <input type="radio" name="q8" value="d"> 17
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     b) 12
   </details>

10. Identify the mistakes in the following variable declarations:
    <form>
      <input type="checkbox" name="q10" value="a"> var y = "Hello";<br>
      <input type="checkbox" name="q10" value="b"> int y = 10;<br>
      <input type="checkbox" name="q10" value="c"> float pi = 3.14<br>
      <input type="checkbox" name="q10" value="d"> String name = 'John';<br>
      <input type="checkbox" name="q10" value="e"> age = 30;<br>
      <input type="checkbox" name="q10" value="f"> int number;<br>
      <input type="checkbox" name="q10" value="g"> double area = 45.0;
    </form>
    <details markdown="block">
      <summary>Answer</summary>
        var y = "Hello"; and int y = 10; // have the same variable name y.
        float pi = 3.14 // is missing a semicolon at the end.
        String name = 'John'; // should use double quotes for the string value: String name = "John";.
        age = 30; // is missing the type declaration.
        int number; // is declared but not initialized.
    </details>

11. Which of the following are valid variable names in Java?
    <form>
      <input type="checkbox" name="q10" value="a"> name<br>
      <input type="checkbox" name="q10" value="b"> _age<br>
      <input type="checkbox" name="q10" value="c"> float<br>
      <input type="checkbox" name="q10" value="d"> 2ndPlace<br>
      <input type="checkbox" name="q10" value="e"> $amount<br>
      <input type="checkbox" name="q10" value="f"> public<br>
      <input type="checkbox" name="q10" value="g"> accountBalance
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      a) name<br>
      b) _age<br>
      e) $amount<br>
      g) accountBalance
    </details>

12. Choose the best variable name to hold the radius of a circle:
    <form>
      <input type="radio" name="q11" value="a"> r<br>
      <input type="radio" name="q11" value="b"> rad<br>
      <input type="radio" name="q11" value="c"> circleRadius<br>
      <input type="radio" name="q11" value="d"> radius<br>
      <input type="radio" name="q11" value="e"> R
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      d) radius
    </details>

13. What is the return type of the `getArea()` method of the `Circle` class? If unsure, check its method definition.
    <form>
      <input type="radio" name="q15" value="a"> int<br>
      <input type="radio" name="q15" value="b"> double<br>
      <input type="radio" name="q15" value="c"> float<br>
      <input type="radio" name="q15" value="d"> void
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      b) double
    </details>

14. What does the following sequence of statements print?
    ```java
    Circle c = new Circle(10, 20, 15);
    c.move(30, 40);
    System.out.println(c.getCenterX());
    ```
    <form>
      <input type="radio" name="q16" value="a"> 10<br>
      <input type="radio" name="q16" value="b"> 30<br>
      <input type="radio" name="q16" value="c"> 40<br>
      <input type="radio" name="q16" value="d"> 50
    </form>
    <details markdown="block">
      <summary>Answer</summary
      b) 30
    </details>

15. What does this program print?
    ```java
    public class Demo
    {
       public static void main(String[] args)
       {
          System.out.print("Hello");
          System.out.print(" ");
          System.out.print("World");
          System.out.println("!");
       }
    }
    ```
    <form>
      <input type="radio" name="q17" value="a"> Hello World!<br>
      <input type="radio" name="q17" value="b"> HelloWorld!<br>
      <input type="radio" name="q17" value="c"> Hello World !<br>
      <input type="radio" name="q17" value="d"> HelloWorld !
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      a) Hello World!
    </details>