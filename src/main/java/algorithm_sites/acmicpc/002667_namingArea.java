package algorithm_sites.acmicpc;

import java.util.*;
import java.io.*;

class NamingArea {

    // Process
    // 1. Input N and NxN array
    // 2. 맵배열 준비한다. 방문여부맵 준비한다.
    // 3. 맵 배열의 전체 반복한다.
    //  3.1. 방문가능하면서, 방문하지 않은 곳이면 단지의 시작이다. (BFS 큐에 넣는다)
    //  3.2. BFS 큐가 빌 때까지 반복한다.
    //   3.2.1. (BFS) 방문가능한 방향 전체로 방문해나가며 단지를 늘려나간다.
    //   3.2.2. 단지의 번호를 맞춘다.
    //  3.3. 다음 단지 번호로 넘어간다.
    //  3.4. 단지 내부 개수를 저장해둔다.
    // 4. 전체 단지의 개수, 각 단지 내부 개수를 오름차순 출력한다.

    public static void main(String args[]) throws IOException {

        // 1.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        int n = Integer.parseInt(br.readLine());

        // 2.
        int[][] map = new int[n][n];
        boolean[][] movable = new boolean[n][n];
        
        for (int i = 0; i < n; ++i) {
            String line = br.readLine();
            for (int j = 0; j < line.length(); ++j) {
                if (line.charAt(j) == '1') {
                    map[i][j] = 0;
                    movable[i][j] = true;
                } else if (line.charAt(j) == '0') {
                    map[i][j] = 0;
                    movable[i][j] = false;
                }
            }
        }

        // 3.
        Map<Integer, Integer> resultMap = new HashMap<>();
        int numbering = 0;
        Queue<Pair> queue;
        for (int i = 0; i < movable.length; ++i) {
            for (int j = 0; j < movable[i].length; ++j) {
                if (movable[i][j]) {
                    resultMap.put(++numbering, 0);

                    queue = new LinkedList<>();
                    queue.add(new Pair(i,j));
                    while (queue.size() > 0) {
                        Pair pair = queue.poll();
                        if (movable[pair.row][pair.col]) {
                            movable[pair.row][pair.col] = false;

                            map[pair.row][pair.col] = numbering;
                            resultMap.put(numbering, resultMap.get(numbering) + 1);

                            if (pair.row - 1 >= 0 && movable[pair.row - 1][pair.col])
                                queue.add(new Pair(pair.row - 1, pair.col));
                            if (pair.row + 1 < n && movable[pair.row + 1][pair.col])
                                queue.add(new Pair(pair.row + 1, pair.col));
                            if (pair.col - 1 >= 0 && movable[pair.row][pair.col - 1])
                                queue.add(new Pair(pair.row, pair.col - 1));
                            if (pair.col + 1 < n && movable[pair.row][pair.col + 1])
                                queue.add(new Pair(pair.row, pair.col + 1));
                        }
                    }
                }
            }
        }

        System.out.println(resultMap.size());

        List<Integer> listForPrint = new LinkedList<>();
        for (Integer value : resultMap.values()) {
            listForPrint.add(value);
        }
        Collections.sort(listForPrint);
        for (Integer value : listForPrint) {
            System.out.println(value);
        }

    }
    
}

class Pair {
    int row;
    int col;
    public Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}