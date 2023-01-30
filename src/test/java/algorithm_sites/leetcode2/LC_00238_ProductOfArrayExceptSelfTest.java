package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LC_00238_ProductOfArrayExceptSelfTest {

    private LC_00238_ProductOfArrayExceptSelf lc = new LC_00238_ProductOfArrayExceptSelf();

    @Test
    void solutionTest1() {
        int[] nums = new int[] {1,2,3,4};
        int[] results = lc.productExceptSelf(nums);
        assertThat(results).contains(24,12,8,6);
    }
    @Test
    void solutionTest2() {
        int[] nums = new int[] {-1,1,0,-3,3};
        int[] results = lc.productExceptSelf(nums);
        assertThat(results).contains(0,0,9,0,0);
    }

}
