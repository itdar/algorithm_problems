package algorithm_sites.programmers;

import java.util.*;

// Process
// 1. Input computerCount, computers(2d network condition)
// 2. Make VertexNetwork
// 3. 모든 vertex 반복한다.
//  3.1. 유효하면 (아직 방문 안했으면, 어느 네트워크에 속하지 않았으면)
//   3.1.0. networkCount 센다.
//   3.1.1. Stack만든다 for DFS, 시작 vertex 넣는다.
//   3.1.2. Stack에 내용물 없을 때까지 반복한다.
//    3.1.2.1. 하나 뽑고
//    3.1.2.2. 인접한 vertex들 반복한다.
//     3.1.2.2.1. Vertex가 유효하면, stack에 넣는다.
// 4. networkCount 반환한다.
// 5. 끝낸다.

class SolutionNetwork {

    public static void main(String args[]) {
        int computerCount = 3;
        int[][] computers = new int[3][3];
        computers[0][0] = 1;
        computers[1][1] = 1;
        computers[2][2] = 1;
        computers[0][1] = 1;
        computers[1][0] = 1;
    
        int result = solution(computerCount, computers);
    
        System.out.println("Result: " + result);
    }

    public static int solution(int computerCount, int[][] computers) {
        int networkCount = 0;
        
        List<VertexNetwork> networks = new LinkedList<>();
        for (int i = 0; i < computerCount; ++i) {
            networks.add(new VertexNetwork(i));
        }
        for (int i = 0; i < computers.length; ++i) {
            for (int j = 0; j < computers[i].length; ++j) {
                if (computers[i][j] == 1) {
                    networks.get(i).addAdjacent(networks.get(j));
                }
            }
        }
        
        for (int i = 0; i < networks.size(); ++i) {
            if (!networks.get(i).isVisited) {
                ++networkCount;
                Stack<VertexNetwork> stack = new Stack<>();
                stack.push(networks.get(i));
                
                while(!stack.isEmpty()) {
                    VertexNetwork vertex = stack.pop();
                    vertex.isVisited = true;
                    for (int j = 0; j < vertex.adjacents.size(); ++j) {
                        if (!vertex.adjacents.get(j).isVisited) {
                            stack.push(vertex.adjacents.get(j));
                        }
                    }
                }
            }
        }

        // for (int i = 0; i < networks.size(); ++i) {
        //     for (int j = 0; j < networks.get(i).adjacents.size(); ++j) {
        //         System.out.print(networks.get(i).adjacents.get(j).number + " ");
        //     }
        //     System.out.println("");
        // }
        
        return networkCount;
    }
}

class VertexNetwork {
    public int number;
    public boolean isVisited;
    public List<VertexNetwork> adjacents;
    
    public VertexNetwork(int number) {
        this.number = number;
        this.isVisited = false;
        this.adjacents = new LinkedList<>();
    }
    
    public void addAdjacent(VertexNetwork vertex) {
        if (this.number != vertex.number && !this.adjacents.contains(vertex)) {
            this.adjacents.add(vertex);
        }
    }
}

