## Problem: Sort an Array

Given an array of integers `nums`, sort the array in ascending order and return it.

You must solve the problem without using any built-in sort functions, in **O(n log n)** time complexity, and with the smallest space complexity possible.

---

### Example 1:
**Input:**  
`nums = [5, 2, 3, 1]`  
**Output:**  
`[1, 2, 3, 5]`  
**Explanation:**  
After sorting the array, some numbers remain in the same position (e.g., 2 and 3), while others change position (e.g., 1 and 5).

---

### Example 2:
**Input:**  
`nums = [5, 1, 1, 2, 0, 0]`  
**Output:**  
`[0, 0, 1, 1, 2, 5]`  
**Explanation:**  
The array can contain duplicate values, which must also be sorted.

---

### Constraints:
- `1 <= nums.length <= 5 * 10^4`
- `-5 * 10^4 <= nums[i] <= 5 * 10^4`
