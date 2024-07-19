---
layout: default
title: Sessions
parent: Day 9
grand_parent: Week 2
has_children: true
nav_order: 1
---

# Module 1: Java Foundations
{: .no_toc }
## Day 9: Understanding Class Definitions (More about Methods, Conditional Statements)
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

<!-- following content moved from day08
     which comes after constructor parameters
 -->

## Session 1

### Revision & Discussion of Yesterday's Assignment (60 minutes)
1. [Self Review](../../eod_self_review/w2-day08-eod-sr)
2. [Work from Home](../../practice_session/w2-day08-wfh)

Let's look back on how external information is passed to constructor parameter in Object Diagram.

**Formal Parameters:** The parameter names inside a constructor or method.  
**Acutal Parameters:** The parameter values outside.  
So in `TicketMachine` constructor, `cost` is a formal parameter, and a user-supplied value such as `50` is an actual parameter.  

Let's revise the **Rule about assignment statements** from yesterday's session.  
This same rule **also applies** between *formal parameters* and *actual parameters*: the type of an actual-parameter expression must match the type of the formal-parameter variable.  

**Variable Scope:**  
A formal parameter is available to an object only within the body of a constructor or method that declares it. We say that the *scope of a parameter* is restricted to the body of the constructor or method in which it is declared.  
In contrast, the *scope of a field* is the whole of the class definition – it can be accessed from anywhere in the same class.  
This is a **very important difference** between these two sorts of variables.  

**Variable Lifetime:**  
The *lifetime of a parameter* is limited to a single call of a constructor or method. When a constructor or method is called, the extra space for the parameter variables is created, and the external values copied into
that space. Once that call has completed its task, the formal parameters disappear and the values they held are lost. In other words, when the constructor has finished executing, the whole constructor space is removed, along with the parameter variables held within it.  
In contrast, the *lifetime of a field* is the same as the lifetime of the object to which it belongs. When an object is created, so are the fields, and they persist for the lifetime of the object. It follows that if we want to remember the cost of tickets held in the `cost` parameter, we must store the value somewhere persistent — that is, in the `price` field.  

## Session 2
### Pomodoro 1: (25 minutes)

## Methods
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
  We can tell that `getPrice` is a method and not a field because method headers always include a pair of parentheses – “(” and “)” – and no semicolon at the end of the header.

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

### Accessor Methods
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

### Mutator Methods
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

![assignment with expression](../images/assignment%20with%20expression.png)

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

[Back to Top](#top)

## Practice Session

### Let's Practice Writing your own Classes

1. Create a new project, _heater-exercise_, within BlueJ. Create a class, `Heater`, that contains a single field, `temperature` whose type is double-precision floating point — see [Data Types](../../../handouts/datatypes), first section, for the Java type name that corresponds to this description. Define a constructor that takes no parameters. The `temperature` field should be set to the value 15.0 in the constructor. Define the mutators `warmer` and `cooler`, whose effect is to increase or decrease the value of temperature by 5.0° respectively. Define an accessor method to return the value of `temperature`.  
Before proceeding further with this exercise, check that everything works as before.
2. Modify your `Heater` class to define three new double-precision floating point fields: `min`, `max`, and `increment`. The values of `min` and `max` should be set by parameters passed to the constructor. The value of `increment` should be set to 5.0 in the constructor. Modify the definitions of `warmer` and `cooler` so that they use the value of `increment` rather than an explicit value of 5.0.  
   <!-- Before proceeding further with this exercise, check that everything works as before.   -->
   <!-- Now modify the `warmer` method so that it will not allow the temperature to be set to a value greater than `max`. Similarly modify `cooler` so that it will not allow `temperature` to be set to a value less than `min`. Check that the class works properly. Now add a method, `setIncrement`, that takes a single parameter of the appropriate type and uses it to set the value of `increment`. Once again, test that the class works as you would expect it to by creating some `Heater` objects within BlueJ. Do things still work as expected if a negative value is passed to the `setIncrement` method? Add a check to this method to prevent a negative value from being assigned to `increment`. -->

[Back to Top](#top)
