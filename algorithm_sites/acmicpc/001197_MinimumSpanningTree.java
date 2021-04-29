package algorithm_sites.acmicpc;

import java.io.*;
import java.util.*;

// Process
// 1. Input countVertex, countEdge, edges
// 2. Make vertexes for union check
// 3. Sort edges
// 4. Iterate till all vertex are connected (edge count = vertex count - 1)
//  4.1. Get edge
//  4.2. Check if it's making cycle
//   4.2.1. If not -> add weight, update union
// 5. Return totalWeight

class MinimumSpanningTree {

    private static int[] vertexes;

    public static void main(String[] args) throws IOException {
        int totalWeight = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int countVertex = Integer.parseInt(line[0]);
        int countEdge = Integer.parseInt(line[1]);

        vertexes = new int[countVertex];
        for (int i = 0; i < vertexes.length; ++i) {
            vertexes[i] = i;
        }
        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < countEdge; ++i) {
            line = br.readLine().split(" ");
            int start = Integer.parseInt(line[0]) - 1;
            int end = Integer.parseInt(line[1]) - 1;
            int weight = Integer.parseInt(line[2]);
            edges.add(new Edge(start, end, weight));
        }

        // 3.
        Collections.sort(edges);

        // 4.
        int edgeCount = 0;
        for (int i = 0; edgeCount != countVertex-1 && i < edges.size(); ++i) {
            Edge edge = edges.get(i);
            int start = edge.start;
            int end = edge.end;
            if (find(start) != find(end)) {
                union(start, end);
                totalWeight += edge.weight;
                ++edgeCount;
            }
        }

        System.out.println(totalWeight);
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
}

class Edge implements Comparable<Edge> {
    int start;
    int end;
    int weight;

    public Edge(int start, int end, int weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge o) {
        if (this.weight >= o.weight) {
            return 1;
        }
        return -1;
    }
}