package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LC_02492_MinimumScoreOfAPathBetweenTwoCitiesTest {

    private LC_02492_MinimumScoreOfAPathBetweenTwoCities lc_02492_minimumScoreOfAPathBetweenTwoCities = new LC_02492_MinimumScoreOfAPathBetweenTwoCities();

    @Test
    void solutionTest1() {
        int result = lc_02492_minimumScoreOfAPathBetweenTwoCities.minScore(4, new int[][] {{1,2,9},{2,3,6},{2,4,5},{1,4,7}});

        assertThat(result).isEqualTo(5);
    }

    @Test
    void solutionTest2() {
        int result = lc_02492_minimumScoreOfAPathBetweenTwoCities.minScore(4, new int[][]{{1, 2, 2}, {1, 3, 4}, {3, 4, 7}});

        assertThat(result).isEqualTo(2);
    }

}
