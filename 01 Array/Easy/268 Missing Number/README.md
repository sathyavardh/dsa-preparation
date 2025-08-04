# ❓ Missing Number – Find the Absent Value in Range [0, n]

## 📝 Problem Statement

Given an array `nums` containing `n` **distinct** numbers in the range `[0, n]`, return the **only number in the range that is missing** from the array.

---

## ✅ Requirements

- Input:
  - An integer array `nums` of length `n`.
  - All elements are unique and within the range `[0, n]`.
- Output:
  - Return the **missing number** in the range.

---

## 💡 Example 1

**Input:**  
`nums = [3, 0, 1]`

**Output:**  
`2`

**Explanation:**  
The range is `[0, 3]`. The number `2` is missing.

---

## 💡 Example 2

**Input:**  
`nums = [0, 1]`

**Output:**  
`2`

**Explanation:**  
The range is `[0, 2]`. The number `2` is missing from the array.

---

## 💡 Example 3

**Input:**  
`nums = [9, 6, 4, 2, 3, 5, 7, 0, 1]`

**Output:**  
`8`

**Explanation:**  
The full range is `[0, 9]`. The number `8` is missing.

---

## ✅ Constraints

- `n == nums.length`
- `1 <= n <= 10^4`
- `0 <= nums[i] <= n`
- All the numbers in `nums` are **unique**

---

## ✅ Approach

- The sum of the first `n` natural numbers is given by the formula:  
  \[
  \text{sum} = \frac{n(n+1)}{2}
  \]
- Subtract the sum of the given array from the expected sum to find the **missing number**.
- Alternatively, use **bit manipulation (XOR)** or **cyclic sort** for optimized solutions with O(n) time and O(1) space.

---
