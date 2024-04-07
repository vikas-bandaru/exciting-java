---
layout: default
title: Pomodoro 2
parent: Day 2
grand_parent: Module 1 Week 1
nav_order: 2
---

# Module 1: Java Foundations

## Week 1: Foundations of OOP & Algorithmic Thinking

### Day 2: Understanding Class Definitions

## Session 2: Better Ticket Machines

### Experiments with the `TicketMachine` object before and after examining the class in _better-ticket-machine_ project

1. Check that the behavior we have discussed here is accurate by creating a `TicketMachine` instance and calling `insertMoney` with various actual parameter values. Check the balance both before and after calling `insertMoney`. Does the balance ever change in the cases when an error message is printed? Try to predict what will happen if you enter the value zero as the parameter, and then see if you are right.
2. Predict what you think will happen if you change the test in `insertMoney` to use the greater-than or equal-to operator:  
    `if(amount >= 0)`  
   Check your predictions by running some tests. What is the one situation in which it makes a difference to the behavior of the method?
3. Rewrite the if-else statement so that the method still behaves correctly but the error message is printed if the boolean expression is true but the balance is increased if the expression is false. You will obviously have to rewrite the condition to make things happen this way around.
4. In the _figures_ project we looked at in Day 1 we used a `boolean` field to control a feature of the circle objects. What was that feature? Was it well suited to being controlled by a type with only two different values?
5. In this version of `printTicket`, we also do something slightly different with the `total` and `balance` fields. Compare the implementation of the method in _naive-ticket-machine_ with that in the current project, _better-ticket-machine_, to see whether you can tell what those differences are. Then check your understanding by experimenting within BlueJ.
6. Is it possible to remove the else part of the if-statement in the `printTicket` method (i.e., remove the word `else` and the block attached to it)? Try doing this and seeing if the code still compiles. What happens now if you try to print a ticket without inserting any money?

### Experiments after discussing Scope and Lifetime

1. After a ticket has been printed, could the value in the `balance` field ever be set to a negative value by subtracting `price` from it? Justify your answer.
2. So far, we have introduced you to two arithmetic operators, + and −, that can be used in arithmetic expressions in Java. Take a look at [yet to update]() to find out what other operators are available.
3. Write an assignment statement that will store the result of multiplying two variables, `price` and `discount`, into a third variable, `saving`.
4. Write an assignment statement that will divide the value in `total` by the value in `count` and store the result in `mean`.
5. Write an if-statement that will compare the value in `price` against the value in `budget`. If `price` is greater than `budget`, then print the message “Too expensive”; otherwise print the message “Just right”.
6. Modify your answer to the previous exercise so that the message includes the value of your budget if the price is too high.

### Experiments after discussing Local Variables

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

### Experiments after Fields, Parameters and Local Variables

1. Add a new method, `emptyMachine`, that is designed to simulate emptying the machine of money. It should reset `total` to be zero, but also return the value that was stored in `total` before it was reset.
2. Rewrite the `printTicket` method so that it declares a local variable, `amountLeftToPay`. This should then be initialized to contain the difference between `price` and `balance`. Rewrite the test in the conditional statement to check the value of `amountLeftToPay`. If its value is less than or equal to zero, a ticket should be printed; otherwise, an error message should be printed stating the amount left to pay. Test your version to ensure that it behaves in exactly the same way as the original version. Make sure that you call the method more than once, when the machine is in different states, so that both parts of the conditional statement will be executed on separate occasions.

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
2. Try the following:  
   `sum = 99 + 3;`  
   Observe the error.  
   Now try the following:

   ```java
   int sum = 0;
   sum = 99 + 3;
   sum
   ```

   Now, try this:  
   `String swimmer = "cat" + "fish";`  
   `swimmer`  
   What would you expect to see after the following?  
   `String fish = swimmer;`  
   `fish`  
   Try it out. What do you think has happened in the assignment?

3. Open the Code Pad in the _better-ticket-machine_ project. Type the following in the Code Pad:

   ```java
   TicketMachine t1 = new TicketMachine(1000);
   t1.getBalance()
   t1.insertMoney(500);
   t1.getBalance()
   ```

   Take care to type these lines exactly as they appear here; pay particular attention to whether or not there is a semicolon at the end of the line. Note what the calls to `getBalance` return in each case.
4. Now add the following in the Code Pad:  
   `TicketMachine t2 = t1;`  
   What would you expect a call to `t2.getBalance()` to return? Try it out.
5. Add the following:  
    `t1.insertMoney(500);`
   What would you expect the following to return? Think carefully about this before you try it, and be sure to use the `t2` variable this time.  
   `t2.getBalance()`  
   Did you get the answer you expected? Can you find a connection between the variables `t1` and `t2` that would explain what is happening?
