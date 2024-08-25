---
layout: default
title: Simple String Methods
parent: Using Objects
nav_order: 2
grand_parent: Practice
---

# Practice Simple String Methods
{: .no_toc}

<details open markdown="block">
  <summary>
    Topics
  </summary>
  {: .text-delta }
  1. [Exercise 1](#exercise-1-email-validation)
     {:toc}
  2. [Exercise 2](#exercise-2-greeting-message-generator)
     {:toc}
  3. [Exercise 3](#exercise-3-password-length-checker)
     {:toc}
  4. [Exercise 4](#exercise-4-username-sanitizer)
     {:toc}
  5. [Exercise 5](#exercise-5-case-insensitive-login)
     {:toc}
  6. [Exercise 6](#exercise-6-sentence-replacer)
     {:toc}
  7. [Exercise 7](#exercise-7-string-trimmer-and-length-checker)
     {:toc}
  8. [Exercise 8](#exercise-8-case-conversion-utility)
     {:toc}
</details>

## Practice Exercises

Here are a few exercises to practice using simple String methods in Java. These exercises will help reinforce your understanding of how to manipulate and validate strings using the methods we've discussed.

### **Exercise 1: Email Validation**

**Scenario**: Create a program that checks if a user’s email address contains the "@" symbol and a "." after the "@" to ensure it's a valid format.

**Task**:
- Use the `contains()` method to check for the "@" symbol.
- Use `indexOf()` and `substring()` to ensure there is a "." after the "@" symbol.

**Instructions**:
1. Create a class `EmailValidator`.
2. Write a method `public boolean isValidEmail(String email)` that returns `true` if the email is valid and `false` otherwise.
3. Write an `EmailValidatorTester` class to test the method with various email addresses.

**Expected Outcome**:
- The program should correctly identify whether an email is valid based on the presence of "@" and ".".

### **Exercise 2: Greeting Message Generator**

**Scenario**: Create a program that generates a personalized greeting message by concatenating a greeting phrase with a user’s name.

**Task**:
- Use `concat()` or the `+` operator to combine the greeting and the user’s name.

**Instructions**:
1. Create a class `GreetingGenerator`.
2. Write a method `public String generateGreeting(String name)` that returns a personalized greeting message like "Hello, John!".
3. Write a `GreetingGeneratorTester` class to test the method with different names.

**Expected Outcome**:
- The program should correctly generate a personalized greeting for any given name.

### **Exercise 3: Password Length Checker**

**Scenario**: Create a program that checks if a password meets a minimum length requirement (e.g., 8 characters).

**Task**:
- Use the `length()` method to check the length of the password.

**Instructions**:
1. Create a class `PasswordChecker`.
2. Write a method `public boolean isPasswordLongEnough(String password)` that returns `true` if the password is long enough, and `false` otherwise.
3. Write a `PasswordCheckerTester` class to test the method with various passwords.

**Expected Outcome**:
- The program should correctly determine if a password meets the minimum length requirement.

### **Exercise 4: Username Sanitizer**

**Scenario**: Create a program that sanitizes a username by trimming any leading or trailing spaces and replacing any spaces within the username with underscores.

**Task**:
- Use `trim()` to remove spaces at the beginning and end.
- Use `replace()` to replace spaces with underscores.

**Instructions**:
1. Create a class `UsernameSanitizer`.
2. Write a method `public String sanitizeUsername(String username)` that returns the sanitized username.
3. Write a `UsernameSanitizerTester` class to test the method with various usernames.

**Expected Outcome**:
- The program should correctly sanitize usernames by trimming and replacing spaces.

### **Exercise 5: Case Insensitive Login**

**Scenario**: Create a program that checks if a user’s entered username matches the stored username, ignoring case differences.

**Task**:
- Use `toLowerCase()` or `toUpperCase()` to standardize both the entered username and the stored username before comparison.

**Instructions**:
1. Create a class `LoginSystem`.
2. Write a method `public boolean login(String enteredUsername, String storedUsername)` that returns `true` if the usernames match, ignoring case.
3. Write a `LoginSystemTester` class to test the method with various usernames.

**Expected Outcome**:
- The program should correctly identify matching usernames regardless of case.

### **Exercise 6: Sentence Replacer**

**Scenario**: Create a program that replaces all occurrences of a word in a sentence with another word.

**Task**:
- Use the `replace()` method to replace the specified word in the sentence.

**Instructions**:
1. Create a class `SentenceReplacer`.
2. Write a method `public String replaceWord(String sentence, String oldWord, String newWord)` that returns the modified sentence.
3. Write a `SentenceReplacerTester` class to test the method with different sentences and words.

**Expected Outcome**:
- The program should correctly replace the specified word in any given sentence.

### **Exercise 7: String Trimmer and Length Checker**

**Scenario**: Create a program that trims a string and then checks its length.

**Task**:
- Use `trim()` to remove extra spaces, and then `length()` to measure the trimmed string.

**Instructions**:
1. Create a class `StringTrimmer`.
2. Write a method `public int trimAndCheckLength(String input)` that returns the length of the trimmed string.
3. Write a `StringTrimmerTester` class to test the method with various strings.

**Expected Outcome**:
- The program should correctly trim the string and return its length.

### **Exercise 8: Case Conversion Utility**

**Scenario**: Create a program that converts a given string to both uppercase and lowercase.

**Task**:
- Use `toUpperCase()` to convert the string to uppercase.
- Use `toLowerCase()` to convert the string to lowercase.

**Instructions**:
1. Create a class `CaseConverter`.
2. Write a method `public void convertCase(String input)` that prints both the uppercase and lowercase versions of the string.
3. Write a `CaseConverterTester` class to test the method with different strings.

**Expected Outcome**:
- The program should correctly display both the uppercase and lowercase versions of the input string.

## Summary of Practice Exercises
- **Validation**: Practice using `length()`, `contains()`, and `trim()` to validate and clean up user input.
- **String Manipulation**: Practice using `replace()`, `concat()`, `toUpperCase()`, and `toLowerCase()` to modify and format strings.
- **Practical Application**: These exercises cover real-world scenarios like login validation, text formatting, and message generation.

These exercises should help solidify your understanding of simple String methods in Java. Let me know if you need any further guidance or if you'd like to discuss the solutions!

[Back to Top](#top)

#### Next Topic: 
Go to [Conditionals](../../../learn/java/foundations/decisions) to learn more with examples.