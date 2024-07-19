

We shall now examine the same concepts with a different example, using different tools. We
are still concerned with understanding how objects create other objects, and how objects call
each other’s methods. In the first half of this chapter, we have used the most fundamental
technique to analyze a given program: code reading. The ability to read and understand
source code is one of the most essential skills for a software developer, and we will need to
apply it in every project we work on. However, sometimes it is beneficial to use additional
tools in order to help us gain a deeper understanding about how a program executes. One
tool we will now look at is a *debugger*.
A debugger is a program that lets programmers execute an application one step at a time.
It typically provides functions to stop and start a program at selected points in the source
code, and to examine the values of variables.
> A **debugger** is a software tool that helps in examining how an application executes. It can be used to find bugs.

Debuggers vary widely in complexity. Those for professional developers have a large number
of functions for sophisticated examination of many facets of an application. BlueJ has
a built-in debugger that is much simpler. We can use it to stop our program, step through it
one line of code at a time, and examine the values of our variables. Despite the debugger’s
apparent lack of sophistication, this is enough to give us a great deal of information.
Before we start experimenting with the debugger, we will take a look at the example we will
use for debugging: a simulation of an e-mail system.

### The *mail-system* project

We start by investigating the functionality of the mail-system project. At this stage, it is not
important to read the source, but mainly to execute the existing project to get an understanding
of what it does.

Download [The mail-system project](../../../projects/bluej/part03/mail-system.zip)

### Let's Experiment
1. Open the *mail-system* project. The idea of this project is to simulate the act of users sending
mail items to each other. A user uses a mail client to send mail items to a server,
for delivery to another user’s mail client. First create a `MailServer` object. Now
create a `MailClient` object for one of the users. When you create the client,
you will need to supply a `MailServer` instance as a 􀁒ara􀁏eter􀀐 􀀷se the one
you just created. You also need to specify a username for the mail client. Now
create a second `MailClient` in a similar way, with a different username.
Experiment with the `MailClient` objects. They can be used for sending mail items
from one mail client to another (using the `sendMailItem` method) and receiving
messages (using the `getNextMailItem` or `printNextMailItem` methods).
2. Draw an object diagram of the situation you have after creating
a mail server and three mail clients.

MailItem is fairly trivial. We shall
discuss only one small detail and leave the rest up to you to investigate. MailServer is
quite complex at this stage; it makes use of concepts discussed only much later.

The MailClient class is the most interesting, and we shall examine it in some detail.

### The `this` keyword
Refer to the *this & super* handout and read it once.

### Using a Debugger

