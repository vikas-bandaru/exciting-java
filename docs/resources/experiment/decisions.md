---
layout: default
title: Decisions
parent: Class Definitions
nav_order: 2
grand_parent: Experiment
---

# Experiments with Taking Decisions using Code (Conditional Statements)
{: .no_toc}

<details open markdown="block">
  <summary>
    Topics
  </summary>
  {: .text-delta }
  1. [Experiment 1](#experiment-1-forgetting-the-else-block)
     {:toc}
  2. [Experiment 2](#experiment-2-misusing-else-if-instead-of-multiple-if-statements)
     {:toc}
  3. [Experiment 3](#experiment-3-missing-break-in-a-switch-statement)
     {:toc}
  4. [Experiment 4](#experiment-4-using--instead-of-equals-for-string-comparison)
     {:toc}
  5. [Experiment 5](#experiment-5-overlooking-the-default-case-in-a-switch-statement)
     {:toc}
</details>

## Experiments (Different Combinations of What Could Go Wrong - Syntactically, Logically, and Exceptionally)

### **Experiment 1: Forgetting the `else` Block**

**What Could Go Wrong?**
- **Logically**: If you forget to include an `else` block when it's needed, certain inputs might not be handled properly, leading to unexpected behavior.

**Example**:
```java
public class LoginSystem {
    public static void main(String[] args) {
        String storedPassword = "securePass";
        String enteredPassword = "wrongPass";

        if (enteredPassword.equals(storedPassword)) {
            System.out.println("Login successful.");
        }
        // No else block to handle incorrect password
    }
}
```

**What Happens**:
- **Expected**: You might expect a message saying "Login failed" if the password is incorrect.
- **Actual**: The program will do nothing if the password is incorrect because there’s no `else` block to handle this case.

**Solution**:
- Add an `else` block to handle the case where the passwords don’t match.

```java
if (enteredPassword.equals(storedPassword)) {
    System.out.println("Login successful.");
} else {
    System.out.println("Login failed.");
}
```

### **Experiment 2: Misusing `else if` Instead of Multiple `if` Statements**

**What Could Go Wrong?**
- **Logically**: Using `else if` when you actually need multiple independent `if` statements can cause only one condition to be checked, ignoring others that might also be true.

**Example**:
```java
public class HealthCheck {
    public static void main(String[] args) {
        int temperature = 101; // Fever
        int bloodPressure = 140; // High blood pressure

        if (temperature > 100) {
            System.out.println("You have a fever.");
        } else if (bloodPressure > 130) {
            System.out.println("You have high blood pressure.");
        }
    }
}
```

**What Happens**:
- **Expected**: The program should check for both fever and high blood pressure.
- **Actual**: Only the fever condition is checked because the `else if` prevents the second condition from being evaluated if the first is true.

**Solution**:
- Use separate `if` statements when multiple conditions need to be checked independently.

```java
if (temperature > 100) {
    System.out.println("You have a fever.");
}
if (bloodPressure > 130) {
    System.out.println("You have high blood pressure.");
}
```

### **Experiment 3: Missing `break` in a `switch` Statement**

**What Could Go Wrong?**
- **Syntactically**: The code will compile, but it may not behave as expected because of unintended fall-through.
- **Logically**: Without `break` statements, multiple cases in a `switch` statement might be executed, leading to incorrect outputs.

**Example**:
```java
public class VendingMachine {
    public static void main(String[] args) {
        int itemNumber = 2;

        switch (itemNumber) {
            case 1:
                System.out.println("You selected a soda.");
            case 2:
                System.out.println("You selected a snack.");
            case 3:
                System.out.println("You selected water.");
            default:
                System.out.println("Invalid selection.");
        }
    }
}
```

**What Happens**:
- **Expected**: Only the message for the selected item should be printed.
- **Actual**: Multiple messages might be printed because there are no `break` statements to stop the execution after each case.

**Solution**:
- Always include `break` statements after each case unless you specifically want the fall-through behavior.

```java
switch (itemNumber) {
    case 1:
        System.out.println("You selected a soda.");
        break;
    case 2:
        System.out.println("You selected a snack.");
        break;
    case 3:
        System.out.println("You selected water.");
        break;
    default:
        System.out.println("Invalid selection.");
        break;
}
```

### **Experiment 4: Using `==` Instead of `.equals()` for String Comparison**

**What Could Go Wrong?**
- **Logically**: Using `==` to compare strings checks if the references are the same, not if the content is the same, leading to incorrect results when comparing user inputs or text.

**Example**:
```java
public class StringComparison {
    public static void main(String[] args) {
        String correctPassword = "securePass";
        String enteredPassword = new String("securePass");

        if (enteredPassword == correctPassword) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Login failed.");
        }
    }
}
```

**What Happens**:
- **Expected**: You might expect "Login successful" because the content of both strings is the same.
- **Actual**: "Login failed" might be printed because `==` compares object references, not the content of the strings.

**Solution**:
- Use the `.equals()` method to compare the content of strings.

```java
if (enteredPassword.equals(correctPassword)) {
    System.out.println("Login successful.");
} else {
    System.out.println("Login failed.");
}
```

### **Experiment 5: Overlooking the Default Case in a `switch` Statement**

**What Could Go Wrong?**
- **Logically**: If a `switch` statement doesn’t include a `default` case, certain inputs might not be handled, leading to the program doing nothing or behaving unexpectedly.

**Example**:
```java
public class DayOfWeek {
    public static void main(String[] args) {
        int day = 8; // Invalid day

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            // Other cases omitted for brevity
        }
    }
}
```

**What Happens**:
- **Expected**: You might expect an error message or some feedback for an invalid day.
- **Actual**: Nothing happens if the day doesn’t match any case because there’s no `default` case.

**Solution**:
- Always include a `default` case in a `switch` statement to handle unexpected or invalid inputs.

```java
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid day.");
        break;
}
```

## **Summary of Experiments**:
- **Syntactical Issues**: Forgetting `break` in a `switch` statement, using `==` instead of `.equals()` for strings.
- **Logical Issues**: Misusing `else if` when `if` is needed, omitting `else` blocks when they are necessary, or forgetting the `default` case in `switch`.
- **Exceptional Scenarios**: Ensuring all possible conditions are handled, especially with complex conditional logic.

Would you like to proceed with the practice exercises now?

[Back to Top](#top)

#### Practice Exercises
Practice [Conditionals](../practice/java/foundations/decisions) with exercises.

#### Next Topic: 
Go to [Loops](../learn/java/foundations/loops) to learn more with examples.
