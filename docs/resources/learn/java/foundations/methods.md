---
layout: default
title: Methods
nav_order: 1
parent: Class Definitions
grand_parent: Learn
---

# Methods

<details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. [Why Methods?](#why-methods-motivation-behind)
   {:toc}
2. [Components of a Method](#2-breaking-down-a-method-header-and-method-signature)
   {:toc}
3. [When and Where to Use Methods](#4-when-and-where-to-use-methods)
   {:toc}
4. [How to choose Method components](#5-how-to-decide-method-names-parameters-and-return-types)
   {:toc}
5. [Accessors & Mutators](#6-accessors-and-mutators)
   {:toc}
6. [printDetails method](#7-creating-a-printdetails-method)
   {:toc}
</details>

## Why Methods? (Motivation behind)

### 1. **Understanding Methods in Java**

A **method** is a block of code that performs a specific task. In Java, methods are used to define the behaviors of objects. You can think of methods as functions or procedures that belong to a class.

### 2. **Breaking Down a Method Header and Method Signature**

A **method header** is the first line of a method. It defines the method's return type, name, parameters, and access level. A **method signature** is a part of the method header that includes the method name and the parameter list.

Let's break down a typical method header:

```java
public int addNumbers(int a, int b) {
    // method body
    return a + b;
}
```

**Components of the Method Header:**

- **public**: This is the **access specifier**. It defines the visibility of the method.
  - **public**: The method is accessible from any other class.
  - **private**: The method is accessible only within the same class.
  - **protected**: The method is accessible within the same package or subclasses.
  - **default** (no modifier): The method is accessible only within the same package.

- **int**: This is the **return type**. It specifies the type of value the method will return. In this case, the method returns an integer. If the method doesn't return anything, the return type is `void`.

- **addNumbers**: This is the **method name**. It should describe what the method does. Method names typically follow **camelCase** conventions.

- **(int a, int b)**: This is the **parameter list**. It defines the input values that the method requires. Each parameter has a type and a name.

### 3. **Understanding Method Signature**

The **method signature** includes the method's name and its parameter list. It uniquely identifies a method within a class. The return type is not part of the method signature.

**Example**:
For the method `addNumbers(int a, int b)`, the method signature is:
- `addNumbers(int, int)`

### 4. **When and Where to Use Methods**

Methods are used to:
- **Encapsulate Reusable Code**: If a piece of code is repeated in several places, you can place it in a method to avoid repetition.
- **Improve Readability**: Methods help in breaking down complex tasks into smaller, more manageable pieces.
- **Organize Code**: Methods logically group related functionality, making your code easier to understand and maintain.

Explore these in-depth [here](./methods-when-where).

### 5. **How to Decide Method Names, Parameters, and Return Types**

- **Method Names**:
  - Should be descriptive of the action the method performs.
  - Follow camelCase conventions (e.g., `calculateTotal`, `printDetails`).
  
- **Parameters**:
  - Include parameters that the method needs to perform its task.
  - Each parameter should have a clear and meaningful name.
  - The number and type of parameters depend on the method's functionality.

- **Return Types**:
  - The return type should match the type of value the method is supposed to return.
  - If the method performs an action without returning a value, use `void`.

**Example**:
- A method to calculate the area of a rectangle might be named `calculateArea`, take `length` and `width` as parameters, and return a `double` value.

### 6. **Accessors and Mutators**

- **Accessors**: These are methods used to retrieve the value of an object's field. Accessors are also known as **getters**.
- **Mutators**: These are methods used to modify the value of an object's field. Mutators are also known as **setters**.

**Example of Accessors and Mutators**:

```java
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Accessor (getter) for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Mutator (setter) for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
```

### 7. **Creating a `printDetails()` Method**

A common practice is to create a method that prints all the details of an object. This method typically doesn't return anything (`void` return type) and simply outputs the values of all the fields.

**Example of `printDetails()` Method**:

```java
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Accessor for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Mutator for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Method to print all the details of the BankAccount
    public void printDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }
}
```

**Using the `printDetails()` Method**:

```java
public class BankAccountTester {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account1 = new BankAccount("123456789", "John Doe", 1000.50);

        // Printing the details of the account
        account1.printDetails();
    }
}
```

**Expected Output**:
```
Account Number: 123456789
Account Holder Name: John Doe
Balance: $1000.5
```

### Conclusion

- **Methods** are essential building blocks in Java, used to define the behaviors of objects.
- Understanding the **method header** and **method signature** helps in writing clear and effective code.
- **Accessors (getters)** and **Mutators (setters)** are methods that encapsulate field access and modification.
- The `printDetails()` method is a handy way to output all the field values of an object, providing a quick summary of its state.

By mastering methods, you'll be able to write cleaner, more modular, and maintainable code.

[Back to Top](#top)

#### Practice Exercises
Practice [Methods](../../../practice/java/foundations/methods) with exercises.