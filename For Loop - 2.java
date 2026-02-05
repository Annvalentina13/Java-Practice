/*
You are given a string s, you need to print its characters at even indices (index starts at 0).

Examples:

Input: s = "Geeks"
Output: Ges
Explanation: The even indices characters are printed.
Input: s = "DoctorPhenomenal"
Output: DcoPeoea
Explanation: The even indices characters are printed.
*/

class Solution {
    public static void printEvenIndices(String s) {
        // We start at 0 (even) and jump by 2 each time
        for (int i = 0; i < s.length(); i += 2) {
            System.out.print(s.charAt(i));
        }
    }
}
