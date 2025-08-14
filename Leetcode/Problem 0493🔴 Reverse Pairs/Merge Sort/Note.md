# Merge Sort

## **1. The Big Idea**

Merge Sort is a **divide-and-conquer** sorting algorithm.

* **Divide** → Keep splitting the array into smaller halves until each half has only **1 element** (a single element is always sorted by itself).
* **Conquer** → Merge those small sorted pieces together in **order** until the whole array is sorted.

Think of it like:
📦 You have a messy pile of papers → You split it into smaller piles → Sort each pile → Merge piles back together in order.

---

## **2. Steps in Simple Words**

1. **Divide Step**

   * Take your array and split it into two halves.
   * Repeat this splitting for each half until all you have are single elements.

2. **Merge Step**

   * Take two sorted halves and combine them into **one sorted array**.
   * Keep merging until you end up with the fully sorted array.

---

## **3. Example**

Let’s sort:

```
[38, 27, 43, 3, 9, 82, 10]
```

**Step-by-step:**

**Divide:**

```
[38, 27, 43, 3, 9, 82, 10]
→ [38, 27, 43, 3]  and  [9, 82, 10]
→ [38, 27] and [43, 3]  and  [9, 82] and [10]
→ [38] [27] [43] [3]  [9] [82] [10]
```

**Merge:**

```
[38] + [27] → [27, 38]
[43] + [3]  → [3, 43]
[9] + [82]  → [9, 82]
[10] stays as is
```

**Merge again:**

```
[27, 38] + [3, 43]  → [3, 27, 38, 43]
[9, 82] + [10]      → [9, 10, 82]
```

**Final Merge:**

```
[3, 27, 38, 43] + [9, 10, 82] → [3, 9, 10, 27, 38, 43, 82]
```

---

## **4. Key Parts Explained**

### **A. Splitting the Array (Divide)**

* This is done recursively:

  * If the array has more than 1 element → split into `left` and `right`.
  * Call merge sort on `left`.
  * Call merge sort on `right`.

---

### **B. Merging Two Sorted Arrays**

The **merge** function works like:

1. Create two pointers (one for each sorted half).
2. Compare the pointed elements.
3. Pick the smaller one, put it into the result array, and move that pointer ahead.
4. When one half runs out of elements, append the rest from the other half.

Example:

```
Left: [3, 27, 38, 43]
Right: [9, 10, 82]

Compare 3 and 9 → take 3  
Compare 27 and 9 → take 9  
Compare 27 and 10 → take 10  
Compare 27 and 82 → take 27  
Compare 38 and 82 → take 38  
Compare 43 and 82 → take 43  
Take remaining 82
```

Result: `[3, 9, 10, 27, 38, 43, 82]`

---

## **5. Time Complexity**

* **Divide step:** O(log n) splits
* **Merge step:** O(n) work for each level
* Total: **O(n log n)**
* **Space Complexity:** O(n) (because we need extra space for merging)

---

## **6. Why It’s Good**

✅ Always O(n log n) time
✅ Stable sort (keeps equal elements in same order)
✅ Works well for linked lists

❌ Needs extra memory for merging
