# 3541. Find Most Frequent Vowel and Consonant

## Problem Statement
You are given a string `s` consisting of lowercase English letters (`'a'` to `'z'`).

Your task is to:

1. Find the vowel (one of `'a'`, `'e'`, `'i'`, `'o'`, `'u'`) with the maximum frequency.
2. Find the consonant (all other letters excluding vowels) with the maximum frequency.
3. Return the sum of the two frequencies.

**Note:**
- If multiple vowels or consonants have the same maximum frequency, you may choose any one of them.
- If there are no vowels or no consonants in the string, consider their frequency as `0`.

The frequency of a letter `x` is the number of times it occurs in the string.

---

## Example 1
**Input:**  
`s = "successes"`

**Output:**  
`6`

**Explanation:**  
- Vowels: `'u'` (frequency `1`), `'e'` (frequency `2`) → max frequency = `2`  
- Consonants: `'s'` (frequency `4`), `'c'` (frequency `2`) → max frequency = `4`  
- Answer = `2 + 4 = 6`

---

## Example 2
**Input:**  
`s = "aeiaeia"`

**Output:**  
`3`

**Explanation:**  
- Vowels: `'a'` (frequency `3`), `'e'` (frequency `2`), `'i'` (frequency `2`) → max frequency = `3`  
- No consonants → max frequency = `0`  
- Answer = `3 + 0 = 3`

---

## Constraints
- `1 <= s.length <= 100`  
- `s` consists of lowercase English letters only.
