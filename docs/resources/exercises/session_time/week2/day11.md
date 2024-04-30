---
layout: default
title: Sessions
parent: Day 11
grand_parent: Week 2
has_children: true
nav_order: 1
---

# Module 1: Java Foundations
{: .no_toc }
## Day 10: Understanding Class Definitions (Expressions, Conditional Statements)
{: .no_toc }

<details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. [Session 1](#session-1)
   {:toc}
2. [Session 2](#session-2)
   {:toc}
3. [Practice Session](#practice-session)
   {:toc}
</details>

## Session 1

### Few more Problems

1. Questions from yesterday's Assignment (Q14, Q15, Q13, Q6)
2. 2-digit reverse
3. 3-digit palindrome

## Practice Session

### Printing from Methods
The most complex method of the class: `printTicket`

```java
    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# Rs. " + price);
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
    }
```
**Expected Sample Result:**  

```
##################
# The BlueJ Line
# Ticket
# Rs. 50
##################
```
- The method `System.out.println` prints its parameter to the text terminal. 

**Let's Experiment:**  
1. Write down exactly what will be printed by the following statement:  
   `System.out.println("My cat has green eyes.");`
2. Add a method called `prompt` to the `TicketMachine` class. This should have a `void` return type and take no parameters. The body of the method should print the following single line of output:  
  **Please insert the correct amount of money.**
3. What do you think would be printed if you altered the fourth statement of `printTicket` so that `price` also has quotes around it, as follows?  
   `System.out.println("# " + "Rs. " + "price");`
4. What about the following version?  
   `System.out.println("# Rs. price");`
5. Could either of the previous two versions be used to show the price of tickets in different ticket machines? Explain your answer.
6. Add a `showPrice` method to the `TicketMachine` class. This should have a void return type and take no parameters. The body of the method should print:  
  **The price of a ticket is Rs. *xyz*.**  
where `xyz` should be replaced by the value held in the `price` field when the method is called.
7. Create two ticket machines with differently priced tickets. Do calls to their `showPrice` methods show the same output, or different? How do you explain this effect?

### Method summary
It is worth summarizing a few features of methods at this point, because methods are fundamental
to the programs we will be writing and exploring. They implement the core actions of every object.
- A method with parameters will receive data passed to it from the method’s caller, and will
then use that data to help it perform a particular task. However, not all methods take parameters;
many simply use the data stored in the object’s fields to carry out their task.
- If a method has a non-`void` return type, it will return some data to the place it was called
from — and that data will almost certainly be used in the caller for further calculations
or program manipulations. Many methods, though, have a `void` return type and return
nothing, but they still perform a useful task within the context of their object.
- Accessor methods have non-`void` return types and return information about the object’s
state. Mutator methods modify an object’s state. Mutators often take parameters whose
values are used in the modification, although it is still possible to write a mutating method
that does not take parameters.

### Summary of the naíve ticket machine
We have now examined the internal structure of the naíve `TicketMachine` class in some
detail. We have seen that the class has a small outer layer that gives a name to the class, and a
more substantial inner body containing fields, a constructor, and several methods. Fields are
used to store data that enable objects to maintain a state that persists between method calls.
Constructors are used to set up an initial state when an object is created. Having a proper initial
state will enable an object to respond appropriately to method calls immediately following its
creation. Methods implement the defined behavior of the class’s objects. Accessor methods
provide information about an object’s state, and mutator methods change an object’s state.
We have seen that constructors are distinguished from methods by having the same name
as the class in which they are defined. Both constructors and methods may take parameters,
but only methods may have a return type. Non-`void` return types allow us to pass
a value out of a method to the place where the method was called from. A method with a
non-`void` return type must have at least one return statement in its body; this will often
be the final statement. Constructors never have a return type of any sort—not even `void`.

_Before attempting these exercises, be sure that you have a good understanding of how ticket machines behave and how that behavior is implemented through the fields, constructor, and methods of the class._

1. Modify the constructor of `TicketMachine` so that it no longer has a parameter. Instead, the price of tickets should be fixed at Rs. 100. What effect does this have when you construct ticket-machine objects within BlueJ?
2. Give the class two constructors. One should take a single parameter that specifies the price, and the other should take no parameter and set the price to be a default value of your choosing. Test your implementation by creating machines via the two different constructors.
3. Implement a method, `empty`, that simulates the effect of removing all money from the machine. This method should have a `void` return type, and its body should simply set the `total` field to zero. Does this method need to take any parameters? Test your method by creating a machine, inserting some money, printing some tickets, checking the total, and then emptying the machine. Is the `empty` method a mutator or an accessor?

### Reflecting on the design of the ticket machine
From our study of the internals of the `TicketMachine` class, you should have come to appreciate how inadequate it would be in the real world. It is deficient in several ways:
- It contains no check that the customer has entered enough money to pay for a ticket.
- It does not refund any money if the customer pays too much for a ticket.
- It does not check to ensure that the customer inserts sensible amounts of money. Experiment with what happens if a negative amount is entered, for example.
- It does not check that the ticket price passed to its constructor is sensible.  

If we could remedy these problems, then we would have a much more functional piece of software that might serve as the basis for operating a real-world ticket machine.  
In the next few sections, we shall examine the implementation of an improved ticket machine class that attempts to deal with some of the inadequacies of the naïve implementation. Open the better-ticket-machine project. As before, this project contains a single class: `TicketMachine`. Before looking at the internal details of the class, experiment with it by creating some instances and see whether you notice any differences in behavior between this version and the previous naíve version.
One specific difference is that the new version has an additional method, refund Balance.
#### Making choices: the conditional statement

**Let's Experiment:**  
1. Check that the behavior we have discussed here is accurate by creating a `TicketMachine` instance and calling `insertMoney` with various actual parameter values. Check the balance both before and after calling `insertMoney`. Does the balance ever change in the cases when an error message is printed? Try to predict what will happen if you enter the value zero as the parameter, and then see if you are right.
2. Predict what you think will happen if you change the test in `insertMoney` to use the greater-than or equal-to operator:  
    `if(amount >= 0)`  
   Check your predictions by running some tests. What is the one situation in which it makes a difference to the behavior of the method?
3. Rewrite the if-else statement so that the method still behaves correctly but the error message is printed if the boolean expression is true but the balance is increased if the expression is false. You will obviously have to rewrite the condition to make things happen this way around.
4. In the _figures_ project we looked at in Day 1 we used a `boolean` field to control a feature of the circle objects. What was that feature? Was it well suited to being controlled by a type with only two different values?

#### A further conditional statement example

**Let's Experiment**  
1. In this version of `printTicket`, we also do something slightly different with the `total` and `balance` fields. Compare the implementation of the method in _naive-ticket-machine_ with that in the current project, _better-ticket-machine_, to see whether you can tell what those differences are. Then check your understanding by experimenting within BlueJ.
2. Is it possible to remove the else part of the if-statement in the `printTicket` method (i.e., remove the word `else` and the block attached to it)? Try doing this and seeing if the code still compiles. What happens now if you try to print a ticket without inserting any money?
