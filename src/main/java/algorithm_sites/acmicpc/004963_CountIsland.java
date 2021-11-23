package algorithm_sites.acmicpc;

import java.util.*;
import java.io.*;

class CountIsland {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] line = br.readLine().split(" ");
            if (Integer.parseInt(line[0]) == 0 && Integer.parseInt(line[1]) == 0) {
                return;
            }

            int cols = Integer.parseInt(line[0]);
            int rows = Integer.parseInt(line[1]);
            int[][] testcase = new int[rows][cols];
            for (int i = 0; i < rows; ++i) {
                StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < cols; ++j) {
                    testcase[i][j] = Integer.parseInt(tokenizer.nextToken());
                }
            }

            // for (int i = 0; i < testcase.length; ++i) {
            //     for (int j = 0; j < testcase[i].length; ++j) {
            //         System.out.print(testcase[i][j] + " ");
            //     }
            //     System.out.println(" ");
            // }

            // 3.
            int count = 0;
            boolean[][] isVisited = new boolean[rows][cols];
            for (int i = 0; i < testcase.length; ++i) {
                for (int j = 0; j < testcase[i].length; ++j) {
                    if (testcase[i][j] == 1 && !isVisited[i][j]) {
                        // System.out.println(i + " " + j);
                        ++count;
                        Stack<Coord> stack = new Stack<>();
                        stack.push(new Coord(i, j));
                        isVisited[i][j] = true;
                        while (stack.size() > 0) {
                            Coord coord = stack.pop();
                            int x = coord.x;
                            int y = coord.y;
                            if (x+1 <= rows-1 && !isVisited[x+1][y] && testcase[x+1][y] == 1) {
                                stack.push(new Coord(x+1, y));
                                isVisited[x+1][y] = true;
                            }
                            if (y+1 <= cols-1 && !isVisited[x][y+1] && testcase[x][y+1] == 1) {
                                stack.push(new Coord(x, y+1));
                                isVisited[x][y+1] = true;
                            }
                            if (x-1 >= 0 && !isVisited[x-1][y] && testcase[x-1][y] == 1) {
                                stack.push(new Coord(x-1, y));
                                isVisited[x-1][y] = true;
                            }
                            if (y-1 >= 0 && !isVisited[x][y-1] && testcase[x][y-1] == 1) {
                                stack.push(new Coord(x, y-1));
                                isVisited[x][y-1] = true;
                            }
                            if (x+1 <= rows-1 && y+1 <= cols-1 && !isVisited[x+1][y+1] && testcase[x+1][y+1] == 1) {
                                stack.push(new Coord(x+1, y+1));
                                isVisited[x+1][y+1] = true;
                            }
                            if (x-1 >= 0 && y-1 >= 0 && !isVisited[x-1][y-1] && testcase[x-1][y-1] == 1) {
                                stack.push(new Coord(x-1, y-1));
                                isVisited[x-1][y-1] = true;
                            }
                            if (x+1 <= rows-1 && y-1 >= 0 && !isVisited[x+1][y-1] && testcase[x+1][y-1] == 1) {
                                stack.push(new Coord(x+1, y-1));
                                isVisited[x+1][y-1] = true;
                            }
                            if (x-1 >= 0 && y+1 <= cols-1 && !isVisited[x-1][y+1] && testcase[x-1][y+1] == 1) {
                                stack.push(new Coord(x-1, y+1));
                                isVisited[x-1][y+1] = true;
                            }
                        }
                    }
                }
            }

            System.out.println(count);
        }
    }

    public static class Coord {
        int x;
        int y;
        boolean isVisited = false;

        public Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
