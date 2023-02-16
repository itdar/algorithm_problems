package algorithm_sites.leetcode2;

public class LC_00063_UniquePaths2 {

    private int[] xx = new int[] {1, 0};
    private int[] yy = new int[] {0, 1};
    private int count = 0;
    private boolean[][] visited;
    private int[][] plate;

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        visited = new boolean[obstacleGrid.length][obstacleGrid[0].length];
        plate = new int[obstacleGrid.length][obstacleGrid[0].length];

        // Time Limit Exceeds (Dfs)
//        recursive(obstacleGrid, 0,0);

        // DP
        dp(obstacleGrid, plate);

        return plate[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }

    private void dp(int[][] obstacleGrid, int[][] plate) {
        for (int row = 0; row < obstacleGrid.length; ++row) {
            for (int col = 0; col < obstacleGrid[row].length; ++col) {
                if (obstacleGrid[row][col] != 1) {
                    if (row == 0 && col == 0) {
                        plate[row][col] = 1;
                        continue;
                    }

                    if (row > 0 && col > 0) {
                        plate[row][col] = plate[row-1][col] + plate[row][col-1];
                        continue;
                    }
                    if (row > 0) {
                        plate[row][col] = plate[row-1][col];
                        continue;
                    }
                    if (col > 0) {
                        plate[row][col] = plate[row][col-1];
                    }
                } else {
                    plate[row][col] = 0;
                }
            }
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
