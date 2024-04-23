---
layout: default
title: Work from home
parent: Day 7
grand_parent: Week 2
nav_order: 2
---

# Module 1: Java Foundations
## Week 2: Foundations of OOP & Algorithmic Thinking
### Day 7: Objects & Classes

## Work from Home
### *house* project BlueJ Challenges
1. Add a sunset to the single-sun version of `Picture`. That is, make the sun go down slowly. Remember: The circle has a method `slowMoveVertical` that you can use to do this.
2. If you added your sunset to the end of the `draw` method (so that the sun goes down automatically when the picture is drawn), change this now. We now want the sunset in a separate method, so that we can call `draw` and see the picture with the sun up, and then call `sunset` (a separate method!) to make the sun go down.
3. Make a person walk up to the house after the sunset.

### String and Concatenation operator Method Practice
1. Write a method header named `greetWithName` that takes a `String` parameter representing a name and returns a greeting message by concatenating the name with "Hello, ".  
   Your method should meet at least the following test cases:  
   `greetWithName("Alice") --> "Hello, Alice"`  
   `greetWithName("Bob") --> "Hello, Bob"`  
   `greetWithName("Charlie") --> "Hello, Charlie"`

   <!-- <details>
     <summary> Solution </summary>
     
     ```java
     public String greetWithName(String name)
     {
         return "Hello, " + name ;
     }
     ```
   </details> -->
2. Write a method header called `createFullName` that takes two String parameters representing a first name and a last name, and returns the full name by concatenating them.
   Your method should meet at least the following test cases:  
   `createFullName("John", "Doe") --> "John Doe"`  
   `createFullName("Jane", "Smith") --> "Jane Smith"`  
   `createFullName("Michael", "Johnson") --> "Michael Johnson"`

   <!-- <details>
     <summary>
       Solution
     </summary>

     ```java
     public String createFullName(String firstName, String lastName)
     {
         return firstName + " " + lastName;
     }
     ```
   </details> -->
3. Write a method header named `addSuffix` that takes two String parameters representing a word and a suffix, and returns the word with the suffix appended to it.
   Your method should meet at least the following test cases:  
   `addSuffix("play", "ing") --> "playing"`  
   `addSuffix("jump", "ed") --> "jumped"`  
   `addSuffix("eat", "s") --> "eats"`

4. Write a method header named `createEmail` that takes two String parameters representing a username and a domain, and returns an email address by concatenating them with "@" in between.
   Your method should meet at least the following test cases:  
   `createEmail("john", "example.com") --> "john@example.com"`  
   `createEmail("jane", "gmail.com") --> "jane@gmail.com"`  
   `createEmail("alice", "yahoo.com") --> "alice@yahoo.com"`  

5. Write a method header called `generateUsername` that takes a String parameter representing a name and returns a username by concatenating the name with a randomly generated number.
   Your method should meet at least the following test cases:  
   `generateUsername("John") --> "John123"`  
   `generateUsername("Jane") --> "Jane456"`  
   `generateUsername("Alice") --> "Alice789"`    

6. Write a method header named `createMessage` that takes three String parameters representing a sender, a recipient, and a message body, and returns a complete message by concatenating them.
   Your method should meet at least the following test cases:  
   `createMessage("John", "Alice", "Hi Alice, how are you?") --> "From: John\nTo: Alice\nMessage: Hi Alice, how are you?"`  
   `createMessage("Alice", "Bob", "Hey Bob, what's up?") --> "From: Alice\nTo: Bob\nMessage: Hey Bob, what's up?"`  
   `createMessage("Bob", "Charlie", "Good morning Charlie!") --> "From: Bob\nTo: Charlie\nMessage: Good morning Charlie!"`  

7. Write a method header named `appendText` that takes three String parameters representing a base text, an additional text, and a suffix text, and returns the base text with all text appended.
   Your method should meet at least the following test cases:  
   `appendText("Hello", "World", " ") --> "Hello World"`  
   `appendText("Open", "AI", "") --> "OpenAI"`  
   `appendText("Goodbye", "!", "!") --> "Goodbye!!"`  
