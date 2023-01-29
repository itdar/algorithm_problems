package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LC_00347_TopKFrequentElementsTest {

    private LC_00347_TopKFrequentElements lc = new LC_00347_TopKFrequentElements();

    @Test
    void solutionTest1() {
        int[] nums = new int[] {1,1,1,2,2,3};
        int k = 2;

        int[] results = lc.topKFrequent(nums, k);

        assertThat(results).contains(1,2);
    }

    @Test
    void solutionTest2() {
        int[] nums = new int[] {1};
        int k = 1;

        int[] results = lc.topKFrequent(nums, k);

        assertThat(results).contains(1);
    }

    @Test
    void solutionTest3() {
        int[] nums = new int[] {4,1,-1,2,-1,2,3};
        int k = 2;

        int[] results = lc.topKFrequent(nums, k);

        assertThat(results).contains(-1, 2);
    }

}
