---
layout: default
title: Sessions
parent: Day 15
grand_parent: Week 3
has_children: true
nav_order: 1
---

# Module 1: Java Foundations
{: .no_toc }
## Day 14: Object Interactions
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
### Abstraction and Modularization
Read it from the Classroom material

### Implementing the the Clock display

first build a 2-digit number display

```java
public class NumberDisplay {
   private int value;
   private int limit;

   // Constructors and methods omitted
}
```
We would build a complete clock display by having an object that has, internally, two number displays (one for the hours, and one for the minutes). Each of the number
displays would be a field in the clock display

```java
public class ClockDisplay {
   private NumberDisplay hours;
   private NumberDisplay minutes;

   // Constructors and methods omitted
}
```

> **Concept:** Classes define types

### Class Diagrams vs Object Diagrams
Class Diagram: shows the classes of the application and the relationships between them

### Let's Experiment
1. Think again about the lab-classes project that we discussed in the last two projects. Imagine that we create a LabClass object and three Student objects. We then enroll all three students in that lab. Try to draw a class diagram and an object diagram for that situation. Identify and explain the differences between them.
2. At what time(s) can a class diagram change? How is it changed?
3. At what time(s) can an object diagram change? How is it changed?
4. Write a definition of a field named tutor that can hold a reference to an object of type `Instructor`.

### Primitive types and object types

### Let's explore NumberDisplay class

### Let's Experiment
5. Open the *number-display* project. Select **Show Terminal** from the **View** menu and select *Record method calls*, as you did with the *figures* project. This will allow you to see the result of your interactions with objects, which will be useful when we look in detail at the full *clock-display* project. Now create a `NumberDisplay` object and give it the name `hours`, rather than using the default name offered by BlueJ. Use a rollover limit of `24`. Open an inspector window for this object. With the inspector open, call the object’s increment method. Note what is shown in the Terminal window. Repeatedly call the increment method until the value in the inspector rolls over to zero. (If you are feeling impatient, you could always create a NumberDisplay object with a lower limit!)
6. Create a second `NumberDisplay` object with a limit of `60`, and give it the name minutes. Call its `increment` method and note how the method calls are represented in the **Terminal window**. Imagine that the `hours` and `minutes` objects on the object bench represent the two `NumberDisplay` objects managed by a `ClockDisplay` object. In effect, you are now performing the role of the `ClockDisplay` object. What should you do each time you call increment on minutes to decide whether it has rolled over and whether increment should therefore be called on the hours object?
7. Select Show Code Pad from the View menu. Create a NumberDisplay object with limit 6 in the Code Pad by typing  
> `NumberDisplay nd = new NumberDisplay(6);`  

   Then call its getValue, setValue, and increment methods in the **Code Pad** (e.g., by typing nd.getValue()). Note that statements (mutators) need a semicolon at the end, while expressions (accessors) do not. The call to setValue will need to include a numerical parameter value. Use the recorded method calls in the Terminal window to help you with the correct way of writing these method calls.
8. What error message do you see in the **Code Pad** if you type the following?  
> `NumberDisplay.getValue()`  

   Take a careful look at this error message and try to remember it because you will likely encounter something similar on numerous future occasions. Note that the reason for the error is that the class name, `NumberDisplay`, has been used incorrectly to try to call the getValue method, rather than the variable name `nd`.
9. What error message do you see in the **Code Pad** if you type the following?
> `nd.setValue(int 5);`  

   The error message is not actually very helpful at all. Can you work out what is incorrect about this call to `setValue`, and correct it? It would also be worth remembering this error message because it results from an easy error to make in the early stages of learning.

### Logical Operators: setValue method

### Let's Experiment
