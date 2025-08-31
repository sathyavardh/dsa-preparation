# 225. Implement Stack using Queues

**Difficulty:** Easy  
**Topics:** Stack, Queue, Design  

---

## Problem
Implement a **last-in-first-out (LIFO) stack** using only two queues.  
The implemented stack should support all the functions of a normal stack:

- `push(int x)` → Pushes element `x` to the top of the stack.  
- `pop()` → Removes the element on the top of the stack and returns it.  
- `top()` → Returns the element on the top of the stack.  
- `empty()` → Returns true if the stack is empty, false otherwise.  

You must use only **standard operations of a queue**, which means only the following are allowed:
- Push to back  
- Peek/pop from front  
- Size  
- Is empty  

---

## Example
**Input:**  
["MyStack", "push", "push", "top", "pop", "empty"]  
[[], [1], [2], [], [], []]  

**Output:**  
[null, null, null, 2, 2, false]  

**Explanation:**
```java
MyStack myStack = new MyStack();
myStack.push(1);
myStack.push(2);
myStack.top();    // return 2
myStack.pop();    // return 2
myStack.empty();  // return false
