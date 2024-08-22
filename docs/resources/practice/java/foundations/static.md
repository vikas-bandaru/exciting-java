---
layout: default
title: Static
parent: Class Definitions
nav_order: 4
grand_parent: Practice
---

# Practice Static
{: .no_toc}

<details open markdown="block">
  <summary>
    Topics
  </summary>
  {: .text-delta }
  1. [Exercise 1](#exercise-1-generating-unique-account-ids)
     {:toc}
  2. [Exercise 2](#exercise-2-utility-method-for-calculating-discounts)
     {:toc}
  3. [Exercise 3](#exercise-3-counting-the-number-of-objects-created)
     {:toc}
  4. [Exercise 4](#exercise-4-creating-a-static-factory-method)
     {:toc}
  5. [Exercise 5](#exercise-5-shared-configuration-settings)
     {:toc}
  6. [Exercise 6](#exercise-6-generating-alphanumeric-ids)
     {:toc}
  7. [Exercise 7](#exercise-7-implementing-a-singleton-pattern)
     {:toc}
  8. [Exercise 8](#exercise-8-static-method-for-common-string-operations)
     {:toc}
</details>

## Practice Exercises

Here are a few exercises to help reinforce your understanding of static variables and static methods. Each exercise is designed to cover different scenarios and concepts we’ve discussed.

### **Exercise 1: Generating Unique Account IDs**

**Scenario**: You need to create a `BankAccount` class that automatically generates a unique account ID for each new account created. The account IDs should start from 1000 and increment by 1 for each new account.

**Task**:
- Implement a `static int nextAccountId = 1000` variable in the `BankAccount` class.
- Create a constructor that assigns a unique ID to each `BankAccount` object using the static variable.
- Add a method `public int getAccountId()` to return the account ID.

**Instructions**:
1. Implement the static variable and constructor in the `BankAccount` class.
2. Write a `BankAccountTester` class to create multiple `BankAccount` objects and print their account IDs.

**Expected Outcome**:
- Each `BankAccount` object should have a unique, incrementing account ID starting from 1000.

### **Exercise 2: Utility Method for Calculating Discounts**

**Scenario**: You need a utility method in a `ShoppingCart` class that calculates a discount on a total amount. This method should be static, so it can be used without creating an instance of `ShoppingCart`.

**Task**:
- Implement a static method `public static double calculateDiscount(double totalAmount, double discountPercentage)` in the `ShoppingCart` class.
- The method should return the total amount after applying the discount.

**Instructions**:
1. Implement the static method in the `ShoppingCart` class.
2. Write a `ShoppingCartTester` class to test the method with various amounts and discount percentages.

**Expected Outcome**:
- The static method should correctly calculate and return the discounted amount for any given total and discount percentage.

### **Exercise 3: Counting the Number of Objects Created**

**Scenario**: You need to track how many instances of the `Employee` class have been created in a company. The count should be shared across all `Employee` objects.

**Task**:
- Implement a `static int employeeCount` variable in the `Employee` class.
- Increment the count each time a new `Employee` object is created.
- Add a static method `public static int getEmployeeCount()` to return the total number of employees.

**Instructions**:
1. Implement the static variable and method in the `Employee` class.
2. Write an `EmployeeTester` class to create several `Employee` objects and print the total count using the static method.

**Expected Outcome**:
- The static method should return the total number of `Employee` objects created.

### **Exercise 4: Creating a Static Factory Method**

**Scenario**: You need a static method in the `Car` class that creates a new `Car` object with some default values. This method will act as a factory method.

**Task**:
- Implement a static method `public static Car createDefaultCar()` in the `Car` class.
- The method should return a new `Car` object with predefined values (e.g., "Toyota" for make, "Corolla" for model, and a default price).

**Instructions**:
1. Implement the static factory method in the `Car` class.
2. Write a `CarTester` class to use the static method and print the details of the created car.

**Expected Outcome**:
- The `createDefaultCar()` method should return a `Car` object with the predefined values.

### **Exercise 5: Shared Configuration Settings**

**Scenario**: You are building an application that needs to use the same configuration settings across all instances. These settings should be defined as static variables.

**Task**:
- Create a `Config` class with static variables like `static String appName`, `static String version`, and `static int maxUsers`.
- Initialize these variables with some default values.
- Add a static method `public static void printConfig()` to print all the configuration settings.

**Instructions**:
1. Implement the static variables and method in the `Config` class.
2. Write a `ConfigTester` class to print the configuration settings.

**Expected Outcome**:
- The static method should correctly print the shared configuration settings.

### **Exercise 6: Generating Alphanumeric IDs**

**Scenario**: You need to generate alphanumeric IDs for `Order` objects in an e-commerce application. The IDs should have a prefix like "ORD" followed by a unique number.

**Task**:
- Implement a static variable `static int nextOrderId = 1000` in the `Order` class.
- Create a constructor that generates an ID like "ORD1001", "ORD1002", etc., for each new `Order`.
- Add a method `public String getOrderId()` to return the generated ID.

**Instructions**:
1. Implement the static variable and constructor in the `Order` class.
2. Write an `OrderTester` class to create multiple `Order` objects and print their IDs.

**Expected Outcome**:
- Each `Order` object should have a unique alphanumeric ID with the "ORD" prefix.

### **Exercise 7: Implementing a Singleton Pattern**

**Scenario**: You need to implement a class where only one instance of the class can ever be created. This is known as the Singleton pattern.

**Task**:
- Create a class `DatabaseConnection` with a private static variable `static DatabaseConnection instance`.
- Implement a static method `public static DatabaseConnection getInstance()` that returns the single instance of the class, creating it if it doesn’t already exist.

**Instructions**:
1. Implement the Singleton pattern in the `DatabaseConnection` class.
2. Write a `DatabaseConnectionTester` class to ensure that only one instance of `DatabaseConnection` is created, even when trying to create multiple instances.

**Expected Outcome**:
- The same instance should be returned every time `getInstance()` is called.

### **Exercise 8: Static Method for Common String Operations**

**Scenario**: Create a `StringUtil` class that provides common string operations as static methods, such as checking if a string is a palindrome or reversing a string.

**Task**:
- Implement a static method `public static boolean isPalindrome(String input)` to check if a string is a palindrome.
- Implement a static method `public static String reverse(String input)` to reverse a string.

**Instructions**:
1. Implement the static methods in the `StringUtil` class.
2. Write a `StringUtilTester` class to test both methods with various strings.

**Expected Outcome**:
- The static methods should correctly check for palindromes and reverse strings.

## Summary of Practice Exercises
- **Static Variables**: Practice generating unique IDs, tracking counts, and defining shared settings.
- **Static Methods**: Implement utility methods, factory methods, and the Singleton pattern.

These exercises should help solidify your understanding of static variables and methods in various practical scenarios.

[Back to Top](#top)

#### Next Topic: 
Go to [Inheritance](../../../learn/java/foundations/inheritance) to learn more with examples.