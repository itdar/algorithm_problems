package algorithm_sites.programmers.kit202212;

public class Programmers_ExhaustiveSearch_05 {

    private int max = -1;
    private boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];

        for (int i = 0; i < dungeons.length; ++i) {
            dfs(dungeons, i, k, 0);
        }

        return max;
    }

    private void dfs(int[][] dungeons, int index, int k, int depth) {
        max = Math.max(depth, max);

        for (int i = 0; i < dungeons.length; ++i) {
            if (!visited[index] && dungeons[index][0] <= k) {
                visited[index] = true;
                dfs(dungeons, i, k - dungeons[index][1], depth+1);
                visited[index] = false;
            }
        }
    }

}
