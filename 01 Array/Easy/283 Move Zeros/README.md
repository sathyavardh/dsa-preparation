# 🚚 Move Zeroes – In-Place Array Modification

## 📝 Problem Statement

Write a function that **moves all `0`'s to the end** of an array while maintaining the **relative order** of the non-zero elements.

You must do this by **modifying the input array in-place** with **O(1)** extra memory.

---

## ✅ Requirements

- Move all `0` elements to the **end** of the array.
- Maintain the **order of non-zero** elements.
- Do **not return** anything — just modify the array in-place.
- Use **O(1) extra memory**.

---

## 💡 Example 1

**Input:**  
`nums = [0,1,0,3,12]`

**Output:**  
`nums = [1,3,12,0,0]`

---

## 💡 Example 2

**Input:**  
`nums = [0]`

**Output:**  
`nums = [0]`

---

## ✅ Constraints

- `1 <= nums.length <= 10^4`  
- `-2^31 <= nums[i] <= 2^31 - 1`
