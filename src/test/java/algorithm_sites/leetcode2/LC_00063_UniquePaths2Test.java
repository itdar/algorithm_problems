package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LC_00063_UniquePaths2Test {

    private LC_00063_UniquePaths2 lc = new LC_00063_UniquePaths2();

    @Test
    void solutionTest1() {
        int[][] grid = new int[][] {{0,0,0},{0,1,0},{0,0,0}};

        int result = lc.uniquePathsWithObstacles(grid);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void solutionTest2() {
        int[][] grid = new int[][] {{0,1},{0,0}};

        int result = lc.uniquePathsWithObstacles(grid);

        assertThat(result).isEqualTo(1);
    }
    @Test
    void solutionTest3() {
        int[][] grid = new int[][] {{0,0},{0,1}};

        int result = lc.uniquePathsWithObstacles(grid);

        assertThat(result).isEqualTo(0);
    }

    @Test
    void solutionTest4() {
        int[][] grid = new int[][] {{0,0,0,0},{0,1,0,0},{0,0,0,0},{0,0,1,0},{0,0,0,0}};

        int result = lc.uniquePathsWithObstacles(grid);

        assertThat(result).isEqualTo(7);
    }

}
