---
layout: default
# title: Code Snippets MCQs
parent: Loops
nav_order: 3
grand_parent: Test Yourself
---

# Practice Questions (Code Snippet based MCQs)
## Loops

<!-- <details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. [Easy Level MCQs](#easy-level-mcqs)
   {:toc}
2. [Slightly harder MCQs](#slightly-harder-mcqs)
   {:toc}
</details> -->

### Easy Level MCQs

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

### Class and Object Basics

1. **Q:** What is the output of the following code?

    ```java
    class Car {
        String model;
    }
    public class Main {
        public static void main(String[] args) {
            Car c = new Car();
            System.out.println(c.model);
        }
    }
    ```
    - a) null
    - b) " " (empty string)
    - c) Error: model is private
    - d) Error: model is not initialized

    **Answer:** a) null

2. **Q:** What does the following code print?

    ```java
    class Person {
        int age;
    }
    public class Main {
        public static void main(String[] args) {
            Person p = new Person();
            System.out.println(p.age);
        }
    }
    ```
    - a) 0
    - b) null
    - c) Error: age is private
    - d) Error: age is not initialized

    **Answer:** a) 0

3. **Q:** What will be the output of the following code?

    ```java
    class Book {
        String title;
        public static void main(String[] args) {
            Book b = new Book();
            System.out.println(b.title);
        }
    }
    ```
    - a) null
    - b) Error: title is private
    - c) Error: title is not initialized
    - d) " " (empty string)

    **Answer:** a) null

4. **Q:** What is the value of `speed` after the following code is executed?

    ```java
    class Bike {
        int speed;
    }
    public class Main {
        public static void main(String[] args) {
            Bike b = new Bike();
            System.out.println(b.speed);
        }
    }
    ```
    - a) 0
    - b) null
    - c) Error: speed is private
    - d) Error: speed is not initialized

    **Answer:** a) 0

### Constructors and Default Values

5. **Q:** What does the following code print?

    ```java
    class Pen {
        String color;
    }
    public class Main {
        public static void main(String[] args) {
            Pen p = new Pen();
            System.out.println(p.color);
        }
    }
    ```
    - a) null
    - b) " " (empty string)
    - c) Error: color is private
    - d) Error: color is not initialized

    **Answer:** a) null

6. **Q:** What is the output of the following code snippet?

    ```java
    class Dog {
        String name;
    }
    public class Main {
        public static void main(String[] args) {
            Dog d = new Dog();
            System.out.println(d.name);
        }
    }
    ```
    - a) null
    - b) " " (empty string)
    - c) Error: name is private
    - d) Error: name is not initialized

    **Answer:** a) null

7. **Q:** What does the following code print?

    ```java
    class Tree {
        int height;
    }
    public class Main {
        public static void main(String[] args) {
            Tree t = new Tree();
            System.out.println(t.height);
        }
    }
    ```
    - a) 0
    - b) null
    - c) Error: height is private
    - d) Error: height is not initialized

    **Answer:** a) 0

8. **Q:** What will be the value of `price` after executing the following code?

    ```java
    class Product {
        double price;
    }
    public class Main {
        public static void main(String[] args) {
            Product p = new Product();
            System.out.println(p.price);
        }
    }
    ```
    - a) 0.0
    - b) null
    - c) Error: price is private
    - d) Error: price is not initialized

    **Answer:** a) 0.0

### Constructors and Method Calls

9. **Q:** What does the following code print?

    ```java
    class Laptop {
        String brand = "Dell";
    }
    public class Main {
        public static void main(String[] args) {
            Laptop l = new Laptop();
            System.out.println(l.brand);
        }
    }
    ```
    - a) null
    - b) Dell
    - c) Error: brand is private
    - d) Error: brand is not initialized

    **Answer:** b) Dell

10. **Q:** What is the value of `name` after the following code is executed?

    ```java
    class Student {
        String name;
        Student() {
            name = "John";
        }
    }
    public class Main {
        public static void main(String[] args) {
            Student s = new Student();
            System.out.println(s.name);
        }
    }
    ```
    - a) null
    - b) John
    - c) Error: name is private
    - d) Error: no constructor defined

    **Answer:** b) John

