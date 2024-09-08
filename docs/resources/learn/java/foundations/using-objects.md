---
layout: default
title: Using Objects
parent: Learn
nav_order: 1
has_children: true
---

# Java Foundations with BlueJ
{: .no_toc}

<details open markdown="block">
  <summary>
    Topics
  </summary>
  {: .text-delta }
  1. [Download Week 1 BlueJ projects](#download-week-1-bluej-projects)
     {:toc}
  2. [What is an Object?](#what-is-an-object)
     {:toc}
  3. [What is a Class?](#what-is-a-class)
     {:toc}
</details>

### Download Week 1 BlueJ projects
  1. [figures](../../../project_zips/bluej/part01/figures.zip)
  2. [house](../../../project_zips/bluej/part01/house.zip)
  3. [lab-classes](../../../project_zips/bluej/part01/lab-classes.zip)
  4. [test-practice](../../../project_zips/bluej/part01/test-practice.zip)
  5. [objects-practice](../../../project_zips/bluej/part01/objects-practice.zip)
  6. [objects-practice2](../../../project_zips/bluej/part01/objects-practice2.zip)
  7. [cars](../../../project_zips/bluej/part01/cars.zip)

### Download Week 1 BlueJ projects (Mac OS)
  1. [Week 1](https://drive.google.com/drive/folders/14dTwEMD6WfxoC0zpNdFWDW9ug2PdnoK9?usp=sharing)

## What is an Object?
> An object is a software bundle of related state and behavior. Software objects are often used to model the real-world objects that you find in everyday life.

Objects are key to understanding object-oriented technology. Look around right now and you'll find many examples of real-world objects:  

<img src="../../../images/objects/dog-labrador.jpg" width="20%" height="20%"> <img src="../../../images/objects/desk.jpg" width="25%" height="25%"> <img src="../../../images/objects/tv.jpg" width="25%" height="25%"> <img src="../../../images/objects/bicycle.jpg" width="25%" height="25%">

Real-world objects share two characteristics:  
a) State  
b) Behavior  

Dogs have state:  
name, color, breed, hungry  
and behavior:  
barking, fetching, wagging tail  

Bicycles also have state:  
current gear, current pedal cadence, current speed  
and behavior:  
changing gear, changing pedal cadence, applying brakes  

Identifying the state and behavior for real-world objects is a great way to begin thinking in terms of object-oriented programming.

[![Java Real World Objects](https://img.youtube.com/vi/ZOcK9kxH9wM/0.jpg)](https://www.youtube.com/shorts/ZOcK9kxH9wM)

[![Software Objects](https://img.youtube.com/vi/JAsGeVKyjKA/0.jpg)](https://www.youtube.com/watch?v=JAsGeVKyjKA)

Read more [here](https://docs.oracle.com/javase/tutorial/java/concepts/object.html).

### Java Programs: Object Party

A typical Java program is like a lit squad of objects, all vibing and interacting by calling each other's methods. Through these object hangouts, a program can do all sorts of epic stuff, like creating a sick app interface, running game graphics that slay, or streaming and sharing the latest viral memes. Once an object has finished its mission, it's like, "I'm out!" and its resources get recycled for other objects to flex with.

Here's a small program, called [`MemeStreamerTester`](../quiz_gen/code/MemeStreamerTester.java), that creates two objects: one [`Meme`](../quiz_gen/code/Meme.java) object and one [`MemeStreamer`](../quiz_gen/code/MemeStreamer.java) object. You will need all two source files to compile this program.

  ```java
  public class MemeStreamerTester {
    public static void main(String[] args) {
        MemeStreamer streamer = new MemeStreamer();

        // Adding some memes to the list
        streamer.addMeme("Doge", "https://example.com/doge.jpg");
        streamer.addMeme("Distracted Boyfriend", "https://example.com/distracted.jpg");
        streamer.addMeme("Success Kid", "https://example.com/success.jpg");

        // Sharing some memes
        streamer.shareMeme();
        streamer.shareMeme();
    }
  }
  ```

### 🚀 Final Thoughts

This example showcases how objects (memes) can interact within a program (meme streamer) to perform a fun and relatable task: sharing memes. Keep exploring Java, and you'll be able to build even more awesome and complex programs!

Read more [here](https://docs.oracle.com/javase/tutorial/java/javaOO/objects.html).

## What is a Class?

> A class is a blueprint or prototype from which objects are created.

### Blueprint to Instance: A Gen Z Guide

[![Blueprint to Instance](https://img.youtube.com/vi/bQrdecyYmlk/0.jpg)](https://www.youtube.com/watch?v=bQrdecyYmlk)

### 👟 Sneaker Class - Java Style! 👟

Alright, peeps! Let's dive into the world of Java programming with a cool example: the `Sneaker` class. Think of it as the ultimate blueprint for creating digital sneakers. Check it out:  

  ```java
  class Sneaker {

    // Fields representing sneaker state
    int size = 0;
    String color = "White";
    String brand = "Unknown";

    // Method to change size
    void changeSize(int newSize) {
        size = newSize;
    }

    // Method to change color
    void changeColor(String newColor) {
        color = newColor;
    }

    // Method to change brand
    void changeBrand(String newBrand) {
        brand = newBrand;
    }

    // Method to print the current state of the sneaker
    void printDetails() {
        System.out.println("size: " + size + " color: " + color + " brand: " + brand);
    }
  }
  ```

### 👟 What's Happening Here?

This `Sneaker` class is like a recipe card for making sneakers in a video game or app. The fields (`size`, `color`, and `brand`) are like the sneaker's stats, and the methods (`changeSize`, `changeColor`, `changeBrand`) are the moves or actions you can do with the sneaker.

But, just like a TikTok dance tutorial, this class alone isn't the whole story. It's just the blueprint. We need another class to actually create and use these sneaker objects. Let's roll over to the `SneakerDemo` class:

### 🎬 SneakerDemo Class - Action Time!

Here's how we put our sneakers into action:

  ```java
  public class SneakerDemo {
    public static void main(String[] args) {

        // Creating two different Sneaker objects
        Sneaker sneaker1 = new Sneaker();
        Sneaker sneaker2 = new Sneaker();

        // Customizing sneaker1
        sneaker1.changeSize(42);
        sneaker1.changeColor("Red");
        sneaker1.changeBrand("Nike");
        sneaker1.printDetails();

        // Customizing sneaker2
        sneaker2.changeSize(38);
        sneaker2.changeColor("Blue");
        sneaker2.changeBrand("Adidas");
        sneaker2.changeColor("Black"); // Changed mind on the color
        sneaker2.changeSize(40); // Realized they needed a bigger size
        sneaker2.printDetails();
    }
  }
  ```

### 📊 Output: Sneaker Stats Time!

When you run this code, you get the stats of your two sneakers at the end:

  ```
  size: 42 color: Red brand: Nike
  size: 40 color: Black brand: Adidas
  ```

### 🛠️ Breaking It Down:

- `Sneaker sneaker1 = new Sneaker();` Creates a new sneaker called sneaker1.
- `sneaker1.changeSize(42);` Sets the size to 42.
- `sneaker1.changeColor("Red");` Changes the color to Red.
- `sneaker1.changeBrand("Nike");` Sets the brand to Nike.
- `sneaker1.printDetails();` Prints out the current state of the sneaker.

### 🚀 Final Thoughts

This is just the beginning. The Sneaker class shows how we can define objects in Java. It's like building your virtual closet of sneakers with different sizes, colors, and brands. Keep customizing through the code, and soon you'll be styling through more advanced Java concepts!

Read more [here](https://docs.oracle.com/javase/tutorial/java/concepts/class.html).


