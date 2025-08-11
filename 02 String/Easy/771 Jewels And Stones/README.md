# Jewels and Stones

**Problem statement**

You're given two strings `jewels` and `stones`. Each character in `jewels` represents a type of stone that is a jewel. Each character in `stones` represents a stone you have. Letters are case sensitive (so `'a'` and `'A'` are different types).

Return the number of stones you have that are also jewels.

---

## Examples

**Example 1**

```
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
```

**Example 2**

```
Input: jewels = "z", stones = "ZZ"
Output: 0
```

---

## Constraints

* `1 <= jewels.length, stones.length <= 50`
* `jewels` and `stones` consist only of English letters.
* All characters in `jewels` are unique.

---

## Approach (short)

Put all characters from `jewels` into a set for O(1) membership checks. Then iterate over `stones` and count how many characters are in the jewels set.

**Time complexity:** O(J + S) where J = `jewels.length`, S = `stones.length`.

**Space complexity:** O(J) for the set.

---

