## 🔍 What is Amortized Complexity?

> **Amortized time complexity** tells you the **average cost per operation** **over a sequence** of operations, **even if some operations are expensive.**

It's not about the worst-case of one operation — it's about the **overall cost spread out evenly**.

---

### ✅ Why Is It Called "Amortized"?

Because just like in **finance**, where "amortizing" a loan means **spreading a cost over time**, here we **spread the cost of expensive operations** across many cheap ones.

> Imagine paying ₹1000 once, but over 10 months — you pay ₹100/month → amortized cost = ₹100 per month.

---

## 📦 Analogy: A Box of Marbles

* You have a box.
* You insert a marble (cheap: O(1)).
* But when the box is full (say, size = power of 2), you **double** its size (expensive: O(N)) by copying all marbles to a new box.

### ⏱ Cost per operation:

* Most inserts are cheap (just add to array).
* Occasionally, we copy all elements to a bigger array (expensive).

But **over many operations**, the cost of doubling is rare.

👉 **Amortized cost per insert = O(1)**
(because total cost spread across all inserts is linear).

---

## 🧠 Real Examples of Amortized Complexity

| Operation                     | Worst Case | Amortized                  | Why?                               |
| ----------------------------- | ---------- | -------------------------- | ---------------------------------- |
| `push()` in dynamic array     | O(N)       | O(1)                       | Resizing happens rarely            |
| `removeOccurrences()` code    | O(M)       | O(1) per char → O(N) total | Match check only happens sometimes |
| `add()` in HashMap            | O(N)       | O(1)                       | Rehashing is rare                  |
| Stack with occasional cleanup | O(N)       | O(1)                       | Cleanup is rare                    |

---

## 🔬 Technical Definition

> If the total time of a sequence of **N operations** is **T(N)**,
> then **amortized cost per operation = T(N) / N**

Even if **some operations take longer**, the **average per operation** is small.

---

## 🪓 Why Not Just Use Worst Case?

Because worst-case:

* Is sometimes **too pessimistic**.
* Doesn’t reflect the **real performance** over time.

Amortized complexity:

* Is more **accurate for real-world usage**
* Still gives **safe upper bounds** over a sequence

---

## ✅ Summary

| Feature                | Description                                             |
| ---------------------- | ------------------------------------------------------- |
| 🎯 **What**            | Average time per operation in a sequence                |
| 🔄 **Why "amortized"** | Spreads cost of expensive ops over many cheap ones      |
| ⏱️ **When to use**     | Stack/queue, resizing arrays, conditional loops         |
| 🧠 **Key insight**     | Total work over N ops is linear (O(N)) ⇒ per op is O(1) |

