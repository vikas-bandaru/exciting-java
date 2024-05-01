---
layout: default
title: Sessions
parent: Day 16
grand_parent: Week 3
has_children: true
nav_order: 1
---

# Module 1: Java Foundations
{: .no_toc }
## Day 16: Object Interactions (ClockDisplay)
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

### Let's Experiment with `ClockDisplay` class
1. Open the *clock-display* project and create a `ClockDisplay` object by selecting the following constructor:  
> `new ClockDisplay()`  

   Call its `getTime` method to find out the initial time the clock has been set to. Can you work out why it starts at that particular time?
2. Open an inspector for this object. With the inspector open, call the object’s methods. Watch the `displayString` field in the inspector. Read the project comment (by double-clicking the text icon in the class diagram) for more information.
3. How many times would you need to call the `timeTick` method on a newly created `ClockDisplay` object to ,make its time reach **01:00**? How else could you make it display that time?

### Objects creating Objects
As a *user* of a clock display, when we create a `ClockDisplay` object we assume that our clock display has hours and minutes. So by simply creating a clock display, we expect that we have implicitly created two number displays for the hours and minutes.  
As *writers* of the `ClockDisplay` class, we have to make this happen.  

To do this, we simply write code in the constructor of the `ClockDisplay` that creates and stores two `NumberDisplay` objects.  
Because the constructor is automatically executed when a `ClockDisplay` object is created, the `NumberDisplay` objects will automatically be created at the same time.  
Here is the code of the ClockDisplay constructor that makes this work:

```java
public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    // Remaining fields omitted

    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }
    // Methods omitted
}
```
Each of the first two lines in the constructor creates a new `NumberDisplay` object and assigns it to a variable. The syntax of an operation to create a new object is  
> `new ClassName (parameter-list)`  

The `new` operation does two things:  
1. It creates a new object of the named class (here, `NumberDisplay`).
2. It executes the constructor of that class.  
If the constructor of the class is defined to have parameters, then the actual parameters must be supplied in the new statement. For instance, the constructor of class `NumberDisplay` was defined to expect one integer parameter:  
> `public NumberDisplay(int rollOverLimit)`

Thus, the new operation for the `NumberDisplay` class, which calls this constructor, must provide one actual parameter of type int to match the defined constructor header:  
> `new NumberDisplay(24);`

This is the same as discussed for the constructor of `TicketMachine` class in *ticket-machine* project. With this constructor, we have achieved what we wanted: if someone now creates a `ClockDisplay` object, the `ClockDisplay` constructor will automatically execute and create two `NumberDisplay` objects. From the point of view of a user of the `ClockDisplay` class, the creation of the `NumberDisplay` objects is implicit. However, from a writer’s point of view, the creation is explicit because they have to write the code to make it happen.
The final statement in the constructor is a call to `updateDisplay` that sets up the `displayString` field. This call is explained in later. Then the clock display is ready to go.

### Let's Practice writing an object creating statement

1. Write Java statements that define a variable named `window` of type `Rectangle`, and then create a `Rectangle` object and assign it to that variable. The `Rectangle` constructor has two `int` parameters.

### Multiple Constructors
You might have noticed when you created a `ClockDisplay` object that the pop-up menu offered you two ways to do that:  
> `new ClockDisplay()`  
  `new ClockDisplay(int hour, int minute)`  

This is because the `ClockDisplay` class contains two constructors. What they provide are alternative ways of initializing a `ClockDisplay` object. If the constructor with no parameters is used, then the starting time displayed on the clock will be **00:00**. If, on the other hand, you want to have a different starting time, you can set that up by using the second constructor. It is common for class definitions to contain alternative versions of constructors or methods that provide various ways of achieving a particular task via their distinctive sets of parameters. This is known as *overloading* a constructor or method.

> **Concept:** *Overloading* A class may contain more than one constructor, or more than one method of the same name, as long as each has a distinctive set of parameter types.

### Let's Experiment
1. Look at the second constructor in `ClockDisplay`’s source code. Explain what it does and how it does it.
2. Identify the similarities and differences between the two constructors. Why is there no call to `updateDisplay` in the second constructor, for example?

### Method Calls
> Methods can call other methods of the same class as part of their implementation. This is called an **internal method call**.

The last line of the first `ClockDisplay` constructor consists of the statement  
> `updateDisplay();`

This statement is a *method call*. As we have seen above, the `ClockDisplay` class has a method with the following method header:  
> `private void updateDisplay()`  

