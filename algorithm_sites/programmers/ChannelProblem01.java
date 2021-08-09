package algorithm_sites.programmers;

public class ChannelProblem01 {

    private static int count;

    public static int solution(int[][] locations) {
        int answer = 0;

        // make board
        int[][] board = new int[3][3];
        for (int i = 0; i < locations.length; ++i) {
            board[locations[i][0]-1][locations[i][1]-1] = 1;
        }

        if (board[1][1] == 1) return -1;

        int[] dx = {0, 0, -1, 1, 1, 1, -1, -1};
        int[] dy = {-1, 1, 0, 0, 1, -1, 1, -1};
        for (int i = 0; i < dx.length; ++i) {
            // 다음 위치
            int nx = 1 + dx[i];
            int ny = 1 + dy[i];

            if (board[nx][ny] == 1) {
                ++count;
            }
        }

        return count;
    }

    public static void main(String args[]) {
//        int result = solution(new int[][] {{1,3}, {3,1}});
        int result = solution(new int[][] {{2,2}, {1,3}});

        System.out.println(result);
    }

}
