package algorithm_sites.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * NxN 정비소에서 자동차를 출구로 뺸다.
 *
 * 주차된 상태 NxN 배열 주어짐
 */
public class ChannelProblem02 {

    /**
     * 0 - empty
     * 1 - minsu
     * 2 - fixed
     * 3 - not fixed
     * 4 - exit
     */
    int[][] cars;
    boolean[][] visited;
    boolean found;

    int[] dx = {0, 0, -1, 1};
    int[] dy = {-1, 1, 0, 0};

    List<List<Coord>> combCoords = new ArrayList<>();
    private int minsuX = -1;
    private int minsuY = -1;
    private int count = 0;

    public int solution(int[][] cars) {
        visited = new boolean[cars.length][cars[0].length];

        found = false;

        List<Coord> fixedCoords = new ArrayList<>();
        for (int i = 0; i < cars.length; ++i) {
            for (int j = 0; j < cars[i].length; ++j) {
                if (cars[i][j] == 1) {
                    minsuX = i;
                    minsuY = j;
                } else if (cars[i][j] == 2) {
                    fixedCoords.add(new Coord(i,j));
                }
            }
        }

        int n = fixedCoords.size();
        boolean[] combVisited = new boolean[n];

        for (int i = 0; i <= n; i++) {
            if (found) {
                return count;
            }
            combination(cars, fixedCoords, combVisited, 0, n, i);
        }

//        for (int i = 0; i < combCoords.size(); ++i) {
//            initializeVisited();
//            initializeCars(cars);
//            for (int j = 0; j < combCoords.get(i).size(); ++j) {
//                this.cars[combCoords.get(i).get(j).x][combCoords.get(i).get(j).y] = 0;
//            }
//            // 민수 위치 시작
//            dfs(minsuX, minsuY);
//
//            if (found) {
//                return combCoords.get(i).size();
//            }
//        }

        return -1;
    }

    public void dfs(int x, int y) {
        if (found) return;

        visited[x][y] = true;
        
        if (cars[x][y] == 4) {
            found = true;
            return;
        }
        
        for (int i = 0; i < 4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < cars.length && ny >= 0 && ny < cars[0].length) {
                if (!visited[nx][ny] && (cars[nx][ny] == 0 || cars[nx][ny] == 4)) { // 갈 수 있는 공간
                    dfs(nx, ny);
                }
            }
        }
        
    }

    private void combination(int[][] cars, List<Coord> fixedCoords, boolean[] combVisited, int start, int n, int r) {
        if (found) return;

        if (r == 0) {
            combCoords.add(new ArrayList<>());
            for (int i = 0; i < n; i++) {
                if (combVisited[i]) {
//                    System.out.print(new Coord(fixedCoords.get(i).x, fixedCoords.get(i).y));
                    combCoords.get(combCoords.size()-1).add(new Coord(fixedCoords.get(i).x, fixedCoords.get(i).y));
                }
            }
            // 만들면서 실행
            for (int i = 0; i < combCoords.size(); ++i) {
                initializeVisited();
                initializeCars(cars);
                for (int j = 0; j < combCoords.get(i).size(); ++j) {
                    this.cars[combCoords.get(i).get(j).x][combCoords.get(i).get(j).y] = 0;
                }
                // 민수 위치 시작
                dfs(minsuX, minsuY);

                if (found) {
                    count = combCoords.get(i).size();
                    return;
                }
            }

//            System.out.println("");
            return;
        }

        for (int i = start; i < n; i++) {
            combVisited[i] = true;
            combination(cars, fixedCoords, combVisited, i + 1, n, r - 1);
            combVisited[i] = false;
        }
    }

    private void initializeVisited() {
        for (int i = 0; i < visited.length; ++i) {
            for (int j = 0; j < visited[i].length; ++j) {
                visited[i][j] = false;
            }
        }
    }

    private void initializeCars(int[][] cars) {
        this.cars = new int[cars.length][cars[0].length];

        for (int i = 0; i < cars.length; ++i) {
            for (int j = 0; j < cars[i].length; ++j) {
                this.cars[i][j] = cars[i][j];
            }
        }
    }

    class Coord {
        int x;
        int y;
        Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public String toString() {
            return "["+this.x+","+this.y+"]";
        }
    }

    public static void main(String args[]) {
        ChannelProblem02 sln = new ChannelProblem02();
        int result = sln.solution(new int[][] {{0,0,3,0,0,0,0},{1,0,3,0,0,0,0},{0,0,3,0,0,0,0},{0,0,2,0,0,3,3},{2,2,2,0,2,0,0},{3,3,2,0,2,0,3},{3,3,2,0,2,0,4}});     // 2
//        int result = sln.solution(new int[][] {{0,2,0,0,0},{0,4,2,0,0},{0,2,0,0,0},{0,0,0,2,1},{0,0,0,2,0}});     // 0
//        int result = sln.solution(new int[][] {{0,0,0,0,0},{3,0,0,0,0},{4,3,0,0,0},{0,0,3,0,0},{0,0,0,3,1}});     // -1

        System.out.println("\n 결과 : " + result);
    }

}
