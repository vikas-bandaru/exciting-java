---
layout: default
title: Code Writing Questions
parent: Class Definitions
nav_order: 4
grand_parent: Test Yourself
---

# Practice Questions (Code Writing)
## Defining Classes

<details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. [Easy Level Code Writing Questions](#easy-level-code-writing-questions)
   {:toc}
2. [Easy CodeCheck Questions](#codecheck-questions)
   {:toc}
3. [Medium Level Code Writing Questions](#medium-level-code-writing-questions)
   {:toc}
4. [Medium CodeCheck Questions](#medium-codecheck-questions)
   {:toc}
5. [Hard Level Code Writing Questions](#hard-level-code-writing-questions)
   {:toc}
</details>

### Easy Level Code Writing Questions

1. Consider the following implementation of a class `Square`:  

   ```java
   public class Square
   {
      private int sideLength; 
      private int area; // Not a good idea 

      public Square(int length)
      {
         sideLength = length;
      } 
      public int getArea() {
         area = sideLength * sideLength; return area;
      } 
   }
   ```

   Why is it not a good idea to introduce an instance variable for the area? Rewrite the class so that area is a local variable.

2. We want to add a button to the tally counter given below that allows an operator to undo an accidental button click. Provide a method  
   `public void undo()`  
   that simulates such a button. As an added precaution, make sure that clicking the undo button more often than the click button has no effect. (*Hint:* The call `Math.max(n, 0)` returns n if n is greater than zero, zero otherwise.)

   ```java
   /**
      This class models a tally counter.
   */
   public class Counter
   {
      private int value;
      /**
         Gets the current value of this counter. 
         @return the current value
      */
      public int getValue()
      {
         return value;
      }
      /**
         Advances the value of this counter by 1
      */
      public void click()
      {
         value = value + 1;
      }
      /**
         Resets the value of this counter to 0
      */
      public void reset()
      {
         value = 0;
      }
   }
   ```

3. Simulate a tally counter that can be used to admit a limited number of people. First, the limit is set with a call  
   `public void setLimit(int maximum)`  
   If the click button is clicked more often than the limit, it has no effect. (Hint: The call `Math.min(n, limit)` returns n if n is less than limit, and limit otherwise.)

4. Write a class `RangeInput` that allows users to enter a value within a range of values that is provided in the constructor. An example would be a temperature control switch in a car that allows inputs between 60 and 80 degrees Fahrenheit. The input control has “up” and “down” buttons. Provide up and down methods to change the current value. The initial value is the midpoint between the limits. As with the preceding exercises, use `Math.min` and `Math.max` to limit the value. Write a sample program that simulates clicks on controls for the passenger and driver seats.

5. Simulate a circuit for controlling a hallway light that has switches at both ends of the hallway. Each switch can be up or down, and the light can be on or off. Toggling either switch turns the lamp on or off.
   Provide methods

   ```java
   public int getFirstSwitchState() // 0 for down, 1 for up public int getSecondSwitchState()
   public int getLampState() // 0 for off, 1 for on public void toggleFirstSwitch()
   public void toggleSecondSwitch()
   ```

6. (TEST) Write a `CircuitTester` class that tests all switch combinations, printing out actual and expected states for the switches and lamps.

7. Change the method headers of the circuit class so that it has the following methods:  
   
   ```java
   public int getSwitchState(int switchNum)
   public int getLampState()
   public void toggleSwitch(int switchNum)  
   ```  
   Provide an implementation using only language features that have been introduced. The challenge is to find a data representation from which to recover the switch states.

8. Write a program that displays the properties of a letter-size (8.5 × 11 inches) sheet of
paper in millimeters. There are 25.4 millimeters per inch. The program should print:  
   • The width and height  
   • The perimeter  
   • The length of the diagonal  
   Use constants and comments in your program.

9. Write a program that reads a number and displays the square, cube, and fourth
power. Use the `Math.pow` method only for the fourth power.

10. Write a program that prompts the user for two integers and then prints  
    • The sum  
    • The difference  
    • The product  
    • The average  
    • The distance (absolute value of the difference)  
    • The maximum (the larger of the two)  
    • The minimum (the smaller of the two)  
    *Hint:* The max and min functions are declared in the Math class.

[Back to Top](#top)

### CodeCheck Questions
1. Change the `withdraw` method of the `BankAccount` class so that a charge of Rs. 1.00 is deducted for each withdrawal. Observe the given code of `BankAccount` and `BankAccountTester` classes and trace the code manually to find out how they are working. Once you are clear with it, then try attempting the solution to the question  

   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-class-101)

2. Change the withdraw method of the `BankAccount` class so that a charge of Rs. 1.00 is deducted for each withdrawal.  

   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-class-101)

3. Change the `deposit` and `withdraw` methods of the `BankAccount` class so that a count of transactions is updated. For example, if you construct a bank account and invoke deposit once and withdraw twice, calling getTransactionCount should return 3.

   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-class-102)

4. Implement a BankAccount that pays a bonus of Rs. 10 for each new account.

   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-class-103)

5. Implement a class `ClassSchedule` with a title (a string), days the class meets (a string), a start meeting time (a string), an end meeting time (a string) and a class room (a string)  
   Provide a constructor and these methods:  

   ```java
   public String getTitle()
   public String getTime()
   public String getRoom()
   ```
   These methods return the class title, the time period in the form days start time-end time, and class room. An example time is: MWF 9:00-9:50

   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-class-104)

6. A `ClassSchedule` class has been designed to represent a class that is scheduled at given days and times. Sometimes class schedule days or times must be changed. Expand the `ClassSchedule` class to include methods to allow new values for days, start times and end times

   ```java
   public void setDays(String meetingDays)
   public void setStartTime(String startTime)
   public void setEndTime(String endTime)
   ```

   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-class-105)

