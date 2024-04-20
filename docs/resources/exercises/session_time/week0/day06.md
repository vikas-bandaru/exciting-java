---
layout: default
title: Sessions
parent: Day 6
grand_parent: Week 1
has_children: true
nav_order: 2
---

# Module 1: Java Foundations
{: .no_toc }
## Day 6: Continuing Experiments with BlueJ
{: .no_toc }
### Objects & Classes
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
</details>

## Session 1

1. Repeat yesterday's class work and homework exercises to understand the following concepts:
   - Method
   - Parameter
   - Type
   - Method header
   - Method signature
   - Parenthesis - curve brackets - ()
   - int - integers
   - String - values stored in between a pair of ""
   - properties of an object
   - inspect window
   - State

   Refer to the Objects & Classes presentation shared in your Classroom to revise the concepts discussed in the session.
2. Create an object of `Circle`. Inspect the object. Note down the properties of the object. Then try all methods on the objects. While trying the methods, take note of which methods of an object is affecting which properties.

## Session 2
*Repeat the Work from Home Challenge from yesterday and finish one of your chosen challenge diagrams as fast as you can.*

1. Select *Show Terminal* from the *View* menu. This shows another window that BlueJ uses for text output. Then select *Record method calls* from the terminal’s *Options* menu. This function will cause all our method calls (in their textual form) to be written to the terminal. Now create a few objects, call some of their methods, and observe the output in the terminal window.
2. Let's now save this code somewhere safe and we will revisit it later.
3. Select *Show Code Pad* from the *View* menu. This should display a new pane next to the object bench in your main BlueJ window. This pane is the *Code Pad*. You can type Java code here. In the Code Pad, type the code shown in the Terminal window to create a `Person` object and call its `makeVisible` and `moveRight` methods. Then go on to create some other objects and call their methods using *Code Pad*.
4. Let's experiment more with data types you learned yesterday.

### Exercises on _house_ project

0. Go to Day 5, download the _house_ project ==> extract it to your projects folder.
1. Open the _house_ project. Create an instance of class `Picture` and invoke its `draw` method. Also, try out the `setBlackAndWhite` and `setColor` methods. How do you think the `Picture` class draws the picture?

<!-- ## Session 2
### Observing Picture class

1. Look at the pop-up menu of class `Picture` again. You will see an option labeled _Open Editor_. Select it. This will open a text editor displaying the source code of the class.
2. In the source code of class `Picture`, find the part that actually draws the picture. Change it so that the sun will be blue rather than yellow.
3. Add a second sun to the picture. To do this, pay attention to the field definitions close to the top of the class. You will find this code:

   ```java
   private Square wall;
   private Square window;
   private Triangle roof;
   private Circle sun;
   ```

   You need to add a line here for the second sun. For example:  
   `private Circle sun2;`  
   Then write the appropriate code in two different places for creating the second sun and making it visible when the picture is drawn.

## Practice Session
### Exercises on _lab-classes_ project

0. Go to Day 5, download the _lab-classes_ project ==> extract it to your projects folder.
1. Create an object of class `Student`. You will notice that this time you are prompted not only for a name of the instance, but also for some other parameters. Fill them in before clicking OK. (Remember that parameters of type `String` must be written within double quotes.)
2. Create some `Student` objects. Call the `getName` method on each object. Explain what is happening.
3. Create an object of class `LabClass`. As the signature indicates, you need to specify the maximum number of students in that class (an integer).
4. Call the `numberOfStudents` method of that class. What does it do?
5. Look at the signature of the `enrollStudent` method. You will notice that the type of the expected parameter is `Student`. Make sure you have two or three students and a `LabClass` object on the object bench, then call the `enrollStudent` method of the `LabClass` object. With the input cursor in the dialog entry field, click on one of the student objects; this enters the name of the student object into the parameter field of the `enrollStudent` method. Click OK and you have added the student to the `LabClass`. Add one or more other students as well.
6. Call the `printList` method of the `LabClass` object. You will see a list of all the students in that class printed to the BlueJ terminal window
7. Create three students with the following details:

   ```
   Suneetha, student ID: A00234, credits: 24
   Lata Mangeshkar, student ID: C22044, credits: 56
   Papon, student ID: A12003, credits: 6
   ```

   Then enter all three into a lab and print a list to the screen.

8. Use the inspector on a `LabClass` object to discover what fields it has.
9. Set the instructor, room, and time for a lab, and print the list to the terminal window to check that these new details appear. -->