---
layout: default
title: Work from Home
parent: Day 16
grand_parent: Week 3
nav_order: 2
---

# Module 1: Java Foundations
## Week 3: Foundations of OOP & Algorithmic Thinking
### Day 16: Object Interactions (The Clock project)

## Work from Home 
1. Write two more internal methods: `setVisible` and `move` in `Picture` class. Make internal method calls to both these methods in `draw` method.
2. You are developing a class to represent a book in a library management system. Each book has a title, an author, and an ISBN (International Standard Book Number). Additionally, some books have a publication year, while others don't. You need to create a Java class that allows flexibility in initializing book objects with or without a publication year.

   <details markdown="block">
     <summary> Hint </summary>
     Provide 2 constructors: one that takes publication year as input and initializes it; another that doesn't
   </details>

### Challenge Exercises
1. Change the clock from a 24-hour clock to a 12-hour clock. Be careful: This is not as easy as it may seem. In a 12-hour clock, the hours after midnight and after noon are not shown as 00:30, but as 12:30. Thus, the minute display shows values from 0 to 59, while the hour display shows values from 1 to 12!
2. There are (at least) two ways in which you can make a 12-hour clock. One possibility is to just store hour values from 1 to 12. On the other hand, you can simply leave the clock to work internally as a 24-hour clock but change the display string of the clock display to show 4:23 or 4:23pm when the internal value is 16:23. Implement both versions. Which option is easier? Which is better? Why?
3. Assume a class `Tree` has a field of type `Triangle` called
`leaves` and a field of type `Square` called `trunk`. The constructor of `Tree` takes no parameters and its constructor creates the `Triangle` and `Square` objects for its fields. Using the *figures* project, create a simple `Tree` class to fit this description. You do not need to define any methods in the class and the shapes do not have to be made visible.
4. Challenge exercise Complete the `Tree` class described in the previous exercise, by having the constructor move the `trunk` square beneath the `leaves` triangle and then make both shapes visible. Do this by defining a method in the `Tree` class called `setup` and include a call to this method in the constructor of `Tree`. Change the size of the triangle so that it looks more like the leaves of a *fir tree* growing from the trunk.