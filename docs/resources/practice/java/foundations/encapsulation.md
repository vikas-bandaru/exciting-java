---
layout: default
title: Encapsulation
parent: Class Definitions
nav_order: 1
grand_parent: Practice
---

# Practice Encapsulation
{: .no_toc}

<details open markdown="block">
  <summary>
    Topics
  </summary>
  {: .text-delta }
  1. [Implementing Encapsulation](#implementing-encapsulation)
     {:toc}
  2. [Next Topic: Constructors](#next-topic-constructors)
     {:toc}
</details>

## Implementing Encapsulation

Let's update the classes from the previous exercises to incorporate encapsulation.

### General Implementation Tips:
- **Private Fields**: Use the `private` keyword to make fields private, restricting direct access from outside the class.
- **Getters and Setters**: Write a `getter` method to retrieve each field’s value and a `setter` method to modify it.
- **Validation**: Consider adding validation in setter methods to ensure the data is valid (e.g., GPA should be between 0.0 and 10.0).

### Exercise 1: **Student Class**
**Scenario**: Update the `Student` class to implement encapsulation.

- **Original Fields**:
  - `String studentId`
  - `String name`
  - `double gpa`

**Instructions**:
1. Update the `Student` class to make the fields private.
2. Add getter and setter methods for each field.
3. In the tester class, update the code to use the setters to assign values and the getters to retrieve and print the values.

### Exercise 2: **Book Class**
**Scenario**: Update the `Book` class to implement encapsulation.

- **Original Fields**:
  - `String isbn`
  - `String title`
  - `String author`

**Instructions**:
1. Update the `Book` class to make the fields private.
2. Add getter and setter methods for each field.
3. In the tester class, update the code to use the setters to assign values and the getters to retrieve and print the book details.

### Exercise 3: **Car Class**
**Scenario**: Update the `Car` class to implement encapsulation.

- **Original Fields**:
  - `String licensePlate`
  - `String make`
  - `String model`

**Instructions**:
1. Update the `Car` class to make the fields private.
2. Add getter and setter methods for each field.
3. In the tester class, update the code to use the setters to assign values and the getters to retrieve and print the car information.

### Exercise 4: **Movie Class**
**Scenario**: Update the `Movie` class to implement encapsulation.

- **Original Fields**:
  - `String movieId`
  - `String title`
  - `int durationMinutes`

**Instructions**:
1. Update the `Movie` class to make the fields private.
2. Add getter and setter methods for each field.
3. In the tester class, update the code to use the setters to assign values and the getters to retrieve and print the movie details.

### Exercise 5: **Employee Class**
**Scenario**: Update the `Employee` class to implement encapsulation.

- **Original Fields**:
  - `String employeeId`
  - `String name`
  - `double salary`

**Instructions**:
1. Update the `Employee` class to make the fields private.
2. Add getter and setter methods for each field.
3. In the tester class, update the code to use the setters to assign values and the getters to retrieve and print the employee's information.

[Back to Top](#top)

#### Next Topic: Constructors
Go to [Constructors](../../../learn/java/foundations/constructors) to learn more with examples.