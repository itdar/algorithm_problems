package algorithm_sites.programmers;
// Process
// 1. Input n, costs
// 2. Make costs list for easy access
// 3. Iterate while making mst is not done
//  3.1. In vertexes in mst list, find smallest weight edge
//  3.2. Check if it's making cycle (if it's valid) **
//   3.2.1. If valid -> add to mst list, and add weight
//   3.2.2. If not -> remove that weight edge
// 4. Return weight

import java.util.*;

// // Prim mst 01
// class Solution {
//     public int solution(int n, int[][] costs) {
//         int totalCost = 0;
        
//         int[][] islands = new int[n][n];
//         List<Integer> connected = new LinkedList<>();
        
//         // Make islands plate
//         for (int i = 0; i < costs.length; ++i) {
//             islands[costs[i][0]][costs[i][1]] = costs[i][2];
//             islands[costs[i][1]][costs[i][0]] = costs[i][2];
//         }
        
//         connected.add(costs[0][0]);
        
//         while (connected.size() != n) {
//             int minCost = Integer.MAX_VALUE;
//             int minIndex = -1;
//             for (int i = 0; i < connected.size(); ++i) {
//                 int connectedIndex = connected.get(i);
//                 for (int j = 0; j < n; ++j) {
//                     if (islands[connectedIndex][j] != 0 && islands[connectedIndex][j] < minCost && !connected.contains(j)) {
//                         minCost = islands[connectedIndex][j];
//                         minIndex = j;
//                     }
//                 }
//             }
//             connected.add(minIndex);
//             totalCost += minCost;
//         }
        
//         return totalCost;
//     }
// }


// // Prim mst 02
// class Solution {
//     public int solution(int n, int[][] costs) {
//         int totalCost = 0;
//         List<Integer> connected = new LinkedList<>();
//         int[][] costPlate = new int[n][n];
        
//         for (int i = 0; i < costs.length; ++i) {
//             costPlate[costs[i][0]][costs[i][1]] = costs[i][2];
//             costPlate[costs[i][1]][costs[i][0]] = costs[i][2];
//         }
        
//         connected.add(costs[0][0]);
        
//         while (connected.size() != n) {
//             int minCost = Integer.MAX_VALUE;
//             int dstIsland = -1;
//             for (int i = 0; i < connected.size(); ++i) {
//                 int connectedIndex = connected.get(i);
//                 for (int j = 0; j < n; ++j) {
//                     if (costPlate[connectedIndex][j] < minCost && !connected.contains(j) && costPlate[connectedIndex][j] != 0) {
//                         minCost = costPlate[connectedIndex][j];
//                         dstIsland = j;
//                     }
//                 }
//             }
//             connected.add(dstIsland);
//             totalCost += minCost;
//         }
        
//         return totalCost;
//     }
// }

// Kruskal mst
// Process
// 1. Input n, costs
// 2. Sort using cost (ascending way)
// 3. Iterate costs
//  3.1. Check edge is valid or not
//   3.1.1. If valid -> add cost to totalCost
//   3.1.2. If not -> next
// 4. Return totalCost

class Solution {
    public int solution(int n, int[][] costs) {
        int totalCost = 0;
        List<Integer> connected = new LinkedList<>();
        int[] disjointSet = new int[n];
        
        for (int i = 0; i < disjointSet.length; ++i) {
            disjointSet[i] = i;
        }
        
        // 2. Sort
        for (int i = 0; i < costs.length-1; ++i) {
            for (int j = i+1; j < costs.length; ++j) {
                if (costs[i][2] > costs[j][2]) {
                    int[] temp = new int[3];
                    temp[0] = costs[i][0];
                    temp[1] = costs[i][1];
                    temp[2] = costs[i][2];
                    costs[i] = costs[j];
                    costs[j] = temp;
                }
            }
        }
        
        // 3.
        int start;
        int end;
        int cost;
        for (int i = 0; i < costs.length; ++i) {
            start = costs[i][0];
            end = costs[i][1];
            if (disjointSet[start] != disjointSet[end]) {
                if (disjointSet[start] > disjointSet[end])
                    disjointSet[start] = disjointSet[end];
                else
                    disjointSet[end] = disjointSet[start];
                totalCost += costs[i][2];
                connected.add(end);
            }
            if (connected.size() == n)
                return totalCost;
        }

        return totalCost;
    }
}
