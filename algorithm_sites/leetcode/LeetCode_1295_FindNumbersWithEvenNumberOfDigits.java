package algorithm_sites.leetcode;

public class LeetCode_1295_FindNumbersWithEvenNumberOfDigits {

    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int digits = getDigits(num);

            if (digits % 2 == 0) {
                ++count;
            }
        }

        return count;
    }

    private int getDigits(int num) {
        int digits = 0;

        while (num > 0) {
            ++digits;
            num /= 10;
        }

        return digits;
    }

}
