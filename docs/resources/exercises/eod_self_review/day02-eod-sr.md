---
layout: default
title: Test Yourself
parent: Day 2
grand_parent: Module 1 Week 1
nav_order: 3
---

# Module 1: Java Foundations
## Week 1: Foundations of OOP & Algorithmic Thinking
### Day 2: Understanding Class Definitions
### Test Yourself
---

Today, we have covered a lot of new ground, and we have introduced a lot of new concepts.  
We will be building on these in future sessions, so it is important that you are comfortable with them. Try the following **pencil-and-paper exercises** as a way of checking that you are becoming used to the terminology that we have introduced in this chapter. Don’t be put off by the fact that we suggest that you do these on paper rather than within BlueJ.  
_It will be good practice to try things out without a compiler._

1. List the name and return type of this method:

   ```java
   public String getCode()
   {
      return code;
   }
   ```

   <input type="text">

2. List the name of this method and the name and type of its parameter:

   ```java
   public void setCredits(int creditValue)
   {
      credits = creditValue;
   }
   ```

   <input type="text">

3. Write out the outer wrapping (class header) of a class called `Person`.  
   Remember to include the curly brackets that mark the start and end of the class body, but otherwise leave the body empty.
4. Write out definitions for the following fields:
   - a field called `name` of type `String`
   - a field of type `int` called `age`
   - a field of type `String` called `code`
   - a field called `credits` of type `int`
5. Write out a constructor for a class called `Module`. The constructor should take a single parameter of type `String` called `moduleCode`. The body of the constructor should assign the value of its parameter to a field called `code`. You don’t have to include the definition for `code`, just the text of the constructor.
6. Write out a constructor for a class called `Person`. The constructor should take two parameters. The first is of type `String` and is called `myName`. The second is of type `int` and is called `myAge`. The first parameter should be used to set the value of a field called `name`, and the second should set a field called `age`. You don’t have to include the definitions for the fields, just the text of the constructor.
7. Correct the error in this method:

   ```java
   public void getAge()
   {
      return age;
   }
   ```

8. Write an accessor method called `getName` that returns the value of a field called `name`, whose type is `String`.
9. Write a mutator method called `setAge` that takes a single parameter of type `int` and sets the value of a field called `age`.
10. Write a method called `printDetails` for a class that has a field of type `String` called `name`. The `printDetails` method should print out a string of the form “The name of this person is”, followed by the value of the `name` field. For instance, if the value of the `name` field is “Helen”, then `printDetails` would print:  
    `The name of this person is Helen`

### _lab-classes_ revisit

You have met a lot of new concepts. To help reinforce them, we shall now revisit a few in a different but familiar context. Along the way, though, watch out for one or two further new concepts that we will then cover in more detail in later sessions!  
Open the _lab-classes_ project that we introduced in Day 1, and then examine the `Student` class.

1. Draw a picture representing the initial state of a `Student` object following its construction, with the following actual parameter values, as previously shown for `TicketMachine`:  
   `new Student("Benjamin Jonson", "738321")`
2. What would be returned by `getLoginName` for a student with `name` **"Henry Moore"** and `id` **"557214"**?
3. Create a `Student` with `name` **"djb"** and `id` **"859012"**. What happens when `getLoginName` is called on this student? Why do you think this is?
4. The `String` class defines a `length` accessor method with the following header:

   ```java
   /**
    * Return the number of characters in this string.
    */
   public int length()
   ```

   so the following is an example of its use with the `String` variable `fullName`:  
   `fullName.length()`  
   Add conditional statements to the constructor of `Student` to print an error message if either the length of the `fullName` parameter is less than four characters, or the length of the `studentId` parameter is less than three characters. However, the constructor should still use those parameters to set the `name` and `id` fields, even if the error message is printed. Hint: Use if-statements of the following form (that is, having no `else` part) to print the error messages.  

   `if( perform a test on one of the parameters ) {`  
      *Print an error message if the test gave a true result*  
   `}`  
   See Appendix D for further details of the different types of if-statements, if necessary.
