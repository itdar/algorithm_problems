package algo_lib;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS {

    public static boolean[] visited = new boolean[9];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void dfs(int current) {
        visited[current] = true;
        System.out.print(current + " ");

        for (int i = 0; i < graph.get(current).size(); ++i) {
            int adjacent = graph.get(current).get(i);
            if (!visited[adjacent]) {
                dfs(adjacent);
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // N, M을 공백을 기준으로 구분하여 입력 받기
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine(); // 버퍼 지우기


    }

    /**
     * dfs in 2d matrix
     *
     * 덩어리 몇개가 있는지 문제
     */
    static int m = 3;
    static int n = 3;
    static int[][] graphApplied = new int[1000][1000];

    public static boolean dfsApplied(int x, int y) {
        if (x <= -1 || x >= n || y <= -1 || y >= m) {
            return false;
        }

        // 현재 노드를 아직 방문하지 않았다면
        if (graphApplied[x][y] == 0) {
            // 해당 노드 방문 처리
            graphApplied[x][y] = 1;
            // 상, 하, 좌, 우의 위치들도 모두 재귀적으로 호출
            dfsApplied(x - 1, y);
            dfsApplied(x, y - 1);
            dfsApplied(x + 1, y);
            dfsApplied(x, y + 1);
            return true;
        }
        return false;
    }

    public static void mainApplied() {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                graphApplied[i][j] = 0; // 입력에 따라서 0, 1
            }
        }

        int resultCount = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (dfsApplied(i,j)) {
                    ++resultCount;
                }
            }
        }

        System.out.println(resultCount);
    }

}
