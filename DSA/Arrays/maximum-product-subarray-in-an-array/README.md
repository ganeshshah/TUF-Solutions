# [Maximum Product Subarray in an Array](https://takeuforward.org/practice/dsa/maximum-product-subarray-in-an-array?category=linear-scan&source=strivers-180-master-dsa-patterns)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given an integer array **nums** . Find the **subarray** with the **largest product** , and return the **product** of the elements present in that **subarray** .

A **subarray** is a **contiguous** non-empty **sequence** of elements within an array.

### Example 1:

**Input:** nums = [4, 5, 3, 7, 1, 2]

**Output:** 840

**Explanation:**

The largest product is given by the whole array itself

### Example 2:

**Input:** nums = [-5, 0, -2]

**Output:** 0

**Explanation:**

The largest product is achieved with the following subarrays [0], [-5, 0], [0, -2], [-5, 0, -2].

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= nums.length <= 10^4
- -10 <= nums[i] <= 10
- -10^9 <= product of any prefix or suffix of nums <= 10^9

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Auto-synced with <strong>TUF+Solutions</strong> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/">TakeUForward (TUF+)</a>
</p>
