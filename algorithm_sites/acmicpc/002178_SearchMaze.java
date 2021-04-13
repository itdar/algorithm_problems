package algorithm_sites.acmicpc;

// import java.io.*;
// import java.util.*;

// class Node {
//     int row = 0;
//     int col = 0;
//     int depth = 0;
    
//     public Node(int row, int col, int depth) {
//         this.row = row;
//         this.col = col;
//         this.depth = depth;
//     }

// }

// class SearchMaze {
//     public static void main(String args[]) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         // Scanner scanner = new Scanner(System.in);
//         // int n = scanner.nextInt();
//         // int m = scanner.nextInt();
//         String[] input = br.readLine().split(" ");
//         int n = Integer.parseInt(input[0]);
//         int m = Integer.parseInt(input[1]);
//         int[][] maze = new int[n][m];
//         boolean[][] movable = new boolean[n][m];

//         for (int i = 0; i < n; ++i) {
//             String line = br.readLine();
//             for (int j = 0; j < line.length(); ++j) {
//                 if (line.charAt(j) == '1') {
//                     maze[i][j] = 1;
//                     movable[i][j] = true;
//                 } else if (line.charAt(j) == '0') {
//                     maze[i][j] = 0;
//                 }
//             }
//         }
        
//         int count = 0;

//         Queue<Node> queue = new LinkedList<>();
//         queue.add(new Node(0,0,1));
        
//         boolean isFound = false;
//         while (queue.size() > 0 && !isFound) {
//             Node pair = queue.poll();

//             if (movable[pair.row][pair.col]) {
//                 movable[pair.row][pair.col] = false;

//                 if (pair.row - 1 >= 0 && movable[pair.row-1][pair.col])
//                     queue.add(new Node(pair.row - 1, pair.col, pair.depth+1));
//                 if (pair.row + 1 < n && movable[pair.row+1][pair.col])
//                     queue.add(new Node(pair.row + 1, pair.col, pair.depth+1));
//                 if (pair.col - 1 >= 0 && movable[pair.row][pair.col-1])
//                     queue.add(new Node(pair.row, pair.col - 1, pair.depth+1));
//                 if (pair.col + 1 < m && movable[pair.row][pair.col+1])
//                     queue.add(new Node(pair.row, pair.col + 1, pair.depth+1));
                
//                 if (pair.row == n-1 && pair.col == m-1) {
//                     count = pair.depth;
//                 }
//             }
//         }

//         System.out.println(count);

//         // scanner.close();
//     }
// }


import java.util.*;
import java.io.*;

class SearchMaze {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[][] maze = new int[n][m];
        
        for (int i=0; i<n; i++) {
            String s = br.readLine();

            for (int j=0; j<m; j++) {
                maze[i][j] = s.charAt(j) - '0';
            }
        }

        int result = bfs(n, m, maze);
        System.out.println(result);
    }

    static int bfs(int n, int m, int[][] maze) {
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};

        Queue<Dot> q = new LinkedList<>();
        maze[0][0] = 0;
        q.add(new Dot(0, 0, 1));
        
        while (!q.isEmpty()) {
            Dot dot = q.poll();
            
            if (dot.x == n-1 && dot.y == m-1) {
                return dot.count;
            }

            for (int i=0; i<4; i++) {
                int nx = dot.x + dx[i];
                int ny = dot.y + dy[i];

                if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                    if (maze[nx][ny] == 1) {
                        maze[nx][ny] = 0;
                        q.add(new Dot(nx, ny, dot.count + 1));
                    }
                }
            }
        }

        return 0;
    }

    static class Dot {
        int x, y, count;

        Dot(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
}