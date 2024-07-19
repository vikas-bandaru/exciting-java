---
layout: default
title: Work from Home
parent: Day 23
grand_parent: Week 4
nav_order: 2
---

# Module 1: Java Foundations
## Week 3: Applying Objects & Classes
### Day 23: Grouping Objects (ArrayList & String)

## Work from Home 

**Scenario #1:**  
You are managing a to-do list application. Implement a class called `ToDoList` which stores tasks as strings in an ArrayList. Write methods to add a task to the list, remove a task by its index, get a task by its index, and get the number of tasks in the list.

1. **Add Task:**  
   *Method Signature:* `public void addTask(String task)`  
   *Description:* Adds a new task to the to-do list.  
   *Test Cases:*
   - `addTask("Go grocery shopping")`
   - `addTask("Finish homework")`
   - `addTask("Pay bills")`
2. **Remove Task:**  
   *Method Signature:* `public void removeTask(int index)`  
   *Description:* Removes the task at the specified index from the to-do list.  
   *Test Cases:*
   - `removeTask(1)` -> (Remove the task at index 1)
   - `removeTask(0)` -> (Remove the first task)
   - `removeTask(2)` -> (Try to remove a non-existent task, should handle gracefully)
3. **Get Task:**  
   *Method Signature:* `public String getTask(int index)`  
   *Description:* Retrieves the task at the specified index from the to-do list.  
   *Test Cases:*
   - `getTask(0)` -> (Retrieve the first task)
   - `getTask(2)` -> (Retrieve a task from the middle)
   - `getTask(5)` -> (Try to retrieve a task from an index beyond the list size, should handle gracefully)
4. **Get Size:**  
   *Method Signature:* `public int getSize()`  
   *Description:* Returns the number of tasks currently in the to-do list.  
   *Test Cases:*
   - `getSize()` -> (Get size of an empty list)
   - `addTask("Read a book")` then `getSize()` -> (Get size after adding a task)  
   Add multiple tasks and check getSize() to verify correct count.

**Scenario #2:**  
You are developing a simple inventory management system for a store. Implement a class called `Inventory` which maintains a list of product names. Write methods to add a product to the inventory, remove a product by its name, get a product by its index, and get the number of products in the inventory.

1. **Add Product:**  
   *Method Signature:* `public void addProduct(String productName)`  
   *Description:* Adds a new product to the inventory.  
   *Test Cases:*
   - `addProduct("Apple")`
   - `addProduct("Banana")`
   - `addProduct("Orange")`
2. **Remove Product:**  
   *Method Signature:* `public void removeProduct(String productName)`  
   *Description:* Removes the product with the specified name from the inventory.  
   *Test Cases:*
   - `removeProduct("Apple")` -> (Remove a product)
   - `removeProduct("Banana")` -> (Remove another product)
   - `removeProduct("Grapes")` -> (Try to remove a non-existent product, should handle gracefully)
3. **Get Product:**  
   *Method Signature:* `public String getProduct(int index)`  
   *Description:* Retrieves the product at the specified index from the inventory.  
   *Test Cases:*
   - `getProduct(0)` -> (Retrieve the product at index 0)
   - `getProduct(2)` -> (Retrieve a product from the middle)
   - `getProduct(5)` -> (Try to retrieve a product from an index beyond the inventory size, should handle gracefully)
4. **Get Size:**  
   *Method Signature:* `public int getSize()`  
   *Description:* Returns the number of products currently in the inventory.  
   *Test Cases:*
   - `getSize()` -> (Get size of an empty inventory)   
   Add products using addProduct() method and then check getSize() to verify correct count.

**Scenario #3:**  
You are developing a student management system for a school. Implement a class called `StudentManager` which maintains a list of student names. Write methods to add a student to the list, remove a student by name, get a student by index, and get the number of students in the list.

1. **Add Student:**  
   *Method Signature:* `public void addStudent(String studentName)`  
   *Description:* Adds a new student to the student list.  
   *Test Cases:*
   - `addStudent("John Doe")`
   - `addStudent("Jane Smith")`
   - `addStudent("Alice Johnson")`
2. **Remove Student:**  
   *Method Signature:* `public void removeStudent(String studentName)`  
   *Description:* Removes the student with the specified name from the student list.  
   *Test Cases:*
   - `removeStudent("John Doe")` -> (Remove a student)
   - `removeStudent("Jane Smith")` -> (Remove another student)
   - `removeStudent("Alex Brown")` -> (Try to remove a non-existent student, should handle gracefully)
3. **Get Student:**  
   *Method Signature:* `public String getStudent(int index)`  
   *Description:* Retrieves the student at the specified index from the student list.  
   *Test Cases:*
   - `getStudent(0)` -> (Retrieve the student at index 0)
   - `getStudent(2)` -> (Retrieve a student from the middle)
   - `getStudent(5)` -> (Try to retrieve a student from an index beyond the list size, should handle gracefully)
4. **Get Size:**  
   *Method Signature:* `public int getSize()`  
   *Description:* Returns the number of students currently in the list.  
   *Test Cases:*
   - `getSize()` -> (Get size of an empty list)  
   Add students using addStudent() method and then check getSize() to verify correct count.

**Scenario #4:**  
You are building a simple contact list application. Implement a class called `ContactList` which stores names and phone numbers of contacts. Write methods to add a contact (name and phone number), remove a contact by its name, get a contact by its index, and get the number of contacts in the list.

1. **Add Contact:**  
   *Method Signature:* `public void addContact(String name, String phoneNumber)`  
   *Description:* Adds a new contact to the contact list with the given name and phone number.  
   *Test Cases:*
   - `addContact("John Doe", "123-456-7890")`
   - `addContact("Jane Smith", "987-654-3210")`
   - `addContact("Alice Johnson", "555-123-4567")`
2. **Remove Contact:**  
   *Method Signature:* `public void removeContact(String name)`  
   *Description:* Removes the contact with the specified name from the contact list.  
   *Test Cases:*
   - `removeContact("John Doe")` -> (Remove a contact)
   - `removeContact("Jane Smith")` -> (Remove another contact)
   - `removeContact("Alex Brown")` -> (Try to remove a non-existent contact, should handle gracefully)
3. **Get Contact:**  
   *Method Signature:* `public String getContact(int index)`  
   *Description:* Retrieves the contact at the specified index from the contact list.  
   *Test Cases:*
   - `getContact(0)` -> (Retrieve the contact at index 0)
   - `getContact(2)` -> (Retrieve a contact from the middle)
   - `getContact(5)` -> (Try to retrieve a contact from an index beyond the list size, should handle gracefully)
4. **Get Size:**  
   *Method Signature:* `public int getSize()`  
   *Description:* Returns the number of contacts currently in the list.  
   *Test Cases:*
   - `getSize()` -> (Get size of an empty list)  
   Add contacts using addContact() method and then check getSize() to verify correct count.