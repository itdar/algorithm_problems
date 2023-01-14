package algorithm_sites.programmers.kit202212;

public class Programmers_ExhaustiveSearch_06 {

    /**
     * wires 전체 순회하면서 하나씩 제거해서
     * 제거하는 wires 의 양쪽에서부터 시작해서 이어진 전체 노드의 개수를 센다.
     *      끊은 노드들은 다시 연결되지 않아야하고, 두 노드들의 합이 전체노드 수를 안넘으면서,
     *      절대값 차이가 최소인 것
     * 을 찾는다.
     */

    private int[][] plate;
    private boolean[] visited;

    public int solution(int n, int[][] wires) {
        int minDiff = Integer.MAX_VALUE;

        plate = new int[n][n];
        visited = new boolean[n];

        for (int i = 0; i < wires.length; ++i) {
           plate[wires[i][0]-1][wires[i][1]-1] = 1;
           plate[wires[i][1]-1][wires[i][0]-1] = 1;
        }

        for (int i = 0; i < wires.length; ++i) {
            int[] wire = wires[i];
            plate[wire[0]-1][wire[1]-1] = 0;
            plate[wire[1]-1][wire[0]-1] = 0;

            visited[wire[0]-1] = true;
            visited[wire[1]-1] = true;
            int firstCount = countConnectedNodes(wire[0]-1, 1);
            int secondCount = countConnectedNodes(wire[1]-1, 1);
            visited[wire[0]-1] = false;
            visited[wire[1]-1] = false;

            minDiff = Math.min(minDiff, Math.abs(firstCount-secondCount));

            plate[wire[0]-1][wire[1]-1] = 1;
            plate[wire[1]-1][wire[0]-1] = 1;
        }

        return minDiff;
    }

    private int countConnectedNodes(int index, int count) {
        for (int i = 0; i < plate[index].length; ++i) {
            if (!visited[i] && plate[index][i] == 1) {
                visited[i] = true;
                count = Math.max(count, countConnectedNodes(i, count+1));
                visited[i] = false;
            }
        }

        return count;
    }

}
