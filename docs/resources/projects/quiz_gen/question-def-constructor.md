---
title: Adding a Constructor
layout: minimal
parent: Quiz Generator
---

# QuizGenerator
## `Question` class
### Adding a Constructor  

As an **implicit default constructor** auto-initializes the fields with default values and as you can see the default values of String is not very useful, let's initialize the fields with something meaningful:

```java
public class Question {
  // private Fields
  private String title;
  private String options;
  private String answer;
  // No-argument Constructor (that looks like Default Constructor, but behaves otherwise)
  public Question() {
    title = "What is Programming?";
    options = "a process, a gift, a system, a plant";
    answer = "a process";
  }
  // public Accessor Methods (omitted to save space)
  ...
  // public Mutator Methods (omitted to save space)
  ...
}
```

Now, if we try testing our `Question` class, in our `QuestionTester` class, this is how we should be writing the expected results as well:

```java
public class QuestionTester {
    public static void main(String[] args) {
        // 1. Create an instance of the class we are testing
        Question q1 = new Question();
        System.out.println("Question Title" + q1.getTitle());
        System.out.println("Expected: What is Programming?");
        System.out.println("Question Options" + q1.getOptions());
        System.out.println("Expected: a process, a gift, a system, a plant");
        System.out.println("Question Answer" + q1.getAnswer());
        System.out.println("Expected: a process");
    }
}
```

[Back to QuizGen Learn](../quiz_gen/learn)