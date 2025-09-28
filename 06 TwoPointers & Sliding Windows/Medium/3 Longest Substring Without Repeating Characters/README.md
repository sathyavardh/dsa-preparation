# 3. Longest Substring Without Repeating Characters

**Difficulty:** Medium  
**Topics:** Hash Table, String, Sliding Window  
**Companies:** Amazon, Microsoft, Google, Facebook, Apple

## Problem Statement

Given a string `s`, find the length of the **longest** **substring** without duplicate characters.

## Examples

### Example 1:
```
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
```

### Example 2:
```
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
```

### Example 3:
```
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
```

## Constraints

- `0 <= s.length <= 5 * 10^4`
- `s` consists of English letters, digits, symbols and spaces.

## Hints

- Use a sliding window approach with two pointers
- Keep track of characters using a hash set or hash map
- When a duplicate is found, move the left pointer to eliminate the duplicate