---
layout: default
title: Operators
parent: Handouts
nav_order: 2
---

# Handouts
---
## Operators

### Arithmetic Expressions
Java has a considerable number of operators available for both arithmetic and logical expressions.
The below Table shows everything that is classified as an operator, including things such
as type casting and parameter passing.  
Most of the operators are either **binary** operators (taking a left and a right operand) or **unary** operators (taking a single operand).  
The main **binary arithmetic operations** are:  
`+` *addition*  
`−` *subtraction*  
`*` *multiplication*  
`/` *division*  
`%` *modulus*, or *remainder after division*  

**Note:** The results of both division and modulus operations depend on whether their operands are integers
or floating-point values. Between two integer values, division yields an integer result and
discards any remainder, but between floating-point values, a floating-point value is the result:  
`5 / 3` gives a result of `1`  
`5.0 / 3` gives a result of `1.6666666666666667`  
(Note that only one of the operands needs to be of a floating-point type to produce a floatingpoint
result.)  

*Java Operators, highest precedence at the top*  

|:---|:---|:---|:---|:---|:---|   
| `[]` | `.` | `++` | `--` | (*parameters*) | |
| `++` | `−−` | `+` | `−` | `!` | `~` |
| `new` | (*cast*) | | | | |
| `*` | `/` | `%` | | | |
| `+` | `−` | | | | |
| `<<` | `>>` | `>>>` | | | |
| `<` | `>` | `>=` | `<=` | `instanceof` | |
| `==` | `!=` | | | | |
| `&` | | | | | |
| `^` | | | | | |
| ```|``` | | | | |
| `&&` | | | | | |
| `||` | | | | | |
| `? :` | | | | | |
| `=` | `+=` | `−=` | `*=` | `/=` | `%=` | `>>=` | `<<=` | `>>>=` | `&=` | `|=` | `^=` |

When more than one operator appears in an expression, then *rules of precedence* have to
be used to work out the order of application. In the above Table, those operators having the *highest
precedence* appear **at the top**, so we can see that multiplication, division, and modulus
all take precedence over addition and subtraction, for instance. This means that both of the
following examples give the result `100`:  
`51 * 3 − 53`  
`154 − 2 * 27`  
**Binary operators** with the *same precedence level* are evaluated from **left to right**.  
**Unary operators** with the *same precedence level* are evaluated **right to left**.  
When it is necessary to alter the normal order of evaluation, parentheses can be used. So
both of the following examples give the result 100:  
`(205 − 5) / 2`  
`2 * (47 + 3)`  
The main unary operators are `−`, `!`, `++`, `−−`, `[]`, and `new`. You will notice that `++` and `−−`
appear in each of the top two rows in the above Table. Those in the top row take a single operand
on their left (**post**-operation), while those in the second row take a single operand on their right (**pre**-operation).  

### Boolean Expressions

In boolean expressions, operators are used to combine operands to produce a value of either
`true` or `false`. Such expressions are usually found in the test expressions of **if-else** statements
and **loops**.  
The *relational operators* usually combine a pair of arithmetic operands, although the tests for
equality and inequality are also used with object references. Java’s **relational operators** are:

|:--|:--|
| `==` equal to | `!=` not equal to |
| `<` less than | `<=` less than or equal to |
| `>` greater than | `>=` greater than or equal to |

The binary *logical operators* combine two boolean expressions to produce another boolean
value. The **logical operators** are:  

|:--|
| `&&` and |
| `||` or |
| `^` exclusive or |

In addition,

|:--|
| `!` not |

takes a single boolean expression and changes it from `true` to `false` and vice versa.

### Short-circuit Operators

Both `&&` and `||` are slightly unusual in the way they are applied. If the left operand of `&&` is
`false`, then the value of the right operand is irrelevant and will not be evaluated. Similarly,
if the left operand of `||` is `true`, then the right operand is not evaluated. Thus, they are
known as *short-circuit operators*.