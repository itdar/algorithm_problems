package algorithm_sites.leetcode;

public class LeetCode_1929_ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {
        final int length = nums.length;

        int[] answer = new int[length * 2];

        for (int i = 0; i < length; ++i) {
            answer[i] = nums[i];
            answer[i+length] = nums[i];
        }

        return answer;
    }

}
