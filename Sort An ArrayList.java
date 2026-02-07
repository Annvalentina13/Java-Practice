/*
You are given an integer arrayList list, you need to sort it in increasing order.

Examples:

Input: list[] = [9, 8, 7, 6, 5, 4, 4]
Output: 4 4 5 6 7 8 9
Explanation: Just sorted arrayList.
Input: list[] = [99, 6, 33]
Output: 6 33 99
Explanation: Just sorted arrayList.
Constraints:
1 <= list.size() <= 103
0 <= arri <= 106

*/

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public static void sortArrayList(ArrayList<Integer> list) {
        // Sort the ArrayList in increasing order
        Collections.sort(list);
        
        // No need to print anything
    }
}
