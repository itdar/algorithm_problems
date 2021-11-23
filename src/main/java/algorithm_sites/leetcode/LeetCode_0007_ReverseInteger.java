package algorithm_sites.leetcode;

public class LeetCode_0007_ReverseInteger {

    public int reverse_3(int x) {
        if (x == 0) {
            return 0;
        }

        boolean isPositive = x > 0;

        int result = 0;
        int pop;

        try {
            while (x != 0) {
                pop = x % 10;
                x /= 10;

                if (isPositive && result > (Integer.MAX_VALUE - pop) / 10) {
                    return 0;
                }
                if (!isPositive && result < (Integer.MIN_VALUE - pop) / 10) {
                    return 0;
                }

                result = (result * 10 + pop);
            }
        } catch (NumberFormatException e) {
            return 0;
        }

        return result;
    }

    public int reverse_2(int x) {
        if (x == 0) {
            return 0;
        }

        boolean isPositive = x > 0;

        StringBuilder sb = new StringBuilder(Integer.toString(Math.abs(x))).reverse();

        int result;

        try {
            result = Integer.parseInt(sb.toString());

            if (!isPositive) {
                return result * -1;
            }

            return result;
        } catch (NumberFormatException e) {
            return 0;
        }

    }

    public int reverse_1(int x) {
        if (x == 0) {
            return 0;
        }

        boolean isPositive;
        if (x > 0) {
            isPositive = true;
        } else {
            isPositive = false;
        }

        StringBuilder sb = new StringBuilder();

        while (x != 0) {
            int temp = x % 10;

            sb.append(Math.abs(temp));

            x /= 10;
        }

        try {
            int result = Integer.parseInt(sb.toString());

            if (!isPositive) {
                return result * -1;
            }

            return result;
        } catch (NumberFormatException e) {
            return 0;
        }

    }

    public static void main(String args[]) {

        LeetCode_0007_ReverseInteger leet = new LeetCode_0007_ReverseInteger();

        int reverse = leet.reverse_3(-321);

        System.out.println(reverse);
    }

}
