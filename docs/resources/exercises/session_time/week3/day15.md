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
## Day 15: Object Interactions
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
> **Concept:** Class Diagram shows the classes of the application and the relationships between them

> **Concept:** Object Diagram shows the objects and their relationships at any time during the execution of an application

> **Concept:** Object References are variables of object types that store references to objects.

### Let's Experiment
1. Think again about the *lab-classes* project that we discussed in the last two projects. Imagine that we create a `LabClass` object and three `Student` objects. We then enroll all three students in that lab. Try to draw a class diagram and an object diagram for that situation. Identify and explain the differences between them.
2. At what time(s) can a class diagram change? How is it changed?
3. At what time(s) can an object diagram change? How is it changed?
4. Write a definition of a field named tutor that can hold a reference to an object of type `Instructor`.

### Primitive types and object types
> **Primitive types:** types in Java that are not object types.  
  Examples: `int`, `double`, `boolean`, `char`, etc. A complete list of primitive types is given in [Data Types](../../../handouts/datatypes) handout.  
  *Primitive types* don't have any methods.

> **Object types** are defined by classes. Some classes are defined by the standard Java system (such as `String`); others are the classes we write ourselves.

Both *primitive types* and *object types* are used as types, but there are situations when they behave differently. One difference is how the values are stored.

> **Note:** We will see other differences between *primitive types* and *object types* later.

## Session 2
### Let's explore NumberDisplay class

Downlaod [number-display](../../../projects/bluej/part03/number-display.zip) project.  
Keep it in your *projects* folder and extract it.

### Let's Experiment
5. Open the *number-display* project. Select **Show Terminal** from the **View** menu and select *Record method calls*, as you did with the *figures* project. This will allow you to see the result of your interactions with objects, which will be useful when we look in detail at the full *clock-display* project. Now create a `NumberDisplay` object and give it the name `hours`, rather than using the default name offered by BlueJ. Use a rollover limit of `24`. Open an inspector window for this object. With the inspector open, call the object’s `increment` method. Note what is shown in the **Terminal** window. Repeatedly call the `increment` method until the value in the inspector rolls over to zero. (If you are feeling impatient, you could always create a NumberDisplay object with a lower limit!)
6. Create a second `NumberDisplay` object with a limit of `60`, and give it the name minutes. Call its `increment` method and note how the method calls are represented in the **Terminal window**. Imagine that the `hours` and `minutes` objects on the object bench represent the two `NumberDisplay` objects managed by a `ClockDisplay` object. In effect, you are now performing the role of the `ClockDisplay` object. What should you do each time you call `increment` on minutes to decide whether it has rolled over and whether `increment` should therefore be called on the hours object?
7. Select **Show Code Pad** from the **View** menu. Create a `NumberDisplay` object with limit `6` in the Code Pad by typing  
> `NumberDisplay nd = new NumberDisplay(6);`  

   Then call its `getValue`, `setValue`, and `increment` methods in the **Code Pad** (e.g., by typing `nd.getValue()`). Note that statements (mutators) need a semicolon at the end, while expressions (accessors) do not. The call to `setValue` will need to include a numerical parameter value. Use the recorded method calls in the **Terminal** window to help you with the correct way of writing these method calls.
8. What error message do you see in the **Code Pad** if you type the following?  
> `NumberDisplay.getValue()`  

   Take a careful look at this error message and try to remember it because you will likely encounter something similar on numerous future occasions. Note that the reason for the error is that the class name, `NumberDisplay`, has been used incorrectly to try to call the `getValue` method, rather than the variable name `nd`.
9. What error message do you see in the **Code Pad** if you type the following?
> `nd.setValue(int 5);`  

   The error message is not actually very helpful at all. Can you work out what is incorrect about this call to `setValue`, and correct it? It would also be worth remembering this error message because it results from an easy error to make in the early stages of learning.

### Logical Operators: `setValue` method

### Let's Experiment
1. Observe the `setValue` method of `NumberDisplay` class. What do you think it is doing?

> **Logic operators** Logic operators operate on boolean values (true or false) and produce a
new boolean value as a result. The three most important logical operators are **and**, **or**, and
**not**. They are written in Java as:  
    **&&** (and)  
    **||** (or)  
    **!** (not)  
  The expression  
    **a && b**  
  is true if both **a** and **b** are true, and false in all other cases. The expression  
    **a || b**  
  is true if either **a** or **b** or both are true, and false if they are both false. The expression  
    **!a**  
  is true if **a** is false and false if **a** is true.  

### Let's continue experiments
1. What happens when the `setValue` method is called with an illegal value? Is this a good solution? Can you think of a better solution?
2. What would happen if you replaced the "**>=**" operator in the test with "**>**" so that it reads  
   `if((replacementValue > 0) && (replacementValue < limit))`  
