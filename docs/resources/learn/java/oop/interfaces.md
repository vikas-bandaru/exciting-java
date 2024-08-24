---
layout: default
title: Interfaces
nav_order: 4
parent: OOP
grand_parent: Learn
---

# Interfaces and Multiple Inheritance
## Understanding Interfaces with a Simple Example

<details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. [Why Interfaces?]()
   {:toc}
</details>

## Why Interfaces? (Motivation behind)

Imagine you’re building a playlist app. Different music services (like Spotify, Apple Music, etc.) have different ways to play songs, but you want your app to work with all of them. You need a way to define what it means to "play" a song, regardless of the music service being used. This is where an interface comes in.

### How and Where:
An interface in Java is like a contract that says, "Any class that implements this interface must have these specific methods." It’s like setting rules everyone has to follow to play a song.

Here's a simple interface example:

```java
// Topic: Define an Interface
interface MusicPlayer {
    void playSong(String songName);
}
```

Now, any music service that wants to be part of your app must implement this interface:

```java
// Topic: Implement the Interface
class SpotifyPlayer implements MusicPlayer {
    public void playSong(String songName) {
        System.out.println("Playing " + songName + " on Spotify.");
    }
}

class AppleMusicPlayer implements MusicPlayer {
    public void playSong(String songName) {
        System.out.println("Playing " + songName + " on Apple Music.");
    }
}
```

### When:
Use an interface when you want to define a set of actions that different classes can perform, even if they do it in their own way.

### How to decide:
If you find yourself thinking, "I want different objects to do the same thing but in their own unique way," an interface might be the right tool.

### Relating to APIs:
Think of an interface like an API. Just like how different apps use an API to interact with a service without knowing its internal workings, your code uses an interface to interact with different classes without worrying about how they perform their tasks. The interface/API defines "what" should happen, while the actual class decides "how" it happens.

<!-- [Back to Top](#top) -->
#### Experiments
Experiment with [Interfaces](../../../experiment/oop/interfaces) here.

#### Practice Exercises
Practice [Interfaces](../../../practice/java/oop/interfaces) with exercises.