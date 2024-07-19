---
layout: default
title: Sessions
parent: Day 17
grand_parent: Week 3
has_children: true
nav_order: 1
---

# Module 1: Java Foundations
{: .no_toc }
## Day 16: Object Interactions (Revision & Continuation)
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
1. You need to represent a car with the following properties in Java: 
   - `distanceDriven`  
   - `fuelInTank`  
   - `mileage`  
   What can be a good class design for this class. Write down in your notes and show your trainer.
   
   ```java
   ______  _______  car  
   {
        __________________________________ 
        __________________________________ 
        __________________________________ 
   }
   ```
   Make corrections, if any are needed.
   <details markdown="block">
     <summary>Solution</summary>
     ```java
     public class Car
     {
        private double distanceDriven;
        private double fuelInTank;
        private double mileage;
     }
     ```
   </details>
2. What is the method header of an accessor of the property, `mileage`:
   
   ```java
   __________________________________
   {
        return mileage;
   }
   ```
   <details markdown="block">
     <summary>Solution</summary>
     ```java
     public double getMileage()
     {
        return mileage;
     }
     ```
   </details>
3. What is the method header of a mutator of the property, `fuelInTank`:
   
   ```java
   __________________________________
   {
        ___________ = ___________ ;
   }
   ```
   Also write down what is written inside this method.
   <details markdown="block">
     <summary>Solution</summary>
     ```java
     public void setFuelInTank(double fuel)
     {
        fuelInTank = fuel;
     }
     ```
   </details>
4. Write down the constructor of `Car` class that does not take any external inputs and initializes fields with some meaningful values:
   
   ```java
   public __________________
   {
        _______________________
        _______________________
        _______________________
   }
   ```
   <details markdown="block">
     <summary>Solution</summary>
     ```java
     public Car()
     {
        distanceDriven = 0.0;
        fuelInTank = 0.0;
        mileage = 15.3;
     }
     ```
   </details>
5. Write down the constructor of `Car` class that takes miles per litre as input and initializes fields accordingly:
   
   ```java
   public Car ( ________________ )
   {
        distanceDriven = _______ ;
        fuelInTank = ________ ;
        mileage = _________ ;
   }
   ```
   <details markdown="block">
     <summary>Solution</summary>
     ```java
     public Car ( double mpl )
     {
        distanceDriven = 0.0;
        fuelInTank = 0.0;
        mileage = mpl;
     }
     ```
   </details>
6. Assume, `fuelInTank` field is represented as integer value. What is the return type of its accessor:
   
   ```java
   public _______  getFuelInTank()
   {
        return fuelInTank ;
   }
   ```
   <details markdown="block">
     <summary>Solution</summary>
     ```java
     public  int  getFuelInTank()
     {
        return fuelInTank ;
     }
     ```
   </details>
7. Assume, `mileage` is defined as `float` data type field, guess the data type of the parameter in its mutator:
   
   ```java
   public  void  setMileage ( _________  mpl )
   {
        mileage  =  mpl ;
   }
   ```
   <details markdown="block">
     <summary>Solution</summary>
     ```java
     public  void  setMileage ( float  mpl )
     {
        mileage  =  mpl ;
     }
     ```
   </details>
8. What are the default values of the following data types:
   
   ```java
   int     ==> _______
   double  ==> _______
   boolean ==> _______
   char    ==> _______
   ```
   <details markdown="block">
     <summary>Solution</summary>
     ```java
     int     ==> 0
     double  ==> 0.0
     boolean ==> false
     char    ==> '\u0000'
     ```
   </details>

## Session 2

9. You are developing a program to calculate the total cost of items in a shopping cart. The shopping cart contains same items. Write down the arithmetic expression to calculate the total cost, given the price of each item and the quantity.
   
   ```java
   public  __________  getTotalCost ( double price, int quantity )
   {
       return ______________________________ 
   }
   ```
   Also choose the appropriate return type for the method.
   <details markdown="block">
     <summary>Solution</summary>
     ```java
     public double getTotalCost ( double price, int quantity )
     {
        return (price * quantity) ;
     }
     ```
   </details>
10. In a program, you want to check if a `number` is positive. Write down the if statement to perform this check.
    
    ```java
    if ( __________ )
    {
        // Code to handle positive number
    }
    ```
    <details markdown="block">
      <summary>Solution</summary>
      ```java
      if ( number > 0 )
      {
        // Code to handle positive number
      }
      ```
    </details>
11. You are programming a game where the player's score determines their level. Write down the nested if-else statement to determine the player's level.
    
    ```java
    if (score ______________ 100) {
        if (score ______________ 90) {
            // Code for level 5
        } else {
            // Code for level 4
        }
    } else {
        // Code for levels below 4
    }
    ```
    <details markdown="block">
      <summary>Solution</summary>
      ```java
      if (score <= 100) {
          if (score > 90) {
              // Code for level 5
          } else {
              // Code for level 4
          }
      } else {
          // Code for levels below 4
      }
      ```
    </details>
