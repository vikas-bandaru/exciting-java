---
layout: default
title: Problem Solving Techniques
parent: Learn
nav_order: 4
has_children: true
---

[Back to Module 1: Java](../java)

# Learn: Let's learn Problem Solving (Logic Building)

Here’s a list of basic problem-solving techniques, sorted from easiest to learn to hardest to master. These techniques gradually build on one another, helping you approach increasingly complex problems as you advance.

## 1. **Brute Force**
   - **Description**: Try all possible solutions to find the correct one.
   - **Example**: Find the maximum value in an array by checking each element.
   - **When to use**: When problem size is small, or there are no clear shortcuts.
   - **Difficulty**: ★☆☆☆☆ (Easy)

## 2. **Greedy Algorithms**
   - **Description**: Make a locally optimal choice at each step, hoping it leads to a globally optimal solution.
   - **Example**: Find the shortest path in an unweighted graph using a BFS.
   - **When to use**: Problems where you can pick the next best option without reconsidering previous choices.
   - **Difficulty**: ★★☆☆☆ (Easy to moderate)

## 3. **Divide and Conquer**
   - **Description**: Divide the problem into smaller subproblems, solve them independently, and combine the results.
   - **Example**: Merge sort, binary search.
   - **When to use**: Problems that can be split into independent smaller problems.
   - **Difficulty**: ★★☆☆☆ (Easy to moderate)

## 4. **Recursion**
   - **Description**: Solve the problem by solving smaller instances of the same problem, usually with a base case to stop.
   - **Example**: Factorial, Fibonacci sequence.
   - **When to use**: Problems that can be defined in terms of smaller subproblems.
   - **Difficulty**: ★★☆☆☆ (Moderate)

## 5. **Backtracking**
   - **Description**: Try solutions, and backtrack if a solution fails, exploring all possible solutions efficiently.
   - **Example**: Solving a Sudoku puzzle, N-Queens problem.
   - **When to use**: Search problems with many possible solutions, where you need to find a valid solution (e.g., constraint satisfaction).
   - **Difficulty**: ★★★☆☆ (Moderate)

## 6. **Dynamic Programming**
   - **Description**: Solve complex problems by breaking them into simpler subproblems and storing the results of subproblems to avoid recalculating.
   - **Example**: Fibonacci with memoization, knapsack problem.
   - **When to use**: Problems with overlapping subproblems and optimal substructure (e.g., optimization problems).
   - **Difficulty**: ★★★☆☆ (Moderate to hard)

## 7. **Two-Pointer Technique**
   - **Description**: Use two pointers to traverse data in opposite or same directions to reduce time complexity.
   - **Example**: Finding pairs in an array with a given sum.
   - **When to use**: Problems involving arrays or linked lists where the data is sorted or needs to be searched efficiently.
   - **Difficulty**: ★★★☆☆ (Moderate to hard)

## 8. **Sliding Window**
   - **Description**: Use a window that slides across a data structure (usually arrays) to solve problems involving subarrays or substrings.
   - **Example**: Maximum sum of a subarray of fixed size.
   - **When to use**: Problems involving continuous subarrays or substrings.
   - **Difficulty**: ★★★☆☆ (Moderate to hard)

## 9. **Bit Manipulation**
   - **Description**: Use bitwise operations to solve problems efficiently by manipulating bits.
   - **Example**: Check if a number is a power of two, find the only non-repeated element in an array.
   - **When to use**: Problems that require manipulation of individual bits or need space optimization.
   - **Difficulty**: ★★★★☆ (Hard)

## 10. **Graph Algorithms**
   - **Description**: Solve problems related to graph traversal, shortest paths, and graph properties.
   - **Example**: Dijkstra’s algorithm, depth-first search (DFS), breadth-first search (BFS).
   - **When to use**: Problems involving nodes and connections (networks, maps, etc.).
   - **Difficulty**: ★★★★☆ (Hard)

## 11. **Topological Sorting**
   - **Description**: Order the vertices in a Directed Acyclic Graph (DAG) such that for every directed edge \( uv \), vertex \( u \) comes before vertex \( v \).
   - **Example**: Course scheduling, project management problems.
   - **When to use**: Problems that involve dependencies or precedence constraints.
   - **Difficulty**: ★★★★☆ (Hard)

## 12. **Mathematical Techniques**
   - **Description**: Use mathematical formulas or properties to solve problems.
   - **Example**: Modular arithmetic, combinatorics, prime number theory.
   - **When to use**: Problems involving number theory, counting, or optimization.
   - **Difficulty**: ★★★★☆ (Hard)

## 13. **Branch and Bound**
   - **Description**: Systematically explore the solution space, pruning paths that are unlikely to lead to a valid solution.
   - **Example**: Solving the traveling salesman problem, integer linear programming.
   - **When to use**: Optimization problems where you need to find the best solution among a set of possibilities.
   - **Difficulty**: ★★★★★ (Very hard)

## 14. **Greedy-Dynamic Programming Hybrid**
   - **Description**: Combine greedy approaches with dynamic programming to solve more complex optimization problems.
   - **Example**: Job scheduling with deadlines.
   - **When to use**: When greedy algorithms alone are not enough and dynamic programming can provide more efficient solutions.
   - **Difficulty**: ★★★★★ (Very hard)

## 15. **Heuristic Search Algorithms**
   - **Description**: Use heuristic functions to guide the search toward the best solution in large or complex problem spaces.
   - **Example**: A* search algorithm, simulated annealing.
   - **When to use**: Problems with large state spaces (e.g., pathfinding, games).
   - **Difficulty**: ★★★★★ (Very hard)

---

### Summary:
- **Easy to moderate**: Brute force, recursion, divide and conquer, greedy algorithms.
- **Moderate to hard**: Dynamic programming, two-pointer technique, sliding window, backtracking.
- **Hard to master**: Bit manipulation, graph algorithms, topological sorting, mathematical techniques, branch and bound, heuristic search.

You can start with the easier techniques and progressively work toward more advanced techniques as you get comfortable.