11. **Q:** What does the following code print?

    ```java
    class Mobile {
        String model = "iPhone";
    }
    public class Main {
        public static void main(String[] args) {
            Mobile m = new Mobile();
            System.out.println(m.model);
        }
    }
    ```
    - a) null
    - b) iPhone
    - c) Error: model is private
    - d) Error: model is not initialized

    **Answer:** b) iPhone

12. **Q:** What is the value of `type` after executing the following code?

    ```java
    class Fruit {
        String type;
        Fruit() {
            type = "Apple";
        }
    }
    public class Main {
        public static void main(String[] args) {
            Fruit f = new Fruit();
            System.out.println(f.type);
        }
    }
    ```
    - a) null
    - b) Apple
    - c) Error: type is private
    - d) Error: no constructor defined

    **Answer:** b) Apple

### Default Values and Object Fields

13. **Q:** What is the output of the following code?

    ```java
    class Camera {
        String brand;
    }
    public class Main {
        public static void main(String[] args) {
            Camera c = new Camera();
            System.out.println(c.brand);
        }
    }
    ```
    - a) null
    - b) Error: brand is private
    - c) Error: brand is not initialized
    - d) " " (empty string)

    **Answer:** a) null

14. **Q:** What does the following code print?

    ```java
    class House {
        int rooms;
    }
    public class Main {
        public static void main(String[] args) {
            House h = new House();
            System.out.println(h.rooms);
        }
    }
    ```
    - a) 0
    - b) null
    - c) Error: rooms is private
    - d) Error: rooms is not initialized

    **Answer:** a) 0

15. **Q:** What is the value of `pages` after the following code is executed?

    ```java
    class Notebook {
        int pages;
    }
    public class Main {
        public static void main(String[] args) {
            Notebook n = new Notebook();
            System.out.println(n.pages);
        }
    }
    ```
    - a) 0
    - b) null
    - c) Error: pages is private
    - d) Error: pages is not initialized

    **Answer:** a) 0

16. **Q:** What is the output of the following code snippet?

    ```java
    class Television {
        String brand = "Sony";
        public String toString() {
            return "Television brand: " + brand;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Television tv = new Television();
            System.out.println(tv);
        }
    }
    ```
    - a) null
    - b) Television brand: Sony
    - c) Error: brand has private access
    - d) Error: toString() is not defined

    **Answer:** b) Television brand: Sony

### Fields with Different Data Types

17. **Q:** What does the following code print?

    ```java
    class Test {
        int num;
        String text = "Hello";
    }
    public class Main {
        public static void main(String[] args) {
            Test t = new Test();
            System.out.println(t.num + " " + t.text);
        }
    }
    ```
    - a) 0 null
    - b) 0 Hello
    - c) Error: num and text are private
    - d) Error: Test class has no constructor

    **Answer:** b) 0 Hello

18. **Q:** What is the output of the following code?

    ```java
    class Item {
        double price = 9.99;
    }
    public class Main {
        public static void main(String[] args) {
            Item i = new Item();
            System.out.println(i.price);
        }
    }
    ```
    - a) 0.0
    - b) 9.99
    - c) Error: price is private
    - d) Error: price is not initialized

    **Answer:** b) 9.99

19. **Q:** What does the following code print?

    ```java
    class Movie {
        String title = "Inception";
    }
    public class Main {
        public static void main(String[] args) {
            Movie m = new Movie();
            System.out.println(m.title);
        }
    }
    ```
    - a) null
    - b) Inception
    - c) Error: title is private
    - d) Error: title is not initialized

    **Answer:** b) Inception

20. **Q:** What is the output of the following code snippet?

    ```java
    class Pen {
        String color = "Blue";
        public String toString() {
            return "Pen color: " + color;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Pen p = new Pen();
            System.out.println(p);
        }
    }
    ```
    - a) null
    - b) Pen color: Blue
    - c) Error: color is private
    - d) Error: toString() is not defined

    **Answer:** b) Pen color: Blue

### Accessors (Getters) and Mutators (Setters)

