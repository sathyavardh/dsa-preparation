# 739. Daily Temperatures

**Difficulty:** Medium  
**Topics:** Array, Stack, Monotonic Stack  
**Companies:** Various

## Problem Description

Given an array of integers `temperatures` representing the daily temperatures, return *an array* `answer` *such that* `answer[i]` *is the number of days you have to wait after the* `ith` *day to get a warmer temperature*. If there is no future day for which this is possible, keep `answer[i] == 0` instead.

## Examples

### Example 1:
```
Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
```

### Example 2:
```
Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]
```

### Example 3:
```
Input: temperatures = [30,60,90]
Output: [1,1,0]
```

## Constraints

- `1 <= temperatures.length <= 10^5`
- `30 <= temperatures[i] <= 100`

## Problem Analysis

This is a classic monotonic stack problem where:
- For each day, we need to find the next warmer day
- If no warmer day exists, the answer is 0
- The result should be the number of days to wait, not the actual temperature

## Approach Hints

1. **Brute Force:** For each day, scan forward to find the next warmer day - O(n²) time complexity
2. **Monotonic Stack:** Use a stack to keep track of indices of days waiting for warmer temperatures - O(n) time complexity
3. **Backward Iteration:** Start from the end and use the previously computed results to optimize the search

## Key Insights

- Stack-based solution maintains indices of temperatures in decreasing order
- When we find a warmer temperature, we can resolve multiple previous days at once
- The stack helps us avoid redundant comparisons by maintaining a monotonic decreasing sequence