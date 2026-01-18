/*
Given two non-empty strings s1 and s2, consisting only of lowercase English letters, determine whether they are anagrams of each other or not.
Two strings are considered anagrams if they contain the same characters with exactly the same frequencies, regardless of their order.

Examples:

Input: s1 = "geeks" s2 = "kseeg"
Output: true 
Explanation: Both the string have same characters with same frequency. So, they are anagrams.
Input: s1 = "allergy", s2 = "allergyy" 
Output: false 
Explanation: Although the characters are mostly the same, s2 contains an extra 'y' character. Since the frequency of characters differs, the strings are not anagrams. 
Input: s1 = "listen", s2 = "lists" 
Output: false 
Explanation: The characters in the two strings are not the same — some are missing or extra. So, they are not anagrams.
Constraints:
1 ≤ s1.size(), s2.size() ≤ 105
s1, s2 consists of lowercase English letters.

*/

class Solution {
    public static boolean areAnagrams(String s1, String s2) {

        // Step 1: If lengths are different, they cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Step 2: Frequency array for 26 lowercase letters
        int[] freq = new int[26];

        // Step 3: Traverse both strings
        for (int i = 0; i < s1.length(); i++) {

            // Increase count for s1 character
            freq[s1.charAt(i) - 'a']++;

            // Decrease count for s2 character
            freq[s2.charAt(i) - 'a']--;
        }

        // Step 4: Check if all frequencies are zero
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
