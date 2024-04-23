
<!-- following content moved from day08
     which comes after constructor parameters
 -->

**Formal Parameters:** The parameter names inside a constructor or method.  
**Acutal Parameters:** The parameter values outside.  
So `cost` is a formal parameter, and a user-supplied value such as `50` is an actual parameter.  

This same rule **also applies** between *formal parameters* and *actual parameters*: the type of an actual-parameter expression must match the type of the formal-parameter variable.  

**Variable Scope:**  
A formal parameter is available to an object only within the body of a constructor or method that declares it. We say that the *scope of a parameter* is restricted to the body of the constructor or method in which it is declared.  
In contrast, the *scope of a field* is the whole of the class definition – it can be accessed from anywhere in the same class.  
This is a **very important difference** between these two sorts of variables.  

**Variable Lifetime:**  
The *lifetime of a parameter* is limited to a single call of a constructor or method. When a constructor or method is called, the extra space for the parameter variables is created, and the external values copied into
that space. Once that call has completed its task, the formal parameters disappear and the values they held are lost. In other words, when the constructor has finished executing, the whole constructor space is removed, along with the parameter variables held within it.  
In contrast, the *lifetime of a field* is the same as the lifetime of the object to which it belongs. When an object is created, so are the fields, and they persist for the lifetime of the object. It follows that if we want to remember the cost of tickets held in the `cost` parameter, we must store the value somewhere persistent — that is, in the `price` field.  
