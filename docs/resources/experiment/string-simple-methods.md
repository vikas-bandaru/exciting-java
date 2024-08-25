---
layout: default
title: Simple String Methods
parent: Using Objects
nav_order: 2
grand_parent: Experiment
---

# Experiments with Simple String Methods
{: .no_toc}

<details open markdown="block">
  <summary>
    Topics
  </summary>
  {: .text-delta }
  1. [Experiment 1](#experiment-1-using--instead-of-equals-for-string-comparison)
     {:toc}
  2. [Experiment 2](#experiment-2-forgetting-to-use-trim)
     {:toc}
  3. [Experiment 3](#experiment-3-misusing-replace)
     {:toc}
  4. [Experiment 4](#experiment-4-using-replace-instead-of-replaceall-with-special-characters)
     {:toc}
  5. [Experiment 5](#experiment-5-concatenating-strings-using-concat-vs--operator)
     {:toc}
  6. [Practice](#practice-exercises)
     {:toc}
</details>

## Experiments (Different Combinations of What Could Go Wrong - Syntactically, Logically, and Exceptionally)

### **Experiment 1: Using `==` Instead of `.equals()` for String Comparison**

**What Could Go Wrong?**
- **Logically**: Using `==` to compare strings might give unexpected results because it checks if the two string objects are the same instance, not if their contents are identical.

**Example**:
```java
public class StringComparisonExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");

        if (str1 == str2) { // Incorrect comparison
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
    }
}
```

**Expected vs. Actual Output**:
- **Expected**: You might expect "Strings are equal" because the content is the same.
- **Actual**: "Strings are not equal" is printed because `==` compares object references.

**Solution**:
- Use `.equals()` to compare the content of strings.

```java
if (str1.equals(str2)) { // Correct comparison
    System.out.println("Strings are equal.");
} else {
    System.out.println("Strings are not equal.");
}
```

### **Experiment 2: Forgetting to Use `trim()`**

**What Could Go Wrong?**
- **Logically**: If you forget to use `trim()`, user input might contain leading or trailing spaces, causing issues in validation or comparison.

**Example**:
```java
public class UsernameValidationExample {
    public static void main(String[] args) {
        String enteredUsername = " JohnDoe ";
        String storedUsername = "JohnDoe";

        if (enteredUsername.equals(storedUsername)) {
            System.out.println("Username matched.");
        } else {
            System.out.println("Username did not match.");
        }
    }
}
```

**Expected vs. Actual Output**:
- **Expected**: You might expect "Username matched" because the content seems the same.
- **Actual**: "Username did not match" is printed because of the extra spaces.

**Solution**:
- Use `trim()` to remove the extra spaces before comparison.

```java
if (enteredUsername.trim().equals(storedUsername)) {
    System.out.println("Username matched.");
} else {
    System.out.println("Username did not match.");
}
```

### **Experiment 3: Misusing `replace()`**

**What Could Go Wrong?**
- **Logically**: Beginners might think `replace()` changes the original string, but strings are immutable in Java. `replace()` returns a new string, and the original string remains unchanged.

**Example**:
```java
public class ReplaceExample {
    public static void main(String[] args) {
        String originalString = "Hello World";
        originalString.replace("World", "Java");

        System.out.println(originalString); // Prints the original string
    }
}
```

**Expected vs. Actual Output**:
- **Expected**: You might expect "Hello Java" as the output.
- **Actual**: "Hello World" is printed because `replace()` returns a new string, but the original string is unchanged.

**Solution**:
- Assign the result of `replace()` to a new string or reassign it to the original variable.

```java
originalString = originalString.replace("World", "Java");
System.out.println(originalString); // Now prints "Hello Java"
```

### **Experiment 4: Using `replace()` Instead of `replaceAll()` with Special Characters**

**What Could Go Wrong?**
- **Logically**: `replaceAll()` uses regular expressions, so using it with special characters like `.` or `*` without escaping them might lead to errors or unexpected results.

**Example**:
```java
public class ReplaceAllExample {
    public static void main(String[] args) {
        String text = "Hello. How are you?";
        String modifiedText = text.replaceAll(".", "!"); // Trying to replace '.' with '!'
        System.out.println(modifiedText);
    }
}
```

**Expected vs. Actual Output**:
- **Expected**: You might expect "Hello! How are you?" but instead,
- **Actual**: You get "!!!!!!!!!!!!!!", because `.` in regular expressions matches any character.

**Solution**:
- Use `replace()` for simple replacements, or escape special characters in `replaceAll()`.

```java
// Correct usage with replace():
String modifiedText = text.replace(".", "!");
System.out.println(modifiedText); // Prints "Hello! How are you?"

// Or using replaceAll() with escaping:
String modifiedText = text.replaceAll("\\.", "!");
System.out.println(modifiedText); // Prints "Hello! How are you?"
```

### **Experiment 5: Concatenating Strings Using `concat()` vs `+` Operator**

**What Could Go Wrong?**
- **Syntactically**: There's no major issue with either approach, but beginners might overcomplicate simple concatenation using `concat()` where the `+` operator is simpler and more commonly used.

**Example**:
```java
public class ConcatExample {
    public static void main(String[] args) {
        String greeting = "Hello";
        String name = "Alice";

        // Using concat():
        String fullGreeting = greeting.concat(" ").concat(name);

        // Using + operator:
        String fullGreetingWithPlus = greeting + " " + name;

        System.out.println(fullGreeting);
        System.out.println(fullGreetingWithPlus);
    }
}
```

**Explanation**:
- **Both**: `concat()` and `+` operator achieve the same result, but the `+` operator is more intuitive and widely used for simple concatenation.

**Solution**:
- Use the `+` operator for simple string concatenation.

## **Summary of Experiments**
- **Syntactical Issues**: Misusing `replaceAll()` with special characters or overcomplicating concatenation with `concat()` when `+` is simpler.
- **Logical Issues**: Forgetting to use `trim()` for cleaning user input, using `==` instead of `.equals()` for string comparison, or thinking `replace()` modifies the original string.
- **Exceptional Scenarios**: Understanding the immutability of strings in Java and how methods like `replace()` work by returning new strings.

Would you like to proceed with the practice exercises now?

[Back to Top](#top)

#### Practice Exercises
Practice [Simple String Methods](../practice/java/foundations/string-simple-methods) with exercises.
