package algorithm_sites.acmicpc;

import java.io.*;
import java.util.*;

// Process
// 1. Input row, col, matrices
// 2. Make matrix for cabbages
// 3. 전체 반복한다.
//  3.1. 배추이면서 아직 접근 안했으면 -> 큐 준비하고, 탐색 시작한다.
//   3.1.0. 필요개수 센다.
//   3.1.1. 범위 안에 들어가고, 배추인 땅을 방문한다.
// 4. 필요개수 반환한다.

class OrganicCabbage {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 1. 2.
        int testcase = Integer.parseInt(br.readLine());
        for (int k = 0; k < testcase; ++k) {
            String[] tempInput = br.readLine().split(" ");
            int col = Integer.parseInt(tempInput[0]);
            int row = Integer.parseInt(tempInput[1]);
            int cabbageCount = Integer.parseInt(tempInput[2]);
            int[][] cabbageMat = new int[row][col];
            boolean[][] needToVisit = new boolean[row][col];
    
            for (int i = 0; i < cabbageCount; ++i) {
                String[] temp = br.readLine().split(" ");
                cabbageMat[Integer.parseInt(temp[1])][Integer.parseInt(temp[0])] = 1;
                needToVisit[Integer.parseInt(temp[1])][Integer.parseInt(temp[0])] = true;
            }

            int neededCount = 0;
    
            // 3.
            for (int i = 0; i < row; ++i) {
                for (int j = 0; j < col; ++j) {
                    // 3.1.
                    if (cabbageMat[i][j] == 1 && needToVisit[i][j]) {
                        Queue<PairCabbage> queue = new LinkedList<>();
                        queue.add(new PairCabbage(i, j));
                        
                        //
                        ++neededCount;
                        
                        //
                        while (queue.size() > 0) {
                            PairCabbage pair = queue.poll();
    
                            if (needToVisit[pair.row][pair.col]) {
                                needToVisit[pair.row][pair.col] = false;

                                if (pair.row - 1 >= 0 && needToVisit[pair.row-1][pair.col]) {
                                    queue.add(new PairCabbage(pair.row-1, pair.col));
                                }
                                if (pair.row + 1 < row && needToVisit[pair.row+1][pair.col]) {
                                    queue.add(new PairCabbage(pair.row+1, pair.col));
                                }
                                if (pair.col - 1 >= 0 && needToVisit[pair.row][pair.col-1]) {
                                    queue.add(new PairCabbage(pair.row, pair.col-1));
                                }
                                if (pair.col + 1 < col && needToVisit[pair.row][pair.col+1]) {
                                    queue.add(new PairCabbage(pair.row, pair.col+1));
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(neededCount);
        }
    }
}

class PairCabbage {
    int row;
    int col;
    public PairCabbage(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

// class CabbageVertex {
//     int row;
//     int col;
//     boolean visited;

//     public CabbageVertex(int row, int col) {
//         this.row = row;
//         this.col = col;
//         this.visited = false;
//     }
// }
