package algorithm_sites.leetcode;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LeetCode_0463_IslandPerimeterTest {

    @DisplayName("섬 둘레를 측정한다 1.")
    @Test
    void islandPerimeterTest_1() {
        LeetCode_0463_IslandPerimeter tester = new LeetCode_0463_IslandPerimeter();

        int[][] grid = new int[][]
               {{0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}};

        int perimeter = tester.islandPerimeter(grid);

        assertThat(perimeter).isEqualTo(16);
    }

    @DisplayName("섬 둘레를 측정한다 2.")
    @Test
    void islandPerimeterTest_2() {
        LeetCode_0463_IslandPerimeter tester = new LeetCode_0463_IslandPerimeter();

        int[][] grid = new int[][] {{1}};

        int perimeter = tester.islandPerimeter(grid);

        assertThat(perimeter).isEqualTo(4);
    }

    @DisplayName("섬 둘레를 측정한다 3.")
    @Test
    void islandPerimeterTest_3() {
        LeetCode_0463_IslandPerimeter tester = new LeetCode_0463_IslandPerimeter();

        int[][] grid = new int[][] {{1,0}};

        int perimeter = tester.islandPerimeter(grid);

        assertThat(perimeter).isEqualTo(4);
    }

}
