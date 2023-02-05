package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LC_00128_LongestConsecutiveSequenceTest {

    private LC_00128_LongestConsecutiveSequence lc = new LC_00128_LongestConsecutiveSequence();

    @Test
    void solutionTest1() {
        int result = lc.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2});
        assertThat(result).isEqualTo(4);
    }

    @Test
    void solutionTest2() {
        int result = lc.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1});
        assertThat(result).isEqualTo(9);
    }

    @Test
    void solutionTest3() {
        int result = lc.longestConsecutive(new int[]{1,2,0,1});
        assertThat(result).isEqualTo(3);
    }

}
