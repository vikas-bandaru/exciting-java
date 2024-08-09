---
layout: default
title: Self Check
parent: Class Definitions
nav_order: 1
grand_parent: Test Yourself
---

# Check Your Understanding
## Defining Classes

<!-- <details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. [Easy Level Code Writing Questions](#easy-level-code-writing-questions)
   {:toc}
2. [Medium Level Code Writing Questions](#medium-level-code-writing-questions)
   {:toc}
3. [Hard Level Code Writing Questions](#hard-level-code-writing-questions)
   {:toc}
</details> -->

1. What is encapsulation? Why is it useful?

2. Instance variables are a part of the hidden implementation of a class, but they aren’t
actually hidden from programmers who have the source code of the class. Explain to what extent the private reserved word provides information hiding.

3. Consider a class `Grade` that represents a letter grade, such as A+ or B. Give two
choices of instance variables that can be used for implementing the `Grade` class.

4. Consider a class `Time` that represents a point in time, such as 9 a.m. or 3:30 p.m.
Give two different sets of instance variables that can be used for implementing the `Time` class.

5. Show that the BankAccount(double initialBalance) constructor is not strictly necessary.
That is, if we removed that constructor from the public interface, how could a programmer still obtain BankAccount objects with an arbitrary balance?  
    Conversely, could we keep only the BankAccount(double initialBalance) constructor and remove the BankAccount() constructor?

6. What is the this reference? Why would you use it?

7. Which of the methods in the `CashRegister` class are accessor methods? Which are mutator methods?

8. Write declarations for storing the following quantities. Choose between integers and
floating-point numbers. Declare constants when appropriate.  
   a. The number of days per week  
   b. The number of days until the end of the semester  
   c. The number of centimeters in an inch
   d. The height of the tallest person in your class, in centimeters

9. What is the value of `mystery` after this sequence of statements?

   ```java
   int mystery = 1;  
   mystery = 1 - 2 * mystery;  
   mystery = mystery + 1;
   ```

10. What is wrong with the following sequence of statements?  

   ```java
   int mystery = 1;
   mystery = mystery + 1; 
   int mystery = 1 - 2 * mystery; 
   ```
   
11. Write the following Java expressions in mathematical notation.  
    a. dm = m * (Math.sqrt(1 + v / c) / Math.sqrt(1 - v / c) - 1);  
    b. volume = Math.PI * r * r * h;  
    c. volume = 4 * Math.PI * Math.pow(r, 3) / 3;  
    d. z = Math.sqrt(x * x + y * y);

12. What are the values of the following expressions? In each line, assume that  

    ```java
    double x = 2.5;
    double y = -1.5;  
    int m = 18;
    int n = 4; 
    ```
    
    a. x + n * y - (x + n) * y  
    b. m / n + m % n
    c. 5 * x - n / 5  
    d. 1 - (1 - (1 - (1 - (1 - n))))  
    e. Math.sqrt(Math.sqrt(n))

13. What are the values of the following expressions, assuming that n is 17 and m is 18?

    a. n / 10 + n % 10  
    b. n % 2 + m % 2  
    c. (m + n) / 2  
    d. (m + n) / 2.0  
    e. (int) (0.5 * (m + n))  
    f. (int) Math.round(0.5 * (m + n))
    
14. What are the values of the following expressions? In each line, assume that  

    ```java
    String s = "Hello";
    String t = "World"; 
    ```

    a. s.length() + t.length()  
    b. s.substring(1, 2)  
    c. s.substring(s.length() / 2, s.length())  
    d. s + t
    e. t + s

15. Given a string `s`, write expressions for:  
    • The string consisting of the first letter  
    • The string consisting of the first and last letter  
    • The string consisting of all but the first and last letter  
    • The first half of the string (discarding the middle letter if the string has odd length)
    • The second half of the string (discarding the middle letter if the string has odd length)
    • The string consisting of the middle letter if the string has odd length, or the middle two letters otherwise

16. Find at least five compile-time errors in the following program.  

    ```java
    public class HasErrors
    {
         public static void main();
         {
            System.out.print(Please enter two numbers:)  
            x = in.readDouble;
            y = in.readDouble; 
            System.out.printline("The sum is " + x + y);
         }
    }
    ```

17. Find three run-time errors in the following program.  

    ```java
    public class HasErrors
    {
         public static void main(String[] args) {
            Scanner in = new Scanner("System.in"); 
            System.out.print("Please enter an integer:"); 
            x = in.readInt();
            System.out.print("Please enter another integer: "); 
            x = in.readInt();
            System.out.println("The sum is " + x + y);
            int x = 0; int y = 0;
         }
    }
    ```

18. Consider the following code:  

    ```java
    CashRegister register = new CashRegister(); 
    register.recordPurchase(19.93);
    register.receivePayment(20, 0, 0, 0, 0); 
    System.out.print("Change: ");
    System.out.println(register.giveChange()); 
    ```

    The code segment prints the total as 0.07000000000000028. Explain why. Give a recommendation to improve the code so that users will not be confused.

19. Explain the differences between 2, 2.0, '2', "2", and "2.0".

20. Explain what each of the following program segments computes.
    a. x = 2;
       y = x + x;  
    b. s = "2";
       t = s + s;

[Back to Top](#top)

<!-- ### Medium Level Code Writing Questions
1. Write a program that initializes a string with "Mississippi". Then replace all "i" with "ii" and print the length of the resulting string. In that string, replace all "ss" with "s" and print the length of the resulting string.

2. 

[Back to Top](#top) -->

<!-- ### Hard Level Code Writing Questions
1. Write a program called `FourRectanglePrinter` that constructs a `Rectangle` object, prints its location by calling `System.out.println(box)`, and then translates and prints it three more times, so that, if the rectangles were drawn, they would form one large rectangle, as shown below. Your program will not produce a drawing. It will simply print the locations of the four rectangles.  
![Four Rectangle Box](../../../images/FourRectangleBox.png)

2. 

[Back to Top](#top) -->
