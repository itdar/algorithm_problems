package algorithm_sites.programmers;

import java.util.*;

class dfs_bfs_ShortestGameMap {

    public static void main(String[] args) {

        dfs_bfs_ShortestGameMap bfs = new dfs_bfs_ShortestGameMap();

        // int[][] maps = new int[][]

        // bfs.solution();
        
    }

    // Process
    // 1. Input maps (2d)
    // 2. BFS until reaching bottom right
    // 3. Return depth

    public int solution(int[][] maps) {
        int answer = -1;
        
        int xWidth = maps.length;
        int yHeight = maps[0].length;
        
        int goalX = xWidth-1;
        int goalY = yHeight-1;
        
        int depth = 1;

        boolean[][] visited = new boolean[xWidth][yHeight];
        
        Queue<Space> queue = new LinkedList<>();
        queue.add(new Space(0, 0, depth));
        visited[0][0] = true;
        while (queue.size() > 0) {
            Space space = queue.poll();

            int x = space.x;
            int y = space.y;

            if (x == goalX && y == goalY) {
                return space.depth;
            }

            if (x-1 >= 0 && maps[x-1][y] == 1 && !visited[x-1][y]) {
                queue.add(new Space(x-1, y, space.depth+1));
                visited[x-1][y] = true;
            }
            if (x+1 <= xWidth-1 && maps[x+1][y] == 1 && !visited[x+1][y]) {
                queue.add(new Space(x+1, y, space.depth+1));
                visited[x+1][y] = true;
            }
            if (y-1 >= 0 && maps[x][y-1] == 1 && !visited[x][y-1]) {
                queue.add(new Space(x, y-1, space.depth+1));
                visited[x][y-1] = true;
            }
            if (y+1 <= yHeight-1 && maps[x][y+1] == 1 && !visited[x][y+1]) {
                queue.add(new Space(x, y+1, space.depth+1));
                visited[x][y+1] = true;
            }
        }
        
        return answer;
    }
    
    public class Space {
        int x;
        int y;
        int depth;
        
        public Space(int x, int y, int depth) {
            this.x = x;
            this.y = y;
            this.depth = depth;
        }
    }
}

