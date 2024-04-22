---
layout: default
title: Session 1
parent: Day 3
grand_parent: Module 1 Week 1
nav_order: 1
---

# Module 1: Java Foundations
## Week 1: Foundations of OOP & Algorithmic Thinking
### Day 3: Understanding Class Definitions

Quiz on Previous Day Content - 10 minutes

## Session 1  

<!-- <details markdown="block">
  <summary>Pomodoro 1 (15 minutes)</summary>

  ## It's Me!!

</details> -->

### Today's Standup: Pomodoro 1 (15 minutes)
  - First proper look at the source code of a class  
  - Discuss the basic elements of class definitions: *fields*, *constructors*, and *methods*  
  - Methods contain statements  
    - methods containing only simple arithmetic and printing statements  
    - methods containing *conditional statements* that allow choices between different actions to be made within methods  
  - Start by examining a naíve implementation of an automated ticket machine  
    - introducing the most basic features of classes  
    - this implementation is deficient in a number of ways  
  - Proceed with a more sophisticated version of the ticket machine that represents a significant improvement.   
  - Finally, revisit the *lab-classes* example encountered before  

  Train stations often provide ticket machines that print a ticket when a customer inserts the correct money for their fare. In this chapter, we shall define a class that models something like these ticket machines. As we shall be looking inside our first Java example classes, we shall keep our simulation fairly simple to start with. That will give us the opportunity to ask some questions about how these models differ from the real-world versions, and how we might change our classes to make the objects they create more like the real thing.  
  Our ticket machines work by customers “inserting” money into them and then requesting a ticket to be printed. Each machine keeps a running total of the amount of money it has collected throughout its operation. In real life, it is often the case that a ticket machine offers a selection of different types of ticket, from which customers choose the one they want. Our simplified machines print tickets for only a single price. It turns out to be significantly more complicated to program a class to be able to issue tickets of different values, than it does to offer a single price. On the other hand, with object-oriented programming it is very easy to create multiple instances of the class, each with its own price setting, to fulfill a need for different types of tickets.

### Pomodoro 2 (25 minutes)
Open the *naíve-ticket-machine* project in BlueJ. This project contains only one class — `TicketMachine` — which you will be able to explore in a similar way to the examples we discussed in Day 1. When you create a `TicketMachine` instance, you will be asked to supply a number that corresponds to the price of tickets that will be issued by that particular machine. The price is taken to be an amount of Rupees, so a positive whole number such as 50 would be appropriate as a value to work with.

**Let's Experiment**  
1. Create a `TicketMachine` object on the object bench and take a look at its methods. You should see the following: `getBalance`, `getPrice`, `insertMoney`, and `printTicket`.  
   - Try out the `getPrice` method
   - Use the `insertMoney` method
   - Use `getBalance` to check that the machine has kept an accurate record of the amount just inserted.  
     - You can insert several separate amounts of money into the machine, just like you might insert multiple coins or notes into a real machine. 
     - Try inserting the exact amount required for a ticket, and use `getBalance` 
   - As this is a simple machine, a ticket will not be issued automatically, so once you have inserted enough money, call the `printTicket` method.
2. What value is returned if you get the machine’s balance after it has printed a ticket?  
**Discuss:** Experiment with inserting different amounts of money before printing tickets. Do you notice anything strange about the machine’s behavior? What happens if you insert too much money into the machine—do you receive any refund? What happens if you do not insert enough and then try to print a ticket?
3. Create another ticket machine for tickets of a different price; remember that you have to supply this value when you create the machine object. Buy a ticket from that machine. Does the printed ticket look any different from those printed by the first machine?
4. Try to obtain a good understanding of a ticket machine’s behavior by interacting with it on the object bench before we move forward, at how the `TicketMachine` class is implemented. 

#### Examining a Class Definition
Take a look at the source code of the `TicketMachine` class.

**The class header**  

```java
public class TicketMachine
{
   // Inner part of the class omitted.
}
```

