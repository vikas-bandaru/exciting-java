---
layout: default
title: Code Snippets MCQs
parent: Loops
nav_order: 3
grand_parent: Test Yourself
---

# Code Snippets-based MCQs
## Loops

<details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. [Easy Level MCQs - Single Loop](#easy-level-mcqs---single-loop)
   {:toc}
2. [Slightly harder MCQs - Single Loop](#slightly-harder-mcqs---single-loop)
   {:toc}
3. [Tricky MCQs - Single Loop](#tricky-mcqs---single-loop)
   {:toc}
4. [Easy Level MCQs - Nested Loops](#easy-level-mcqs---nested-loops)
   {:toc}
5. [Slightly harder MCQs - Nested Loops](#slightly-harder-mcqs---nested-loops)
   {:toc}
6. [Tricky MCQs - Nested Loops](#tricky-mcqs---nested-loops)
   {:toc}
</details>

### Easy Level MCQs - Single Loop

1. 1. Given the following Java code snippet, what will be printed to the console?

   ```java
   for (int i = 1; i <= 5; i++) {
       System.out.print(i + " ");
   }
   ```
   <form>
     <input type="radio" name="q1" value="a"> 1 2 3 4 5<br>
     <input type="radio" name="q1" value="b"> 0 1 2 3 4<br>
     <input type="radio" name="q1" value="c"> 5 4 3 2 1<br>
     <input type="radio" name="q1" value="d"> 1 2 3 4<br>
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     1 2 3 4 5
   </details>

2. What will be the output of the following Java code?

   ```java
   int count = 0;
   while (count < 3) {
       System.out.print("Hi ");
       count++;
   }
   ```
   <form>
     <input type="radio" name="q2" value="a"> Hi Hi Hi<br>
     <input type="radio" name="q2" value="b"> Hi Hi<br>
     <input type="radio" name="q2" value="c"> Hi Hi Hi Hi<br>
     <input type="radio" name="q2" value="d"> No output<br>
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     Hi Hi Hi
   </details>

3. After executing the following Java code, what will be the value of `sum`?

   ```java
   int sum = 0;
   for (int i = 1; i <= 4; i++) {
       sum += i;
   }
   ```
   <form>
     <input type="radio" name="q3" value="a"> 10<br>
     <input type="radio" name="q3" value="b"> 4<br>
     <input type="radio" name="q3" value="c"> 0<br>
     <input type="radio" name="q3" value="d"> 20<br>
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     10
   </details>

4. What will the following Java code print?

   ```java
   int i = 5;
   do {
       System.out.print(i + " ");
       i--;
   } while (i > 0);
   ```
   <form>
     <input type="radio" name="q4" value="a"> 5 4 3 2 1<br>
     <input type="radio" name="q4" value="b"> 1 2 3 4 5<br>
     <input type="radio" name="q4" value="c"> 5 4 3 2 1 0<br>
     <input type="radio" name="q4" value="d"> 0 1 2 3 4 5<br>
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     5 4 3 2 1
   </details>

5. How many times will "Java" be printed by the following code?

   ```java
   int i = 0;
   while (i < 5) {
       System.out.println("Java");
       i += 2;
   }
   ```
   <form>
     <input type="radio" name="q5" value="a"> 2<br>
     <input type="radio" name="q5" value="b"> 3<br>
     <input type="radio" name="q5" value="c"> 5<br>
     <input type="radio" name="q5" value="d"> 4<br>
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     3
   </details>

6. What is the output of the following Java code?

   ```java
   for (int i = 1; i <= 3; i++) {
       for (int j = 1; j <= 2; j++) {
           System.out.print(i * j + " ");
       }
   }
   ```
   <form>
     <input type="radio" name="q6" value="a"> 1 2 2 4 3 6<br>
     <input type="radio" name="q6" value="b"> 2 4 6<br>
     <input type="radio" name="q6" value="c"> 1 2 3 4 5 6<br>
     <input type="radio" name="q6" value="d"> Compilation error<br>
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     1 2 2 4 3 6
   </details>

7. Determine the output of this Java code snippet.

   ```java
   int i = 0;
   do {
       if (i % 2 == 0) {
           System.out.print(i + " ");
       }
       i++;
   } while (i < 5);
   ```
   <form>
     <input type="radio" name="q7" value="a"> 0 2 4<br>
     <input type="radio" name="q7" value="b"> 1 3 5<br>
     <input type="radio" name="q7" value="c"> 0 1 2 3 4<br>
     <input type="radio" name="q7" value="d"> 2 4<br>
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     0 2 4
   </details>

8. What will be printed by the following Java code?

   ```java
   for (int i = 3; i > 0; i--) {
       System.out.print(i + " ");
   }
   ```
   <form>
     <input type="radio" name="q8" value="a"> 3 2 1<br>
     <input type="radio" name="q8" value="b"> 1 2 3<br>
     <input type="radio" name="q8" value="c"> 0 1 2 3<br>
     <input type="radio" name="q8" value="d"> 3 2 1 0<br>
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     3 2 1
   </details>

9. After executing the following Java code, what is the value of `product`?

   ```java
   int product = 1;
   for (int i = 1; i <= 3; i++) {
       product *= i;
   }
   ```
   <form>
     <input type="radio" name="q9" value="a"> 6<br>
     <input type="radio" name="q9" value="b"> 3<br>
     <input type="radio" name="q9" value="c"> 0<br>
     <input type="radio" name="q9" value="d"> 9<br>
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     6
   </details>

10. What is the output of this Java code?

    ```java
    int i = 1;
    while (i <= 3) {
        System.out.print("Number: " + i + " ");
        i++;
    }
    ```
    <form>
      <input type="radio" name="q10" value="a"> Number: 1 Number: 2 Number: 3<br>
      <input type="radio" name="q10" value="b"> Number: 1 Number: 2<br>
      <input type="radio" name="q10" value="c"> Number: 2 Number: 3 Number: 4<br>
      <input type="radio" name="q10" value="d"> Number: 0 Number: 1 Number: 2<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Number: 1 Number: 2 Number: 3
    </details>

11. How many times will "Loop" be printed by this Java code?

    ```java
    int i = 0;
    do {
        System.out.println("Loop");
        i++;
    } while (i < 2);
    ```
    <form>
      <input type="radio" name="q11" value="a"> 2<br>
      <input type="radio" name="q11" value="b"> 1<br>
      <input type="radio" name="q11" value="c"> 0<br>
      <input type="radio" name="q11" value="d"> Infinite times<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      2
    </details>

12. Determine the output of the following Java code.

    ```java
    for (int i = 0; i < 5; i += 2) {
        System.out.print(i + " ");
    }
    ```
    <form>
      <input type="radio" name="q12" value="a"> 0 2 4<br>
      <input type="radio" name="q12" value="b"> 0 1 2 3 4<br>
      <input type="radio" name="q12" value="c"> 1 3 5<br>
      <input type="radio" name="q12" value="d"> 2 4<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      0 2 4
    </details>

13. What will be printed by this Java code?

    ```java
    int sum = 0;
    int i = 1;
    while (i <= 3) {
        sum += i;
        i++;
    }
    System.out.println(sum);
    ```
    <form>
      <input type="radio" name="q13" value="a"> 6<br>
      <input type="radio" name="q13" value="b"> 3<br>
      <input type="radio" name="q13" value="c"> 0<br>
      <input type="radio" name="q13" value="d"> 9<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      6
    </details>

14. After executing the following Java code, what will be the output?

    ```java
    int i = 5;
    do {
        System.out.print(i + " ");
        i -= 2;
    } while (i > 0);
    ```
    <form>
      <input type="radio" name="q14" value="a"> 5 3 1<br>
      <input type="radio" name="q14" value="b"> 5 4 3 2 1<br>
      <input type="radio" name="q14" value="c"> 5 3<br>
      <input type="radio" name="q14" value="d"> 5 2<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      5 3 1
    </details>

15. What will be the output of this Java code?

    ```java
    for (int i = 1; i <= 3; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    ```
    <form>
      <input type="radio" name="q15" value="a"><br>
      *<br>
      <br>
      *<br>
      <input type="radio" name="q15" value="b"><br>
      *<br>
      <br>
      *<br>
      <input type="radio" name="q15" value="c"><br>
      *<br>
      *<br>
      *<br>
      <input type="radio" name="q15" value="d"> No output<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      *
      <br>
      <br>*
    </details>

16. How many times will "Hello" be printed in the following Java code?

    ```java
    int i = 0;
    while (i < 4) {
        System.out.println("Hello");
        i++;
    }
    ```
    <form>
      <input type="radio" name="q16" value="a"> 4<br>
      <input type="radio" name="q16" value="b"> 5<br>
      <input type="radio" name="q16" value="c"> 3<br>
      <input type="radio" name="q16" value="d"> Infinite times<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      4
    </details>

17. Determine the output of this Java code snippet.

    ```java
    int total = 0;
    for (int i = 1; i <= 5; i++) {
        if (i % 2 == 0) {
            continue;
        }
        total += i;
    }
    System.out.println(total);
    ```
    <form>
      <input type="radio" name="q17" value="a"> 9<br>
      <input type="radio" name="q17" value="b"> 15<br>
      <input type="radio" name="q17" value="c"> 6<br>
      <input type="radio" name="q17" value="d"> 0<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      9
    </details>

18. What will the following Java code print?

    ```java
    int i = 1;
    do {
        System.out.print(i + " ");
        i *= 2;
    } while (i < 10);
    ```
    <form>
      <input type="radio" name="q18" value="a"> 1 2 4 8<br>
      <input type="radio" name="q18" value="b"> 1 3 5 7 9<br>
      <input type="radio" name="q18" value="c"> 1 2 3 4 5<br>
      <input type="radio" name="q18" value="d"> 2 4 8<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      1 2 4 8
    </details>

19. After executing this Java code, what will be the value of `count`?

    ```java
    int count = 0;
    for (int i = 0; i < 5; i++) {
        if (i % 2 == 0) {
            count++;
        }
    }
    ```
    <form>
      <input type="radio" name="q19" value="a"> 3<br>
      <input type="radio" name="q19" value="b"> 2<br>
      <input type="radio" name="q19" value="c"> 5<br>
      <input type="radio" name="q19" value="d"> 0<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      3
    </details>

20. What will be printed by the following Java code?

    ```java
    for (int i = 1; i <= 3; i++) {
        for (int j = 3; j >= i; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    ```
    <form>
      <input type="radio" name="q20" value="a"><br>
      3 2 1<br>
      3 2<br>
      3<br>
      <input type="radio" name="q20" value="b"><br>
      3 2 1<br>
      2 1<br>
      1<br>
      <input type="radio" name="q20" value="c"><br>
      3 2 1<br>
      3 2 1<br>
      3 2 1<br>
      <input type="radio" name="q20" value="d"> Compilation error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      3 2 1<br>
      3 2<br>
      3
    </details>

21. How many times will "Test" be printed in this Java code?

    ```java
    int i = 0;
    do {
        System.out.println("Test");
        i++;
    } while (i < 0);
    ```
    <form>
      <input type="radio" name="q21" value="a"> 1<br>
      <input type="radio" name="q21" value="b"> 0<br>
      <input type="radio" name="q21" value="c"> Infinite times<br>
      <input type="radio" name="q21" value="d"> 2<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      1
    </details>

22. Determine the output of this Java code.

    ```java
    for (int i = 1; i <= 5; i++) {
        if (i == 3) {
            break;
        }
        System.out.print(i + " ");
    }
    ```
    <form>
      <input type="radio" name="q22" value="a"> 1 2<br>
      <input type="radio" name="q22" value="b"> 1 2 3 4 5<br>
      <input type="radio" name="q22" value="c"> 3 4 5<br>
      <input type="radio" name="q22" value="d"> 1 2 3<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      1 2
    </details>

23. What will the following Java code output?

    ```java
    int i = 10;
    while (i > 0) {
        System.out.print(i + " ");
        i -= 3;
    }
    ```
    <form>
      <input type="radio" name="q23" value="a"> 10 7 4 1<br>
      <input type="radio" name="q23" value="b"> 10 9 8 7 6 5 4 3 2 1<br>
      <input type="radio" name="q23" value="c"> 10 7 4<br>
      <input type="radio" name="q23" value="d"> 10 7 4 1 -2<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      10 7 4 1
    </details>

24. How many times will the inner loop execute in total in the following Java code?

    ```java
    for (int i = 1; i <= 2; i++) {
        for (int j = 1; j <= 3; j++) {
            System.out.println("Inner Loop");
        }
    }
    ```
    <form>
      <input type="radio" name="q24" value="a"> 6<br>
      <input type="radio" name="q24" value="b"> 5<br>
      <input type="radio" name="q24" value="c"> 3<br>
      <input type="radio" name="q24" value="d"> 2<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      6
    </details>

25. What will be printed by this Java code?

    ```java
    int i = 1;
    do {
        if (i == 3) {
            i++;
            continue;
        }
        System.out.print(i + " ");
        i++;
    } while (i <= 5);
    ```
    <form>
      <input type="radio" name="q25" value="a"> 1 2 4 5<br>
      <input type="radio" name="q25" value="b"> 1 2 3 4 5<br>
      <input type="radio" name="q25" value="c"> 1 2 3 5<br>
      <input type="radio" name="q25" value="d"> 1 2 3 4<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      1 2 4 5
    </details>

26. Determine the output of this Java code snippet.

    ```java
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            System.out.print(i + j + " ");
        }
    }
    ```
    <form>
      <input type="radio" name="q26" value="a"> 0 1 1 2<br>
      <input type="radio" name="q26" value="b"> 0 1 0 1<br>
      <input type="radio" name="q26" value="c"> 1 2 3 4<br>
      <input type="radio" name="q26" value="d"> 0 1 2 3<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      0 1 1 2
    </details>

27. What will be the final value of `result` after executing this Java code?

    ```java
    int result = 1;
    int i = 1;
    while (i <= 3) {
        result *= i;
        i++;
    }
    ```
    <form>
      <input type="radio" name="q27" value="a"> 6<br>
      <input type="radio" name="q27" value="b"> 3<br>
      <input type="radio" name="q27" value="c"> 0<br>
      <input type="radio" name="q27" value="d"> 9<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      6
    </details>

28. How many times will "Executing" be printed by the following Java code?

    ```java
    int i = 0;
    while (true) {
        System.out.println("Executing");
        if (i == 2) {
            break;
        }
        i++;
    }
    ```
    <form>
      <input type="radio" name="q28" value="a"> 3<br>
      <input type="radio" name="q28" value="b"> 2<br>
      <input type="radio" name="q28" value="c"> 1<br>
      <input type="radio" name="q28" value="d"> Infinite times<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      3
    </details>

29. What will be the output of this Java code?

    ```java
    for (int i = 1; i <= 3; i++) {
        System.out.print("Outer" + i + " ");
        for (int j = 1; j <= 2; j++) {
            System.out.print("Inner" + j + " ");
        }
    }
    ```
    <form>
      <input type="radio" name="q29" value="a"> Outer1 Inner1 Inner2 Outer2 Inner1 Inner2 Outer3 Inner1 Inner2<br>
      <input type="radio" name="q29" value="b"> Inner1 Inner2 Outer1 Inner1 Inner2 Outer2 Inner1 Inner2 Outer3<br>
      <input type="radio" name="q29" value="c"> Outer1 Outer2 Outer3 Inner1 Inner2<br>
      <input type="radio" name="q29" value="d"> Outer1 Outer2 Outer3 Inner1 Inner2 Inner1 Inner2 Inner1 Inner2<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Outer1 Inner1 Inner2 Outer2 Inner1 Inner2 Outer3 Inner1 Inner2
    </details>

30. Determine the output of the following Java code.

    ```java
    int i = 0;
    do {
        System.out.print(i + " ");
        i++;
    } while (i < 3);
    ```
    <form>
      <input type="radio" name="q30" value="a"> 0 1 2<br>
      <input type="radio" name="q30" value="b"> 1 2 3<br>
      <input type="radio" name="q30" value="c"> 0 1 2 3<br>
      <input type="radio" name="q30" value="d"> 0 1<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      0 1 2
    </details>

[Back to Top](#top)

### Slightly harder MCQs - Single Loop

1. What will be the output of the following code?

   ```java
   int sum = 0;
   for (int i = 1; i <= 5; i++) {
       sum += i;
   }
   System.out.println(sum);
   ```
   <form>
     <input type="radio" name="q1" value="a"> 10<br>
     <input type="radio" name="q1" value="b"> 15<br>
     <input type="radio" name="q1" value="c"> 5<br>
     <input type="radio" name="q1" value="d"> Compilation error
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     15
   </details>

2. What will be the output of the following code?

   ```java
   int i = 0;
   while (i < 3) {
       i++;
   }
   System.out.println(i);
   ```
   <form>
     <input type="radio" name="q2" value="a"> 2<br>
     <input type="radio" name="q2" value="b"> 3<br>
     <input type="radio" name="q2" value="c"> 4<br>
     <input type="radio" name="q2" value="d"> Compilation error
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     3
   </details>

3. What will be the output of the following code?

   ```java
   int i = 0;
   do {
       i++;
   } while (i < 0);
   System.out.println(i);
   ```
   <form>
     <input type="radio" name="q3" value="a"> 0<br>
     <input type="radio" name="q3" value="b"> 1<br>
     <input type="radio" name="q3" value="c"> 2<br>
     <input type="radio" name="q3" value="d"> Compilation error
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     1
   </details>

4. What will be the output of the following code?

   ```java
   int product = 1;
   for (int i = 1; i <= 4; i++) {
       product *= i;
   }
   System.out.println(product);
   ```
   <form>
     <input type="radio" name="q4" value="a"> 24<br>
     <input type="radio" name="q4" value="b"> 16<br>
     <input type="radio" name="q4" value="c"> 4<br>
     <input type="radio" name="q4" value="d"> 10
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     24
   </details>

5. What will be the output of the following code?

   ```java
   int i = 5;
   while (i > 0) {
       i--;
   }
   System.out.println(i);
   ```
   <form>
     <input type="radio" name="q5" value="a"> 0<br>
     <input type="radio" name="q5" value="b"> 1<br>
     <input type="radio" name="q5" value="c"> -1<br>
     <input type="radio" name="q5" value="d"> Compilation error
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     0
   </details>

6. What will be the output of the following code?

   ```java
   int i = 1;
   do {
       i *= 2;
   } while (i < 10);
   System.out.println(i);
   ```
   <form>
     <input type="radio" name="q6" value="a"> 8<br>
     <input type="radio" name="q6" value="b"> 10<br>
     <input type="radio" name="q6" value="c"> 16<br>
     <input type="radio" name="q6" value="d"> Compilation error
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     16
   </details>

7. What will be the output of the following code?

   ```java
   int i = 1;
   for (; i <= 3; i++) {
       System.out.print(i + " ");
   }
   ```
   <form>
     <input type="radio" name="q7" value="a"> 1 2 3<br>
     <input type="radio" name="q7" value="b"> 1 2 3 4<br>
     <input type="radio" name="q7" value="c"> 0 1 2 3<br>
     <input type="radio" name="q7" value="d"> Compilation error
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     1 2 3
   </details>

8. What will be the output of the following code?

   ```java
   int count = 0;
   while (count < 2) {
       System.out.print(count + " ");
       count++;
   }
   ```
   <form>
     <input type="radio" name="q8" value="a"> 0 1<br>
     <input type="radio" name="q8" value="b"> 1 2<br>
     <input type="radio" name="q8" value="c"> 0 1 2<br>
     <input type="radio" name="q8" value="d"> Compilation error
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     0 1
   </details>

9. What will be the output of the following code?

   ```java
   int sum = 0;
   for (int i = 0; i < 4; i++) {
       sum += i;
   }
   System.out.println(sum);
   ```
   <form>
     <input type="radio" name="q9" value="a"> 6<br>
     <input type="radio" name="q9" value="b"> 4<br>
     <input type="radio" name="q9" value="c"> 10<br>
     <input type="radio" name="q9" value="d"> Compilation error
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     6
   </details>

10. What will be the output of the following code?

    ```java
    int i = 3;
    while (i <= 3) {
       i++;
    }
    System.out.println(i);
    ```
    <form>
     <input type="radio" name="q10" value="a"> 3<br>
     <input type="radio" name="q10" value="b"> 4<br>
     <input type="radio" name="q10" value="c"> 5<br>
     <input type="radio" name="q10" value="d"> Compilation error
    </form>
    <details markdown="block">
     <summary>Answer</summary>
     4
    </details>

11. What will be the output of the following code?

    ```java
    int i = 1;
    do {
       i++;
    } while (i < 2);
    System.out.println(i);
    ```
    <form>
     <input type="radio" name="q11" value="a"> 0<br>
     <input type="radio" name="q11" value="b"> 1<br>
     <input type="radio" name="q11" value="c"> 2<br>
     <input type="radio" name="q11" value="d"> 3
    </form>
    <details markdown="block">
     <summary>Answer</summary>
     2
    </details>

12. What will be the output of the following code?

    ```java
    int i = 0;
    for (i = 1; i <= 5; i++) {
       if (i == 3) {
           continue;
       }
       System.out.print(i + " ");
    }
    ```
    <form>
     <input type="radio" name="q12" value="a"> 1 2 3 4 5<br>
     <input type="radio" name="q12" value="b"> 1 2 4 5<br>
     <input type="radio" name="q12" value="c"> 1 2 3 5<br>
     <input type="radio" name="q12" value="d"> Compilation error
    </form>
    <details markdown="block">
     <summary>Answer</summary>
     1 2 4 5
    </details>

13. What will be the output of the following code?

    ```java
    int i = 0;
    do {
       i++;
       if (i == 2) {
           break;
       }
    } while (i < 5);
    System.out.println(i);
    ```
    <form>
     <input type="radio" name="q13" value="a"> 1<br>
     <input type="radio" name="q13" value="b"> 2<br>
     <input type="radio" name="q13" value="c"> 3<br>
     <input type="radio" name="q13" value="d"> Compilation error
    </form>
    <details markdown="block">
     <summary>Answer</summary>
     2
    </details>

14. What will be the output of the following code?

    ```java
    int i = 1;
    for (i = 1; i <= 3; i++) {
       if (i % 2 == 0) {
           continue;
       }
       System.out.print(i + " ");
    }
    ```
    <form>
     <input type="radio" name="q14" value="a"> 1 2 3<br>
     <input type="radio" name="q14" value="b"> 1 3<br>
     <input type="radio" name="q14" value="c"> 2<br>
     <input type="radio" name="q14" value="d"> Compilation error
    </form>
    <details markdown="block">
     <summary>Answer</summary>
     1 3
    </details>

15. What will be the output of the following code?

    ```java
    int i = 10;
    while (i > 5) {
       i -= 2;
    }
    System.out.println(i);
    ```
    <form>
     <input type="radio" name="q15" value="a"> 6<br>
     <input type="radio" name="q15" value="b"> 8<br>
     <input type="radio" name="q15" value="c"> 4<br>
     <input type="radio" name="q15" value="d"> 2
    </form>
    <details markdown="block">
     <summary>Answer</summary>
     4
    </details>

16. What will be the output of the following code?

    ```java
    int sum = 0;
    for (int i = 1; i <= 3; i++) {
       sum += i;
    }
    sum *= 2;
    System.out.println(sum);
    ```
    <form>
     <input type="radio" name="q16" value="a"> 6<br>
     <input type="radio" name="q16" value="b"> 12<br>
     <input type="radio" name="q16" value="c"> 9<br>
     <input type="radio" name="q16" value="d"> 18
    </form>
    <details markdown="block">
     <summary>Answer</summary>
     12
    </details>

17. What will be the output of the following code?

    ```java
    int i = 1;
    do {
       i += 3;
    } while (i < 5);
    System.out.println(i);
    ```
    <form>
     <input type="radio" name="q17" value="a"> 4<br>
     <input type="radio" name="q17" value="b"> 7<br>
     <input type="radio" name="q17" value="c"> 1<br>
     <input type="radio" name="q17" value="d"> 3
    </form>
    <details markdown="block">
     <summary>Answer</summary>
     4
    </details>

18. What will be the output of the following code?

    ```java
    int i = 2;
    while (i < 10) {
       i *= 2;
    }
    System.out.println(i);
    ```
    <form>
     <input type="radio" name="q18" value="a"> 8<br>
     <input type="radio" name="q18" value="b"> 16<br>
     <input type="radio" name="q18" value="c"> 10<br>
     <input type="radio" name="q18" value="d"> 2
    </form>
    <details markdown="block">
     <summary>Answer</summary>
     16
    </details>

19. What will be the output of the following code?

    ```java
    int i = 5;
    for (int j = 0; j < 3; j++) {
       i++;
    }
    System.out.println(i);
    ```
    <form>
     <input type="radio" name="q19" value="a"> 6<br>
     <input type="radio" name="q19" value="b"> 7<br>
     <input type="radio" name="q19" value="c"> 8<br>
     <input type="radio" name="q19" value="d"> 9
    </form>
    <details markdown="block">
     <summary>Answer</summary>
     8
    </details>

20. What will be the output of the following code?

    ```java
    int i = 0;
    while (i < 4) {
       i += 2;
    }
    System.out.println(i);
    ```
    <form>
     <input type="radio" name="q20" value="a"> 2<br>
     <input type="radio" name="q20" value="b"> 4<br>
     <input type="radio" name="q20" value="c"> 6<br>
     <input type="radio" name="q20" value="d"> 0
    </form>
    <details markdown="block">
     <summary>Answer</summary>
     4
    </details>

21. What will be the output of the following code?

    ```java
    int sum = 0;
    for (int i = 2; i <= 6; i += 2) {
       sum += i;
    }
    System.out.println(sum);
    ```
    <form>
     <input type="radio" name="q21" value="a"> 8<br>
     <input type="radio" name="q21" value="b"> 12<br>
     <input type="radio" name="q21" value="c"> 14<br>
     <input type="radio" name="q21" value="d"> 20
    </form>
    <details markdown="block">
     <summary>Answer</summary>
     12
    </details>

22. What will be the output of the following code?

    ```java
    int i = 1;
    do {
       i++;
       if (i == 3) {
           continue;
       }
    } while (i < 5);
    System.out.println(i);
    ```
    <form>
     <input type="radio" name="q22" value="a"> 2<br>
     <input type="radio" name="q22" value="b"> 4<br>
     <input type="radio" name="q22" value="c"> 5<br>
     <input type="radio" name="q22" value="d"> 3
    </form>
    <details markdown="block">
     <summary>Answer</summary>
     5
    </details>

23. What will be the output of the following code?

    ```java
    int i = 4;
    while (i > 1) {
       i--;
    }
    System.out.println(i);
    ```
    <form>
     <input type="radio" name="q23" value="a"> 1<br>
     <input type="radio" name="q23" value="b"> 0<br>
     <input type="radio" name="q23" value="c"> 2<br>
     <input type="radio" name="q23" value="d"> 4
    </form>
    <details markdown="block">
     <summary>Answer</summary>
     1
    </details>

24. What will be the output of the following code?

    ```java
    int i = 3;
    for (; i <= 6; i += 2) {
       System.out.print(i + " ");
    }
    ```
    <form>
     <input type="radio" name="q24" value="a"> 3 5<br>
     <input type="radio" name="q24" value="b"> 3 5 7<br>
     <input type="radio" name="q24" value="c"> 3 4 5 6<br>
     <input type="radio" name="q24" value="d"> 3 5 6
    </form>
    <details markdown="block">
     <summary>Answer</summary>
     3 5
    </details>

25. What will be the output of the following code?

    ```java
    int sum = 0;
    for (int i = 0; i < 3; i++) {
       sum += 2;
    }
    System.out.println(sum);
    ```
    <form>
     <input type="radio" name="q25" value="a"> 3<br>
     <input type="radio" name="q25" value="b"> 4<br>
     <input type="radio" name="q25" value="c"> 6<br>
     <input type="radio" name="q25" value="d"> 8
    </form>
    <details markdown="block">
     <summary>Answer</summary>
     6
    </details>

26. What will be the output of the following code?

    ```java
    int i = 2;
    do {
       i += 3;
    } while (i < 10);
    System.out.println(i);
    ```
    <form>
     <input type="radio" name="q26" value="a"> 5<br>
     <input type="radio" name="q26" value="b"> 11<br>
     <input type="radio" name="q26" value="c"> 2<br>
     <input type="radio" name="q26" value="d"> 5
    </form>
    <details markdown="block">
     <summary>Answer</summary>
     11
    </details>

27. What will be the output of the following code?

    ```java
    int sum = 1;
    for (int i = 1; i <= 3; i++) {
       sum *= i;
    }
    System.out.println(sum);
    ```
    <form>
     <input type="radio" name="q27" value="a"> 6<br>
     <input type="radio" name="q27" value="b"> 3<br>
     <input type="radio" name="q27" value="c"> 9<br>
     <input type="radio" name="q27" value="d"> 1
    </form>
    <details markdown="block">
     <summary>Answer</summary>
     6
    </details>

28. What will be the output of the following code?

    ```java
    int i = 1;
    while (i <= 3) {
       System.out.print(i + " ");
       i++;
    }
    ```
    <form>
     <input type="radio" name="q28" value="a"> 1 2<br>
     <input type="radio" name="q28" value="b"> 1 2 3<br>
     <input type="radio" name="q28" value="c"> 1<br>
     <input type="radio" name="q28" value="d"> 1 3
    </form>
    <details markdown="block">
     <summary>Answer</summary>
     1 2 3
    </details>

29. What will be the output of the following code?

    ```java
    int i = 2;
    do {
       System.out.print(i + " ");
       i++;
    } while (i < 4);
    ```
    <form>
     <input type="radio" name="q29" value="a"> 2<br>
     <input type="radio" name="q29" value="b"> 2 3<br>
     <input type="radio" name="q29" value="c"> 2 3 4<br>
     <input type="radio" name="q29" value="d"> 3 4
    </form>
    <details markdown="block">
     <summary>Answer</summary>
     2 3
    </details>

30. What will be the output of the following code?

    ```java
    int i = 0;
    for (; i < 3; i++) {
       System.out.print(i + " ");
    }
    ```
    <form>
     <input type="radio" name="q30" value="a"> 0 1 2<br>
     <input type="radio" name="q30" value="b"> 1 2 3<br>
     <input type="radio" name="q30" value="c"> 1 2<br>
     <input type="radio" name="q30" value="d"> 0 1
    </form>
    <details markdown="block">
     <summary>Answer</summary>
     0 1 2
    </details>

[Back to Top](#top)

### Tricky MCQs - Single Loop

1. What will be the output of the following code?

   ```java
   int i = 0;
   while (i < 5) {
       i++;
       if (i % 2 == 0) {
           i++;
       }
       System.out.print(i + " ");
   }
   ```
   <form>
     <input type="radio" name="q1" value="a"> 1 3 5 7<br>
     <input type="radio" name="q1" value="b"> 2 4 6<br>
     <input type="radio" name="q1" value="c"> 2 3 5<br>
     <input type="radio" name="q1" value="d"> 1 2 4 5
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     2 3 5 7
   </details>

2. What will be the output of the following code?

   ```java
   int i = 1;
   do {
       i *= 2;
       if (i > 4) {
           break;
       }
       i++;
   } while (i < 8);
   System.out.println(i);
   ```
   <form>
     <input type="radio" name="q2" value="a"> 2<br>
     <input type="radio" name="q2" value="b"> 3<br>
     <input type="radio" name="q2" value="c"> 4<br>
     <input type="radio" name="q2" value="d"> 5
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     5
   </details>

3. What will be the output of the following code?

   ```java
   int i = 10;
   for (int j = 0; j < 3; j++) {
       i -= j;
   }
   System.out.println(i);
   ```
   <form>
     <input type="radio" name="q3" value="a"> 9<br>
     <input type="radio" name="q3" value="b"> 8<br>
     <input type="radio" name="q3" value="c"> 7<br>
     <input type="radio" name="q3" value="d"> 6
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     7
   </details>

4. What will be the output of the following code?

   ```java
   int i = 1;
   while (i <= 3) {
       System.out.print(i + " ");
       i++;
       if (i == 2) {
           i += 2;
       }
   }
   ```
   <form>
     <input type="radio" name="q4" value="a"> 1 3<br>
     <input type="radio" name="q4" value="b"> 1 2 4<br>
     <input type="radio" name="q4" value="c"> 1 4<br>
     <input type="radio" name="q4" value="d"> 1 2 3
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     1 4
   </details>

5. What will be the output of the following code?

   ```java
   int i = 0;
   do {
       i++;
       if (i % 3 == 0) {
           continue;
       }
       System.out.print(i + " ");
   } while (i < 5);
   ```
   <form>
     <input type="radio" name="q5" value="a"> 1 2 4 5<br>
     <input type="radio" name="q5" value="b"> 1 2 3 4<br>
     <input type="radio" name="q5" value="c"> 2 4 5<br>
     <input type="radio" name="q5" value="d"> 1 2 4
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     1 2 4 5
   </details>

6. What will be the output of the following code?

   ```java
   int i = 1;
   for (int j = 0; j < 5; j++) {
       if (j % 2 == 0) {
           i += j;
       } else {
           i -= j;
       }
   }
   System.out.println(i);
   ```
   <form>
     <input type="radio" name="q6" value="a"> 0<br>
     <input type="radio" name="q6" value="b"> 1<br>
     <input type="radio" name="q6" value="c"> 2<br>
     <input type="radio" name="q6" value="d"> 3
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     1
   </details>

7. What will be the output of the following code?

   ```java
   int i = 1;
   while (i < 4) {
       i += i;
       System.out.print(i + " ");
   }
   ```
   <form>
     <input type="radio" name="q7" value="a"> 1 3<br>
     <input type="radio" name="q7" value="b"> 2 4<br>
     <input type="radio" name="q7" value="c"> 2 4 8<br>
     <input type="radio" name="q7" value="d"> 2 6
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     2 4 8
   </details>

8. What will be the output of the following code?

   ```java
   int i = 2;
   do {
       i *= 2;
   } while (i < 16);
   System.out.println(i);
   ```
   <form>
     <input type="radio" name="q8" value="a"> 8<br>
     <input type="radio" name="q8" value="b"> 16<br>
     <input type="radio" name="q8" value="c"> 32<br>
     <input type="radio" name="q8" value="d"> 64
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     32
   </details>

9. What will be the output of the following code?

   ```java
   int i = 1;
   for (int j = 5; j > 1; j--) {
       i += j;
   }
   System.out.println(i);
   ```
   <form>
     <input type="radio" name="q9" value="a"> 15<br>
     <input type="radio" name="q9" value="b"> 14<br>
     <input type="radio" name="q9" value="c"> 16<br>
     <input type="radio" name="q9" value="d"> 11
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     15
   </details>

10. What will be the output of the following code?

    ```java
    int i = 1;
    while (i < 5) {
       if (i == 3) {
           break;
       }
       i++;
    }
    System.out.println(i);
    ```
    <form>
     <input type="radio" name="q10" value="a"> 2<br>
     <input type="radio" name="q10" value="b"> 3<br>
     <input type="radio" name="q10" value="c"> 4<br>
     <input type="radio" name="q10" value="d"> 5
    </form>
    <details markdown="block">
     <summary>Answer</summary>
     3
    </details>

### Easy Level MCQs - Nested Loops

Below are 30 simple questions about nested loops in Java:

1. Given the following code snippet, what will be the output?
    ```java
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            System.out.println("i=" + i + ", j=" + j);
        }
    }
    ```
    <form>
      <input type="radio" name="q1" value="a"> i=0, j=0 and i=0, j=1<br>
      <input type="radio" name="q1" value="b"> i=0, j=0; i=0, j=1; i=1, j=0; i=1, j=1<br>
      <input type="radio" name="q1" value="c"> i=1, j=1 only<br>
      <input type="radio" name="q1" value="d"> No output<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      i=0, j=0; i=0, j=1; i=1, j=0; i=1, j=1
    </details>

2. Given the following code snippet, what is printed to the console?
    ```java
    int count = 0;
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
            count++;
        }
    }
    System.out.println(count);
    ```
    <form>
      <input type="radio" name="q2" value="a"> 3<br>
      <input type="radio" name="q2" value="b"> 6<br>
      <input type="radio" name="q2" value="c"> 2<br>
      <input type="radio" name="q2" value="d"> 5<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      6  
      (Loop runs 2 times in the outer loop and 3 times in the inner loop: 2 * 3 = 6)
    </details>

3. What will be the output of the following code snippet?
    ```java
    int sum = 0;
    for (int i = 1; i <= 2; i++) {
        for (int j = 1; j <= 2; j++) {
            sum += (i + j);
        }
    }
    System.out.println(sum);
    ```
    <form>
      <input type="radio" name="q3" value="a"> 4<br>
      <input type="radio" name="q3" value="b"> 8<br>
      <input type="radio" name="q3" value="c"> 12<br>
      <input type="radio" name="q3" value="d"> 16<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      12  
      (Expanding: When i=1, j=1 → sum += 2; i=1, j=2 → sum += 3; i=2, j=1 → sum += 3; i=2, j=2 → sum += 4; total = 2+3+3+4 = 12)
    </details>

4. Given the following nested loop, what gets printed?
    ```java
    for (int i = 1; i <= 2; i++) {
        for (int j = 1; j <= 2; j++) {
            System.out.print(i * j + " ");
        }
    }
    ```
    <form>
      <input type="radio" name="q4" value="a"> 1 2 2 4<br>
      <input type="radio" name="q4" value="b"> 1 1 2 2<br>
      <input type="radio" name="q4" value="c"> 1 2<br>
      <input type="radio" name="q4" value="d"> 2 4<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      1 2 2 4  
      (i=1, j=1 → 1; i=1, j=2 → 2; i=2, j=1 → 2; i=2, j=2 → 4)
    </details>

5. What will be the output of the following code?
    ```java
    int total = 0;
    for (int i = 0; i < 3; i++) {
        for (int j = i; j < 3; j++) {
            total++;
        }
    }
    System.out.println(total);
    ```
    <form>
      <input type="radio" name="q5" value="a"> 9<br>
      <input type="radio" name="q5" value="b"> 6<br>
      <input type="radio" name="q5" value="c"> 3<br>
      <input type="radio" name="q5" value="d"> 0<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      6  
      (Explanation: i=0 → j runs 0 to 2 (3 times), i=1 → j runs 1 to 2 (2 times), i=2 → j runs 2 to 2 (1 time). Total = 3+2+1 = 6)
    </details>

6. What will be printed to the console?
    ```java
    for (int i = 1; i <= 2; i++) {
        for (int j = 3; j >= 2; j--) {
            System.out.print((i + j) + " ");
        }
    }
    ```
    <form>
      <input type="radio" name="q6" value="a"> 4 3 5 4<br>
      <input type="radio" name="q6" value="b"> 4 5 3 4<br>
      <input type="radio" name="q6" value="c"> 3 2 4 3<br>
      <input type="radio" name="q6" value="d"> 4 3 4 3<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      4 3 5 4  
      (When i=1: j=3 → 4, j=2 → 3; when i=2: j=3 → 5, j=2 → 4)
    </details>

7. Given the following code, how many stars (*) get printed?
    ```java
    int count = 0;
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print("*");
            count++;
        }
    }
    System.out.println();
    System.out.println(count);
    ```
    <form>
      <input type="radio" name="q7" value="a"> 3 stars, then 3 printed as count<br>
      <input type="radio" name="q7" value="b"> 4 stars, then 4 printed as count<br>
      <input type="radio" name="q7" value="c"> 6 stars, then 6 printed as count<br>
      <input type="radio" name="q7" value="d"> 2 stars, then 2 printed as count<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      6 stars, then 6 as count  
      (Because 2 (outer loop) × 3 (inner loop) = 6 total iterations)
    </details>

8. What is the printed result?
    ```java
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            if (j == 1) {
                System.out.print("X ");
            } else {
                System.out.print("O ");
            }
        }
    }
    ```
    <form>
      <input type="radio" name="q8" value="a"> O O O O<br>
      <input type="radio" name="q8" value="b"> X X X X<br>
      <input type="radio" name="q8" value="c"> O X O X<br>
      <input type="radio" name="q8" value="d"> X O X O<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      O X O X  
      (When i=0: j=0 → O, j=1 → X; when i=1: j=0 → O, j=1 → X)
    </details>

9. How many times does the string "Hello" print?
    ```java
    int count = 0;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < i; j++) {
            System.out.println("Hello");
            count++;
        }
    }
    System.out.println(count);
    ```
    <form>
      <input type="radio" name="q9" value="a"> 0 times<br>
      <input type="radio" name="q9" value="b"> 1 time<br>
      <input type="radio" name="q9" value="c"> 3 times<br>
      <input type="radio" name="q9" value="d"> 6 times<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      3 times  
      (Explanation: i=0 → inner loop runs 0 times, i=1 → inner loop runs 1 time, i=2 → inner loop runs 2 times. Total = 0+1+2 = 3)
    </details>

10. What does the following code print out?
    ```java
    for (int i = 1; i <= 2; i++) {
        for (int j = 2; j <= 3; j++) {
            System.out.print(i + j + " ");
        }
    }
    ```
    <form>
      <input type="radio" name="q10" value="a"> 2 3 3 4<br>
      <input type="radio" name="q10" value="b"> 3 4 3 4<br>
      <input type="radio" name="q10" value="c"> 2 3 4 5<br>
      <input type="radio" name="q10" value="d"> 3 4 4 5<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      3 4 4 5  
      (First iteration i=1: j=2 → 3, j=3 → 4; second iteration i=2: j=2 → 4, j=3 → 5)
    </details>

11. How many times does the string `"Hello"` print?  
    ```java
    int count = 0;
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            System.out.println("Hello");
            count++;
        }
    }
    System.out.println(count);
    ```
    <form>
      <input type="radio" name="q1" value="a"> 2 times<br>
      <input type="radio" name="q1" value="b"> 3 times<br>
      <input type="radio" name="q1" value="c"> 4 times<br>
      <input type="radio" name="q1" value="d"> 1 time<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      4 times  
      (Explanation: Outer loop runs 2 times; inner loop runs 2 times for each outer iteration. Total = 2 × 2 = 4)
    </details>

12. What is printed by this code?  
    ```java
    for (int i = 1; i <= 2; i++) {
        for (int j = 1; j <= 2; j++) {
            System.out.print(i + j + " ");
        }
    }
    ```
    <form>
      <input type="radio" name="q2" value="a"> 2 3 3 4<br>
      <input type="radio" name="q2" value="b"> 2 3 4 5<br>
      <input type="radio" name="q2" value="c"> 1 2 3 4<br>
      <input type="radio" name="q2" value="d"> 3 4 3 4<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      2 3 3 4  
      (First iteration: i=1, j=1→2, j=2→3; second iteration: i=2, j=1→3, j=2→4)
    </details>

13. How many times will the inner loop run in total?  
    ```java
    int totalIterations = 0;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 2; j++) {
            totalIterations++;
        }
    }
    System.out.println(totalIterations);
    ```
    <form>
      <input type="radio" name="q3" value="a"> 2<br>
      <input type="radio" name="q3" value="b"> 3<br>
      <input type="radio" name="q3" value="c"> 5<br>
      <input type="radio" name="q3" value="d"> 6<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      6  
      (Outer loop: 3 iterations; inner loop: 2 iterations per outer loop. 3 × 2 = 6)
    </details>

14. What does this code print?  
    ```java
    for (int i = 0; i < 2; i++) {
        for (int j = i; j < 2; j++) {
            System.out.print("X ");
        }
        System.out.println();
    }
    ```
    <form>
      <input type="radio" name="q4" value="a"><br>  
        X X <br>
        X X
      <br><input type="radio" name="q4" value="b"><br>  
        X X <br>
        X
      <br><input type="radio" name="q4" value="c"><br>
        X <br>
        X
      <br><input type="radio" name="q4" value="d"><br>
        (No output)<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      ```
      X X
      X
      ```
      (Explanation: For i=0: j=0 to 1 → prints "X X". For i=1: j=1 → prints "X".)
    </details>

15. Which statement best describes the value of `count`?  
    ```java
    int count = 0;
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j <= i; j++) {
            count++;
        }
    }
    System.out.println(count);
    ```
    <form>
      <input type="radio" name="q5" value="a"> 1<br>
      <input type="radio" name="q5" value="b"> 2<br>
      <input type="radio" name="q5" value="c"> 3<br>
      <input type="radio" name="q5" value="d"> 4<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      3  
      (Explanation: i=0 → inner loop runs 1 time; i=1 → inner loop runs 2 times. Total = 1+2 = 3)
    </details>

16. What output is produced?  
    ```java
    for (int i = 1; i <= 2; i++) {
        for (int j = 1; j <= 3; j++) {
            System.out.print((i * j) + " ");
        }
        System.out.println();
    }
    ```
    <form>
      <input type="radio" name="q6" value="a"><br>  
        1 2 3<br>
        2 4 6<br>
      <input type="radio" name="q6" value="b"><br>  
        1 2 3<br>
        4 5 6<br>
      <input type="radio" name="q6" value="c"><br>  
        2 3 4<br>
        4 6 8<br>
      <input type="radio" name="q6" value="d"><br>  
        1 2 3<br>
        3 6 9<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      ```
      1 2 3
      2 4 6
      ```
      (First row: i=1 → 1×1, 1×2, 1×3; second row: i=2 → 2×1, 2×2, 2×3)
    </details>

17. What is the final value of `result`?  
    ```java
    int result = 1;
    for (int i = 1; i <= 2; i++) {
        for (int j = 1; j <= 2; j++) {
            result += (i + j);
        }
    }
    System.out.println(result);
    ```
    <form>
      <input type="radio" name="q7" value="a"> 5<br>
      <input type="radio" name="q7" value="b"> 9<br>
      <input type="radio" name="q7" value="c"> 11<br>
      <input type="radio" name="q7" value="d"> 13<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      13  
      Explanation: Loops run 4 times total. Each iteration adds (i+j). Iterations:  
      *Iteration 1:* result=1,i=1,j=1 → result+=1+1=3
      *Iteration 2:* result=3,i=1,j=2 → result+=1+2=6
      *Iteration 3:* result=6,i=2,j=1 → result+=2+1=9
      *Iteration 4:* result=9,i=2,j=2 → result+=2+2=13
    </details>

18. What does this nested loop print on each line?  
    ```java
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 2; j++) {
            System.out.print(i + "," + j + " ");
        }
        System.out.println();
    }
    ```
    <form>
      <input type="radio" name="q8" value="a"><br>  
        0,0 0,1<br>
        1,0 1,1<br>
        2,0 2,1<br>
      <input type="radio" name="q8" value="b"><br>  
        0,0<br>
        0,1<br>
        1,0<br>
        1,1<br>
        2,0<br>
        2,1<br>
      <input type="radio" name="q8" value="c"><br>  
        i=0 j=0<br>
        i=0 j=1<br>
        i=1 j=0<br>
        i=1 j=1<br>
        i=2 j=0<br>
        i=2 j=1<br>
      <input type="radio" name="q8" value="d"> No output
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      ```
      0,0 0,1
      1,0 1,1
      2,0 2,1
      ```
    </details>

19. How many times does the inner statement execute?  
    ```java
    int times = 0;
    for (int i = 1; i <= 3; i++) {
        for (int j = 1; j <= 3; j++) {
            if (i == j) {
                times++;
            }
        }
    }
    System.out.println(times);
    ```
    <form>
      <input type="radio" name="q9" value="a"> 0<br>
      <input type="radio" name="q9" value="b"> 1<br>
      <input type="radio" name="q9" value="c"> 3<br>
      <input type="radio" name="q9" value="d"> 9<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      3  
      (Checks when i == j for i,j in {1,2,3}, which happens at (1,1), (2,2), (3,3))
    </details>

20. What is the output of this nested loop?  
    ```java
    for (int i = 1; i < 3; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    ```
    <form>
      <input type="radio" name="q10" value="a"><br>  
        *<br>
        <br> 
      <input type="radio" name="q10" value="b"><br>  
        *<br>
        *<br>
      <input type="radio" name="q10" value="c"><br>  
        <br>
        *<br>
      <input type="radio" name="q10" value="d"> (No output)
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      ```
      *
      
      ```
    </details>

21. Which numbers are printed?  
    ```java
    for (int i = 0; i < 2; i++) {
        for (int j = 2; j > 0; j--) {
            System.out.print(i + j + " ");
        }
        System.out.println();
    }
    ```
    <form>
      <input type="radio" name="q11" value="a"><br>  
        2 1<br>
        3 2<br>
      <input type="radio" name="q11" value="b"><br>  
        2 3<br>
        1 2<br>
      <input type="radio" name="q11" value="c"><br>  
        i=0 j=2 i=0 j=1<br>
        i=1 j=2 i=1 j=1<br>
      <input type="radio" name="q11" value="d"><br>  
        2 1 3 2<br>
        (Single line)
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      ```
      2 1
      3 2
      ```
      (When i=0, j=2→2, j=1→1; When i=1, j=2→3, j=1→2)
    </details>

22. What does this code output?  
    ```java
    for (int i = 1; i <= 3; i++) {
        for (int j = 3; j >= i; j--) {
            System.out.print("#");
        }
        System.out.println();
    }
    ```
    <form>
      <input type="radio" name="q12" value="a"><br>  
        ###<br>
        ##<br>
        #<br>
      <input type="radio" name="q12" value="b"><br>  
        #<br>
        ##<br>
        ###<br>
      <input type="radio" name="q12" value="c"><br>  
        #<br>
        #<br>
        #<br>
      <input type="radio" name="q12" value="d"> (No output)
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      ```
      ###
      ##
      #
      ```
    </details>

23. What is printed?  
    ```java
    int i = 0;
    while (i < 2) {
        int j = 0;
        while (j < 2) {
            System.out.print(i + j + " ");
            j++;
        }
        i++;
    }
    ```
    <form>
      <input type="radio" name="q13" value="a"> 0 1 1 2<br>
      <input type="radio" name="q13" value="b"> 0 1 2 3<br>
      <input type="radio" name="q13" value="c"> 1 2 1 2<br>
      <input type="radio" name="q13" value="d"> No output
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      0 1 1 2  
      (Explanation: i=0 → j=0→0, j=1→1; i=1 → j=0→1, j=1→2)
    </details>

24. How many lines are printed in total?  
    ```java
    int lines = 0;
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            System.out.println("Line");
            lines++;
        }
    }
    System.out.println(lines);
    ```
    <form>
      <input type="radio" name="q14" value="a"> 2<br>
      <input type="radio" name="q14" value="b"> 4<br>
      <input type="radio" name="q14" value="c"> 8<br>
      <input type="radio" name="q14" value="d"> 0<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      4  
      (2 × 2 = 4 total prints in nested loops)
    </details>

25. What is printed?  
    ```java
    for (int i = 1; i <= 2; i++) {
        for (int j = i; j <= 2; j++) {
            System.out.print((i + j) + " ");
        }
        System.out.println();
    }
    ```
    <form>
      <input type="radio" name="q15" value="a"><br>  
        2 3<br>
        3 4<br>
      <input type="radio" name="q15" value="b"><br>  
        2 3<br>
        4<br>
      <input type="radio" name="q15" value="c"><br>  
        1 2<br>
        1<br>
      <input type="radio" name="q15" value="d"><br>  
        2 3 4<br>
        (Single line)
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      ```
      2 3
      4
      ```
      Explanation: i=1→ j=1..2→ sums=2,3; i=2→ j=2..2→ sum=4 (i+j=2+2=4) but note j=2 only one iteration => 3 + 4? We need to be precise.  
      *Iteration 1:* For i=1: j=1..2 => i+j = 2, 3 → prints "2 3"  
      *Iteration 2:* For i=2: j=2..2 => i+j = 4 → prints "4"  
      Actually that prints:  
      First line: 2 3  
      Second line: 4  
      So it's `2 3` on the first line, `4` on the second line.  
    </details>

26. Which of the following is the correct final output?  
    ```java
    int sum = 0;
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
            sum += j;
        }
    }
    System.out.println(sum);
    ```
    <form>
      <input type="radio" name="q16" value="a"> 3<br>
      <input type="radio" name="q16" value="b"> 6<br>
      <input type="radio" name="q16" value="c"> 9<br>
      <input type="radio" name="q16" value="d"> 0<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      6  
      (Inner loop `j` runs 3 times: j=0,1,2 → sum of j = 3. Outer loop runs 2 times, total sum = 3+3 = 6)
    </details>

27. What gets printed here?  
    ```java
    for (int i = 2; i > 0; i--) {
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    ```
    <form>
      <input type="radio" name="q17" value="a"><br>  
        <br>
        *<br>
      <input type="radio" name="q17" value="b"><br>  
        *<br>
        <br> 
      <input type="radio" name="q17" value="c"><br>  
        <br>
        *<br>
      <input type="radio" name="q17" value="d"> (No output)
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      ```
      
      *
      ```
    </details>

28. How many times does the `if` condition succeed?  
    ```java
    int matches = 0;
    for (int i = 1; i <= 2; i++) {
        for (int j = 1; j <= 2; j++) {
            if ((i + j) % 2 == 0) {
                matches++;
            }
        }
    }
    System.out.println(matches);
    ```
    <form>
      <input type="radio" name="q18" value="a"> 1<br>
      <input type="radio" name="q18" value="b"> 2<br>
      <input type="radio" name="q18" value="c"> 3<br>
      <input type="radio" name="q18" value="d"> 4<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      2  
      (All possible sums of (i+j) with i,j ∈ {1,2} are 2,3,3,4. Even sums are 2 and 4 → 2 matches.)
    </details>

29. What is printed by this nested while loop?  
    ```java
    int i = 0;
    while (i < 2) {
        int j = 2;
        while (j > 0) {
            System.out.print((i + j) + " ");
            j--;
        }
        i++;
        System.out.println();
    }
    ```
    <form>
      <input type="radio" name="q19" value="a"><br>  
        0 1<br>
        1 2<br>
      <input type="radio" name="q19" value="b"><br>  
        2 1<br>
        3 2<br>
      <input type="radio" name="q19" value="c"><br>  
        2 3<br>
        1 2<br>
      <input type="radio" name="q19" value="d"> (No output)
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      ```
      2 1
      3 2
      ```
      (Explanation: i=0 → j=2..1 => sums=2,1; i=1 → j=2..1 => sums=3,2)
    </details>

30. What does the following code produce?  
    ```java
    for (int i = 0; i < 3; i++) {
        for (int j = i; j < 3; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    ```
    <form>
      <input type="radio" name="q20" value="a"><br>  
        *<br>
        <br>
        *<br>
      <input type="radio" name="q20" value="b"><br>  
        *<br>
        <br>
        *<br>
      <input type="radio" name="q20" value="c"><br>  
        *<br>
        *<br>
        *<br>
      <input type="radio" name="q20" value="d"><br>  
        *<br>
        <br>
        *<br>
        (No extra line)
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      ```
      *
      
      *
      ```
      (Explanation: i=0→ j=0..2 => 3 stars; i=1→ j=1..2 => 2 stars; i=2→ j=2..2 => 1 star)
    </details>

[Back to Easy-level MCQs - Nested Loops](#easy-level-mcqs---nested-loops)
[Back to Top](#top)

### Slightly harder MCQs - Nested Loops

### Tricky MCQs - Nested Loops
