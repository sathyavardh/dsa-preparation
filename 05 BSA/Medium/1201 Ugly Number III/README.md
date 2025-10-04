# 1201. Ugly Number III

**Difficulty:** Medium

## Problem Description

An **ugly number** is a positive integer that is divisible by `a`, `b`, or `c`.

Given four integers `n`, `a`, `b`, and `c`, return the `nth` **ugly number**.

## Examples

### Example 1:
```
Input: n = 3, a = 2, b = 3, c = 5
Output: 4
Explanation: The ugly numbers are 2, 3, 4, 5, 6, 8, 9, 10... The 3rd is 4.
```

### Example 2:
```
Input: n = 4, a = 2, b = 3, c = 4
Output: 6
Explanation: The ugly numbers are 2, 3, 4, 6, 8, 9, 10, 12... The 4th is 6.
```

### Example 3:
```
Input: n = 5, a = 2, b = 11, c = 13
Output: 10
Explanation: The ugly numbers are 2, 4, 6, 8, 10, 11, 12, 13... The 5th is 10.
```

## Constraints

- `1 <= n, a, b, c <= 10^9`
- `1 <= a * b * c <= 10^18`
- It is guaranteed that the result will be in range `[1, 2 * 10^9]`

## Hints

1. Consider using binary search on the answer
2. For a given number `x`, can you count how many ugly numbers are less than or equal to `x`?
3. Use the inclusion-exclusion principle to count multiples of `a`, `b`, or `c`

## Approach Overview

This problem requires finding the nth number divisible by at least one of three given numbers. The key insights are:

### 1. Binary Search
Search for the answer in the range `[1, 2 * 10^9]`

### 2. Counting Function
For any number `x`, count how many numbers ≤ `x` are divisible by `a`, `b`, or `c`

### 3. Inclusion-Exclusion Principle
To avoid double-counting, use:

```
Count = (multiples of a) 
      + (multiples of b) 
      + (multiples of c) 
      - (multiples of lcm(a,b)) 
      - (multiples of lcm(b,c)) 
      - (multiples of lcm(a,c)) 
      + (multiples of lcm(a,b,c))
```

## Key Concepts

- **GCD (Greatest Common Divisor)**: Used to calculate LCM
- **LCM (Least Common Multiple)**: `lcm(x, y) = (x * y) / gcd(x, y)`
- **Binary Search**: Find the smallest number where count ≥ n
- **Inclusion-Exclusion Principle**: Accurately count numbers divisible by at least one of a, b, or c

## Topics

- Binary Search
- Math
- Number Theory
- Inclusion-Exclusion Principle