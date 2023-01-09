package algorithm_sites.programmers.kit202212;

public class Programmers_DfsBfs_03 {

    private boolean[] visited;
    private int count = 0;

    public int solution(int n, int[][] computers) {
        if (n == 0 || computers == null || computers.length == 0) {
            return 0;
        }

        visited = new boolean[n];
        for (int i = 0; i < n; ++i) {
            if (!visited[i]) {
                visited[i] = true;
                ++count;
                recursiveVisit(computers, i);
            }
        }

        return count;
    }

    private void recursiveVisit(int[][] computers, int index) {
        for (int i = 0; i < computers[index].length; ++i) {
            if (computers[index][i] == 1 && !visited[i]) {
                visited[i] = true;
                recursiveVisit(computers, i);
            }
        }
    }

}
