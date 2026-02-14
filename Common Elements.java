/*
Given two integer arrays a[] and b[]. Return the list of elements common to both the lists and return the list in sorted order. Duplicates may be there in the output list.

Example:

Input: a[] = [3, 4, 2, 2, 4] , b[] = [3, 2, 2, 7]
Output: 2 2 3
Explanation: The common elements in sorted order are [2, 2, 3]
Input: a[] = [3, 6, 1, 7, 9, 8, 2, 2] , b[] = [9, 7, 3, 4, 9]
Output: 3 7 9
Explanation: The common elements in sorted order are [3, 7, 9]
Constraints:

1 ≤ a.size(), b.size() ≤ 105
1 ≤ a[i], b[i] ≤ 105

  */

import java.util.*;

class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // Store frequency of elements from array a
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check elements in array b
        for (int num : b) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        // Sort the result
        Collections.sort(result);

        return result;
    }
}
