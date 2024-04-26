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

#### Scope and Lifetime

**Let's Experiment**  
1. After a ticket has been printed, could the value in the `balance` field ever be set to a negative value by subtracting `price` from it? Justify your answer.
2. So far, we have introduced you to two arithmetic operators, + and −, that can be used in arithmetic expressions in Java. Take a look at [yet to update]() to find out what other operators are available.
3. Write an assignment statement that will store the result of multiplying two variables, `price` and `discount`, into a third variable, `saving`.
4. Write an assignment statement that will divide the value in `total` by the value in `count` and store the result in `mean`.
5. Write an if-statement that will compare the value in `price` against the value in `budget`. If `price` is greater than `budget`, then print the message “Too expensive”; otherwise print the message “Just right”.
6. Modify your answer to the previous exercise so that the message includes the value of your budget if the price is too high.

#### Local Variables
A local variable is a variable declared and used within a single method. Its scope and lifetime are limited
to that of the method.  
**pitfall** A local variable of the same name as a field will prevent the field being accessed
from within a constructor or method. See Section 3.13.2 for a way around this when necessary.  
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

#### Fields, Parameters and Local Variables

**Let's Experiment**  
1. Add a new method, `emptyMachine`, that is designed to simulate emptying the machine of money. It should reset `total` to be zero, but also return the value that was stored in `total` before it was reset.
2. Rewrite the `printTicket` method so that it declares a local variable, `amountLeftToPay`. This should then be initialized to contain the difference between `price` and `balance`. Rewrite the test in the conditional statement to check the value of `amountLeftToPay`. If its value is less than or equal to zero, a ticket should be printed; otherwise, an error message should be printed stating the amount left to pay. Test your version to ensure that it behaves in exactly the same way as the original version. Make sure that you call the method more than once, when the machine is in different states, so that both parts of the conditional statement will be executed on separate occasions.

#### Summary of the better ticket machine

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


### Reading and Learning Exercises using ChatGPT

1. Learn about Simple Interest & Compound Interest in detail. Learn what they are, when to use them, which real world applications use them, what are the formula, examples to understand how to calculate each of them.  
   **How to check if you understood it well:** Ask ChatGPT to give you questions to check your knowledge on this. Try to answer those questions. If you get at least 70% of the questions right, then you can say you understood the concepts.  
   **Note:** Check Day 2 in Google Classroom for ChatGPT material.

### Let's Practice Methods More

Let's try writing the insides of some of these methods:

6. *Method:* `calculatePower`  
   *Details:* Create a method named `calculatePower` that takes two integers representing the base and exponent as parameters and returns the result of raising the base to the power of the exponent.
7. *Method:* `calculateCompoundInterest`  
   *Details:* Implement a method called `calculateCompoundInterest` that takes three doubles representing the principal amount, rate of interest (in percentage), and time (in years) as parameters and returns the compound interest earned.
8. *Method:* `calculateHypotenuse`  
   *Details:* Implement a method called `calculateHypotenuse` that takes two doubles representing the lengths of the two shorter sides of a right-angled triangle as parameters and returns the length of the hypotenuse.
9. *Method:* `calculateDistance`  
   *Details:* Create a method named `calculateDistance` that takes four integers representing the coordinates (x1, y1) and (x2, y2) of two points in a 2D plane as parameters and returns the distance between the two points.
<!-- 10. *Method:* `calculateFactorial`  
   *Details:* Write a method named `calculateFactorial` that takes an integer as a parameter and returns the factorial of that number. -->
   