# 📈 Best Time to Buy and Sell Stock – Maximize Profit

## 📝 Problem Statement

You are given an array `prices` where `prices[i]` is the **price of a given stock on the i-th day**.

Your task is to **maximize your profit** by choosing a **single day to buy** one stock and choosing a **different future day to sell** that stock.

Return the **maximum profit** you can achieve from this transaction.  
If **no profit** can be achieved, return `0`.

---

## ✅ Requirements

- Choose a day `i` to buy a stock and a day `j > i` to sell it.
- Return the maximum possible **profit = prices[j] - prices[i]**.
- If profit is not possible (prices always decreasing), return `0`.

---

## 💡 Example 1

**Input:**  
`prices = [7, 1, 5, 3, 6, 4]`

**Output:**  
`5`

**Explanation:**  
Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = `6 - 1 = 5`.

---

## 💡 Example 2

**Input:**  
`prices = [7, 6, 4, 3, 1]`

**Output:**  
`0`

**Explanation:**  
Prices are continuously decreasing.  
No transaction is done, so the maximum profit = `0`.

---

## ✅ Constraints

- `1 <= prices.length <= 10^5`
- `0 <= prices[i] <= 10^4`
