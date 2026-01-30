Core Java Practice problems (Sessions 1–4)

Each problem includes: description, difficulty, constraints, hint, and a complete Java solution you can compile and run.

---

## Problem 1 — String concatenation + primitive data types

**Topic:** String concatenation, primitives (`int`, `double`, `boolean`)
**Difficulty:** Easy
**Problem:**
Write a static method `formatUserSummary(String name, int age, double salary, boolean remote)` that returns a single-line summary string:

```
Name: <name>, Age: <age>, Salary: $<salary formatted to 2 decimals>, Remote: <Yes|No>
```

Examples:

* `formatUserSummary("Alice", 30, 12500.5, true)` → `"Name: Alice, Age: 30, Salary: $12500.50, Remote: Yes"`

**Constraints:**

* Use only core Java (no external libs).
* Salary always >= 0.

**Hint:**
Use `String.format()` for numeric formatting or concatenation with `String.format("%.2f", salary)`; map boolean to `"Yes"`/`"No"`.

**Expected output**

```
Name: Alice, Age: 30, Salary: $12500.50, Remote: Yes
Name: Bob, Age: 25, Salary: $800.00, Remote: No
```

---

## Problem 2 — For loop and while loop (array sum + find first negative)

**Topic:** for-loop, while-loop, arrays, indexing
**Difficulty:** Easy–Medium
**Problem:**
Given an `int[] numbers`, implement two static methods:

1. `int sumWithFor(int[] numbers)` — compute sum using a `for` loop.
2. `int indexOfFirstNegativeWithWhile(int[] numbers)` — return the index of the first negative element using a `while` loop, or `-1` if none present.

Example: for `numbers = {4, 2, 0, -3, 5}`, `sumWithFor` → `8`, `indexOfFirstNegativeWithWhile` → `3`.

**Constraints:**

* Avoid using streams for `sumWithFor` (explicit loop required).
* Handle `null` or empty arrays.

**Hints:**

* For `while` loop, maintain an index variable and check bounds inside the loop.


**Expected output**

```
sumWithFor -> 8
indexOfFirstNegativeWithWhile -> 3
empty sum -> 0
empty neg idx -> -1
```

---

## Problem 3 — Java classes: constructors, access modifiers, static vs instance members

**Topic:** classes, constructors, `public`/`private`/`protected`, `static` vs instance
**Difficulty:** Medium
**Problem:**
Implement a `TestRun` class that:

* Has a `private final String id` (instance field).
* Has a `public static int createdCount` that tracks how many `TestRun` instances were created.
* Constructor `public TestRun(String id)` assigns the id and increments the counter.
* `public String getId()` returns the id.
* `protected void logInfo()` prints a short message including id.
* `public static void printSummary()` prints how many instances were created.
* Demonstrate usage in `main`: create two instances, call `logInfo()` on one, and show `printSummary()`.

**Constraints:**

* `id` must be immutable (final).
* `createdCount` should be accessible via `TestRun.createdCount`.

**Hint:**
Remember `static` fields belong to the class and are shared; `final` makes the instance field immutable.


**Expected output**

```
Constructor: created TestRun TR-001
Constructor: created TestRun TR-002
LogInfo - TestRun id: TR-001
Total TestRun instances: 2
Direct static access: 2
```

---


