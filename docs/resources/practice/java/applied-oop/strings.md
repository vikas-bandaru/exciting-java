---
layout: default
title: Strings
parent: OOP
nav_order: 1
grand_parent: Practice
---

# Practice Strings
{: .no_toc}

<details open markdown="block">
  <summary>
    Topics
  </summary>
  {: .text-delta }
  1. [Reverse and it's Variants](#1-reverse-a-string)
     {:toc}
  2. [Palindrome and it's Variants](#2-check-if-a-string-is-a-palindrome)
     {:toc}
  3. [Vowel Count and it's Variants](#3-count-the-number-of-vowels-in-a-string)
     {:toc}
  4. [Anagrams and it's Variants](#4-check-if-two-strings-are-anagrams)
     {:toc}
  5. [Count of occurrences and it's Variants](#5-count-the-occurrences-of-a-substring)
     {:toc}
</details>

## Practice Exercises
### **1. Reverse a String**

**Problem**: Write a method to reverse a given string.

<details markdown="block">
   <summary>Solution</summary>

   ```java
   public String reverse(String str) {
       String reversed = "";
       for (int i = str.length() - 1; i >= 0; i--) {
           reversed = reversed + str.charAt(i);
       }
       return reversed;
   }
   ```
</details>

### Variants
1. **Reverse a Sentence (Keep Words Intact)**  
   **Problem:** Write a method to reverse a sentence, but keep each word in its original order. For example, `"Hello World"` should become `"World Hello"`.
2. **Reverse Words Individually in a Sentence**  
   **Problem:** Reverse each word individually in a sentence. For example, `"Hello World"` should become `"olleH dlroW"`.
3. **Reverse Only Vowels in a String**  
   **Problem:** Reverse only the vowels in a string while keeping consonants in their original position. For example, `"hello"` should become `"holle"`.

### **2. Check if a String is a Palindrome**

**Problem**: Write a method to check if a given string is a palindrome (a word that reads the same forward and backward).

<details markdown="block">
   <summary>Solution</summary>

   ```java
   public boolean isPalindrome(String str) {
       int start = 0;
       int end = str.length() - 1;
       while (start < end) {
           if (str.charAt(start) != str.charAt(end)) {
               return false;
           }
           start++;
           end--;
       }
       return true;
   }
   ```
</details>

### Variants
1. **Case-Insensitive Palindrome Check**  
   **Problem:** Modify the original method to perform a case-insensitive palindrome check. `"Madam"` should be considered a palindrome.
2. **Palindrome Check Ignoring Non-Alphanumeric Characters**  
   **Problem:** Check if a string is a palindrome, ignoring spaces, punctuation, and non-alphanumeric characters. `"A man, a plan, a canal: Panama"` should return `true`.
3. **Check Palindrome Recursively**  
   **Problem:** Write a recursive method to check if a string is a palindrome.

### **3. Count the Number of Vowels in a String**

**Problem**: Write a method that counts and returns the number of vowels in a string.

<details markdown="block">
   <summary>Solution</summary>

   ```java
    public int countVowels(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
   ```
</details>

### Variants
1. **Count Vowels and Consonants Separately**  
   **Problem:** Write a method that counts and returns both the number of vowels and consonants in a string.
2. **Count Uppercase and Lowercase Vowels Separately**  
   **Problem:** Write a method that counts and returns both the number of uppercase and lowercase vowels in a string.
3. **Count Vowels Using Streams**  
   **Problem:** Write a method that counts the number of vowels using Java Streams.

### **4. Check if Two Strings are Anagrams**

**Problem**: Write a method to check if two strings are anagrams (contain the same characters in a different order).

<details markdown="block">
   <summary>Solution</summary>

   ```java
   public boolean areAnagrams(String str1, String str2) {
       if (str1.length() != str2.length()) {
           return false;
       }
       char[] arr1 = str1.toCharArray();
       char[] arr2 = str2.toCharArray();
      Arrays.sort(arr1);
      Arrays.sort(arr2);
      return Arrays.equals(arr1, arr2);
   }
   ```
</details>

### Variants
1. **Case-Insensitive Anagram Check**  
   **Problem:** Modify the original method to check for anagrams in a case-insensitive manner. `"Listen"` and `"Silent"` should be considered anagrams.
2. **Anagram Check Ignoring Non-Alphanumeric Characters**  
   **Problem:** Modify the method to check if two strings are anagrams, ignoring spaces, punctuation, and non-alphanumeric characters. `"Tom Marvolo Riddle"` and `"I am Lord Voldemort"` should return `true`.
3. **Anagram Check Using Frequency Array**  
   **Problem:** Write an optimized method to check if two strings are anagrams by counting character frequencies in a single pass.

### **5. Count the Occurrences of a Substring**

**Problem**: Write a method that counts how many times a substring appears in a string.

<details markdown="block">
   <summary>Solution</summary>

   ```java
   public int countSubstring(String str, String sub) {
      int count = 0;
      int index = 0;
      while ((index = str.indexOf(sub, index)) != -1) {
         count++;
         index += sub.length();
      }
      return count;
   }
   ```
</details>

### Variants
1. **Count Overlapping Substring Occurrences**  
   **Problem:** Write a method to count how many times a substring appears in a string, including overlapping occurrences. For example, `"aa"` in `"aaaa"` appears 3 times.
2. **Count Substring Occurrences with Case Insensitivity**  
   **Problem:** Modify the method to count how many times a substring appears in a string, ignoring case. For example, `"Java"` in `"I love java and JAVA"` should return `2`.
3. **Count Substring Occurrences with Regex**  
   **Problem:** Write a method that uses regular expressions to count the number of occurrences of a substring in a string.

These variations will challenge you to think critically about string manipulation and develop a deep understanding of the different ways strings can be processed in Java.

### Next Topic: 
Go to [ArrayLists](../../../learn/java/applied_oop/arraylists) to learn a new topic.

### Back to Learn: 
Go to [Strings](../../../learn/java/applied_oop/strings) to learn more with examples.