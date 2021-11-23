package algorithm_sites.leetcode;

public class LeetCode_1470_ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[n*2];
        int index = 0;

        for (int i = 0; i < n; ++i) {
            result[index] = nums[i];
            result[index+1] = nums[i+n];

            index+=2;
        }

        return result;
    }

}
