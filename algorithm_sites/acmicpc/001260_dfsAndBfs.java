package algorithm_sites.acmicpc;

import java.util.*;

class DfsAndBfs {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int vertexesCount = sc.nextInt(); // 4
        int edgesCount = sc.nextInt(); // 5
        int initVertex = sc.nextInt(); // 1

        List<Vertex> vertexes = new ArrayList<>();
        for (int i = 0; i < vertexesCount; ++i) {
            vertexes.add(new Vertex(i+1));
        }

        for (int i = 0; i < edgesCount; ++i) {
            int edgeStartVertex = sc.nextInt();
            int edgeEndVertex = sc.nextInt();

            vertexes.get(edgeStartVertex-1).addAdjacent(vertexes.get(edgeEndVertex-1));
            vertexes.get(edgeEndVertex-1).addAdjacent(vertexes.get(edgeStartVertex-1));
        }

        for (int i = 0; i < vertexes.size(); ++i) {
            Collections.sort(vertexes.get(i).adjacents, Collections.reverseOrder());
        }

        // // Input debugging
        // System.out.println("");
        // for (int i = 0; i < vertexes.size(); ++i) {
        //     for (int j = 0; j < vertexes.get(i).adjacents.size(); ++j) {
        //         System.out.print(vertexes.get(i).adjacents.get(j).value + " ");
        //     }
        //     System.out.println("");
        // }
        // System.out.println("");

        List<Integer> dfsResult = dfs(vertexes.get(initVertex-1));

        for (int i = 0; i < vertexes.size(); ++i)
            vertexes.get(i).isVisited = false;
        for (int i = 0; i < vertexes.size(); ++i) {
            Collections.sort(vertexes.get(i).adjacents);
        }
        List<Integer> bfsResult = bfs(vertexes.get(initVertex-1));

        // System.out.println("");
        for (int i = 0; i < dfsResult.size(); ++i) {
            System.out.print(dfsResult.get(i) + " ");
        }
        System.out.println("");
        for (int i = 0; i < bfsResult.size(); ++i) {
            System.out.print(bfsResult.get(i) + " ");
        }
    }

    public static List<Integer> dfs(Vertex root) {
        List<Integer> result = new LinkedList<>();

        Stack<Vertex> stack = new Stack<>();
        stack.push(root);

        while (stack.size() > 0) {
            Vertex temp = stack.pop();
            if (!temp.isVisited) {
                temp.isVisited = true;    

                result.add(temp.value);

                for (int i = 0; i < temp.adjacents.size(); ++i) {
                    if (!temp.adjacents.get(i).isVisited) {
                        stack.push(temp.adjacents.get(i));
                    }
                }
            }
        }

        return result;
    }

    public static List<Integer> bfs(Vertex root) {
        List<Integer> result = new LinkedList<>();

        Queue<Vertex> queue = new LinkedList<>();
        queue.add(root);
        
        while (queue.size() > 0) {
            Vertex temp = queue.poll();
            if (!temp.isVisited) {
                temp.isVisited = true;

                result.add(temp.value);

                for (int i = 0; i < temp.adjacents.size(); ++i) {
                    if (!temp.adjacents.get(i).isVisited) {
                        queue.add(temp.adjacents.get(i));
                    }
                }
            }   
        }

        return result;
    }
}


class Vertex implements Comparable<Vertex> {
    public int value;
    public List<Vertex> adjacents;
    public boolean isVisited;

    public Vertex(int value) {
        this.value = value;
        this.adjacents = new LinkedList<>();
        this.isVisited = false;
    }

    public void addAdjacent(Vertex vertex) {
        if (!this.adjacents.contains(vertex)) {
            this.adjacents.add(vertex);
        }
    }

    @Override
    public int compareTo(Vertex o) {
        if (this.value > o.value) {
            return 1;
        } else {
            return -1;
        }
    }
}
