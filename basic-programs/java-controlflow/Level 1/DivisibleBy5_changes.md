# DivisibleBy5 Changes (Interactive)

## ✅ What changed?

### 1) **Exit condition added**
**Q:** How do we stop the infinite loop?  
**A:** Enter **0** to exit.

**Why?** The loop was `while (true)` with no `break`, so code after it never ran.

---

### 2) **`try` / `finally` around the loop**
**Q:** Why use `try` / `finally`?  
**A:** To **guarantee** the `Scanner` is closed, even if something goes wrong inside the loop.

**Think of it like this:**
- **`try`** = do the work (read input, check divisibility)
- **`finally`** = always clean up (`sc.close()`), no matter what happens

---

## 🔍 Spot the difference (before vs after)

- **Before:**
  - Infinite loop, no exit
  - `sc.close()` unreachable

- **After:**
  - Type **0** to exit
  - `sc.close()` always runs in `finally`

---

## ✅ Quick check

- [ ] Run the program
- [ ] Enter a number divisible by 5 (e.g., 10)
- [ ] Enter a number not divisible by 5 (e.g., 7)
- [ ] Enter **0** to exit

---

## 🧠 Summary
Using `try` / `finally` ensures resources are **always** cleaned up, which prevents warnings and improves reliability.
