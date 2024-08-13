---
layout: default
title: Code Snippets MCQs
parent: Lists & Sets
nav_order: 3
grand_parent: Test Yourself
---

# Code Snippets-based MCQs
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

1. What will be the output of the following code snippet?

    ```java
    import java.util.ArrayList;
    public class Example {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
            list.add("A");
            list.add("B");
            list.add("C");
            System.out.println(list.size());
        }
    }
    ```

    <form>
      <input type="radio" name="q1" value="a"> 0<br>
      <input type="radio" name="q1" value="b"> 2<br>
      <input type="radio" name="q1" value="c"> 3<br>
      <input type="radio" name="q1" value="d"> Compilation error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      3
    </details>

2. What will the following code snippet print?

    ```java
    import java.util.HashSet;
    public class Example {
        public static void main(String[] args) {
            HashSet<Integer> set = new HashSet<>();
            set.add(1);
            set.add(2);
            set.add(1);
            System.out.println(set.size());
        }
    }
    ```

    <form>
      <input type="radio" name="q2" value="a"> 1<br>
      <input type="radio" name="q2" value="b"> 2<br>
      <input type="radio" name="q2" value="c"> 3<br>
      <input type="radio" name="q2" value="d"> Compilation error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      2
    </details>

3. What will be the output of the following code snippet?

    ```java
    import java.util.LinkedList;
    public class Example {
        public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<>();
            list.add("A");
            list.add("B");
            list.remove(1);
            System.out.println(list);
        }
    }
    ```

    <form>
      <input type="radio" name="q3" value="a"> [A, B]<br>
      <input type="radio" name="q3" value="b"> [B]<br>
      <input type="radio" name="q3" value="c"> [A]<br>
      <input type="radio" name="q3" value="d"> Compilation error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      [A]
    </details>

4. What will the following code snippet print?

    ```java
    import java.util.LinkedHashSet;
    public class Example {
        public static void main(String[] args) {
            LinkedHashSet<String> set = new LinkedHashSet<>();
            set.add("A");
            set.add("B");
            set.add("C");
            for (String s : set) {
                System.out.print(s + " ");
            }
        }
    }
    ```

    <form>
      <input type="radio" name="q4" value="a"> C B A<br>
      <input type="radio" name="q4" value="b"> A C B<br>
      <input type="radio" name="q4" value="c"> B A C<br>
      <input type="radio" name="q4" value="d"> A B C<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      A B C
    </details>

5. What will be the output of the following code snippet?

    ```java
    import java.util.Vector;
    public class Example {
        public static void main(String[] args) {
            Vector<Integer> vector = new Vector<>(2);
            vector.add(1);
            vector.add(2);
            vector.add(3);
            System.out.println(vector.size());
        }
    }
    ```

    <form>
      <input type="radio" name="q5" value="a"> 2<br>
      <input type="radio" name="q5" value="b"> 3<br>
      <input type="radio" name="q5" value="c"> 4<br>
      <input type="radio" name="q5" value="d"> Compilation error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      3
    </details>

6. What will the following code snippet print?

    ```java
    import java.util.ArrayList;
    public class Example {
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            for (int num : list) {
                System.out.print(num + " ");
            }
        }
    }
    ```

    <form>
      <input type="radio" name="q6" value="a"> 1 2<br>
      <input type="radio" name="q6" value="b"> 2 3<br>
      <input type="radio" name="q6" value="c"> 1 2 3<br>
      <input type="radio" name="q6" value="d"> Compilation error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      1 2 3
    </details>

7. What will be the output of the following code snippet?

    ```java
    import java.util.TreeSet;
    public class Example {
        public static void main(String[] args) {
            TreeSet<String> set = new TreeSet<>();
            set.add("Banana");
            set.add("Apple");
            set.add("Mango");
            System.out.println(set.first());
        }
    }
    ```

    <form>
      <input type="radio" name="q7" value="a"> Apple<br>
      <input type="radio" name="q7" value="b"> Banana<br>
      <input type="radio" name="q7" value="c"> Mango<br>
      <input type="radio" name="q7" value="d"> Compilation error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      Apple
    </details>

8. What will the following code snippet print?

    ```java
    import java.util.LinkedList;
    public class Example {
        public static void main(String[] args) {
            LinkedList<Integer> list = new LinkedList<>();
            list.add(10);
            list.add(20);
            list.addFirst(5);
            System.out.println(list.get(0));
        }
    }
    ```

    <form>
      <input type="radio" name="q8" value="a"> 10<br>
      <input type="radio" name="q8" value="b"> 5<br>
      <input type="radio" name="q8" value="c"> 20<br>
      <input type="radio" name="q8" value="d"> Compilation error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      5
    </details>

9. What will be the output of the following code snippet?

    ```java
    import java.util.HashSet;
    public class Example {
        public static void main(String[] args) {
            HashSet<String> set = new HashSet<>();
            set.add("X");
            set.add("Y");
            set.add("Z");
            set.remove("Y");
            System.out.println(set.contains("Y"));
        }
    }
    ```

    <form>
      <input type="radio" name="q9" value="a"> true<br>
      <input type="radio" name="q9" value="b"> false<br>
      <input type="radio" name="q9" value="c"> Compilation error<br>
      <input type="radio" name="q9" value="d"> Exception<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      false
    </details>

