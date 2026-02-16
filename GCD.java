/*
Given two numbers A and B. The task is to find the GCD of  A and B.
The GCD of two numbers is the largest number that can divide both A and B perfectly.

Examples:

Input: A = 6, B = 9
Output: 3
Explanation: After 3 there is no number that can divide both 6 and 9 perfectly.
Input: A = 10, B = 15
Output: 5
Explanation: 5 is the greatest common divisor of 10 and 15.
Constraints:
1  ≤  A, B  ≤  100


*/

class Solution {
    public static int gcd(int a, int b) {

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }
}
