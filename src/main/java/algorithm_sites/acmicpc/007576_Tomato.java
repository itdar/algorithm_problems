package algorithm_sites.acmicpc;

import java.io.*;
import java.util.*;

// Process
// 1. Input col, row, tomato infos
// 2. Make matrix for checking if it's need to visit or not
// 3. Check all riped tomato, and put them in the queue
// 4. Iterate while queue is not empty
//  4.1. poll, and 주변에 체크할 vertex 모두 queue에 삽입. 이 때, maxDepth 확인.
// 5. 안익은 토마토가 있으면 -1, 아니면 maxDepth 반환한다.

class Tomato {

    public static void main(String args[]) throws IOException {
        // 1. 2.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tempStrings = br.readLine().split(" ");
        int col = Integer.parseInt(tempStrings[0]);
        int row = Integer.parseInt(tempStrings[1]);

        StringTokenizer tokenizer;
        int[][] tomatoMat = new int[row][col];
        boolean[][] needToVisit = new boolean[row][col];
        for (int i = 0; i < row; ++i) {
            tokenizer = new StringTokenizer(br.readLine());
            for (int j = 0; j < col; ++j) {
                tomatoMat[i][j] = Integer.parseInt(tokenizer.nextToken());
                if (tomatoMat[i][j] == 1) {
                    needToVisit[i][j] = true;
                } else if (tomatoMat[i][j] == 0) {
                    needToVisit[i][j] = true;
                } else if (tomatoMat[i][j] == -1) {
                    needToVisit[i][j] = false;
                }
            }
        }

        Queue<TomatoVertex> queue = new LinkedList<>();
        // 3.
        for (int i = 0; i < tomatoMat.length; ++i) {
            for (int j = 0; j < tomatoMat[i].length; ++j) {
                if (tomatoMat[i][j] == 1) {
                    queue.add(new TomatoVertex(i, j, 0));
                }
            }
        }

        // 4.
        int maxDepth = 0;
        while (!queue.isEmpty()) {
            TomatoVertex temp = queue.poll();
            if (needToVisit[temp.x][temp.y]) {
                needToVisit[temp.x][temp.y] = false;
                if (maxDepth < temp.depth)
                    maxDepth = temp.depth;

                if (temp.x - 1 >= 0 && needToVisit[temp.x-1][temp.y]) {
                    queue.add(new TomatoVertex(temp.x-1, temp.y, temp.depth+1));
                }
                if (temp.x + 1 < row && needToVisit[temp.x + 1][temp.y]) {
                    queue.add(new TomatoVertex(temp.x+1, temp.y, temp.depth+1));
                }
                if (temp.y - 1 >= 0 && needToVisit[temp.x][temp.y - 1]) {
                    queue.add(new TomatoVertex(temp.x, temp.y-1, temp.depth+1));
                }
                if (temp.y + 1 < col && needToVisit[temp.x][temp.y + 1]) {
                    queue.add(new TomatoVertex(temp.x, temp.y+1, temp.depth+1));
                }
            }
        }

        boolean stillRemainedtoVisit = false;
        for (int i = 0; !stillRemainedtoVisit && i < needToVisit.length; ++i) {
            for (int j = 0; !stillRemainedtoVisit && j < needToVisit[i].length; ++j) {
                if (needToVisit[i][j]) {
                    stillRemainedtoVisit = true;
                }
            }
        }

        if (stillRemainedtoVisit)
            System.out.println(-1);
        else
            System.out.println(maxDepth);
    }
    
}

class TomatoVertex {
    int x; // row
    int y; // col
    int depth; // 시작으로부터의 거리
    // boolean needToVisit; // 안익은 토마토 && 위치에 있는지

    public TomatoVertex(int x, int y, int depth) {
        this.x = x;
        this.y = y;
        this.depth = depth;
        // this.needToVisit = true;
    }
}
