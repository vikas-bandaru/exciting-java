---
layout: default
title: Methods
parent: Java
grand_parent: Handouts
nav_order: 1
---

# Handouts

## Java Methods

Here's a breakdown of Java methods focusing on the parts of a method header:

### Syntax of a Method

```java
<return_type> methodName(<parameter1_type> parameter1, <parameter2_type> parameter2, ...)
{
    // Method body
}
```

- `<return_type>`: The data type of the value that the method returns. It can be `void` if the method doesn't return anything.
- `methodName`: The name of the method, which should follow Java naming conventions.
- `<parameter1_type>`, `<parameter2_type>`, ...: The data types of the method's parameters.
- `parameter1`, `parameter2`, ...: The names of the method's parameters.

- Methods consist of two parts: a *header* and a *body*.  

**Note: Method header**  
> It is important to distinguish between method headers and field declarations, because they can look quite similar.  
  *Example:*  
  We can tell that `getPrice` is a method and not a field because method headers always include a pair of parentheses – “(” and “)” – and no semicolon at the end of the header.

**Note: Method body**  
> The method body is the remainder of the method after the header. It is always enclosed by a matching pair of curly brackets: “{“ and “}”. Method bodies contain the *declarations* and *statements* that define what an object does when that method is called. Declarations are used to create additional, temporary variable space, while statements describe the actions of the method. In `getPrice`, the method body contains a single statement, but we shall soon see examples where the method body consists of many lines of both declarations and statements.  
- Any set of declarations and statements between a pair of matching curly brackets is known as a *block*. So the body of the `TicketMachine` class, the bodies of the constructor, and all of the methods within the class are blocks.

![field def vs method def](../exercises/session_time/images/field%20vs%20method%20def.PNG)

**Return statement**  
Within the body of `getPrice` there is a single statement:  
`return price;`  
This is called a *return statement*.
- It is always the final statement of that method, because no further statements in the method will be executed once the return statement is executed.
- Return types and return statements work together. The `int` return type of `getPrice` is a form of promise that the body of the method will do something that ultimately results in an integer value being calculated and returned as the method’s result. You might like to think of a method call as being a form of question to an object, and the return value from the method being the object’s answer to that question. In this case, when the `getPrice` method is called on a ticket machine, the question is, What do tickets cost? A ticket machine does not need to perform any calculations to be able to answer that, because it keeps the answer in its `price` field. So the method answers by just returning the value of that variable. As we gradually develop more-complex classes, we shall inevitably encounter more-complex questions that require more work to supply their answers.
  ![return statement](../exercises/session_time/images/return%20stmt.PNG)
- "returning a value" means that some information is passed internally between two different parts of the
program. One part of the program has requested information from an object via a method call, and the return value is the way the object passes that information back to the caller.
- People often think it means that something is printed by the program. This is not the case at all — we
shall see how printing is done when we look at the `printTicket` method.

- A `void` return type means that the method does not return any value to its caller. This is significantly different from all other return types.
- Within the body of a `void` method, this difference is reflected in the fact that there is *no return statement*.

### Different Ways Methods can be written
1. **Method without parameters and return type `void`**

    ```java
    void methodName()
    {
        // Method body
    }
    ```
   Example:

    ```java
    void greet()
    {
        System.out.println("Hello, world!");
    }
    ```

2. **Method with parameters and return type**

    ```java
    <return_type> methodName(<parameter1_type> parameter1, <parameter2_type> parameter2, ...) {
        // Method body
        return <value>; // Return statement
    }
    ```
   Example:

    ```java
    int add(int a, int b) {
        return a + b;
    }
    ```

### Examples:
1. **Method to check if a number is even**

    ```java
    boolean isEven(int num) {
        return num % 2 == 0;
    }
    ```

2. **Method to concatenate two strings**

    ```java
    String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }
    ```

**Notes**
- Methods can have different access modifiers (public, private, protected, default) which control their visibility.
- Method parameters are separated by commas.
- The return type can be any valid Java data type including primitives (int, boolean) and objects (String).
- A method may or may not have parameters.
- The `void` return type indicates that the method does not return any value.
- Methods can have any number of parameters including zero.
- The return statement is used to exit the method and return a value if the method has a return type other than `void`.