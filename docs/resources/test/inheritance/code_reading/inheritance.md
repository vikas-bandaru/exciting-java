---
layout: default
title: Code Snippets MCQs
parent: Inheritance
nav_order: 3
grand_parent: Test Yourself
---

# Code Snippets-based MCQs
## Inheritance

<details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. [Easy Level MCQs](#easy-level-mcqs)
   {:toc}
2. [Slightly harder MCQs](#slightly-harder-mcqs)
   {:toc}
3. [Tricky MCQs](#tricky-mcqs)
   {:toc}
</details>

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

### Slightly Harder MCQs

1. What will be the output of this code?

   ```java
   class Parent {
       int value() {
           return 1;
       }
   }

   class Child extends Parent {
       double value() {
           return 2.0;
       }
   }

   public class Main {
       public static void main(String[] args) {
           Parent obj = new Child();
           System.out.println(obj.value());
       }
   }
   ```
   
   <form>
     <input type="radio" name="q11" value="a"> 1<br>
     <input type="radio" name="q11" value="b"> 2.0<br>
     <input type="radio" name="q11" value="c"> Compile-time error<br>
     <input type="radio" name="q11" value="d"> Runtime error
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     Compile-time error
   </details>
2. What will be the output of this code?

    ```java
    class Parent {
        int number = 5;
    }

    class Child extends Parent {
        int number = 10;

        void display() {
            System.out.println(number);
            System.out.println(super.number);
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
    <input type="radio" name="q12" value="a"> 5 5<br>
    <input type="radio" name="q12" value="b"> 10 5<br>
    <input type="radio" name="q12" value="c"> 5 10<br>
    <input type="radio" name="q12" value="d"> 10 10
    </form>
    <details markdown="block">
    <summary>Answer</summary>
    10 5
    </details>
    
3. What will be the output of this code?

    ```java
    class Parent {
        Parent() {
            System.out.println("Parent Constructor");
        }
    }

    class Child extends Parent {
        Child() {
            super();
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
    <input type="radio" name="q13" value="a"> Parent Constructor Child Constructor<br>
    <input type="radio" name="q13" value="b"> Child Constructor Parent Constructor<br>
    <input type="radio" name="q13" value="c"> Compile-time error<br>
    <input type="radio" name="q13" value="d"> No output
    </form>
    <details markdown="block">
    <summary>Answer</summary>
    Parent Constructor Child Constructor
    </details>

4. What will be the output of this code?

    ```java
    class Parent {
        void display(int num) {
            System.out.println("Number: " + num);
        }
    }

    class Child extends Parent {
        void display(String str) {
            System.out.println("String: " + str);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Child child = new Child();
            child.display(10);
            child.display("Hello");
        }
    }
    ```
    
    <form>
    <input type="radio" name="q14" value="a"> Number: 10 String: Hello<br>
    <input type="radio" name="q14" value="b"> String: Hello Number: 10<br>
    <input type="radio" name="q14" value="c"> Compile-time error<br>
    <input type="radio" name="q14" value="d"> No output
    </form>
    <details markdown="block">
    <summary>Answer</summary>
    Number: 10 String: Hello
    </details>
    
5. What will be the output of this code?

    ```java
    class Parent {
        Parent(int x) {
            System.out.println("Parent Constructor with value: " + x);
        }
    }

    class Child extends Parent {
        Child(int x) {
            super(x);
            System.out.println("Child Constructor with value: " + x);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Child child = new Child(5);
        }
    }
    ```
    
    <form>
    <input type="radio" name="q15" value="a"> Parent Constructor with value: 5 Child Constructor with value: 5<br>
    <input type="radio" name="q15" value="b"> Child Constructor with value: 5 Parent Constructor with value: 5<br>
    <input type="radio" name="q15" value="c"> Compile-time error<br>
    <input type="radio" name="q15" value="d"> No output
    </form>
    <details markdown="block">
    <summary>Answer</summary>
    Parent Constructor with value: 5 Child Constructor with value: 5
    </details>

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

3. What will be the output of this code?

    ```java
    class Parent {
        void show() {
            System.out.println("Parent show");
        }
    }

    class Child extends Parent {
        void show() {
            System.out.println("Child show");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Parent parent = new Child();
            parent.show();
        }
    }
    ```
    
    <form>
    <input type="radio" name="q16" value="a"> Parent show<br>
    <input type="radio" name="q16" value="b"> Child show<br>
    <input type="radio" name="q16" value="c"> Compile-time error<br>
    <input type="radio" name="q16" value="d"> Runtime error
    </form>
    <details markdown="block">
    <summary>Answer</summary>
    Child show
    </details>

4. What will be the output of this code?

    ```java
    class Parent {
        int number = 5;
    }

    class Child extends Parent {
        int number = 10;

        void display() {
            System.out.println(number);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Parent parent = new Child();
            parent.display();
        }
    }
    ```
    
    <form>
    <input type="radio" name="q17" value="a"> 5<br>
    <input type="radio" name="q17" value="b"> 10<br>
    <input type="radio" name="q17" value="c"> Compile-time error<br>
    <input type="radio" name="q17" value="d"> Runtime error
    </form>
    <details markdown="block">
    <summary>Answer</summary>
    Compile-time error
    </details>
3. What will be the output of this code?

    ```java
    class Parent {
        Parent() {
            System.out.println("Parent Constructor");
        }
    }

    class Child extends Parent {
        Child() {
            this(10);
            System.out.println("Child Constructor");
        }

        Child(int x) {
            System.out.println("Child Constructor with value: " + x);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Child child = new Child();
        }
    }
    ```
    
    <form>
    <input type="radio" name="q18" value="a"> Parent Constructor Child Constructor<br>
    <input type="radio" name="q18" value="b"> Parent Constructor Child Constructor with value: 10 Child Constructor<br>
    <input type="radio" name="q18" value="c"> Compile-time error<br>
    <input type="radio" name="q18" value="d"> Runtime error
    </form>
    <details markdown="block">
    <summary>Answer</summary>
    Parent Constructor Child Constructor with value: 10 Child Constructor
    </details>
4. What will be the output of this code?

    ```java
    class Parent {
        void display() {
            System.out.println("Parent display");
        }
    }

    class Child extends Parent {
        void display() {
            System.out.println("Child display");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Parent parent = new Child();
            parent.display();
        }
    }
    ```
    
    <form>
    <input type="radio" name="q19" value="a"> Parent display<br>
    <input type="radio" name="q19" value="b"> Child display<br>
    <input type="radio" name="q19" value="c"> Compile-time error<br>
    <input type="radio" name="q19" value="d"> Runtime error
    </form>
    <details markdown="block">
    <summary>Answer</summary>
    Child display
    </details>
5. What will be the output of this code?

    ```java
    class Parent {
        Parent() {
            System.out.println("Parent Constructor");
            show();
        }

        void show() {
            System.out.println("Parent show");
        }
    }

    class Child extends Parent {
        Child() {
            System.out.println("Child Constructor");
        }

        void show() {
            System.out.println("Child show");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Child child = new Child();
        }
    }
    ```
    
    <form>
    <input type="radio" name="q20" value="a"> Parent Constructor Parent show Child Constructor<br>
    <input type="radio" name="q20" value="b"> Parent Constructor Child show Child Constructor<br>
    <input type="radio" name="q20" value="c"> Child show Child Constructor<br>
    <input type="radio" name="q20" value="d"> Parent Constructor Parent show Parent show Child Constructor
    </form>
    <details markdown="block">
    <summary>Answer</summary>
    Parent Constructor Child show Child Constructor
    </details>

6. What is the issue in this code?

    ```java
    class Parent {
        Parent(int x) {
            System.out.println("Parent Constructor");
        }
    }

    class Child extends Parent {
        Child() {
            System.out.println("Child Constructor");
        }
    }
    ```

    <form>
    <input type="radio" name="q1" value="a"> The `super()` call is missing in the `Child` constructor<br>
    <input type="radio" name="q1" value="b"> The `Child` constructor should take an argument<br>
    <input type="radio" name="q1" value="c"> The `Parent` constructor should have a no-argument constructor<br>
    <input type="radio" name="q1" value="d"> There is no issue in the code
    </form>
    <details markdown="block">
    <summary>Answer</summary>
    The `super()` call is missing in the `Child` constructor
    </details>
2. What is the issue in this code?

    ```java
    class Parent {
        void display(int x) {
            System.out.println("Parent: " + x);
        }
    }

    class Child extends Parent {
        void display(String x) {
            System.out.println("Child: " + x);
        }
    }
    ```

    <form>
    <input type="radio" name="q2" value="a"> Method `display` in `Child` should override `display` in `Parent`<br>
    <input type="radio" name="q2" value="b"> The `display` method in `Child` is not an override, it's an overload<br>
    <input type="radio" name="q2" value="c"> The `Parent` class should be declared as abstract<br>
    <input type="radio" name="q2" value="d"> There is no issue in the code
    </form>
    <details markdown="block">
    <summary>Answer</summary>
    The `display` method in `Child` is not an override, it's an overload
    </details>
3. What is the issue in this code?

    ```java
    class Parent {
        int value() {
            return 10;
        }
    }

    class Child extends Parent {
        double value() {
            return 10.0;
        }
    }
    ```

    <form>
    <input type="radio" name="q3" value="a"> The `value` method in `Child` has an incompatible return type<br>
    <input type="radio" name="q3" value="b"> The `value` method in `Parent` should return `double`<br>
    <input type="radio" name="q3" value="c"> The `Child` class must use `super.value()`<br>
    <input type="radio" name="q3" value="d"> There is no issue in the code
    </form>
    <details markdown="block">
    <summary>Answer</summary>
    The `value` method in `Child` has an incompatible return type
    </details>
4. What is the issue in this code?

    ```java
    class Parent {
        Parent() {
            System.out.println("Parent Constructor");
        }
    }

    class Child extends Parent {
        Child() {
            System.out.println("Child Constructor");
            super();
        }
    }
    ```

    <form>
    <input type="radio" name="q4" value="a"> `super()` should be the first statement in the `Child` constructor<br>
    <input type="radio" name="q4" value="b"> `super()` should not be used in the `Child` constructor<br>
    <input type="radio" name="q4" value="c"> The `Parent` class must take a parameter<br>
    <input type="radio" name="q4" value="d"> There is no issue in the code
    </form>
    <details markdown="block">
    <summary>Answer</summary>
    `super()` should be the first statement in the `Child` constructor
    </details>
5. What is the issue in this code?

    ```java
    class Parent {
        private void show() {
            System.out.println("Parent show");
        }
    }

    class Child extends Parent {
        void show() {
            System.out.println("Child show");
        }
    }
    ```

    <form>
    <input type="radio" name="q5" value="a"> The `show` method in `Child` does not override the `show` method in `Parent`<br>
    <input type="radio" name="q5" value="b"> The `show` method in `Parent` should be protected<br>
    <input type="radio" name="q5" value="c"> The `Child` class cannot define a method with the same name<br>
    <input type="radio" name="q5" value="d"> There is no issue in the code
    </form>
    <details markdown="block">
    <summary>Answer</summary>
    The `show` method in `Child` does not override the `show` method in `Parent`
    </details>
6. What is the issue in this code?

    ```java
    class Parent {
        final void display() {
            System.out.println("Parent display");
        }
    }

    class Child extends Parent {
        void display() {
            System.out.println("Child display");
        }
    }
    ```

    <form>
    <input type="radio" name="q6" value="a"> The `display` method in `Child` cannot override the final method in `Parent`<br>
    <input type="radio" name="q6" value="b"> The `display` method in `Parent` should not be final<br>
    <input type="radio" name="q6" value="c"> The `Child` class should extend a different class<br>
    <input type="radio" name="q6" value="d"> There is no issue in the code
    </form>
    <details markdown="block">
    <summary>Answer</summary>
    The `display` method in `Child` cannot override the final method in `Parent`
    </details>
7. What is the issue in this code?

    ```java
    class Parent {
        private Parent() {
            System.out.println("Parent Constructor");
        }
    }

    class Child extends Parent {
        Child() {
            System.out.println("Child Constructor");
        }
    }
    ```

    <form>
    <input type="radio" name="q7" value="a"> The `Parent` constructor is private and cannot be accessed by `Child`<br>
    <input type="radio" name="q7" value="b"> The `Child` constructor should be private<br>
    <input type="radio" name="q7" value="c"> The `Parent` constructor should be protected<br>
    <input type="radio" name="q7" value="d"> There is no issue in the code
    </form>
    <details markdown="block">
    <summary>Answer</summary>
    The `Parent` constructor is private and cannot be accessed by `Child`
    </details>
8. What is the issue in this code?

    ```java
    class Parent {
        Parent() {
            this(10);
        }

        Parent(int x) {
            System.out.println("Parent Constructor with value: " + x);
        }
    }

    class Child extends Parent {
        Child() {
            System.out.println("Child Constructor");
        }
    }
    ```

    <form>
    <input type="radio" name="q8" value="a"> Recursive constructor invocation in `Parent` class<br>
    <input type="radio" name="q8" value="b"> The `Child` class should also have a parameterized constructor<br>
    <input type="radio" name="q8" value="c"> The `Parent` constructor should not take an argument<br>
    <input type="radio" name="q8" value="d"> There is no issue in the code
    </form>
    <details markdown="block">
    <summary>Answer</summary>
    Recursive constructor invocation in `Parent` class
    </details>
9. What is the issue in this code?

    ```java
    class Parent {
        void display() {
            System.out.println("Parent display");
        }
    }

    class Child extends Parent {
        void display(int x) {
            System.out.println("Child display: " + x);
        }
    }
    ```

    <form>
    <input type="radio" name="q9" value="a"> Method ``display(int x)`` in `Child` does not override `display()` in `Parent`<br>
    <input type="radio" name="q9" value="b"> Method `display(int x)` should be private<br>
    <input type="radio" name="q9" value="c"> The `Parent` class should take an argument<br>
    <input type="radio" name="q9" value="d"> There is no issue in the code
    </form>
    <details markdown="block">
    <summary>Answer</summary>
    Method `display(int x)` in `Child` does not override `display()` in `Parent`
    </details>
