---
layout: default
title: Code Writing Questions
parent: Objects and Classes
nav_order: 4
grand_parent: Test Yourself
---

# Practice Questions (Code Writing)
## Soft Intro to Java with BlueJ (Objects & Classes)

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

1. Calculate the number of days a person lived given their birth and death dates:
   > ```java
   // Assume the person was born on January 1, 2000, and died on December 31, 2020.
   ```

   <details markdown="block">
     <summary>Answer</summary>
     The person lived for 7661 days.
   </details>

2. Write a line of code to declare a variable `temperature` and assign it a value of `36.6`.
   
   <details markdown="block">
     <summary>Answer</summary>
     double temperature = 36.6;
   </details>

3. Write a line of code to declare a `String` variable `greeting` and assign it the value `"Hello, World!"`.
   
   <details markdown="block">
     <summary>Answer</summary>
     String greeting = "Hello, World!";
   </details>

4. Given the following line of code:
   > ```java
   int score = 10;
   ```
   Write the line of code to assign the value `50` to `score`.
   
   <details markdown="block">
     <summary>Answer</summary>
     score = 50;
   </details>

12. Complete the code snippet to print the following result:
    > ```java
    +----------+
    |   Code   |
    +----------+
    public class NameInBox
    {
       public static void main(String[] args)
       {
          // TODO print Code in a box made from
          // characters - | +
       }
    }
    ```
    <details markdown="block">
      <summary>Answer</summary>
      ```java
      public class NameInBox
      {
         public static void main(String[] args)
         {
            System.out.println("+----------+");
            System.out.println("|   Code   |");
            System.out.println("+----------+");
         }
      }
      ```
    </details>

13. Write the code to construct a `Circle` with its center at `(150, 75)` and a radius of `25`. Assign it to a variable named `circle`. Use this construction parameters: (int x, int y, int radius)
    
    <details markdown="block">
      <summary>Answer</summary>
      Circle circle = new Circle(150, 75, 25);
    </details>

14. Write the code to construct a triangle with vertices at `(0, 0)`, `(10, 0)`, and `(5, 8.66)`. Assign it to a variable named `triangle`. Use this construction parameters: (int x1, int y1, int x2, int y2, int x3, int y3)
    
    <details markdown="block">
      <summary>Answer</summary>
      Triangle triangle = new Triangle(0, 0, 10, 0, 5, 8.66);
    </details>

1. Write a program that prints your name in large letters, such as  

   > ```
   *       *  *  *    *      *       * * * *
    *     *   *  *  *       * *     *
     *   *    *  *         *   *     * * * *
      * *     *  *  *     * * * *           *
       *      *  *    *  *       *   * * * * 
   ```

2. Write a program that prints your name in Morse code, like this:  
   > `...- .. -.- .- ...`  

   Use a separate call to `System.out.print` for each letter.

3. Write a program that prints a face similar to (but different from) the following:  
   > ```
     ///// 
    +"""""+ 
   (| o o |)
    |  ^  |
    | '-' |
    +-----+
   ```

4. Write a program that prints a house that looks exactly like the following:  

   > ```
      +
     + +
   +     + 
   +-----+ 
   | .-. | 
   | | | |
   +-+-+-+
   ```

5. Write a program that prints an animal speaking a greeting, similar to (but different from) the following:  
   > ```
    /\_/\       -----
   ( ' ' )    / Hello \ 
   (  -  )   < Junior  | 
    | | |     \ Coder!/ 
   (__|__)      -----
   ```

6. Write a program that prints three items, such as the names of your three best friends or favorite movies, on three separate lines.

7. Write a program that prints India flag, using special symbols you find on your keyboard.

8. Type in and run the following program. Then modify it to show the message “Hello, your name!”.
   > ```
   import javax.swing.JOptionPane;
   public class DialogViewer {
      public static void main(String[] args) {
         JOptionPane.showMessageDialog(null, "Hello, World!");
      } 
   }
   ```

9. Write a program that prints a two-column list of your friends’ birthdays. In the first column, print the names of your best friends; in the second, print their birthdays.

