# 1021. Remove Outermost Parentheses

## Problem Description

A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.

A valid parentheses string s is **primitive** if it is nonempty, and there does not exist a way to split it into s = A + B, with A and B nonempty valid parentheses strings.

Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.

Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.

## Examples

**Example 1:**
- Input: `s = "(()())(())"`
- Output: `"()()()"`
- Explanation: The input string is "(()())(())", with primitive decomposition "(()())" + "(())". After removing outer parentheses of each part, this is "()()" + "()" = "()()()".

**Example 2:**
- Input: `s = "(()())(())(()(()))"`
- Output: `"()()()()(())"`

**Example 3:**
- Input: `s = "()()"`
- Output: `""`

## Approach

The key insight is that we need to:
1. Identify primitive parentheses strings (balanced substrings that can't be split further)
2. Remove the outermost parentheses from each primitive string
3. Concatenate the results

We can solve this using a counter to track the balance of parentheses:
- When we encounter '(', increment the counter
- When we encounter ')', decrement the counter
- When counter becomes 0, we've completed a primitive string
- We only add characters to our result when the counter is > 1 (for '(') or > 0 (for ')')

## Time and Space Complexity

- **Time Complexity**: O(n) where n is the length of the string
- **Space Complexity**: O(n) for the result string (O(1) extra space if we don't count the output)

## Key Insights

- The balance counter helps us identify when we're at the boundaries of primitive strings
- We skip the first '(' and last ')' of each primitive string (when balance is 0 or becomes 0)
- The algorithm processes the string in a single pass, making it very efficient