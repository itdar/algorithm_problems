package algo_lib.dfs_bfs;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DfsGridTest {

    private DfsGrid dfsGrid = new DfsGrid();
    private int[][] grid;

    @BeforeEach
    void setUp() {
        grid = new int[][] {
            {0,0,0,0,0,0},
            {1,0,1,0,0,0},
            {1,0,1,1,1,0},
            {0,0,0,1,1,1},
            {0,1,0,0,0,0}
        };
    }

    @DisplayName("(0,0) 에 (4,5) 으로의 최단거리 -> 9")
    @Test
    public void Dfs_Grid_Test_1() {
        int shortest = dfsGrid.dfs(grid, 0, 0);

        assertThat(shortest).isEqualTo(9);
    }

    @DisplayName("(0,5) 에서 우하단 (4,5) 으로의 최단거리 -> 12")
    @Test
    public void Dfs_Grid_Test_2() {
        int shortest = dfsGrid.dfs(grid, 0, 5);

        assertThat(shortest).isEqualTo(12);
    }

    @DisplayName("유효하지 않은 시작점")
    @Test
    public void Dfs_Grid_Test_3() {
        int shortest = dfsGrid.dfs(grid, -1, 0);

        assertThat(shortest).isEqualTo(-1);
    }
}