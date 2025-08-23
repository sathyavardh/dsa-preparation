# 160. Intersection of Two Linked Lists

## Problem Statement
Given the heads of two singly linked-lists `headA` and `headB`, return the node at which the two lists intersect.  
If the two linked lists have no intersection at all, return `null`.

The test cases are generated such that there are no cycles anywhere in the entire linked structure.  

**Note:** The linked lists must retain their original structure after the function returns.

---

## Example 1
**Input:**  
- intersectVal = 8  
- listA = [4,1,8,4,5]  
- listB = [5,6,1,8,4,5]  
- skipA = 2  
- skipB = 3  

**Output:**  
Intersected at '8'


**Explanation:**  
The intersected node’s value is `8`.  
From the head of A, it reads as `[4,1,8,4,5]`.  
From the head of B, it reads as `[5,6,1,8,4,5]`.  
There are 2 nodes before the intersected node in A; there are 3 nodes before the intersected node in B.

---

## Example 2
**Input:**  
- intersectVal = 2  
- listA = [1,9,1,2,4]  
- listB = [3,2,4]  
- skipA = 3  
- skipB = 1  

**Output:**  
Intersected at '2'


**Explanation:**  
The intersected node’s value is `2`.  
From the head of A, it reads as `[1,9,1,2,4]`.  
From the head of B, it reads as `[3,2,4]`.  
There are 3 nodes before the intersected node in A; there is 1 node before the intersected node in B.

---

## Example 3
**Input:**  
- intersectVal = 0  
- listA = [2,6,4]  
- listB = [1,5]  
- skipA = 3  
- skipB = 2  

**Output:**  
No intersection

**Explanation:**  
From the head of A, it reads as `[2,6,4]`.  
From the head of B, it reads as `[1,5]`.  
Since the two lists do not intersect, return `null`.

---

## Constraints
- The number of nodes of listA is `m`.  
- The number of nodes of listB is `n`.  
- `1 <= m, n <= 3 * 10^4`  
- `1 <= Node.val <= 10^5`  
- `0 <= skipA <= m`  
- `0 <= skipB <= n`  
- `intersectVal` is `0` if listA and listB do not intersect.  
- `intersectVal == listA[skipA] == listB[skipB]` if listA and listB intersect.  

---

## Follow-up
Could you write a solution that runs in:
- **O(m + n)** time, and  
- **O(1)** memory?