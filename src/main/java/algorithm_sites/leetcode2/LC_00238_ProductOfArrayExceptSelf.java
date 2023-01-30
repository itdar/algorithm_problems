package algorithm_sites.leetcode2;

public class LC_00238_ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] results = new int[nums.length];
        int mul = 1;

        for (int i = 0; i < nums.length; ++i) {
            results[i] = mul * nums[i];
            mul = results[i];
        }

        mul = 1;
        for (int i = nums.length-1; i >= 0; --i) {
            if (i > 0) {
                results[i] = mul * results[i-1];
                mul *= nums[i];
                continue;
            }

            results[i] = mul;
        }

        return results;
    }

}
