/*
Given the value of n, we need to find the sum of the series where i-th term is sum of first i odd natural numbers.

NOTE: Sum of the series 1 + (1+3) + (1+3+5) + (1+3+5+7) + …… + (1+3+5+7+…+(2n-1))

Example 1:

Input: n = 2
Output: 5 
Explanation: 1 + (1+3) = 5
Hence sum of the series is 5.

Example 2:

Input: n = 5
Output: 55
Explanation: 1 + (1+3) + (1+3+5) +
(1+3+5+7) + (1+3+5+7+9) = 55.
Hence sum of the series is 55.

Your Task:  
You dont need to read input or print anything. Complete the function sumOfTheSeries() which takes n as input parameter and returns the sum of the series of n terms.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
1<= n <=1000

*/

class Solution {
    static long sumOfTheSeries(long n) {
        long sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (long) i * i;   // sum of first i odd numbers = i^2
        }

        return sum;
    }
}

