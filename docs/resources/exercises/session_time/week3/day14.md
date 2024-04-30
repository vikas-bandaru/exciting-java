---
layout: default
title: Sessions
parent: Day 14
grand_parent: Week 3
has_children: true
nav_order: 1
---

# Module 1: Java Foundations
{: .no_toc }
## Day 14: Object Interactions
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
### Experimenting with Expressions in Code Pad

1. Try the following:  
   `sum = 99 + 3;`  
   Observe the error.  
   Now try the following:

   ```java
   int sum = 0;
   sum = 99 + 3;
   sum
   ```

   Now, try this:  
   `String swimmer = "cat" + "fish";`  
   `swimmer`  
   What would you expect to see after the following?  
   `String fish = swimmer;`  
   `fish`  
   Try it out. What do you think has happened in the assignment?

3. Open the Code Pad in the _better-ticket-machine_ project. Type the following in the Code Pad:

   ```java
   TicketMachine t1 = new TicketMachine(1000);
   t1.getBalance()
   t1.insertMoney(500);
   t1.getBalance()
   ```

   Take care to type these lines exactly as they appear here; pay particular attention to whether or not there is a semicolon at the end of the line. Note what the calls to `getBalance` return in each case.
4. Now add the following in the Code Pad:  
   `TicketMachine t2 = t1;`  
   What would you expect a call to `t2.getBalance()` to return? Try it out.
5. Add the following:  
    `t1.insertMoney(500);`
   What would you expect the following to return? Think carefully about this before you try it, and be sure to use the `t2` variable this time.  
   `t2.getBalance()`  
   Did you get the answer you expected? Can you find a connection between the variables `t1` and `t2` that would explain what is happening?

### The Clock display project intro

Demo first..  

**Download the project:**  
[Clock Display](../../../projects/bluej/part03/clock-display.zip)

