---
layout: default
title: Class Definitions
parent: Learn
nav_order: 2
has_children: true
---

# Foundations of Class Definitions
{: .no_toc}

<details open markdown="block">
  <summary>
    Topics
  </summary>
  {: .text-delta }
  1. [Class Definitions in the Objects-First Approach](#class-definitions-in-the-objects-first-approach)
     {:toc}
  2. [Testing a class with Tester class](#tester-class-with-main-method)
     {:toc}
  3. [Setting Field Values Directly](#setting-field-values-directly)
     {:toc}
  4. [Practice Questions](#practice-writing-similar-code)
     {:toc}
</details>

## Class Definitions in the Objects-First Approach

### 1. **Introduction to Class Definitions**
   - **Class as a Blueprint**: In Java, a class serves as a blueprint for creating objects. It defines the properties (attributes) and behaviors (methods) that the objects created from it will have.
   - **Objects-First Approach**: This approach emphasizes understanding objects and their interactions early in the learning process. By starting with classes that model real-world entities, you can build a solid foundation in object-oriented programming.

### 2. **Starting with a Simple Structure: `BankAccount` Class**

**Class Name**: `BankAccount`

This will be the first class in the Bank Application project. The `BankAccount` class will represent the essential attributes and behaviors of a bank account.

#### **Step 1: Define the Class**
   - **Class Declaration**: The class starts with a declaration. In Java, this is done using the `class` keyword followed by the class name.
   ```java
      public class BankAccount {
         // class body
      }
   ```

#### **Step 2: Define Attributes (Fields)**
   - **Attributes**: These are the properties of the class, typically representing the state of an object. In the `BankAccount` class, common attributes might include `accountNumber`, `accountHolderName`, and `balance`.
   - **Data Types**: For each attribute, choose an appropriate data type. For example, `accountNumber` might be a `String`, `balance` might be a `double`, and `accountHolderName` could also be a `String`.
   ```java
      public class BankAccount {
         String accountNumber;
         String accountHolderName;
         double balance;
      }
   ```

## Tester Class with `main` Method

### 1. **Introduction to the `main` Method**
   - **Purpose**: The `main` method is the entry point of any Java application. It is where the execution of the program begins. 
   - **Structure**: The `main` method is always written as `public static void main(String[] args)`.

### 2. **Creating a Tester Class**

   **Class Name**: `BankAccountTester`

   This class will be used to create instances of the `BankAccount` class and test its functionality.
   ```java
   public class BankAccountTester {
      public static void main(String[] args) {
         // Execution starts here
      }
   }
   ```

### 3. **Testing the `BankAccount` Fields**

#### **Step 1: Create an Instance of `BankAccount`**
   - **Object Creation**: To test the `BankAccount` class, you first need to create an instance (object) of it. This is done using the `new` keyword followed by a call to the constructor of the `BankAccount` class.
   ```java
      BankAccount account1 = new BankAccount();
   ```

#### **Step 2: Access and Test the Fields**
   - **Accessing Fields**: Initially, you can access and print the values of the fields in the `BankAccount` object to verify that they are initialized correctly.
   - **Printing Field Values**: Use `System.out.println` to display the values of `accountNumber`, `accountHolderName`, and `balance`.
   ```java
      System.out.println("Account Number: " + account1.accountNumber);
      System.out.println("Account Holder Name: " + account1.accountHolderName);
      System.out.println("Balance: " + account1.balance);
   ```

### 4. **Full Code Example for `BankAccountTester`**
   ```java
   public class BankAccountTester {
      public static void main(String[] args) {
         // Creating an instance of BankAccount
         BankAccount account1 = new BankAccount();

         // Accessing and printing the field values
         System.out.println("Account Number: " + account1.accountNumber);
         System.out.println("Account Holder Name: " + account1.accountHolderName);
         System.out.println("Balance: " + account1.balance);
      }
   }
   ```

---

### Setting Field Values Directly

When fields are defined with default access, you can set their values directly in any class within the same package. This is a simple way to interact with the data in the object.

Here's how you can set field values directly in Tester class:

#### 1. **Creating an Instance of the Class**
   - First, you need to create an instance of the `BankAccount` class using the `new` keyword.
   ```java
   BankAccount account1 = new BankAccount();
   ```

#### 2. **Setting Field Values**

   - After creating the object, you can assign values to its fields directly by accessing them through the object reference (`account1` in this case).
   ```java
   account1.accountNumber = "123456789";           // Setting the account number
   account1.accountHolderName = "John Doe";        // Setting the account holder's name
   account1.balance = 1000.50;                     // Setting the initial balance
   ```

   - **Explanation**:
     - `account1.accountNumber = "123456789";`: This line sets the `accountNumber` field of the `account1` object to the string `"123456789"`.
     - `account1.accountHolderName = "John Doe";`: This line sets the `accountHolderName` field to `"John Doe"`.
     - `account1.balance = 1000.50;`: This line sets the `balance` field to `1000.50`.

#### 3. **Testing and Verifying**
   - After setting these values, you can print them out using `System.out.println` to verify that they have been correctly assigned.
   ```java
   System.out.println("Account Number: " + account1.accountNumber);
   System.out.println("Account Holder Name: " + account1.accountHolderName);
   System.out.println("Balance: " + account1.balance);
   ```

#### 4. **Full Code Example for `BankAccountTester` with setting values and printing**
   ```java
   public class BankAccountTester {
      public static void main(String[] args) {
         // Creating an instance of BankAccount
         BankAccount account1 = new BankAccount();

         // Setting field values directly
         account1.accountNumber = "123456789";           // Setting the account number
         account1.accountHolderName = "John Doe";        // Setting the account holder's name
         account1.balance = 1000.50;                     // Setting the initial balance

         // Accessing and printing the field values
         System.out.println("Account Number: " + account1.accountNumber);
         System.out.println("Account Holder Name: " + account1.accountHolderName);
         System.out.println("Balance: " + account1.balance);
      }
   }
   ```

### Practice Writing Similar Code

Go to [Practice](../../../../resources/experiment/java/foundations/class-defs) and find exercises there.