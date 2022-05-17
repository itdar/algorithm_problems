package algorithm_sites.leetcode2;

public class LC_00200_NumberOfIslands {

    private boolean[][] visit;

    public int numIslands(char[][] grid) {
        int count = 0;
        visit = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (!visit[i][j] && grid[i][j] == '1') {
                    dfs(grid, i, j);
                    ++count;
                }
            }
        }

        return count;
    }

    private int[] x = new int[] {1,-1,0,0};
    private int[] y = new int[] {0,0,1,-1};

    private void dfs(char[][] grid, int i, int j) {
        visit[i][j] = true;

        int dx, dy;
        for (int k = 0; k < 4; ++k) {
            dx = i + x[k];
            dy = j + y[k];

            if (!isValid(grid, dx, dy) || visit[dx][dy] || grid[dx][dy] == '0') {
                continue;
            }

            dfs(grid, dx, dy);
        }
    }

    private boolean isValid(char[][] grid, int dx, int dy) {
        return (dx >= 0 && dx < grid.length && dy >= 0 && dy < grid[dx].length);
    }

}
