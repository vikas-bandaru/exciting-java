---
layout: default
title: Code Snippets MCQs
parent: Strings
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
1. [Easy Level MCQs](#easy-level-mcqs)
   {:toc}
2. [Slightly harder MCQs](#slightly-harder-mcqs)
   {:toc}
3. [Tricky MCQs](#tricky-mcqs)
   {:toc}
</details>

### Easy Level MCQs

The questions are based on frequently used Java 8 String methods:

1. What will the following code print?

    ```java
    String text = "Java Programming";
    System.out.println(text.substring(5));
    ```

    <form>
      <input type="radio" name="q1" value="a"> Programming<br>
      <input type="radio" name="q1" value="b"> Java Programming<br>
      <input type="radio" name="q1" value="c"> Jav<br>
      <input type="radio" name="q1" value="d"> Java<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Programming  
      (Explanation: `substring(5)` starts from index 5, returning the substring starting from 'P'.)
    </details>

2. What is the return type of the method `toUpperCase()` in the following code?

    ```java
    String str = "hello";
    String result = str.toUpperCase();
    ```

    <form>
      <input type="radio" name="q2" value="a"> String<br>
      <input type="radio" name="q2" value="b"> char<br>
      <input type="radio" name="q2" value="c"> boolean<br>
      <input type="radio" name="q2" value="d"> int<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      String  
      (Explanation: `toUpperCase()` returns a new string where all characters are converted to uppercase.)
    </details>

3. Which method would you use to check if a string "Java" contains the substring "av"?

    ```java
    String str = "Java";
    ```

    <form>
      <input type="radio" name="q3" value="a"> str.contains("av")<br>
      <input type="radio" name="q3" value="b"> str.indexOf("av")<br>
      <input type="radio" name="q3" value="c"> str.matches("av")<br>
      <input type="radio" name="q3" value="d"> str.equals("av")<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      str.contains("av")  
      (Explanation: `contains()` checks if the substring exists within the string.)
    </details>

4. What does the following code output?

    ```java
    String str = "Java Programming";
    System.out.println(str.replace('a', 'o'));
    ```

    <form>
      <input type="radio" name="q4" value="a"> Jovo Progromming<br>
      <input type="radio" name="q4" value="b"> Jova Progromming<br>
      <input type="radio" name="q4" value="c"> Javo Progromming<br>
      <input type="radio" name="q4" value="d"> Jova Programming<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Jovo Progromming  
      (Explanation: `replace('a', 'o')` replaces all occurrences of 'a' with 'o'.)
    </details>

5. What is the return value of `str.trim()` when the string is "   Hello   "?

    ```java
    String str = "   Hello   ";
    System.out.println(str.trim());
    ```

    <form>
      <input type="radio" name="q5" value="a"> "Hello"<br>
      <input type="radio" name="q5" value="b"> "   Hello"<br>
      <input type="radio" name="q5" value="c"> "Hello   "<br>
      <input type="radio" name="q5" value="d"> "   Hello   "<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      "Hello"  
      (Explanation: `trim()` removes leading and trailing whitespace from the string.)
    </details>

6. What will the following code output?

    ```java
    String str = "Java";
    System.out.println(str.charAt(2));
    ```

    <form>
      <input type="radio" name="q6" value="a"> J<br>
      <input type="radio" name="q6" value="b"> a<br>
      <input type="radio" name="q6" value="c"> v<br>
      <input type="radio" name="q6" value="d"> r<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      v  
      (Explanation: `charAt(2)` returns the character at index 2, which is 'v'.)
    </details>

7. Which method should you use to split a string "Java Programming" into words?

    ```java
    String str = "Java Programming";
    ```

    <form>
      <input type="radio" name="q7" value="a"> str.split(" ")<br>
      <input type="radio" name="q7" value="b"> str.split("")<br>
      <input type="radio" name="q7" value="c"> str.split(",")<br>
      <input type="radio" name="q7" value="d"> str.split("/")<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      str.split(" ")  
      (Explanation: `split(" ")` splits the string at spaces, resulting in words.)
    </details>

8. What is the return type of the `toLowerCase()` method?

    ```java
    String str = "HELLO";
    String result = str.toLowerCase();
    ```

    <form>
      <input type="radio" name="q8" value="a"> String<br>
      <input type="radio" name="q8" value="b"> char<br>
      <input type="radio" name="q8" value="c"> boolean<br>
      <input type="radio" name="q8" value="d"> int<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      String  
      (Explanation: `toLowerCase()` returns a new string where all characters are converted to lowercase.)
    </details>

9. What is the output of the following code?

    ```java
    String str = "Java";
    System.out.println(str.indexOf('a'));
    ```

    <form>
      <input type="radio" name="q9" value="a"> 0<br>
      <input type="radio" name="q9" value="b"> 1<br>
      <input type="radio" name="q9" value="c"> 2<br>
      <input type="radio" name="q9" value="d"> 3<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      1  
      (Explanation: `indexOf('a')` returns the index of the first occurrence of 'a', which is at index 1.)
    </details>

10. What does the method `String.format()` do?

    ```java
    String result = String.format("The number is: %d", 10);
    System.out.println(result);
    ```

    <form>
      <input type="radio" name="q10" value="a"> Converts numbers to string<br>
      <input type="radio" name="q10" value="b"> Formats the string to include variables<br>
      <input type="radio" name="q10" value="c"> Replaces all occurrences of a substring<br>
      <input type="radio" name="q10" value="d"> Appends strings<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Formats the string to include variables  
      (Explanation: `String.format()` allows formatting strings by inserting variables like numbers into placeholders.)
    </details>

11. What will the following code print?

    ```java
    String str = "  Hello World  ";
    System.out.println(str.trim().toUpperCase());
    ```

    <form>
      <input type="radio" name="q11" value="a"> HELLO WORLD<br>
      <input type="radio" name="q11" value="b"> Hello World<br>
      <input type="radio" name="q11" value="c">   HELLO WORLD<br>
      <input type="radio" name="q11" value="d">   Hello World   <br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      HELLO WORLD  
      (Explanation: `trim()` removes leading and trailing spaces, and `toUpperCase()` converts the string to uppercase.)
    </details>

12. What will the following code output?

    ```java
    String str = "Java Programming";
    System.out.println(str.contains("Pro"));
    ```

    <form>
      <input type="radio" name="q12" value="a"> true<br>
      <input type="radio" name="q12" value="b"> false<br>
      <input type="radio" name="q12" value="c"> Error<br>
      <input type="radio" name="q12" value="d"> true false<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      true  
      (Explanation: `contains("Pro")` checks if "Pro" is a part of the string and returns true.)
    </details>

13. What does the following code do?

    ```java
    String str = "Java";
    System.out.println(str.substring(1, 3));
    ```

    <form>
      <input type="radio" name="q13" value="a"> av<br>
      <input type="radio" name="q13" value="b"> Ja<br>
      <input type="radio" name="q13" value="c"> va<br>
      <input type="radio" name="q13" value="d"> J<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      av  
      (Explanation: `substring(1, 3)` extracts the substring starting from index 1 and ending at index 3, which is "av".)
    </details>

14. What is the result of the following expression?

    ```java
    String str = "Java";
    boolean result = str.startsWith("J");
    System.out.println(result);
    ```

    <form>
      <input type="radio" name="q14" value="a"> true<br>
      <input type="radio" name="q14" value="b"> false<br>
      <input type="radio" name="q14" value="c"> Error<br>
      <input type="radio" name="q14" value="d"> true false<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      true  
      (Explanation: `startsWith("J")` checks if the string starts with the specified character 'J' and returns true.)
    </details>

15. What is the return value of the following method call?

    ```java
    String str = "Java";
    System.out.println(str.length());
    ```

    <form>
      <input type="radio" name="q15" value="a"> 3<br>
      <input type="radio" name="q15" value="b"> 4<br>
      <input type="radio" name="q15" value="c"> 5<br>
      <input type="radio" name="q15" value="d"> 0<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      4  
      (Explanation: `length()` returns the number of characters in the string "Java", which is 4.)
    </details>

16. What will the following code print?

    ```java
    String str = "Hello";
    System.out.println(str.equals("hello"));
    ```

    <form>
      <input type="radio" name="q16" value="a"> true<br>
      <input type="radio" name="q16" value="b"> false<br>
      <input type="radio" name="q16" value="c"> Error<br>
      <input type="radio" name="q16" value="d"> true false<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      false  
      (Explanation: `equals()` is case-sensitive, so "Hello" is not equal to "hello".)
    </details>

17. What will the following code output?

    ```java
    String str = "Java Programming";
    System.out.println(str.indexOf("Prog"));
    ```

    <form>
      <input type="radio" name="q17" value="a"> 0<br>
      <input type="radio" name="q17" value="b"> 1<br>
      <input type="radio" name="q17" value="c"> 5<br>
      <input type="radio" name="q17" value="d"> -1<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      5  
      (Explanation: `indexOf("Prog")` returns the index where the substring "Prog" begins, which is 5.)
    </details>

18. What will this code print?

    ```java
    String str = "Java";
    System.out.println(str.replace('a', 'o'));
    ```

    <form>
      <input type="radio" name="q18" value="a"> Jovo<br>
      <input type="radio" name="q18" value="b"> Jova<br>
      <input type="radio" name="q18" value="c"> Java<br>
      <input type="radio" name="q18" value="d"> Jovo<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Jovo  
      (Explanation: `replace('a', 'o')` replaces all occurrences of 'a' with 'o', resulting in "Jovo".)
    </details>

19. What is the return type of the method `toCharArray()`?

    ```java
    String str = "Java";
    char[] result = str.toCharArray();
    ```

    <form>
      <input type="radio" name="q19" value="a"> String<br>
      <input type="radio" name="q19" value="b"> char[]<br>
      <input type="radio" name="q19" value="c"> char<br>
      <input type="radio" name="q19" value="d"> boolean<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      char[]  
      (Explanation: `toCharArray()` converts the string into an array of characters and returns it.)
    </details>

20. What does the method `str.equalsIgnoreCase("java")` return when the string is "JAVA"?

    ```java
    String str = "JAVA";
    System.out.println(str.equalsIgnoreCase("java"));
    ```

    <form>
      <input type="radio" name="q20" value="a"> true<br>
      <input type="radio" name="q20" value="b"> false<br>
      <input type="radio" name="q20" value="c"> Error<br>
      <input type="radio" name="q20" value="d"> true false<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      true  
      (Explanation: `equalsIgnoreCase()` compares two strings ignoring case, so "JAVA" equals "java".)
    </details>

[Back to Top](#top)

### Slightly harder MCQs

Here are 20 more MCQs with code snippets that involve more than one method call, where the result of one method call is supplied to another:

1. What will the following code print?

    ```java
    String str = "  Java Programming  ";
    System.out.println(str.trim().toUpperCase());
    ```

    <form>
      <input type="radio" name="q1" value="a"> JAVA PROGRAMMING<br>
      <input type="radio" name="q1" value="b"> Java Programming<br>
      <input type="radio" name="q1" value="c"> JAVA programming<br>
      <input type="radio" name="q1" value="d">   JAVA PROGRAMMING<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      JAVA PROGRAMMING  
      (Explanation: `trim()` removes leading and trailing spaces, and `toUpperCase()` converts the string to uppercase.)
    </details>

2. What will the following code output?

    ```java
    String str = "Java Programming";
    System.out.println(str.substring(5).toLowerCase());
    ```

    <form>
      <input type="radio" name="q2" value="a"> programming<br>
      <input type="radio" name="q2" value="b"> Java programming<br>
      <input type="radio" name="q2" value="c"> JAVA PROGRAMMING<br>
      <input type="radio" name="q2" value="d"> Java programming<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      programming  
      (Explanation: `substring(5)` extracts the substring starting at index 5, and `toLowerCase()` converts it to lowercase.)
    </details>

3. What is the result of the following code?

    ```java
    String str = "Java Programming";
    System.out.println(str.replace("Java", "Python").toLowerCase());
    ```

    <form>
      <input type="radio" name="q3" value="a"> python programming<br>
      <input type="radio" name="q3" value="b"> Python programming<br>
      <input type="radio" name="q3" value="c"> Java programming<br>
      <input type="radio" name="q3" value="d"> python Programming<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      python programming  
      (Explanation: `replace("Java", "Python")` replaces "Java" with "Python" and `toLowerCase()` converts the string to lowercase.)
    </details>

4. What will the following code print?

    ```java
    String str = "    Hello World   ";
    System.out.println(str.trim().substring(0, 5));
    ```

    <form>
      <input type="radio" name="q4" value="a"> Hello<br>
      <input type="radio" name="q4" value="b"> Hello World<br>
      <input type="radio" name="q4" value="c"> Hello    <br>
      <input type="radio" name="q4" value="d"> World<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Hello  
      (Explanation: `trim()` removes leading and trailing spaces, and `substring(0, 5)` extracts the first five characters.)
    </details>

5. What is the output of the following code?

    ```java
    String str = "Java Programming";
    System.out.println(str.substring(0, 4).toUpperCase());
    ```

    <form>
      <input type="radio" name="q5" value="a"> JAVA<br>
      <input type="radio" name="q5" value="b"> Java<br>
      <input type="radio" name="q5" value="c"> JAV<br>
      <input type="radio" name="q5" value="d"> JAVA programming<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      JAVA  
      (Explanation: `substring(0, 4)` extracts "Java", and `toUpperCase()` converts it to "JAVA".)
    </details>

6. What will be the output of this code?

    ```java
    String str = "Hello";
    System.out.println(str.toLowerCase().replace('h', 'j'));
    ```

    <form>
      <input type="radio" name="q6" value="a"> hello<br>
      <input type="radio" name="q6" value="b"> jello<br>
      <input type="radio" name="q6" value="c"> Hello<br>
      <input type="radio" name="q6" value="d"> Jello<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      jello  
      (Explanation: `toLowerCase()` converts "Hello" to "hello", and `replace('h', 'j')` replaces 'h' with 'j'.)
    </details>

7. What does the following code print?

    ```java
    String str = "Java";
    System.out.println(str.concat(" Programming").toUpperCase());
    ```

    <form>
      <input type="radio" name="q7" value="a"> JAVA<br>
      <input type="radio" name="q7" value="b"> Java Programming<br>
      <input type="radio" name="q7" value="c"> JAVA PROGRAMMING<br>
      <input type="radio" name="q7" value="d"> Java Programming<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      JAVA PROGRAMMING  
      (Explanation: `concat(" Programming")` adds " Programming" to "Java", and `toUpperCase()` converts the result to uppercase.)
    </details>

8. What will the output of the following code be?

    ```java
    String str = "Java";
    System.out.println(str.substring(1).replace('a', 'o'));
    ```

    <form>
      <input type="radio" name="q8" value="a"> Jova<br>
      <input type="radio" name="q8" value="b"> Java<br>
      <input type="radio" name="q8" value="c"> Jovo<br>
      <input type="radio" name="q8" value="d"> Jaa<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Jovo  
      (Explanation: `substring(1)` removes the first character 'J', resulting in "ava", and `replace('a', 'o')` changes 'a' to 'o', resulting in "Jovo".)
    </details>

9. What does the following code print?

    ```java
    String str = "  Hello World  ";
    System.out.println(str.trim().substring(0, 4).toUpperCase());
    ```

    <form>
      <input type="radio" name="q9" value="a"> HELLO<br>
      <input type="radio" name="q9" value="b"> Hello<br>
      <input type="radio" name="q9" value="c"> Hell<br>
      <input type="radio" name="q9" value="d"> WORLD<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      HELL  
      (Explanation: `trim()` removes the spaces, `substring(0, 4)` extracts "Hell", and `toUpperCase()` converts it to "HELL".)
    </details>

10. What is the result of the following?

    ```java
    String str = "Java Programming";
    System.out.println(str.substring(5, 15).toLowerCase().replace("programming", "rocks"));
    ```

    <form>
      <input type="radio" name="q10" value="a"> programming rocks<br>
      <input type="radio" name="q10" value="b"> programming<br>
      <input type="radio" name="q10" value="c"> rocks<br>
      <input type="radio" name="q10" value="d"> programming<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      rocks  
      (Explanation: `substring(5, 15)` gives "Programming", `toLowerCase()` converts it to "programming", and `replace("programming", "rocks")` changes it to "rocks".)
    </details>

11. What will the following code output?

    ```java
    String str = "Java";
    System.out.println(str.toUpperCase().substring(1, 3));
    ```

    <form>
      <input type="radio" name="q11" value="a"> JA<br>
      <input type="radio" name="q11" value="b"> AV<br>
      <input type="radio" name="q11" value="c"> VA<br>
      <input type="radio" name="q11" value="d"> JAVA<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      VA  
      (Explanation: `toUpperCase()` converts "Java" to "JAVA", and `substring(1, 3)` extracts "VA".)
    </details>

12. What does the following code print?

    ```java
    String str = "  Hello World  ";
    System.out.println(str.trim().replace("World", "Java").toLowerCase());
    ```

    <form>
      <input type="radio" name="q12" value="a"> hello world<br>
      <input type="radio" name="q12" value="b"> hello java<br>
      <input type="radio" name="q12" value="c"> hello WORLD<br>
      <input type="radio" name="q12" value="d"> hello java world<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      hello java  
      (Explanation: `trim()` removes leading/trailing spaces, `replace("World", "Java")` replaces "World" with "Java", and `toLowerCase()` converts it to lowercase.)
    </details>

13. What is the result of this code?

    ```java
    String str = "Java Programming";
    System.out.println(str.replace("a", "o").substring(5));
    ```

    <form>
      <input type="radio" name="q13" value="a"> ovo Progrmming<br>
      <input type="radio" name="q13" value="b"> oJava Programming<br>
      <input type="radio" name="q13" value="c"> Java Programming<br>
      <input type="radio" name="q13" value="d"> oProgrmming<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      o Progrmming  
      (Explanation: `replace("a", "o")` changes "Java Programming" to "Jovo Progrmming", and `substring(5)` removes the first 5 characters.)
    </details>

14. What will the output be of this code?

    ```java
    String str = "Java Programming";
    System.out.println(str.substring(5).replace('a', 'o'));
    ```

    <form>
      <input type="radio" name="q14" value="a"> Java Progrogramming<br>
      <input type="radio" name="q14" value="b"> Jovo Progrogramming<br>
      <input type="radio" name="q14" value="c"> Progrogramming<br>
      <input type="radio" name="q14" value="d"> Progrogramming<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Jovo Progrogramming  
      (Explanation: `substring(5)` extracts "Programming", and `replace('a', 'o')` changes 'a' to 'o'.)
    </details>

15. What does the following code print?

    ```java
    String str = "Hello";
    System.out.println(str.concat(" World").toUpperCase());
    ```

    <form>
      <input type="radio" name="q15" value="a"> HELLO WORLD<br>
      <input type="radio" name="q15" value="b"> hello world<br>
      <input type="radio" name="q15" value="c"> HELLO<br>
      <input type="radio" name="q15" value="d"> Hello World<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      HELLO WORLD  
      (Explanation: `concat(" World")` appends " World" to "Hello", and `toUpperCase()` converts it to "HELLO WORLD".)
    </details>

16. What will the following code output?

    ```java
    String str = "Java";
    System.out.println(str.toLowerCase().replace('a', 'o').substring(1, 3));
    ```

    <form>
      <input type="radio" name="q16" value="a"> vo<br>
      <input type="radio" name="q16" value="b"> Oa<br>
      <input type="radio" name="q16" value="c"> va<br>
      <input type="radio" name="q16" value="d"> Jo<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      vo  
      (Explanation: `toLowerCase()` converts "Java" to "java", `replace('a', 'o')` changes 'a' to 'o', and `substring(1, 3)` extracts "vo".)
    </details>

17. What will the following code print?

    ```java
    String str = "Java Programming";
    System.out.println(str.substring(5, 10).toUpperCase().concat(" is fun"));
    ```

    <form>
      <input type="radio" name="q17" value="a"> PROGRAMMING is fun<br>
      <input type="radio" name="q17" value="b"> PROGR is fun<br>
      <input type="radio" name="q17" value="c"> Program is fun<br>
      <input type="radio" name="q17" value="d"> PROGRAM is fun<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      PROGRAM is fun  
      (Explanation: `substring(5, 10)` extracts "Progr", `toUpperCase()` converts it to "PROGR", and `concat(" is fun")` appends " is fun".)
    </details>

18. What does this code print?

    ```java
    String str = "  Hello World  ";
    System.out.println(str.trim().substring(6).toLowerCase());
    ```

    <form>
      <input type="radio" name="q18" value="a"> world<br>
      <input type="radio" name="q18" value="b"> hello world<br>
      <input type="radio" name="q18" value="c"> Hello world<br>
      <input type="radio" name="q18" value="d"> hello<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      world  
      (Explanation: `trim()` removes spaces, `substring(6)` extracts "World", and `toLowerCase()` converts it to "world".)
    </details>

19. What will the following code print?

    ```java
    String str = "Hello";
    System.out.println(str.substring(1).toUpperCase().replace('E', 'O'));
    ```

    <form>
      <input type="radio" name="q19" value="a"> Ollo<br>
      <input type="radio" name="q19" value="b"> Ollo<br>
      <input type="radio" name="q19" value="c"> HELLO<br>
      <input type="radio" name="q19" value="d"> HOLO<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Ollo  
      (Explanation: `substring(1)` extracts "ello", `toUpperCase()` converts it to "ELLO", and `replace('E', 'O')` changes 'E' to 'O', resulting in "Ollo".)
    </details>

20. What is the result of the following code?

    ```java
    String str = "Java Programming";
    System.out.println(str.substring(5, 10).toLowerCase().replace('r', 'l'));
    ```

    <form>
      <input type="radio" name="q20" value="a"> progLamming<br>
      <input type="radio" name="q20" value="b"> proGLamming<br>
      <input type="radio" name="q20" value="c"> programming<br>
      <input type="radio" name="q20" value="d"> proLamming<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      proglamming  
      (Explanation: `substring(5, 10)` extracts "Prog", `toLowerCase()` converts it to "prog", and `replace('r', 'l')` changes 'r' to 'l', resulting in "proglamming".)
    </details>

[Back to Top](#top)

### Tricky MCQs

Here are 20 tricky and slightly confusing questions based on Java String methods:

1. What does the following code print?

    ```java
    String str = "Java";
    System.out.println(str.substring(2, 2));
    ```

    <form>
      <input type="radio" name="q1" value="a"> Empty string<br>
      <input type="radio" name="q1" value="b"> J<br>
      <input type="radio" name="q1" value="c"> a<br>
      <input type="radio" name="q1" value="d"> Error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Empty string  
      (Explanation: `substring(2, 2)` extracts from index 2 to index 2, so no characters are selected, resulting in an empty string.)
    </details>

2. What is the result of the following code?

    ```java
    String str = "Java Programming";
    System.out.println(str.substring(5, 20));
    ```

    <form>
      <input type="radio" name="q2" value="a"> Programming<br>
      <input type="radio" name="q2" value="b"> Error<br>
      <input type="radio" name="q2" value="c"> Java Programming<br>
      <input type="radio" name="q2" value="d"> Progr<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Error  
      (Explanation: `substring(5, 20)` will throw an error because the second index exceeds the length of the string.)
    </details>

3. What is the output of the following code?

    ```java
    String str = "Java Programming";
    System.out.println(str.replace('a', 'o').substring(4, 10));
    ```

    <form>
      <input type="radio" name="q3" value="a"> Progra<br>
      <input type="radio" name="q3" value="b"> Progr<br>
      <input type="radio" name="q3" value="c"> Prorg<br>
      <input type="radio" name="q3" value="d"> Prora<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Prorg  
      (Explanation: `replace('a', 'o')` replaces 'a' with 'o', so "Java Programming" becomes "Jovo Progromming". `substring(4, 10)` extracts "Prorg".)
    </details>

4. What will the output be?

    ```java
    String str = "Java";
    System.out.println(str.indexOf('a', 2));
    ```

    <form>
      <input type="radio" name="q4" value="a"> 1<br>
      <input type="radio" name="q4" value="b"> 2<br>
      <input type="radio" name="q4" value="c"> 3<br>
      <input type="radio" name="q4" value="d"> -1<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      3  
      (Explanation: `indexOf('a', 2)` starts searching from index 2, and the next 'a' is at index 3.)
    </details>

5. What is the output of this code?

    ```java
    String str = "Java";
    System.out.println(str.charAt(5));
    ```

    <form>
      <input type="radio" name="q5" value="a"> Error<br>
      <input type="radio" name="q5" value="b"> a<br>
      <input type="radio" name="q5" value="c"> J<br>
      <input type="radio" name="q5" value="d"> IndexOutOfBoundsException<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Error  
      (Explanation: `charAt(5)` is out of bounds since the string "Java" has a length of 4.)
    </details>

6. What will the output of this code be?

    ```java
    String str = "Java";
    System.out.println(str.substring(4));
    ```

    <form>
      <input type="radio" name="q6" value="a"> Empty string<br>
      <input type="radio" name="q6" value="b"> Java<br>
      <input type="radio" name="q6" value="c"> a<br>
      <input type="radio" name="q6" value="d"> Error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Empty string  
      (Explanation: `substring(4)` starts at index 4, but the string has only 4 characters, so it returns an empty string.)
    </details>

7. What will the following code print?

    ```java
    String str = "Java";
    System.out.println(str.replace("av", "o"));
    ```

    <form>
      <input type="radio" name="q7" value="a"> Jo<br>
      <input type="radio" name="q7" value="b"> Java<br>
      <input type="radio" name="q7" value="c"> Joo<br>
      <input type="radio" name="q7" value="d"> Javo<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Joo  
      (Explanation: `replace("av", "o")` replaces "av" with "o", resulting in "Joo".)
    </details>

8. What will the following code output?

    ```java
    String str = "Java";
    System.out.println(str.indexOf("va", 1));
    ```

    <form>
      <input type="radio" name="q8" value="a"> 1<br>
      <input type="radio" name="q8" value="b"> 2<br>
      <input type="radio" name="q8" value="c"> 3<br>
      <input type="radio" name="q8" value="d"> -1<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      2  
      (Explanation: `indexOf("va", 1)` starts searching from index 1, and "va" is found starting at index 2.)
    </details>

9. What is the output of this code?

    ```java
    String str = "Java";
    System.out.println(str.replace("a", "o").substring(1, 3));
    ```

    <form>
      <input type="radio" name="q9" value="a"> Jovo<br>
      <input type="radio" name="q9" value="b"> ovo<br>
      <input type="radio" name="q9" value="c"> Ova<br>
      <input type="radio" name="q9" value="d"> Jo<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      vo  
      (Explanation: `replace("a", "o")` changes "Java" to "Jovo", and `substring(1, 3)` extracts "vo".)
    </details>

10. What will be the output of this code?

    ```java
    String str = "Java";
    System.out.println(str.charAt(str.length() - 1));
    ```

    <form>
      <input type="radio" name="q10" value="a"> J<br>
      <input type="radio" name="q10" value="b"> a<br>
      <input type="radio" name="q10" value="c"> Error<br>
      <input type="radio" name="q10" value="d"> IndexOutOfBoundsException<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      a  
      (Explanation: `str.length() - 1` calculates the index of the last character, which is 'a'.)
    </details>

11. What is the output of this code?

    ```java
    String str = "Java Programming";
    System.out.println(str.substring(5, 5));
    ```

    <form>
      <input type="radio" name="q11" value="a"> Programming<br>
      <input type="radio" name="q11" value="b"> Empty string<br>
      <input type="radio" name="q11" value="c"> Java Programming<br>
      <input type="radio" name="q11" value="d"> Error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Empty string  
      (Explanation: `substring(5, 5)` extracts a substring starting and ending at index 5, so the result is an empty string.)
    </details>

12. What will be the output of this code?

    ```java
    String str = "Java";
    System.out.println(str.toLowerCase().concat(" Programming").substring(0, 10));
    ```

    <form>
      <input type="radio" name="q12" value="a"> java Program<br>
      <input type="radio" name="q12" value="b"> java progra<br>
      <input type="radio" name="q12" value="c"> Java Program<br>
      <input type="radio" name="q12" value="d"> java program<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      java program  
      (Explanation: `toLowerCase()` converts "Java" to "java", `concat(" Programming")` appends " Programming", and `substring(0, 10)` extracts "java progra".)
    </details>

13. What does this code output?

    ```java
    String str = "Hello World";
    System.out.println(str.indexOf('o', 5));
    ```

    <form>
      <input type="radio" name="q13" value="a"> 5<br>
      <input type="radio" name="q13" value="b"> 7<br>
      <input type="radio" name="q13" value="c"> 4<br>
      <input type="radio" name="q13" value="d"> 6<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      7  
      (Explanation: `indexOf('o', 5)` searches for 'o' starting from index 5, and the next 'o' is at index 7.)
    </details>

14. What will this code print?

    ```java
    String str = "Java Programming";
    System.out.println(str.replace(" ", ""));
    ```

    <form>
      <input type="radio" name="q14" value="a"> Java Programming<br>
      <input type="radio" name="q14" value="b"> JavaProgramming<br>
      <input type="radio" name="q14" value="c"> Error<br>
      <input type="radio" name="q14" value="d"> Java<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      JavaProgramming  
      (Explanation: `replace(" ", "")` removes all spaces from the string.)
    </details>

15. What is the output of this code?

    ```java
    String str = "Java Programming";
    System.out.println(str.replace("a", "o").substring(5, 15).toUpperCase());
    ```

    <form>
      <input type="radio" name="q15" value="a"> OPROGRAMMING<br>
      <input type="radio" name="q15" value="b"> PROGR OGRAMMING<br>
      <input type="radio" name="q15" value="c"> PROGR OGRAMMING<br>
      <input type="radio" name="q15" value="d"> PROGRAMMING<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      OPROGRAMMING  
      (Explanation: `replace("a", "o")` replaces "a" with "o", then `substring(5, 15)` extracts "Programming", and `toUpperCase()` converts it to uppercase.)
    </details>

16. What is the result of the following?

    ```java
    String str = "Hello";
    System.out.println(str.substring(1, 3).toUpperCase());
    ```

    <form>
      <input type="radio" name="q16" value="a"> EL<br>
      <input type="radio" name="q16" value="b"> He<br>
      <input type="radio" name="q16" value="c"> lo<br>
      <input type="radio" name="q16" value="d"> HEL<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      EL  
      (Explanation: `substring(1, 3)` extracts "el", and `toUpperCase()` converts it to "EL".)
    </details>

17. What will this code print?

    ```java
    String str = "Java Programming";
    System.out.println(str.indexOf("Java") == 0);
    ```

    <form>
      <input type="radio" name="q17" value="a"> true<br>
      <input type="radio" name="q17" value="b"> false<br>
      <input type="radio" name="q17" value="c"> Error<br>
      <input type="radio" name="q17" value="d"> false<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      true  
      (Explanation: `indexOf("Java") == 0` checks if "Java" starts at index 0, which is true.)
    </details>

18. What does this code print?

    ```java
    String str = "Java";
    System.out.println(str.charAt(str.length()));
    ```

    <form>
      <input type="radio" name="q18" value="a"> a<br>
      <input type="radio" name="q18" value="b"> Error<br>
      <input type="radio" name="q18" value="c"> Java<br>
      <input type="radio" name="q18" value="d"> IndexOutOfBoundsException<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Error  
      (Explanation: `charAt(str.length())` causes an error because index `str.length()` is out of bounds.)
    </details>

19. What will the following code print?

    ```java
    String str = "   Hello ";
    System.out.println(str.trim().length());
    ```

    <form>
      <input type="radio" name="q19" value="a"> 5<br>
      <input type="radio" name="q19" value="b"> 6<br>
      <input type="radio" name="q19" value="c"> 7<br>
      <input type="radio" name="q19" value="d"> 4<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      5  
      (Explanation: `trim()` removes the spaces, leaving "Hello", and the length is 5.)
    </details>

20. What does this code print?

    ```java
    String str = "Java Programming";
    System.out.println(str.substring(5, 20));
    ```

    <form>
      <input type="radio" name="q20" value="a"> Error<br>
      <input type="radio" name="q20" value="b"> Progr<br>
      <input type="radio" name="q20" value="c"> Programming<br>
      <input type="radio" name="q20" value="d"> Program<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Error  
      (Explanation: The second argument in `substring(5, 20)` is greater than the length of the string, so it throws an error.)
    </details>

[Back to Top](#top)
