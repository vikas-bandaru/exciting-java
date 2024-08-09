---
layout: default
title: Code Snippets MCQs
parent: Class Definitions
nav_order: 3
grand_parent: Test Yourself
---

# Practice Questions (Code Snippet based MCQs)
## Class Definitions

<details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. [Easy Level MCQs](#easy-level-mcqs-class-and-object-basics)
   {:toc}
2. [Slightly harder MCQs](#slightly-harder-mcqs-fields-constructors-methods)
   {:toc}
3. [Tricky MCQs](#)
   {:toc}
</details>

### Easy Level MCQs: Class and Object Basics

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

### Easy Level MCQs: Constructors and Default Values

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

### Easy Level MCQs: Constructors and Method Calls

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

### Easy Level MCQs: Default Values and Object Fields

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

### Easy Level MCQs: Fields with Different Data Types

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

### Easy Level MCQs: Accessors (Getters) and Mutators (Setters)

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

### Easy Level MCQs: toString() Method and Object Representation

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
   </details> -->

### Slightly harder MCQs: Fields, Constructors, Methods

1. **Q:** What is the output of the following code?

    ```java
    class Product {
        private String name;
        private double price;
        
        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }
        
        public String getName() {
            return name;
        }
        
        public double getPrice() {
            return price;
        }
        
        public String toString() {
            return name + ": $" + price;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Product p = new Product("Laptop", 999.99);
            System.out.println(p.toString());
        }
    }
    ```
    - a) Laptop: $999.99
    - b) Laptop: $1000.00
    - c) Error: price is private
    - d) Error: name is private

    **Answer:** a) Laptop: $999.99

2. **Q:** What will the following code print?

    ```java
    class Vehicle {
        private String model;
        private int year;
        
        public Vehicle(String model, int year) {
            this.model = model;
            this.year = year;
        }
        
        public String getModel() {
            return model;
        }
        
        public int getYear() {
            return year;
        }
        
        public String toString() {
            return model + " (" + year + ")";
        }
    }
    public class Main {
        public static void main(String[] args) {
            Vehicle v = new Vehicle("Toyota", 2020);
            System.out.println(v);
        }
    }
    ```
    - a) Toyota (2020)
    - b) Error: model is private
    - c) Error: year is private
    - d) Error: toString method is missing

    **Answer:** a) Toyota (2020)

3. **Q:** Consider the following code. What will it print?

    ```java
    class Account {
        private String owner;
        private double balance;
        
        public Account(String owner, double balance) {
            this.owner = owner;
            this.balance = balance;
        }
        
        public String getOwner() {
            return owner;
        }
        
        public double getBalance() {
            return balance;
        }
        
        public void setBalance(double balance) {
            this.balance = balance;
        }
        
        public String toString() {
            return owner + "'s account has $" + balance;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Account acc = new Account("John", 1000.0);
            acc.setBalance(1500.0);
            System.out.println(acc);
        }
    }
    ```
    - a) John’s account has $1000.0
    - b) John’s account has $1500.0
    - c) Error: balance is private
    - d) Error: setBalance method is missing

    **Answer:** b) John’s account has $1500.0

4. **Q:** What is the output of the following code snippet?

    ```java
    class Dog {
        private String breed;
        private int age;
        
        public Dog(String breed, int age) {
            this.breed = breed;
            this.age = age;
        }
        
        public String getBreed() {
            return breed;
        }
        
        public int getAge() {
            return age;
        }
        
        public void setAge(int age) {
            this.age = age;
        }
        
        public String toString() {
            return "Breed: " + breed + ", Age: " + age;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Dog d = new Dog("Bulldog", 5);
            d.setAge(6);
            System.out.println(d);
        }
    }
    ```
    - a) Breed: Bulldog, Age: 5
    - b) Breed: Bulldog, Age: 6
    - c) Error: age is private
    - d) Error: setAge method is missing

    **Answer:** b) Breed: Bulldog, Age: 6

