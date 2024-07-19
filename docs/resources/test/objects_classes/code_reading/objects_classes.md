---
layout: default
title: Code Snippets MCQs
parent: Objects and Classes
nav_order: 3
grand_parent: Test Yourself
---

# Practice Questions (Code Snippet based MCQs)
## Soft Intro to Java with BlueJ (Objects & Classes)

<details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. [Easy Level MCQs](#easy-level-mcqs)
   {:toc}
2. [Slightly harder MCQs](#slightly-harder-mcqs)
   {:toc}
</details>

### Easy Level MCQs

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
     Alice
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
     12
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
     30101020
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
     12
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
     Hello, Alice!
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
     myCar
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
     double
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
     true
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
     12
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
      name<br>
      _age<br>
      $amount<br>
      accountBalance
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
      radius
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
      double
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
      30
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
      Hello World!
    </details>

16. Creating a Square Using Rectangle
    ```java
    Rectangle square = new Rectangle(0, 0, 50, 50);
    square.setColor(Color.BLUE);
    square.fill();
    square.translate(10, 10);
    ```
    Where will the square be positioned after executing this code?
    <form>
      <input type="radio" name="q43" value="a"> At (0, 0)<br>
      <input type="radio" name="q43" value="b"> At (10, 10)<br>
      <input type="radio" name="q43" value="c"> At (50, 50)<br>
      <input type="radio" name="q43" value="d"> At (60, 60)<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      At (10, 10)
    </details>

17. Calling Methods on Different Objects
    ```java
    Rectangle rect = new Rectangle(10, 20, 30, 40);
    Circle circ = new Circle(15, 25, 20);
    rect.translate(5, 5);
    circ.setColor(Color.GREEN);
    ```
    What are the new properties of `rect` and `circ` after executing the code?
    <form>
      <input type="radio" name="q44" value="a"> Rectangle at (10, 20) with no color, Circle at (15, 25) with no color<br>
      <input type="radio" name="q44" value="b"> Rectangle at (15, 25) with no color, Circle at (15, 25) with no color<br>
      <input type="radio" name="q44" value="c"> Rectangle at (15, 25) with no color, Circle at (15, 25) with color GREEN<br>
      <input type="radio" name="q44" value="d"> Rectangle at (15, 25) with no color, Circle at (15, 25) with color GREEN<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Rectangle at (15, 25) with no color, Circle at (15, 25) with color GREEN
    </details>

18. Result of Executing Methods
    ```java
    Rectangle rect = new Rectangle(0, 0, 100, 100);
    rect.setColor(Color.RED);
    rect.translate(50, 50);
    rect.grow(20, 20);
    rect.fill();
    ```
    What will be the final state of the rectangle?
    <form>
      <input type="radio" name="q46" value="a"> Rectangle at (0, 0) with width 100, height 100, and color RED<br>
      <input type="radio" name="q46" value="b"> Rectangle at (50, 50) with width 100, height 100, and color RED<br>
      <input type="radio" name="q46" value="c"> Rectangle at (50, 50) with width 140, height 140, and color RED<br>
      <input type="radio" name="q46" value="d"> Rectangle at (70, 70) with width 140, height 140, and color RED<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Rectangle at (50, 50) with width 140, height 140, and color RED
    </details>

20. Effect of translate Method on Coordinates
    ```java
    Line line1 = new Line(0, 0, 10, 10);
    line1.translate(5, 5);
    ```
    What will be the new coordinates of line1?
    <form>
      <input type="radio" name="q47" value="a"> (0, 0) to (10, 10)<br>
      <input type="radio" name="q47" value="b"> (5, 5) to (15, 15)<br>
      <input type="radio" name="q47" value="c"> (0, 0) to (5, 5)<br>
      <input type="radio" name="q47" value="d"> (10, 10) to (20, 20)<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      (5, 5) to (15, 15)
    </details>

21. Invoking Multiple Methods on an Object
    ```java
    Rectangle rect = new Rectangle(10, 10, 20, 20);
    rect.translate(10, 0);
    rect.grow(5, 5);
    ```
    What will be the new properties of the rectangle?
    <form>
      <input type="radio" name="q48" value="a"> Rectangle at (10, 10) with width 20, height 20<br>
      <input type="radio" name="q48" value="b"> Rectangle at (20, 10) with width 25, height 25<br>
      <input type="radio" name="q48" value="c"> Rectangle at (20, 10) with width 30, height 30<br>
      <input type="radio" name="q48" value="d"> Rectangle at (15, 15) with width 25, height 25<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Rectangle at (20, 10) with width 30, height 30
    </details>

22. Creating and Manipulating a Line Object
    ```java
    Line line1 = new Line(0, 0, 50, 50);
    line1.setColor(Color.BLUE);
    line1.translate(20, 20);
    line1.draw();
    ```
    Where will the line be drawn after executing this code?
    <form>
      <input type="radio" name="q49" value="a"> From (0, 0) to (50, 50)<br>
      <input type="radio" name="q49" value="b"> From (20, 20) to (70, 70)<br>
      <input type="radio" name="q49" value="c"> From (20, 20) to (50, 50)<br>
      <input type="radio" name="q49" value="d"> From (10, 10) to (60, 60)<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      From (20, 20) to (70, 70)
    </details>

23. Result of Executing setSize and setColor Methods
    ```java
    Rectangle rect = new Rectangle(10, 20, 30, 40);
    rect.setColor(Color.RED);
    rect.setSize(50, 60);
    rect.fill();
    ```
    What will be the final properties of the rectangle?
    <form>
      <input type="radio" name="q50" value="a"> Rectangle at (10, 20) with width 30, height 40, and color RED<br>
      <input type="radio" name="q50" value="b"> Rectangle at (10, 20) with width 50, height 60, and color RED<br>
      <input type="radio" name="q50" value="c"> Rectangle at (10, 20) with width 50, height 60, and no color<br>
      <input type="radio" name="q50" value="d"> Rectangle at (0, 0) with width 50, height 60, and color RED<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Rectangle at (10, 20) with width 50, height 60, and color RED
    </details>

1. Creating a Rectangle Object
   ```java
   Rectangle rect = new Rectangle(10, 20, 30, 40);
   rect.setColor(Color.RED);
   rect.fill();
   ```

   What will be the result of executing this code?
   <form>
     <input type="radio" name="q1" value="a"> A rectangle with no color<br>
     <input type="radio" name="q1" value="b"> A red rectangle filled with color<br>
     <input type="radio" name="q1" value="c"> A rectangle with no fill<br>
     <input type="radio" name="q1" value="d"> A blue rectangle filled with color
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     A red rectangle filled with color
   </details>

2. Using Line and Rectangle Classes
   ```java
   Line line1 = new Line(10, 10, 50, 10);
   Rectangle rect = new Rectangle(20, 20, 60, 30);
   rect.translate(10, 10);
   line1.translate(5, 0);
   ```

   After the above code is executed, what are the new coordinates of line1 and rect respectively?
   <form>
     <input type="radio" name="q2" value="a"> (15, 10, 55, 10) and (30, 30, 60, 30)<br>
     <input type="radio" name="q2" value="b"> (15, 10, 50, 10) and (30, 30, 60, 30)<br>
     <input type="radio" name="q2" value="c"> (15, 10, 55, 10) and (20, 20, 60, 30)<br>
     <input type="radio" name="q2" value="d"> (10, 10, 50, 10) and (30, 30, 70, 40)
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     (15, 10, 50, 10) and (30, 30, 60, 30)
   </details>

3. Combining Line and Rectangle
   ```java
   Line line1 = new Line(0, 0, 100, 0);
   Line line2 = new Line(0, 100, 100, 100);
   Rectangle rect = new Rectangle(50, 50, 20, 20);
   line1.translate(0, 50);
   line2.translate(0, -50);
   rect.translate(-30, 30);
   ```

   Which statement is true after the code execution?
   <form>
     <input type="radio" name="q4" value="a"> Both lines will be at y=50 and y=50 respectively.<br>
     <input type="radio" name="q4" value="b"> The rectangle will be at (20, 80).<br>
     <input type="radio" name="q4" value="c"> The rectangle will be at (50, 20).<br>
     <input type="radio" name="q4" value="d"> Both lines will remain at y=0 and y=100 respectively.
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     The rectangle will be at (20, 80).
   </details>

4. Creating a Crate Design Using Line and Rectangle
   ```java
   Rectangle base = new Rectangle(10, 10, 100, 50);
   Line line1 = new Line(10, 10, 110, 10);
   Line line2 = new Line(10, 60, 110, 60);
   base.setColor(Color.BROWN);
   base.fill();
   line1.setColor(Color.BLACK);
   line2.setColor(Color.BLACK);
   line1.translate(0, 25);
   ```

   What does the crate look like after executing the code?
   <form>
     <input type="radio" name="q5" value="a"> A brown rectangle with a black line in the middle.<br>
     <input type="radio" name="q5" value="b"> A brown rectangle with a black line at the bottom.<br>
     <input type="radio" name="q5" value="c"> A brown rectangle with a black line at the top.<br>
     <input type="radio" name="q5" value="d"> A brown rectangle without any lines.
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     A brown rectangle with a black line in the middle.
   </details>

6. Using Print and Println
   ```java
   System.out.print("Hello");
   System.out.println("World");
   System.out.println(3 + 4);
   System.out.print("3 + 4");
   ```

   What will be the output of this code?
   <form>
     <input type="radio" name="q6" value="a"> HelloWorld73 + 4<br>
     <input type="radio" name="q6" value="b"> HelloWorld<br>
        7<br>
        3 + 4<br>
     <input type="radio" name="q6" value="c"> Hello World 7<br>
     <input type="radio" name="q6" value="d"> Hello World<br>
        7 3 + 4
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     HelloWorld<br>
        7<br>
        3 + 4
   </details>

7. Using String Methods
   ```java
   String s = "OpenAI";
   System.out.println(s.charAt(2));
   System.out.println(s.length());
   System.out.println(s.substring(1, 4));
   System.out.println(s.toUpperCase());
   ```

   What will be the output of this code?
   <form>
     <input type="radio" name="q7" value="a"> p 6 pen OpenAI<br>
     <input type="radio" name="q7" value="b"> e 6 pen OPENAI<br>
     <input type="radio" name="q7" value="c"> p 5 pen OPENAI<br>
     <input type="radio" name="q7" value="d"> O 6 pen OPENAI
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     e 6 pen OPENAI
   </details>

8. Combining String Methods
   ```java
   String s = "Hello World";
   s = s.replace("World", "Java");
   System.out.println(s.substring(0, 5));
   System.out.println(s.toUpperCase());
   ```

   What will be the output of this code?
   <form>
     <input type="radio" name="q8" value="a"> Hello HELLO JAVA<br>
     <input type="radio" name="q8" value="b"> Hello HELLO WORLD<br>
     <input type="radio" name="q8" value="c"> World HELLO JAVA<br>
     <input type="radio" name="q8" value="d"> Hello HELLO WORLD JAVA
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     Hello HELLO JAVA
   </details>

9. Identifying Error Types
   ```java
   public class Test {
       public static void main(String[] args) {
           int a = 10;
           int b = 0;
           System.out.println(a / b);
           System.out.println("End of program");
       }
   }
   ```

   What type of error will occur when this code is executed?
   <form>
     <input type="radio" name="q9" value="a"> Compile-time error<br>
     <input type="radio" name="q9" value="b"> Logical error<br>
     <input type="radio" name="q9" value="c"> Runtime error (ArithmeticException)<br>
     <input type="radio" name="q9" value="d"> No error, it will print "End of program"
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     Runtime error (ArithmeticException)
   </details>

10. Printing Expressions and Strings
    ```java
    System.out.print("The result of 2 + 3 is ");
    System.out.println(2 + 3);
    System.out.println("2 + 3");
    ```
    
    What will be the output of this code?
    <form>
     <input type="radio" name="q10" value="a"> The result of 2 + 3 is 2 + 3<br>
     <input type="radio" name="q10" value="b"> The result of 2 + 3 is 5<br>
     <input type="radio" name="q10" value="c"> The result of 2 + 3 is 5<br> 2 + 3<br>
     <input type="radio" name="q10" value="d"> The result of 2 + 3 is 5<br> 5
    </form>
    <details markdown="block">
     <summary>Answer</summary>
     The result of 2 + 3 is 5<br> 2 + 3
    </details>

[Back to Top](#top)

### Slightly harder MCQs

1. Printing Statements and Combining Strings
   ```java
   String s1 = "3 + 4";
   int a = 3;
   int b = 4;
   System.out.println(s1);
   System.out.println(a + b);
   System.out.println("Result: " + a + b);
   System.out.println("Result: " + (a + b));
   ```

   What will be the output of this code?
   <form>
     <input type="radio" name="q1" value="a"> 3 + 4 7 Result: 34 Result: 34<br>
     <input type="radio" name="q1" value="b"> 3 + 4 7 Result: 7 Result: 7<br>
     <input type="radio" name="q1" value="c"> 3 + 4 7 Result: 34 Result: 7<br>
     <input type="radio" name="q1" value="d"> 3 + 4 34 Result: 34 Result: 7
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     3 + 4 7 Result: 34 Result: 7
   </details>

2. Using Rectangle and Line Classes
   ```java
   Rectangle rect1 = new Rectangle(20, 20, 40, 40);
   Line line1 = new Line(20, 20, 60, 20);
   rect1.translate(10, 10);
   line1.translate(5, 0);
   ```

   What are the new coordinates of rect1 and line1 respectively?
   <form>
     <input type="radio" name="q2" value="a"> (20, 20, 40, 40) and (25, 20, 65, 20)<br>
     <input type="radio" name="q2" value="b"> (30, 30, 40, 40) and (25, 20, 60, 20)<br>
     <input type="radio" name="q2" value="c"> (20, 20, 50, 50) and (25, 20, 65, 20)<br>
     <input type="radio" name="q2" value="d"> (30, 30, 40, 40) and (20, 20, 60, 20)
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     (30, 30, 40, 40) and (25, 20, 60, 20)
   </details>

3. Creating and Translating a Line Object
   ```java
   Line line = new Line(0, 0, 100, 0);
   line.translate(50, 50);
   ```

   What are the new coordinates of the line after translation?
   <form>
     <input type="radio" name="q3" value="a"> (0, 0, 100, 50)<br>
     <input type="radio" name="q3" value="b"> (50, 50, 150, 50)<br>
     <input type="radio" name="q3" value="c"> (50, 50, 100, 0)<br>
     <input type="radio" name="q3" value="d"> (0, 0, 50, 50)
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     (50, 50, 150, 50)
   </details>

4. Creating and Translating a Square Using Rectangle
   ```java
   Rectangle square = new Rectangle(0, 0, 30, 30);
   square.setColor(Color.GREEN);
   square.translate(20, 20);
   square.fill();
   ```

   What will be the final position and color of the square?
   <form>
     <input type="radio" name="q4" value="a"> (0, 0) and GREEN<br>
     <input type="radio" name="q4" value="b"> (20, 20) and GREEN<br>
     <input type="radio" name="q4" value="c"> (30, 30) and BLUE<br>
     <input type="radio" name="q4" value="d"> (20, 20) and RED
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     (20, 20) and GREEN
   </details>

5. Using String Methods and Printing
   ```java
   String str = "Java Programming";
   System.out.println(str.charAt(5));
   System.out.println(str.substring(0, 4));
   System.out.println(str.replace("Java", "C++"));
   ```

   What will be the output of this code?
   <form>
     <input type="radio" name="q5" value="a"> a Java C++ Programming<br>
     <input type="radio" name="q5" value="b"> P Java C++ Programming<br>
     <input type="radio" name="q5" value="c"> P rogramming C++ Programming<br>
     <input type="radio" name="q5" value="d"> a Java C++ rogramming
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     P Java C++ Programming
   </details>

[Back to Top](#top)
