package algorithm_sites.leetcode;

public class LeetCode_1512_NumberOfGoodPairs {

    public int numIdenticalPairs(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; ++i) {
            for (int j = i+1; j < nums.length; ++j) {
                if (nums[i] == nums[j]) {
                    ++count;
                }
            }
        }

        return count;
    }

}
