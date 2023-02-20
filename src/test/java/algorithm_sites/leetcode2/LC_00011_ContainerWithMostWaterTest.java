package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LC_00011_ContainerWithMostWaterTest {

    private LC_00011_ContainerWithMostWater lc = new LC_00011_ContainerWithMostWater();

    @Test
    void solutionTest1() {
        int result = lc.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        assertThat(result).isEqualTo(49);
    }

    @Test
    void solutionTest2() {
        int result = lc.maxArea(new int[]{1,1});
        assertThat(result).isEqualTo(1);
    }

    @Test
    void solutionTest3() {
        int result = lc.maxArea(new int[]{2,3,10,5,7,8,9});
        assertThat(result).isEqualTo(36);
    }

}
