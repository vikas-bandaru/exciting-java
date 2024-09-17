---
layout: default
title: Encapsulation
nav_order: 3
parent: Class Definitions
grand_parent: Learn
---

# Encapsulation

<details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. [Why Encapsulation](#why-encapsutlation-motivation-behind)
   {:toc}
2. [Understanding Getters and Setters](#2-understanding-getters-and-setters)
   {:toc}
3. [How does Encapsulation work?](#7-how-does-encapsulation-work)
   {:toc}
4. [Why use Encapsulation](#8-why-use-encapsulation)
   {:toc}
5. [Testing Encapsulation](#9-testing-encapsulation-with-a-tester-class)
   {:toc}
6. [Practice Encapsulation](#practice-exercises)
   {:toc}
</details>

## Why Encapsutlation (Motivation behind)

### Understanding the Disadvantages of Direct Data Access

When you allow other parts of your program to access and change data directly, it can sometimes cause problems. Here are some real-world examples to show why it's usually better to control how data is accessed.

### 1. **Bank Account Balance Errors**
   - **Scenario**: Imagine you have a program that manages bank accounts. If other parts of your program can directly change the `balance` of an account, someone might accidentally set it to a negative number, like `-500`. This doesn't make sense because a bank account balance shouldn’t be negative without special handling (like an overdraft).
   - **Why It's a Problem**: Allowing direct changes can lead to mistakes that affect how the program works. It might even let someone change their balance without proper checks, which can cause big issues in a banking system.

### 2. **Inventory Count Mistakes**
   - **Scenario**: Think of a store's inventory system that tracks how many items are in stock. If the `quantity` of an item is changed directly, someone might set it to a wrong number by mistake, like setting it to `10` when there are actually `0` items left.
   - **Why It's a Problem**: This could make the store think it has items in stock when it doesn’t. Customers might order something that isn’t really available, leading to confusion and unhappy customers.

### 3. **Salary Information Security**
   - **Scenario**: In a company, each employee has a salary. If the `salary` field in the program is accessible to everyone, someone might look at or change it without permission.
   - **Why It's a Problem**: Salary information is private. If anyone can see or change it, it could lead to security issues, like someone getting paid the wrong amount or private information being exposed.

### 4. **Managing Product Prices**
   - **Scenario**: Imagine an online store where you can directly change the `price` of products. If many different parts of the program are changing prices without coordination, the price might get set incorrectly, like giving a huge discount by mistake.
   - **Why It's a Problem**: This can make it hard to keep prices accurate, leading to lost profits or customer confusion when prices don't match what they expect.

### 5. **Protecting Medical Records**
   - **Scenario**: In a healthcare program, each patient has a `medicalHistory` that includes important details about their health. If anyone can directly change this information, it might get altered by mistake or without proper checks.
   - **Why It's a Problem**: Medical records are sensitive and need to be accurate. Mistakes or unauthorized changes can lead to incorrect treatments or privacy issues.

### **The Solution: Controlling Data Access**
   - Instead of letting other parts of the program access and change data directly, we should use methods (called `getters` and `setters`) to control how data is accessed. This way, we can check the data before it's changed and make sure everything stays accurate and secure.

---

## Introducing Encapsulation as a Solution

Now that we've seen the problems that can happen when data is accessed directly, let's look at how we can solve these issues using a concept called **encapsulation**.

### 1. **What is Encapsulation?**
   - **Encapsulation** is a way to protect the data inside a class by making the fields private. This means that the data can't be accessed or changed directly from outside the class.
   - Instead, you control access to the data through special methods called **getters** and **setters**. This allows you to check and manage the data before it’s used or modified.

Sure! Here's a simple guide to help absolute beginners understand how to choose method headers and write the internal code for setters and getters.

### 2. **Understanding Getters and Setters**
   - **Getters**: These are methods used to retrieve or "get" the value of a private field.
   - **Setters**: These are methods used to set or update the value of a private field.

### 3. **Choosing Method Headers**
The method header is the first line of a method that includes the return type, method name, and parameters. Let's break it down step by step.

#### **For Getters:**
   - **Return Type**: The return type should match the type of the field you want to retrieve.
     - If the field is a `String`, the return type will be `String`.
     - If the field is an `int`, the return type will be `int`.
     - If the field is a `double`, the return type will be `double`, and so on.

   - **Method Name**: The method name for a getter usually starts with the word `get` followed by the field name with the first letter capitalized. This is called **camelCase**.
     - For example, if the field is named `balance`, the getter method should be named `getBalance`.

   - **Parameters**: Getters do not take any parameters because their job is simply to return the value of a field.

   **Example**:
   ```java
   // Field: private String name;

   // Getter method header
   public String getName() {
      // Internal code
      
   }
   ```

#### **For Setters:**
   - **Return Type**: Setters do not return any value, so the return type is always `void`.

   - **Method Name**: The method name for a setter usually starts with the word `set` followed by the field name with the first letter capitalized.
     - For example, if the field is named `balance`, the setter method should be named `setBalance`.

   - **Parameters**: Setters take one parameter, which is the new value you want to assign to the field. The parameter's type should match the field's type.
     - For example, if the field is a `double`, the parameter type should also be `double`.

   **Example**:
   ```java
   // Field: private double balance;

   // Setter method header
   public void setBalance(double balance) {
      // Internal code
      
   }
   ```

### 4. **Writing the Internal Code**

#### **For Getters**:
   - The internal code of a getter is straightforward. You simply return the value of the private field.
   - Use the `return` keyword followed by the field name.

   **Example**:
   ```java
   // Field: private String name;

   // Getter method
   public String getName() {
      return name; // Returns the value of the 'name' field
   }
   ```

#### **For Setters**:
   - The internal code of a setter assigns the value from the parameter to the private field.
   - Use the `this` keyword to refer to the current object's field. This helps avoid confusion between the field and the parameter when they have the same name.

   **Example**:
   ```java
   // Field: private double balance;

   // Setter method
   public void setBalance(double balance) {
      this.balance = balance; // Sets the value of the 'balance' field to the value passed in the parameter
   }
   ```

### 5. **Summary of Steps**
   1. **Identify the field type** (e.g., `String`, `int`, `double`).
   2. **For the getter**:
      - Set the return type to match the field type.
      - Name the method `get` + `FieldName`.
      - Return the field value inside the method.
   3. **For the setter**:
      - Set the return type to `void`.
      - Name the method `set` + `FieldName`.
      - Take a parameter that matches the field type.
      - Assign the parameter value to the field using `this.fieldName = parameterName`.

### 6. **Practical Example**
Let’s say we have a class with a `String` field called `title`:

```java
public class Book {
    private String title;

    // Getter for title
    public String getTitle() {
        return title; // Returns the current value of title
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title; // Updates the title field with the new value
    }
}
```

By following these simple steps, you can create getter and setter methods that safely manage access to your class fields.

### 7. **How Does Encapsulation Work?**

Let's take our previous `BankAccount` class and modify it to use encapsulation.

**Original Class with Default Fields:**

```java
public class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;
}
```

**Updated Class with Encapsulation:**

```java
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }
    // Setter for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    // Getter for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }
    // Setter for accountHolderName
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    // Getter for balance
    public double getBalance() {
        return balance;
    }
    // Setter for balance
    public void setBalance(double balance) {
        if (balance >= 0) { // Adding a simple check to ensure balance is not negative
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }
}
```

### 8. **Why Use Encapsulation?**

**1. **Protecting Data Integrity**:
   - **Example**: In the `BankAccount` class, we added a check in the `setBalance` method to ensure that the balance cannot be set to a negative number. This helps prevent errors and keeps the data accurate.

**2. **Improving Security**:
   - **Example**: By making the fields private, we ensure that sensitive information like `accountNumber` and `balance` can’t be accessed directly from outside the class. Only the methods we provide (`getters` and `setters`) can interact with this data.

**3. **Making Code Easier to Maintain**:
   - **Example**: If we decide to change how the balance is calculated or stored in the future, we can do it inside the `BankAccount` class without affecting the rest of the program. This makes our code more flexible and easier to update.

### 9. **Testing Encapsulation with a Tester Class**

Let's update our tester class to work with the encapsulated `BankAccount` class.

```java
public class BankAccountTester {
    public static void main(String[] args) {
        // Creating an instance of BankAccount
        BankAccount account1 = new BankAccount();
        
        // Using setters to set values
        account1.setAccountNumber("123456789");
        account1.setAccountHolderName("John Doe");
        account1.setBalance(1000.50);

        // Using getters to get and print the values
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Account Holder Name: " + account1.getAccountHolderName());
        System.out.println("Balance: " + account1.getBalance());
        
        // Attempting to set an invalid balance
        account1.setBalance(-500);  // This should print a message and not update the balance
        System.out.println("Updated Balance: " + account1.getBalance());
    }
}
```

### 10. **What Did We Achieve?**
   - **Controlled Access**: We now have control over how the `balance`, `accountNumber`, and `accountHolderName` are accessed and modified.
   - **Data Validation**: We can add checks to ensure the data is valid before changing it (like preventing a negative balance).
   - **Security and Maintenance**: The data is secure, and our code is easier to maintain in the long run.

## Conclusion
Encapsulation helps us keep our data safe and our code more reliable. By using private fields and controlling access through getters and setters, we can avoid many of the issues that come with direct data access. This approach makes our programs more robust and easier to work with.

[Back to Top](#top)

#### Practice Exercises
Practice [Encapsulation](../../../practice/java/foundations/encapsulation) with exercises.