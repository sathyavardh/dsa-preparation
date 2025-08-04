# 🔍 Binary Search – Find Target Index in Sorted Array

## 📝 Problem Statement

Given an array of integers `nums` which is **sorted in ascending order**, and an integer `target`, write a function to **search** for the `target` in `nums`.

If the target exists, return its **index**.  
Otherwise, return `-1`.

---

## ✅ Requirements

- Input:
  - `nums`: A sorted array of unique integers.
  - `target`: An integer to search for.
- Output:
  - The **index** of the `target` if it exists in `nums`.
  - Return `-1` if the `target` does not exist.

- Must use an algorithm with **O(log n)** runtime complexity.

---

## 💡 Example 1

**Input:**  
`nums = [-1, 0, 3, 5, 9, 12]`, `target = 9`

**Output:**  
`4`

**Explanation:**  
The value `9` exists in `nums` at index `4`.

---

## 💡 Example 2

**Input:**  
`nums = [-1, 0, 3, 5, 9, 12]`, `target = 2`

**Output:**  
`-1`

**Explanation:**  
The value `2` is not present in the array, so return `-1`.

---

## ✅ Constraints

- `1 <= nums.length <= 10^4`
- `-10^4 < nums[i], target < 10^4`
- All integers in `nums` are **unique**
- `nums` is **sorted** in ascending order

---

## ✅ Approach

- Use **Binary Search** since the array is sorted and the required time complexity is `O(log n)`.
- Initialize two pointers:
  - `low = 0`
  - `high = nums.length - 1`
- While `low <= high`:
  - Compute `mid = (low + high) / 2`
  - If `nums[mid] == target`: return `mid`
  - If `nums[mid] < target`: move `low` to `mid + 1`
  - If `nums[mid] > target`: move `high` to `mid - 1`
- If the loop ends, return `-1`

---
