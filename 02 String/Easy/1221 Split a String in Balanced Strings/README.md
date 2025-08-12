# 1221. Split a String in Balanced Strings

## Problem
A **balanced string** is one where the number of `'L'` characters equals the number of `'R'` characters.

Given a **balanced** string `s`, split it into the **maximum** number of balanced substrings.

Return the number of balanced substrings.

---

## Example 1
**Input:**
s = "RLRRLLRLRL"


**Output:**
4


**Explanation:**
We can split as:
- `"RL"` → balanced  
- `"RRLL"` → balanced  
- `"RL"` → balanced  
- `"RL"` → balanced  

---

## Example 2
**Input:**
s = "RLRRRLLRLL"


**Output:**
2

**Explanation:**
We can split as:
- `"RL"` → balanced  
- `"RRRLLRLL"` → balanced  

---

## Example 3
**Input:**
s = "LLLLRRRR"

**Output:**
1


**Explanation:**
The whole string is balanced, so only **1** split.

---

## Constraints
- `2 <= s.length <= 1000`
- `s[i]` is either `'L'` or `'R'`
- `s` is balanced

---

## Approach
We traverse the string while maintaining a **balance counter**:
- Increment the counter for `'R'`.
- Decrement the counter for `'L'`.
- Every time the counter becomes `0`, it means we have found one **balanced substring**.