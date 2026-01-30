/*
Given an integer year. Print "True" (without quotes) if it can represent a leap year, otherwise print "False" (without quotes).

Examples:

Input: year = 2020
Output: True
Explanation: 2020 is leap year as it multilpe of 4 but not a multiple of 100.
Input: year = 2022
Output: False
Explanation: 2022 is not a leap year, as its neither multiple of 400 nor of 4.
*/

import java.util.*;

public class Solution {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}
