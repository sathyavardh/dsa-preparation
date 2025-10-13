# 110. Balanced Binary Tree

## Problem Description

Given a binary tree, determine if it is **height-balanced**.

A height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differs by more than 1.

---

## Examples

### Example 1:
```
Input: root = [3,9,20,null,null,15,7]
Output: true
```

**Tree Structure:**
```
      3
     / \
    9  20
      /  \
     15   7
```

### Example 2:
```
Input: root = [1,2,2,3,3,null,null,4,4]
Output: false
```

**Tree Structure:**
```
        1
       / \
      2   2
     / \
    3   3
   / \
  4   4
```

### Example 3:
```
Input: root = []
Output: true
```

---

## Constraints

- The number of nodes in the tree is in the range `[0, 5000]`
- `-10^4 <= Node.val <= 10^4`

---

## Key Points

- A balanced tree requires **every node's** subtrees to differ by at most 1 in height
- Empty trees are considered balanced
- Need to check the balance condition at every node, not just the root