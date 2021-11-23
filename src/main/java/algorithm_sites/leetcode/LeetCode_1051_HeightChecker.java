package algorithm_sites.leetcode;

import java.util.Arrays;

public class LeetCode_1051_HeightChecker {

    public int heightChecker(int[] heights) {
        int[] sorted = Arrays.copyOfRange(heights, 0, heights.length);

        Arrays.sort(sorted);

        int count = 0;
        for (int i = 0; i < heights.length; ++i) {
            if (heights[i] != sorted[i]) {
                ++count;
            }
        }

        return count;
    }

    public static void main(String[] args) {

    }
}