### CodeCheck Questions
1. Complete the program below to print out a filled triangle four lines high. In other words, the output of this program should match the following, exactly:  
   ```
        x
       xxx
      xxxxx
     xxxxxxx
   ```  
   [Solve it here](https://codecheck.io/files/wiley/codecheck-bjlo-1-intro-103)

2. Complete the program below, named Staircase.java, to print out a set of stairs, five stairs high. In other words, the output of this program should match the following, exactly:
   ```
     ____
     I__I___
     I_____I___
     I________I___
     I___________I___
     I______________I___
   ```  
   Use the underscore character (_) and the uppercase I.  
   [Solve it here](https://codecheck.io/files/wiley/codecheck-bjlo-1-intro-104)

3. Complete the program below to print out a parallelogram, with the word Parallelogram in the middle of it. In other words, the output of this program should match the following, exactly:
   ```
         ______________________
        /                     /
       /    Parallelogram    /
      /                     /
     /_____________________/
   ```  
   Hint: Use the underscore character (_) and the slash character (/) on the American keyboard.  
   [Solve it here](https://codecheck.io/files/wiley/codecheck-bjlo-1-intro-105)

4. Complete the program below, named TreeBush.java, to print out the child-like picture of a tree and bush below. The output of this program should match the following, exactly:
   ```
           o
         oooo
       ooooooo
       oooooooo
        ooIIo o       ooo
        o II         oooooo
     _____II_________ oooo____
   ```
   Use lowercase o, uppercase I, and the underscore character.  
   [Solve it here](https://codecheck.io/files/wiley/codecheck-bjlo-1-intro-106)

5. Complete the program below to print out the last three lines of a poem by Robert Frost.
   ```
   Two roads diverged in a wood, and I --
   I took the one less traveled by,
   And that has made all the difference.
       by Robert Frost
   ```
   [Solve it here](https://codecheck.io/files/wiley/codecheck-bjlo-1-intro-107)

6. Complete the program below to print out the following four-line poem.
   ```
   Peter Piper picked a peck of pickled peppers.
   A peck of pickled peppers, Peter Piper picked.
   If Peter picked a peck of pickled peppers,
   Where's the peck of pickled peppers Peter Piper picked?
   ```
   [Solve it here](https://codecheck.io/files/wiley/codecheck-bjlo-1-intro-108)

7. Complete the program below to print out the following text from an algebra text:
   ```
   Given: f(x) = 3x - 15
   Let x = 4
   Then
     f(4) = 3x4 - 15
          = 12 - 15
          = -3
   ```
   Be careful to match the spacing as given.
   [Solve it here](https://codecheck.io/files/wiley/codecheck-bjlo-1-intro-109)

8. Complete the program below to print out the following multiplication table:
   ```
       y | 1y | 2y | 3y | 4y | 5y 
     ----|----|----|----|----|----
       1 |  1 |  2 |  3 |  4 |  5
       2 |  2 |  4 |  6 |  8 | 10
       3 |  3 |  6 |  9 | 12 | 15
       4 |  4 |  8 | 12 | 16 | 20
       5 |  5 | 10 | 15 | 20 | 25
       6 |  6 | 12 | 18 | 24 | 30
       7 |  7 | 14 | 21 | 28 | 35
       8 |  8 | 16 | 24 | 32 | 40
       9 |  9 | 18 | 27 | 36 | 45
      10 | 10 | 20 | 30 | 40 | 50
   ```
   Be careful to match the spacing as given.  
   [Solve it here](https://codecheck.io/files/wiley/codecheck-bjlo-1-intro-110)

9. Complete the program below so that it computes the area of a rectangle and then prints it out.  
   Both the height and width of the rectangle are provided as variables in the program.  
   [Solve it here](https://codecheck.io/files/wiley/codecheck-bjlo-1-fundat-101)

10. Complete the program below so that it prompts for a string and an integer n, that is no larger than the length of the string, and then prints out the last n characters of that string. For example, given the input string, "Hello, World!" along with the integer 5, the output should be  
    ```java
    orld!
    ```
    [Solve it here](https://codecheck.io/files/wiley/codecheck-bjlo-1-fundat-104)  

11. Complete the program below so that it prompts for an initial amount of money (present value or PV) to deposit into a certificate of deposit (CD), the interest rate (INT) for the CD and the number of years (YRS) the CD will grow (until maturity). Compute and print out the future value of the CD after the given number of years has passed. You should use the following formula for future value (FV):  
    ![cd-formula](../../../images/codecheck/cd-formula.png)  
    Use the `Math.pow()` method.  
    While the number of years may be an integer, both the amount of money to be deposited and the interest rate should be double variables. The result (FV) should be printed out to two decimal places.  
    [Solve it here](https://codecheck.io/files/wiley/codecheck-bjlo-1-fundat-106)  

12. When you work with angle measurements, you often want them normalized or converted into the range between 0 . . . 359 degrees. Complete the program below, named Angles.java, so that it reads an angle of any size (positive or negative) and normalizes it. For example, the input of 380 should print 20, and the input of -30 should print 330.  
    [Solve it here](https://codecheck.io/files/wiley/codecheck-bjlo-1-fundat-108)  

13. Complete the program below, named Initials.java, to read in a first name, a middle name, and a last name, and then print out the three initials as a single string. For example, if the three input names are `James`, `Paul`, and `Jones`, then the output should be `JPJ`.  
    [Solve it here](https://codecheck.io/files/wiley/codecheck-bjlo-1-fundat-109)  

14. Complete the program below so that it prompts for a string of characters, prints out the last character of the string, followed by the first character of the string, followed the three middle characters of the string. You may assume that all the inputs string are of odd length and have at least five characters.  
    For example, if the user enters the string aforesaid, you should print  
    ```java
    dares  
    ```
    [Solve it here](https://codecheck.io/files/wiley/codecheck-bjlo-1-fundat-105)  

15. Complete the following program that computes the length of a line segment with end points `(x1, y1)` and `(x2, y2)`. According to the Pythagorean theorem, the length is `√ [(x1 - x2)2 + (y1 - y2)2]`. Use the Math.sqrt() method to compute the square root.  
    [Solve it here](https://codecheck.io/files/wiley/codecheck-bjlo-1-fundat-103)  

16. Your task is to write a program that prompts the user for the width and the height of a rectangle and then prints the area of that rectangle.  
    [Solve it here](https://codecheck.io/files/wiley/codecheck-bjlo-1-fundat-102)  

17. Complete the initials method in the class below. For example, the call initials("Harry", "Joseph", "Hacker") should return the string "HJH".  
    [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-fundat-104)  

18. The following timer class measures the total time that has elapsed after timing a number of events. Your job is to implement the add method so that it correctly updates the hours and minutes fields. For example, consider this sequence of statements:  
    ```java
    Timer t = new Timer();
    t.add(40); // 40 minutes
    t.add(50); // another 50 minutes
    System.out.println(t.getTotal()); // prints 1:30, one hour and 30 minutes  
    ```
    [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-fundat-105)  

19. Latitude and longitude are measured in degrees, minutes and seconds. As with time measurements, there are 60 seconds to a minute, and 60 minutes to a degree. Many GIS (Geographical Information System) programs express latitude and longitude in degrees only, with the minutes and seconds converted to fractional degrees. For example,  
    `Latitude 40°15'30" can also be expressed as Latitude 40.25833333333333`  
    Implement a method decimalDegrees to carry out this conversion. Note that degrees may be negative. Use the Math class method abs when computing the decimal degrees. Use the Math class method signum as a multiplier so that the decimal degrees have the same sign as the degrees.  
    [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-fundat-106)  

20. Latitude and longitude can be expressed in the form of decimal degrees. Another form, often used on maps, is degrees, minutes and seconds. An example is:  
    `Latitude 40.25833 written as Latitude 40°15'30"`  
    As with time measurements, there are 60 seconds in a minute and 60 minutes in a degree.  
    Implement a method convert that converts decimal degrees to a String with degrees, minutes and seconds in the form xxx°xx"xx.xx'. Seconds may have a fractional part. The unicode character '\u00B0' is the degree symbol.  
    [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-fundat-107)  

21. A position on the planet Earth is specified by latitude and longitude (in degrees). The distance between two points on a sphere can be calculated with the following formula, where latitude and longitude are in radians and r is the radius of the sphere:  
    `distance = r * arccos(sin(latitude1) * sin(latitude2) + cos(latitude1) * cos(latitude2) * cos(longitude1 - longitude2))`  
    The radius of the planet Earth is 6371 km  
    Your task is to compute the distance between two Location objects.  
    [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-fundat-108)  

22. Write a method getLastFirst whose parameter is a string containing a name such as `"Harry Smith"` and that returns a string with the last name followed by a comma and the first name, like this: `"Smith, Harry"`    
    [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-fundat-109)  

23. Fred fills out his time sheet at work, but he needs to provide the number of minutes worked. He only knows the start and end times, given in hours and minutes. Help Fred by implementing the `minutesUntil` method below.  
    For example, if two Time objects are declared as  
    ```java
    Time start = new Time(13:11);  
    Time end = new Time(14:01);  
    ```  
    then the call `start.minutesUntil(end)` should return 50. There are 50 minutes between 13:11 and 14:01.  
    Be sure to handle the situation where Fred works the night shift. If  
    ```java
    start = new Time(23:11);  
    end = new Time(1:01);  
    ```
    then the call `start.minutesUntil(end)` should return 110.  
    [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-fundat-110)  

[Back to Top](#top)

### Medium Level Code Writing Questions
1. Write a program that initializes a string with "Mississippi". Then replace all "i" with "ii" and print the length of the resulting string. In that string, replace all "ss" with "s" and print the length of the resulting string.

2. Look into the API documentation of the `String` class and locate the `trim` method. Write a program demonstrating what it does. Then show how you can use the `replace` method to remove all spaces from a string.

3. (TEST) Write an `AreaTester` program that constructs a `Rectangle` object and then computes and prints its `area`. Use the `getWidth` and `getHeight` methods. Also print the expected answer.

4. (TEST) Write a `PerimeterTester` program that constructs a `Rectangle` object and then computes and prints its `perimeter`. Use the `getWidth` and `getHeight` methods. Also print the expected answer.

5. (TRICKY) Write a program that constructs a rectangle with area 42 and a rectangle with perim-
eter 42. Print the widths and heights of both rectangles.

6. (TEST) Look into the API documentation of the `Rectangle` class and locate the method void `add(int newx, int newy)`  
   Read through the method documentation. Then determine the result of the following statements:  
   `Rectangle box = new Rectangle(5, 10, 20, 30);`   
   `box.add(0, 0);`  

   Write a program `AddTester` that prints the expected and actual location, width, and height of box after the call to add.

7. (TEST) Write a program `ReplaceTester` that encodes a string by replacing all letters `"i"` with `"!"` and all letters `"s"` with `"$"`. Use the `replace` method. Demonstrate that you can correctly encode the string "Mississippi". Print both the actual and expected result.

8. Write a program `HollePrinter` that switches the letters `"e"` and `"o"` in a string. Use the replace method repeatedly. Demonstrate that the string `"Hello, World!"` turns into `"Holle, Werld!"`

9. (TEST) The `StringBuilder` class has a method for reversing a string. In a `ReverseTester` class, construct a `StringBuilder` from a given string (such as "desserts"), call the `reverse` method followed by the `toString` method, and print the result. Also print the expected value.

10. In the Java library, a color is specified by its red, green, and blue components between 0 and 255. Write a program `BrighterDemo` that constructs a `Color` object with red, green, and blue values of 50, 100, and 150. Then apply the `brighter` method of the Color class and print the red, green, and blue values of the resulting color. (You won’t actually see the color.)

11. Repeat above exercise, but apply the `darker` method of the `Color` class twice to the object `Color.RED`. Call your class `DarkerDemo`.

12. The `Random` class implements a random number generator, which produces sequences of numbers that appear to be random. To generate random integers, you construct an object of the `Random` class, and then apply the `nextInt` method. For example, the call `generator.nextInt(6)` gives you a random number between 0 and 5. Write a program `DieSimulator` that uses the `Random` class to simulate the cast of a die, printing a random number between 1 and 6 every time that the program is run.

13. Write a program `RandomPrice` that prints a random price between $10.00 and $19.95 every time the program is run.

14. (TEST) Look at the API of the `Point` class and find out how to construct a `Point` object. In a `PointTester` program, construct two points with coordinates (3, 4) and (–3, –4). Find the distance between them, using the `distance` method. Print the distance, as well as the expected value. (Draw a sketch on graph paper to find the value you will expect.)

15. Using the `Day` class, write a `DayTester` program that constructs a Day object representing today, adds ten days to it, and then computes the difference between that day and today. Print the difference and the expected value.

16. Using the `Picture` class, write a `HalfSizePicture` program that loads a picture and shows it at half the original size, centered in the window.

17. Using the `Picture` class, write a `DoubleSizePicture` program that loads a picture, doubles its size, and shows the center of the picture in the window.

[Back to Top](#top)

### Medium CodeCheck Questions

1. The "elite hackers" like to make their text look cool by replacing characters with similar-looking symbols: e becomes 3, i becomes 1, l becomes 7, and o becomes 0. Write a program to carry out these replacements with a sample string.  
   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-object-101)

2. Complete the following program to compute the average length of the words. Invoke the appropriate method to compute the length of each word, compute the sum of the five results, and divide by 5.0. (You will see in chapter 4 why you need to divide by 5.0 and not simply 5.)  
   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-object-102)

3. Your task is to construct a rectangle with area 51.  
   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-object-103)

4. Your task is to translate the rectangle box2 in the program below so that the intersection of box and box2 has area 100.  
   Hint: Draw a picture that shows the positions of box1 and box2. Then move box2 so that it overlaps with box1 in a 10 by 10 square.  
   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-object-104)

5. Your task is to draw a simple checkerboard pattern.  
   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-object-105)

6. A stronger password can be created by replacing characters with similar-looking symbols: e becomes 3, i becomes 1, a becomes @, and s becomes $.  
   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-object-107)

7. StringBuilder is another class that provides methods to manipulate strings. Look in the StringBuilder class API for information on the reverse method and use the method to reverse a sample string. Then use the toString method to obtain the string in the StringBuilder object.  
   [Solve it here](https://codecheck.io/files/wiley/codecheck-bj-4-object-108)

[Back to Top](#top)

### Hard Level Code Writing Questions
1. Write a program called `FourRectanglePrinter` that constructs a `Rectangle` object, prints its location by calling `System.out.println(box)`, and then translates and prints it three more times, so that, if the rectangles were drawn, they would form one large rectangle, as shown below. Your program will not produce a drawing. It will simply print the locations of the four rectangles.  
![Four Rectangle Box](../../../images/FourRectangleBox.png)

2. Write a `GrowSquarePrinter` program that constructs a `Rectangle` object square representing a square with top-left corner (100, 100) and side length 50, prints its location by calling `System.out.println(square)`, applies the translate and grow methods, and calls `System.out.println(square)` again. The calls to `translate` and `grow` should modify the square so that it has twice the size and the same top-left corner as the original. If the squares were drawn, they would look like the figure below. Your program will not produce a drawing. It will simply print the locations of square before and after calling the mutator methods. Look up the description of the `grow` method in the API documentation.  
![Grow Square Boxes](../../../images/GrowSquarePrinter.png)

3.  Write a `CenteredSquaresPrinter` program that constructs a `Rectangle` object square representing a square with top-left corner (100, 100) and side length 200, prints its location by calling `System.out.println(square)`, applies the grow and translate methods, and calls `System.out.println(square)` again. The calls to `grow` and `translate` should modify the square so that it has half the width and is centered in the original square. If the squares were drawn, they would look like the figure below. Your program will not produce a drawing. It will simply print the locations of square before and after calling the mutator methods. Look up the description of the grow method in the API documentation.  
![Centered Square Boxes](../../../images/CenteredSquaresPrinter.png)

4. The `BigInteger` class represents integer numbers with an arbitrary number of digits. (As you will see later, the `int` type cannot express very large integers.) You can construct a `BigInteger` object by providing a string of its digits, such as  
   > `BigInteger a = new BigInteger("12345678987654321");`  

   Write a program that prints the square, fourth power, and eighth power of a, using one of the methods of the BigInteger class.

5. Write a program `LotteryPrinter` that picks a combination in a lottery. In this lottery, players can choose 6 numbers (possibly repeated) between 1 and 49. Construct an object of the `Random` class and invoke an appropriate method to generate each number. (In a real lot tery, repetitions aren’t allowed, but we haven’t yet discussed the programming con structs that would be required to deal with that problem.) program should print out a sentence such as “Play this combination—it’ll make you rich!”, followed by a lottery combination.

6. Using the `Day` class, write a program that generates a `Day` object representing February 28 of this year, and three more such objects that represent February 28 of the next three years. Advance each object by one day, and print each object. Also print the expected values:  
   > ```
   2019-02-29  
   Expected: 2019-02-29  
   2020-03-01  
   Expected: 2020-03-01  
   . . .
   ```

7. The `GregorianCalendar` class describes a point in time, as measured by the Gregorian calendar, the standard calendar that is commonly used throughout the world today. You construct a GregorianCalendar object from a year, month, and day of the month, like this:  
   > ```java
   GregorianCalendar cal = new GregorianCalendar(); // Today’s date 
   GregorianCalendar eckertsBirthday = new GregorianCalendar(1919, Calendar.APRIL, 9);
   ```

   Use the values `Calendar.JANUARY . . . Calendar.DECEMBER` to specify the month. The add method can be used to add a number of days to a `GregorianCalendar` object:  
   `cal.add(Calendar.DAY_OF_MONTH, 10); // Now cal is ten days from today`  
   This is a mutator method — it changes the cal object.  
   The `get` method can be used to query a given `GregorianCalendar` object:  
   > ```java
   int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);  
   int month = cal.get(Calendar.MONTH);  
   int year = cal.get(Calendar.YEAR);  
   int weekday = cal.get(Calendar.DAY_OF_WEEK); // 1 is Sunday, 2 is Monday, . . . , 7 is Saturday  
   ```

   Your task is to write a program that prints:  
   - The date and weekday that is 100 days from today. 
   - The weekday of your birthday. 
   - The date that is 10,000 days from your birthday.  
   
   Use the birthday of a computer scientist if you don’t want to reveal your own.  
   *Hint:* The `GregorianCalendar` class is complex, and it is a really good idea to write a few test programs to explore the API before tackling the whole problem.  
   Start with a program that constructs today’s date, adds ten days, and prints out the day of the month and the weekday.

8. The `LocalDate` class describes a calendar date that does not depend on a location or time zone. You construct a date like this:  
   > ```java
   LocalDate today = LocalDate.now(); // Today’s date  
   LocalDate eckertsBirthday = LocalDate.of(1919, 4, 9);  
   ```

   The `plusDays` method can be used to add a number of days to a `LocalDate` object:  
   > `LocalDate later = today.plusDays(10); // Ten days from today`  

   This method does not mutate the `today` object, but it returns a new object that is a given number of days away from `today`. To get the year of a day, call  
   > `int year = today.getYear();`  

   To get the weekday of a LocalDate, call  
   > `String weekday = today.getDayOfWeek().toString();`  

   Your task is to write a program that prints 
   - The weekday of “Pi day”, that is, March 14, of the current year. 
   - The date and weekday of “Programmer’s day” in the current year; that is, the 256th day of the year. (The number 256, or 28, is useful for some programming tasks.)
   - The date and weekday of the date that is 10,000 days earlier than today.

9. (TEST) Write a program `LineDistanceTester` that constructs a line joining the points (100, 100) and (200, 200), then constructs points (100, 200), (150, 150), and (250, 50). Print the distance from the line to each of the three points, using the `ptSegDist` method of the `Line2D` class. Also print the expected values. (Draw a sketch on graph paper to find what values you expect.)

[Back to Top](#top)
