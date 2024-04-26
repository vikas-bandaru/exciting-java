---
layout: default
title: Sessions
parent: Day 10
grand_parent: Week 2
has_children: true
nav_order: 1
---

# Module 1: Java Foundations
{: .no_toc }
## Day 10: Understanding Class Definitions (Expressions, Conditional Statements)
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

### Let's Revise the concepts first

1. Class
2. Object
3. Internals of a Class  
   1. Fields: Scope & Lifetime
   2. Constructors: Rules & Conventions, how it works, what it does
      - Parameters: Rules, Scope & Lifetime
        - Actual parameters & Formal parameters: how they work together
      - Assignment Statement: how is it used in Constructors and why is it important
   3. Methods
      - Method parts
        - method name
        - parameters: same as in constructors
        - return type: Rule, return statement
      - Method types
        - Accessors: Format Convention
        - Mutators: Format Convention
4. Variables
   - Scope
   - Lifetime
   - Types of Variables: Fields & Parameters
5. Data Types
   - int
   - String
   - boolean
   - char
6. Operators
   - Concatenation operator (+)
   - Assignment operator (=)
   - Addition operator (+)

### Simple Experimnents on Arithmetic Operators using Code Pad

1. 56 + 89
2. 1923 + 343
3. 1 + 2
4. -3 + 3
5. 3 - -3
6. 3--3 (check if this works? - discuss)
7. -5- -47
8. 10 * 2
9. 13 * 29
10. 10 * 23 * 10
11. Some complex-looking Mathematics expressions using arithmetic operators
12. 65 / 5
13. 70 / 10
14. 11 / 70
15. 5 / 65
16. 70 % 10
17. 73 % 39
18. 15 % 4
19. 39 % 73
20. 4 % 15

### Some Experiments using Math class methods using Code Pad

1. Math.sqrt
2. Math.pow
3. Math.abs
4. Some complex-looking Mathematics expression using roots and powers along with arithmetic operators

### Revision & Discussion of Yesterday's Assignment (60 minutes)
1. [Self Review](../../eod_self_review/w2-day08-eod-sr)
2. [Work from Home](../../wfh/w2-day09-wfh)

### Let's try this now
1. Create a new project, *car-exercise*. Create a class, `Car`, that contains the following fields:  
   - `make`: a String representing the make of the car.  
   - `model`: a String representing the model of the car.  
   - `year`: an integer representing the manufacturing year of the car.  
   - `mileage`: a double representing the mileage of the car.  
   - `distanceTravelled`: a double representing the amount of distance the car has travelled.  

   Define a constructor that takes parameters for `make`, `model`, `year`, and `mileage`, and initializes the respective fields.  
   Define a method named `drive` that takes a double parameter representing the distance traveled, and updates the `distanceTravelled` field by adding the distance traveled to the current value of `distanceTravelled`.  
   Define accessor methods to retrieve the values of `make`, `model`, `year`, `mileage`, and `distanceTravelled` fields.  

   *Before proceeding further with this exercise, check that everything works as before.*  

   Modify your `Car` class to define two new double-precision floating point fields: `fuelInTank` and `fuelConsumption`. The values of `fuelInTank` and `fuelConsumption` should be set by parameters passed to the constructor.  
   Define a method named `refuel` that takes a double parameter representing the amount of fuel added to the car's tank, and updates the `fuelInTank` field by adding the amount of fuel added.  
   Define a method named `calculateFuelConsumed` that takes a double parameter representing the distance traveled and calculates the amount of fuel consumed based on the fuel consumption rate.
