# Assignment 4: Java Multithreading & Concurrency

[![University](https://img.shields.io/badge/University-University%20of%20Ioannina-blue.svg)](https://www.uoi.gr)
[![Language](https://img.shields.io/badge/Language-Java-orange.svg)]()

## Overview
This backend assignment shifts focus to concurrent execution using Java. The project simulates a multi-threaded environment where multiple threads attempt to interact with a shared resource (a bank account) simultaneously.

## Technical Details
- **Thread Management:** Creating and executing custom threads (`AccountThread`) that implement or extend Java's concurrency classes.
- **Shared Resources:** Handling race conditions and synchronization when multiple threads perform I/O or state mutations (deposits/withdrawals) on the same `Account` object.
- **Execution:** The main class (`TwoAccountThreadsDemo`) instantiates the shared account and spawns concurrent threads to demonstrate parallel processing capabilities.

---
**Author:** Maria Alexandra Ntontou (2799)
