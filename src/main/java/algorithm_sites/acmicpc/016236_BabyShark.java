package algorithm_sites.acmicpc;

import java.io.*;
import java.util.*;

// Process
// 1. Input n of nxn, nxn matrix
// 2. 먹을 수 있는 물고기가 있으면 반복한다.
//  2.1. 먹을 수 있는 물고기 중, 가장 가깝고, 맨 위의 왼쪽에 있는 물고기와의 거리를 센다.
//  2.2. 해당 위치로 상어를 이동시킨다.
//  2.3. 총 거리에 센 거리를 더한다.
//  2.4. 사이즈업까지 남은 고기수를 줄인다.
//  2.5. 빈칸으로 만든다.
// 3. 총 거리를 반환한다.

class BabyShark {
    static List<Space> eatable;
    
    public static void main(String[] args) throws IOException {
        // 1.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Space[][] spaces = new Space[n][n];
        Shark shark = null;
        for (int i = 0; i < n; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; ++j) {
                int number = Integer.parseInt(tokenizer.nextToken());
                if (number == 9) {
                    shark = new Shark(i, j);
                }
                spaces[i][j] = new Space(i, j, number);
            }
        }

        int totalMove = 0;

        // 2.
        while (findEatableSpaces(spaces, shark).size() > 0) {
            Space dst = getNearestTopmostLeftmostSpace(eatable, shark);

            // System.out.println("Dst: " + dst.x + " " + dst.y + " / depth: " + dst.depth);
            
            totalMove += dst.depth;
            shark.moveTo(dst.x, dst.y);
            shark.eat();
            dst.fishSize = 0;

            resetSpaces(spaces);
        }

        // 3.
        System.out.println(totalMove);
    }

    public static List<Space> findEatableSpaces(Space[][] spaces, Shark shark) {
        eatable = new ArrayList<>();
        int n = spaces.length;

        Space start = spaces[shark.x][shark.y];
        start.isVisited = true;
        start.fishSize = 0;
        Queue<Space> queue = new LinkedList<>();
        queue.add(start);
        while (queue.size() > 0) {
            Space temp = queue.poll();

            if (temp.fishSize < shark.size && temp.fishSize > 0) {
                eatable.add(temp);
            }

            if (temp.x > 0 && !spaces[temp.x-1][temp.y].isVisited && spaces[temp.x-1][temp.y].fishSize <= shark.size) {
                queue.add(spaces[temp.x-1][temp.y]);
                spaces[temp.x-1][temp.y].isVisited = true;
                spaces[temp.x-1][temp.y].depth = temp.depth+1;
            } 
            if (temp.x < n-1 && !spaces[temp.x+1][temp.y].isVisited && spaces[temp.x+1][temp.y].fishSize <= shark.size) {
                queue.add(spaces[temp.x+1][temp.y]);
                spaces[temp.x+1][temp.y].isVisited = true;
                spaces[temp.x+1][temp.y].depth = temp.depth+1;
            }
            if (temp.y > 0 && !spaces[temp.x][temp.y-1].isVisited && spaces[temp.x][temp.y-1].fishSize <= shark.size) {
                queue.add(spaces[temp.x][temp.y-1]);
                spaces[temp.x][temp.y-1].isVisited = true;
                spaces[temp.x][temp.y-1].depth = temp.depth+1;
            }
            if (temp.y < n-1 && !spaces[temp.x][temp.y+1].isVisited && spaces[temp.x][temp.y+1].fishSize <= shark.size) {
                queue.add(spaces[temp.x][temp.y+1]);
                spaces[temp.x][temp.y+1].isVisited = true;
                spaces[temp.x][temp.y+1].depth = temp.depth+1;
            }
        }

        return eatable;
    }

    public static Space getNearestTopmostLeftmostSpace(List<Space> eatable, Shark shark) {

        Collections.sort(eatable);

        return eatable.get(0);
    }

    public static void resetSpaces(Space[][] spaces) {
        for (int i = 0; i < spaces.length; ++i) {
            for (int j = 0; j < spaces[i].length; ++j) {
                spaces[i][j].isVisited = false;
                spaces[i][j].depth = 0;
            }
        }
    }

}

class Space implements Comparable<Space> {
    int x;
    int y;
    boolean isVisited;
    int fishSize;
    int depth;

    public Space(int x, int y, int fishSize) {
        this.x = x;
        this.y = y;
        this.fishSize = fishSize;
        this.isVisited = false;
        this.depth = 0;
    }

    @Override
    public int compareTo(Space o) {
        if (this.depth > o.depth) {
            return 1;
        } else if (this.depth == o.depth) {
            if (this.x > o.x) {
                return 1;
            } else if (this.x == o.x) {
                if (this.y > o.y) {
                    return 1;
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
}

class Shark {
    int x;
    int y;
    int size;
    int remainedNextSize;

    public Shark(int x, int y) {
        this.x = x;
        this.y = y;
        this.size = 2;
        this.remainedNextSize = 2;
    }

    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void eat() {
        --remainedNextSize;
        if (remainedNextSize == 0) {
            ++size;
            remainedNextSize = size;
        }
    }

    public int getSize() {
        return size;
    }
}