package algorithm_sites.leetcode2;

public class LC_00063_UniquePaths2 {

    private int[] xx = new int[] {1, 0};
    private int[] yy = new int[] {0, 1};
    private int count = 0;
    private boolean[][] visited;

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        visited = new boolean[obstacleGrid.length][obstacleGrid[0].length];

        // Time Limit Exceeds (Dfs)
//        recursive(obstacleGrid, 0,0);

        // DP
        dp(obstacleGrid, 0, 0);

        return count;
    }

    private void dp(int[][] obstacleGrid, int row, int col) {
        for (int i = 0; i < obstacleGrid.length; ++i) {

        }
    }

    private void recursive(int[][] obstacleGrid, int row, int col) {
        if (row == obstacleGrid.length-1 && col == obstacleGrid[0].length-1 && obstacleGrid[row][col] != 1) {
            ++count;
            return;
        }

        if (!visited[row][col]) {
            for (int i = 0; i < 2; ++i) {
                int x = row + xx[i];
                int y = col + yy[i];

                if (x < obstacleGrid.length && y < obstacleGrid[0].length && obstacleGrid[row][col] != 1) {
                    visited[row][col] = true;
                    recursive(obstacleGrid, x, y);
                    visited[row][col] = false;
                }
            }
        }
    }

}