10. What will the following code snippet print?

    ```java
    import java.util.Vector;
    public class Example {
        public static void main(String[] args) {
            Vector<Integer> vector = new Vector<>();
            vector.add(1);
            vector.add(2);
            vector.set(1, 3);
            System.out.println(vector.get(1));
        }
    }
    ```

    <form>
      <input type="radio" name="q10" value="a"> 1<br>
      <input type="radio" name="q10" value="b"> 2<br>
      <input type="radio" name="q10" value="c"> 3<br>
      <input type="radio" name="q10" value="d"> Compilation error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      3
    </details>

1. What will happen when the following code snippet is executed?

    ```java
    import java.util.ArrayList;
    public class Example {
        public static void main(String[] args) {
            ArrayList<int> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            System.out.println(list.size());
        }
    }
    ```

    <form>
      <input type="radio" name="q1" value="a"> Prints 2<br>
      <input type="radio" name="q1" value="b"> Prints 0<br>
      <input type="radio" name="q1" value="c"> Compilation error<br>
      <input type="radio" name="q1" value="d"> Runtime error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **Compilation error**

      **Explanation:** In Java, generic types cannot be primitive types like `int`. Instead, you should use the wrapper class `Integer`. The correct declaration would be `ArrayList<Integer> list = new ArrayList<>();`.
    </details>

2. What will be the output when the following code snippet is executed?

    ```java
    import java.util.HashSet;
    public class Example {
        public static void main(String[] args) {
            HashSet<String> set = new HashSet<>();
            set.add("A");
            set.add("B");
            set.add("C");
            for (int i = 0; i < set.size(); i++) {
                System.out.print(set.get(i) + " ");
            }
        }
    }
    ```

    <form>
      <input type="radio" name="q2" value="a"> A B C<br>
      <input type="radio" name="q2" value="b"> C B A<br>
      <input type="radio" name="q2" value="c"> Compilation error<br>
      <input type="radio" name="q2" value="d"> Runtime error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **Compilation error**

      **Explanation:** The `HashSet` class does not have a `get(int index)` method. Sets in Java do not support indexed access because they are unordered collections. To iterate over a set, you should use an iterator or a for-each loop.
    </details>

3. What will happen when the following code snippet is executed?

    ```java
    import java.util.LinkedList;
    public class Example {
        public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<>();
            list.add("Hello");
            list.add("World");
            list.add(2, "!");
            System.out.println(list);
        }
    }
    ```

    <form>
      <input type="radio" name="q3" value="a"> [Hello, World, !]<br>
      <input type="radio" name="q3" value="b"> [Hello, !, World]<br>
      <input type="radio" name="q3" value="c"> [!, Hello, World]<br>
      <input type="radio" name="q3" value="d"> Runtime error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **[Hello, World, !]**

      **Explanation:** The `add(int index, E element)` method inserts the specified element at the specified position. Since the list initially has two elements at indices 0 and 1, adding an element at index 2 appends it to the end. Therefore, the list becomes `[Hello, World, !]`.
    </details>

4. What will be the result of executing the following code snippet?

    ```java
    import java.util.TreeSet;
    public class Example {
        public static void main(String[] args) {
            TreeSet<Integer> set = new TreeSet<>();
            set.add(null);
            set.add(1);
            set.add(2);
            System.out.println(set);
        }
    }
    ```

    <form>
      <input type="radio" name="q4" value="a"> [null, 1, 2]<br>
      <input type="radio" name="q4" value="b"> [1, 2]<br>
      <input type="radio" name="q4" value="c"> Compilation error<br>
      <input type="radio" name="q4" value="d"> Runtime error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **Runtime error**

      **Explanation:** Adding `null` to a `TreeSet` will throw a `NullPointerException` at runtime because `TreeSet` requires elements to be comparable for sorting, and `null` cannot be compared.
    </details>

5. What will happen when the following code snippet is executed?

    ```java
    import java.util.Vector;
    public class Example {
        public static void main(String[] args) {
            Vector<String> vector = new Vector<>(-1);
            vector.add("A");
            vector.add("B");
            System.out.println(vector.size());
        }
    }
    ```

    <form>
      <input type="radio" name="q5" value="a"> Prints 2<br>
      <input type="radio" name="q5" value="b"> Prints 0<br>
      <input type="radio" name="q5" value="c"> Compilation error<br>
      <input type="radio" name="q5" value="d"> Runtime error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **Runtime error**

      **Explanation:** Initializing a `Vector` with a negative initial capacity will throw an `IllegalArgumentException` at runtime.
    </details>

