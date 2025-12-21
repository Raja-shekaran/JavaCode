# ⚡ Step 1 Revision

## 🧩 Core Topics
✅ Basics & Patterns  
✅ Arrays  
✅ Hashing  
✅ Recursion

---

## 🔹 Patterns
- Left spaces → `(n − i − 1)`
- Stars → `(2 × i + 1)`
- Inverted pyramid → outer loop `i = n − 1 → 0`
- Replace spaces with `.` for debugging.

---

## 🔹 Arrays
- Reverse (iterative):  
  `swap(a[i], a[n−i−1]) till i < n/2`
- Reverse (recursive):  
  `reverse(a, l, r)` → swap → recurse inward
- **Rotation (focus area)**:  
  Left rotation by d = reverse 0–d−1 + reverse d–n−1 + reverse all
- Edge cases → empty, single element.

---

## 🔹 Hashing
- Frequency count → `map.put(x, map.getOrDefault(x,0)+1)`
- Max/min freq → single scan
- Use `LinkedHashMap` for order
- Elements > n/3 → frequency threshold check
- Time: O(n), Space: O(k)

---

## 🔹 Recursion
| Type | Pattern | Example |
|------|----------|----------|
| **Parameterised** | Pass state down | `sum(n, res)` |
| **Functional** | Return result up | `return n + sum(n−1)` |


### Common Templates
- **Sum of digits:** `n%10 + sum(n/10)`
- **Factorial:** `fact(n−1, n×fact)`
- **Reverse (param):** `rev = rev×10 + n%10`
- **Reverse (func):** `n%10×10^(digits−1) + reverse(n/10)`
- **Palindrome:** compare `left` & `right` recursively

---

## 🧠 Mental Cues
- Recursion = “one small task → delegate rest”
- Pattern = rows vs columns
- Array = index symmetry
- Hashing = count, not sort
- Base case first!  → avoid infinite loops
