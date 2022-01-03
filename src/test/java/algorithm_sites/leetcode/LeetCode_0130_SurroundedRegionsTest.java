package algorithm_sites.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LeetCode_0130_SurroundedRegionsTest {

    @DisplayName("BFS, leetcode 130. Surrounded Regions Test 1.")
    @Test
    void surroundedRegionsTest_1() {
        LeetCode_0130_SurroundedRegions test = new LeetCode_0130_SurroundedRegions();

        char[][] board = new char[][]
            {{'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}};

        test.solve(board);

        char[][] target = new char[][]
            {{'X','X','X','X'},
                {'X','X','X','X'},
                {'X','X','X','X'},
                {'X','O','X','X'}};

        Assertions.assertArrayEquals(board, target);
    }

    @DisplayName("BFS, leetcode 130. Surrounded Regions Test 2.")
    @Test
    void surroundedRegionsTest_2() {
        LeetCode_0130_SurroundedRegions test = new LeetCode_0130_SurroundedRegions();

        char[][] board = new char[][]
            {{'X'}};

        test.solve(board);

        char[][] target = new char[][]
            {{'X'}};

        for (int i = 0; i < target.length; ++i) {
            for (int j = 0; j < target[0].length; ++j) {
                assertThat(target[i][j]).isEqualTo(board[i][j]);
            }
        }
    }

    @DisplayName("BFS, leetcode 130. Surrounded Regions Test 3.")
    @Test
    void surroundedRegionsTest_3() {
        LeetCode_0130_SurroundedRegions test = new LeetCode_0130_SurroundedRegions();

        char[][] board = new char[][]
            {   {'O','O','X','X'},
                {'X','X','O','X'},
                {'O','O','X','X'},
                {'X','O','X','O'}};

        test.solve(board);

        char[][] target = new char[][]
            {   {'O','O','X','X'},
                {'X','X','X','X'},
                {'O','O','X','X'},
                {'X','O','X','O'}};

        Assertions.assertArrayEquals(board, target);
    }

    @DisplayName("BFS, leetcode 130. Surrounded Regions Test 4.")
    @Test
    void surroundedRegionsTest_4() {
        LeetCode_0130_SurroundedRegions test = new LeetCode_0130_SurroundedRegions();

        char[][] board = new char[][]
            {   {'O','X','X','O','X'},
                {'X','O','O','X','O'},
                {'X','O','X','O','X'},
                {'O','X','O','O','O'},
                {'X','X','O','X','O'}};

        test.solve(board);

        char[][] target = new char[][]
            {   {'O','X','X','O','X'},
                {'X','X','X','X','O'},
                {'X','X','X','O','X'},
                {'O','X','O','O','O'},
                {'X','X','O','X','O'}};

        Assertions.assertArrayEquals(board, target);
    }

}
