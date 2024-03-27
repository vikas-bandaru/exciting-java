---
layout: default
title: Day02:Session 2
nav_order: 4
---

# Session Exercises

## Day 2: Session 2

### Experiments with the `TicketMachine` object before and after examining the class in *better-ticket-machine* project
1. Check that the behavior we have discussed here is accurate by creating a `TicketMachine` instance and calling `insertMoney` with various actual parameter values. Check the balance both before and after calling `insertMoney`. Does the balance ever change in the cases when an error message is printed? Try to predict what will happen if you enter the value zero as the parameter, and then see if you are right.
2. Predict what you think will happen if you change the test in `insertMoney` to use the greater-than or equal-to operator:  
  `if(amount >= 0)`  
Check your predictions by running some tests. What is the one situation in which it makes a difference to the behavior of the method?
3. Rewrite the if-else statement so that the method still behaves correctly but the error message is printed if the boolean expression is true but the balance is increased if the expression is false. You will obviously have to rewrite the condition to make things happen this way around.
4. In the *figures* project we looked at in Day 1 we used a `boolean` field to control a feature of the circle objects. What was that feature? Was it well suited to being controlled by a type with only two different values?
5. In this version of `printTicket`, we also do something slightly different with the `total` and `balance` fields. Compare the implementation of the method in *naive-ticket-machine* with that in the current project, *better-ticket-machine*, to see whether you can tell what those differences are. Then check your understanding by experimenting within BlueJ.
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
