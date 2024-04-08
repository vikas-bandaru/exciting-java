---
layout: default
title: Loops
parent: Java
grand_parent: Handouts
nav_order: 4
---

# Handouts

## Loops
Java has three loops: `while`, `do-while`, and `for`.  
- The `for` loop has two forms.
- Both `while` and `do-while` are well suited for indefinite iteration.  
- The `for-each` loop is intended for definite iteration over a collection, and the `for` loop falls somewhere between the two.
- Except for the `for-each` loop, repetition is controlled in each with a boolean expression.

1. ### `while`
   The `while` loop executes a block of statements as long as a given expression evaluates to `true`. The expression is tested *before* execution of the loop body, so the body *may be executed zero times* (i.e., not at all). This capability is an **important feature** of the `while` loop.

   ```java
   while(boolean expression) {
        // statements
   }
   ```

   **Examples:**

   ```java
   System.out.print("Please enter a filename: ");
   input = readInput();
   while(input == null) {
        System.out.print("Please try again: ");
        input = readInput();
   }
   ```

   ```java
   int index = 0;
   boolean found = false;
   while(!found && index < list.size()) {
        if(list.get(index).equals(item)) {
            found = true;
        }
        else {
            index++;
        }
   }
   ```

2. ### `do-while`
   The *`do-while` loop* executes a block of statements as long as a given expression evaluates to `true`. The expression is tested *after* execution of the loop body, so the body *always executes at least once*. This is an **important difference** from the *while loop*.  

   ```java
   do {
        // statements
   } while(boolean expression);
   ```

   **Example:**

   ```java
   do {
        System.out.print("Please enter a filename: ");
        input = readInput();
   } while(input == null);
   ```

3. ### `for`
   The *`for` loop* has two different forms:  
   
   3.a. **`for-each` loop**

      It is used exclusively to iterate over elements of a collection. The loop variable is assigned the value of successive elements of the collection on each iteration of the loop.

      ```java
      for (variable-declaration : collection) {
            // statements
      }
      ```

      **Example:**  

      ```java
      for(String note : list) {
            System.out.println(note);
      }
      ```

      **Notes:**
      - No associated index value is made available for the elements of the collection.
      - A for-each loop **cannot be used** if the collection is to be modified while it is being iterated over.
   
   3.b. **Traditional `for` loop**

      It executes as long as a *condition* evaluates to `true`.  
      - Before the loop starts, an *initialization statement* is executed **exactly once**. 
      - The *condition* is evaluated before every execution of the loop body (so the statements in the loop’s body may execute zero times).
      - An *update statement* is executed after each execution of the loop body.

      ```java
      for (initialization; condition; update) {
            // statements
      }
      ```

      **Example:**

      ```java
      for(int i = 0; i < text.size(); i++) {
            System.out.println( text.get(i) );
      }
      ```
   Both types of `for` loop are commonly used to execute the body of the loop a definite number of times — for instance, once for each element in a collection — although a for loop is actually closer in effect to a while loop than to a for-each loop.
