package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LC_00704_BinarySearchTest {

    private LC_00704_BinarySearch lc = new LC_00704_BinarySearch();

    @Test
    void solutionTest1() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int result = lc.search(nums, target);

        assertThat(result).isEqualTo(4);
    }
    @Test
    void solutionTest2() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;

        int result = lc.search(nums, target);

        assertThat(result).isEqualTo(-1);
    }
    @Test
    void solutionTest3() {
        int[] nums = {5};
        int target = 5;

        int result = lc.search(nums, target);

        assertThat(result).isEqualTo(0);
    }

}
