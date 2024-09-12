---
layout: default
title: Methods - When & Where?
nav_order: 2
parent: Class Definitions
grand_parent: Learn
---

# Methods - When and Where to Use?

<details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. [Encapsulating Reusable Code](#1-encapsulating-reusable-code)
   {:toc}
2. [Improving Readability](#2-improving-readability)
   {:toc}
3. [Organizing Code](#3-organizing-code)
   {:toc}
4. [Simplifying Repetitive Tasks](#4-simplifying-repetitive-tasks)
   {:toc}
5. [Facilitating Testing and Debugging](#5-facilitating-testing-and-debugging)
   {:toc}
</details>

## Expanding on When and Where to Use Methods

Methods are a fundamental part of writing clean, organized, and efficient code. They allow you to break down complex tasks into manageable pieces, reuse code, and improve readability. Below are some key scenarios where using methods is beneficial, along with examples for each.

### 1. **Encapsulating Reusable Code**

**Scenario**: You are writing a program to calculate the area of various shapes (rectangle, circle, triangle) multiple times throughout your code.

**Problem Without Methods**:
- If you calculate the area directly in the main code repeatedly, you'll have duplicate code for each shape, which is harder to maintain and prone to errors.

**Solution With Methods**:
- By creating methods to calculate the area of each shape, you encapsulate the logic in one place, making it easier to reuse and maintain.

**Example**:

```java
public class ShapeCalculator {

    // Method to calculate the area of a rectangle
    public double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a circle
    public double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a triangle
    public double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        double rectangleArea = calculator.calculateRectangleArea(5, 10);
        double circleArea = calculator.calculateCircleArea(7);
        double triangleArea = calculator.calculateTriangleArea(6, 8);

        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Triangle Area: " + triangleArea);
    }
}
```

**When to Use**:
- Whenever you have a piece of code that needs to be used multiple times in different places, encapsulate it in a method to avoid redundancy and make updates easier.

### 2. **Improving Readability**

**Scenario**: You are writing a program to manage a bank account, where you need to handle deposits, withdrawals, and balance checks.

**Problem Without Methods**:
- If you write all the code to handle these tasks in one large block, it becomes difficult to read and understand. This makes it harder for others (or even yourself) to follow the logic.

**Solution With Methods**:
- By breaking down each task (deposit, withdrawal, balance check) into its own method, you make the code more organized and easier to read.

**Example**:

```java
public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Method to check the balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);

        account.deposit(200);
        account.withdraw(100);
        System.out.println("Current Balance: " + account.getBalance());
    }
}
```

**When to Use**:
- When you have a complex task that can be broken down into smaller, more manageable parts, use methods to improve readability and make the code easier to follow.

### 3. **Organizing Code**

**Scenario**: You are developing a shopping cart system where you need to add items, calculate totals, and apply discounts.

**Problem Without Methods**:
- Writing all the code in one place can lead to a disorganized and cluttered program. It becomes difficult to locate specific functionality or make changes without affecting other parts of the code.

**Solution With Methods**:
- By organizing related functionality into methods, you can structure your code in a way that is logical and easy to maintain.

**Example**:

```java
public class ShoppingCart {
    private double totalAmount;

    // Method to add an item to the cart
    public void addItem(double price) {
        totalAmount += price;
    }

    // Method to apply a discount to the total amount
    public void applyDiscount(double discountPercentage) {
        totalAmount -= totalAmount * (discountPercentage / 100);
    }

    // Method to calculate the final total after tax
    public double calculateFinalTotal(double taxPercentage) {
        return totalAmount + (totalAmount * (taxPercentage / 100));
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(100);
        cart.addItem(50);
        cart.applyDiscount(10);
        double finalTotal = cart.calculateFinalTotal(8);

        System.out.println("Final Total: $" + finalTotal);
    }
}
```

**When to Use**:
- When your code can benefit from being logically divided into different sections, use methods to group related tasks together, making the program easier to navigate and maintain.

### 4. **Simplifying Repetitive Tasks**

**Scenario**: You are writing a program where multiple actions need to be logged to a file or console, such as user activities or error messages.

**Problem Without Methods**:
- If you write the logging code manually every time you need to log something, it results in duplicated code and increases the chance of errors.

**Solution With Methods**:
- Create a method specifically for logging, which can be called whenever you need to log an action or message. This centralizes the logging functionality and makes the code easier to manage.

**Example**:

```java
public class Logger {

    // Method to log a message to the console
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }

    public static void main(String[] args) {
        Logger logger = new Logger();

        logger.log("User logged in.");
        logger.log("User added an item to the cart.");
        logger.log("User checked out.");
    }
}
```

**When to Use**:
- When a certain task (like logging, validation, or formatting) needs to be repeated throughout your program, encapsulate it in a method to simplify the code and reduce repetition.

### 5. **Facilitating Testing and Debugging**

**Scenario**: You are working on a program with multiple functionalities that need to be tested separately, like a calculator with different operations.

**Problem Without Methods**:
- Testing and debugging a large, monolithic block of code is difficult because all the logic is intertwined, making it hard to isolate and identify issues.

**Solution With Methods**:
- By dividing your code into methods, you can easily test and debug each method independently. This modular approach makes it easier to pinpoint and fix errors.

**Example**:

```java
public class Calculator {

    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two numbers
    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int result1 = calc.add(5, 3);
        int result2 = calc.subtract(10, 4);
        int result3 = calc.multiply(7, 2);
        int result4 = calc.divide(9, 3);

        System.out.println("Addition Result: " + result1);
        System.out.println("Subtraction Result: " + result2);
        System.out.println("Multiplication Result: " + result3);
        System.out.println("Division Result: " + result4);
    }
}
```

**When to Use**:
- When you need to test or debug specific parts of your program, use methods to isolate functionality. This makes it easier to focus on one part at a time and ensures that each piece works correctly.

### Conclusion

- **Encapsulating Reusable Code**: Use methods to avoid code duplication and make updates easier.
- **Improving Readability**: Break down complex tasks into smaller methods to make your code more understandable.
- **Organizing Code**: Group related functionality into methods to keep your code organized and maintainable.
- **Simplifying Repetitive Tasks**: Use methods to handle tasks that need to be repeated, like logging or validation.
- **Facilitating Testing and Debugging**: Divide your code into methods to make testing and debugging easier and more efficient.

By understanding when and where to use methods, you can write cleaner, more efficient, and easier-to-maintain code.

[Back to Top](#top)

#### Practice Exercises
Practice [Methods](../../../practice/java/foundations/methods#exercises-on-different-forms-of-methods-8-exercises) with exercises.