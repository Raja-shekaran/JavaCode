# 🎨 Pattern Printing Master Reference (Java)

## 🧠 Core Concepts

| Concept | Formula / Key Idea | Example |
|----------|--------------------|----------|
| Left triangle | Stars = `i + 1` | `*` <br>`**` <br>`***` |
| Right triangle | Spaces = `n - i - 1` <br>Stars = `i + 1` | `  *` <br> ` **` <br>`***` |
| Inverted triangle | Stars = `i + 1` (loop reversed) | `***` <br>`**` <br>`*` |
| Pyramid | Spaces = `n - i - 1` <br>Stars = `2 * i + 1` | `  *` <br> ` ***` <br>`*****` |
| Diamond | Combine pyramid + inverted pyramid | Symmetric shape |
| Hollow pyramid | Same as pyramid but print `*` only at `j == 0` or `j == 2*i` | Outline of a pyramid |
| Number pyramid | Print numbers instead of `*` | `1` <br>`121` <br>`12321` |
| Mirrored patterns | Use dual loops or reverse iteration | Left–right symmetric |
| Hourglass / Butterfly | Combine increasing + decreasing logic | Symmetric top and bottom |

---

## ⚙️ Common Formula Reference

| Element | Formula | Meaning |
|----------|----------|----------|
| Left spaces | `n - i - 1` | Pushes the shape right |
| Total characters | `2 * i + 1` | For pyramid / diamond |
| Hollow border | `if (j == 0 || j == limit)` | Prints edges only |
| Middle line count | `2 * n - 1` | For full diamonds |
| Mirrored logic | Run one loop up to `n`, one from `n-2` down to `0` | Avoid duplication |

---

## 💎 Key Pattern Examples

### 🔹 1. Solid Diamond
```
   *
  ***
 *****
*******
 *****
  ***
   *
```

### 🔹 2. Hollow Diamond
```
   *
  * *
 *   *
*     *
 *   *
  * *
   *
```

### 🔹 3. Butterfly Pattern
```
*      *
**    **
***  ***
********
***  ***
**    **
*      *
```

### 🔹 4. Numeric Pyramid
```
   1
  121
 12321
1234321
```

### 🔹 5. Hourglass Number Pattern
```
1 2 3 4 5
 1     4
  1   3
   1 2
    1
```

---

## 🧩 Tough Revision Challenges

| # | Challenge | Hint |
|---|------------|------|
| 1 | **Hollow Hourglass (stars)** | Balance spaces + outer `*` |
| 2 | **Mirrored Number Pyramid** | Use dual halves in same row |
| 3 | **Numeric Diamond (increment–decrement)** | Build ascending then descending |
| 4 | **Hollow Butterfly** | Edges on both wings only |
| 5 | **Pascal’s Triangle (bonus)** | Use nCr formula logic |
| 6 | **Alphabet Pyramid (A, B, C)** | Cast int to char `(char)('A'+j)` |

---

## 🧩 Common Mistakes & Fixes

| Mistake | Fix |
|----------|-----|
| Misaligned spaces | Double-check `n-i-1` logic |
| Hollow pattern filled fully | Use edge conditions (`if (j==0 || j==limit)`) |
| Off-by-one in mirror pattern | Always verify top row & bottom row overlap |
| Uneven symmetry | Mirror formula (top → bottom) carefully |

---

**📚 Tip:**  
When revising, hide code and just write loop ranges + space formulas from memory.  
That’s the real “pattern mastery” test 🔥
