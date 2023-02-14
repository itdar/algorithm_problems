package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LC_00167_TwoSum2_InputArrayIsSortedTest {

    private LC_00167_TwoSum2_InputArrayIsSorted lc = new LC_00167_TwoSum2_InputArrayIsSorted();

    @Test
    void solutionTest1() {
        int[] numbers = new int[] {2,7,11,15};
        int target = 9;

        int[] results = lc.twoSum(numbers, target);

        assertThat(results).containsExactly(1,2);
    }

    @Test
    void solutionTest2() {
        int[] numbers = new int[] {2,3,4};
        int target = 6;

        int[] results = lc.twoSum(numbers, target);

        assertThat(results).containsExactly(1,3);
    }
    @Test
    void solutionTest3() {
        int[] numbers = new int[] {-1,0};
        int target = -1;

        int[] results = lc.twoSum(numbers, target);

        assertThat(results).containsExactly(1,2);
    }

}
