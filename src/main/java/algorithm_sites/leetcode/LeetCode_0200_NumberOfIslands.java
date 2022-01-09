package algorithm_sites.leetcode;

import java.awt.Point;
import java.util.Stack;

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
//                    dfs_recursive(i, j);
                    dfs_stack(i, j);
                }
            }
        }

        return count;
    }

    public void dfs_stack(int x, int y) {
        Stack<Point> stack = new Stack<>();

        stack.add(new Point(x, y));

        while (!stack.isEmpty()) {
            Point point = stack.pop();

            for (int i = 0; i < 4; ++i) {
                int dx = point.x + xx[i];
                int dy = point.y + yy[i];

                if (dx >= 0 && dx < m && dy >= 0 && dy < n && !visited[dx][dy] && grids[dx][dy] != '0') {
                    visited[dx][dy] = true;
                    stack.add(new Point(dx, dy));
                }
            }
        }
    }

    public void dfs_recursive(int x, int y) {
        for (int i = 0; i < 4; ++i) {
            int dx = x + xx[i];
            int dy = y + yy[i];

            if (dx >= 0 && dx < m && dy >= 0 && dy < n && !visited[dx][dy] && grids[dx][dy] != '0') {
                visited[dx][dy] = true;
                dfs_recursive(dx, dy);
            }
        }
    }

}