package algo_lib;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {

    public static boolean[] visited = new boolean[9];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    public static void bfs(int current) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(current);

        visited[current] = true;

        while(!queue.isEmpty()) {
            int x = queue.poll();

            System.out.println(current + " ");

            for (int i = 0; i < graph.get(current).size(); ++i) {
                int y = graph.get(current).get(i);
                if (!visited[y]) {
                    queue.add(y);
                    visited[y] = true;
                }
            }
        }

    }

    public static void main(String args[]) {

    }

    /**
     * bfs in matrix
     *
     * 최단거리 미로 탈출 같은 내용의 문제
     */

    static int m = 3;
    static int n = 3;
    public static int[][] graphBfsApplied = new int[201][201];

    // 이동할 네 가지 방향 정의 (상, 하, 좌, 우)
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};

    public static int bfs(int x, int y) {
        // 큐(Queue) 구현을 위해 queue 라이브러리 사용
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y));
        // 큐가 빌 때까지 반복하기
        while(!q.isEmpty()) {
            Node node = q.poll();
            x = node.getX();
            y = node.getY();

            // 현재 위치에서 4가지 방향으로의 위치 확인
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 미로 찾기 공간을 벗어난 경우 무시
                if (nx < 0 || nx >= n || ny < 0 || ny >= m)
                    continue;

                // 벽인 경우 무시
                if (graphBfsApplied[nx][ny] == 0)
                    continue;

                // 해당 노드를 처음 방문하는 경우에만 최단 거리 기록
                if (graphBfsApplied[nx][ny] == 1) {
                    graphBfsApplied[nx][ny] = graphBfsApplied[x][y] + 1;
                    q.offer(new Node(nx, ny));
                }
            }
        }
        // 가장 오른쪽 아래까지의 최단 거리 반환
        return graphBfsApplied[n - 1][m - 1];
    }

    public static void mainBfsApplied(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N, M을 공백을 기준으로 구분하여 입력 받기
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine(); // 버퍼 지우기

        // 2차원 리스트의 맵 정보 입력 받기
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graphBfsApplied[i][j] = str.charAt(j) - '0';
            }
        }

        int result = bfs(0, 0);

        // BFS를 수행한 결과 출력
        System.out.println(result);
    }

    static class Node {

        private int x;
        private int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }
    }

}
