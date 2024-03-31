---
layout: default
title: Practice
parent: Day 2
grand_parent: Module 1 Week 1
nav_order: 4
---

# Module 1: Java Foundations
## Week 1: Foundations of OOP & Algorithmic Thinking
### Day 2: Understanding Class Definitions
## Practice Session
---
### Challenges on *naive-ticket-machine*

*Before attempting these exercises, be sure that you have a good understanding of how ticket machines behave and how that behavior is implemented through the fields, constructor, and methods of the class.*

1. Modify the constructor of `TicketMachine` so that it no longer has a parameter. Instead, the price of tickets should be fixed at 1,000 cents. What effect does this have when you construct ticket-machine objects within BlueJ?
2. Give the class two constructors. One should take a single parameter that specifies the price, and the other should take no parameter and set the price to be a default value of your choosing. Test your implementation by creating machines via the two different constructors.
3. Implement a method, `empty`, that simulates the effect of removing all money from the machine. This method should have a `void` return type, and its body should simply set the `total` field to zero. Does this method need to take any parameters? Test your method by creating a machine, inserting some money, printing some tickets, checking the total, and then emptying the machine. Is the `empty` method a mutator or an accessor?

## Challenges on *better-ticket-machine*

1. Add a new method, `emptyMachine`, that is designed to simulate emptying the machine of money. It should reset `total` to be zero, but also return the value that was stored in `total` before it was reset.
2. Rewrite the `printTicket` method so that it declares a local variable, `amountLeftToPay`. This should then be initialized to contain the difference between `price` and `balance`. Rewrite the test in the conditional statement to check the value of `amountLeftToPay`. If its value is less than or equal to zero, a ticket should be printed; otherwise, an error message should be printed stating the amount left to pay. Test your version to ensure that it behaves in exactly the same way as the original version. Make sure that you call the method more than once, when the machine is in different states, so that both parts of the conditional statement will be executed on separate occasions.
3. Challenge exercise Suppose we wished a single `TicketMachine` object to be able to issue tickets of different prices. For instance, users might press a button on the physical machine to select a discounted ticket price. What further methods and/or fields would need to be added to `TicketMachine` to allow this kind of functionality? Do you think that many of the existing methods would need to be changed as well?  
   Save the better-ticket-machine project under a new name, and implement your changes in the new project.

## Challenges on *lab-classes*

1. Modify the `getLoginName` method of `Student` so that it always generates a login name, even if either the `name` or the `id` field is not strictly long enough. For strings shorter than the required length, use the whole string.