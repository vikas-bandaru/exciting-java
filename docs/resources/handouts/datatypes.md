---
layout: default
title: Data Types
parent: Java
grand_parent: Handouts
nav_order: 2
---

# Handouts

## Java Data Types

Java’s type system is based on two distinct kinds of types: primitive types, and object types.  
Primitive types are stored in variables directly, and they have value semantics (values are copied when assigned to another variable). Primitive types are not associated with classes and do not have methods.  
In contrast, an object type is manipulated by storing a reference to the object (not the object itself). When assigned to a variable, only the reference is copied, not the object.

### Primitive Types

The following table lists all the primitive types of the Java language:

| Type name       | Description                     | Example literals |       |          |
| :-------------- | :------------------------------ | :--------------- | :---- | :------- |
| Integer numbers |                                 |                  |       |          |
| `byte`          | byte-sized integer (8 bit)      | 24               | -2    |
| `short`         | short integer (16 bit)          | 137              | -119  |
| `int`           | integer (32 bit)                | 5409             | -2003 |
| `long`          | long integer (64 bit)           | 423266353L       | 55L   |
| Real numbers    |
| `float`         | single-precision floating point | 43.889F          |
| `double`        | double-precision floating point | 45.63            | 2.4e5 |
| Other types     |
| `char`          | a single character (16 bit)     | 'm'              | '?'   | '\u00F6' |
| `boolean`       | a boolean value (true or false) | true             | false |

Notes:

- A number without a decimal point is generally interpreted as an int but automatically converted to `byte`, `short`, or `long` types when assigned (if the value fits). You can declare a literal as long by putting an `L` after the number. (`l`, lowercase `L`, works as well but should be avoided because it can easily be mistaken for a one (1).)
- A number with a decimal point is of type `double`. You can specify a `float` literal by putting an `F` or `f` after the number.
- A character can be written as a single Unicode character in single quotes or as a four-digit Unicode value, preceded by “\u”.
- The two boolean literals are `true` and `false`.

Because variables of the primitive types do not refer to objects, there are no methods associated with the primitive types. However, when used in a context requiring an object type, autoboxing might be used to convert a primitive value to a corresponding object. See Section B.4 for more details.  
The following table details minimum and maximum values available in the numerical types.

| Type name | Minimum              | Maximum             |
| :-------- | :------------------- | :------------------ |
| byte      | -128                 | 127                 |
| short     | -32768               | 32768               |
| int       | -2147483648          | 2147483648          |
| long      | -9223372036854775808 | 9223372036854775808 |

|        | Positive Minimum | Positive Maximum       |
| :----- | :--------------- | :--------------------- |
| float  | 1.4e-45          | 3.4028235e38           |
| double | 4.9e-324         | 1.7976931348623157e308 |

#### Casting of primitive types

Sometimes it is necessary to convert a value of one primitive type to a value of another primitive type—typically, a value from a type with a particular range of values to one with a smaller range. This is called _casting_. Casting almost always involves loss of information — for example, when converting from a floating-point type to an integer type. Casting is permitted in Java between the numeric types, but it is not possible to convert a boolean value to any other type with a cast, or vice versa. The cast operator consists of the name of a primitive type written in parentheses in front of a variable or an expression. For instance,  
`int val = (int) mean;`  
If mean is a variable of type double containing the value 3.9, then the statement above would store the integer value 3 (conversion by truncation) in the variable val.

### Object types

All types not listed in first section of this article, Primitive types, are object types. These include class and interface types from the Java library (such as String) and user-defined types.  
A variable of an object type holds a reference (or “pointer”) to an object. Assignments and parameter passing have reference semantics (i.e., the reference is copied, not the object). After assigning a variable to another one, both variables refer to the same object. The two variables are said to be aliases for the same object. This rule applies in simple assignment between variables, but also when passing an object as an actual parameter to a method. As a consequence, state changes to an object via a formal parameter will persist, after the method has completed, in the actual parameter.  
Classes are the templates for objects, defining the fields and methods that each instance possesses.  
Arrays behave like object types; they also have reference semantics. There is no class definition for arrays.

### Wrapper classes

Every primitive type in Java has a corresponding wrapper class that represents the same type but is a real-object type. This makes it possible to use values from the primitive types where object types are required, through a process known as _autoboxing_. The following table lists the primitive types and their corresponding wrapper type from the java.lang package. Apart from Integer and Character, the wrapper class names are the same as the primitive-type names, but with an uppercase first letter.  
Whenever a value of a primitive type is used in a context that requires an object type, the compiler uses autoboxing to automatically wrap the primitive-type value in an appropriate wrapper object. This means that primitive-type values can be added directly to a collection, for instance. The reverse operation — _unboxing_ — is also performed automatically when a wrapper-type object is used in a context that requires a value of the corresponding primitive type.

| Primitive type | Wrapper type |
| :------------- | :----------- |
| byte           | Byte         |
| short          | Short        |
| int            | Integer      |
| long           | Long         |
| float          | Float        |
| double         | Double       |
| char           | Character    |
| boolean        | Boolean      |

#### Casting of object types

Because an object may belong to an inheritance hierarchy of types, it is sometimes necessary to convert an object reference of one type to a reference of a subtype lower down the inheritance hierarchy. This process is called _casting_ (or _downcasting_). The cast operator consists of the name of a class or interface type written in parentheses in front of a variable or an expression. For instance,  
`Car c = (Car) veh;`  
If the declared (i.e., static) type of variable veh is `Vehicle` and `Car` is a subclass of `Vehicle`, then this statement will compile. A separate check is made at runtime to ensure that the object referred to by `veh` really is a `Car` and not an instance of a different subtype.  
It is important to appreciate that casting between object types is completely different from casting between primitive types (second section, above). In particular, casting between object types involves _no change_ of the object involved. It is purely a way of gaining access to type
information that is already true of the object — that is, part of its full dynamic type.
