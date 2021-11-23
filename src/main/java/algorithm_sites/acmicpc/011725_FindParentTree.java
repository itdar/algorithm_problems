package algorithm_sites.acmicpc;

import java.io.*;
import java.util.*;

// Process
// 1. Input n, edges
// 2. Make nxn matrix
// 3. Prepare queue or stack, and put 1 (starts with 1)
// 4. Iterate while all node are connected (!empty)
//  4.1. Check if it's already connected or not
//   4.1.1. If not -> put, and set parent node number
// 5. Iterate parent nodes number
//  5.1. Print
// 6. Finish

class FindParentTree {

    public static void main(String[] args) throws IOException {
        // 1, 2.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; ++i) {
            nodes[i] = new Node(i);
        }
        for (int i = 0; i < n-1; ++i) {
            String[] temp = br.readLine().split(" ");
            nodes[Integer.parseInt(temp[0])-1].adjacents.add(nodes[Integer.parseInt(temp[1])-1]);
            nodes[Integer.parseInt(temp[1])-1].adjacents.add(nodes[Integer.parseInt(temp[0])-1]);
        }

        // 3.
        int[] parentNumbers = new int[n];
        Stack<Node> stack = new Stack<>();
        stack.push(nodes[0]);

        // 4.
        while (stack.size() > 0) {
            Node popNode = stack.pop();
            for (int i = 0; i < popNode.adjacents.size(); ++i) {
                if (!popNode.adjacents.get(i).isVisited) {
                    stack.push(popNode.adjacents.get(i));
                    popNode.adjacents.get(i).isVisited = true;

                    parentNumbers[popNode.adjacents.get(i).value] = popNode.value;
                }
            }
        }

        // 5.
        for (int i = 1; i < parentNumbers.length; ++i) {
            System.out.println(parentNumbers[i]+1);
        }
    }
    
    static class Node {
        int value;
        boolean isVisited;
        List<Node> adjacents = new ArrayList<>();

        public Node(int value) {
            this.value = value;
            this.isVisited = false;
        }
    }
}
