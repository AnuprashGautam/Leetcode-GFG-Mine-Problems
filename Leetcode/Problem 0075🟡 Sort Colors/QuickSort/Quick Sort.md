## 🍽️ **Quick Sort – Daily Life Analogy**

Imagine you're organizing books on a shelf **by height**. But instead of measuring each one, you use this method:

1. You **pick one random book** as a "reference" (called the **pivot**).
2. You separate all books:

   * 📚 To the **left**, you put books **shorter than** the pivot.
   * 📚 To the **right**, you put books **taller than** the pivot.
3. Now the pivot is in its **correct position**.
4. You **repeat** the same process for the left and right groups of books until all books are sorted.

🎯 That’s exactly how **Quick Sort** works.

---

## ⚙️ Quick Sort – Algorithm Approach

### Step-by-Step:

1. **Choose a pivot** (e.g., the last element of the array).
2. **Partition** the array:

   * Move all elements **less than pivot** to the **left**.
   * Move all elements **greater than pivot** to the **right**.
3. The pivot is now at the **correct index**.
4. **Recursively** apply the same process to the left and right parts of the array.

---

### 💡 Example:

```java
int[] arr = {6, 3, 9, 5, 2, 8};
```

Let’s walk through it:

* Pivot = 8
* Rearranged as: `{6, 3, 5, 2}` \[pivot] `{9}`
* Now, pivot `8` is in correct position.

Now sort the left `{6, 3, 5, 2}` and right `{9}` recursively.

Eventually, it becomes:

```java
{2, 3, 5, 6, 8, 9}
```

---

## 🔁 Recursion in Quick Sort

Quick sort **keeps dividing** the problem into smaller chunks — like solving a big puzzle piece by piece.

---

## ⏱️ Time Complexity:

| Case    | Time                                                            |
| ------- | --------------------------------------------------------------- |
| Best    | O(n log n)                                                      |
| Average | O(n log n)                                                      |
| Worst   | O(n²) (when array is already sorted and pivot is poorly chosen) |

✅ But in practice, Quick Sort is **one of the fastest sorting algorithms** for in-memory arrays.

---

## 🧠 Key Concepts:

* **Divide and conquer** method.
* Uses a **pivot** to partition.
* Very efficient for large arrays.
* **In-place sorting** – doesn't need extra memory like Merge Sort.