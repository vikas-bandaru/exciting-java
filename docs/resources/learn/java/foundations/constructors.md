---
layout: default
title: Constructors
nav_order: 1
parent: Class Definitions
grand_parent: Learn
---

# Constructors

<details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. [Why Encapsulation](#why-encapsutlation-motivation-behind)
   {:toc}
</details>

## Why Constructors? (Motivation behind)

### 1. **Experimenting with Object Creation**
Let's start with the code we have so far, focusing on the object creation statement:

```java
BankAccount account1 = new BankAccount();
```

- **What is Happening Here?**
  - The keyword `new` is used to create

a new instance (or object) of the `BankAccount` class. 
  - The `BankAccount()` part calls the **constructor** of the `BankAccount` class. A constructor is a special method that is automatically called when an object is created.
  - Right now, even though we haven't written a constructor in the `BankAccount` class, Java provides a **default constructor** behind the scenes, which allows us to create an object using `new BankAccount()`.

### 2. **What is a Constructor?**
- A **constructor** is a block of code that initializes a newly created object. It looks similar to a method but does not have a return type (not even `void`), and its name is always the same as the class name.
- The **default constructor** provided by Java does nothing but create an instance of the class.

### 3. **Experiment: Adding a Custom Constructor**

Let's modify the `BankAccount` class by adding a custom constructor. This will allow us to see how constructors work by executing some code whenever an object is created.

**Step 1: Add a Custom Constructor to `BankAccount`**

```java
public class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    // Custom constructor
    public BankAccount() {
        // This code will run when a new BankAccount object is created
        System.out.println("A new BankAccount object has been created!");
    }
}
```

**Step 2: Test the Custom Constructor**

Now, when you run the same object creation code in your `BankAccountTester` class:

```java
public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
    }
}
```

**Expected Output**:
```
A new BankAccount object has been created!
```

- **Explanation**: When `new BankAccount()` is executed, the custom constructor is called, and the message "A new BankAccount object has been created!" is printed. This shows that the constructor is indeed executed every time an object is created.

### 4. **Parameterized Constructors**

Now, let’s take it a step further by adding a **parameterized constructor**. This type of constructor allows you to pass initial values when creating an object.

**Step 1: Add a Parameterized Constructor to `BankAccount`**

```java
public class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    // Parameterized constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        System.out.println("A new BankAccount object has been created with details!");
    }
}
```

**Step 2: Test the Parameterized Constructor**

Now, you can create an object and directly set the values of `accountNumber`, `accountHolderName`, and `balance`:

```java
public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456789", "John Doe", 1000.50);

        System.out.println("Account Number: " + account1.accountNumber);
        System.out.println("Account Holder Name: " + account1.accountHolderName);
        System.out.println("Balance: " + account1.balance);
    }
}
```

**Expected Output**:
```
A new BankAccount object has been created with details!
Account Number: 123456789
Account Holder Name: John Doe
Balance: 1000.5
```

- **Explanation**:
  - When you use the parameterized constructor like `new BankAccount("123456789", "John Doe", 1000.50)`, the values `"123456789"`, `"John Doe"`, and `1000.50` are passed to the constructor.
  - Inside the constructor, these values are assigned to the corresponding fields (`accountNumber`, `accountHolderName`, `balance`).
  - The message "A new BankAccount object has been created with details!" is printed, confirming that the constructor ran with the provided values.

### 5. **Why Use Parameterized Constructors?**

- **Convenience**: Instead of setting each field individually after creating an object, a parameterized constructor allows you to set them all at once when the object is created.
- **Initial Setup**: Parameterized constructors are useful when you want to ensure that an object is always created with some necessary initial values.

### 6. **Overloading Constructors**

Sometimes, you might want to provide different ways to create an object. This can be done by **overloading** constructors—creating multiple constructors with different parameter lists.

**Example**:

```java
public class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    // Default constructor
    public BankAccount() {
        System.out.println("A new BankAccount object has been created!");
    }

    // Parameterized constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        System.out.println("A new BankAccount object has been created with details!");
    }
}
```

- **Using Different Constructors**:
  ```java
  BankAccount account1 = new BankAccount(); // Uses the default constructor
  BankAccount account2 = new BankAccount("987654321", "Jane Smith", 500.75); // Uses the parameterized constructor
  ```

- **Why Overload Constructors?**: Overloading allows you to create objects in different ways depending on the information available at the time of creation.

## Conclusion
Constructors are essential for setting up objects when they are created. By experimenting with both default and parameterized constructors, you can control how objects are initialized and ensure that they always start with the right data. Overloading constructors gives you flexibility in how objects are created.

[Back to Top](#top)

#### Practice Exercises
Practice [Constructors](../../../practice/java/foundations/constructors) with exercises.