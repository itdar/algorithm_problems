package algorithm_sites.programmers;

public class Greedy_05_ConnectIsland {

    static int[] vertexes;

    public int solution(int n, int[][] costs) {
        int answer = 0;

        boolean[] visited = new boolean[costs.length];
        vertexes = new int[n];

        while (!allVisited(visited)) {
            int minCostIndex = findMinCostIndex(costs, visited);

            visited[minCostIndex] = true;

            int from = costs[minCostIndex][0];
            int to = costs[minCostIndex][1];

            if (find(from) != find(to)) {
                union(from, to);

                visited[minCostIndex] = true;
            }
        }

        return answer;
    }

    public static int find(int x) {
        if (vertexes[x] == x) {
            return x;
        }
        return find(vertexes[x]);
    }

    public static void union(int start, int end) {
        vertexes[find(end)] = find(start);
    }

    private int findMinCostIndex(int[][] costs, boolean[] visited) {
        int min = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < costs.length; ++i) {
            if (costs[i][2] < min && !visited[i]) {
                min = costs[i][2];
                index = i;
            }
        }

        return index;
    }

    private boolean allVisited(boolean[] visited) {
        for (boolean visit : visited) {
            if (!visit) {
                return false;
            }
        }

        return true;
    }

}