6. What will be the output when the following code snippet is executed?

    ```java
    import java.util.ArrayList;
    public class Example {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
            list.add("One");
            list.add("Two");
            list.add("Three");
            for (String s : list) {
                if (s.equals("Two")) {
                    list.remove(s);
                }
            }
            System.out.println(list);
        }
    }
    ```

    <form>
      <input type="radio" name="q6" value="a"> [One, Three]<br>
      <input type="radio" name="q6" value="b"> [One, Two, Three]<br>
      <input type="radio" name="q6" value="c"> [One, Three, Two]<br>
      <input type="radio" name="q6" value="d"> Runtime error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **Runtime error**

      **Explanation:** Removing elements from a list while iterating over it using a for-each loop will throw a `ConcurrentModificationException` at runtime. To safely remove elements, use an iterator's `remove()` method.
    </details>

7. What will happen when the following code snippet is executed?

    ```java
    import java.util.HashSet;
    public class Example {
        public static void main(String[] args) {
            HashSet<Integer> set = new HashSet<>();
            set.add(1);
            set.add(2);
            set.add(3);
            for (Integer num : set) {
                if (num == 2) {
                    set.add(4);
                }
            }
            System.out.println(set.size());
        }
    }
    ```

    <form>
      <input type="radio" name="q7" value="a"> 4<br>
      <input type="radio" name="q7" value="b"> 3<br>
      <input type="radio" name="q7" value="c"> Compilation error<br>
      <input type="radio" name="q7" value="d"> Runtime error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **Runtime error**

      **Explanation:** Modifying a `HashSet` while iterating over it will throw a `ConcurrentModificationException` at runtime.
    </details>

8. What will be the output when the following code snippet is executed?

    ```java
    import java.util.LinkedList;
    public class Example {
        public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<>();
            list.add("A");
            list.add("B");
            list.add("C");
            System.out.println(list.get(3));
        }
    }
    ```

    <form>
      <input type="radio" name="q8" value="a"> C<br>
      <input type="radio" name="q8" value="b"> null<br>
      <input type="radio" name="q8" value="c"> Compilation error<br>
      <input type="radio" name="q8" value="d"> Runtime error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **Runtime error**

      **Explanation:** The `get(int index)` method will throw an `IndexOutOfBoundsException` if the index is out of range. Since the list has elements at indices 0, 1, and 2, trying to access index 3 will cause a runtime error.
    </details>

9. What will happen when the following code snippet is executed?

    ```java
    import java.util.TreeSet;
    public class Example {
        public static void main(String[] args) {
            TreeSet<String> set = new TreeSet<>();
            set.add("Apple");
            set.add("apple");
            set.add("Banana");
            System.out.println(set);
        }
    }
    ```

    <form>
      <input type="radio" name="q9" value="a"> [Apple, Banana, apple]<br>
      <input type="radio" name="q9" value="b"> [Apple, apple, Banana]<br>
      <input type="radio" name="q9" value="c"> [Banana, Apple, apple]<br>
      <input type="radio" name="q9" value="d"> [Apple, Banana]<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **[Apple, Banana, apple]**

      **Explanation:** `TreeSet` sorts elements according to their natural ordering. In Java, uppercase letters come before lowercase letters in Unicode, so "Apple" < "Banana" < "apple". Therefore, the set will be ordered as `[Apple, Banana, apple]`.
    </details>

10. What will be the output when the following code snippet is executed?

    ```java
    import java.util.Vector;
    public class Example {
        public static void main(String[] args) {
            Vector vector = new Vector();
            vector.add("1");
            vector.add(2);
            for (Object obj : vector) {
                System.out.print((String) obj + " ");
            }
        }
    }
    ```

    <form>
      <input type="radio" name="q10" value="a"> 1 2<br>
      <input type="radio" name="q10" value="b"> Compilation error<br>
      <input type="radio" name="q10" value="c"> Runtime error<br>
      <input type="radio" name="q10" value="d"> 1<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **Runtime error**

      **Explanation:** The code attempts to cast an `Integer` object (`2`) to a `String`, which will throw a `ClassCastException` at runtime. To avoid this, ensure that all elements are of the same type or handle casting appropriately.
    </details>