**Let's Experiment**  
1. Write out what you think the outer wrappers of the `Student` and `LabClass` classes might look like; do not worry about the inner part.
2. Does it matter whether we write  
   ```public class TicketMachine```  
   or  
   ```class public TicketMachine```  
in the outer wrapper of a class? Edit the source of the TicketMachine class to make the change, and then close the editor window. Do you notice a change in the class diagram?  
What error message do you get when you now press the Compile button? Do you think this message clearly explains what is wrong?  
Change the class back to how it was, and make sure that this clears the error when you compile it.
3. Check whether or not it is possible to leave out the word `public` from the outer wrapper of the `TicketMachine` class.
4. Put back the word `public`, and then check whether it is possible to leave out the word `class` by trying to compile again. Make sure that both words are put back as they were originally before continuing.

**Notes on Keywords:**
   - The words `public` and `class` are part of the Java language, whereas the word `TicketMachine` is not — the person writing the class has chosen that particular name. 
   - The words like `public` and `class` are called *keywords* or *reserved words* – the terms are used frequently and interchangeably. 
   - There are around 50 of these in Java, and you will soon be able to recognize most of them.
   - Java keywords never contain uppercase letters, whereas the words we choose (like “TicketMachine”) are often a mix of uppercase and lowercase letters.

### Pomodoro 3 (25 minutes)

#### Fields, constructors, and methods

```java
public class ClassName {
   // Fields
   // Constructors
   // Methods
}
```
The inner part of the class is where we define the *fields*, *constructors*, and *methods* that give the objects of that class their own particular characteristics and behavior. We can summarize the essential features of those three components of a class as follows:  
- The *fields* store data persistently within an object.
- The *constructors* are responsible for ensuring that an object is set up properly when it is first created.
- The *methods* implement the behavior of an object; they provide its functionality.

**Note on order of fields, constructors, and methods**  
> There is no particular rule on the order of these 3 features of a class. This is the order that we shall follow in all of our examples, exercises, and projects. Other authors choose to adopt different styles, and this is mostly a question of preference. Our style is not necessarily better than all others. However, it is *important* to choose one style and then use it consistently, because then your classes will be *easier to read and understand*.

**Let's Experiment**  
1. From your earlier experimentation with the ticket machine objects within BlueJ, you can probably remember the names of some of the methods — printTicket, for example. Look at the class definition of `TicketMachine` class and use this knowledge, along with the additional information about ordering we have given you, to make a list of the names of the fields, constructors, and methods in the TicketMachine class. Hint: There is only one constructor in the class.
2. What are the two features of the constructor that make it look significantly different from the methods of the class?

#### Fields
- The word *variable* is used as a general term for things that store data in a program.
- Fields store data persistently within an object. Means, Fields store data for an object to use.
- Fields are also known as *instance variables*.
- The `TicketMachine` class has three fields: `price`, `balance`, and `total`.

```java
public class TicketMachine {
   private int price;
   private int balance;
   private int total;

   // Constructors and Methods are omitted
}
```
  - `price` stores the fixed price of a ticket
  - `balance` stores the amount of money inserted into the machine by a user prior to asking for a ticket to be printed
  - `total` stores the total amount of money inserted into the machine by all users since the machine object was constructed (excluding any current balance). The idea is that, when a ticket is printed, any money in the balance is transferred to the total.

- Fields are small amounts of space inside an object that can be used to store data persistently. Every object will have space for each field declared in its class.
- Maintaining an Object Diagram for each object with spaces for each of it's fields is a *good practice* for beginners.
- A single-line *comment* is introduced by the two characters "//", which are written with no spaces between them.

```java
// The price of a ticket from this machine.
private int price;
```
- **Comments** are inserted into the source code of a class to provide explanations to human readers. They have no effect on the functionality of the class.
- More-detailed comments, often spanning several lines, are usually written in the form of multiline comments. These start with the character pair “/\*” and end with the pair “\*/”. There is a good example preceding the header of the class

