package algorithm_sites.acmicpc;

import java.util.*;
import java.io.*;

// Process
// 1. Input computerNumber, pairNumber, pairArray
// 2. Make graph with inputs
// 3. (DFS) start with 1st computer, put 1st in the stack
// 4. Iterate while stack is empty
//  4.1. pop and count
//  4.2. check all adjacent of popped one
//   4.2.1. If it's not visited yet -> put that in the stack
// 5. Return count

class Virus {
    public static void main(String args[]) throws IOException {

        // 1.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computers = Integer.parseInt(br.readLine());
        int pairs = Integer.parseInt(br.readLine());
        
        VertexCpu[] vertexes = new VertexCpu[computers];
        for (int i = 0; i < vertexes.length; ++i) {
            vertexes[i] = new VertexCpu(i);
        }

        // 2.
        for (int i = 0; i < pairs; ++i) {
            String[] temp = br.readLine().split(" ");
            vertexes[(Integer.parseInt(temp[0]) - 1)].addAdjacent(vertexes[Integer.parseInt(temp[1]) - 1]);
        }
        
        int count = 0;

        // 3. 
        Stack<VertexCpu> stack = new Stack<>();
        stack.add(vertexes[0]);

        while (stack.size() > 0) {
            VertexCpu temp = stack.pop();

            if (!temp.isVisited) {
                temp.isVisited = true;

                ++count;

                for (int i = 0; i < temp.adjacents.size(); ++i) {
                    if (!temp.adjacents.get(i).isVisited) {
                        stack.push(temp.adjacents.get(i));
                        // temp.adjacents.get(i).isVisited = true;
                    }
                }
            }
        }

        System.out.println(--count);

        // for (int i = 0; i < vertexes.length; ++i) {
        //     for (int j = 0; j < vertexes[i].adjacents.size(); ++j) {
        //         System.out.print(vertexes[i].adjacents.get(j).number + " ");
        //     }
        //     System.out.println("");
        // }
    }


}

class VertexCpu {
    int number;
    boolean isVisited;
    List<VertexCpu> adjacents;

    public VertexCpu(int number) {
        this.number = number;
        this.isVisited = false;
        this.adjacents = new LinkedList<>();
    }

    public void addAdjacent(VertexCpu dstVertex) {
        if (!adjacents.contains(dstVertex)) {
            adjacents.add(dstVertex);
            dstVertex.adjacents.add(this);
        } 
    }
}