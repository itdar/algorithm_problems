package algorithm_sites.leetcode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class LC_02492_MinimumScoreOfAPathBetweenTwoCities {

    private int min = Integer.MAX_VALUE;

    public int minScore(int n, int[][] roads) {
        boolean[] visit = new boolean[n + 1];
        Map<Integer, List<List<Integer>>> adj = new HashMap<>();
        for (int[] road : roads) {
            adj.computeIfAbsent(road[0], k -> new ArrayList<>())
                .add(Arrays.asList(road[1], road[2]));
            adj.computeIfAbsent(road[1], k -> new ArrayList<>())
                .add(Arrays.asList(road[0], road[2]));
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visit[1] = true;
        while (!queue.isEmpty()) {
            Integer integer = queue.poll();

            if (!adj.containsKey(integer)) {
                continue;
            }

            List<List<Integer>> lists = adj.get(integer);
            for (List<Integer> list : lists) {
                this.min = Math.min(this.min, list.get(1));
                if (!visit[list.get(0)]) {
                    visit[list.get(0)] = true;
                    queue.offer(list.get(0));
                }
            }
        }

        return this.min;
    }

}