```java
/**
* Return the price of a ticket.
*/
public int getPrice() {
   // code omitted
}
```
The definitions of the three fields are quite similar:
- All definitions indicate that they are *private* fields of the object; we shall have more to say about what this means in Next Week, but for the time being we will simply say that we always define fields to be private.
- All three fields are of type `int`. `int` is another keyword and represents the data type integer. This indicates that each can store a single whole-number value, which is reasonable given that we wish them to store numbers that represent amounts of money in Rupees.

- Fields can store values that can vary over time, so they are also known as *variables*. The value stored in a field can be changed from its initial value if required.

**Let's Experiment:**  

1. What do you think is the *type* of each of the following fields?  
   ```private int count;```  
   ```private Student representative;```  
   ```private Server host;```  
2. What are the *names* of the following fields?  
   ```private boolean alive;```  
   ```private Person tutor;```
   ```private Game game;```  
3. From what you know about the naming conventions for classes, which of the type names in the above two Exercises would you say are class names?
4. In the following field declaration from the `TicketMachine` class  
   ```private int price;```  
does it matter which order the three words appear in? Edit the `TicketMachine` class to try different orderings. After each change, close the editor. Does the appearance of the class diagram after each change give you a clue as to whether or not other orderings are possible? Check by pressing the Compile button to see if there is an error message.  
Make sure that you reinstate the original version after your experiments!
5. Is it always necessary to have a semicolon at the end of a field declaration? Once again, experiment via the editor. The rule you will learn here is an important one, so be sure to remember it.
6. Write in full the declaration for a field of type `int` whose name is `status`.

From the definitions of fields we have seen so far, we can begin to put a pattern together that will apply whenever we define a field variable in a class:
- They usually start with the reserved word `private`.
- They include a type name (such as `int`, `String`, `Person`, etc.)
- They include a user-chosen name for the field variable.
- They end with a semicolon.
Remembering this pattern will help you when you write your own classes.  
Indeed, as we look closely at the source code of different classes, you will see patterns such as this one emerging over and over again. Part of the process of learning to program involves looking out for such patterns and then using them in your own programs. That is one reason why studying source code in detail is so useful at this stage.  

### Pomodoro 4 (25 minutes)
#### Constructors
Constructors have a special role to fulfill. They are responsible for ensuring that an object
is set up properly when it is first created; in other words, for ensuring that an object is
ready to be used immediately following its creation. This construction process is also
called *initialization*.  
In some respects, a constructor can be likened to a midwife: it is responsible for ensuring
that the new object comes into existence properly. Once an object has been created,
the constructor plays no further role in that object’s life and cannot be called again.  

**Notes on Constructors:**  
> Constructors have the same name as the class in which they are defined — `TicketMachine` in this case.
  - The constructor’s name immediately follows the word `public`, with nothing in between.
  - *One of the main roles* of the constructor is to initialize the fields.
  - Some fields, such as `balance` and `total`, may be set to sensible initial values by assigning a constant number — zero in this case.
  - Other fields, such as the ticket price, it is not that simple, as we do not know the price that tickets from a particular machine will have until that machine is constructed.
    - An important point to note here is that the price of a ticket is initially determined *externally* and then has to be *passed into* the constructor.
  - *Part of the task* of the constructor is to receive that value and store it in the price field of the newly created ticket machine, so the machine can remember what that value was without you having to keep reminding it.
The constructor of the `TicketMachine` class:

```java
public class TicketMachine
{
    // Fields omitted

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
    }

    // Methods omitted

}
```  

**Note on Fields**  
> The most important roles of a field is to remember external information passed into the object, so that that information is available to an object throughout its lifetime. Fields, therefore, provide a place to store long-lasting (i.e., persistent) data.

> In Java, all fields are automatically initialized to a default value if they are not explicitly initialized. For integer fields, this default value is zero. So, strictly speaking, we could have done without setting `balance` and `total` to zero, relying on the default value to give us the same result. However, we prefer to write the explicit assignments anyway. There is no disadvantage to it, and it serves well to document what is actually happening. We do not rely on a reader of the class knowing what the default value is, and we document that we really want this value to be zero and have not just forgotten to initialize it.

