/*
You are given an array arr[] that contains integers. You need to return the length of the array.

Examples:

Input: arr[] = [54, 43, 2, 1, 5]
Output: 5
Explanation: The array contains 5 elements, so its length is 5.
Input: arr[] = [324, 5, 2, 2]
Output: 4
Explanation: The array contains 4 elements, so its length is 4.

*/

class Solution {
    public static int arrayLength(int[] arr) {
        int count = 0;
        for(int i : arr){
            count++;
        }
        
        return count;
    }
}
