/*
You are given a number n, take input of n and print its multiplication table in a single line using for loop till n * 10. 

Examples:

Input: n = 5
Output: 5 10 15 20 25 30 35 40 45 50
Input: n = 6
Output: 6 12 18 24 30 36 42 48 54 60

Constraints:
1 ≤ n ≤ 10

*/

import java.util.*;

public class Solution {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        
        // Take input for n
        int n = sc.nextInt();
        
        // Loop from 1 to 10 inclusive
        for (int i = 1; i <= 10; i++) {
            // Print the result followed by a space on the same line
            System.out.print((n * i) + " ");
        }
    }
    
    public static void main(String[] args) {
        solve();
    }
}
