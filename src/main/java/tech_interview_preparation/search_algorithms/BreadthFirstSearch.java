package tech_interview_preparation.search_algorithms;

import java.util.*;


class BFS {

    static class Vertex {
//        public int name;
        public int value;
        public boolean visited = false;
        public List<Vertex> adjacents = new LinkedList<>();

        public Vertex(int value) {
            this.value = value;
            this.visited = false;
        }

        public boolean addAdjacent(Vertex vertex) {
            if (!this.adjacents.contains(vertex))
                this.adjacents.add(vertex);

            if (!vertex.adjacents.contains(this))
                vertex.adjacents.add(this);

            return true;
        }

        @Override
        public String toString() {
            return String.valueOf(this.value);
        }
    }

// Process (BFS)
// 1. Input 2d array plate (or, node and list for graph)
// 2. 아무 vertex에서 시작한다.
// 3. 큐가 빌 때까지 반복한다. (모두 방문할 때까지 반복)
//  3.1. 큐에서 vertex 꺼낸다.
//  3.2. 방문 표기한다.
//  3.3. 꺼낸 vertex와 연결된 것에 반복한다.
//   3.3.1. 큐에 넣는다.
//  3.4. 방문한 것 출력해본다.
// 4. 끝낸다.
    public static void BreadthFirstSearch(Vertex root) {
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(root);

        List<Integer> returnValues = new LinkedList<>();

        while (queue.size() > 0) {
            Vertex vertex = queue.poll();

            if (!vertex.visited) {
                vertex.visited = true;

                for (int i = 0; i < vertex.adjacents.size(); ++i) {
                    if (!vertex.adjacents.get(i).visited) {
                        queue.add(vertex.adjacents.get(i));
                    }
                }

                returnValues.add(vertex.value);
            }
        }

        for (int i = 0; i < returnValues.size(); ++i) {
            System.out.print(returnValues.get(i) + " ");
        }
    }

    public static void main(String args[]) {
        Vertex vertex1 = new Vertex(1);
        Vertex vertex2 = new Vertex(2);
        Vertex vertex3 = new Vertex(3);
        Vertex vertex4 = new Vertex(4);
        Vertex vertex5 = new Vertex(5);

        vertex1.addAdjacent(vertex2);
        vertex1.addAdjacent(vertex3);
        vertex1.addAdjacent(vertex4);
        vertex2.addAdjacent(vertex1);
        vertex2.addAdjacent(vertex5);
        vertex2.addAdjacent(vertex2);
        vertex3.addAdjacent(vertex4);
        vertex3.addAdjacent(vertex3);
        vertex4.addAdjacent(vertex5);
        vertex5.addAdjacent(vertex1);
        vertex5.addAdjacent(vertex3);

       BreadthFirstSearch(vertex2);
        System.out.println("");
        // DepthFirstSearch(vertex2);
        // System.out.println("");
    }
}