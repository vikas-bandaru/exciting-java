---
layout: default
# title: this & super
parent: Java
grand_parent: Handouts
nav_order: 4
---

# Handouts
---
## The `this` keyword

The only section we will discuss from the `MailItem` class of *email-system* project (to be discussed) is the constructor. It uses a Java constructor that we have not encountered before. The source code is shown in `MailItem` class. The new Java feature in this code fragment is the use of the `this` keyword:  
> `this.from = from;`  

The whole line is an assignment statement. It assigns the value on the right-hand side (`from`) to the variable on the left (`this.from`).  
The reason for using this construct is that we have a situation known as *name overloading* — the same name being used for two different entities. The class contains three fields, named `from`, `to`, and `message`. The constructor has three parameters, also named `from`, `to`, and `message`!  
So while we are executing the constructor, how many variables exist? The answer is six: three fields and three parameters.  
It is important to understand that the fields and the parameters are separate variables that exist independently of each other, even though they share similar names. A parameter and a field sharing a name is not really a problem in Java.
The problem we do have, though, is how to reference the six variables so as to be able to distinguish between the two sets. If we simply use the variable name “`from`” in the constructor (for example, in a statement `System.out.println(from)`), which variable will be used — the parameter or the field?  
The Java specification answers this question. It specifies that the definition originating in the closest enclosing block will always be used. Because the `from` parameter is defined in the constructor, and the `from` field is defined in the class, the parameter will be used. Its definition is “closer” to the statement that uses it.  
Now all we need is a mechanism to access a field when there is a more closely defined variable with the same name. That is what the `this` keyword is used for. The expression `this` refers to the current object. Writing `this.from` refers to the `from` field in the current object. Thus, this construct gives us a means to refer to the field instead of the parameter with the same name. Now we can read the assignment statement again:  
> `this.from = from;`  

This statement, as we can see now, has the following effect:  
> *field named* `from` = *parameter named* `from`;  

In other words, it assigns the value from the parameter to the field with the same name. This is, of course, exactly what we need to do to initialize the object properly.  
One last question remains: Why are we doing this at all? The whole problem could easily be avoided just by giving the fields and the parameters different names. The reason is readability of source code.  
Sometimes there is one name that perfectly describes the use of a variable—it fits so well that we do not want to invent a different name for it. We want to use it for the parameter, where it serves as a hint to the caller, indicating what needs to be passed. We also want to use it for the field, where it is useful as a reminder for the implementer of the class, indicating what the field is used for. If one name perfectly describes the use, it is reasonable to use it for both and to go through the trouble of using the `this` keyword in the assignment to resolve the name conflict.