5. **Q:** What will the following code output?

    ```java
    class House {
        private String address;
        private double price;
        
        public House(String address, double price) {
            this.address = address;
            this.price = price;
        }
        
        public String getAddress() {
            return address;
        }
        
        public double getPrice() {
            return price;
        }
        
        public void setPrice(double price) {
            this.price = price;
        }
        
        public String toString() {
            return address + " is priced at $" + price;
        }
    }
    public class Main {
        public static void main(String[] args) {
            House h = new House("123 Elm St", 250000);
            h.setPrice(275000);
            System.out.println(h);
        }
    }
    ```
    - a) 123 Elm St is priced at $250000
    - b) 123 Elm St is priced at $275000
    - c) Error: price is private
    - d) Error: setPrice method is missing

    **Answer:** b) 123 Elm St is priced at $275000

### Fields: Private or Non-Private Fields (Data Types: All Primitive and Reference Types)

6. **Q:** What will the following code output?

    ```java
    class Lamp {
        private String color;
        private boolean isOn;
        
        public Lamp(String color, boolean isOn) {
            this.color = color;
            this.isOn = isOn;
        }
        
        public String getColor() {
            return color;
        }
        
        public boolean isOn() {
            return isOn;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Lamp l = new Lamp("White", true);
            System.out.println("Lamp color: " + l.getColor() + ", Is it on? " + l.isOn());
        }
    }
    ```
    - a) Lamp color: White, Is it on? true
    - b) Lamp color: White, Is it on? false
    - c) Error: isOn is private
    - d) Error: color is private

    **Answer:** a) Lamp color: White, Is it on? true

7. **Q:** Consider the following code. What is the output?

    ```java
    class Television {
        private String brand;
        private int size;
        
        public Television(String brand, int size) {
            this.brand = brand;
            this.size = size;
        }
        
        public String getBrand() {
            return brand;
        }
        
        public int getSize() {
            return size;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Television tv = new Television("Samsung", 55);
            System.out.println(tv.getBrand() + " TV, Size: " + tv.getSize() + " inches");
        }
    }
    ```
    - a) Samsung TV, Size: 55 inches
    - b) Samsung TV, Size: 65 inches
    - c) Error: size is private
    - d) Error: brand is private

    **Answer:** a) Samsung TV, Size: 55 inches

8. **Q:** What is the output of the following code?

    ```java
    class Pen {
        private String color;
        private double tipSize;
        
        public Pen(String color, double tipSize) {
            this.color = color;
            this.tipSize = tipSize;
        }
        
        public String getColor() {
            return color;
        }
        
        public double getTipSize() {
            return tipSize;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Pen p = new Pen("Blue", 0.7);
            System.out.println("Pen color: " + p.getColor() + ", Tip size: " + p.getTipSize());
        }
    }
    ```
    - a) Pen color: Blue, Tip size: 0.7
    - b) Pen color: Black, Tip size: 0.5
    - c) Error: tipSize is private
    - d) Error: color is private

    **Answer:** a) Pen color: Blue, Tip size: 0.7

9. **Q:** Consider the following code. What will it print?

    ```java
    class Chair {
        private String material;
        private boolean isFoldable;
        
        public Chair(String material, boolean isFoldable) {
            this.material = material;
            this.isFoldable = isFoldable;
        }
        
        public String getMaterial() {
            return material;
        }
        
        public boolean isFoldable() {
            return isFoldable;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Chair c = new Chair("Wood", true);
            System.out.println(c.getMaterial() + " chair is foldable: " + c.isFoldable());
        }
    }
    ```
    - a) Wood chair is foldable: true
    - b) Plastic chair is foldable: true
    - c) Wood chair is foldable: false
    - d) Error: isFoldable is private

    **Answer:** a) Wood chair is foldable: true

