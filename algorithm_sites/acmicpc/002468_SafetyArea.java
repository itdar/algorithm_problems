package algorithm_sites.acmicpc;

import java.util.*;
import java.io.*;

class SafetyArea {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[][] areas = new int[n][n];
        for (int i = 0; i < n; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; ++j) {
                areas[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }
        
        List<Integer> safetyCountList = new ArrayList<>();
        for (int floodHeight = 1; floodHeight <= 100; ++floodHeight) {
            int[][] temp = new int[n][n];
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    temp[i][j] = areas[i][j] - floodHeight;
                }
            }

            int count = 0;
            boolean[][] isVisited = new boolean[n][n];
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    if (!isVisited[i][j] && temp[i][j] > 0) {
                        ++count;
                        Stack<Area> stack = new Stack<>();
                        stack.push(new Area(i, j));
                        isVisited[i][j] = true;

                        while(stack.size() > 0) {
                            Area area = stack.pop();
                            int x = area.x;
                            int y = area.y;

                            if (x+1 < n && !isVisited[x+1][y] && temp[x+1][y] > 0) {
                                isVisited[x+1][y] = true;
                                stack.push(new Area(x+1, y));
                            }
                            if (x-1 >= 0 && !isVisited[x-1][y] && temp[x-1][y] > 0) {
                                isVisited[x-1][y] = true;
                                stack.push(new Area(x-1, y));
                            }
                            if (y+1 < n && !isVisited[x][y+1] && temp[x][y+1] > 0) {
                                isVisited[x][y+1] = true;
                                stack.push(new Area(x, y+1));
                            }
                            if (y-1 >= 0 && !isVisited[x][y-1] && temp[x][y-1] > 0) {
                                isVisited[x][y-1] = true;
                                stack.push(new Area(x, y-1));
                            }
                        }
                    }
                }
            }
            safetyCountList.add(count);
        }
        System.out.println(Collections.max(safetyCountList));
        // System.out.println(Math.max(Collections.max(safetyCountList), 1));
    }

    public static class Area {
        int x;
        int y;
        boolean isVisited = false;

        public Area(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
}
