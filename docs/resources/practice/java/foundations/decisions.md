---
layout: default
title: Decisions
parent: Class Definitions
nav_order: 6
grand_parent: Practice
---

# Practice Taking Decisions using Code (Conditional Statements)
{: .no_toc}

<details open markdown="block">
  <summary>
    Topics
  </summary>
  {: .text-delta }
  1. [Exercise 1](#exercise-1-simple-login-system)
     {:toc}
  2. [Exercise 2](#exercise-2-grading-system)
     {:toc}
  3. [Exercise 3](#exercise-3-vending-machine)
     {:toc}
  4. [Exercise 4](#exercise-4-day-of-the-week)
     {:toc}
  5. [Exercise 5](#exercise-5-simple-calculator)
     {:toc}
  6. [Exercise 6](#exercise-6-password-strength-checker)
     {:toc}
  7. [Exercise 7](#exercise-7-discount-calculator)
     {:toc}
  8. [Exercise 8](#exercise-8-traffic-light-simulator)
     {:toc}
  9. [Exercise 9](#exercise-9-number-comparison)
     {:toc}
  10. [Exercise 10](#exercise-10-temperature-converter)
      {:toc}
</details>

## Practice Exercises

Here are some exercises to practice writing and using conditional statements effectively. Each exercise is designed to cover different scenarios and concepts we’ve discussed.

### **Exercise 1: Simple Login System**

**Scenario**: Create a simple login system that checks if a username and password are correct.

**Task**:
- Use `if` and `else` statements to compare the entered username and password with stored values.
- Display "Login successful" if both match, otherwise display "Login failed."

**Instructions**:
1. Create a class `LoginSystem` with hardcoded username and password values.
2. Write a method `public void login(String username, String password)` that performs the check using `if` and `else`.
3. Write a `LoginSystemTester` class to test the login method with various usernames and passwords.

**Expected Outcome**:
- The program should correctly validate the username and password, displaying appropriate messages.

### **Exercise 2: Grading System**

**Scenario**: Create a grading system that assigns letter grades based on a student’s score.

**Task**:
- Use `if`, `else if`, and `else` statements to assign a grade based on the score.
- Scores 90 and above should receive an "A", scores 80-89 a "B", scores 70-79 a "C", and below 70 an "F".

**Instructions**:
1. Create a class `GradingSystem`.
2. Write a method `public String getGrade(int score)` that returns the letter grade.
3. Write a `GradingSystemTester` class to test the grading method with various scores.

**Expected Outcome**:
- The program should return the correct letter grade based on the input score.

### **Exercise 3: Vending Machine**

**Scenario**: Create a vending machine program that dispenses items based on a number input.

**Task**:
- Use a `switch` statement to handle different item selections.
- If the user selects an invalid item number, display a message saying "Invalid selection."

**Instructions**:
1. Create a class `VendingMachine`.
2. Write a method `public void selectItem(int itemNumber)` that uses a `switch` statement to handle the selection.
3. Write a `VendingMachineTester` class to test the item selection with various inputs.

**Expected Outcome**:
- The program should display the correct item based on the selection, or an error message for invalid inputs.

### **Exercise 4: Day of the Week**

**Scenario**: Create a program that displays the name of the day of the week based on a number (1 for Monday, 2 for Tuesday, etc.).

**Task**:
- Use a `switch` statement to map numbers to days of the week.
- Include a `default` case to handle invalid numbers.

**Instructions**:
1. Create a class `DayOfWeek`.
2. Write a method `public void printDay(int dayNumber)` that uses a `switch` statement to print the day.
3. Write a `DayOfWeekTester` class to test the method with valid and invalid day numbers.

**Expected Outcome**:
- The program should correctly print the day of the week or an error message for invalid numbers.

### **Exercise 5: Simple Calculator**

**Scenario**: Create a basic calculator that performs addition, subtraction, multiplication, and division based on user input.

**Task**:
- Use `if-else` statements to determine which operation to perform.
- Handle division by zero with an appropriate error message.

**Instructions**:
1. Create a class `SimpleCalculator`.
2. Write a method `public double calculate(double num1, double num2, String operation)` that performs the correct operation.
3. Write a `SimpleCalculatorTester` class to test the calculator with various operations and numbers.

**Expected Outcome**:
- The calculator should correctly perform the chosen operation, and handle errors like division by zero.

### **Exercise 6: Password Strength Checker**

**Scenario**: Create a program that checks the strength of a password based on its length and the presence of numbers or special characters.

**Task**:
- Use `if`, `else if`, and `else` statements to categorize passwords as "Strong", "Medium", or "Weak".
- A strong password has more than 8 characters and includes numbers and special characters; a medium password has more than 6 characters and includes either numbers or special characters; a weak password is shorter or lacks these features.

**Instructions**:
1. Create a class `PasswordChecker`.
2. Write a method `public String checkStrength(String password)` to evaluate the password.
3. Write a `PasswordCheckerTester` class to test the method with various passwords.

**Expected Outcome**:
- The program should correctly categorize passwords based on their strength.

### **Exercise 7: Discount Calculator**

**Scenario**: Create a program that calculates the final price after applying a discount based on the total purchase amount.

**Task**:
- Use `if-else` statements to apply different discount percentages based on the total amount.
- For example, a 10% discount for totals over $100, 5% for totals over $50, and no discount for totals under $50.

**Instructions**:
1. Create a class `DiscountCalculator`.
2. Write a method `public double applyDiscount(double totalAmount)` that calculates the final price after the discount.
3. Write a `DiscountCalculatorTester` class to test the method with different total amounts.

**Expected Outcome**:
- The program should correctly calculate the final price after applying the appropriate discount.

### **Exercise 8: Traffic Light Simulator**

**Scenario**: Simulate the behavior of a traffic light using a switch statement.

**Task**:
- Use a `switch` statement to print "Stop" for red, "Go" for green, and "Slow down" for yellow.
- Include a `default` case for invalid inputs.

**Instructions**:
1. Create a class `TrafficLight`.
2. Write a method `public void signal(String lightColor)` to simulate the traffic light.
3. Write a `TrafficLightTester` class to test the method with different light colors.

**Expected Outcome**:
- The program should simulate the correct behavior for each traffic light color.

### **Exercise 9: Number Comparison**

**Scenario**: Create a program that compares two numbers and prints whether the first number is greater than, less than, or equal to the second number.

**Task**:
- Use `if`, `else if`, and `else` statements to perform the comparison.

**Instructions**:
1. Create a class `NumberComparison`.
2. Write a method `public void compareNumbers(int num1, int num2)` to perform the comparison.
3. Write a `NumberComparisonTester` class to test the method with different pairs of numbers.

**Expected Outcome**:
- The program should correctly compare the numbers and print the appropriate message.

### **Exercise 10: Temperature Converter**

**Scenario**: Create a program that converts temperatures between Celsius, Fahrenheit, and Kelvin based on user input.

**Task**:
- Use a `switch` statement to determine the conversion based on the user’s choice.

**Instructions**:
1. Create a class `TemperatureConverter`.
2. Write a method `public double convertTemperature(double temp, String scaleFrom, String scaleTo)` that handles the conversion.
3. Write a `TemperatureConverterTester` class to test the method with various temperatures and scales.

**Expected Outcome**:
- The program should correctly convert temperatures between the chosen scales.

## Summary of Practice Exercises
- **Conditional Statements**: Practice using `if`, `else if`, `else`, and `switch` statements in various real-world scenarios.
- **Common Patterns**: These exercises help reinforce when to use different types of conditional statements, how to handle multiple conditions, and how to ensure all possible cases are covered.

These exercises should provide a comprehensive understanding of conditional statements and how to apply them in different situations. Let me know if you need further guidance or if you want to discuss the solutions!

[Back to Top](#top)

#### Next Topic: 
Go to [Loops](../../../learn/java/foundations/loops) to learn more with examples.