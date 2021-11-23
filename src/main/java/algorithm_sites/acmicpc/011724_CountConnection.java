package algorithm_sites.acmicpc;

import java.io.*;
import java.util.*;

class CountConnection {
    private static List<Vertex1> vertexes = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        int count = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int countVertex = Integer.parseInt(line[0]);
        int countEdge = Integer.parseInt(line[1]);
        
        for (int i = 0; i < countVertex; ++i) {
            vertexes.add(new Vertex1());
        }
        for (int i = 0; i < countEdge; ++i) {
            line = br.readLine().split(" ");
            int start = Integer.parseInt(line[0])-1;
            int end = Integer.parseInt(line[1])-1;
            vertexes.get(start).addAdjacent(vertexes.get(end));
        }
        
        for (int i = 0; i < vertexes.size(); ++i) {
            if (!vertexes.get(i).isVisited) {
                ++count;
                bfs(vertexes.get(i));
            }
        }

        System.out.println(count);
    }

    public static void bfs(Vertex1 root) {
        Queue<Vertex1> queue = new LinkedList<>();
        queue.add(root);
        root.isVisited = true;
        while(queue.size() > 0) {
            Vertex1 tempVertex = queue.poll();
            for (int j = 0; j < tempVertex.adjacents.size(); ++j) {
                if (!tempVertex.adjacents.get(j).isVisited) {
                    queue.add(tempVertex.adjacents.get(j));
                    tempVertex.adjacents.get(j).isVisited = true;
                }
            }
        }
    }
}

class Vertex1 {
    int value = 0;
    List<Vertex1> adjacents = new ArrayList<>();
    boolean isVisited = false;

    public void addAdjacent(Vertex1 vertex) {
        if (!adjacents.contains(vertex)) {
            adjacents.add(vertex);
            vertex.adjacents.add(this);
        }
    }
}
