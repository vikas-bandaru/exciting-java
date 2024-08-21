---
layout: default
title: Encapsulation
nav_order: 1
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
2. [Encapsulation as a Solution](#introducing-encapsulation-as-a-solution)
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

### 2. **How Does Encapsulation Work?**

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

### 3. **Why Use Encapsulation?**

**1. **Protecting Data Integrity**:
   - **Example**: In the `BankAccount` class, we added a check in the `setBalance` method to ensure that the balance cannot be set to a negative number. This helps prevent errors and keeps the data accurate.

**2. **Improving Security**:
   - **Example**: By making the fields private, we ensure that sensitive information like `accountNumber` and `balance` can’t be accessed directly from outside the class. Only the methods we provide (`getters` and `setters`) can interact with this data.

**3. **Making Code Easier to Maintain**:
   - **Example**: If we decide to change how the balance is calculated or stored in the future, we can do it inside the `BankAccount` class without affecting the rest of the program. This makes our code more flexible and easier to update.

### 4. **Testing Encapsulation with a Tester Class**

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

### 5. **What Did We Achieve?**
   - **Controlled Access**: We now have control over how the `balance`, `accountNumber`, and `accountHolderName` are accessed and modified.
   - **Data Validation**: We can add checks to ensure the data is valid before changing it (like preventing a negative balance).
   - **Security and Maintenance**: The data is secure, and our code is easier to maintain in the long run.

## Conclusion
Encapsulation helps us keep our data safe and our code more reliable. By using private fields and controlling access through getters and setters, we can avoid many of the issues that come with direct data access. This approach makes our programs more robust and easier to work with.
