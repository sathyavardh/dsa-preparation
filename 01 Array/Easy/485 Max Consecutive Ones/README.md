# 🔢 Max Consecutive Ones – Binary Array Problem

## 📝 Problem Statement

Given a **binary array** `nums`, return the **maximum number of consecutive 1's** in the array.

---

## ✅ Requirements

- Input: Array `nums` consisting only of **0s and 1s**.
- Output: An integer representing the **maximum number of consecutive 1s**.
- Traverse the array and keep track of consecutive sequences of 1s.

---

## 💡 Example 1

**Input:**  
`nums = [1,1,0,1,1,1]`

**Output:**  
`3`

**Explanation:**  
The first two digits (`[1,1]`) and the last three digits (`[1,1,1]`) form consecutive 1s.  
The maximum is `3`.

---

## 💡 Example 2

**Input:**  
`nums = [1,0,1,1,0,1]`

**Output:**  
`2`

**Explanation:**  
There are two consecutive 1s in the middle.  
The maximum is `2`.

---

## ✅ Constraints

- `1 <= nums.length <= 10^5`
- `nums[i]` is either `0` or `1`.

---

## ✅ Approach

- Initialize `maxCount = 0` and `currentCount = 0`.
- Traverse each element in `nums`:
  - If the element is `1`, increment `currentCount`.
  - If it's `0`, reset `currentCount` to 0.
  - Update `maxCount` with the maximum of itself and `currentCount`.

---
