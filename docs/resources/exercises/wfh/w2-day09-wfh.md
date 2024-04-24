---
layout: default
title: Work from home
parent: Day 9
grand_parent: Week 2
nav_order: 2
---

# Module 1: Java Foundations
## Week 2: Foundations of OOP & Algorithmic Thinking
### Day 9: Understanding Class Definitions (More about Methods, Conditional Statements)

## Work from Home

### Object Diagram Practice - How Constructors work

Check the following class and draw how its constructor works.  

```java
public class Product {
    private String name;
    private double price;
    private String category;
    private boolean available;
    
    public Product(String prodName, double prodPrice) {
        name = prodName;
        price = prodPrice;
        category = "Uncategorized";
        available = false;
    }
    // Other methods
}
```

### Reading and Learning Exercises using ChatGPT

1. Learn about Simple Interest & Compound Interest in detail. Learn what they are, when to use them, which real world applications use them, what are the formula, examples to understand how to calculate each of them.  
   **How to check if you understood it well:** Ask ChatGPT to give you questions to check your knowledge on this. Try to answer those questions. If you get at least 70% of the questions right, then you can say you understood the concepts.  
   **Note:** Check Day 2 in Google Classroom for ChatGPT material.

### Write your own Class Exercise

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

### More Methods Practice

1. **Age in Five Years:** A method, `ageInFiveYears`, receives two parameters called `name` and `age`. It returns a String with name then what their age would be five years from now, then what their age was five years ago.  
   Check the test cases below to write your code:  
   `ageInFiveYears("Raju", 23) --> "Hey Raju, do you know that in five years you will be 28 years old? And five years ago you were 18 years old!!"`  
   `ageInFiveYears("Hema", 87) --> "Hey Hema, do you know that in five years you will be 92 years old? And five years ago you were 82 years old!!"`  
   `ageInFiveYears("Bunny", 8) --> "Hey Bunny, do you know that in five years you will be 13 years old? And five years ago you were 3 years old!!"`  