#### Parameters: receiving data
Constructors and methods play quite different roles in the life of an object, but the way in which both receive values from outside is the same: via *parameters*.  
Parameters are another sort of variable, just as fields are, so they are also used to hold data. Parameters are variables that are defined in the header of a constructor or method:  
`public TicketMachine(int cost)`  
This constructor has a single parameter, `cost`, which is of type `int` — the same type as the `price` field it will be used to set. A parameter is used as a sort of temporary messenger, carrying data originating from outside the constructor or method, and making it available inside it.  

**Formal Parameters:** The parameter names inside a constructor or method.  
**Acutal Parameters:** The parameter values outside.  
So `cost` is a formal parameter, and a user-supplied value such as `50` is an actual parameter.  

**Variable Scope:**  
A formal parameter is available to an object only within the body of a constructor or method that declares it. We say that the *scope of a parameter* is restricted to the body of the constructor or method in which it is declared.  
In contrast, the *scope of a field* is the whole of the class definition – it can be accessed from anywhere in the same class.  
This is a **very important difference** between these two sorts of variables.  

**Variable Lifetime:**  
The *lifetime of a parameter* is limited to a single call of a constructor or method. When a constructor or method is called, the extra space for the parameter variables is created, and the external values copied into
that space. Once that call has completed its task, the formal parameters disappear and the values they held are lost. In other words, when the constructor has finished executing, the whole constructor space is removed, along with the parameter variables held within it.  
In contrast, the *lifetime of a field* is the same as the lifetime of the object to which it belongs. When an object is created, so are the fields, and they persist for the lifetime of the object. It follows that if we want to remember the cost of tickets held in the `cost` parameter, we must store the value somewhere persistent — that is, in the `price` field.  

**Let's Experiment:**  

1. To what class does the following constructor belong?  
   ```public Student(String name)```  
2. How many parameters does the following constructor have, and what are their types?  
   ```public Book(String title, double price)```
3. Can you guess what types some of the `Book` class’s fields might be, from the parameters in its constructor? Can you assume anything about the names of its fields?

**Choosing Variable Names:**  

One of the things you might have noticed is that the variable names we use for fields and parameters have a close connection with the purpose of the variable. Names such as `price`, `cost`, `title`, and `alive` all tell you something useful about the information being stored in that variable. This, makes it easier to understand what is going on in the program. Given that we have a large degree of freedom in our choice of variable names, it is worth following this principle of choosing names that communicate a sense of purpose rather than arbitrary and meaningless combinations of letters and numbers.

#### Assignment Statement
**Assignment statements** store the value represented by the righthand side of the statement in the variable named on the left.  
`price = cost;`  
Assignment Operator: `=`  
The right-hand side is called an expression. In their most general form, expressions are things that compute values, but in this case, the expression consists of just a single variable, whose value is copied into the price variable. We shall see examples of more-complicated expressions later.  

**One rule about assignment statements**  

The type of the expression on the right-hand side must match the type of the variable to which its value is assigned. We have already met three different, commonly used types: `int`, `String`, and (very briefly) `boolean`. This rule means that we are not allowed to store an `int`-type expression in a `String`-type variable, for instance.  
This same rule **also applies** between *formal parameters* and *actual parameters*: the type of an actual-parameter expression must match the type of the formal-parameter variable.  

**Note:**  
> For now, we can say that the types of both must be the same, although we shall see in later chapters that this is not the whole truth.

**Let's Experiment:**  
1. Suppose that the class `Pet` has a field called `name` that is of the type `String`. Write an assignment statement in the body of the following constructor so that the `name` field will be initialized with the value of the constructor’s parameter.  
  
   ```java
   public Pet(String petsName)
   {

   }
   ```
2. The following object creation will result in the constructor of the Date class being called. Can you write the constructor’s header?  
   ```new Date("March", 23, 1861)```  
   Try to give meaningful names to the parameters.