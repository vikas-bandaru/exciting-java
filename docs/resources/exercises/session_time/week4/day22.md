---
layout: default
title: Sessions
parent: Day 22
grand_parent: Week 4
has_children: true
nav_order: 1
---

# Module 1: Java Foundations
{: .no_toc }
## Day 22: Grouping Objects (music-organizer)
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
3. [Practice Session](#practice-session)
   {:toc}
</details>

## Session 1
Resolving any doubts and finishing Challenge exercise

### Level 3 Challenge
Given a string with some lowercase and some uppercase letters, change the case of each character and return the string.

## Session 2
Continue with previous Challenge.  
Learn making a String object starting from empty string ("") and returning at the end of the method.  
Intro to [Java Visualizer](https://cscircles.cemc.uwaterloo.ca/java_visualize/)

## Practice Session

Download Projects:
[music-organizer-v1](../../../projects/bluej/part04/music-organizer-v1.zip)  

### An organizer for music files
We are going to write a class that can help us organize our music files stored on a computer.
Our class won’t actually store the file details; instead, it will delegate that responsibility to
the standard `ArrayList` library class, which will save us a lot of work. So, why do we need
to write our own class at all? An important point to bear in mind when dealing with library
classes is that they have not been written for any particular application scenario—they are
general-purpose classes. One `ArrayList` might store student-record objects, while another
stores event reminders. This means that it is the classes that we write for using the library
classes that provide the scenario-specific operations, such as the fact that we are dealing
with music files, or playing a file that is stored in the collection.  
For the sake of simplicity, the first version of this project will simply work with the file names
of individual music tracks. There will be no separate details of title, artist, playing time, etc.
That means we will just be asking the `ArrayList` to store `String` objects representing the
file names. Keeping things simple at this stage will help to avoid obscuring the key concepts
we are trying to illustrate, which are the creation and usage of a collection object. Later in the
discussion, we will add further sophistication to make a more viable music organizer and player.
We will assume that each music file represents a single music track. The example files we
have provided with the project have both the artist’s name and the track’s title embedded
in the file name, and we will use this feature later. For the time being, here are the basic
operations we will have in the initial version of our organizer:  
- It allows tracks to be added to the collection.
- It has no predetermined limit on the number of tracks it can store, aside from the memory limit of the machine on which it is run.
- It will tell us how many tracks are in the collection.
- It will list all the tracks.  
We shall find that the `ArrayList` class makes it very easy to provide this functionality
from our own class.  
Notice that we are not being too ambitious in this first version. These features will be sufficient
for illustrating the basics of creating and using the `ArrayList` class, and later versions
will then build further features incrementally until we have something more sophisticated.
(Most importantly, perhaps, we will later add the possibility of playing the music files. Our
first version will not be able to do that.) This modest, incremental approach is much more
likely to lead to success than trying to implement everything all at once.  
Before we analyze the source code needed to make use of such a class, it is helpful to explore
the starting behavior of the music organizer.

### Let's Experiment
1. Open the *music-organizer-v1* project in BlueJ and create a `Music Organizer` object. Store the names of a few audio files into it — they are simply strings. As we are not going to play the files at this stage, any file names will do, although there is a sample of audio files in the *audio* folder of the project that you might like to use.
Check that the number of files returned by `numberOfFiles` matches the number you stored. When you use the `listFile` method, you will need to use a parameter value of `0` (zero) to print the first file, `1` (one) to print the second, and so on. We shall explain the reason for this numbering in due course.

2. What happens if you create a new `MusicOrganizer` object and then call `removeFile(0)` before you have added any files to it? Do you get an error? Would you expect to get an error?

3. Create a `MusicOrganizer` and add two file names to it. Call `listFile(0)` and `listFile(1)` to show the two files. Now call `removeFile(0)` and then `listFile(0)`. What happened? Is that what you expected? Can you find an explanation of what might have happened when you removed the first file name from the collection?

### Using a library class

**Importing a library class**  
The very first line of the class file illustrates the way in which we gain access to a library
class in Java, via an *import statement*:  
> `import java.util.ArrayList;`  

This makes the `ArrayList` class from the `java.util` package available to our class definition.
Import statements must always be placed before class definitions in a file. Once a
class name has been imported from a package in this way, we can use that class just as if it
were one of our own classes. So we use `ArrayList` at the head of the `MusicOrganizer`
class to define a `files` field:  
> `private ArrayList<String> files;`  

Here, we see a new construct: the mention of `String` in angle brackets: `<String>`. The need
for this was alluded the previous section, where we noted that `ArrayList` is a general-purpose
collection class—i.e., not restricted in what it can store. When we create an `ArrayList`
object, however, we have to be specific about the type of objects that will be stored in that
particular instance. We can store whatever type we choose, but we have to designate that type
when declaring an `ArrayList` variable. Classes such as `ArrayList`, which get parameterized
with a second type, are called *generic classes* (we will discuss them in more detail later).  
When using collections, therefore, we always have to specify two types: the type of the collection
itself (here: `ArrayList`) and the type of the elements that we plan to store in the
collection (here: String). We can read the complete type definition `ArrayList<String>`
as “*ArrayList of String.*” We use this type definition as the type for our files variable.  
As you should now have come to expect, we see a close connection between the body of the
constructor and the fields of the class, because the constructor is responsible for initializing
the fields of each instance. So, just as the `ClockDisplay` created `NumberDisplay` objects
for its two fields, here we see the constructor of the `MusicOrganizer` creating an object
of type `ArrayList` and storing it in the `files` field.