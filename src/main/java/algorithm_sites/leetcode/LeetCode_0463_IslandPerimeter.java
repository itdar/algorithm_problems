package algorithm_sites.leetcode;

public class LeetCode_0463_IslandPerimeter {
    int perimeterSum = 0;
    int[][] copiedGrid;
    int[] rotateX = {1,-1,0,0};
    int[] rotateY = {0,0,1,-1};

    public int islandPerimeter(int[][] grid) {
        copiedGrid = grid;

        int height = copiedGrid.length;
        for (int i = 0; i < height; ++i) {
            int width = copiedGrid[i].length;
            for (int j = 0; j < width; ++j) {
                if (copiedGrid[i][j] == 1) {
                    perimeterSum += checkAround(i, j);
                }
            }
        }

        return perimeterSum;
    }

    private int checkAround(int i, int j) {
        int sumSingleBlockPerimeter = 0;

        int x;
        int y;

        for (int m = 0; m < 4; ++m) {
            x = i + rotateX[m];
            y = j + rotateY[m];

            if (x < 0 || y < 0 || x >= copiedGrid.length || y >= copiedGrid[0].length
                || copiedGrid[x][y] == 0) {
                ++sumSingleBlockPerimeter;
            }
        }

        return sumSingleBlockPerimeter;
    }

}