10. **Q:** What is the output of the following code?

    ```java
    class Bottle {
        private String material;
        private double capacity;
        
        public Bottle(String material, double capacity) {
            this.material = material;
            this.capacity = capacity;
        }
        
        public String getMaterial() {
            return material;
        }
        
        public double getCapacity() {
            return capacity;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Bottle b = new Bottle("Plastic", 1.5);
            System.out.println("Bottle material: " + b.getMaterial() + ", Capacity: " + b.getCapacity() + " liters");
        }
    }
    ```
    - a) Bottle material: Plastic, Capacity: 1.5 liters
    - b) Bottle material: Glass, Capacity: 1.0 liters
    - c) Error: capacity is private
    - d) Error: material is private

    **Answer:** a) Bottle material: Plastic, Capacity: 1.5 liters

### Constructors: No-Argument, Default, and Parameterized

11. **Q:** What will the following code output?

    ```java
    class Smartphone {
        private String model;
        private int storage;
        
        public Smartphone(String model, int storage) {
            this.model = model;
            this.storage = storage;
        }
        
        public String getModel() {
            return model;
        }
        
        public int getStorage() {
            return storage;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Smartphone phone = new Smartphone("iPhone", 128);
            System.out.println("Model: " + phone.getModel() + ", Storage: " + phone.getStorage() + "GB");
        }
    }
    ```
    - a) Model: iPhone, Storage: 128GB
    - b) Model: iPhone, Storage: 64GB
    - c) Error: storage is private
    - d) Error: model is private

    **Answer:** a) Model: iPhone, Storage: 128GB

12. **Q:** Consider the following code. What is the output?

    ```java
    class Laptop {
        private String brand;
        private int ram;
        
        public Laptop(String brand, int ram) {
            this.brand = brand;
            this.ram = ram;
        }
        
        public String getBrand() {
            return brand;
        }
        
        public int getRam() {
            return ram;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Laptop laptop = new Laptop("HP", 16);
            System.out.println(laptop.getBrand() + " laptop with " + laptop.getRam() + "GB RAM");
        }
    }
    ```
    - a) HP laptop with 16GB RAM
    - b) Dell laptop with 16GB RAM
    - c) HP laptop with 8GB RAM
    - d) Error: ram is private

    **Answer:** a) HP laptop with 16GB RAM

13. **Q:** What is the output of the following code?

    ```java
    class Refrigerator {
        private String brand;
        private double capacity;
        
        public Refrigerator(String brand, double capacity) {
            this.brand = brand;
            this.capacity = capacity;
        }
        
        public String getBrand() {
            return brand;
        }
        
        public double getCapacity() {
            return capacity;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Refrigerator fridge = new Refrigerator("LG", 300);
            System.out.println(fridge.getBrand() + " fridge with " + fridge.getCapacity() + " liters capacity");
        }
    }
    ```
    - a) LG fridge with 300 liters capacity
    - b) Samsung fridge with 300 liters capacity
    - c) LG fridge with 200 liters capacity
    - d) Error: capacity is private

    **Answer:** a) LG fridge with 300 liters capacity

14. **Q:** What will the following code print?

    ```java
    class Car {
        private String make;
        private int year;
        
        public Car(String make, int year) {
            this.make = make;
            this.year = year;
        }
        
        public String getMake() {
            return make;
        }
        
        public int getYear() {
            return year;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Car c = new Car("Honda", 2022);
            System.out.println("Make: " + c.getMake() + ", Year: " + c.getYear());
        }
    }
    ```
    - a) Make: Honda, Year: 2022
    - b) Make: Toyota, Year: 2022
    - c) Make: Honda, Year: 2021
    - d) Error: year is private

    **Answer:** a) Make: Honda, Year: 2022

15. **Q:** Consider the following code. What is the output?

    ```java
    class Tablet {
        private String brand;
        private int batteryLife;
        
        public Tablet(String brand, int batteryLife) {
            this.brand = brand;
            this.batteryLife = batteryLife;
        }
        
        public String getBrand() {
            return brand;
        }
        
        public int getBatteryLife() {
            return batteryLife;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Tablet t = new Tablet("iPad", 10);
            System.out.println(t.getBrand() + " with " + t.getBatteryLife() + " hours battery life");
        }
    }
    ```
    - a) iPad with 10 hours battery life
    - b) iPad with 12 hours battery life
    - c) Galaxy Tab with 10 hours battery life
    - d) Error: batteryLife is private

    **Answer:** a) iPad with 10 hours battery life

