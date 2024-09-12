---
layout: default
title: Class Definitions
parent: Practice
nav_order: 2
has_children: true
---

# Practice Class Definitions
{: .no_toc}

<details open markdown="block">
  <summary>
    Topics
  </summary>
  {: .text-delta }
  1. [Basic Class Definitions & Testing](#class-definitions-in-the-objects-first-approach)
     {:toc}
  2. [Practice Exercises - Real World Scenarios](#exercises-on-applying-class-definitions-to-new-scenarios)
     {:toc}
</details>

## Basic Class Definitions & Testing

Here are five exercises for practicing basic class definitions and testing them in Tester class:

### Exercise 1: **Student Class**
**Scenario**: Create a class to represent a student in a school system.

- **Class Name**: `Student`
- **Fields**:
  - `String studentId` – The student's unique ID.
  - `String name` – The student's full name.
  - `double gpa` – The student's Grade Point Average.

**Task**: 
- Create a `Student` class with the above fields.
- In a tester class, create an instance of `Student`, set the values for the fields, and print them out.

### Exercise 2: **Book Class**
**Scenario**: Create a class to represent a book in a library.

- **Class Name**: `Book`
- **Fields**:
  - `String isbn` – The International Standard Book Number.
  - `String title` – The title of the book.
  - `String author` – The name of the author.

**Task**:
- Create a `Book` class with the above fields.
- In a tester class, create an instance of `Book`, assign values to the fields, and print the book details.

### Exercise 3: **Car Class**
**Scenario**: Create a class to represent a car in a dealership system.

- **Class Name**: `Car`
- **Fields**:
  - `String licensePlate` – The car's license plate number.
  - `String make` – The manufacturer of the car (e.g., Toyota, Ford).
  - `String model` – The model of the car (e.g., Camry, Mustang).

**Task**:
- Create a `Car` class with the above fields.
- In a tester class, create an instance of `Car`, set the field values, and print the car information.

### Exercise 4: **Movie Class**
**Scenario**: Create a class to represent a movie in a streaming service.

- **Class Name**: `Movie`
- **Fields**:
  - `String movieId` – The unique ID of the movie.
  - `String title` – The title of the movie.
  - `int durationMinutes` – The duration of the movie in minutes.

**Task**:
- Create a `Movie` class with the above fields.
- In a tester class, create an instance of `Movie`, set the field values, and print out the movie details.

### Exercise 5: **Employee Class**
**Scenario**: Create a class to represent an employee in a company.

- **Class Name**: `Employee`
- **Fields**:
  - `String employeeId` – The employee's unique ID.
  - `String name` – The employee's full name.
  - `double salary` – The employee's salary.

**Task**:
- Create an `Employee` class with the above fields.
- In a tester class, create an instance of `Employee`, set the field values, and print out the employee's information.

These exercises will help solidify your understanding of creating classes, defining fields, and directly accessing them in Java.

[Back to Top](#top)

## Exercises on Applying Class Definitions to new Scenarios

Here are five different exercises with similar structure as `Car` example and challenges that you can observe and practice:

1. **Water Dispenser**
   - **Fields**: 
     - `waterLevel` (liters)
     - `capacity` (liters)
     - `dispenseRate` (liters per cup)
   - **Methods**: 
     - `addWater(amount)` (liters)
     - `dispenseWater(cups)` (cups)
   - **Conversion hint**: If `dispenseWater` takes cups as input, you'll need to convert cups to liters using the `dispenseRate`.

2. **Mobile Phone Battery**
   - **Fields**: 
     - `batteryLevel` (percentage)
     - `maxBattery` (percentage)
     - `batteryConsumptionRate` (percentage per hour)
   - **Methods**: 
     - `chargePhone(amount)` (percentage)
     - `usePhone(hours)` (hours)
   - **Conversion hint**: No unit conversion is needed if everything is in percentages and hours, but ensure battery usage doesn't exceed `batteryLevel`.

3. **Elevator**
   - **Fields**: 
     - `currentFloor` (floor number)
     - `maxFloor` (floor number)
     - `minFloor` (floor number)
     - `capacity` (kilograms)
     - `currentLoad` (kilograms)
   - **Methods**: 
     - `loadPassengers(count)` (number of passengers)
     - `moveToFloor(floor)` (floor number)
   - **Conversion hint**: You may need to convert the number of passengers to weight (`currentLoad`) based on an average passenger weight.

4. **Coffee Machine**
   - **Fields**: 
     - `waterLevel` (milliliters)
     - `coffeeBeans` (grams)
     - `maxCapacityWater` (milliliters)
     - `maxCapacityBeans` (grams)
   - **Methods**: 
     - `addWater(amount)` (milliliters)
     - `addBeans(amount)` (grams)
     - `brewCoffee(cups)` (cups)
   - **Conversion hint**: Convert the number of cups into milliliters of water and grams of beans based on the average water and beans per cup of coffee.

5. **Printer**
   - **Fields**: 
     - `paperTrayLevel` (sheets)
     - `maxTrayCapacity` (sheets)
     - `tonerLevel` (percentage)
     - `paperConsumptionPerPage` (sheets per page)
   - **Methods**: 
     - `addPaper(amount)` (sheets)
     - `printPages(pages)` (pages)
   - **Conversion hint**: For `printPages`, ensure the number of pages translates correctly into the required sheets of paper, and check toner consumption for each page.

[Back to Top](#top)

Go back to [Encapsulation](../../../learn/java/foundations/encapsulation) to learn more with examples.