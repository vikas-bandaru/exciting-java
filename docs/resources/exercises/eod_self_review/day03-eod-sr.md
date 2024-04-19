---
layout: default
# title: Self Review
parent: Day 3
grand_parent: Week 1
nav_order: 3
---

# Module 1: Java Foundations

## Week 1: Foundations of OOP & Algorithmic Thinking

### Day 3: Understanding Class Definitions
### Self Review
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

#### Review of `lab-classes` project

#### Calling Methods

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
    _Print an error message if the test gave a true result_  
   `}`  
   See [Conditionals](../../cheatsheets/conditionals.md) for further details of the different types of if-statements, if necessary.

### Create your own classes

The following exercises are designed to help you experiment with the concepts of Java that we have discussed in this chapter. You will create your own classes that contain elements such as fields, constructors, methods, assignment statements, and conditional
statements.

1. Refer the outline for a `Book` class, which can be found in the _book-exercise_ project. The outline already defines two fields and a constructor to initialize the fields. In this and the next few exercises, you will add features to the class outline.  
   Add two accessor methods to the class — `getAuthor` and `getTitle` — that return the author and title fields as their respective results. Test your class by creating some instances and calling the methods.
2. Add two methods, `printAuthor` and `printTitle`, to the outline `Book` class. These should print the `author` and `title` fields, respectively, to the terminal window.
3. Add a field, `pages`, to the `Book` class to store the number of pages. This should be of type `int`, and its initial value should be passed to the single constructor, along with the `author` and `title` strings. Include an appropriate `getPages` accessor method for this field.
4. Are the `Book` objects you have implemented immutable? Justify your answer.
5. Add a method, `printDetails`, to the `Book` class. This should print details of the author, title, and pages to the terminal window. It is your choice how the details are formatted. For instance, all three items could be printed on a single line, or each could be printed on a separate line. You might also choose to include some explanatory text to help a user work out which is the author and which is the title, for example  
   `Title: Robinson Crusoe, Author: Daniel Defoe, Pages: 232`
6. Add a further field, `refNumber`, to the `Book` class. This field can store a reference number for a library, for example. It should be of type `String` and initialized to the zero length string (**""**) in the constructor, as its initial value is not passed in a parameter to the constructor. Instead, define a mutator for it with the following header:  
   `public void setRefNumber(String ref)`
   The body of this method should assign the value of the parameter to the `refNumber` field. Add a corresponding `getRefNumber` accessor to help you check that the mutator works correctly.
7. Modify your `printDetails` method to include printing the reference number. However, the method should print the reference number only if it has been set — that is, if the `refNumber` string has a non-zero length. If it has not been set, then print the string **"ZZZ"** instead. _Hint:_ Use a conditional statement whose test calls the `length` method on the `refNumber` string.
8. Modify your `setRefNumber` mutator so that it sets the `refNumber` field only if the parameter is a string of at least three characters. If it is less than three, then print an error message and leave the field unchanged.
9. Add a further integer field, `borrowed`, to the `Book` class. This keeps a count of the number of times a book has been borrowed. Add a mutator, `borrow`, to the class. This should update the field by 1 each time it is called. Include an accessor, `getBorrowed`, that returns the value of this new field as its result. Modify `printDetails` so that it includes the value of this field with an explanatory piece of text.
10. Add a further `boolean` field, `courseText`, to the `Book` class. This records whether or not a book is being used as a text book on a course. The field should be set through a parameter to the constructor, and the field is immutable. Provide an accessor method for it called `isCourseText`.