The method call above invokes this method. Because this method is in the same class as the call of the method, we also call it an *internal method call*. Internal method calls have the syntax:
> `methodName ( parameter-list )`

An internal method call does not have a variable name and a dot before the method name,
which you will have observed in all of the method calls recorded in the Terminal window.
A variable is not needed because, with an internal method call, an object calls the method
on itself. We contrast internal and external method calls in the next section.  
In our example, the method does not have any parameters, so the parameter list is empty.
This is signified by the pair of parentheses with nothing between them.  
When a method call is encountered, the matching method is executed, and the execution
returns to the method call and continues at the next statement after the call. For a method
signature to match the method call, both the name and the parameter list of the method must
match. Here, both parameter lists are empty, so they match. This need to match against both
method name and parameter lists is important, because there may be more than one method
of the same name in a class—if that method is overloaded.  
In our example, the purpose of this method call is to update the display string. After the
two number displays have been created, the display string is set to show the time indicated
by the number display objects. The implementation of the `updateDisplay` method will
be discussed below.

**External methods calls**

Now let us examine the next method: `timeTick`.

Were this display connected to a real clock, this method would be called once every 60
seconds by the electronic timer of the clock. For now, we just call it ourselves to test the
display.  
When the `timeTick` method is called, it first executes the statement  
> `minutes.increment();`

This statement calls the `increment` method of the `minutes` object. Thus, when one of the
methods of the `ClockDisplay` object is called, it in turn calls a method of another object to
do part of the task. A method call to a method of another object is referred to as an *external
method call*. The syntax of an external method call is  

> **object . methodName ( parameter-list )**

This syntax is known as *dot notation*. It consists of an object name, a dot, the method name,
and parameters for the call. It is particularly important to note that we use the name of an object
here and not the name of a class. We use the name `minutes` rather than `NumberDisplay`. (This essential principle was illustrated in earlier exercise)  
The difference between internal and external method calls is clear—the presence of an
object name followed by a dot tells us that the method being called is part of another object.
So in the `timeTick` method, the `ClockDisplay` object is asking the `NumberDisplay`
objects to carry out part of the overall task. In other words, responsibility for the overall
time-keeping task is divided up between the `ClockDisplay` class and the `NumberDisplay`
class. This is a practical illustration of the *divide and conquer* principle we referred to earlier
in our discussion of abstraction.  
The `timeTick` method has an if-statement to check whether the hours should also be incremented.
As part of the condition in the if-statement, it calls another method of the minutes
object: `getValue`. This method returns the current value of the minutes. If that value is
zero, then we know that the display just rolled over and we should increment the hours. That
is exactly what the code does.  
> **Concept:** Methods can call methods of other objects using dot notation. This is called an *external method call*.

If the value of the minutes is not zero, then we’re done. We do not have to change the hours
in that case. Thus, the if-statement does not need an *else* part.  
We should now also be able to understand the remaining three methods of the `ClockDisplay` class. The method setTime takes two parameters — the hour and the minute — and sets the clock to the specified time. Looking at the method body, we can see that it does so by calling the setValue methods of both number displays (the one for the hours and the one for the minutes). Then it calls updateDisplay to update the display string accordingly, just as the constructor does.  
The `getTime` method is trivial — it just returns the current display string. Because we always
keep the display string up to date, this is all there is to do.  
Finally, the `updateDisplay` method is responsible for updating the display string so that the
string correctly reflects the time as represented by the two number display objects. It is called
every time the time of the clock changes. Once again, it illustrates external method calls. It
works by calling the `getDisplayValue` methods of each of the `NumberDisplay` objects.  
These methods return the values of each separate number display. The `updateDisplay` method then uses string concatenation to join these two values, separated by a colon, into a
single string.

### Let's Experiment
1. Given a variable  
   > `Printer p1;`

   which currently holds a reference to a printer object, and two methods inside the `Printer` class with the headers  
   > `public void print(String filename, boolean doubleSided)`  
     `public int getStatus(int delay)`  

   write two possible calls to each of these methods.
2. Open the *house* project and review the `Picture` class. What types of object are created by the constructor of `Picture`?
3. List all of the external method calls that are made in the `draw` method of `Picture` on the `Triangle` object called `roof`.
4. Does the `Picture` class contain any internal method calls?
5. Remove the following two statements from the `draw` method of `Picture`:
   > `window.changeColor("black");`
     `sun.changeColor("yellow");`  
     
   and make the color setting, instead, via a single call to an internal method called `setColor` (which you need to create).