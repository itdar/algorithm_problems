package algorithm_sites.leetcode2;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LC_00347_TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Node> map = new HashMap<>();

        for (int num : nums) {
            Node node = map.computeIfAbsent(num, n -> new Node(num));
            node.plusCount();
            map.put(num, node);
        }

        Collection<Node> values = map.values();
        List<Node> nodes = values.stream()
            .sorted((o1, o2) -> o2.count - o1.count)
            .collect(Collectors.toList());

        int[] results = new int[k];

        for (int i = 0; i < k; ++i) {
            results[i] = nodes.get(i).number;
        }

        return results;
    }

    private static class Node {
        private int number;
        private int count = 0;

        public Node(int number) {
            this.number = number;
        }

        public void plusCount() {
            ++this.count;
        }
    }

}
