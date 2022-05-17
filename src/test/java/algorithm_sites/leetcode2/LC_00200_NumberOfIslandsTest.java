package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LC_00200_NumberOfIslandsTest {

    private LC_00200_NumberOfIslands question = new LC_00200_NumberOfIslands();

    @Test
    void solution1() {
        int result = question.numIslands(new char[][]{
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        });

        assertThat(result).isEqualTo(1);
    }

    @Test
    void solution2() {
        int result = question.numIslands(new char[][]{
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        });

        assertThat(result).isEqualTo(3);
    }

}