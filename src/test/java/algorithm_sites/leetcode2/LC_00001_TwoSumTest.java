package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LC_00001_TwoSumTest {

    @Test
    void twoSumTest1() {
        LC_00001_TwoSum ts = new LC_00001_TwoSum();

        int[] result = ts.twoSum(new int[]{2,7,11,15}, 9);

        assertThat(result).containsExactly(0,1);
    }

    @Test
    void twoSumTest2() {
        LC_00001_TwoSum ts = new LC_00001_TwoSum();

        int[] result = ts.twoSum(new int[]{3,2,4}, 6);

        assertThat(result).containsExactly(1,2);
    }

    @Test
    void twoSumTest3() {
        LC_00001_TwoSum ts = new LC_00001_TwoSum();

        int[] result = ts.twoSum(new int[]{3,3}, 6);

        assertThat(result).containsExactly(0,1);
    }

    @Test
    void twoSumTest4() {
        LC_00001_TwoSum ts = new LC_00001_TwoSum();

        int[] result = ts.twoSum(new int[]{0,4,3,0}, 0);

        assertThat(result).containsExactly(0,3);
    }

    @Test
    void twoSumTest5() {
        LC_00001_TwoSum ts = new LC_00001_TwoSum();

        int[] result = ts.twoSum(new int[]{-3,4,3,90}, 0);

        assertThat(result).containsExactly(0,2);
    }

}