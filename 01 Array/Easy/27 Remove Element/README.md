# 🚀 Remove Element – In-Place Array Modification

## 📝 Problem Statement

Given an integer array `nums` and an integer `val`, remove **all occurrences** of `val` in-place.  
The **order of elements may be changed**.  
Then return the number of elements in `nums` which are **not equal** to `val`.

---

## ✅ Requirements

- Modify the array `nums` in-place so that the **first `k` elements** do not contain `val`.
- The remaining elements are **not important**.
- Return `k`, the count of elements that are **not equal** to `val`.

---

## 💡 Example 1

**Input:**  
`nums = [3,2,2,3]`, `val = 3`

**Output:**  
`k = 2, nums = [2,2,_,_]`

**Explanation:**  
Your function should return `k = 2`, with the first two elements of `nums` being `2`.  
It does not matter what you leave beyond the returned `k` (hence they are underscores).

---

## 💡 Example 2

**Input:**  
`nums = [0,1,2,2,3,0,4,2]`, `val = 2`

**Output:**  
`k = 5, nums = [0,1,4,0,3,_,_,_]`

**Explanation:**  
Your function should return `k = 5`, with the first five elements of `nums` being `0`, `1`, `4`, `0`, and `3`.  
It does not matter what you leave beyond the returned `k` (hence they are underscores).

---

## ✅ Constraints

- `0 <= nums.length <= 100`
- `0 <= nums[i] <= 50`
- `0 <= val <= 100`

---
