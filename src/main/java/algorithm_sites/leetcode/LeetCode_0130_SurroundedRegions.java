package algorithm_sites.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode_0130_SurroundedRegions {
    char[][] cpyBoard;
    boolean[][] visited;

    int[] rotateX = {1,-1,0,0};
    int[] rotateY = {0,0,1,-1};

    Queue<Coords130> queue = new LinkedList<>();
    List<Coords130> coordsBuffer = new ArrayList<>();

    public void solve(char[][] board) {
        if (board.length < 2 || board[0].length < 2) {
            return;
        }

        cpyBoard = board;
        visited = new boolean[cpyBoard.length][cpyBoard[0].length];

//        for (int m = 0; m < cpyBoard.length * cpyBoard[0].length; ++m)
        {
            for (int i = 1; i < cpyBoard.length-1; ++i) {
                for (int j = 1; j < cpyBoard[i].length-1; ++j) {
                    queue.add(new Coords130(i,j));
                    bfs();
                    clear();
                }
            }
        }

        // print
        System.out.println("print, start");
        for (int i = 0; i < cpyBoard.length; ++i) {
            for (int j = 0; j < cpyBoard[i].length; ++j) {
                System.out.print(cpyBoard[i][j] + " ");
            }
            System.out.println("");
        }
    }

    private void bfs() {
        while (!queue.isEmpty()) {
            Coords130 block = queue.poll();
            int x = block.x;
            int y = block.y;

            if (x < 0 || y < 0 || x > cpyBoard.length-1 || y > cpyBoard[0].length-1) {
                break;
            }

            if ((x < 1 || y < 1 || x > cpyBoard.length-2 || y > cpyBoard[0].length-2)
            && cpyBoard[x][y] == 'O' && !visited[x][y]) {
                rollback();
                break;
            }

            if (visited[x][y]
                || cpyBoard[x][y] == 'X'
                || x < 1
                || y < 1
                || x > cpyBoard.length-2
                || y > cpyBoard[0].length-2) {
                continue;
            }

            coordsBuffer.add(new Coords130(x, y));
            cpyBoard[x][y] = 'X';
            visited[x][y] = true;

            for (int i = 0; i < 4; ++i) {
                x = rotateX[i] + block.x;
                y = rotateY[i] + block.y;

                queue.add(new Coords130(x, y));
            }
        }
    }

    private void rollback() {
        queue.clear();
        for (Coords130 coords130 : coordsBuffer) {
            cpyBoard[coords130.x][coords130.y] = 'O';
            visited[coords130.x][coords130.y] = false;
        }
        coordsBuffer.clear();
    }

    private void clear() {
        queue.clear();
        coordsBuffer.clear();
        visited = new boolean[cpyBoard.length][cpyBoard[0].length];
    }

    static class Coords130 {
        int x;
        int y;

        public Coords130(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
