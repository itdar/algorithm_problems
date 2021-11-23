package algorithm_sites.acmicpc;

import java.io.*;
import java.util.*;

// Process
// 1. Input start A and target B
// 2. Make queue for BFS
// 3. Start and iterate till queue is empty
//  3.1. Check if value is fit to target B
//   3.1.1. If not -> put two vertex to queue (x2, add digit 1)
//   3.1.2. If fit -> end and save depth
// 4. Return depth

class AtoB {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStrings = br.readLine().split(" ");
        
        long a = Long.parseLong(inputStrings[0]);
        long b = Long.parseLong(inputStrings[1]);

        Queue<VertexInAtoB> queue = new LinkedList<>();
        queue.add(new VertexInAtoB(a, 0));

        int resultDepth = -1;
        
        while (queue.size() > 0) {
            VertexInAtoB vertex = queue.poll();
            if (vertex.value == b) {
                resultDepth = vertex.depth;
            } else if (vertex.value != b && vertex.value < b) {
                queue.add(new VertexInAtoB(vertex.value * 2, vertex.depth + 1));
                queue.add(new VertexInAtoB(Long.parseLong(Long.toString(vertex.value) + "1"), 
                                            vertex.depth + 1));
            }
        }
        if (resultDepth != -1)
            System.out.println(resultDepth + 1);
        else
            System.out.println(resultDepth);
    }
    
}

class VertexInAtoB {
    long value;
    int depth;

    public VertexInAtoB(long value, int depth) {
        this.value = value;
        this.depth = depth;
    }
}