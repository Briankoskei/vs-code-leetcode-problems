public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // Negative numbers and numbers ending in 0 (but not 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        // For even-length numbers: x == reversed
        // For odd-length numbers: x == reversed / 10
        return x == reversed || x == reversed / 10;
    }
}
