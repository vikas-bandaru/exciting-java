---
layout: default
title: Work from home
parent: Day 9
grand_parent: Week 2
nav_order: 2
---

# Module 1: Java Foundations
## Week 2: Foundations of OOP & Algorithmic Thinking
### Day 9: Understanding Class Definitions (More about Methods)

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

### Write your own Class Exercise

1. Create a class called `Book` that contains the following fields:  
   - `title`: a String representing the title of the book.  
   - `author`: a String representing the author of the book.  
   - `yearPublished`: an integer representing the year the book was published.  

   Define a constructor that takes parameters for new title, new author, and new yearPublished, and initializes the respective fields.  
   Define accessor methods to get the values of `title`, `author`, and `yearPublished` fields.  

2. Create a class called `Rectangle` that contains the following fields:  
   - `length`: a double representing the length of the rectangle.  
   - `width`: a double representing the width of the rectangle.  

   Define a constructor that takes parameters for new length and new width, and initializes the respective fields.  
   Define accessor methods to get the values of `length` and `width` fields.  
   Define a mutator method named `scale` that takes a double parameter representing the scaling factor, and updates both `length` and `width` by multiplying them with the scaling factor.  

   **Note:** Scaling factor refers to a value by which the dimensions (length and width) of the rectangle are multiplied.  
   For example, if the scaling factor is 2, then both the length and width of the rectangle would be doubled. Similarly, if the scaling factor is 0.5, then both the length and width would be halved, effectively reducing the size of the rectangle.

3. Create a class called `Employee` that contains the following fields:  
   - `name`: a String representing the name of the employee.  
   - `department`: a String representing the department of the employee.  
   - `salary`: a double representing the salary of the employee.  

   Define a constructor that takes parameters for new name, new department, and new salary, and initializes the respective fields.  
   Define accessor methods to get the values of `name`, `department`, and `salary` fields.  
   Define a mutator method named `increaseSalary` that takes a double parameter representing the percentage increase in salary, and updates the salary field accordingly.

4. Create a class called `Circle` that contains the following fields:  
   - `radius`: a double representing the radius of the circle.  
   - `diameter`: a double representing the diameter of the circle.  

   Define a constructor that takes a parameter for new radius, calculates the `diameter` (2 * radius), and initializes both `radius` and `diameter` fields.  
   Define accessor methods to get the values of `radius` and `diameter` fields.  
   Define a mutator method named `setRadius` that takes a double parameter representing the new radius value and updates both radius and diameter accordingly.

### More Methods Practice on String Concatenation with Numbers

1. **Age in Five Years:** Write a method, `ageInFiveYears`, that receives two parameters called `name` and `age`. It returns a String with name then what their age would be five years from now, then what their age was five years ago.  
   Refer to the test cases below to write your code:  
   `ageInFiveYears("Raju", 23) --> "Hey Raju, do you know that in five years you will be 28 years old? And five years ago you were 18 years old!!"`  
   `ageInFiveYears("Hema", 87) --> "Hey Hema, do you know that in five years you will be 92 years old? And five years ago you were 82 years old!!"`  
   `ageInFiveYears("Bunny", 8) --> "Hey Bunny, do you know that in five years you will be 13 years old? And five years ago you were 3 years old!!"`  