---
layout: default
title: Learn
nav_order: 2
parent: Quiz Generator
grand_parent: Projects
---

# Learn

<details markdown="block">
  <summary>
    Topics
  </summary>
  {: .text-delta }

  1. [Bottom Menu](#question)
     {:toc}
  
</details>

The fundamental object of a **Quiz Generator** app is a `Question`. A question of an MCQ quiz is composed of 3 main parts:  

1. Question Title
2. Question Options
3. Question Answer

To treat all 3 of these features as a single unit, we need a class.

Initial design of class, `Question`:  

```java
public class Question {
    // Fields
    String title;
    String options;
    String answer;
}
```

As per Object-Oriented Programming (OOP) concept, *Encapsulation*, fields of a class must be hidden and the data stored by them must be exposed through their respective `public` accessors (getters) and mutators (setters).

Let's apply that:  

```java
public class Question {
    // private Fields
    private String title;
    private String options;
    private String answer;
    // public Accessor Methods
    public String getTitle() {
        return title;
    }
    public String getOptions() {
        return options;
    }
    public String getAnswer() {
        return answer;
    }
    // public Mutator Methods
    public void setTitle(String title) {
        this.title = title;
    }
    public void setOptions(String options) {
        this.options = options;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
```

It's a *good practice* to always test the code as soon as some new features or behaviors are updated in the source code. While writing test code for your class, it is suggested that you always write expected result along with any print statements. That way, you can check if your code is giving a result as you already expected. Let's try testing our code with a Tester class:  

```java
public class QuestionTester {
    public static void main(String[] args) {
        // 1. Create an instance of the class we are testing
        Question q1 = new Question();
        System.out.println("Question Title" + q1.getTitle());
        System.out.println("Expected: null");
        System.out.println("Question Options" + q1.getOptions());
        System.out.println("Expected: null");
        System.out.println("Question Answer" + q1.getAnswer());
        System.out.println("Expected: null");
    }
}
```

### Question
Why do you think results of each of these fields are `null`?

<details markdown="block">
  <summary>
    Answer
  </summary>
  As we did not provide any constructor in the class, an implicit default constructor is provided and it looks like the following:  
  ```java
  public Question() {
    title = null;
    options = null;
    answer = null;
  }
  ```  
  This default constructor initializes all the fields with default values of their respective types.
</details>

---

<details markdown="block">
  <summary>
    Continue to the next topic if you are clear about the above question.
  </summary>
  {: .text-delta }

  1. [Adding a Constructor](../quiz_gen/question-def-constructor)
     {:toc}
  
</details>