---
layout: default
title: Static
parent: Class Definitions
nav_order: 1
grand_parent: Experiment
---

# Experiments with Static
{: .no_toc}

<details open markdown="block">
  <summary>
    Topics
  </summary>
  {: .text-delta }
  1. [Experiment 1](#experiment-1-trying-to-access-instance-variables-from-a-static-method)
     {:toc}
  2. [Experiment 2](#experiment-2-forgetting-to-increment-a-static-variable)
     {:toc}
  3. [Experiment 3](#experiment-3-misusing-static-methods-for-instance-specific-tasks)
     {:toc}
  4. [Experiment 4](#experiment-4-incorrect-usage-of-static-variables)
     {:toc}
  5. [Experiment 5](#experiment-5-forgetting-the-static-keyword-for-utility-methods)
     {:toc}
</details>

## Experiments (Different Combinations of What Could Go Wrong - Syntactically, Logically, and Exceptionally)

### **Experiment 1: Trying to Access Instance Variables from a Static Method**

**What Could Go Wrong?**
- **Syntactically**: If you try to access an instance variable directly from a static method, the code will not compile.
- **Logically**: Beginners might assume that static methods can access instance variables because they are in the same class, but static methods belong to the class itself, not to any specific object.

**Example**:
```java
public class BankAccount {
    private String accountNumber;
    private double balance;

    public static void printAccountDetails() {
        // This will cause a compilation error
        System.out.println("Account Number: " + accountNumber); // ERROR
        System.out.println("Balance: " + balance); // ERROR
    }
}
```

**Explanation**:
- **Why It’s Wrong**: The method `printAccountDetails()` is static, so it cannot access the instance variables `accountNumber` and `balance` directly because these variables belong to specific objects, not the class itself.

**Solution**:
- You should either pass an object of `BankAccount` to the method or make the method non-static if it needs to access instance variables.

### **Experiment 2: Forgetting to Increment a Static Variable**

**What Could Go Wrong?**
- **Logically**: If you use a static variable to generate unique IDs or track the number of instances, but forget to increment it in the constructor, all instances might end up with the same ID, or the counter will always show `1`.

**Example**:
```java
public class BankAccount {
    static int accountCount = 0;
    private int accountId;

    public BankAccount() {
        // Forgot to increment accountCount
        accountId = accountCount;
    }

    public int getAccountId() {
        return accountId;
    }
}
```

**Test Scenario**:
```java
public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        
        System.out.println("Account 1 ID: " + account1.getAccountId()); // Expected: 1
        System.out.println("Account 2 ID: " + account2.getAccountId()); // Expected: 2
    }
}
```

**Expected vs. Actual Output**:
- **Expected**: Account 1 ID: 1, Account 2 ID: 2
- **Actual**: Account 1 ID: 0, Account 2 ID: 0 (because `accountCount` wasn’t incremented).

**Solution**:
- Make sure to increment the static variable `accountCount` in the constructor.

```java
public BankAccount() {
    accountCount++;
    accountId = accountCount;
}
```

### **Experiment 3: Misusing Static Methods for Instance-Specific Tasks**

**What Could Go Wrong?**
- **Logically**: If a method is made static but it actually requires instance-specific data (like accessing instance variables), you’ll end up with incorrect or non-functional code.

**Example**:
```java
public class BankAccount {
    private String accountNumber;
    private double balance;

    public static void updateBalance(double amount) {
        // Incorrectly made static: trying to update balance, but no instance to reference
        balance += amount; // ERROR: Non-static variable 'balance' cannot be referenced from a static context
    }
}
```

**Explanation**:
- **Why It’s Wrong**: `updateBalance` should not be static because it needs to modify the `balance` of a specific `BankAccount` object. The static method doesn’t have access to `balance` because `balance` is tied to individual instances.

**Solution**:
- Remove the `static` keyword if the method needs to modify or access instance variables.

```java
public void updateBalance(double amount) {
    balance += amount;
}
```

### **Experiment 4: Incorrect Usage of Static Variables**

**What Could Go Wrong?**
- **Logically**: Using a static variable when it should be an instance variable can lead to unintended sharing of data across objects.

**Example**:
```java
public class Employee {
    static String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

**Test Scenario**:
```java
public class EmployeeTester {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John");
        Employee emp2 = new Employee("Jane");

        System.out.println(emp1.getName()); // Expected: John
        System.out.println(emp2.getName()); // Expected: Jane
    }
}
```

**Expected vs. Actual Output**:
- **Expected**: emp1’s name should be "John" and emp2’s name should be "Jane".
- **Actual**: Both emp1 and emp2 will have the name "Jane" because the `name` variable is static and shared among all instances.

**Solution**:
- Change the static variable to an instance variable so that each `Employee` object has its own `name`.

```java
public class Employee {
    private String name; // No static keyword here

    public Employee(String name) {
        this.name = name;
    }
}
```

### **Experiment 5: Forgetting the `static` Keyword for Utility Methods**

**What Could Go Wrong?**
- **Syntactically**: If you forget to make a utility method static, you’ll have to create an instance of the class to use the method, even though it’s intended to be a class-level method.

**Example**:
```java
public class MathUtility {
    // Forgot to add static keyword
    public int findMax(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }
}
```

**Test Scenario**:
```java
public class MathUtilityTester {
    public static void main(String[] args) {
        int max = MathUtility.findMax(10, 20); // ERROR: Non-static method 'findMax(int, int)' cannot be referenced from a static context
    }
}
```

**Solution**:
- Add the `static` keyword to the method to allow it to be called using the class name.

```java
public static int findMax(int num1, int num2) {
    return (num1 > num2) ? num1 : num2;
}
```

## **Summary of Experiments**:
- **Syntactical Issues**: Trying to access instance variables from static methods or forgetting to make utility methods static.
- **Logical Issues**: Using static variables where instance variables are needed, or not incrementing static counters.
- **Exceptional Scenarios**: Misusing static methods for tasks that require instance-specific data.

[Back to Top](#top)

#### Practice Exercises
Practice [Static](../practice/java/foundations/static) with exercises.

#### Next Topic: 
Go to [Conditionals](../learn/java/foundations/decisions) to learn more with examples.