7. Your task is to write a tester class for the `ClassSchedule` class given below. You should test the getTime and setStartTime methods of the `ClassSchedule` class.

   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-class-106)

[Back to Top](#top)

### Medium Level Code Writing Questions
1. Suppose you want to implement a class `TimeDepositAccount`. A time deposit account has a fixed interest rate that should be set in the constructor, together with the initial balance. Provide a method to get the current balance. Provide a method to add the earned interest to the account. This method should have no arguments because the interest rate is already known. It should have no return value because you already provided a method for obtaining the current balance. It is not possible to deposit additional funds into this account. Provide a withdraw method that removes the entire balance. Partial withdrawals are not allowed.

2. (TEST) Write a `BankAccountTester` class whose main method constructs a bank account, deposits 1,000, withdraws 500, withdraws another 400, and then prints the remaining
balance. Also print the expected result.

   [Refer to the BankAccount class here](https://codecheck.io/files/wiley/codecheck-bj-4-class-101)

3. Add a method  
   `public void addInterest(double rate)`  
   to the `BankAccount` class that adds interest at the given rate. For example, after the statements  

   ```java
   BankAccount momsSavings = new BankAccount(1000); 
   momsSavings.addInterest(10); // 10 percent interest
   ```  

   the balance in momsSavings is 1,100. Also supply a BankAccountTester class that prints the actual and expected balance.

4. Write a class `SavingsAccount` that is similar to the `BankAccount` class, except that it has an added instance variable `interest`. Supply a constructor that sets both the initial balance and the interest rate. Supply a method `addInterest` (with no explicit parameter) that adds interest to the account. Write a `SavingsAccountTester` class that constructs a savings account with an initial balance of 1,000 and an interest rate of 10 percent. Then apply the `addInterest` method and print the resulting balance. Also compute the expected result by hand and print it.

5. Consider the following class, `CashRegister`:

   ```java
   /**
      A cash register totals up sales and computes change due.
   */
   public class CashRegister {
      private double purchase; 
      private double payment;
      /**
         Constructs a cash register with no money in it.
      */ 
      public CashRegister() {

      }
      /**
         Records the sale of an item. 
         @param amount the price of the item
      */ 
      public void recordPurchase(double amount) {
         purchase = purchase + amount;
      }
      /**
         Processes a payment received from the customer. 
         @param amount the amount of the payment
      */ 
      public void receivePayment(double amount) {
         payment = payment + amount;
      }
      /**
         Computes the change due and resets the machine for the next customer. 
         @return the change due to the customer
      */
      public double giveChange() {
         double change = payment - purchase; 
         purchase = 0;
         payment = 0; 
         return change;
      }
   }
   ```

   Add a method `printReceipt` to the `CashRegister` class. The method should print the prices of all purchased items and the total amount due. *Hint:* You will need to form a string of all prices. Use the concat method of the `String` class to add additional items to that string. To turn a price into a string, use the call `String.valueOf(price)`.

6. After closing time, the store manager would like to know how much business was transacted during the day. Modify the `CashRegister` class to enable this functionality. Supply methods `getSalesTotal` and `getSalesCount` to get the total amount of all sales and the number of sales. Supply a method `reset` that resets any counters and totals so that the next day’s sales start from zero.

7. Implement a class `Employee`. An employee has a `name` (a string) and a `salary` (a double). Provide a constructor with two arguments  
   `public Employee(String employeeName, double currentSalary)`  
   and methods  
   `public String getName()`  
   `public double getSalary()`  
   `public void raiseSalary(double byPercent)`  
   These methods return the name and salary, and raise the employee’s salary by a certain percentage. Sample usage:  
   `Employee harry = new Employee("Hacker, Harry", 50000);`  
   `harry.raiseSalary(10); // Harry gets a 10 percent raise`  
   Supply an `EmployeeTester` class that tests all methods.

8. Implement a class `Product`. A product has a name and a price, for example `new Product("Toaster", 29.95)`. Supply methods `getName`, `getPrice`, and `reducePrice`. Supply a program `ProductPrinter` that makes two products, prints each name and price, reduces their prices by 5.00, and then prints the prices again.

9. What does the following method do? Give an example of how you can call the method.

   ```java
   public class BankAccount {
      public void mystery(BankAccount that, double amount) {
         this.balance = this.balance - amount; 
         that.balance = that.balance + amount;
      }
      . . . // other BankAccount methods
   }
   ```

   <details markdown="block">
     <summary>Answer</summary>
     `BankAccount account1 = new BankAccount();`  
     `BankAccount account2 = new BankAccount();`  
     `account1.mystery(account2, 2000);`
   </details>

[Back to Top](#top)

<!-- ### Medium CodeCheck Questions

1. The "elite hackers" like to make their text look cool by replacing characters with similar-looking symbols: e becomes 3, i becomes 1, l becomes 7, and o becomes 0. Write a program to carry out these replacements with a sample string.  
   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-object-101)

2. 

[Back to Top](#top) -->

<!-- ### Hard Level Code Writing Questions
1. 

[Back to Top](#top) -->
