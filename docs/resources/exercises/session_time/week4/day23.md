---
layout: default
title: Sessions
parent: Day 23
grand_parent: Week 4
has_children: true
nav_order: 1
---

# Module 1: Java Foundations
{: .no_toc }
### Day 23: Grouping Objects (ArrayList & String)
{: .no_toc }

<details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. [Session 1](#session-1)
   {:toc}
2. [Session 2](#session-2)
   {:toc}
</details>

## Session 1

Troubleshooting Assignment issues: **CodingBat**

## Session 2

**Diamond notation**  
Note that when creating the `ArrayList` instance, we have written the following statement:  
> `files = new ArrayList<>();`

This is the so-called *diamond notation* (because the two angle brackets create a diamond shape)
and it looks unusual. We have seen earlier that the new statement has the following form:
> `new type-name(parameters)`  

and we have also seen that the full type name for our collection is  
> `ArrayList<String>`

Therefore, with an empty parameter list, the statement to create the new collection object
should look as follows:
> `files = new ArrayList<String>();`  

Indeed, writing this statement would work as well. The first version, using the diamond
notation (thus leaving out the mention of the `String` type) is merely a shortcut notation for
convenience. If the creation of the collection object is combined with an assignment, then
the compiler can work out the type of the collection elements from the type of the variable
on the left hand side of the assignment, and Java allows us to skip defining it again. The
element type is automatically inferred from the variable type.  
Using this form does not change the fact that the object being created will only be able to store
String objects; it is just a convenience that saves us some typing and makes our code shorter.

**Key methods of `ArrayList`**  
- `add`
- `size`
- `get`
- `remove`

Check the source code of `MusicOrganizer` and find if these methods are used anywhere.

### Object Structures with collections

There are at least three important features of the `ArrayList` class that you should observe:
- It is able to increase its internal capacity as required: as more items are added, it simply
makes enough room for them.
- It keeps its own private count of how many items it is currently storing. Its `size` method
returns that count.
- It maintains the order of items you insert into it. The add method stores each new item
at the end of the list. You can later retrieve them in the same order.

Let's understand this with some object diagrams.

We will discuss more about the features of `ArrayList` in the next session.

### Generic classes

The new notation using the angle brackets deserves a little more discussion. The type of our
files field was declared as:  
> `ArrayList<String>`

The class we are using here is simply called `ArrayList`, but it requires a second type to
be specified as a parameter when it is used to declare fields or other variables. Classes that
require such a type parameter are called generic classes. Generic classes, in contrast to other
classes we have seen so far, do not define a single type in Java, but potentially many types.
The `ArrayList` class, for example, can be used to specify an *ArrayList of String*, an *ArrayList of Person*, an *ArrayList of Rectangle*, or an `ArrayList` of any other class that we have available. Each particular `ArrayList` is a separate type that can be used in declarations of fields, parameters, and return values. We could, for example, define the following two fields:  
> `private ArrayList<Person> members;`  
`private ArrayList<TicketMachine> machines;`

These definitions state that members refers to an `ArrayList` that can store `Person` objects, while machines can refer to an `ArrayList` to store `TicketMachine` objects. Note that `ArrayList<Person>` and `ArrayList<TicketMachine>` are different types. The fields cannot be assigned to each other, even though their types were derived from the same `ArrayList` class.

**Let's Experiment**  
1. Write a declaration of a private field named `library` that can hold an `ArrayList`. The elements of the `ArrayList` are of type `Book`.
2. Write a declaration of a local variable called `cs101` that can hold
an `ArrayList` of `Student`.
3. Write a declaration of a private field called `tracks` for storing a
collection of `MusicTrack` objects.
4. Write assignments to the `library`, `cs101`, and `track` variables
(which you defined in the previous three exercises) to create the appropriate
`ArrayList` objects. Write them once using diamond notation and once without
diamond notation, specifying the full type.

Generic classes are used for a variety of purposes; we will encounter more of them later in
the book. For now, collections such as `ArrayList`, and some other collections that we shall
encounter shortly, are the only generic classes we need to deal with.

### Numbering wtih collections

Let's understand the concept of indexing in collections, esp. `ArrayList`  

**Let's Experiment**  
1. If a collection stores 10 objects, what value would be returned
from a call to its `size` method?
2. Write a method call using `get` to return the fifth object stored in
a collection called items.
3. What is the index of the last item stored in a collection of 15
objects?
4. Write a method call to add the object held in the variable
`favoriteTrack` to a collection called `files`.

[Back to Top](#top)