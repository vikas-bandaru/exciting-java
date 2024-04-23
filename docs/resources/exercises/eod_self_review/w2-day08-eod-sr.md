---
layout: default
title: Self Review
parent: Day 8
grand_parent: Week 2
nav_order: 3
---

# Module 1: Java Foundations

## Week 2: Foundations of OOP & Algorithmic Thinking

### Day 3: Understanding Class Definitions
### Self Review
---

Today, we have covered a lot of new ground, and we have introduced a lot of new concepts.  
We will be building on these in future sessions, so it is important that you are comfortable with them. Try the following **pen-and-paper exercises** as a way of checking that you are becoming used to the terminology that we have introduced in this chapter. Don’t be put off by the fact that we suggest that you do these on paper rather than within BlueJ.  
_It will be good practice to try things out without a compiler._

1. List the name and return type of this method:

   ```java
   public String getCode()
   {
      return code;
   }
   ```

2. List the name of this method and the name and type of its parameter:

   ```java
   public void setCredits(int creditValue)
   {
      credits = creditValue;
   }
   ```

3. Write out the outer wrapping (class header) of a class called `Person`.  
   Remember to include the curly brackets that mark the start and end of the class body, but otherwise leave the body empty.
4. Write out definitions for the following fields:
   - a field called `name` of type `String`
   - a field of type `int` called `age`
   - a field of type `String` called `code`
   - a field called `credits` of type `int`
5. Write out a constructor for a class called `Module`. The constructor should take a single parameter of type `String` called `moduleCode`. The body of the constructor should assign the value of its parameter to a field called `code`. You don’t have to include the field definition for `code`, just the text of the constructor.
6. Write out a constructor for a class called `Person`. The constructor should take two parameters. The first is of type `String` and is called `myName`. The second is of type `int` and is called `myAge`. The first parameter should be used to set the value of a field called `name`, and the second should set a field called `age`. You don’t have to include the field definitions for the fields, just the text of the constructor.