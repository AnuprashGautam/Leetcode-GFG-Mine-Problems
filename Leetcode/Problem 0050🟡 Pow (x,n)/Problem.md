# 50. Pow (x,n)

Implement [pow(x, n)](http://www.cplusplus.com/reference/valarray/pow/), which calculates `x` raised to the power `n` (i.e., `x<sup>n</sup>`).

**Example 1:**

**Input:** x = 2.00000, n = 10
**Output:** 1024.00000

**Example 2:**

**Input:** x = 2.10000, n = 3
**Output:** 9.26100

**Example 3:**

**Input:** x = 2.00000, n = -2
**Output:** 0.25000
**Explanation:** 2<sup>-2</sup> = 1/2<sup>2</sup> = 1/4 = 0.25

**Constraints:**

- `-100.0 < x < 100.0`
- `-2<sup>31</sup> <= n <= 2<sup>31</sup>-1`
- `n` is an integer.
- Either `x` is not zero or `n > 0`.
- `-10<sup>4</sup> <= x<sup>n</sup> <= 10<sup>4</sup>`