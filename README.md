# core-java

**Core Java for SDETs and QA**

This playbook helps automation engineers revise and strengthen
core Java fundamentals required for:

- Selenium framework development
- REST Assured automation
- CI/CD execution
- Interview preparation

This repository is intentionally simple and runnable.

---

## What you will learn

- Java basics: classes, data types, operators
- Loops and conditions
- Access modifiers
- Exceptions
- Collections (List and Map) for test data
- Maven basics
- Running a simple Selenium-style Java test

---

## Who this playbook is for

- SDETs with ~3 years experience
- QA Engineers moving into framework design
- Learners preparing for automation interviews

---

## How to run

### Prerequisites
- Java 17+ (or compatible)
- Maven 3.8+
- Git

Check versions:

```bash
java -version
mvn -v
````

---

### Run sample programs

Compile and run the example programs that demonstrate fundamentals.

```bash
cd programs
javac PrepareEnv.java
java PrepareEnv.java

javac RunSample.java
java RunSample.java
```

### Run core Java programs

Compile and run the core Java example programs located in `playbook_examples`:

```bash
# from repo root
cd ..\playbook_examples

# Run the basic demo on Java String, operators and for loop/ while loop located in `playbook_examples`
javac BasicsDemo.java
java BasicsDemo

# Run the operator precedence demo located in `playbook_examples`
javac OperatorsPrecedenceDemo.java
java OperatorsPrecedenceDemo

# Run the Object-Orient Programming (OOP) demo located in `playbook_examples`
javac ClassDemo.java
java ClassDemo.java
```

---

## Notes

* Selenium here is simulated (no browser dependency) until later sessions.
* If you plan to run browser-based tests, install browser binaries or use Selenium Manager.
* For CI runs, configure `--skip-network` or use local mocks/wiremock for stable API tests.

---
