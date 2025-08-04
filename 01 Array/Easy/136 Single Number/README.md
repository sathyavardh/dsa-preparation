# 🕵️‍♂️ Single Number – Find the Unique Element

## 📝 Problem Statement

Given a **non-empty array of integers** `nums`, every element appears **twice** except for **one**.  
Find that single one.

You must implement a solution with:
- **Linear runtime complexity (O(n))**
- **Only constant extra space**

---

## ✅ Requirements

- Input: Array `nums` where all elements appear twice except one.
- Output: Return the **element that appears only once**.

---

## 💡 Example 1

**Input:**  
`nums = [2, 2, 1]`

**Output:**  
`1`

**Explanation:**  
Only `1` appears once, others appear twice.

---

## 💡 Example 2

**Input:**  
`nums = [4, 1, 2, 1, 2]`

**Output:**  
`4`

**Explanation:**  
Every element except `4` appears exactly twice.

---

## 💡 Example 3

**Input:**  
`nums = [1]`

**Output:**  
`1`

**Explanation:**  
Only one element exists, so it is the answer.

---

## ✅ Constraints

- `1 <= nums.length <= 3 * 10^4`
- `-3 * 10^4 <= nums[i] <= 3 * 10^4`
- Each element appears **twice** except for **one** that appears only once.

---

## ✅ Approach

- Traverse the array in **one pass**.
- Use a technique that requires **O(1)** extra space.
- Avoid using hash maps or sets.
- Take advantage of **bitwise or mathematical properties** to isolate the unique element.

---
