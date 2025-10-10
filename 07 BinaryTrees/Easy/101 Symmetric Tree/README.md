# 101. Symmetric Tree

**Difficulty:** Easy

## Problem Description

Given the `root` of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

## Examples

### Example 1:

```
Input: root = [1,2,2,3,4,4,3]
Output: true
```

**Visual representation:**
```
    1
   / \
  2   2
 / \ / \
3  4 4  3
```

### Example 2:

```
Input: root = [1,2,2,null,3,null,3]
Output: false
```

**Visual representation:**
```
    1
   / \
  2   2
   \   \
    3   3
```

## Constraints

* The number of nodes in the tree is in the range `[1, 1000]`.
* `-100 <= Node.val <= 100`

## Solution Approach

To solve this problem, you need to check if the left subtree is a mirror reflection of the right subtree. This can be done using:

1. **Recursive approach**: Compare the left and right subtrees recursively
2. **Iterative approach**: Use a queue to compare nodes level by level

### Key Points:
- Two trees are mirrors if:
  - Their root values are the same
  - The left subtree of one tree is a mirror of the right subtree of the other tree
  - The right subtree of one tree is a mirror of the left subtree of the other tree