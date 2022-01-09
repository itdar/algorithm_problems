package algorithm_sites.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode_0200_NumberOfIslandsTest {

    @Test
    public void numIslandsTest_1() {
        LeetCode_0200_NumberOfIslands test = new LeetCode_0200_NumberOfIslands();

        char[][] grid = new char[][] {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};

        int result = test.numIslands(grid);

        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void numIslandsTest_2() {
        LeetCode_0200_NumberOfIslands test = new LeetCode_0200_NumberOfIslands();

        char[][] grid = new char[][] {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};

        int result = test.numIslands(grid);

        Assertions.assertThat(result).isEqualTo(3);
    }
}
