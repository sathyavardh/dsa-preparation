# 153. Find Minimum in Rotated Sorted Array

**Difficulty:** Medium

## Problem Description

Suppose an array of length `n` sorted in ascending order is **rotated** between `1` and `n` times. For example, the array `nums = [0,1,2,4,5,6,7]` might become:
* `[4,5,6,7,0,1,2]` if it was rotated `4` times.
* `[0,1,2,4,5,6,7]` if it was rotated `7` times.

Notice that **rotating** an array `[a[0], a[1], a[2], ..., a[n-1]]` 1 time results in the array `[a[n-1], a[0], a[1], a[2], ..., a[n-2]]`.

Given the sorted rotated array `nums` of **unique** elements, return *the minimum element of this array*.

You must write an algorithm that runs in `O(log n)` time.

## Examples

**Example 1:**
```
Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.
```

**Example 2:**
```
Input: nums = [4,5,6,7,0,1,2]
Output: 0
Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
```

**Example 3:**
```
Input: nums = [11,13,15,17]
Output: 11
Explanation: The original array was [11,13,15,17] and it was rotated 4 times.
```

## Constraints

* `n == nums.length`
* `1 <= n <= 5000`
* `-5000 <= nums[i] <= 5000`
* All the integers of `nums` are **unique**.
* `nums` is sorted and rotated between `1` and `n` times.

## Topics
- Array
- Binary Search

## Companies
- Amazon
- Microsoft
- Google
- Facebook
- Apple

## Hints
- Array was originally sorted in ascending order. Now that the array is rotated, there would be a point in the array where a small value would be right next to the large value.
- This is the point which would help us in this question. We call this the "Inflection Point".
- With the help of this point, we can divide the array into two parts. One part will definitely be sorted.
- Since one part is sorted, we can easily use binary search.

## Solution Approach

The key insight is to use binary search. In a rotated sorted array:
1. If the array is not rotated (nums[left] < nums[right]), the minimum is at the leftmost position
2. If the middle element is greater than the rightmost element, the minimum is in the right half
3. Otherwise, the minimum is in the left half (including the middle)

Time Complexity: O(log n)
Space Complexity: O(1)