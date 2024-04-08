---
layout: default
title: Conditionals
parent: Java
grand_parent: Handouts
nav_order: 3
---

# Handouts

## Selection statements (Decision-making statements or Conditionals)

1. ### `if-else`

   The `if-else` statement has two main forms, both of which are controlled by the evaluation of a *boolean expression*:

   ***First form** of `if-else`:*

   ```java
   if (boolean expression) {
       // statements
   }
   ```
   In the first form, the value of the *boolean expression* is used to decide whether or not to execute the statements.

      **Example:**

      ```java
      if(field.size() == 0) {
          System.out.println("The field is empty.");
      }
      ```

   ***Second form** of `if-else`:*

   ```java
   if (boolean expression) {
       // statements
   } else {
       // statements
   }
   ```
   In the second form, the expression is used to choose between **two alternative sets** of statements, *only one of which will be executed*.  

      **Example:**  

      ```java
      if(number < 0) {
          reportError();
      }
      else {
          processNumber(number);
      }
      ```

   **A special form of `if-else`:**

   It is **very common** to *link `if-else`* statements together by placing a second `if-else` in the `else` part of the first. This can be continued any number of times. It is **a good idea** to always include a final `else` part.  

   ```java
   if(n < 0) {
       handleNegative();
   }
   else if(n == 0) {
       handleZero();
   }
   else {
       handlePositive();
   }
   ```

2. ### `switch`
   The `switch` statement switches on a single value to one of an arbitrary number of cases. There are two possible patterns of use:  

   ```java
   switch(expression) {
        case value : statements;
                     break;
        case value : statements;
                     break;
        further cases possible
        default : statements;
                     break;             
   }
   ```  
   
   **Notes:**
   - A *switch statement* can have any number of `case` labels.
   - The `break` instruction after every case is needed, otherwise the execution "falls through" into the next label’s statements.
   - The `default` case is optional. If no default is given, it may happen that no case is executed.
   - The `break` instruction after the `default` (or the last case, if there is no default) is *not needed* but is considered **good practice**.  

   **Example:**

   ```java
   switch(day) {
        case 1: dayString = "Monday";
                break;
        case 2: dayString = "Tuesday";
                break;
        case 3: dayString = "Wednesday";
                break;
        case 4: dayString = "Thursday";
                break;
        case 5: dayString = "Friday";
                break;
        case 6: dayString = "Saturday";
                break;
        case 7: dayString = "Sunday";
                break;
        default: dayString = "invalid day";
                break;
   }
   ```

   **Another form of `switch`:**

   ```java
   switch(expression) {
        case value1:
        case value2:
        case value3:
            statements;
            break;
        case value4:
        case value5:
            statements;
            break;
        further cases possible
        default:
            statements;
            break;
   }
   ```

   **Notes:**
   - The second form above makes use of "falls through" situation. In this case, all three of the first values will execute the first *statements* section, whereas values four and five will execute the second *statements* section.  
   
   **Example:**  

   ```java
   switch(month) {
        case 11:
        case 12:
        case 1:
        case 2:
            season = "Winter";
            break;
        case 3:
        case 4:
        case 5:
            season = "Summer";
            break;
        case 6:
        case 7:
        case 8:
            season = "Rain";
            break;
        case 9:
        case 10:
            season = "Autumn";
            break;
        default: dayString = "invalid month";
                break;
   }
   ```

   **Notes:**  
   - The expression used to switch on and the case labels may be strings.

   **Example:**

   ```java
   switch(dow.toLowerCase()) {
        case "mon":
        case "tue":
        case "wed":
        case "thu":
        case "fri":
        case "sat":
            goToWork();
            break;
        case "sun":
            stayInBed();
            break;
   }
   ```

   **Notes:**
   - The expression and case labels may be of an enumerated type. The type name is omitted from the labels.