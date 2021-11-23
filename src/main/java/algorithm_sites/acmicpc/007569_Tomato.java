package algorithm_sites.acmicpc;

import java.io.*;
import java.util.*;
import java.util.StringTokenizer;

// Process
// 1. Input m, n, h, and tomatoes
// 2. Check if it's already all ripped, if so -> 0
// 3. BFS visit all
//  3.1. 전체 중 모든 토마토를 큐에 넣고 시작한다.
//  3.2. 큐에서 뺀다.
//   3.2.1. 횟수 센다.
//   3.2.2. 토마토가 있고, 익어있는지 확인해서
//    3.2.2.1. If so -> 주변부 6방향을 큐에 넣는다.
// 4. Check if it's all ripped, if not -> 횟수 = -1
// 5. Return 횟수

class Tomato2 {
    
    public static void main(String[] args) throws IOException {
        // 1.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int m = Integer.parseInt(temp[0]);
        int n = Integer.parseInt(temp[1]);
        int h = Integer.parseInt(temp[2]);

        Queue<Coords> queue = new LinkedList<>();
        int[][][] tomatoes = new int[h][n][m];
        for (int z = 0; z < h; ++z) {
            for (int y = 0; y < n; ++y) {
                StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
                for (int x = 0; x < m; ++x) {
                    tomatoes[z][y][x] = Integer.parseInt(tokenizer.nextToken());
                    if (tomatoes[z][y][x] == 1) {
                        queue.add(new Coords(z, y, x, 0));
                    }
                }
            }
        }

        // System.out.println(" ");
        // for (int i = 0; i < tomatoes.length; ++i) {
        //     for (int j = 0; j < tomatoes[i].length; ++j) {
        //         for (int k = 0; k < tomatoes[i][j].length; ++k) {
        //             System.out.print(tomatoes[i][j][k] + " ");
        //         }
        //         System.out.println(" ");
        //     }
        //     System.out.println(" ");
        // }

        int count = 0;

        // 2.
        // if (isAllRipped(tomatoes)) {
        //     System.out.println(count);
        //     return;
        // } 

        // 3.
        while (queue.size() > 0) {
            Coords coords = queue.poll();
            int x = coords.x;
            int y = coords.y;
            int z = coords.z;
            if (z+1 < h && tomatoes[z+1][y][x] != -1 && tomatoes[z+1][y][x] != 1) {
                queue.add(new Coords(z+1, y, x, coords.depth+1));
                tomatoes[z+1][y][x] = 1;
            } 
            if (z-1 >= 0 && tomatoes[z-1][y][x] != -1 && tomatoes[z-1][y][x] != 1) {
                queue.add(new Coords(z-1, y, x, coords.depth+1));
                tomatoes[z-1][y][x] = 1;
            } 
            if (y+1 < n && tomatoes[z][y+1][x] != -1 && tomatoes[z][y+1][x] != 1) {
                queue.add(new Coords(z, y+1, x, coords.depth+1));
                tomatoes[z][y+1][x] = 1;
            } 
            if (y-1 >= 0 && tomatoes[z][y-1][x] != -1 && tomatoes[z][y-1][x] != 1) {
                queue.add(new Coords(z, y-1, x, coords.depth+1));
                tomatoes[z][y-1][x] = 1;
            }
            if (x+1 < m && tomatoes[z][y][x+1] != -1 && tomatoes[z][y][x+1] != 1) {
                queue.add(new Coords(z, y, x+1, coords.depth+1));
                tomatoes[z][y][x+1] = 1;
            }
            if (x-1 >= 0 && tomatoes[z][y][x-1] != -1 && tomatoes[z][y][x-1] != 1) {
                queue.add(new Coords(z, y, x-1, coords.depth+1));
                tomatoes[z][y][x-1] = 1;
            }

            count = coords.depth;
        }

        // 4.
        if (!isAllRipped(tomatoes)) {
            System.out.println(-1);
            return;
        }

        System.out.println(count);
    }

    public static boolean isAllRipped(int[][][] tomatoes) {
        for (int i = 0; i < tomatoes.length; ++i) {
            for (int j = 0; j < tomatoes[i].length; ++j) {
                for (int k = 0; k < tomatoes[i][j].length; ++k) {
                    if (tomatoes[i][j][k] == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public static class Coords {
        int x;
        int y;
        int z;
        boolean isVisited;
        int depth;

        public Coords(int z, int y, int x, int depth) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.isVisited = false;
            this.depth = depth;
        }
    }
}
