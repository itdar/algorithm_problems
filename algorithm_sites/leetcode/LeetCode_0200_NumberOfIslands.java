package algorithm_sites.leetcode;

public class LeetCode_0200_NumberOfIslands {

    int[] xx = new int[] {1, 0, -1, 0};
    int[] yy = new int[] {0, 1, 0, -1};

    boolean[][] visited;
    char[][] grids;

    int count = 0;
    int m;
    int n;

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        grids = grid;
        m = grid.length;
        n = grid[0].length;
        visited = new boolean[m][n];

        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (!visited[i][j] && grid[i][j] != '0') {
                    ++count;
                    dfs(i, j);
                }
            }
        }

        return count;
    }

    public void dfs(int x, int y) {
        for (int i = 0; i < 4; ++i) {
            int dx = x + xx[i];
            int dy = y + yy[i];

            if (dx >= 0 && dx < m && dy >= 0 && dy < n && !visited[dx][dy] && grids[dx][dy] != '0') {
                visited[dx][dy] = true;
                dfs(dx, dy);
            }
        }
    }

    public static void main(String[] args) {
        LeetCode_0200_NumberOfIslands test = new LeetCode_0200_NumberOfIslands();

        char[][] params = new char[][] {{'1','0'}, {'0','1'}};
        test.numIslands(params);

    }

}

class Node {
    boolean isVisited = false;
    int x;

}
