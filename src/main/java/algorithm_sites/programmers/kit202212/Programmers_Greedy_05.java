package algorithm_sites.programmers.kit202212;

import java.util.Arrays;
import java.util.Comparator;

public class Programmers_Greedy_05 {

    private int sum = 0;
    private int[] disjointSet;

    // Kruskal
    public int solution(int n, int[][] costs) {
        disjointSet = new int[n];
        for (int i = 0; i < disjointSet.length; ++i) {
            disjointSet[i] = i;
        }

        Arrays.sort(costs, Comparator.comparingInt(o -> o[2]));

        int lineCount = 0;
        for (int i = 0; i < costs.length; ++i) {
            if (lineCount < n-1) {
                int node1 = costs[i][0];
                int node2 = costs[i][1];

                if (findParent(node1) != findParent(node2)) {
                    sum += costs[i][2];
                    ++lineCount;
                    union(node1, node2);
                }
            }
        }

        return sum;
    }

    private void union(int node1, int node2) {
        int ap = findParent(node1);
        int bp = findParent(node2);

        disjointSet[bp] = ap;
    }

    public int findParent(int x) {
        if (x == disjointSet[x])
            return x;
        return findParent(disjointSet[x]);
    }

}