### Methods: Accessors (Getters), Mutators (Setters), and toString() Format

16. **Q:** What is the output of the following code?

    ```java
    class Bicycle {
        private String type;
        private int gears;
        
        public Bicycle(String type, int gears) {
            this.type = type;
            this.gears = gears;
        }
        
        public String getType() {
            return type;
        }
        
        public int getGears() {
            return gears;
        }
        
        public void setGears(int gears) {
            this.gears = gears;
        }
        
        public String toString() {
            return "Bicycle type: " + type + ", Gears: " + gears;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Bicycle bike = new Bicycle("Mountain", 18);
            bike.setGears(21);
            System.out.println(bike);
        }
    }
    ```
    - a) Bicycle type: Mountain, Gears: 18
    - b) Bicycle type: Mountain, Gears: 21
    - c) Error: gears is private
    - d) Error: setGears method is missing

    **Answer:** b) Bicycle type: Mountain, Gears: 21

17. **Q:** Consider the following code. What will it print?

    ```java
    class Person {
        private String name;
        private int age;
        
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        public String getName() {
            return name;
        }
        
        public int getAge() {
            return age;
        }
        
        public void setAge(int age) {
            this.age = age;
        }
        
        public String toString() {
            return name + " is " + age + " years old";
        }
    }
    public class Main {
        public static void main(String[] args) {
            Person p = new Person("Alice", 25);
            p.setAge(26);
            System.out.println(p);
        }
    }
    ```
    - a) Alice is 25 years old
    - b) Alice is 26 years old
    - c) Error: age is private
    - d) Error: setAge method is missing

    **Answer:** b) Alice is 26 years old

18. **Q:** What will the following code print?

    ```java
    class Employee {
        private String name;
        private double salary;
        
        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
        
        public String getName() {
            return name;
        }
        
        public double getSalary() {
            return salary;
        }
        
        public void setSalary(double salary) {
            this.salary = salary;
        }
        
        public String toString() {
            return name + " earns $" + salary;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Employee e = new Employee("John", 50000);
            e.setSalary(55000);
            System.out.println(e);
        }
    }
    ```
    - a) John earns $50000
    - b) John earns $55000
    - c) Error: salary is private
    - d) Error: setSalary method is missing

    **Answer:** b) John earns $55000

19. **Q:** Consider the following code. What is the output?

    ```java
    class Book {
        private String title;
        private String author;
        
        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
        
        public String getTitle() {
            return title;
        }
        
        public String getAuthor() {
            return author;
        }
        
        public void setAuthor(String author) {
            this.author = author;
        }
        
        public String toString() {
            return title + " by " + author;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Book b = new Book("1984", "George Orwell");
            b.setAuthor("Orwell");
            System.out.println(b);
        }
    }
    ```
    - a) 1984 by George Orwell
    - b) 1984 by Orwell
    - c) Error: author is private
    - d) Error: setAuthor method is missing

    **Answer:** b) 1984 by Orwell

20. **Q:** What will the following code output?

    ```java
    class Movie {
        private String title;
        private int year;
        
        public Movie(String title, int year) {
            this.title = title;
            this.year = year;
        }
        
        public String getTitle() {
            return title;
        }
        
        public int getYear() {
            return year;
        }
        
        public void setYear(int year) {
            this.year = year;
        }
        
        public String toString() {
            return title + " (" + year + ")";
        }
    }
    public class Main {
        public static void main(String[] args) {
            Movie m = new Movie("Inception", 2010);
            m.setYear(2012);
            System.out.println(m);
        }
    }
    ```
    - a) Inception (2010)
    - b) Inception (2012)
    - c) Error: year is private
    - d) Error: setYear method is missing

    **Answer:** b) Inception (2012)

[Back to Top](#top)

### Tricky MCQs

[Back to Top](#top)