3. What would happen if you replaced the `&&` operator in the test with `||` so that it reads  
   `if((replacementValue >= 0) || (replacementValue < limit))`
4. Which of the following expressions return *true*?
   > `! (4 < 5)`  
     `! false`  
     `(2 > 2) || ((4 == 4) && (1 < 0))`  
     `(2 > 2) || (4 == 4) && (1 < 0)`  
     `(34 != 33) && ! false`  

   After writing your answers on paper, open the **Code Pad** in BlueJ and try it out. Check your answers.
5. Write an expression using boolean variables **a** and **b** that evaluates to *true* when **a** and **b** are either both *true* or both *false*.
6. Write an expression using boolean variables **a** and **b** that evaluates to *true* when only one of **a** and **b** is *true*, and that is *false* if **a** and **b** are both *false* or both *true*. (This is also called an *exclusive or*.)
7. Consider the expression (**a && b**). Write an equivalent expression (one that evaluates to true at exactly the same values for **a** and **b**) without using the **&&** operator.

### CodingBat Exercises (Problems similar to `setValue` - range checking)
Go to **Warmup-1** section of your CodingBat account  
1. parrotTrouble
2. in1020
3. hasTeen
4. loneTeen
5. in3050
6. max1020

Go to **Logic-1** section of your CodingBat account  
1. cigarParty
2. dateFashion
3. squirrelPlay
4. caughtSpeeding
5. sortaSum
6. alarmClock
7. in1To10
8. teenSum
9. withoutDoubles
10. shareDigit

### String Concatenation

Open `getDisplayValue` method of `NumberDisplay` class and observe the code.

Note that the zero (**"0"**) is written in double quotes. Thus, we have written the *string* 0, not
the *integer number* 0. Then the expression  
> `"0" + value`

“adds” a string and an integer (because the type of **value** is integer). The plus operator,
therefore, represents string concatenation again, as seen in *ticket-machine* projects. Before continuing,
we will now look at string concatenation a little more closely.  

**Note:** Check out some points about [String concatenation](../../../handouts/String-concatenation) in it's handout and continue here.

Back to our code in the `getDisplayValue` method. If `value` contains 3, for example, then the statement  
> **return "0" + value;**

will return the string **"03"**. In the case where the value is greater than 9, we have used a
little trick:  
> **return "" + value;**

Here, we concatenate `value` with an empty string. The result is that the value will be
converted to a string and no other characters will be prefixed to it. We are using the plus
operator for the sole purpose of forcing a conversion of the integer value to a value of type
`String`.

### Let's Experiment
1. Does the `getDisplayValue` method work correctly in all circumstances? What assumptions are made within it? What happens if you create a number display with limit 800, for example?
2. Is there any difference in the result of writing  
   > `return value + "";`  
   
   rather than  
   > `return "" + value;`  

   in the `getDisplayValue` method?
3. In one of the earlier exercises, you were asked to investigate the expressions  
   **9 + 3 + "cat"**  
   and  
   **"cat" + 3 + 9**  
   Predict, and then test, the result of these two expressions again. (Did they surprise you?) Explain why the results are what they are.

### CodingBat Exercises (Problems that need String concatenation)
Go to **String-1** section of your CodingBat account  
1. helloName
2. makeAbba

### The modulo operator
The last method in the `NumberDisplay` class increments the display value by 1. It takes care that the value resets to 0 when the limit is reached.
This method uses the *modulo operator* (%). The modulo operator calculates the remainder of an integer division. For example, the result of the division  
> **27 / 4**

can be expressed in integer numbers as  
> **result = 6, remainder = 3**

The modulo operator returns just the remainder of such a division. Thus, the result of the
expression **(27 % 4)** would be **3**.

### Let's Experiment
1. Explain the modulo operator. You may need to consult more resources (online Java language resources, Java books, etc.) to find out the details.
2. What is the result of the expression **(8 % 3)**?
3. Try out the expression **(8 % 3)** in the **Code Pad**. Try other numbers. What happens when you use the modulo operator with negative numbers?
4. What are all possible results of the expression **(n % 5)**, where n is a positive integer variable?
4. What are all possible results of the expression **(n % m)**, where n and m are positive integer variables?
5. Explain in detail how the increment method works.
6. Rewrite the increment method without the modulo operator, using an if-statement. Which solution is better?

### CodingBat Exercises (modulo operator)
Go to **Warmup-1** section of your CodingBat account  
1. or35

Go to **Logic-1** section of your CodingBat account  
1. specialEleven
2. more20
3. old35
4. less20
5. nearTen
6. lastDigit
7. maxMod5
8. shareDigit

## Practice Session

Try the above listed CodingBat problems