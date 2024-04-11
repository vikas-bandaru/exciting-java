---
layout: default
title: Session 2
parent: Day 3
grand_parent: Module 1 Week 1
nav_order: 2
---

# Module 1: Java Foundations

## Week 1: Foundations of OOP & Algorithmic Thinking

### Day 3: Understanding Class Definitions

## Session 2: Methods & Better Ticket Machines
---

### Pomodoro 1: (25 minutes)

#### Methods
The `TicketMachine` class has four methods: `getPrice`, `getBalance`, `insertMoney`, and `printTicket`. You can see them in the class’s source code. We shall start our look at the source code of methods by considering `getPrice`.

```java
public class TicketMachine {
    // Fields omitted
    // Constructor omitted
    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }
    // Other methods omitted
}
```
- Methods consist of two parts: a *header* and a *body*.  

**Note: Method header**  
> It is important to distinguish between method headers and field declarations, because they can look quite similar.  
  *Example:*  
  We can tell that `getPrice` is a method and not a field because method headers always include a pair of parentheses–“(” and “)”–and no semicolon at the end of the header.

**Note: Method body**  
> The method body is the remainder of the method after the header. It is always enclosed by a matching pair of curly brackets: “{“ and “}”. Method bodies contain the *declarations* and *statements* that define what an object does when that method is called. Declarations are used to create additional, temporary variable space, while statements describe the actions of the method. In `getPrice`, the method body contains a single statement, but we shall soon see examples where the method body consists of many lines of both declarations and statements.  
- Any set of declarations and statements between a pair of matching curly brackets is known as a *block*. So the body of the `TicketMachine` class, the bodies of the constructor, and all of the methods within the class are blocks.

**Differences between header of constructor and header of method:**  

```java
public TicketMachine(int cost)
public int getPrice()
```
- The method has a *return type* of `int`; the constructor has *no return type*. A return type is written just before the method name. This is a difference that *applies in all cases*.
- The constructor has a single formal parameter, `cost`, but the method has none — just a pair of empty parentheses. This is a difference that *applies in this particular case*.  

**Absolute Rule:**  
> A constructor may not have a return type.
  Both constructors and methods may have any number of formal parameters, including none.

**Return statement**  
Within the body of `getPrice` there is a single statement:  
`return price;`  
This is called a *return statement*.
- It is always the final statement of that method, because no further statements in the method will be executed once the return statement is executed.
- Return types and return statements work together. The `int` return type of `getPrice` is a form of promise that the body of the method will do something that ultimately results in an integer value being calculated and returned as the method’s result. You might like to think of a method call as being a form of question to an object, and the return value from the method being the object’s answer to that question. In this case, when the `getPrice` method is called on a ticket machine, the question is, What do tickets cost? A ticket machine does not need to perform any calculations to be able to answer that, because it keeps the answer in its `price` field. So the method answers by just returning the value of that variable. As we gradually develop more-complex classes, we shall inevitably encounter more-complex questions that require more work to supply their answers.
- "returning a value" means that some information is passed internally between two different parts of the
program. One part of the program has requested information from an object via a method call, and the return value is the way the object passes that information back to the caller.
- People often think it means that something is printed by the program. This is not the case at all — we
shall see how printing is done when we look at the `printTicket` method.

#### Accessor Methods
Accessor methods return information about the state of an object.  
- The two "get" methods of `TicketMachine` (`getPrice` and `getBalance`) are *accessor methods* (or just *accessors*).  
- This is because they return information to the caller about the state of an object; they provide access to information about the object’s state. An accessor usually contains a return statement in order to pass back that information.  
- The get methods of a ticket machine performs: returning the value of one of their object’s fields.

**Let's Experiment**  
1. Compare the header and body of the `getBalance` method with the header and body of the `getPrice` method. What are the differences between them?
2. If a call to getPrice can be characterized as “What do tickets cost?” how would you characterize a call to getBalance?
3. If the name of `getBalance` is changed to `getAmount`, does the return statement in the body of the method also need to be changed for the code to compile? Try it out within BlueJ. What does this tell you about the name of an accessor method and the name of the field associated with it?
4. Write an accessor method `getTotal` in the `TicketMachine` class. The new method should return the value of the `total` field.
5. Try removing the return statement from the body of `getPrice`. What error message do you see now when you try compiling the class?
6. Compare the method headers of `getPrice` and `printTicket` in `TicketMachine` class. Apart from their names, what is the main difference between them?
7. Do the `insertMoney` and `printTicket` methods have return statements? Why do you think this might be? Do you notice anything about their headers that might suggest why they do not require return statements?

#### Mutator Methods
Mutator methods change the state of an object.
- The remaining methods — `insertMoney` and `printTicket` — have a much more significant role, primarily because they change the value of one or more fields of a ticket-machine object each time they are called. We call methods that change the state of their object *mutator methods* (or just *mutators*).
- We can think of a call to a mutator as a request for an object to change its state.
- The *most basic form of mutator* is one that takes a single parameter whose value is used to directly overwrite what is stored in one of an object’s fields.
- In a direct complement to “get” methods, these are often called “set” methods, although the `TicketMachine` does not have any of those, at this stage.
- One *distinguishing effect of a mutator* is that an object will often exhibit slightly different
behavior before and after it is called.  

**Let's Experiment**  
1. Create a ticket machine with a ticket price of your choosing. Before doing anything else, call the `getBalance` method on it. Now call the `insertMoney` method and give a non-zero positive amount of money as the actual parameter. Now call `getBalance` again. The two calls to `getBalance` should show different outputs, because the call to `insertMoney` had the effect of changing the machine’s state via its `balance` field.

- The header of `insertMoney` has a `void` return type and a single formal parameter, amount, of type `int`. A `void` return type means that the method does not return any value to its caller. This is significantly different from all other return types.
- Within the body of a `void` method, this difference is reflected in the fact that there is *no return statement*.

```java
    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount)
    {
        balance = balance + amount;
    }
```
- In the body of `insertMoney`, there is a single statement that is *another form of assignment statement*.
- We always consider assignment statements by first examining the calculation on the right-hand side of the assignment symbol. Here, its effect is to calculate a value that is the sum of the number in the amount parameter and the number in the balance field. This combined value is then assigned to the balance field. So the effect is to increase the value in balance by the value in amount.

**Let's Experiment**  
1. How can we tell from just its header that `setPrice` is a method and not a constructor?  
   `public void setPrice(int cost)`
2. Complete the body of the `setPrice` method so that it assigns the value of its parameter to the `price` field.
3. Complete the body of the following method, whose purpose is to add the value of its parameter to a field named `score`.  

   ```java
   /**
   * Increase score by the given number of points.
   */
   public void increase(int points)
   {
      ...
   }
   ```
4. Is the `increase` method a mutator? If so, how could you demonstrate this?
5. Complete the following method, whose purpose is to subtract the value of its parameter from a field named `price`.  

   ```java
   /**
   * Reduce price by the given amount.
   */
   public void discount(int amount)
   {
      ...
   }
   ```

#### Printing from Methods
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
  **The price of a ticket is *xyz* cents.**  
where `xyz` should be replaced by the value held in the `price` field when the method is called.
7. Create two ticket machines with differently priced tickets. Do calls to their `showPrice` methods show the same output, or different? How do you explain this effect?

#### Method summary
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

#### Summary of the naíve ticket machine

*Try out the first 3 Challenge Exercises before moving on...*

### Reflecting on the design of the ticket machine

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
