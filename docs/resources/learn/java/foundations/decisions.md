---
layout: default
title: Decisions
nav_order: 6
parent: Class Definitions
grand_parent: Learn
---

# Taking Decisions using Code (Conditional Statements)

<details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. [Why Take Decisions in Code?](#1-why-motivation-to-use-conditional-statements)
   {:toc}
2. [How and Where?](#2-how-syntax-specifics--tester-code-and-where-logical-placement-of-the-code)
   {:toc}
3. [When?](#3-when-scenarios-of-situations-when-conditional-statements-can-be-used)
   {:toc}
4. [Common Confusions for Absolute Beginners](#4-how-to-decide---any-general-confusions-for-absolute-beginners)
   {:toc}
</details>

## 1. Why (Motivation to Use Conditional Statements)

### **Why Use Conditional Statements?**

**Scenario 1: Making Decisions Based on User Input**
Imagine you’re building a program that interacts with users, such as a simple ATM system. The user might choose to check their balance, withdraw money, or deposit funds. To handle these different actions, your program needs to make decisions based on the user’s input. This is where conditional statements, like `if`, `else if`, and `else`, become essential. They allow your program to choose different paths of execution based on certain conditions.

**Scenario 2: Validating Data**
Consider a scenario where you need to validate user input, such as checking if a password meets certain criteria (like length and character requirements). Using conditional statements, you can evaluate each criterion and provide appropriate feedback to the user, ensuring that the input meets the required standards.

**Scenario 3: Handling Different Cases in a Switch**
In situations where you have multiple possible values for a variable (such as a menu selection or a status code), a `switch` statement can be more efficient and readable than multiple `if-else` statements. The `switch` statement allows your program to jump directly to the relevant case, improving performance and clarity.

Got it! I’ll provide the summary at the end. Let’s move on to the next step.

## 2. How (Syntax Specifics + Tester Code) and Where (Logical Placement of the Code)

### **How to Use Conditional Statements**

**1. `if` Statement**
- **Syntax**: The `if` statement evaluates a condition. If the condition is true, the code block inside the `if` statement is executed.
- **Where**: Use the `if` statement when you need to execute a block of code based on a specific condition.

```java
public class ATM {
    public static void main(String[] args) {
        double balance = 5000.00;
        double withdrawalAmount = 300.00;

        if (withdrawalAmount <= balance) {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }
}
```

**2. `else` Statement**
- **Syntax**: The `else` statement follows an `if` statement. If the `if` condition is false, the code block inside the `else` statement is executed.
- **Where**: Use `else` to define an alternative action if the `if` condition is not met.

```java
public class ATM {
    public static void main(String[] args) {
        double balance = 5000.00;
        double withdrawalAmount = 6000.00;

        if (withdrawalAmount <= balance) {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal denied.");
        }
    }
}
```

**3. `else if` Statement**
- **Syntax**: The `else if` statement allows you to check multiple conditions. If the first `if` condition is false, the `else if` condition is evaluated. If it is true, its block is executed.
- **Where**: Use `else if` when you need to evaluate multiple conditions in sequence.

```java
public class GradeCalculator {
    public static void main(String[] args) {
        int score = 85;

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
}
```

**4. `switch` Statement**
- **Syntax**: The `switch` statement is used for handling multiple possible values of a variable. Each possible value is called a "case". The code inside the matching case block is executed.
- **Where**: Use a `switch` statement when you have a variable that can take on multiple discrete values, and you want to execute different code based on those values.

```java
public class VendingMachine {
    public static void main(String[] args) {
        int itemNumber = 2;

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
    }
}
```

### **Where to Place Conditional Statements in Your Code**

- **In Methods**: Conditional statements are often placed inside methods to control the flow of logic based on parameters or user input.
- **In Constructors**: You might use conditional statements in constructors to validate or set up initial values based on certain conditions.
- **In Event Handlers**: In GUI applications or games, conditional statements are often used within event handlers to respond to user actions (e.g., button clicks, key presses).

Now that you’ve seen how to use and place conditional statements.

## 3. When (Scenarios of Situations When Conditional Statements Can Be Used)

### **When to Use Conditional Statements**

**1. `if` Statement**
- **Scenario**: Use an `if` statement when you need to check a single condition and execute a block of code only if that condition is true.
- **Example**: In a login system, you might check if a user’s password matches the stored password. If it does, you allow the login; if not, you deny access.

**2. `else` Statement**
- **Scenario**: Use an `else` statement when you want to define an alternative action if the `if` condition is false.
- **Example**: In an e-commerce application, if an item is in stock, you proceed to checkout; otherwise, you notify the user that the item is out of stock.

**3. `else if` Statement**
- **Scenario**: Use `else if` when you have multiple conditions to evaluate, and you want to perform different actions based on which condition is true.
- **Example**: In a grading system, you might use `else if` to assign letter grades based on a student's score: `A` for scores above 90, `B` for scores above 80, and so on.

**4. `switch` Statement**
- **Scenario**: Use a `switch` statement when you have a single variable that can take on multiple values, and you want to execute different blocks of code depending on the specific value.
- **Example**: In a menu-driven application, where each menu option corresponds to a different action (e.g., view account, deposit money, withdraw money), a `switch` statement is ideal for handling the selection.

### **How to Decide Which Conditional Statement to Use**

**1. `if` vs. `else if` vs. `else`**
- **Use `if`**: When there’s only one condition to check.
- **Use `else if`**: When there are multiple conditions to check in sequence.
- **Use `else`**: When you want to handle all cases not covered by `if` or `else if`.

**2. `if-else` vs. `switch`**
- **Use `if-else`**: When the conditions involve complex logic or ranges (e.g., checking if a number is within a range).
- **Use `switch`**: When you’re dealing with a single variable that can have a limited number of discrete values (e.g., day of the week, menu selection).

## 4. How to Decide - Any General Confusions for Absolute Beginners

### **How to Decide the Structure of Conditional Statements**

**1. Deciding Between `if` and `else if`**
- **Question**: Do you have multiple conditions to check, and only one of them should trigger?
- **Guideline**: Start with an `if` statement for the first condition. Use `else if` for additional conditions if you have multiple possibilities. The `else` block should handle the case where none of the `if` or `else if` conditions are true.

**Example**:
- **Scenario**: You want to assign a letter grade based on a student’s score.
- **Structure**:
  ```java
  if (score >= 90) {
      grade = "A";
  } else if (score >= 80) {
      grade = "B";
  } else if (score >= 70) {
      grade = "C";
  } else {
      grade = "F";
  }
  ```

**2. Deciding When to Use `else`**
- **Question**: Do you need to handle all cases not covered by `if` or `else if`?
- **Guideline**: Use `else` when you want a default action if none of the specified conditions are met. This is useful for catching unexpected inputs or providing a fallback action.

**Example**:
- **Scenario**: You’re checking if a user input is valid, but you want to display an error message if the input doesn’t match any expected values.
- **Structure**:
  ```java
  if (input.equals("Option1")) {
      // Do something
  } else if (input.equals("Option2")) {
      // Do something else
  } else {
      System.out.println("Invalid input. Please try again.");
  }
  ```

**3. Deciding Between `if-else` and `switch`**
- **Question**: Are you checking a single variable against multiple specific values?
- **Guideline**: Use a `switch` statement if you have a single variable and a defined set of possible values. Use `if-else` when your conditions involve ranges or complex logic.

**Example**:
- **Scenario**: You want to display different messages based on the day of the week.
- **Structure**:
  ```java
  switch (day) {
      case "Monday":
          System.out.println("Start of the work week.");
          break;
      case "Friday":
          System.out.println("Almost the weekend!");
          break;
      default:
          System.out.println("Midweek grind.");
          break;
  }
  ```

### **Common Confusions for Beginners**

**1. Mixing Up `if` and `else if`**
- **Explanation**: Beginners sometimes use multiple `if` statements where `else if` should be used. This leads to all conditions being checked, even when one is already true. Remember, `else if` only checks its condition if the previous `if` (or `else if`) was false.

**2. Forgetting to Use `else` for a Default Action**
- **Explanation**: Beginners might omit the `else` block, which can result in unhandled cases or unexpected behavior. Always consider whether an `else` is needed to handle any conditions not explicitly checked.

**3. Misunderstanding the `switch` Statement**
- **Explanation**: A common mistake is not using `break` in a `switch` statement, which causes fall-through behavior (where multiple cases are executed). Always include `break` unless you specifically want to allow fall-through.

**4. Using `if-else` Instead of `switch`**
- **Explanation**: Beginners might use multiple `if-else` statements where a `switch` would be clearer and more efficient. Use `switch` when you're dealing with a single variable and a small, defined set of values.

Are these decision-making guidelines and explanations clear? If so, we can move on to experimenting with conditional statements to see what could go wrong and how to avoid common pitfalls.

[Back to Top](#top)

#### Conditionals Experiments
Experiment with [Conditionals](../../../experiment/decisions) exercises.

#### Practice Exercises
Practice [Conditionals](../../../practice/java/foundations/decisions) with exercises.