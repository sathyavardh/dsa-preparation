# 🧹 Remove Duplicates from Sorted Array – In-Place Modification

## 📝 Problem Statement

Given an integer array `nums` **sorted in non-decreasing order**, remove the **duplicates in-place** such that each unique element appears only once.  
The **relative order** of the elements should be kept the same.  
Then return the number of **unique elements** in `nums`.

---

## ✅ Requirements

- Modify the array `nums` in-place such that the **first `k` elements** contain only **unique** elements in their original order.
- The **remaining elements** in the array are **not important**.
- Return `k`, the number of unique elements.

---

## 💡 Example 1

**Input:**  
`nums = [1,1,2]`

**Output:**  
`k = 2, nums = [1,2,_]`

**Explanation:**  
Your function should return `k = 2`, with the first two elements of `nums` being `1` and `2` respectively.  
It does not matter what you leave beyond the returned `k` (hence they are underscores).

---

## 💡 Example 2

**Input:**  
`nums = [0,0,1,1,1,2,2,3,3,4]`

**Output:**  
`k = 5, nums = [0,1,2,3,4,_,_,_,_,_]`

**Explanation:**  
Your function should return `k = 5`, with the first five elements of `nums` being `0`, `1`, `2`, `3`, and `4` respectively.  
It does not matter what you leave beyond the returned `k` (hence they are underscores).

---

## ✅ Constraints

- `1 <= nums.length <= 3 * 10^4`
- `-100 <= nums[i] <= 100`
- `nums` is sorted in **non-decreasing** order.

---
