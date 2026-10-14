# Week 4 – S4: Programming Fundamentals (Java Arrays) — Homework

This repository contains solutions to the five Category C assignment problems and a small Java array fundamentals demonstration.

## Problems
1. **Product of Array Except Self** — `ProductExceptSelf.java`; O(n) time, no division.
2. **Maximum Subarray** — `MaximumSubarray.java`; Kadane's algorithm, O(n) time.
3. **3Sum** — `ThreeSum.java`; sorting and two pointers, O(n²) time.
4. **Subarray Sum Equals K** — `SubarraySumEqualsK.java`; prefix sums and a frequency map, O(n) expected time.
5. **Find Minimum in Rotated Sorted Array** — `FindMinimumRotatedArray.java`; binary search, O(log n) time.
6. **Array Fundamentals** — `ArrayFundamentals.java`; creating, initializing, accessing, looping, modifying, passing arrays to methods, and `.length`.

## Requirements
Install a Java JDK (Java 8 or later). Run commands from this folder.

## Compile and run
Compile one file at a time:
```bash
javac ProductExceptSelf.java
java ProductExceptSelf

javac MaximumSubarray.java
java MaximumSubarray

javac ThreeSum.java
java ThreeSum

javac SubarraySumEqualsK.java
java SubarraySumEqualsK

javac FindMinimumRotatedArray.java
java FindMinimumRotatedArray

javac ArrayFundamentals.java
java ArrayFundamentals
```

Each file has its own `main` method with sample test cases. The assignment signatures are implemented as static methods, so they can also be adapted to a platform's required `Solution` class format if needed.
