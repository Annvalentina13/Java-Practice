/*
class Solution {
    static int isSumPalindrome(int n) {

        // If already palindrome, return it
        if (isPalindrome(n)) {
            return n;
        }

        int count = 0;

        while (count < 5) {
            int reversed = reverse(n);
            int sum = n + reversed;

            if (isPalindrome(sum)) {
                return sum;
            }

            n = sum;
            count++;
        }

        return -1;
    }

    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    static boolean isPalindrome(int n) {
        return n == reverse(n);
    }
}
*/

class Solution {
    static int isSumPalindrome(int n) {

        // If already palindrome, return it
        if (isPalindrome(n)) {
            return n;
        }

        int count = 0;

        while (count < 5) {
            int reversed = reverse(n);
            int sum = n + reversed;

            if (isPalindrome(sum)) {
                return sum;
            }

            n = sum;
            count++;
        }

        return -1;
    }

    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    static boolean isPalindrome(int n) {
        return n == reverse(n);
    }
}

