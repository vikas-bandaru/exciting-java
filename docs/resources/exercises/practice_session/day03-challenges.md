---
layout: default
title: Practice
parent: Day 3
grand_parent: Week 1
nav_order: 4
---

# Module 1: Java Foundations

## Week 1: Foundations of OOP & Algorithmic Thinking

### Day 3: Understanding Class Definitions

## Practice Session

---

### Challenges on _naive-ticket-machine_

_Before attempting these exercises, be sure that you have a good understanding of how ticket machines behave and how that behavior is implemented through the fields, constructor, and methods of the class._

1. Modify the constructor of `TicketMachine` so that it no longer has a parameter. Instead, the price of tickets should be fixed at 1,000 cents. What effect does this have when you construct ticket-machine objects within BlueJ?
2. Give the class two constructors. One should take a single parameter that specifies the price, and the other should take no parameter and set the price to be a default value of your choosing. Test your implementation by creating machines via the two different constructors.
3. Implement a method, `empty`, that simulates the effect of removing all money from the machine. This method should have a `void` return type, and its body should simply set the `total` field to zero. Does this method need to take any parameters? Test your method by creating a machine, inserting some money, printing some tickets, checking the total, and then emptying the machine. Is the `empty` method a mutator or an accessor?

### Challenges on _better-ticket-machine_

1. Add a new method, `emptyMachine`, that is designed to simulate emptying the machine of money. It should reset `total` to be zero, but also return the value that was stored in `total` before it was reset.
2. Rewrite the `printTicket` method so that it declares a local variable, `amountLeftToPay`. This should then be initialized to contain the difference between `price` and `balance`. Rewrite the test in the conditional statement to check the value of `amountLeftToPay`. If its value is less than or equal to zero, a ticket should be printed; otherwise, an error message should be printed stating the amount left to pay. Test your version to ensure that it behaves in exactly the same way as the original version. Make sure that you call the method more than once, when the machine is in different states, so that both parts of the conditional statement will be executed on separate occasions.
3. Suppose we wished a single `TicketMachine` object to be able to issue tickets of different prices. For instance, users might press a button on the physical machine to select a discounted ticket price. What further methods and/or fields would need to be added to `TicketMachine` to allow this kind of functionality? Do you think that many of the existing methods would need to be changed as well?  
   Save the better-ticket-machine project under a new name, and implement your changes in the new project.

### Challenges on _lab-classes_

1. Modify the `getLoginName` method of `Student` so that it always generates a login name, even if either the `name` or the `id` field is not strictly long enough. For strings shorter than the required length, use the whole string.

### Challenges on creating your own classes

1. Create a new project, _heater-exercise_, within BlueJ. Edit the details in the project description—the text note you see in the diagram. Create a class, `Heater`, that contains a single field, `temperature` whose type is double-precision floating point — see [Data Types](../../cheatsheets/datatypes.md), Section 1, for the Java type name that corresponds to this description. Define a constructor that takes no parameters. The `temperature` field should be set to the value 15.0 in the constructor. Define the mutators `warmer` and `cooler`, whose effect is to increase or decrease the value of temperature by 5.0° respectively. Define an accessor method to return the value of `temperature`.
2. Modify your `Heater` class to define three new double-precision floating point fields: `min`, `max`, and `increment`. The values of `min` and `max` should be set by parameters passed to the constructor. The value of `increment` should be set to 5.0 in the constructor. Modify the definitions of `warmer` and `cooler` so that they use the value of `increment` rather than an explicit value of 5.0. Before proceeding further with this exercise, check that everything works as before.  
   Now modify the `warmer` method so that it will not allow the temperature to be set to a value greater than `max`. Similarly modify `cooler` so that it will not allow `temperature` to be set to a value less than `min`. Check that the class works properly. Now add a method, `setIncrement`, that takes a single parameter of the appropriate type and uses it to set the value of `increment`. Once again, test that the class works as you would expect it to by creating some `Heater` objects within BlueJ. Do things still work as expected if a negative value is passed to the `setIncrement` method? Add a check to this method to prevent a negative value from being assigned to `increment`.
