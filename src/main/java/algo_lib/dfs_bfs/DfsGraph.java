package algo_lib.dfs_bfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class DfsGraph {

    public int dfs(Node rootNode) {
        if (Objects.isNull(rootNode) || rootNode.adjacents.isEmpty())
            return -1;

        Stack<Node> stack = new Stack<>();
        rootNode.isVisited = true;
        stack.push(rootNode);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            int depth = node.depth;

            for (Node adjacent : node.adjacents) {
                if (!adjacent.isVisited) {

                    if (adjacent.value == 1) {
                        return ++depth;
                    }

                    adjacent.isVisited = true;
                    adjacent.depth = depth + 1;
                    stack.push(adjacent);
                }
            }
        }

        return -1;
    }

    public static class Node {
        int value;
        int depth;
        boolean isVisited;
        List<Node> adjacents = new ArrayList<>();

        public Node() {
            this(0);
        }

        private Node(int value) {
            this.value = value;
            this.isVisited = false;
        }

        public static Node of(int value) {
            return new Node(value);
        }

        public void add(Node node) {
            this.adjacents.add(node);
        }
    }

}
