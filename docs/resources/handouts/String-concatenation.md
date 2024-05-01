---
layout: default
title: String concatenation
parent: Java
grand_parent: Handouts
nav_order: 5
---

# Handouts
---
## String Concatenation

The plus operator (**+**) has different meanings, depending on the type of its operands. If both
operands are numbers, it represents addition, as we would expect. Thus,
> **42 + 12**

adds those two numbers, and the result is 54. However, if the operands are strings, then the
meaning of the plus sign is string concatenation, and the result is a single string that consists
of both operands stuck together. For example, the result of the expression
> **"Java" + "with BlueJ"**

is the single string
> **"Javawith BlueJ"**

Note that the system does not automatically add a space between the strings. If you want a
space, you have to include it yourself within one of the strings.  
If one of the operands of a plus operation is a string and the other is not, then the other
operand is automatically converted to a string, and then a string concatenation is performed.
Thus,
> **"answer: " + 42**

results in the string  
> **"answer: 42"**

This works for all types. Whatever type is “added” to a string is automatically converted to
a string and then concatenated.  