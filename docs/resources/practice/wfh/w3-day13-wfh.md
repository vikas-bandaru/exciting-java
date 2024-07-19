---
layout: default
title: Work from Home
parent: Day 13
grand_parent: Week 3
nav_order: 2
---

# Module 1: Java Foundations
## Week 2: Foundations of OOP & Algorithmic Thinking
### Day 13: Understanding Class Definitions (Conditional Statements)

## Work from Home
### Scope and Lifetime

**Let's Experiment**  
1. After a ticket has been printed, could the value in the `balance` field ever be set to a negative value by subtracting `price` from it? Justify your answer.
2. So far, we have introduced you to two arithmetic operators, + and −, that can be used in arithmetic expressions in Java. Take a look at [Java Operators](../../../handouts/operators) to find out what other operators are available.
3. Write an assignment statement that will store the result of multiplying two variables, `price` and `discount`, into a third variable, `saving`.
4. Write an assignment statement that will divide the value in `total` by the value in `count` and store the result in `mean`.
5. Write an if-statement that will compare the value in `price` against the value in `budget`. If `price` is greater than `budget`, then print the message “Too expensive”; otherwise print the message “Just right”.
6. Modify your answer to the previous exercise so that the message includes the value of your budget if the price is too high.

### Local Variables
A local variable is a variable declared and used within a single method. Its scope and lifetime are limited to that of the method.  
> **pitfall** A local variable of the same name as a field will prevent the field being accessed from within a constructor or method. See [this n super](../../../resources/handouts/this-n-super) section of Handouts for a way around this when necessary.  

**Let's Experiment**  
1. Why does the following version of `refundBalance` not give the same results as the original?

   ```java
   public int refundBalance()
   {
     balance = 0;
     return balance;
   }
   ```

   What tests can you run to demonstrate that it does not?

2. What happens if you try to compile the `TicketMachine` class with the following version of `refundBalance`?

   ```java
   public int refundBalance()
   {
     return balance;
     balance = 0;
   }
   ```

   What do you know about return statements that helps to explain why this version does not compile?

3. What is wrong with the following version of the constructor of `TicketMachine`?

   ```java
   public TicketMachine(int cost)
   {
     int price = cost;
     balance = 0;
     total = 0;
   }
   ```

   Try out this version in the better-ticket-machine project. Does this version compile? Create an object and then inspect its fields. Do you notice something wrong about the value of the `price` field in the inspector with this version? Can you explain why this is?

### Fields, Parameters and Local Variables

**Let's Experiment**  
1. Add a new method, `emptyMachine`, that is designed to simulate emptying the machine of money. It should reset `total` to be zero, but also return the value that was stored in `total` before it was reset.
2. Rewrite the `printTicket` method so that it declares a local variable, `amountLeftToPay`. This should then be initialized to contain the difference between `price` and `balance`. Rewrite the test in the conditional statement to check the value of `amountLeftToPay`. If its value is less than or equal to zero, a ticket should be printed; otherwise, an error message should be printed stating the amount left to pay. Test your version to ensure that it behaves in exactly the same way as the original version. Make sure that you call the method more than once, when the machine is in different states, so that both parts of the conditional statement will be executed on separate occasions.

### Summary of the better ticket machine
<!-- Move this content to Google Docs and ask students to read the content and create a discussion around it.
      Giving very high scores to those who point out the meaning correctly and boldly so that others are motivated to talk more to get that scores easily.
 -->
### Experimenting with Expressions in Code Pad

1. Consider the following expressions. Try to predict their results, and then type them in the Code Pad to check your answers.  
   `99 + 3`  
   `"cat" + "fish"`  
   `"cat" + 9`  
   `9 + 3 + "cat"`  
   `"cat" + 3 + 9`  
   `"catfish".substring(3,4)`  
   `"catfish".substring(3,8)`  
   Did you learn anything you did not expect from the exercise? If so, what was it?