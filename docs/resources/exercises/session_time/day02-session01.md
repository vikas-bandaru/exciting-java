---
layout: default
title: Pomodoro 1
parent: Day 2
grand_parent: Module 1 Week 1
nav_order: 1
---

# Module 1: Java Foundations
## Week 1: Foundations of OOP & Algorithmic Thinking
### Day 2: Understanding Class Definitions
## Session 1: Ticket Machines
---
### Experiments with the `TicketMachine` object before examining it in *naive-ticket-machine* project

1. Create a `TicketMachine` object on the object bench and take a look at its methods. You should see the following: `getBalance`, `getPrice`, `insertMoney`, and `printTicket`. Try out the `getPrice` method. You should see a return value containing the price of the tickets that was set when this object was created. Use the `insertMoney` method to simulate inserting an amount of money into the machine. The machine stores as a balance the amount of money inserted. Use `getBalance` to check that the machine has kept an accurate record of the amount just inserted. You can insert several separate amounts of money into the machine, just like you might insert multiple coins into a real machine. Try inserting the exact amount required for a ticket, and use `getBalance` to ensure that the balance is increased correctly. As this is a simple machine, a ticket will not be issued automatically, so once you have inserted enough money, call the `printTicket` method. A facsimile ticket should be printed in the BlueJ terminal window.
2. What value is returned if you get the machine’s balance after it has printed a ticket?
3. Experiment with inserting different amounts of money before printing tickets. Do you notice anything strange about the machine’s behavior? What happens if you insert too much money into the machine—do you receive any refund? What happens if you do not insert enough and then try to print a ticket?
4. Try to obtain a good understanding of a ticket machine’s behavior by interacting with it on the object bench before we start looking, in the next section, at how the `TicketMachine` class is implemented. 
5. Create another ticket machine for tickets of a different price; remember that you have to supply this value when you create the machine object. Buy a ticket from that machine. Does the printed ticket look any different from those printed by the first machine?

### Experiments on class header

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

### Experiments on Fields, Constructors, and Methods

1. From your earlier experimentation with the ticket machine objects within BlueJ, you can probably remember the names of some of the methods — printTicket, for example. Look at the class definition of `TicketMachine` class and use this knowledge, along with the additional information about ordering we have given you, to make a list of the names of the fields, constructors, and methods in the TicketMachine class. Hint: There is only one constructor in the class.
2. What are the two features of the constructor that make it look significantly different from the methods of the class?

### Experiments and Exercises on Fields

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

### Experiments and Exercises on Constructors

1. To what class does the following constructor belong?  
   ```public Student(String name)```  
2. How many parameters does the following constructor have, and what are their types?  
   ```public Book(String title, double price)```
3. Can you guess what types some of the `Book` class’s fields might be, from the parameters in its constructor? Can you assume anything about the names of its fields?
4. Suppose that the class `Pet` has a field called `name` that is of the type `String`. Write an assignment statement in the body of the following constructor so that the `name` field will be initialized with the value of the constructor’s parameter.  
  
   ```java
   public Pet(String petsName)
   {

   }
   ```
5. The following object creation will result in the constructor of the Date class being called. Can you write the constructor’s header?  
   ```new Date("March", 23, 1861)```  
   Try to give meaningful names to the parameters.

### Experiments and Exercises on Methods

#### Accessor Methods

1. Compare the header and body of the `getBalance` method with the header and body of the `getPrice` method. What are the differences between them?
2. If a call to getPrice can be characterized as “What do tickets cost?” how would you characterize a call to getBalance?
3. If the name of `getBalance` is changed to `getAmount`, does the return statement in the body of the method also need to be changed for the code to compile? Try it out within BlueJ. What does this tell you about the name of an accessor method and the name of the field associated with it?
4. Write an accessor method `getTotal` in the `TicketMachine` class. The new method should return the value of the `total` field.
5. Try removing the return statement from the body of `getPrice`. What error message do you see now when you try compiling the class?
6. Compare the method headers of `getPrice` and `printTicket` in Code 2.1. Apart from their names, what is the main difference between them?
7. Do the `insertMoney` and `printTicket` methods have return statements? Why do you think this might be? Do you notice anything about their headers that might suggest why they do not require return statements?

#### Mutator Methods

8. Create a ticket machine with a ticket price of your choosing. Before doing anything else, call the `getBalance` method on it. Now call the `insertMoney` method and give a non-zero positive amount of money as the actual parameter. Now call `getBalance` again. The two calls to `getBalance` should show different outputs, because the call to `insertMoney` had the effect of changing the machine’s state via its `balance` field.
9. How can we tell from just its header that `setPrice` is a method and not a constructor?  
   `public void setPrice(int cost)`
10. Complete the body of the `setPrice` method so that it assigns the value of its parameter to the `price` field.
11. Complete the body of the following method, whose purpose is to add the value of its parameter to a field named `score`.  

   ```java
   /**
   * Increase score by the given number of points.
   */
   public void increase(int points)
   {
      ...
   }
   ```
12. Is the `increase` method a mutator? If so, how could you demonstrate this?
13. Complete the following method, whose purpose is to subtract the value of its parameter from a field named `price`.  

   ```java
   /**
   * Reduce price by the given amount.
   */
   public void discount(int amount)
   {
      ...
   }
   ```

### Experiments and Exercises on Printing from Methods

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