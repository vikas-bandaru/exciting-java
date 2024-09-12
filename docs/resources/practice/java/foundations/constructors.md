---
layout: default
title: Constructors
parent: Class Definitions
nav_order: 3
grand_parent: Practice
---

# Practice Constructors
{: .no_toc}

<details open markdown="block">
  <summary>
    Topics
  </summary>
  {: .text-delta }
  1. [Implementing Constructors](#implementing-constructors-new-exercises-to-practice-writing-constructors)
     {:toc}
  2. [Updating Previous Exercises with Constructors](#updating-previous-exercises-with-constructors)
     {:toc}
  3. [Next Topic: Methods](#next-topic)
     {:toc}
</details>

## Implementing Constructors: New Exercises to Practice Writing Constructors

Here are a few new exercises to help you practice writing constructors in Java. Each exercise involves creating a class with fields and adding constructors to initialize those fields.

### Exercise 1: **Library Class**
**Scenario**: Create a class to represent a library.

- **Class Name**: `Library`
- **Fields**:
  - `String libraryName` – The name of the library.
  - `String address` – The address of the library.
  - `int numberOfBooks` – The number of books available in the library.

**Tasks**:
1. **Default Constructor**: Write a constructor that initializes the library with a default name, address, and number of books.
2. **Parameterized Constructor**: Write a constructor that takes `libraryName`, `address`, and `numberOfBooks` as parameters to initialize the fields.

**Instructions for Testing**:
- Create a `LibraryTester` class.
- In the `main` method, create instances of `Library` using both the default and parameterized constructors.
- Print out the field values to verify that the constructors work as expected.

### Exercise 2: **MovieTicket Class**
**Scenario**: Create a class to represent a movie ticket.

- **Class Name**: `MovieTicket`
- **Fields**:
  - `String movieName` – The name of the movie.
  - `String seatNumber` – The seat number for the ticket.
  - `double price` – The price of the ticket.

**Tasks**:
1. **Default Constructor**: Write a constructor that sets default values for `movieName`, `seatNumber`, and `price`.
2. **Parameterized Constructor**: Write a constructor that takes `movieName`, `seatNumber`, and `price` as parameters to initialize the fields.

**Instructions for Testing**:
- Create a `MovieTicketTester` class.
- In the `main` method, create instances of `MovieTicket` using both the default and parameterized constructors.
- Print out the field values to ensure they are correctly set by the constructors.

### Exercise 3: **Smartphone Class**
**Scenario**: Create a class to represent a smartphone.

- **Class Name**: `Smartphone`
- **Fields**:
  - `String brand` – The brand of the smartphone.
  - `String model` – The model of the smartphone.
  - `double price` – The price of the smartphone.

**Tasks**:
1. **Default Constructor**: Write a constructor that assigns default values to `brand`, `model`, and `price`.
2. **Parameterized Constructor**: Write a constructor that initializes `brand`, `model`, and `price` with provided values.

**Instructions for Testing**:
- Create a `SmartphoneTester` class.
- In the `main` method, create instances of `Smartphone` using both the default and parameterized constructors.
- Print out the field values to check if the constructors are working as expected.

### Exercise 4: **Course Class**
**Scenario**: Create a class to represent a course in a school or university.

- **Class Name**: `Course`
- **Fields**:
  - `String courseName` – The name of the course.
  - `String courseCode` – The code for the course.
  - `int credits` – The number of credits the course is worth.

**Tasks**:
1. **Default Constructor**: Write a constructor that sets default values for `courseName`, `courseCode`, and `credits`.
2. **Parameterized Constructor**: Write a constructor that accepts `courseName`, `courseCode`, and `credits` as parameters to initialize the fields.

**Instructions for Testing**:
- Create a `CourseTester` class.
- In the `main` method, create instances of `Course` using both the default and parameterized constructors.
- Print out the field values to verify the constructors are working properly.

### Exercise 5: **WeatherReport Class**
**Scenario**: Create a class to represent a weather report.

- **Class Name**: `WeatherReport`
- **Fields**:
  - `String location` – The location of the weather report.
  - `double temperature` – The temperature at that location.
  - `String condition` – The weather condition (e.g., sunny, rainy).

**Tasks**:
1. **Default Constructor**: Write a constructor that initializes the fields with default values.
2. **Parameterized Constructor**: Write a constructor that takes `location`, `temperature`, and `condition` as parameters to initialize the fields.

**Instructions for Testing**:
- Create a `WeatherReportTester` class.
- In the `main` method, create instances of `WeatherReport` using both the default and parameterized constructors.
- Print out the field values to ensure that the constructors are setting the fields correctly.

## Updating Previous Exercises with Constructors

Now, let's update the classes from the previous exercises by adding constructors.

### **1. Student Class**
- **Add**:
  - A default constructor that sets default values for `studentId`, `name`, and `gpa`.
  - A parameterized constructor that takes `studentId`, `name`, and `gpa` as arguments.
  
- **Instructions for Testing**:
  - In the `StudentTester` class, create instances using both constructors and print the field values to verify the updates.

### **2. Book Class**
- **Add**:
  - A default constructor that initializes `isbn`, `title`, and `author` with default values.
  - A parameterized constructor that accepts `isbn`, `title`, and `author` as arguments.
  
- **Instructions for Testing**:
  - In the `BookTester` class, create instances using both constructors and print the field values to check if they are correctly initialized.

### **3. Car Class**
- **Add**:
  - A default constructor that sets default values for `licensePlate`, `make`, and `model`.
  - A parameterized constructor that takes `licensePlate`, `make`, and `model` as arguments.
  
- **Instructions for Testing**:
  - In the `CarTester` class, create instances using both constructors and print the field values to confirm the constructors are working.

### **4. Movie Class**
- **Add**:
  - A default constructor that initializes `movieId`, `title`, and `durationMinutes` with default values.
  - A parameterized constructor that accepts `movieId`, `title`, and `durationMinutes` as arguments.
  
- **Instructions for Testing**:
  - In the `MovieTester` class, create instances using both constructors and print the field values to verify the updates.

### **5. Employee Class**
- **Add**:
  - A default constructor that sets default values for `employeeId`, `name`, and `salary`.
  - A parameterized constructor that takes `employeeId`, `name`, and `salary` as arguments.
  
- **Instructions for Testing**:
  - In the `EmployeeTester` class, create instances using both constructors and print the field values to ensure the constructors are functioning correctly.

## Summary
These exercises will help reinforce your understanding of constructors in Java, including default constructors, parameterized constructors, and overloading. Testing in the respective `Tester` classes will confirm that your constructors are correctly implemented and working as expected.

[Back to Top](#top)

#### Next Topic: 
Go to [Methods](../../../learn/java/foundations/methods) to learn more with examples.