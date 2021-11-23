package algo_lib;

public class DirectionVector {
    public static void main(String args[]) {
        rotate_4_direction(3,4);
    }

    public static void rotate_4_direction(int x, int y) {
        // 동 북 서 남
        int[] dx = {0, -1, 0, 1};
        int[] dy = {0, -1, 0, 1};

        /**
         * 추가로,
         * L R U D
         * int[] dx = {0, 0, -1, 1};
         * int[] dy = {-1, 1, 0, 0};
         */

        for (int i = 0; i < 4; ++i) {
            // 다음 위치
            int nx = x + dx[i];
            int ny = y + dy[i];

            System.out.println(nx + " " + ny);
        }
    }
}