21. **Q:** What does the following code print?

    ```java
    class Car {
        private String model;
        
        public String getModel() {
            return model;
        }
        
        public void setModel(String model) {
            this.model = model;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Car c = new Car();
            c.setModel("Tesla");
            System.out.println(c.getModel());
        }
    }
    ```
    - a) null
    - b) Tesla
    - c) Error: model is private
    - d) Error: model is not initialized

    **Answer:** b) Tesla

22. **Q:** What is the output of the following code?

    ```java
    class Person {
        private int age;
        
        public int getAge() {
            return age;
        }
        
        public void setAge(int age) {
            this.age = age;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Person p = new Person();
            p.setAge(25);
            System.out.println(p.getAge());
        }
    }
    ```
    - a) 0
    - b) 25
    - c) Error: age is private
    - d) Error: setAge method is missing

    **Answer:** b) 25

23. **Q:** What will the following code print?

    ```java
    class Book {
        private String title;
        
        public String getTitle() {
            return title;
        }
        
        public void setTitle(String title) {
            this.title = title;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Book b = new Book();
            b.setTitle("Java Programming");
            System.out.println(b.getTitle());
        }
    }
    ```
    - a) null
    - b) Java Programming
    - c) Error: title is private
    - d) Error: getTitle method is missing

    **Answer:** b) Java Programming

24. **Q:** What is the value of `name` after executing the following code?

    ```java
    class Student {
        private String name;
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Student s = new Student();
            s.setName("Alice");
            System.out.println(s.getName());
        }
    }
    ```
    - a) null
    - b) Alice
    - c) Error: name is private
    - d) Error: setName method is missing

    **Answer:** b) Alice

25. **Q:** What will be the output of the following code?

    ```java
    class Laptop {
        private String brand;
        
        public String getBrand() {
            return brand;
        }
        
        public void setBrand(String brand) {
            this.brand = brand;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Laptop l = new Laptop();
            l.setBrand("HP");
            System.out.println(l.getBrand());
        }
    }
    ```
    - a) null
    - b) HP
    - c) Error: brand is private
    - d) Error: setBrand method is missing

    **Answer:** b) HP

26. **Q:** What does the following code print?

    ```java
    class Movie {
        private String title;
        
        public String getTitle() {
            return title;
        }
        
        public void setTitle(String title) {
            this.title = title;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Movie m = new Movie();
            m.setTitle("The Matrix");
            System.out.println(m.getTitle());
        }
    }
    ```
    - a) null
    - b) The Matrix
    - c) Error: title is private
    - d) Error: getTitle method is missing

    **Answer:** b) The Matrix

### toString() Method and Object Representation

27. **Q:** What is the output of the following code?

    ```java
    class Pen {
        String color = "Red";
        
        public String toString() {
            return "Pen color: " + color;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Pen p = new Pen();
            System.out.println(p);
        }
    }
    ```
    - a) null
    - b) Pen color: Red
    - c) Error: color is private
    - d) Error: toString method is missing

    **Answer:** b) Pen color: Red

28. **Q:** What does the following code print?

    ```java
    class Laptop {
        String model = "MacBook";
        
        public String toString() {
            return "Laptop model: " + model;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Laptop l = new Laptop();
            System.out.println(l);
        }
    }
    ```
    - a) null
    - b) Laptop model: MacBook
    - c) Error: model is private
    - d) Error: toString method is missing

    **Answer:** b) Laptop model: MacBook

29. **Q:** What will be the output of the following code?

    ```java
    class Person {
        String name = "John";
        
        public String toString() {
            return "Person name: " + name;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Person p = new Person();
            System.out.println(p);
        }
    }
    ```
    - a) null
    - b) Person name: John
    - c) Error: name is private
    - d) Error: toString method is missing

    **Answer:** b) Person name: John

30. **Q:** What is the output of the following code?

    ```java
    class Tree {
        String type = "Oak";
        
        public String toString() {
            return "Tree type: " + type;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Tree t = new Tree();
            System.out.println(t);
        }
    }
    ```
    - a) null
    - b) Tree type: Oak
    - c) Error: type is private
    - d) Error: toString method is missing

    **Answer:** b) Tree type: Oak

[Back to Top](#top)

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
