package Array;

public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber palindrome = new PalindromeNumber();
        boolean res = palindrome.isPalindromeNumber(454454);
        System.out.println(res);

    }

    public boolean isPalindromeNumber(int x) {
        int reverse = 0, num = x;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num/=10;
        }

        if (reverse == x && x >=0)
            return true;

        else
            return false;

    }
}