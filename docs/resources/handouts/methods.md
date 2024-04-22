---
layout: default
title: Methods
parent: Java
grand_parent: Handouts
nav_order: 2
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

### Forms of Methods
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