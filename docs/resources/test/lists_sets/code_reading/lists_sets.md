---
layout: default
# title: Code Snippets MCQs
parent: Lists & Sets
nav_order: 3
grand_parent: Test Yourself
---

# Practice Questions (Code Snippet based MCQs)
## Lists & Sets

<details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. [Easy Level MCQs](#easy-level-mcqs)
   {:toc}
2. [Slightly harder MCQs](#slightly-harder-mcqs)
   {:toc}
</details>

### Easy Level MCQs

1. What does the following method do? Give an example of how you can call the method.

   ```java
   public class BankAccount {
      public void mystery(BankAccount that, double amount) {
         this.balance = this.balance - amount; 
         that.balance = that.balance + amount;
      }
      . . . // other BankAccount methods
   }
   ```

   <details markdown="block">
     <summary>Answer</summary>
     `BankAccount account1 = new BankAccount();`  
     `BankAccount account2 = new BankAccount();`  
     `account1.mystery(account2, 2000);`
   </details>

2. Given a `Rectangle` class with a constructor that initializes its width and height, and a method `area` that returns the area of the rectangle, what will be the return value of the given method call?
   ```java
   Rectangle rect = new Rectangle(3, 4);
   rect.area();
   ```
   <form>
     <input type="radio" name="q2" value="a"> 7<br>
     <input type="radio" name="q2" value="b"> 12<br>
     <input type="radio" name="q2" value="c"> 0<br>
     <input type="radio" name="q2" value="d"> Compilation error
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     12
   </details>

3. 
[Back to Top](#top)

### Slightly harder MCQs

1. Printing Statements and Combining Strings
   ```java
   String s1 = "3 + 4";
   int a = 3;
   int b = 4;
   System.out.println(s1);
   System.out.println(a + b);
   System.out.println("Result: " + a + b);
   System.out.println("Result: " + (a + b));
   ```

   What will be the output of this code?
   <form>
     <input type="radio" name="q1" value="a"> 3 + 4 7 Result: 34 Result: 34<br>
     <input type="radio" name="q1" value="b"> 3 + 4 7 Result: 7 Result: 7<br>
     <input type="radio" name="q1" value="c"> 3 + 4 7 Result: 34 Result: 7<br>
     <input type="radio" name="q1" value="d"> 3 + 4 34 Result: 34 Result: 7
   </form>
   <details markdown="block">
     <summary>Answer</summary>
     3 + 4 7 Result: 34 Result: 7
   </details>

2. 

[Back to Top](#top)
