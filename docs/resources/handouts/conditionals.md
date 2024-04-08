---
layout: default
title: Conditionals
parent: Handouts
nav_order: 3
---

# Handouts

## Selection statements (Decision-making statements or Conditionals)

1. ### `if-else`

The `if-else` statement has two main forms, both of which are controlled by the evaluation
of a *boolean expression*:

```java
if (boolean expression) {
    // statements
}
```
In the first form, the value of the *boolean expression* is used to decide whether or not to
execute the statements.
```java
if (boolean expression) {
    // statements
} else {
    // statements
}
```
In the second form, the expression is used to choose between **two alternative sets** of statements, *only one of which will be executed*.  
Examples:

```java
if(field.size() == 0) {
    System.out.println("The field is empty.");
}
if(number < 0) {
    reportError();
}
else {
    processNumber(number);
}
```
It is very common to link if-else statements together by placing a second if-else in the else
part of the first. This can be continued any number of times. It is a good idea to always
include a final else part.  

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