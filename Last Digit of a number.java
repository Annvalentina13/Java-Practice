/*
Given an integer n. Write a program to return the last digit of the number.

Examples:

Input: n = 10
Output: 0
Input: n = 9768
Output: 8
Constraints:

-109 ≤ n ≤ 109
*/

class Solution {
    public int lastDigit(int n) {
        return Math.abs(n % 10);

    }
}
