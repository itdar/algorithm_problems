package algorithm_sites.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode_0130_SurroundedRegions {
    boolean[][] visited;

    int[] rotateX = {1,-1,0,0};
    int[] rotateY = {0,0,1,-1};

    Queue<Coords130> queue = new LinkedList<>();
    List<Coords130> coordsBuffer = new ArrayList<>();

    int height;
    int width;

    public void solve(char[][] board) {
        if (board.length < 2 || board[0].length < 2) {
            return;
        }

        height = board.length;
        width = board[0].length;
        visited = new boolean[height][width];

        bfsAllExceptOutside(board);

//        printForDebugging(board);
    }

    private void bfsAllExceptOutside(char[][] board) {
        for (int i = 1; i < height-1; ++i) {
            for (int j = 1; j < width-1; ++j) {
                if (board[i][j] != 'O') {
                    continue;
                }
                queue.add(new Coords130(i,j));
                bfs(board);
                clear();
            }
        }
    }

    private void bfs(char[][] board) {
        int x;
        int y;

        while (!queue.isEmpty()) {
            Coords130 block = queue.poll();
            x = block.x;
            y = block.y;

            if (isOutBound(x, y)) {
                break;
            }

            if (isDirtyConnection(x, y, board)) {
                rollback(board);
                break;
            }

            if (isInvalidBlock(x, y, board)) {
                continue;
            }

            coordsBuffer.add(new Coords130(x, y));

            board[x][y] = 'X';
            visited[x][y] = true;

            for (int i = 0; i < 4; ++i) {
                x = rotateX[i] + block.x;
                y = rotateY[i] + block.y;

                queue.add(new Coords130(x, y));
            }
        }
    }

    private boolean isInvalidBlock(int x, int y, char[][] board) {
        return visited[x][y]
            || board[x][y] == 'X'
            || x < 1
            || y < 1
            || x > height-2
            || y > width-2;
    }

    private boolean isDirtyConnection(int x, int y, char[][] board) {
        return (x < 1 || y < 1 || x > height-2 || y > width-2)
            && board[x][y] == 'O';
    }

    private boolean isOutBound(int x, int y) {
        return x < 0 || y < 0 || x > height-1 || y > width-1;
    }

    private void rollback(char[][] board) {
        for (Coords130 coords130 : coordsBuffer) {
            board[coords130.x][coords130.y] = 'O';
            visited[coords130.x][coords130.y] = false;
        }
        queue.clear();
        coordsBuffer.clear();
    }

    private void clear() {
        queue.clear();
        coordsBuffer.clear();
    }

    static class Coords130 {
        int x;
        int y;

        public Coords130(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private void printForDebugging(char[][] board) {
        for (char[] chars : board) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println("");
        }
        System.out.println("\n");
    }
}
