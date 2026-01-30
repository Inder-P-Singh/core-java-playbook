Each FAQ entry (interview-style) is short, practical, and includes one-line examples where helpful.

---

## FAQ Group 1 — Arithmetic operators, comparison operators, for loop, while loop

**Q1. What is the difference between `/` on ints and on doubles?**
A: Integer `/` performs integer division (truncates fractional part). Double `/` returns floating result.
Example: `5/2 == 2` (int), `5.0/2 == 2.5` (double).

**Q2. What does `%` do and when is it useful in tests?**
A: `%` returns remainder. Useful for parity checks (`n % 2 == 0` for even), or cyclic indexing in data-driven tests.

**Q3. When to use `==` vs `.equals()` for comparisons?**
A: `==` compares primitive values or object references. For string content use `.equals()` (e.g., `s.equals("expected")`).

**Q4. When prefer `for` vs `while` loop?**
A: Use `for` for known/fixed iteration counts or indexed loops; use `while` when loop depends on a condition evaluated at runtime.

**Q5. Common off-by-one bug and how to avoid it?**
A: Iterating `for (int i = 0; i <= n; i++)` when `i < n` is intended. Avoid by checking boundary logic, write unit tests for small n values, and use `for-each` when possible.

---

## FAQ Group 2 — classes, constructors, access modifiers, static vs instance

**Q1. When use `private` vs `protected` vs `public` for fields?**
A: Use `private` for encapsulation, `protected` for subclass/package access, `public` only for API surface. Prefer private + getters/setters.

**Q2. Why prefer `final` on instance fields?**
A: `final` enforces immutability for that field reference — good for IDs/config values to prevent accidental changes.

**Q3. When is `static` appropriate?**
A: Use `static` for class-level constants or counters (e.g., `public static final String APP_NAME` or `static int instanceCount`). Avoid static mutable state in frameworks unless carefully synchronized.

**Q4. Can constructors be overloaded?**
A: Yes. Provide multiple constructors for convenience (e.g., `new User()` and `new User(String name)`), chain using `this(...)`.

**Q5. How to test constructors?**
A: Create instance and assert its public API returns expected values. Avoid testing private state directly — prefer behavior tests.

---

## FAQ Group 3 — Exceptions: checked vs unchecked

**Q1. What's the difference between checked and unchecked exceptions?**
A: Checked exceptions (e.g., `IOException`, `SQLException`) must be declared (`throws`) or caught. Unchecked (subclasses of `RuntimeException` like `NullPointerException`, `IllegalArgumentException`) do not require declaration/catch.

**Q2. When to use checked exceptions?**
A: Use them for recoverable conditions related to external resources (I/O, network). They force the caller to handle or propagate.

**Q3. When to use unchecked exceptions?**
A: For programming errors or contract violations (bad arguments, illegal states). They indicate bugs and usually are not recoverable at runtime.

**Q4. Best practice for automation frameworks?**
A: Catch checked exceptions at boundary layers, wrap low-level exceptions in meaningful domain exceptions, and log stack traces. Fail tests fast for unrecoverable errors.

**Q5. Example: reading a file in a test — how to handle?**
A: Use `try-with-resources` to auto-close and catch `IOException` to fail test with meaningful message or mark test skipped if resource unavailable.

---

## FAQ Group 4 — Collections: List, Map, Set, Streams

**Q1. When to use `List` vs `Set` vs `Map`?**
A: `List` for ordered sequences (allow duplicates); `Set` to guarantee uniqueness; `Map` for key→value lookups.

**Q2. Example: test data storage patterns**
A: Use `List<Map<String,String>>` to represent rows of test data (each entry is a map of column→value). For fast lookup by id use `Map<String, TestData>`.

**Q3. How to remove duplicates from a list?**
A: `List<String> unique = new ArrayList<>(new HashSet<>(list));` or `list.stream().distinct().collect(Collectors.toList())`.

**Q4. When to use Streams?**
A: For concise transforms/filtering/mapping (e.g., convert `List<User>` → `List<String>` of emails). Prefer streams for readability and immutability; avoid complex side effects in streams.

**Q5. Example of map transformation with streams**

```java
List<String> names = List.of("alice","bob");
List<String> upper = names.stream().map(String::toUpperCase).collect(Collectors.toList());
```

**Q6. Performance considerations**
A: `ArrayList` has O(1) random access; `LinkedList` is cheaper for head/tail insertions. `HashMap` offers average O(1) lookup; `TreeMap` is O(log n) but sorted.

---

# Closing notes (practical tips for learners)

* **Write small tests** for each function you implement (even simple `main` checks).
* **Prefer clarity over clever code** during interviews: simple, correct, explainable solutions matter.
* **Comment edge cases** in your solution (nulls, empty arrays) — interviewers look for defensive thinking.
* **Use `String.format`** for readable output formatting.
* **Avoid side-effects inside expressions** (e.g., mixing `++` inside arithmetic) — show you know maintainability trade-offs.

---