[Back to Top](#top)

### Slightly harder MCQs

1. What will be the output of the following code snippet?

    ```java
    import java.util.HashSet;
    import java.util.Iterator;
    public class Example {
        public static void main(String[] args) {
            HashSet<Integer> set = new HashSet<>();
            set.add(10);
            set.add(20);
            set.add(30);
            Iterator<Integer> it = set.iterator();
            while (it.hasNext()) {
                Integer value = it.next();
                if (value % 20 == 0) {
                    it.remove();
                }
            }
            System.out.println(set);
        }
    }
    ```

    <form>
      <input type="radio" name="q1" value="a"> [10, 30]<br>
      <input type="radio" name="q1" value="b"> [10, 20, 30]<br>
      <input type="radio" name="q1" value="c"> [10]<br>
      <input type="radio" name="q1" value="d"> []<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **[10, 30]**

      **Explanation:** The code removes elements divisible by 20 using an iterator's `remove()` method. Since 20 is divisible by 20, it is removed, leaving `[10, 30]` in the set.
    </details>

2. What will be the output of the following code snippet?

    ```java
    import java.util.ArrayList;
    public class Example {
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(30);
            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i) + 10);
            }
            System.out.println(list);
        }
    }
    ```

    <form>
      <input type="radio" name="q2" value="a"> [20, 30, 40]<br>
      <input type="radio" name="q2" value="b"> [10, 20, 30]<br>
      <input type="radio" name="q2" value="c"> [20, 40, 60]<br>
      <input type="radio" name="q2" value="d"> [30, 40, 50]<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **[20, 30, 40]**

      **Explanation:** The code iterates through the list and increases each element by 10 using the `set` method. The final list is `[20, 30, 40]`.
    </details>

3. What will happen when the following code snippet is executed?

    ```java
    import java.util.LinkedList;
    public class Example {
        public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<>();
            list.add("A");
            list.add("B");
            list.add("C");
            list.removeFirst();
            list.addFirst("D");
            System.out.println(list);
        }
    }
    ```

    <form>
      <input type="radio" name="q3" value="a"> [D, A, B, C]<br>
      <input type="radio" name="q3" value="b"> [D, B, C]<br>
      <input type="radio" name="q3" value="c"> [A, B, C, D]<br>
      <input type="radio" name="q3" value="d"> [B, C, D]<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **[D, B, C]**

      **Explanation:** The code first removes the first element "A" from the list, and then adds "D" to the beginning. The final list is `[D, B, C]`.
    </details>

4. What will happen when the following code snippet is executed?

    ```java
    import java.util.TreeSet;
    public class Example {
        public static void main(String[] args) {
            TreeSet<Integer> set = new TreeSet<>();
            set.add(10);
            set.add(5);
            set.add(20);
            set.add(5);
            System.out.println(set);
        }
    }
    ```

    <form>
      <input type="radio" name="q4" value="a"> [5, 10, 20]<br>
      <input type="radio" name="q4" value="b"> [5, 10, 20, 5]<br>
      <input type="radio" name="q4" value="c"> [10, 5, 20]<br>
      <input type="radio" name="q4" value="d"> [20, 10, 5]<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **[5, 10, 20]**

      **Explanation:** `TreeSet` maintains a sorted order and does not allow duplicate elements. The final set is `[5, 10, 20]`.
    </details>

5. What will be the result of executing the following code snippet?

    ```java
    import java.util.Vector;
    public class Example {
        public static void main(String[] args) {
            Vector<String> vector = new Vector<>();
            vector.add("A");
            vector.add("B");
            vector.add("C");
            vector.add(1, "D");
            vector.remove("C");
            System.out.println(vector);
        }
    }
    ```

    <form>
      <input type="radio" name="q5" value="a"> [A, D, B]<br>
      <input type="radio" name="q5" value="b"> [A, B, D]<br>
      <input type="radio" name="q5" value="c"> [A, B]<br>
      <input type="radio" name="q5" value="d"> [D, A, B]<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **[A, D, B]**

      **Explanation:** The code inserts "D" at index 1, shifting the elements to the right, and then removes "C". The final vector is `[A, D, B]`.
    </details>

6. What will be the output when the following code snippet is executed?

    ```java
    import java.util.HashSet;
    public class Example {
        public static void main(String[] args) {
            HashSet<Integer> set = new HashSet<>();
            set.add(1);
            set.add(2);
            set.add(3);
            set.add(2);
            System.out.println(set.size());
        }
    }
    ```

    <form>
      <input type="radio" name="q6" value="a"> 3<br>
      <input type="radio" name="q6" value="b"> 4<br>
      <input type="radio" name="q6" value="c"> 2<br>
      <input type="radio" name="q6" value="d"> 1<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **3**

      **Explanation:** `HashSet` does not allow duplicate elements, so adding "2" twice has no effect. The set contains 3 unique elements: 1, 2, and 3.
    </details>

7. What will happen when the following code snippet is executed?

    ```java
    import java.util.LinkedList;
    public class Example {
        public static void main(String[] args) {
            LinkedList<Integer> list = new LinkedList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.addLast(4);
            list.removeFirst();
            System.out.println(list);
        }
    }
    ```

    <form>
      <input type="radio" name="q7" value="a"> [1, 2, 3, 4]<br>
      <input type="radio" name="q7" value="b"> [2, 3, 4]<br>
      <input type="radio" name="q7" value="c"> [3, 4]<br>
      <input type="radio" name="q7" value="d"> [4, 3, 2, 1]<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **[2, 3, 4]**

      **Explanation:** The code adds 4 to the end of the list and then removes the first element, resulting in the list `[2, 3, 4]`.
    </details>

8. What will happen when the following code snippet is executed?

    ```java
    import java.util.TreeSet;
    public class Example {
        public static void main(String[] args) {
            TreeSet<String> set = new TreeSet<>();
            set.add("Banana");
            set.add("Apple");
            set.add("Mango");
            System.out.println(set);
        }
    }
    ```

    <form>
      <input type="radio" name="q8" value="a"> [Banana, Apple, Mango]<br>
      <input type="radio" name="q8" value="b"> [Apple, Banana, Mango]<br>


      <input type="radio" name="q8" value="c"> [Mango, Apple, Banana]<br>
      <input type="radio" name="q8" value="d"> [Apple, Mango, Banana]<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **[Apple, Banana, Mango]**

      **Explanation:** `TreeSet` stores elements in a natural sorted order. The final set is `[Apple, Banana, Mango]`.
    </details>

9. What will be the output when the following code is executed?

    ```java
    import java.util.ArrayList;
    public class Example {
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(0, 0);
            list.remove(2);
            System.out.println(list);
        }
    }
    ```

    <form>
      <input type="radio" name="q9" value="a"> [0, 1, 2, 3]<br>
      <input type="radio" name="q9" value="b"> [0, 2, 3]<br>
      <input type="radio" name="q9" value="c"> [0, 1, 3]<br>
      <input type="radio" name="q9" value="d"> [1, 2, 3]<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **[0, 1, 3]**

      **Explanation:** The code inserts `0` at the beginning of the list, and then removes the element at index `2` (which is `2`), resulting in `[0, 1, 3]`.
    </details>

10. What will be the output when the following code snippet is executed?

    ```java
    import java.util.HashSet;
    public class Example {
        public static void main(String[] args) {
            HashSet<String> set = new HashSet<>();
            set.add("apple");
            set.add("banana");
            set.add("cherry");
            set.add("banana");
            System.out.println(set.contains("banana"));
        }
    }
    ```

    <form>
      <input type="radio" name="q10" value="a"> false<br>
      <input type="radio" name="q10" value="b"> true<br>
      <input type="radio" name="q10" value="c"> Compilation error<br>
      <input type="radio" name="q10" value="d"> Runtime error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **true**

      **Explanation:** `HashSet` allows only unique elements, and the `contains` method checks if an element exists in the set. Since "banana" is in the set, the output is `true`.
    </details>

1. Given a `Student` class with a constructor that initializes the `name` and `age` fields, what will be the output of the following code snippet?

    ```java
    import java.util.ArrayList;
    public class Example {
        public static void main(String[] args) {
            ArrayList<Student> students = new ArrayList<>();
            students.add(new Student("Alice", 20));
            students.add(new Student("Bob", 22));
            students.add(new Student("Charlie", 21));
            System.out.println(students.size());
        }
    }
    ```

    <form>
      <input type="radio" name="q1" value="a"> 1<br>
      <input type="radio" name="q1" value="b"> 2<br>
      <input type="radio" name="q1" value="c"> 3<br>
      <input type="radio" name="q1" value="d"> Compilation error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **3**

      **Explanation:** The code adds three `Student` objects to the `ArrayList`, so the size of the list is 3.
    </details>

2. Given a `Student` class with a `name` field and a method `getName()` that returns the student's name, what will be the output of the following code snippet?

    ```java
    import java.util.LinkedList;
    public class Example {
        public static void main(String[] args) {
            LinkedList<Student> students = new LinkedList<>();
            students.add(new Student("Alice"));
            students.add(new Student("Bob"));
            students.addFirst(new Student("Eve"));
            System.out.println(students.getFirst().getName());
        }
    }
    ```

    <form>
      <input type="radio" name="q2" value="a"> Alice<br>
      <input type="radio" name="q2" value="b"> Bob<br>
      <input type="radio" name="q2" value="c"> Eve<br>
      <input type="radio" name="q2" value="d"> Compilation error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **Eve**

      **Explanation:** `addFirst` inserts the student "Eve" at the beginning of the list, so `getFirst().getName()` returns "Eve".
    </details>

3. Given a `Student` class with fields `name` and `age`, what will be the output of the following code snippet?

    ```java
    import java.util.HashSet;
    public class Example {
        public static void main(String[] args) {
            HashSet<Student> students = new HashSet<>();
            students.add(new Student("Alice", 20));
            students.add(new Student("Bob", 22));
            students.add(new Student("Alice", 20));
            System.out.println(students.size());
        }
    }
    ```

    <form>
      <input type="radio" name="q3" value="a"> 1<br>
      <input type="radio" name="q3" value="b"> 2<br>
      <input type="radio" name="q3" value="c"> 3<br>
      <input type="radio" name="q3" value="d"> Compilation error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **2**

      **Explanation:** If the `Student` class does not override `equals` and `hashCode`, the two `Student` objects with the same data are treated as different objects. So, the size of the set is 2.
    </details>

4. Given a `Student` class with fields `name` and `age`, what will be the output of the following code snippet?

    ```java
    import java.util.TreeSet;
    public class Example {
        public static void main(String[] args) {
            TreeSet<Student> students = new TreeSet<>();
            students.add(new Student("Alice", 20));
            students.add(new Student("Bob", 22));
            students.add(new Student("Charlie", 21));
            System.out.println(students);
        }
    }
    ```

    <form>
      <input type="radio" name="q4" value="a"> [Alice, Bob, Charlie]<br>
      <input type="radio" name="q4" value="b"> [Charlie, Bob, Alice]<br>
      <input type="radio" name="q4" value="c"> [Bob, Alice, Charlie]<br>
      <input type="radio" name="q4" value="d"> Compilation error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **Compilation error**

      **Explanation:** `TreeSet` requires elements to be comparable, so the `Student` class must implement `Comparable` or provide a `Comparator` when creating the `TreeSet`.
    </details>

5. Given a `Student` class with fields `name` and `age`, what will be the output of the following code snippet?

    ```java
    import java.util.Vector;
    public class Example {
        public static void main(String[] args) {
            Vector<Student> students = new Vector<>();
            students.add(new Student("Alice", 20));
            students.add(new Student("Bob", 22));
            students.add(new Student("Charlie", 21));
            students.remove(1);
            System.out.println(students.size());
        }
    }
    ```

    <form>
      <input type="radio" name="q5" value="a"> 1<br>
      <input type="radio" name="q5" value="b"> 2<br>
      <input type="radio" name="q5" value="c"> 3<br>
      <input type="radio" name="q5" value="d"> Compilation error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **2**

      **Explanation:** The code removes the student at index 1, so the size of the `Vector` becomes 2.
    </details>

6. Given a `Student` class with fields `name` and `grade`, what will be the output of the following code snippet?

    ```java
    import java.util.LinkedHashSet;
    public class Example {
        public static void main(String[] args) {
            LinkedHashSet<Student> students = new LinkedHashSet<>();
            students.add(new Student("Alice", "A"));
            students.add(new Student("Bob", "B"));
            students.add(new Student("Charlie", "C"));
            for (Student student : students) {
                System.out.print(student.getName() + " ");
            }
        }
    }
    ```

    <form>
      <input type="radio" name="q6" value="a"> Alice Bob Charlie<br>
      <input type="radio" name="q6" value="b"> Charlie Bob Alice<br>
      <input type="radio" name="q6" value="c"> Bob Charlie Alice<br>
      <input type="radio" name="q6" value="d"> Compilation error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **Alice Bob Charlie**

      **Explanation:** `LinkedHashSet` maintains the insertion order, so the elements are printed in the order they were added.
    </details>

7. Given a `Student` class with fields `name` and `grade`, what will be the output of the following code snippet?

    ```java
    import java.util.ArrayList;
    public class Example {
        public static void main(String[] args) {
            ArrayList<Student> students = new ArrayList<>();
            students.add(new Student("Alice", "A"));
            students.add(new Student("Bob", "B"));
            students.add(new Student("Charlie", "C"));
            students.clear();
            System.out.println(students.isEmpty());
        }
    }
    ```

    <form>
      <input type="radio" name="q7" value="a"> true<br>
      <input type="radio" name="q7" value="b"> false<br>
      <input type="radio" name="q7" value="c"> Compilation error<br>
      <input type="radio" name="q7" value="d"> Runtime error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **true**

      **Explanation:** The `clear()` method removes all elements from the list, making it empty. The `isEmpty()` method returns `true`.
    </details>

8. Given a `Student` class with fields `name` and `marks`, what will be the output of the following code snippet?

    ```java
    import java.util.HashSet;
    public class Example {
        public static void main(String[] args) {
            HashSet<Student> students = new HashSet<>();
            students.add(new Student("Alice", 85));
            students.add(new Student("Bob", 92));
            students.add(new Student("Charlie", 78));
            for (Student student : students) {
                if (student.getMarks() > 80) {
                    System.out.print(student.getName() + " ");
                }
            }
        }
    }
    ```

    <form>
      <input type="radio" name="q8" value="a"> Alice Bob<br>
      <input type="radio" name="q8" value="b"> Bob<br>
      <input type="radio" name="q8" value="c"> Alice Charlie<br>
      <input type="radio" name="q8"

    value="d"> Bob Alice Charlie<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **Alice Bob**

      **Explanation:** The code prints the names of students with marks greater than 80, so "Alice" and "Bob" are printed.
    </details>

9. Given a `Student` class with fields `name` and `marks`, what will be the output of the following code snippet?

    ```java
    import java.util.TreeSet;
    public class Example {
        public static void main(String[] args) {
            TreeSet<Student> students = new TreeSet<>(new Comparator<Student>() {
                public int compare(Student s1, Student s2) {
                    return s2.getMarks() - s1.getMarks();
                }
            });
            students.add(new Student("Alice", 85));
            students.add(new Student("Bob", 92));
            students.add(new Student("Charlie", 78));
            System.out.println(students.first().getName());
        }
    }
    ```

    <form>
      <input type="radio" name="q9" value="a"> Alice<br>
      <input type="radio" name="q9" value="b"> Bob<br>
      <input type="radio" name="q9" value="c"> Charlie<br>
      <input type="radio" name="q9" value="d"> Compilation error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **Bob**

      **Explanation:** The custom comparator sorts students by marks in descending order, so `first()` returns "Bob", who has the highest marks.
    </details>

10. Given a `Student` class with fields `name` and `marks`, what will be the output of the following code snippet?

    ```java
    import java.util.Vector;
    public class Example {
        public static void main(String[] args) {
            Vector<Student> students = new Vector<>();
            students.add(new Student("Alice", 85));
            students.add(new Student("Bob", 92));
            students.add(new Student("Charlie", 78));
            students.remove(new Student("Alice", 85));
            System.out.println(students.size());
        }
    }
    ```

    <form>
      <input type="radio" name="q10" value="a"> 1<br>
      <input type="radio" name="q10" value="b"> 2<br>
      <input type="radio" name="q10" value="c"> 3<br>
      <input type="radio" name="q10" value="d"> Compilation error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **2**

      **Explanation:** If the `Student` class does not override `equals` and `hashCode`, the `remove` method won't find a match, and the size remains unchanged at 3. If it does, the size will be 2.
    </details>

1. Given a `Book` class with fields `title` and `author`, what will be the output of the following code snippet?

    ```java
    import java.util.ArrayList;
    public class Example {
        public static void main(String[] args) {
            ArrayList<Book> books = new ArrayList<>();
            books.add(new Book("1984", "George Orwell"));
            books.add(new Book("Brave New World", "Aldous Huxley"));
            books.add(new Book("Fahrenheit 451", "Ray Bradbury"));
            System.out.println(books.size());
        }
    }
    ```

    <form>
      <input type="radio" name="q1" value="a"> 1<br>
      <input type="radio" name="q1" value="b"> 2<br>
      <input type="radio" name="q1" value="c"> 3<br>
      <input type="radio" name="q1" value="d"> Compilation error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **3**

      **Explanation:** The code adds three `Book` objects to the `ArrayList`, so the size of the list is 3.
    </details>

2. Given a `Movie` class with fields `title` and `year`, what will be the output of the following code snippet?

    ```java
    import java.util.LinkedList;
    public class Example {
        public static void main(String[] args) {
            LinkedList<Movie> movies = new LinkedList<>();
            movies.add(new Movie("Inception", 2010));
            movies.add(new Movie("The Matrix", 1999));
            movies.addFirst(new Movie("Interstellar", 2014));
            System.out.println(movies.getFirst().getTitle());
        }
    }
    ```

    <form>
      <input type="radio" name="q2" value="a"> Inception<br>
      <input type="radio" name="q2" value="b"> The Matrix<br>
      <input type="radio" name="q2" value="c"> Interstellar<br>
      <input type="radio" name="q2" value="d"> Compilation error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **Interstellar**

      **Explanation:** `addFirst` inserts the movie "Interstellar" at the beginning of the list, so `getFirst().getTitle()` returns "Interstellar".
    </details>

3. Given a `Person` class with fields `name` and `age`, what will be the output of the following code snippet?

    ```java
    import java.util.HashSet;
    public class Example {
        public static void main(String[] args) {
            HashSet<Person> people = new HashSet<>();
            people.add(new Person("Alice", 30));
            people.add(new Person("Bob", 25));
            people.add(new Person("Alice", 30));
            System.out.println(people.size());
        }
    }
    ```

    <form>
      <input type="radio" name="q3" value="a"> 1<br>
      <input type="radio" name="q3" value="b"> 2<br>
      <input type="radio" name="q3" value="c"> 3<br>
      <input type="radio" name="q3" value="d"> Compilation error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **2**

      **Explanation:** If the `Person` class does not override `equals` and `hashCode`, the two `Person` objects with the same data are treated as different objects. So, the size of the set is 2.
    </details>

4. Given a `Song` class with fields `title` and `artist`, what will be the output of the following code snippet?

    ```java
    import java.util.TreeSet;
    public class Example {
        public static void main(String[] args) {
            TreeSet<Song> playlist = new TreeSet<>();
            playlist.add(new Song("Bohemian Rhapsody", "Queen"));
            playlist.add(new Song("Stairway to Heaven", "Led Zeppelin"));
            playlist.add(new Song("Hotel California", "Eagles"));
            System.out.println(playlist);
        }
    }
    ```

    <form>
      <input type="radio" name="q4" value="a"> [Bohemian Rhapsody, Stairway to Heaven, Hotel California]<br>
      <input type="radio" name="q4" value="b"> [Stairway to Heaven, Bohemian Rhapsody, Hotel California]<br>
      <input type="radio" name="q4" value="c"> [Hotel California, Stairway to Heaven, Bohemian Rhapsody]<br>
      <input type="radio" name="q4" value="d"> Compilation error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **Compilation error**

      **Explanation:** `TreeSet` requires elements to be comparable, so the `Song` class must implement `Comparable` or provide a `Comparator` when creating the `TreeSet`.
    </details>

5. Given a `Product` class with fields `name` and `price`, what will be the output of the following code snippet?

    ```java
    import java.util.Vector;
    public class Example {
        public static void main(String[] args) {
            Vector<Product> products = new Vector<>();
            products.add(new Product("Laptop", 1000));
            products.add(new Product("Smartphone", 700));
            products.add(new Product("Tablet", 500));
            products.remove(1);
            System.out.println(products.size());
        }
    }
    ```

    <form>
      <input type="radio" name="q5" value="a"> 1<br>
      <input type="radio" name="q5" value="b"> 2<br>
      <input type="radio" name="q5" value="c"> 3<br>
      <input type="radio" name="q5" value="d"> Compilation error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **2**

      **Explanation:** The code removes the product at index 1, so the size of the `Vector` becomes 2.
    </details>

6. Given a `City` class with fields `name` and `population`, what will be the output of the following code snippet?

    ```java
    import java.util.LinkedHashSet;
    public class Example {
        public static void main(String[] args) {
            LinkedHashSet<City> cities = new LinkedHashSet<>();
            cities.add(new City("New York", 8419000));
            cities.add(new City("Los Angeles", 3980000));
            cities.add(new City("Chicago", 2716000));
            for (City city : cities) {
                System.out.print(city.getName() + " ");
            }
        }
    }
    ```

    <form>
      <input type="radio" name="q6" value="a"> New York Los Angeles Chicago<br>
      <input type="radio" name="q6" value="b"> Chicago Los Angeles New York<br>
      <input type="radio" name="q6" value="c"> Los Angeles Chicago New York<br>
      <input type="radio" name="q6" value="d"> Compilation error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **New York Los Angeles Chicago**

      **Explanation:** `LinkedHashSet` maintains the insertion order, so the elements are printed in the order they were added.
    </details>

7. Given an `Animal` class with fields `species` and `age`, what will be the output of the following code snippet?

    ```java
    import java.util.ArrayList;
    public class Example {
        public static void main(String[] args) {
            ArrayList<Animal> zoo = new ArrayList<>();
            zoo.add(new Animal("Elephant", 10));
            zoo.add(new Animal("Tiger", 5));
            zoo.add(new Animal("Giraffe", 7));
            zoo.clear();
            System.out.println(zoo.isEmpty());
        }
    }
    ```

    <form>
      <input type="radio" name="q7" value="a"> true<br>
      <input type="radio" name="q7" value="b"> false<br>
      <input type="radio" name="q7" value="c"> Compilation error<br>
      <input type="radio" name="q7" value="d"> Runtime error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **true**

      **Explanation:** The `clear()` method removes all elements from the list, making it empty. The `isEmpty()` method returns `true`.
    </details>

8. Given a `Car` class with fields `make` and `year`, what will be the output of the following code snippet?

    ```java
    import java.util.HashSet;
    public class Example {
        public static void main(String[] args) {
            HashSet<Car> garage = new HashSet<>();
            garage.add(new Car("Toyota", 2018));
            garage.add(new Car("Honda", 2020));
            garage.add(new Car("Ford", 2019));
            for (Car car : garage) {
                if (car.getYear() > 2018) {
                    System.out.print(car.getMake() + " ");
                }
            }
        }
    }
    ```

    <form>
      <input type="radio" name="q8" value="a"> Toyota Honda Ford<br>
      <input type="radio" name="q8" value="b"> Honda Ford<br>
      <input type="radio" name="q8" value="c"> Ford Toyota<br>
      <input type="radio" name="q8" value="d"> Compilation error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **Honda Ford**

      **Explanation:** The loop checks if the car's year is greater than 2018, so "Honda" and "Ford" are printed since they were manufactured after 2018.
    </details>

9. Given a `Gadget` class with fields `name` and `price`, what will be the output of the following code snippet?

    ```java
    import java.util.TreeSet;
    public class Example {
        public static void main(String[] args) {
            TreeSet<Gadget> gadgets = new TreeSet<>(new Comparator<Gadget>() {
                public int compare(Gadget g1, Gadget g2) {
                    return g1.getPrice() - g2.getPrice();
                }
            });
            gadgets.add(new Gadget("Smartphone", 700));
            gadgets.add(new Gadget("Tablet", 500));
            gadgets.add(new Gadget("Laptop", 1000));
            System.out.println(gadgets.last().getName());
        }
    }
    ```

    <form>
      <input type="radio" name="q9" value="a"> Smartphone<br>
      <input type="radio" name="q9" value="b"> Tablet<br>
      <input type="radio" name="q9" value="c"> Laptop<br>
      <input type="radio" name="q9" value="d"> Compilation error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **Laptop**

      **Explanation:** The custom comparator sorts the gadgets by price in ascending order, so the last element (highest price) is "Laptop".
    </details>

10. Given a `Course` class with fields `courseName` and `duration`, what will be the output of the following code snippet?

    ```java
    import java.util.LinkedList;
    public class Example {
        public static void main(String[] args) {
            LinkedList<Course> courses = new LinkedList<>();
            courses.add(new Course("Java", 30));
            courses.add(new Course("Python", 25));
            courses.add(new Course("JavaScript", 20));
            courses.removeLast();
            System.out.println(courses.getLast().getCourseName());
        }
    }
    ```

    <form>
      <input type="radio" name="q10" value="a"> Java<br>
      <input type="radio" name="q10" value="b"> Python<br>
      <input type="radio" name="q10" value="c"> JavaScript<br>
      <input type="radio" name="q10" value="d"> Compilation error<br>
    </form>
    <details markdown="block">
      <summary>Answer</summary>
      **Python**

      **Explanation:** The `removeLast()` method removes the last course in the list, leaving "Java" and "Python". The `getLast()` method then returns the course name of the last remaining course, "Python".
    </details>

[Back to Top](#top)
