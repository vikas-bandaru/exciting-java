---
layout: default
title: Static
nav_order: 5
parent: Class Definitions
grand_parent: Learn
---

# Static keyword

<details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. [Why Static?](#1-why-motivation-to-use-static-variables-and-static-methods)
   {:toc}
2. [How and Where?](#2-how-syntax-specifics--tester-code-and-where-logical-placement-of-the-code)
   {:toc}
3. [When?](#3-when-scenarios-of-situations-when-static-variables-and-methods-can-be-used)
   {:toc}
4. [General Confusions for Absolute Beginners](#4-how-to-decide---any-general-confusions-for-absolute-beginners)
   {:toc}
</details>

## 1. Why (Motivation to Use Static Variables and Static Methods)

### **Why Use Static Variables and Static Methods?**

**Scenario 1: Shared Data Across All Instances**
Imagine you're developing a class that tracks the number of objects created. For example, in a bank application, you might want to keep track of how many bank accounts have been created. You wouldn't want each instance of the `BankAccount` class to have its own counter; instead, you'd want one shared counter that increments every time a new `BankAccount` object is created. This is where a **static variable** becomes useful. A static variable is shared among all instances of a class, allowing you to maintain shared data.

**Scenario 2: Utility Methods Without Needing an Object**
Suppose you have a class that performs mathematical calculations, like finding the maximum of two numbers or converting units. You wouldn't need to create an object of this class every time you want to use one of these functions. Instead, you can define these as **static methods**. Static methods can be called directly using the class name without creating an object, making them ideal for utility functions.

**Summary**:
- **Static Variables**: Used when you need a variable that is shared among all instances of a class.
- **Static Methods**: Useful for utility functions that don't rely on instance-specific data.

## 2. How (Syntax Specifics + Tester Code) and Where (Logical Placement of the Code)

### **How to Use Static Variables and Static Methods**

**Syntax for Static Variables:**
- **Declaration**: A static variable is declared using the `static` keyword before the data type. It is usually placed at the beginning of the class, along with other class-level variables.

```java
public class BankAccount {
    // Static variable to keep track of the number of accounts
    static int accountCount = 0;

    // Instance variables
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        accountCount++; // Increment the static counter each time a new account is created
    }
}
```

**Syntax for Static Methods:**
- **Declaration**: A static method is declared using the `static` keyword before the return type. It is usually placed after static variables or instance methods.

```java
public class MathUtility {

    // Static method to find the maximum of two numbers
    public static int findMax(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }
}
```

### **Where to Place Static Variables and Methods:**
- **Static Variables**: Place static variables at the top of the class, typically before the constructors and instance methods. Since static variables are shared across all instances, they are often used for constants or counters that track something common to all objects of the class.
- **Static Methods**: Place static methods below static and instance variables but before or after instance methods depending on logical grouping. Static methods are utility methods or methods that do not require object-specific data.

### **Tester Code Example:**

Let's create a tester class to see how static variables and methods work.

```java
public class BankAccountTester {
    public static void main(String[] args) {
        // Create a few BankAccount objects
        BankAccount account1 = new BankAccount("123456789", 1000.50);
        BankAccount account2 = new BankAccount("987654321", 2000.75);
        
        // Print the number of accounts created using the static variable
        System.out.println("Total accounts created: " + BankAccount.accountCount);

        // Use the static method from MathUtility to find the maximum of two numbers
        int maxNumber = MathUtility.findMax(10, 20);
        System.out.println("Maximum number is: " + maxNumber);
    }
}
```

**Expected Output**:
```
Total accounts created: 2
Maximum number is: 20
```

**Explanation**:
- **Static Variable `accountCount`**: This variable keeps track of the number of `BankAccount` objects created. It is incremented in the constructor, which is called every time a new `BankAccount` is created.
- **Static Method `findMax`**: This method can be called directly using the class name (`MathUtility.findMax`), and it returns the maximum of the two numbers provided.

## 3. When (Scenarios of Situations When Static Variables and Methods Can Be Used)

### **When to Use Static Variables**

1. **Tracking Shared Data Across All Instances**
   - **Scenario**: If you need to keep track of data that is shared among all instances of a class, such as the total number of objects created, a static variable is the ideal choice. For example, the `accountCount` in the `BankAccount` class tracks the total number of bank accounts created.
   - **Example**: Use a static variable to count the number of employees in a company, track the number of students enrolled in a course, or maintain a shared configuration setting.

2. **Defining Constants**
   - **Scenario**: When you have values that should remain constant throughout the program (e.g., `PI`, `MAX_USERS`), you can declare them as `static final` variables. This way, the value is shared across all instances and cannot be modified.
   - **Example**: Define a `static final double PI = 3.14159` in a `MathUtility` class to be used in calculations throughout your program.

3. **Generating Unique IDs for Instances**
   - **Scenario 1: Number IDs**: If each object of a class needs a unique numerical ID, you can use a static variable to generate this ID. The static variable can be incremented with each new object, ensuring that each instance has a unique identifier.
     - **Example**: In a `BankAccount` class, use a static variable `static int nextAccountId = 1` to assign a unique `accountId` to each new account created.
   - **Scenario 2: Alphanumeric IDs**: For more complex IDs, such as alphanumeric strings, a static variable can store a counter or a string template, which is updated for each new object. This could include prefixes like "ACC" for accounts or "EMP" for employees, followed by a unique number.
     - **Example**: In an `Employee` class, use a static variable `static int nextEmployeeId = 1000` and a method to generate IDs like "EMP1001", "EMP1002", etc.

### **When to Use Static Methods**

1. **Utility Functions**
   - **Scenario**: When you need a function that performs a task without depending on instance-specific data, use a static method. For example, methods that perform mathematical calculations, string manipulations, or format data can be static because they don’t require access to instance variables.
   - **Example**: Methods like `findMax`, `calculateSquare`, `formatDate`, or `parseInt` are often made static.

2. **Accessing Static Variables**
   - **Scenario**: Static methods are typically used when you need to manipulate or access static variables. Since static variables belong to the class, it makes sense to use static methods to interact with them.
   - **Example**: A method that resets the `accountCount` variable in the `BankAccount` class might be a static method, as it doesn’t require an instance of the class to perform its task.

3. **Factory Methods**
   - **Scenario**: A common use case for static methods is in the creation of objects, known as factory methods. These methods return an instance of the class, but without requiring the traditional constructor approach.
   - **Example**: A `createAccount` method in a `BankAccount` class that generates a new account based on some predefined logic could be static.

## **Summary**:
- **Static Variables**: Use when you need to share data across all instances, like counters, constants, or to generate unique IDs.
- **Static Methods**: Use for utility functions, accessing static variables, or creating factory methods that don’t rely on instance-specific data.

## 4. How to Decide - Any General Confusions for Absolute Beginners

### **How to Decide When to Use Static Variables**

1. **Do You Need Shared Data Across All Instances?**
   - **Question**: Does the variable need to hold a value that is the same for every object of the class, such as a counter, a configuration setting, or a constant?
   - **Decision**: If yes, then it should be a static variable. For example, if you need to count how many instances of a class have been created, use a static variable.

2. **Do You Need a Unique Identifier for Each Instance?**
   - **Question**: Do you need to generate a unique ID for each object, such as an account number, order ID, or employee ID?
   - **Decision**: Use a static variable to help generate these IDs. The variable can be incremented with each new object to ensure that every instance has a unique identifier.

3. **Is the Value Constant?**
   - **Question**: Is the value something that will never change throughout the life of the program, like a mathematical constant (e.g., PI) or a system-wide configuration setting?
   - **Decision**: If yes, use a static final variable to define this constant. This makes the value accessible throughout your program without needing to create an object.

### **How to Decide When to Use Static Methods**

1. **Is the Method Related to the Class Rather Than an Object?**
   - **Question**: Does the method perform a function that is related to the class itself, rather than to an individual object? For example, does it perform a general utility function like a calculation or formatting?
   - **Decision**: Use a static method. These methods can be called using the class name without needing an object.

2. **Does the Method Operate on Static Variables?**
   - **Question**: Does the method need to access or modify a static variable, such as updating a counter or resetting a shared value?
   - **Decision**: Use a static method. Since static methods can access static variables, it makes sense to pair them together.

3. **Is the Method Used to Create Instances?**
   - **Question**: Is the method responsible for creating instances of a class, especially with specific initialization logic or constraints?
   - **Decision**: Consider using a static factory method. This allows for more control over the instantiation process, and the method can be called directly from the class.

### **Common Confusions for Beginners**

1. **Confusion Between Static and Instance Variables**
   - **Explanation**: Beginners often confuse when to use static variables versus instance variables. Remember, static variables are shared across all objects, while instance variables are unique to each object.

2. **Misunderstanding the Use of Static Methods**
   - **Explanation**: Another common confusion is why some methods are static while others are not. Static methods should be used for tasks that don't require object-specific data. If a method needs to work with instance variables, it shouldn't be static.

3. **Thinking Static Methods Can Access Instance Variables**
   - **Explanation**: Static methods cannot directly access instance variables because they belong to the class, not to any specific object. To access instance variables, you need to have an object of the class.

**Summary**:
- **Static Variables**: Use them for shared data, unique identifiers, and constants.
- **Static Methods**: Use them for class-level operations, utility functions, and when interacting with static variables.



[Back to Top](#top)

#### Practice Exercises
Practice [Methods](../../../practice/java/foundations/methods) with exercises.