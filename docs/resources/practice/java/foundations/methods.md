---
layout: default
title: Methods
parent: Class Definitions
nav_order: 1
grand_parent: Practice
---

# Practice Methods
{: .no_toc}

<details open markdown="block">
  <summary>
    Topics
  </summary>
  {: .text-delta }
  1. [Exercises on Different Forms of Methods](#exercises-on-different-forms-of-methods-8-exercises)
     {:toc}
  2. [Exercises on When and Where to use Methods](#exercises-on-when-and-where-to-use-methods-10-exercises)
     {:toc}
  3. [Next Topic: Static](#next-topic)
     {:toc}
</details>

## Implementing Methods: New Exercises to Practice Writing Methods

### Exercises on Different Forms of Methods (8 Exercises)

Here are 8 exercises that explore different combinations of parameters and return types in methods.

#### 1. **Method with No Parameters and No Return Value**
**Scenario**: Create a class to simulate a basic greeting message.

- **Class Name**: `Greeter`
- **Method**: `public void sayHello()`
- **Task**: Write a method `sayHello()` that prints "Hello, welcome!" to the console. This method does not take any parameters and does not return anything.

**Instructions**:
- Implement the `sayHello()` method in the `Greeter` class.
- In a `GreeterTester` class, create an instance of `Greeter` and call the `sayHello()` method.

#### 2. **Method with No Parameters and a Return Value**
**Scenario**: Create a class to generate a random number.

- **Class Name**: `RandomNumberGenerator`
- **Method**: `public int generateNumber()`
- **Task**: Write a method `generateNumber()` that returns a random number between 1 and 100. This method does not take any parameters but returns an `int`.

**Instructions**:
- Implement the `generateNumber()` method in the `RandomNumberGenerator` class.
- In a `RandomNumberGeneratorTester` class, create an instance of `RandomNumberGenerator` and print the value returned by `generateNumber()`.

#### 3. **Method with Parameters and No Return Value**
**Scenario**: Create a class to calculate the sum of two numbers and display it.

- **Class Name**: `Calculator`
- **Method**: `public void displaySum(int num1, int num2)`
- **Task**: Write a method `displaySum(int num1, int num2)` that takes two integers as parameters and prints their sum. This method takes parameters but does not return anything.

**Instructions**:
- Implement the `displaySum(int num1, int num2)` method in the `Calculator` class.
- In a `CalculatorTester` class, create an instance of `Calculator` and call the `displaySum()` method with different sets of numbers.

#### 4. **Method with Parameters and a Return Value**
**Scenario**: Create a class to calculate the average of three numbers.

- **Class Name**: `Statistics`
- **Method**: `public double calculateAverage(double num1, double num2, double num3)`
- **Task**: Write a method `calculateAverage(double num1, double num2, double num3)` that takes three double values as parameters and returns their average as a double.

**Instructions**:
- Implement the `calculateAverage(double num1, double num2, double num3)` method in the `Statistics` class.
- In a `StatisticsTester` class, create an instance of `Statistics`, call the `calculateAverage()` method with different sets of numbers, and print the results.

#### 5. **Method with Multiple Parameters and a Return Value**
**Scenario**: Create a class to calculate the area of a triangle.

- **Class Name**: `Geometry`
- **Method**: `public double calculateTriangleArea(double base, double height)`
- **Task**: Write a method `calculateTriangleArea(double base, double height)` that takes the base and height of a triangle as parameters and returns the area as a double.

**Instructions**:
- Implement the `calculateTriangleArea(double base, double height)` method in the `Geometry` class.
- In a `GeometryTester` class, create an instance of `Geometry` and test the method with different values of base and height.

#### 6. **Method with No Parameters but Multiple Return Values (using an array or object)**
**Scenario**: Create a class to generate basic statistics (min, max, average) from a set of predefined numbers.

- **Class Name**: `StatisticsGenerator`
- **Method**: `public double[] getBasicStatistics()`
- **Task**: Write a method `getBasicStatistics()` that returns an array containing the minimum, maximum, and average of a predefined set of numbers.

**Instructions**:
- Implement the `getBasicStatistics()` method in the `StatisticsGenerator` class.
- In a `StatisticsGeneratorTester` class, create an instance of `StatisticsGenerator`, call `getBasicStatistics()`, and print the results.

#### 7. **Method with Object Parameters and a Return Value**
**Scenario**: Create a class to compare two students' grades and return the one with the higher grade.

- **Class Name**: `StudentComparator`
- **Method**: `public Student getTopStudent(Student student1, Student student2)`
- **Task**: Write a method `getTopStudent(Student student1, Student student2)` that takes two `Student` objects as parameters and returns the `Student` object with the higher grade.

**Instructions**:
- Implement the `getTopStudent(Student student1, Student student2)` method in the `StudentComparator` class.
- In a `StudentComparatorTester` class, create instances of `Student` and test the method.

#### 8. **Method with Boolean Return Type**
**Scenario**: Create a class to check if a number is even.

- **Class Name**: `NumberChecker`
- **Method**: `public boolean isEven(int number)`
- **Task**: Write a method `isEven(int number)` that takes an integer as a parameter and returns `true` if the number is even, and `false` otherwise.

**Instructions**:
- Implement the `isEven(int number)` method in the `NumberChecker` class.
- In a `NumberCheckerTester` class, create an instance of `NumberChecker` and test the method with different numbers.

### Exercises on When and Where to Use Methods (10 Exercises)

Here are 10 exercises focusing on the scenarios for using methods effectively.

#### 1. **Encapsulating Reusable Code**
**Scenario**: Create a class to manage user input and output for a console application.

- **Class Name**: `ConsoleManager`
- **Method**: `public void displayMenu()` and `public String getInput()`
- **Task**: Write a method `displayMenu()` to print a list of options, and a method `getInput()` to read and return the user's choice.

**Instructions**:
- Implement both methods in `ConsoleManager`.
- Test them by simulating a menu-driven application in a `ConsoleManagerTester` class.

#### 2. **Encapsulating Reusable Code**
**Scenario**: Create a class to handle the calculation of compound interest.

- **Class Name**: `InterestCalculator`
- **Method**: `public double calculateCompoundInterest(double principal, double rate, int time)`
- **Task**: Write a method `calculateCompoundInterest` to calculate compound interest, which can be reused across multiple programs.

**Instructions**:
- Implement the method in `InterestCalculator`.
- Test it with various principal amounts, rates, and time periods in an `InterestCalculatorTester` class.

#### 3. **Improving Readability**
**Scenario**: Create a class to handle transactions in a point-of-sale system.

- **Class Name**: `TransactionManager`
- **Methods**: `public void addItem(double price)`, `public double calculateTotal()`, and `public void printReceipt()`
- **Task**: Write methods to add items, calculate the total price, and print a receipt.

**Instructions**:
- Implement all methods in `TransactionManager`.
- Test the functionality in a `TransactionManagerTester` class by simulating a few transactions.

#### 4. **Improving Readability**
**Scenario**: Create a class to process and display student grades.

- **Class Name**: `GradeProcessor`
- **Methods**: `public void addGrade(int grade)`, `public double calculateAverage()`, and `public void printGrades()`
- **Task**: Write methods to add grades, calculate the average, and print all grades.

**Instructions**:
- Implement all methods in `GradeProcessor`.
- Test the functionality in a `GradeProcessorTester` class by adding grades and displaying results.

#### 5. **Organizing Code**
**Scenario**: Create a class to handle operations related to books in a library system.

- **Class Name**: `LibraryManager`
- **Methods**: `public void addBook(Book book)`, `public Book findBook(String title)`, and `public void removeBook(String title)`
- **Task**: Write methods to add, find, and remove books from a collection.

**Instructions**:
- Implement all methods in `LibraryManager`.
- Test the functionality in a `LibraryManagerTester` class by adding, finding, and removing books.

#### 6. **Organizing Code**
**Scenario**: Create a class to manage employee records in a company.

- **Class Name**: `EmployeeManager`
- **Methods**: `public void addEmployee(Employee employee)`, `public Employee findEmployeeById(String id)`, and `public void printAllEmployees()`
- **Task**: Write methods to add employees, find employees by ID, and print all employee records.

**Instructions**:
- Implement all methods in `EmployeeManager`.
- Test the functionality in an `EmployeeManagerTester` class by managing a list of employees.

#### 7. **Simplifying Repetitive Tasks**
**Scenario**: Create a class to handle user authentication.

- **Class Name**: `AuthManager`
- **Method**: `public boolean authenticateUser(String username, String password)`
- **Task**: Write a method `authenticateUser` that checks user credentials and returns true if they match predefined values.

**Instructions**:
- Implement the method in `AuthManager`.
- Test it in an `AuthManager

Tester` class by simulating login attempts.

#### 8. **Simplifying Repetitive Tasks**
**Scenario**: Create a class to validate form inputs.

- **Class Name**: `FormValidator`
- **Methods**: `public boolean isEmailValid(String email)`, `public boolean isPasswordStrong(String password)`
- **Task**: Write methods to validate an email address and a password.

**Instructions**:
- Implement both methods in `FormValidator`.
- Test them in a `FormValidatorTester` class by validating various email addresses and passwords.

#### 9. **Facilitating Testing and Debugging**
**Scenario**: Create a class to perform basic file operations.

- **Class Name**: `FileManager`
- **Methods**: `public void writeToFile(String filename, String content)`, `public String readFromFile(String filename)`
- **Task**: Write methods to write to a file and read from a file.

**Instructions**:
- Implement both methods in `FileManager`.
- Test them in a `FileManagerTester` class by writing to and reading from a test file.

#### 10. **Facilitating Testing and Debugging**
**Scenario**: Create a class to perform mathematical operations for a calculator app.

- **Class Name**: `MathOperations`
- **Methods**: `public int add(int a, int b)`, `public int subtract(int a, int b)`, `public int multiply(int a, int b)`, `public int divide(int a, int b)`
- **Task**: Write methods to perform basic arithmetic operations.

**Instructions**:
- Implement all methods in `MathOperations`.
- Test them in a `MathOperationsTester` class by performing various arithmetic operations.

### Summary

These exercises cover different aspects of methods, including various combinations of parameters and return types, as well as scenarios for when and where to use methods. They will help you practice creating, organizing, and testing methods effectively in your Java programs.

[Back to Top](#top)

#### Next Topic: 
Go to [Static](../../../learn/java/foundations/static) to learn more with examples.