12. You are comparing two variables, x and y, to determine if x is greater than y. Write down the relational expression for this comparison.
    
    ```java
    x ________ y
    ```
    <details markdown="block">
      <summary>Solution</summary>
      ```java
      x > y 
      ```
    </details>
13. You are implementing a method to check if a given number is even. Write a method named isEven that takes an integer as a parameter and returns true if the number is even, otherwise returns false.

    ```java
    public boolean isEven(int number) {
        boolean isEven = _______________;
        return isEven;
    }
    ```
    <details markdown="block">
      <summary>Solution</summary>
      ```java
      public boolean isEven ( int number ) {
          boolean isEven = ( (num % 2) == 0) ;
          return isEven;
      }
      ```
    </details>
14. You are designing a method to calculate the area of a rectangle. You wrote a method named calculateArea that takes the length and width of the rectangle as parameters and returns the area. But, someone messed up your code and now parameters are missing. Can you redo it so that it works as expected?

    ```java
    public double calculateArea( _____________ , ______________ ) {
        double area = length * width ;
        return area;
    }
    ```
    <details markdown="block">
      <summary>Solution</summary>
      ```java
      public double calculateArea(double length, double width) {
          double area = length * width ;
          return area;
      }
      ```
    </details>
15. You are creating a method to determine if a student has passed an exam based on their scores in multiple subjects. Write a method named `hasPassed` that takes the scores of three subjects as parameters and returns `true` if the student has passed all subjects (scored 40 or above in each subject), otherwise returns `false`.

    ```java
    public  _________  hasPassed ( int subject1, int subject2, int subject3 )
    {
        ________________________________________ 
    }
    ```
    <details markdown="block">
      <summary>Solution</summary>
      ```java
      public  boolean  hasPassed ( int subject1, int subject2, int subject3 )
      {
          return (subject1 >= 40) && (subject2 >= 40) && (subject3 >= 40) ;
      }
      ```
    </details>
16. Guess the return type of the following method, `isValidUser`, which checks if a user's `age` is between 18 and 60 (inclusive) and they have a valid email address, and returns true if both conditions are met, otherwise returns false.
    
    ```java
    public ___________ isValidUser ( int age, boolean hasValidEmail ) {
        boolean isValid = (age >= 18 && age <= 60) && hasValidEmail;
        return isValid;
    }
    ```
    <details markdown="block">
      <summary>Answer</summary>
      ```java
      boolean
      ```
    </details>
17. Write the following method, calculateDistance, which calculates the distance between two points given their coordinates (x1, y1) and (x2, y2), based on the formula: distance = sqrt((x2 - x1)^2 + (y2 - y1)^2).

    ```java
    public  _______  calculateDistance ( double x1, double y1, double x2, double y2 ) {
        double distance = ____________________________________________________ ;
        return distance;
    }
    ```
    <details markdown="block">
      <summary>Solution</summary>
      ```java
      public  double  calculateDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distance;
      }
      ```
    </details>
18. You are developing a method to calculate the net salary of an employee after deducting taxes. Write a method named `calculateNetSalary` that takes the gross salary and tax rate as parameters and returns the net salary.

    ```java
    public double calculateNetSalary ( double grossSalary, double taxRate ) {
        return  _______________ ;
    }
    ```
    <details markdown="block">
      <summary>Solution</summary>
      ```java
      public double calculateNetSalary ( double grossSalary, double taxRate ) {
          return grossSalary - (grossSalary * taxRate / 100) ;
      }
      ```
    </details>
19. You are designing a method to calculate the total distance traveled by a vehicle given its initial speed, acceleration, and time traveled. Choose the appropritate types and finish the code:

    ```java
    public _______ calculateDistanceTraveled( _______ initialSpeed, _______ acceleration, _______ time) {
         _______________________________ 
    }
    ```
    <details markdown="block">
      <summary>Solution</summary>
      ```java
      public double calculateDistanceTraveled ( double initialSpeed, double acceleration, double time ) {
          return (initialSpeed * time) + (0.5 * acceleration * time * time) ;
      }
      ```
    </details>
20. You are implementing a method to check if a given year is a leap year. Write a method named `isLeapYear` that takes a year as a parameter and returns `true` if the year is a leap year, otherwise returns `false`.

    ```java
    public boolean isLeapYear( int year ) {
        _____________________________________ 
    }
    ```
    <details markdown="block">
      <summary>Solution</summary>
      ```java
      public boolean isLeapYear ( int year ) {
          boolean isLeap = false ;
          if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
              isLeap = true;
          } else {
              isLeap = false;
          }
          return isLeap;
      }
      ```
    </details>

[Back to Top](#top)

## Practice Session
Java Visualizr - visualize what happens when an if-statement executes

Download and install JDK - Configure CLASSPATH
Install Eclipse and do some exercises on Eclipse IDE