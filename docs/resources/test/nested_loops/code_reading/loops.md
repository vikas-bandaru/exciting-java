---
layout: default
title: Code Snippets MCQs
parent: Nested Loops
nav_order: 3
grand_parent: Test Yourself
---

# Code Snippets-based MCQs
## Nested Loops

<details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. [Easy Level MCQs](#easy-level-mcqs---nested-loops)
   {:toc}
2. [MCQs on Common Problems](#mcqs-on-common-problems)
   {:toc}
3. [Tricky MCQs](#)
   {:toc}
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

### MCQs on Common Problems

Below are 20 questions, each featuring a Java code snippet relevant to common problems such as digit-wise calculations, character pattern printing, prime series, etc.

1. What is the final value of `sum`?  
   ```java
   int n = 123;
   int sum = 0;
   while (n > 0) {
       int digit = n % 10;
       sum += digit;
       n /= 10;
   }
   System.out.println(sum);
   ```
   <form>
     <input type="radio" name="q1" value="a"> 1<br>
     <input type="radio" name="q1" value="b"> 3<br>
     <input type="radio" name="q1" value="c"> 6<br>
     <input type="radio" name="q1" value="d"> 123<br>
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     6  
     (Explanation: Digits are 3, 2, and 1. Sum = 3 + 2 + 1 = 6)
   </details>

2. What is the output of this code?  
   ```java
   for (int num = 1; num <= 10; num++) {
       boolean isPrime = true;
       if (num <= 1) {
           isPrime = false;
       }
       for (int i = 2; i <= num / 2; i++) {
           if (num % i == 0) {
               isPrime = false;
               break;
           }
       }
       if (isPrime) {
           System.out.print(num + " ");
       }
   }
   ```
   <form>
     <input type="radio" name="q2" value="a"> 2 primes<br>
     <input type="radio" name="q2" value="b"> 3 primes<br>
     <input type="radio" name="q2" value="c"> 4 primes<br>
     <input type="radio" name="q2" value="d"> 5 primes<br>
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     4 primes  
     (They are 2, 3, 5, 7)
   </details>

3. What does the following code snippet print?  
   ```java
   int n = 4;
   long fact = 1;
   for (int i = 1; i <= n; i++) {
       fact = fact * i;
   }
   System.out.println(fact);
   ```
   <form>
     <input type="radio" name="q3" value="a"> 24<br>
     <input type="radio" name="q3" value="b"> 16<br>
     <input type="radio" name="q3" value="c"> 4<br>
     <input type="radio" name="q3" value="d"> 1<br>
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     24  
     (Explanation: 4! = 4 × 3 × 2 × 1 = 24)
   </details>

4. What is the output of this code snippet?  
   ```java
   int a = 0, b = 1;
   System.out.print(a + " " + b + " ");
   for(int i = 3; i <= 5; i++){
       int c = a + b;
       System.out.print(c + " ");
       a = b;
       b = c;
   }
   ```
   <form>
     <input type="radio" name="q4" value="a"> 0 1 1 2 3<br>
     <input type="radio" name="q4" value="b"> 1 1 2 3 5<br>
     <input type="radio" name="q4" value="c"> 0 1 2 3 5<br>
     <input type="radio" name="q4" value="d"> 0 1 1 3 4
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     0 1 1 2 3  
     (First five Fibonacci terms starting with 0, 1)
   </details>

5. What does this code print?  
   ```java
   int num = 230;
   int rev = 0;
   while (num > 0) {
       int digit = num % 10;
       rev = rev * 10 + digit;
       num /= 10;
   }
   System.out.println(rev);
   ```
   <form>
     <input type="radio" name="q5" value="a"> 32<br>
     <input type="radio" name="q5" value="b"> 23<br>
     <input type="radio" name="q5" value="c"> 032<br>
     <input type="radio" name="q5" value="d"> 0<br>
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     32  
     (Leading zeros are dropped in integer operations)
   </details>

6. How many times does `"Java"` print?  
   ```java
   int number = 129;
   while (number > 0) {
       int digit = number % 10;
       if (digit % 2 == 0) {
           System.out.println("Java");
       }
       number /= 10;
   }
   ```
   <form>
     <input type="radio" name="q6" value="a"> 1 time<br>
     <input type="radio" name="q6" value="b"> 2 times<br>
     <input type="radio" name="q6" value="c"> 3 times<br>
     <input type="radio" name="q6" value="d"> 0 times<br>
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     1 time  
     (Digits are 9 (odd), 2 (even), 1 (odd). Only `2` triggers the print)
   </details>

7. What character pattern is printed by this code?  
   ```java
   for (char c = 'A'; c <= 'C'; c++) {
       for (char d = 'A'; d <= c; d++) {
           System.out.print(d + " ");
       }
       System.out.println();
   }
   ```
   <form>
     <input type="radio" name="q7" value="a"><br>  
       A<br>
       A B<br>
       A B C<br>
     <input type="radio" name="q7" value="b"><br>  
       A B C<br>
       A B C<br>
       A B C<br>
     <input type="radio" name="q7" value="c"><br>  
       A A B A B C<br>
     <input type="radio" name="q7" value="d"> (No output)<br>
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     ```
     A
     A B
     A B C
     ```
   </details>

8. What is the output?  
   ```java
   int num = 151;
   int original = num;
   int reverse = 0;
   while (num > 0) {
       int digit = num % 10;
       reverse = reverse * 10 + digit;
       num /= 10;
   }
   if (reverse == original) {
       System.out.println("Palindrome");
   } else {
       System.out.println("Not Palindrome");
   }
   ```
   <form>
     <input type="radio" name="q8" value="a"> Palindrome<br>
     <input type="radio" name="q8" value="b"> Not Palindrome<br>
     <input type="radio" name="q8" value="c"> 151<br>
     <input type="radio" name="q8" value="d"> 0
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     Palindrome
   </details>

9. How many prime numbers will be printed up to 20?  
   ```java
   for (int num = 2; num <= 20; num++) {
       boolean isPrime = true;
       for (int i = 2; i <= Math.sqrt(num); i++) {
           if (num % i == 0) {
               isPrime = false;
               break;
           }
       }
       if (isPrime) {
           System.out.print(num + " ");
       }
   }
   ```
   <form>
     <input type="radio" name="q9" value="a"> 6<br>
     <input type="radio" name="q9" value="b"> 8<br>
     <input type="radio" name="q9" value="c"> 9<br>
     <input type="radio" name="q9" value="d"> 10
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     8  
     (The primes up to 20 are 2,3,5,7,11,13,17,19)
   </details>

10. What is printed by this numeric pattern code?  
    ```java
    for (int i = 1; i <= 3; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
        System.out.println();
    }
    ```
    <form>
      <input type="radio" name="q10" value="a"><br>  
        1<br>
        12<br>
        123<br>
      <input type="radio" name="q10" value="b"><br>  
        123<br>
        123<br>
        123<br>
      <input type="radio" name="q10" value="c"><br>  
        1<br>
        1<br>
        1<br>
      <input type="radio" name="q10" value="d"> (No output)
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      ```
      1
      12
      123
      ```
    </details>

11. How many digits of 407 does the code consider to check if it’s an Armstrong number?  
    ```java
    int n = 407;
    int temp = n;
    int sumOfCubes = 0;
    while (temp > 0) {
        int digit = temp % 10;
        sumOfCubes += digit * digit * digit;
        temp /= 10;
    }
    System.out.println(sumOfCubes == n);
    ```
    <form>
      <input type="radio" name="q11" value="a"> 1<br>
      <input type="radio" name="q11" value="b"> 2<br>
      <input type="radio" name="q11" value="c"> 3<br>
      <input type="radio" name="q11" value="d"> 4
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      3  
      (Digits are 7, 0, 4 in the loop)
    </details>

12. What does this code snippet print?  
    ```java
    int num = 999;
    int sum = 0;
    for (; num > 0; num /= 10) {
        sum += (num % 10);
    }
    System.out.println(sum);
    ```
    <form>
      <input type="radio" name="q12" value="a"> 9<br>
      <input type="radio" name="q12" value="b"> 18<br>
      <input type="radio" name="q12" value="c"> 27<br>
      <input type="radio" name="q12" value="d"> 999
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      27  
      (9 + 9 + 9 = 27)
    </details>

13. What is the outpu?  
    ```java
    for (int i = 1; i <= 10; i++) {
        if (i % 3 == 0) {
            System.out.print(i + " ");
        }
    }
    ```
    <form>
      <input type="radio" name="q13" value="a"> 3 6<br>
      <input type="radio" name="q13" value="b"> 3 6 9<br>
      <input type="radio" name="q13" value="c"> 3 9<br>
      <input type="radio" name="q13" value="d"> 6 9
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      3 6 9
    </details>

14. Which numbers are printed?  
    ```java
    for (int num = 8; num <= 13; num++) {
        boolean prime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime && num > 1) {
            System.out.print(num + " ");
        }
    }
    ```
    <form>
      <input type="radio" name="q14" value="a"> 8 9 10<br>
      <input type="radio" name="q14" value="b"> 11 13<br>
      <input type="radio" name="q14" value="c"> 9 11 13<br>
      <input type="radio" name="q14" value="d"> 8 9 10 11 12 13
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      11 13  
      (8, 9, 10, 12 are not prime)
    </details>

15. What pattern of asterisks is printed?  
    ```java
    for (int i = 3; i > 0; i--) {
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    ```
    <form>
      <input type="radio" name="q15" value="a"><br>  
        ***<br>
        <br>
        *<br>
      <input type="radio" name="q15" value="b"><br>  
        ***<br>
        **<br>
        *<br>
      <input type="radio" name="q15" value="c"> 3 times no stars<br>
      <input type="radio" name="q15" value="d"> No output
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      ```
      ***
      **
      *
      ```
    </details>

16. Which lines will be printed?  
    ```java
    int number = 145;
    while (number > 0) {
        int digit = number % 10;
        System.out.println(digit * 2);
        number /= 10;
    }
    ```
    <form>
      <input type="radio" name="q16" value="a"> 10, 8, 2 (in that order)<br>
      <input type="radio" name="q16" value="b"> 2, 8, 10 (in that order)<br>
      <input type="radio" name="q16" value="c"> 10, 4, 2 (in that order)<br>
      <input type="radio" name="q16" value="d"> 2, 4, 10 (in that order)
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      10, 8, 2 (in that order)  
      (Digits: 5→10, 4→8, 1→2)
    </details>

17. How many characters are printed here?  
    ```java
    int count = 0;
    for (char c = 'A'; c <= 'Z'; c++) {
        System.out.print(c + " ");
        count++;
    }
    System.out.println("\n" + count);
    ```
    <form>
      <input type="radio" name="q17" value="a"> 26<br>
      <input type="radio" name="q17" value="b"> 25<br>
      <input type="radio" name="q17" value="c"> 27<br>
      <input type="radio" name="q17" value="d"> 0
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      26  
      (A through Z is 26 letters)
    </details>

18. What does the code print for the number 5?  
    ```java
    int x = 5;
    boolean prime = true;
    for (int i = 2; i < x; i++) {
        if (x % i == 0) {
            prime = false;
            break;
        }
    }
    if (prime && x > 1) {
        System.out.println("Prime");
    } else {
        System.out.println("Not Prime");
    }
    ```
    <form>
      <input type="radio" name="q18" value="a"> Prime<br>
      <input type="radio" name="q18" value="b"> Not Prime<br>
      <input type="radio" name="q18" value="c"> 5<br>
      <input type="radio" name="q18" value="d"> 0
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Prime
    </details>

19. What pattern is printed?  
    ```java
    for (int i = 1; i <= 3; i++) {
        for (int j = 1; j <= 3; j++) {
            if (j < i) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
    }
    ```
    <form>
      <input type="radio" name="q19" value="a"><br>  
        *<br>
        *<br>
        *<br>
      <input type="radio" name="q19" value="b"><br>  
        *<br>
         <br>
         *<br>
      <input type="radio" name="q19" value="c"><br>  
        * *<br>
        * *<br>
        * *<br>
      <input type="radio" name="q19" value="d"> (No output)
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      ```
      *
       
        *
      ```
      (Explanation: For row i, spaces are printed for j < i, then `*` for j ≥ i.)
    </details>

20. What does this code output for `n=6` (printing prime factors)?  
    ```java
    int n = 6;
    for (int i = 2; i <= n; i++) {
        while (n % i == 0) {
            System.out.print(i + " ");
            n /= i;
        }
    }
    ```
    <form>
      <input type="radio" name="q20" value="a"> 2 3<br>
      <input type="radio" name="q20" value="b"> 3 2<br>
      <input type="radio" name="q20" value="c"> 6<br>
      <input type="radio" name="q20" value="d"> No output
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      2 3  
      (Prime factors of 6 are 2 and 3)
    </details>

[Back to Top](#top)

### Tricky MCQs
