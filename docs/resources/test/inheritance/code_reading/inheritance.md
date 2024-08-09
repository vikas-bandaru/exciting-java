---
layout: default
title: Code Snippets MCQs
parent: Inheritance
nav_order: 3
grand_parent: Test Yourself
---

# Practice Questions (Code Snippets MCQs)
## Inheritance

<details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. [Easy Level MCQs](#easy-level-mcqs)
   {:toc}
<!-- 2. [Slightly harder MCQs](#slightly-harder-mcqs)
   {:toc} -->
3. [Tricky MCQs](#tricky-mcqs)
   {:toc}
</details>

<!-- ### Easy Level MCQs -->

<!-- 2. Given a `Rectangle` class with a constructor that initializes its width and height, and a method `area` that returns the area of the rectangle, what will be the return value of the given method call?
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
   </details> -->

### Easy Level MCQs

1. What will be the output of this code?
    ```java
    class Parent {
        String name = "Parent";

        Parent() {
            System.out.println("Parent Constructor");
        }
    }

    class Child extends Parent {
        String name = "Child";

        Child() {
            System.out.println("Child Constructor");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Child child = new Child();
            System.out.println(child.name);
        }
    }
    ```

    <form>
    <input type="radio" name="q1" value="a"> Parent Constructor Child Constructor Child<br>
    <input type="radio" name="q1" value="b"> Parent Constructor Parent Constructor Child<br>
    <input type="radio" name="q1" value="c"> Child Constructor Parent Constructor Child<br>
    <input type="radio" name="q1" value="d"> Child Constructor Child Constructor Child
    </form>

    <details markdown="block">
    <summary>Answer</summary>
    Parent Constructor Child Constructor Child
    </details>

2.  What will be the output of this code?
    ```java
    class Example {
        static int x = 10;

        static void print() {
            System.out.println(x);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Example.x = 20;
            Example.print();
        }
    }
    ```

    <form>
    <input type="radio" name="q5" value="a"> 10<br>
    <input type="radio" name="q5" value="b"> 20<br>
    <input type="radio" name="q5" value="c"> Compile-time error<br>
    <input type="radio" name="q5" value="d"> No output
    </form>

    <details markdown="block">
    <summary>Answer</summary>
    20
    </details>

3.  What will be the output of this code?
    ```java
    class A {
        static void display() {
            System.out.println("A");
        }
    }

    class B extends A {
        static void display() {
            System.out.println("B");
        }
    }

    public class Main {
        public static void main(String[] args) {
            A obj = new B();
            obj.display();
        }
    }
    ```

    <form>
    <input type="radio" name="q6" value="a"> A<br>
    <input type="radio" name="q6" value="b"> B<br>
    <input type="radio" name="q6" value="c"> Compile-time error<br>
    <input type="radio" name="q6" value="d"> No output
    </form>

    <details markdown="block">
        <summary>Answer</summary>
        A
    </details>

4.  What will be the output of this code?
    ```java
    class Test {
        int x;

        Test() {
            this(10);
            System.out.println("No-arg constructor");
        }

        Test(int x) {
            this.x = x;
            System.out.println("Parameterized constructor");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Test t = new Test();
        }
    }
    ```

    <form>
    <input type="radio" name="q7" value="a"> No-arg constructor<br>
    <input type="radio" name="q7" value="b"> Parameterized constructor<br>
    <input type="radio" name="q7" value="c"> Parameterized constructor No-arg constructor<br>
    <input type="radio" name="q7" value="d"> No-arg constructor Parameterized constructor
    </form>

    <details markdown="block">
    <summary>Answer</summary>
    Parameterized constructor No-arg constructor
    </details>

5.  What will be the output of this code?
    ```java
    class Test {
        final int x;

        Test(int x) {
            this.x = x;
        }

        void display() {
            System.out.println(x);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Test t = new Test(5);
            t.display();
        }
    }
    ```

    What will be the output of this code?

    <form>
    <input type="radio" name="q8" value="a"> 0<br>
    <input type="radio" name="q8" value="b"> 5<br>
    <input type="radio" name="q8" value="c"> Compile-time error<br>
    <input type="radio" name="q8" value="d"> No output
    </form>

    <details markdown="block">
        <summary>Answer</summary>
        5
    </details>

6.  What will be the output of this code?
    ```java
    class Test {
        void method(int a) {
            System.out.println("int");
        }

        void method(double a) {
            System.out.println("double");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Test t = new Test();
            t.method(5.0);
        }
    }
    ```

    <form>
    <input type="radio" name="q9" value="a"> int<br>
    <input type="radio" name="q9" value="b"> double<br>
    <input type="radio" name="q9" value="c"> Compile-time error<br>
    <input type="radio" name="q9" value="d"> No output
    </form>

    <details markdown="block">
    <summary>Answer</summary>
    double
    </details>

7. What will be the output of this code?
    ```java
    class Test {
        void method() {
            System.out.println("Test Method");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Test t1 = new Test();
            Test t2 = t1;
            t2.method();
        }
    }
    ```

    <form>
    <input type="radio" name="q10" value="a"> Test Method<br>
    <input type="radio" name="q10" value="b"> Compile-time error<br>
    <input type="radio" name="q10" value="c"> Runtime exception<br>
    <input type="radio" name="q10" value="d"> No output
    </form>

    <details markdown="block">
        <summary>Answer</summary>
        Test Method
    </details>

8. What will be the output of this code?

    ```java
    class Animal {
        void makeSound() {
            System.out.println("Animal sound");
        }
    }

    class Dog extends Animal {
    }

    public class Main {
        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.makeSound();
        }
    }
    ```

    <form>
    <input type="radio" name="q1" value="a"> Animal sound<br>
    <input type="radio" name="q1" value="b"> Dog sound<br>
    <input type="radio" name="q1" value="c"> Compile-time error<br>
    <input type="radio" name="q1" value="d"> No output
    </form>

    <details markdown="block">
    <summary>Answer</summary>
    Animal sound
    </details>

9. What will be the output of this code?

    ```java
    class Animal {
        void makeSound() {
            System.out.println("Animal sound");
        }
    }

    class Cat extends Animal {
        void makeSound() {
            System.out.println("Meow");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Cat cat = new Cat();
            cat.makeSound();
        }
    }
    ```

    <form>
    <input type="radio" name="q2" value="a"> Animal sound<br>
    <input type="radio" name="q2" value="b"> Meow<br>
    <input type="radio" name="q2" value="c"> Compile-time error<br>
    <input type="radio" name="q2" value="d"> No output
    </form>

    <details markdown="block">
    <summary>Answer</summary>
    Meow
    </details>

10. What will be the output of this code?

    ```java
    class Parent {
        void show() {
            System.out.println("Parent class");
        }
    }

    class Child extends Parent {
    }

    public class Main {
        public static void main(String[] args) {
            Child child = new Child();
            child.show();
        }
    }
    ```

    <form>
    <input type="radio" name="q3" value="a"> Parent class<br>
    <input type="radio" name="q3" value="b"> Child class<br>
    <input type="radio" name="q3" value="c"> Compile-time error<br>
    <input type="radio" name="q3" value="d"> No output
    </form>

    <details markdown="block">
    <summary>Answer</summary>
    Parent class
    </details>

11. What will be the output of this code?

    ```java
    class Parent {
        Parent() {
            System.out.println("Parent Constructor");
        }
    }

    class Child extends Parent {
        Child() {
            System.out.println("Child Constructor");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Child child = new Child();
        }
    }
    ```

    <form>
    <input type="radio" name="q4" value="a"> Parent Constructor Child Constructor<br>
    <input type="radio" name="q4" value="b"> Child Constructor Parent Constructor<br>
    <input type="radio" name="q4" value="c"> Compile-time error<br>
    <input type="radio" name="q4" value="d"> No output
    </form>

    <details markdown="block">
    <summary>Answer</summary>
    Parent Constructor Child Constructor
    </details>

12. What will be the output of this code?

    ```java
    class Parent {
        void display() {
            System.out.println("Parent");
        }
    }

    class Child extends Parent {
        void display() {
            super.display();
            System.out.println("Child");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Child child = new Child();
            child.display();
        }
    }
    ```



    <form>
    <input type="radio" name="q5" value="a"> Parent Child<br>
    <input type="radio" name="q5" value="b"> Child Parent<br>
    <input type="radio" name="q5" value="c"> Compile-time error<br>
    <input type="radio" name="q5" value="d"> No output
    </form>

    <details markdown="block">
    <summary>Answer</summary>
    Parent Child
    </details>

13. What will be the output of this code?

    ```java
    class Parent {
        void message() {
            System.out.println("Parent message");
        }
    }

    class Child extends Parent {
        void message() {
            System.out.println("Child message");
        }

        void parentMessage() {
            super.message();
        }
    }

    public class Main {
        public static void main(String[] args) {
            Child child = new Child();
            child.parentMessage();
        }
    }
    ```

    <form>
    <input type="radio" name="q6" value="a"> Parent message<br>
    <input type="radio" name="q6" value="b"> Child message<br>
    <input type="radio" name="q6" value="c"> Compile-time error<br>
    <input type="radio" name="q6" value="d"> No output
    </form>

    <details markdown="block">
    <summary>Answer</summary>
    Parent message
    </details>

14. What will be the output of this code?

    ```java
    class Parent {
        public int number = 5;
    }

    class Child extends Parent {
        void show() {
            System.out.println(number);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Child child = new Child();
            child.show();
        }
    }
    ```

    <form>
    <input type="radio" name="q7" value="a"> 5<br>
    <input type="radio" name="q7" value="b"> 0<br>
    <input type="radio" name="q7" value="c"> Compile-time error<br>
    <input type="radio" name="q7" value="d"> No output
    </form>

    <details markdown="block">
    <summary>Answer</summary>
    5
    </details>

15. What will be the output of this code?

    ```java
    class Parent {
        public String toString() {
            return "Parent class";
        }
    }

    class Child extends Parent {
    }

    public class Main {
        public static void main(String[] args) {
            Child child = new Child();
            System.out.println(child);
        }
    }
    ```

    <form>
    <input type="radio" name="q8" value="a"> Parent class<br>
    <input type="radio" name="q8" value="b"> Child class<br>
    <input type="radio" name="q8" value="c"> Compile-time error<br>
    <input type="radio" name="q8" value="d"> No output
    </form>

    <details markdown="block">
    <summary>Answer</summary>
    Parent class
    </details>

16. What will be the output of this code?

    ```java
    class Vehicle {
        void start() {
            System.out.println("Vehicle started");
        }
    }

    class Car extends Vehicle {
        void start() {
            System.out.println("Car started");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Car car = new Car();
            car.start();
        }
    }
    ```

    <form>
    <input type="radio" name="q9" value="a"> Vehicle started<br>
    <input type="radio" name="q9" value="b"> Car started<br>
    <input type="radio" name="q9" value="c"> Compile-time error<br>
    <input type="radio" name="q9" value="d"> No output
    </form>

    <details markdown="block">
    <summary>Answer</summary>
    Car started
    </details>

17. What will be the output of this code?

    ```java
    class Parent {
        protected int number = 10;
    }

    class Child extends Parent {
        void display() {
            System.out.println(number);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Child child = new Child();
            child.display();
        }
    }
    ```

    <form>
    <input type="radio" name="q10" value="a"> 10<br>
    <input type="radio" name="q10" value="b"> 0<br>
    <input type="radio" name="q10" value="c"> Compile-time error<br>
    <input type="radio" name="q10" value="d"> No output
    </form>

    <details markdown="block">
    <summary>Answer</summary>
    10
    </details>

[Back to Top](#top)

### Tricky MCQs
1. What will be the output of this code?

    ```java
    public class Main {
        public static void main(String[] args) {
            String s1 = "Hello";
            String s2 = "Hello";
            String s3 = new String("Hello");
            System.out.println(s1 == s2);
            System.out.println(s1 == s3);
        }
    }
    ```

    <form>
    <input type="radio" name="q2" value="a"> true true<br>
    <input type="radio" name="q2" value="b"> false true<br>
    <input type="radio" name="q2" value="c"> true false<br>
    <input type="radio" name="q2" value="d"> false false
    </form>

    <details markdown="block">
        <summary>Answer</summary>
        true false
    </details>

2.  What will be the output of this code?

    ```java
    class A {
        void method() {
            System.out.println("Class A");
        }
    }

    public class Main {
        public static void main(String[] args) {
            A obj = null;
            obj.method();
        }
    }
    ```

    <form>
    <input type="radio" name="q4" value="a"> Class A<br>
    <input type="radio" name="q4" value="b"> Compile-time error<br>
    <input type="radio" name="q4" value="c"> NullPointerException<br>
    <input type="radio" name="q4" value="d"> No output
    </form>

    <details markdown="block">
        <summary>Answer</summary>
        NullPointerException
    </details>

<!-- ### Slightly harder MCQs

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

2. 

[Back to Top](#top) -->
