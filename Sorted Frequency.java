/*
You are given an integer array arr[]. You need to print the distinct elements of array in sorted order(increasing) together with their frequency.
Note: Print each element in a new line.

Example:

Input: arr[] = [3, 3, 2, 2, 1, 4]
Output:
1 1
2 2
3 2
4 1
Explanation: 3 appears 2 times. 2 appears 2 times. 1 appears 1 time, and 4 appears 1 time. So in sorted order we write elements and their frequencies.
Constraints:
1 ≤ arr.size() ≤ 104

*/

import java.util.Arrays;

class Solution {
    public static void freqSorted(int arr[]) {
        Arrays.sort(arr);

        int freq = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                freq++;
            } else {
                System.out.println(arr[i - 1] + " " + freq);
                freq = 1;
            }
        }
        System.out.println(arr[arr.length - 1] + " " + freq);
    }
}
