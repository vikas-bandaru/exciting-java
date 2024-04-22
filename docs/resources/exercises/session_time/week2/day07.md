---
layout: default
title: Sessions
parent: Day 7
grand_parent: Week 2
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
2. [Practice Session](#practice-session)
   {:toc}
</details>

## Session 1

### Pre-Session Quiz

Go to your Classroom and find today's Quiz and submit it within deadline.

### Observing Picture class

1. Look at the pop-up menu of class `Picture` again. You will see an option labeled _Open Editor_. Select it. This will open a text editor displaying the source code of the class.
2. In the source code of class `Picture`, find the part that actually sets the picture to black and white and change the it to red and yellow.  
   **Practice:** Change them to any colors of your choice. Then turn it back to black and white.
3. In the source code of class `Picture`, find the part that actually draws the picture. Change it so that the sun will be blue rather than yellow.

[Back to Top](#top)

## Session 2
### Observing Picture class

1. Add a second sun to the picture. To do this, pay attention to the field definitions close to the top of the class. You will find this code:

   ```java
   private Square wall;
   private Square window;
   private Triangle roof;
   private Circle sun;
   ```

   You need to add a line here for the second sun. For example:  
   `private Circle sun2;`  
   Then write the appropriate code in two different places for creating the second sun and making it visible when the picture is drawn.

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
9. Set the instructor, room, and time for a lab, and print the list to the terminal window to check that these new details appear.

[Back to Top](#top)

## Practice Session

Practice writing method headers:

1. *Method:* `findMax`  
   *Details:* Write a method named `findMax` that takes two integers as parameters and returns the larger of the two.  
   What's the method header for `findMax`?
2. *Method:* `isPalindrome`  
   *Details:* Create a method named `isPalindrome` that takes a String as a parameter and returns true if the string is a palindrome (reads the same forwards and backwards), and false otherwise.  
   What's the method header for `isPalindrome`?
3. *Method:* `countOccurrences`  
   *Details:* Implement a method called `countOccurrences` that takes two parameters: a String representing a sentence and a char representing a character to count occurrences of within the sentence. It should return the number of occurrences of the character in the sentence.  
   What's the method header for `countOccurrences`?

Let's now practice writing some method headers in a given sceanario:

1. **Scenario:** You are building a library management system. Create a method named `calculateFine` that calculates the fine for late book returns. The method should take two parameters: `daysLate`, an integer representing the number of days late, and `finePerDay`, an integer representing the fine amount per day. It should return the total fine amount as an integer.  
   What's the method header for `calculateFine`?
2. **Scenario:** You are developing a banking application. Implement a method called `isEligibleForLoan` to determine if a customer is eligible for a loan based on their credit score and income. The method should take two parameters: `creditScore`, an integer representing the customer's credit score, and `income`, an integer representing the customer's monthly income. It should return true if the customer is eligible for a loan, and false otherwise.  
   What's the method header for `isEligibleForLoan`?

Let's do some practice of writing code inside the methods in CodingBat.

[CodingBat](https://www.codingbat.com)

[Back to Top](#top)
