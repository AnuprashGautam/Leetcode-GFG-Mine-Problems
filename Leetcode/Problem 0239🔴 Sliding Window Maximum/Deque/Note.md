## **1. What is a Deque?**

**Deque** (pronounced “deck”) stands for **Double-Ended Queue**.
It’s a special kind of queue where you can **insert** and **remove** elements **from both ends**:

* **Front** (head)
* **Rear** (tail)

You can think of it as a line of people where:

* People can join from the **front** or the **back**
* People can leave from the **front** or the **back**

---

## **2. Why use a Deque?**

* More flexible than a normal queue (`Queue` allows operations only at one end for insertion and at the other for removal).
* Can act like:

  * **Queue** (FIFO — first in, first out)
  * **Stack** (LIFO — last in, first out)

---

## **3. Deque in Java**

Java provides the `Deque` interface in `java.util` package.
Common implementations:

* `ArrayDeque` (resizable array, faster than LinkedList for most cases)
* `LinkedList` (doubly linked list)

---

### **Declaration**

```java
import java.util.Deque;
import java.util.ArrayDeque;

Deque<Integer> deque = new ArrayDeque<>();
```

---

### **4. Common Methods in Deque**

| **Method**      | **Description**                                   |
| --------------- | ------------------------------------------------- |
| `addFirst(e)`   | Inserts `e` at the front                          |
| `addLast(e)`    | Inserts `e` at the rear                           |
| `offerFirst(e)` | Same as `addFirst` but returns `true/false`       |
| `offerLast(e)`  | Same as `addLast` but returns `true/false`        |
| `removeFirst()` | Removes and returns front element                 |
| `removeLast()`  | Removes and returns rear element                  |
| `pollFirst()`   | Same as `removeFirst` but returns `null` if empty |
| `pollLast()`    | Same as `removeLast` but returns `null` if empty  |
| `getFirst()`    | Returns front element without removing            |
| `getLast()`     | Returns rear element without removing             |
| `peekFirst()`   | Same as `getFirst` but returns `null` if empty    |
| `peekLast()`    | Same as `getLast` but returns `null` if empty     |

---

### **5. Example Code**

```java
import java.util.Deque;
import java.util.ArrayDeque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Adding elements at both ends
        deque.addFirst("First");
        deque.addLast("Last");

        // Offering elements (won’t throw exception if fails)
        deque.offerFirst("New First");
        deque.offerLast("New Last");

        System.out.println("Deque after additions: " + deque);

        // Accessing elements without removal
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());

        // Removing elements
        deque.removeFirst();
        deque.removeLast();

        System.out.println("Deque after removals: " + deque);
    }
}
```

**Output:**

```
Deque after additions: [New First, First, Last, New Last]
First element: New First
Last element: New Last
Deque after removals: [First, Last]
```

---

✅ **Key Tip**: Use `ArrayDeque` unless you specifically need `LinkedList` features, because `ArrayDeque` is faster and has less overhead.