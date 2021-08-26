package algorithm_sites.leetcode;

public class LC_0009_PalindromeNumber {

    public static boolean isPalindrome_2(int x) {
        if (x < 0) {
            return false;
        }

        if (x == 0) {
            return true;
        }

        String inputString = String.valueOf(x);
        int length = inputString.length();
        int half = inputString.length() / 2;
        for (int i = 0; i < half-1; ++i) {
            if (inputString.charAt(i) != inputString.charAt(length-1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrome_1(int x) {
        if (x < 0) {
            return false;
        }

        if (x == 0) {
            return true;
        }

        int input = x;

        StringBuilder sb = new StringBuilder();
        while (x != 0) {
            int remainder = x % 10;
            x /= 10;

            sb.append(remainder);
        }

        try {
            int palindrome = Integer.parseInt(sb.toString());

            return input == palindrome;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    public static void main(String args[]) {
        boolean result = isPalindrome_2(121);

        System.out.println(result);
    }

}
