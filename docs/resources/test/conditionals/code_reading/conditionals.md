---
layout: default
title: Code Snippets MCQs
parent: Decisions
nav_order: 3
grand_parent: Test Yourself
---

# Code Snippets-based MCQs
## Making Decisions (Conditionals)

<details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. [Easy Level MCQs](#easy-level-mcqs)
   {:toc}
2. [Slightly harder MCQs](#slightly-harder-mcqs)
   {:toc}
2. [Tricky MCQs](#tricky-mcqs)
   {:toc}
</details>

### Easy Level MCQs

1. **What will be the output of the following code?**

   ```java
   int num = 5;
   if (num > 0) {
       System.out.println("Positive");
   }
   ```
   <form>
     <input type="radio" name="q1" value="a"> Positive<br>
     <input type="radio" name="q1" value="b"> Negative<br>
     <input type="radio" name="q1" value="c"> 0<br>
     <input type="radio" name="q1" value="d"> Compilation error
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     Positive
   </details>

2. **What will be the output of the following code?**

   ```java
   int num = -3;
   if (num > 0) {
       System.out.println("Positive");
   } else {
       System.out.println("Non-positive");
   }
   ```
   <form>
     <input type="radio" name="q2" value="a"> Positive<br>
     <input type="radio" name="q2" value="b"> Non-positive<br>
     <input type="radio" name="q2" value="c"> 0<br>
     <input type="radio" name="q2" value="d"> Compilation error
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     Non-positive
   </details>

3. **What will be the output of the following code?**

   ```java
   int a = 10;
   int b = 20;
   if (a > b) {
       System.out.println("a is greater");
   } else {
       System.out.println("b is greater");
   }
   ```
   <form>
     <input type="radio" name="q3" value="a"> a is greater<br>
     <input type="radio" name="q3" value="b"> b is greater<br>
     <input type="radio" name="q3" value="c"> a is equal to b<br>
     <input type="radio" name="q3" value="d"> Compilation error
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     b is greater
   </details>

4. **What will be the output of the following code?**

   ```java
   int num = 10;
   if (num % 2 == 0) {
       System.out.println("Even");
   } else {
       System.out.println("Odd");
   }
   ```
   <form>
     <input type="radio" name="q4" value="a"> Even<br>
     <input type="radio" name="q4" value="b"> Odd<br>
     <input type="radio" name="q4" value="c"> None<br>
     <input type="radio" name="q4" value="d"> Compilation error
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     Even
   </details>

5. **What will be the output of the following code?**

   ```java
   int num = 7;
   if (num % 2 == 0) {
       System.out.println("Even");
   } else {
       System.out.println("Odd");
   }
   ```
   <form>
     <input type="radio" name="q5" value="a"> Even<br>
     <input type="radio" name="q5" value="b"> Odd<br>
     <input type="radio" name="q5" value="c"> None<br>
     <input type="radio" name="q5" value="d"> Compilation error
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     Odd
   </details>

6. **What will be the output of the following code?**

   ```java
   int a = 15;
   int b = 15;
   if (a == b) {
       System.out.println("Equal");
   } else {
       System.out.println("Not Equal");
   }
   ```
   <form>
     <input type="radio" name="q6" value="a"> Equal<br>
     <input type="radio" name="q6" value="b"> Not Equal<br>
     <input type="radio" name="q6" value="c"> Greater<br>
     <input type="radio" name="q6" value="d"> Compilation error
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     Equal
   </details>

7. **What will be the output of the following code?**

   ```java
   int age = 18;
   if (age >= 18) {
       System.out.println("Adult");
   } else {
       System.out.println("Minor");
   }
   ```
   <form>
     <input type="radio" name="q7" value="a"> Adult<br>
     <input type="radio" name="q7" value="b"> Minor<br>
     <input type="radio" name="q7" value="c"> Senior<br>
     <input type="radio" name="q7" value="d"> Compilation error
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     Adult
   </details>

8. **What will be the output of the following code?**

   ```java
   int a = 5;
   if (a < 0) {
       System.out.println("Negative");
   } else if (a > 0) {
       System.out.println("Positive");
   } else {
       System.out.println("Zero");
   }
   ```
   <form>
     <input type="radio" name="q8" value="a"> Negative<br>
     <input type="radio" name="q8" value="b"> Positive<br>
     <input type="radio" name="q8" value="c"> Zero<br>
     <input type="radio" name="q8" value="d"> Compilation error
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     Positive
   </details>

9. **What will be the output of the following code?**

   ```java
   int score = 75;
   if (score >= 90) {
       System.out.println("A");
   } else if (score >= 80) {
       System.out.println("B");
   } else if (score >= 70) {
       System.out.println("C");
   } else {
       System.out.println("D");
   }
   ```
   <form>
     <input type="radio" name="q9" value="a"> A<br>
     <input type="radio" name="q9" value="b"> B<br>
     <input type="radio" name="q9" value="c"> C<br>
     <input type="radio" name="q9" value="d"> D
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     C
   </details>

10. **What will be the output of the following code?**

    ```java
    int day = 3;
    switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        default:
            System.out.println("Other");
            break;
    }
    ```
    <form>
      <input type="radio" name="q10" value="a"> Monday<br>
      <input type="radio" name="q10" value="b"> Tuesday<br>
      <input type="radio" name="q10" value="c"> Wednesday<br>
      <input type="radio" name="q10" value="d"> Other
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Wednesday
    </details>

11. **What will be the output of the following code?**

    ```java
    int day = 5;
    switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        default:
            System.out.println("Other");
            break;
    }
    ```
    <form>
      <input type="radio" name="q11" value="a"> Monday<br>
      <input type="radio" name="q11" value="b"> Thursday<br>
      <input type="radio" name="q11" value="c"> Friday<br>
      <input type="radio" name="q11" value="d"> Other
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Friday
    </details>

12. **What will be the output of the following code?**

    ```java
    int a = 8;
    int b = 3;
    if (a > b && a > 0) {
        System.out.println("a is greater and positive");
    } else {
        System.out.println("Condition not met");
    }
    ```
    <form>
      <input type="radio" name="q12" value="a"> a is greater and positive<br>
      <input type="radio" name="q12" value="b"> Condition not met<br>
      <input type="radio" name="q12" value="c"> a is greater but not positive<br>
      <input type="radio" name="q12" value="d"> Compilation error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      a is greater and positive
    </details>

13. **What will be the output of the following code?**

    ```java
    int a = -5;
    if (a < 0 || a == 0) {
        System.out.println("Non-positive number");
    } else {
        System.out.println("Positive number");
    }
    ```
    <form>
      <input type="radio" name="q13" value="a"> Non-positive number<br>
      <input type="radio" name="q13" value="b"> Positive number<br>
      <input type="radio" name="q13" value="c"> Zero<br>
      <input type="radio" name="q13" value="d"> Compilation error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Non-positive number
    </details>

14. **What will be the output of the following code?**

    ```java
    int num = 0;
    if (num > 0) {
        System.out.println("Positive");
    } else if (num < 0) {
        System.out.println("Negative");
    } else {
        System.out.println("Zero");
    }
    ```
    <form>
      <input type="radio" name="q14" value="a"> Positive<br>
      <input type="radio" name="q14" value="b"> Negative<br>
      <input type="radio" name="q14" value="c"> Zero<br>
      <input type="radio" name="q14" value="d"> Compilation error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Zero
    </details>

15. **What will be the output of the following code?**

    ```java
    int x = 10;
    int y = 20;
    if (x > y) {
        System.out.println("x is greater");
    } else if (x < y) {
        System.out.println("y is greater");
    } else {
        System.out.println("x and y are equal");
    }
    ```
    <form>
      <input type="radio" name="q15" value="a"> x is greater<br>
      <input type="radio" name="q15" value="b"> y is greater<br>
      <input type="radio" name="q15" value="c"> x and y are equal<br>
      <input type="radio" name="q15" value="d"> Compilation error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      y is greater
    </details>

16. **What will be the output of the following code?**

    ```java
    int month = 4;
    switch (month) {
        case 1:
            System.out.println("January");
            break;
        case 2:
            System.out.println("February");
            break;
        case 3:
            System.out.println("March");
            break;
        case 4:
            System.out.println("April");
            break;
        default:
            System.out.println("Other");
            break;
    }
    ```
    <form>
      <input type="radio" name="q16" value="a"> January<br>
      <input type="radio" name="q16" value="b"> February<br>
      <input type="radio" name="q16" value="c"> April<br>
      <input type="radio" name="q16" value="d"> Other
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      April
    </details>

17. **What will be the output of the following code?**

    ```java
    int num = 15;
    if (num % 3 == 0) {
        System.out.println("Divisible by 3");
    }
    if (num % 5 == 0) {
        System.out.println("Divisible by 5");
    }
    ```
    <form>
      <input type="radio" name="q17" value="a"> Divisible by 3<br>
      <input type="radio" name="q17" value="b"> Divisible by 5<br>
      <input type="radio" name="q17" value="c"> Divisible by 3<br>
      <input type="radio" name="q17" value="d"> Divisible by 3 and Divisible by 5
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Divisible by 3 and Divisible by 5
    </details>

18. **What will be the output of the following code?**

    ```java
    int a = 5;
    int b = 10;
    int max;
    if (a > b) {
        max = a;
    } else {
        max = b;
    }
    System.out.println(max);
    ```
    <form>
      <input type="radio" name="q18" value="a"> 5<br>
      <input type="radio" name="q18" value="b"> 10<br>
      <input type="radio" name="q18" value="c"> 0<br>
      <input type="radio" name="q18" value="d"> Compilation error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      10
    </details>

19. **What will be the output of the following code?**

    ```java
    int num = 6;
    if (num > 5) {
        if (num < 10) {
            System.out.println("Between 5 and 10");
        } else {
            System.out.println("10 or more");
        }
    } else {
        System.out.println("5 or less");
    }
    ```
    <form>
      <input type="radio" name="q19" value="a"> Between 5 and 10<br>
      <input type="radio" name="q19" value="b"> 10 or more<br>
      <input type="radio" name="q19" value="c"> 5 or less<br>
      <input type="radio" name="q19" value="d"> Compilation error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Between 5 and 10
    </details>

20. **What will be the output of the following code?**

    ```java
    int a = 12;
    if (a % 2 == 0) {
        if (a % 3 == 0) {
            System.out.println("Divisible by 2 and 3");
        } else {
            System.out.println("Divisible by 2 but not by 3");
        }
    } else {
        System.out.println("Not divisible by 2");
    }
    ```
    <form>
      <input type="radio" name="q20" value="a"> Divisible by 2 and 3<br>
      <input type="radio" name="q20" value="b"> Divisible by 2 but not by 3<br>
      <input type="radio" name="q20" value="c"> Not divisible by 2<br>
      <input type="radio" name="q20" value="d"> Compilation error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Divisible by 2 and 3
    </details>

21. **What will be the output of the following code?**

    ```java
    int num = 11;
    switch (num) {
        case 10:
            System.out.println("Ten");
            break;
        case 11:
            System.out.println("Eleven");
            break;
        case 12:
            System.out.println("Twelve");
            break;
        default:
            System.out.println("Other");
            break;
    }
    ```
    <form>
      <input type="radio" name="q21" value="a"> Ten<br>
      <input type="radio" name="q21" value="b"> Eleven<br>
      <input type="radio" name="q21" value="c"> Twelve<br>
      <input type="radio" name="q21" value="d"> Other
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Eleven
    </details>

22. **What will be the output of the following code?**

    ```java
    int month = 7;
    switch (month) {
        case 1:
        case 2:
        case 3:
            System.out.println("First Quarter");
            break;
        case 4:
        case 5:
        case 6:
            System.out.println("Second Quarter");
            break;
        case 7:
        case 8:
        case 9:
            System.out.println("Third Quarter");
            break;
        case 10:
        case 11:
        case 12:
            System.out.println("Fourth Quarter");
            break;
        default:
            System.out.println("Invalid Month");
            break;
    }
    ```
    <form>
      <input type="radio" name="q22" value="a"> First Quarter<br>
      <input type="radio" name="q22" value="b"> Second Quarter<br>
      <input type="radio" name="q22" value="c"> Third Quarter<br>
      <input type="radio" name="q22" value="d"> Fourth Quarter
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Third Quarter
    </details>

23. **What will be the output of the following code?**

    ```java
    int day = 5;
    switch (day) {
        case 1:
            System.out.println("Sunday");
            break;
        case 2:
            System.out.println("Monday");
            break;
        case 3:
            System.out.println("Tuesday");
            break;
        case 4:
            System.out.println("Wednesday");
            break;
        case 5:
            System.out.println("Thursday");
            break;
        default:
            System.out.println("Invalid day");
            break;
    }
    ```
    <form>
      <input type="radio" name="q23" value="a"> Sunday<br>
      <input type="radio" name="q23" value="b"> Tuesday<br>
      <input type="radio" name="q23" value="c"> Thursday<br>
      <input type="radio" name="q23" value="d"> Invalid day
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Thursday
    </details>

24. **What will be the output of the following code?**

    ```java
    int a = 4;
    int b = 2;
    if (a % b == 0) {
        System.out.println("a is divisible by b");
    } else {
        System.out.println("a is not divisible by b");
    }
    ```
    <form>
      <input type="radio" name="q24" value="a"> a is divisible by b<br>
      <input type="radio" name="q24" value="b"> a is not divisible by b<br>
      <input type="radio" name="q24" value="c"> Compilation error<br>
      <input type="radio" name="q24" value="d"> Runtime error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      a is divisible by b
    </details>

25. **What will be the output of the following code?**

    ```java
    int score = 85;
    if (score >= 90) {
        System.out.println("Grade A");
    } else if (score >= 80) {
        System.out.println("Grade B");
    } else if (score >= 70) {
        System.out.println("Grade C");
    } else if (score >= 60) {
        System.out.println("Grade D");
    } else {
        System.out.println("Grade F");
    }
    ```
    <form>
      <input type="radio" name="q25" value="a"> Grade A<br>
      <input type="radio" name="q25" value="b"> Grade B<br>
      <input type="radio" name="q25" value="c"> Grade C<br>
      <input type="radio" name="q25" value="d"> Grade D
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Grade B
    </details>

26. **What will be the output of the following code?**

    ```java
    int age = 16;
    if (age >= 18) {
        System.out.println("Eligible to vote");
    } else {
        System.out.println("Not eligible to vote");
    }
    ```
    <form>
      <input type="radio" name="q26" value="a"> Eligible to vote<br>
      <input type="radio" name="q26" value="b"> Not eligible to vote<br>
      <input type="radio" name="q26" value="c"> Compilation error<br>
      <input type="radio" name="q26" value="d"> Runtime error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Not eligible to vote
    </details>

27. **What will be the output of the following code?**

    ```java
    int number = 10;
    if (number > 0) {
        System.out.println("Positive");
    } else if (number < 0) {
        System.out.println("Negative");
    } else {
        System.out.println("Zero");
    }
    ```
    <form>
      <input type="radio" name="q27" value="a"> Positive<br>
      <input type="radio" name="q27" value="b"> Negative<br>
      <input type="radio" name="q27" value="c"> Zero<br>
      <input type="radio" name="q27" value="d"> Compilation error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Positive
    </details>

28. **What will be the output of the following code?**

    ```java
    int day = 3;
    switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        default:
            System.out.println("Weekend");
            break;
    }
    ```
    <form>
      <input type="radio" name="q28" value="a"> Monday<br>
      <input type="radio" name="q28" value="b"> Wednesday<br>
      <input type="radio" name="q28" value="c"> Friday<br>
      <input type="radio" name="q28" value="d"> Weekend
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Wednesday
    </details>

29. **What will be the output of the following code?**

    ```java
    int score = 45;
    if (score >= 50) {
        System.out.println("Pass");
    } else {
        System.out.println("Fail");
    }
    ```
    <form>
      <input type="radio" name="q29" value="a"> Pass<br>
      <input type="radio" name="q29" value="b"> Fail<br>
      <input type="radio" name="q29" value="c"> Compilation error<br>
      <input type="radio" name="q29" value="d"> Runtime error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Fail
    </details>

30. **What will be the output of the following code?**

    ```java
    int temperature = 30;
    if (temperature > 35) {
        System.out.println("Hot");
    } else if (temperature > 25) {
        System.out.println("Warm");
    } else {
        System.out.println("Cold");
    }
    ```
    <form>
      <input type="radio" name="q30" value="a"> Hot<br>
      <input type="radio" name="q30" value="b"> Warm<br>
      <input type="radio" name="q30" value="c"> Cold<br>
      <input type="radio" name="q30" value="d"> Compilation error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Warm
    </details>


[Back to Top](#top)

### Slightly harder MCQs

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

2. **What will be the output of the following code?**

    ```java
    class Animal {
        void sound() {
            System.out.println("Some sound");
        }
    }

    class Dog extends Animal {
        void sound() {
            System.out.println("Bark");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Animal animal = new Dog();
            if (animal instanceof Dog) {
                animal.sound();
            } else {
                System.out.println("Unknown sound");
            }
        }
    }
    ```
    <form>
      <input type="radio" name="q1" value="a"> Some sound<br>
      <input type="radio" name="q1" value="b"> Bark<br>
      <input type="radio" name="q1" value="c"> Unknown sound<br>
      <input type="radio" name="q1" value="d"> Compilation error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Bark
    </details>

2. **What will be the output of the following code?**

    ```java
    class Vehicle {
        String type;

        Vehicle(String type) {
            this.type = type;
        }

        void display() {
            System.out.println("Vehicle type: " + type);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Vehicle vehicle = new Vehicle("Car");
            if (vehicle.type.equals("Car")) {
                System.out.println("It's a car");
            } else {
                System.out.println("It's not a car");
            }
        }
    }
    ```
    <form>
      <input type="radio" name="q2" value="a"> Vehicle type: Car<br>
      <input type="radio" name="q2" value="b"> It's a car<br>
      <input type="radio" name="q2" value="c"> It's not a car<br>
      <input type="radio" name="q2" value="d"> Compilation error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      It's a car
    </details>

3. **What will be the output of the following code?**

    ```java
    class Rectangle {
        int width, height;

        Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        int area() {
            return width * height;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Rectangle rect = new Rectangle(5, 10);
            if (rect.area() > 50) {
                System.out.println("Large rectangle");
            } else {
                System.out.println("Small rectangle");
            }
        }
    }
    ```
    <form>
      <input type="radio" name="q3" value="a"> Large rectangle<br>
      <input type="radio" name="q3" value="b"> Small rectangle<br>
      <input type="radio" name="q3" value="c"> Compilation error<br>
      <input type="radio" name="q3" value="d"> Runtime error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Large rectangle
    </details>

4. **What will be the output of the following code?**

    ```java
    class Employee {
        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        void raiseSalary(double percentage) {
            salary += salary * (percentage / 100);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Employee emp = new Employee("John", 50000);
            emp.raiseSalary(10);
            if (emp.salary > 55000) {
                System.out.println("High salary");
            } else {
                System.out.println("Moderate salary");
            }
        }
    }
    ```
    <form>
      <input type="radio" name="q4" value="a"> High salary<br>
      <input type="radio" name="q4" value="b"> Moderate salary<br>
      <input type="radio" name="q4" value="c"> Compilation error<br>
      <input type="radio" name="q4" value="d"> Runtime error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Moderate salary
    </details>

5. **What will be the output of the following code?**

    ```java
    class Calculator {
        int add(int a, int b) {
            return a + b;
        }

        int multiply(int a, int b) {
            return a * b;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Calculator calc = new Calculator();
            int result = calc.add(5, 10) * calc.multiply(2, 3);
            if (result > 50) {
                System.out.println("High result");
            } else {
                System.out.println("Low result");
            }
        }
    }
    ```
    <form>
      <input type="radio" name="q5" value="a"> High result<br>
      <input type="radio" name="q5" value="b"> Low result<br>
      <input type="radio" name="q5" value="c"> Compilation error<br>
      <input type="radio" name="q5" value="d"> Runtime error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      High result
    </details>

6. **What will be the output of the following code?**

    ```java
    class Person {
        String name;

        Person(String name) {
            this.name = name;
        }

        void greet() {
            if (name.equals("Alice")) {
                System.out.println("Hello, Alice!");
            } else {
                System.out.println("Hello, stranger!");
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            Person p = new Person("Bob");
            p.greet();
        }
    }
    ```
    <form>
      <input type="radio" name="q6" value="a"> Hello, Alice!<br>
      <input type="radio" name="q6" value="b"> Hello, stranger!<br>
      <input type="radio" name="q6" value="c"> Compilation error<br>
      <input type="radio" name="q6" value="d"> Runtime error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Hello, stranger!
    </details>

7. **What will be the output of the following code?**

    ```java
    class Circle {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        double area() {
            return Math.PI * radius * radius;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Circle circle = new Circle(3);
            if (circle.area() > 20) {
                System.out.println("Large circle");
            } else {
                System.out.println("Small circle");
            }
        }
    }
    ```
    <form>
      <input type="radio" name="q7" value="a"> Large circle<br>
      <input type="radio" name="q7" value="b"> Small circle<br>
      <input type="radio" name="q7" value="c"> Compilation error<br>
      <input type="radio" name="q7" value="d"> Runtime error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Large circle
    </details>

8. **What will be the output of the following code?**

    ```java
    class Book {
        String title;
        double price;

        Book(String title, double price) {
            this.title = title;
            this.price = price;
        }

        boolean isExpensive() {
            return price > 500;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Book book = new Book("Java Programming", 600);
            if (book.isExpensive()) {
                System.out.println("Expensive book");
            } else {
                System.out.println("Affordable book");
            }
        }
    }
    ```
    <form>
      <input type="radio" name="q8" value="a"> Expensive book<br>
      <input type="radio" name="q8" value="b"> Affordable book<br>
      <input type="radio" name="q8" value="c"> Compilation error<br>
      <input type="radio" name="q8" value="d"> Runtime error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Expensive book
    </details>

9. **What will be the output of the following code?**

    ```java
    class Student {
        String name;
        int marks;

        Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        String getGrade() {
            if (marks >= 90) {
                return "A";
            } else if (marks >= 80) {
                return "B";
            } else if (marks >= 70) {
                return "C";
            } else {
                return "F";
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            Student student = new Student("Tom", 85);
            System.out.println(student.getGrade());
        }
    }
    ```
    <form>
      <input type="radio" name="q9" value="a"> A<br>
      <input type="radio" name="q9" value="b"> B<br>
      <input type="radio" name="q9" value="c"> C<br>
      <input type="radio" name="q9" value="d"> F
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      B
    </details>

10. **What will be the output of the following code?**

    ```java
    class Lamp {
        boolean isOn;

        Lamp(boolean isOn) {
            this.isOn = isOn;
        }

        void switchState() {
            isOn = !isOn;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Lamp lamp = new Lamp(true);
            lamp.switchState();
            if (lamp.isOn) {
                System.out.println("The lamp is on");
            } else {
                System.out.println("The lamp is off");
            }
        }
    }
    ```
    <form>
      <input type="radio" name="q10" value="a"> The lamp is on<br>
      <input type="radio" name="q10" value="b"> The lamp is off<br>
      <input type="radio" name="q10" value="c"> Compilation error<br>
      <input type="radio" name="q10" value="d"> Runtime error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      The lamp is off
    </details>

[Back to Top](#top)

### Tricky MCQs

1. **What will be the output of the following code?**

    ```java
    class Parent {
        int value = 10;

        int getValue() {
            return value;
        }
    }

    class Child extends Parent {
        int value = 20;

        int getValue() {
            if (value > super.value) {
                return value;
            } else {
                return super.value;
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            Parent p = new Child();
            System.out.println(p.getValue());
        }
    }
    ```
    <form>
      <input type="radio" name="q1" value="a"> 10<br>
      <input type="radio" name="q1" value="b"> 20<br>
      <input type="radio" name="q1" value="c"> Compilation error<br>
      <input type="radio" name="q1" value="d"> Runtime error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      20
    </details>

2. **What will be the output of the following code?**

    ```java
    class A {
        static String name = "Class A";

        static void printName() {
            System.out.println(name);
        }
    }

    class B extends A {
        static String name = "Class B";

        static void printName() {
            if (name.equals("Class A")) {
                super.printName();
            } else {
                System.out.println(name);
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            B.printName();
        }
    }
    ```
    <form>
      <input type="radio" name="q2" value="a"> Class A<br>
      <input type="radio" name="q2" value="b"> Class B<br>
      <input type="radio" name="q2" value="c"> Compilation error<br>
      <input type="radio" name="q2" value="d"> Runtime error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Class B
    </details>

3. **What will be the output of the following code?**

    ```java
    class Base {
        int calculate(int a, int b) {
            return a + b;
        }
    }

    class Derived extends Base {
        int calculate(int a, int b) {
            return a * b;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Base base = new Derived();
            int result = base.calculate(5, 10);
            if (result == 15) {
                System.out.println("Sum");
            } else {
                System.out.println("Product");
            }
        }
    }
    ```
    <form>
      <input type="radio" name="q3" value="a"> Sum<br>
      <input type="radio" name="q3" value="b"> Product<br>
      <input type="radio" name="q3" value="c"> Compilation error<br>
      <input type="radio" name="q3" value="d"> Runtime error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Product
    </details>

4. **What will be the output of the following code?**

    ```java
    class Alpha {
        int method(int x) {
            return x * 2;
        }
    }

    class Beta extends Alpha {
        int method(int x) {
            if (x > 0) {
                return x * 3;
            } else {
                return super.method(x);
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            Beta beta = new Beta();
            int result = beta.method(-5);
            if (result < 0) {
                System.out.println("Negative result");
            } else {
                System.out.println("Positive result");
            }
        }
    }
    ```
    <form>
      <input type="radio" name="q4" value="a"> Negative result<br>
      <input type="radio" name="q4" value="b"> Positive result<br>
      <input type="radio" name="q4" value="c"> Compilation error<br>
      <input type="radio" name="q4" value="d"> Runtime error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Negative result
    </details>

5. **What will be the output of the following code?**

    ```java
    class X {
        int value = 100;

        int getValue() {
            return value;
        }
    }

    class Y extends X {
        int value = 200;

        int getValue() {
            if (value > super.value) {
                return value - super.value;
            } else {
                return super.value - value;
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            X obj = new Y();
            System.out.println(obj.getValue());
        }
    }
    ```
    <form>
      <input type="radio" name="q5" value="a"> 100<br>
      <input type="radio" name="q5" value="b"> 200<br>
      <input type="radio" name="q5" value="c"> 0<br>
      <input type="radio" name="q5" value="d"> Compilation error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      100
    </details>

6. **What will be the output of the following code?**

    ```java
    class Outer {
        int x = 10;

        class Inner {
            int x = 20;

            void display() {
                if (x > Outer.this.x) {
                    System.out.println(x);
                } else {
                    System.out.println(Outer.this.x);
                }
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            Outer.Inner inner = new Outer().new Inner();
            inner.display();
        }
    }
    ```
    <form>
      <input type="radio" name="q6" value="a"> 10<br>
      <input type="radio" name="q6" value="b"> 20<br>
      <input type="radio" name="q6" value="c"> 30<br>
      <input type="radio" name="q6" value="d"> Compilation error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      20
    </details>

7. **What will be the output of the following code?**

    ```java
    class Base {
        String getName() {
            return "Base";
        }
    }

    class Derived extends Base {
        String getName() {
            return "Derived";
        }
    }

    public class Main {
        public static void main(String[] args) {
            Base base = new Derived();
            if (base.getName().equals("Derived")) {
                System.out.println("Derived class");
            } else {
                System.out.println("Base class");
            }
        }
    }
    ```
    <form>
      <input type="radio" name="q7" value="a"> Base class<br>
      <input type="radio" name="q7" value="b"> Derived class<br>
      <input type="radio" name="q7" value="c"> Compilation error<br>
      <input type="radio" name="q7" value="d"> Runtime error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Derived class
    </details>

8. **What will be the output of the following code?**

    ```java
    class Parent {
        void method() {
            System.out.println("Parent");
        }
    }

    class Child extends Parent {
        void method() {
            if (true) {
                System.out.println("Child");
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            Parent p = new Child();
            p.method();
        }
    }
    ```
    <form>
      <input type="radio" name="q8" value="a"> Parent<br>
      <input type="radio" name="q8" value="b"> Child<br>
      <input type="radio" name="q8" value="c"> Compilation error<br>
      <input type="radio" name="q8" value="d"> Runtime error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Child
    </details>

9. **What will be the output of the following code?**

    ```java
    class Animal {
        void makeSound() {
            System.out.println("Some sound");
        }
    }

    class Cat extends Animal {
        void makeSound() {
            if (this instanceof Cat) {
                System.out.println("Meow");
            } else {
                super.makeSound();
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            Animal animal = new Cat();
            animal.makeSound();
        }
    }
    ```
    <form>
      <input type="radio" name="q9" value="a"> Some sound<br>
      <input type="radio" name="q9" value="b"> Meow<br>
      <input type="radio" name="q9" value="c"> Compilation error<br>
      <input type="radio" name="q9" value="d"> Runtime error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Meow
    </details>

10. **What will be the output of the following code?**

    ```java
    class Calculator {
        int add(int a, int b) {
            return a + b;
        }
    }

    class AdvancedCalculator extends Calculator {
        int add(int a, int b) {
            return super.add(a, b) * 2;
        }

        int add(int a, int b, int c) {
            return this.add(a, b) + c;
        }
    }

    public class Main {
        public static void main(String[] args) {
            AdvancedCalculator calc = new AdvancedCalculator();
            int result = calc.add(2, 3, 4);
            if (result == 10) {
                System.out.println("Simple addition");
            } else {
                System.out.println("Advanced calculation");
            }
        }
    }
    ```
    <form>
      <input type="radio" name="q10" value="a"> Simple addition<br>
      <input type="radio" name="q10" value="b"> Advanced calculation<br>
      <input type="radio" name="q10" value="c"> Compilation error<br>
      <input type="radio" name="q10" value="d"> Runtime error
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Advanced calculation
    </details>

[Back to Top](#top)
