/*
Given an array of names arr[] of candidates in an election. A candidate name in array represents a vote casted to the candidate. You need to find the candidate with maximum votes recieved in the election. It may happen that two or more candidates may have same votes, in that case you need to return the name of the candidate which comes first lexicographically in dictionary.

Examples:

Input: arr[] = ["Turin", "Nick", "Turin", "Nick"]
Output: Nick
Explanation: Both have the same 2 number of votes but Nick comes first lexicographically.
Input: arr[] = ["John", "Shushma", "Rajnath"]
Output: John 
Explanation: All the three have same number of votes of 1. Lexicographically John comes first.
Constraints
1 <= arr.size() <= 104

*/

class Solution {
    public static String TieBreak(String arr[]) {

        int n = arr.length;
        String winner = "";
        int maxVotes = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;

            // Count how many times arr[i] appears
            for (int j = 0; j < n; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }

            // Update winner
            if (count > maxVotes) {
                maxVotes = count;
                winner = arr[i];
            } 
            else if (count == maxVotes) {
                // Lexicographical check
                if (arr[i].compareTo(winner) < 0) {
                    winner = arr[i];
                }
            }
        }

        return winner;
    }
}
