package String;

import java.util.Iterator;

public class StringToInteger {
    public static void main(String[] args) {
    String s ="-91283472332";
    var check = new StringToInteger();
    var res = check.stringToInteger(s);
    System.out.println(res);

    }

    public int stringToInteger(String input) {
        int sign = 1;
        int result = 0;
        int index = 0;
        int n = input.length();

// Discard all spaces from the beginning of the input string.
        while (index < n  && input.charAt(index) == ' ') {
            index++;
        }

// sign = +1, if it's positive number, otherwise sign = -1.
        if (index < n && input.charAt(index) == '+') {
            sign = 1;
            index++;
        } else if (index < n && input.charAt(index) == '-') {
            sign = -1;
            index++;
        }

        // Traverse next digits of input and stop if it is not a digit
        while (index < n && Character.isDigit(input.charAt(index))) {
            int digit = input.charAt(index) - '0';

            // Check overflow and underflow conditions.
            if (result > Integer.MAX_VALUE / 10 || result == Integer.MAX_VALUE / 10 && digit >= Integer.MAX_VALUE % 10){
// If integer overflowed return 2^31-1, otherwise if underflow return -2^31.
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
            result = 10 * result + digit;
            index++;
        }

// We have formed a valid number without any overflow/underflow
        return sign * result;
    }
}
