package algorithm_sites.programmers;

public class CoupTransProblem01 {

    public static int solution(int[][] office, int k) {
        int max = 0;

        for (int i = 0; i < office.length-k+1; ++i) {
            for (int j = 0; j < office[i].length-k+1; ++j) {

                int count = 0;
                for (int m = 0; m < k; ++m) {
                    for (int n = 0; n < k; ++n) {
                        if (office[i+m][j+n] == 1) {
                            ++count;
                        }
                    }
                }
                max = Math.max(max, count);

            }
        }

        return max;
    }

    public static void main(String args[]) {
        int result1 = solution(new int[][]{{1, 0, 0, 0}, {0, 0, 0, 1}, {0, 0, 1, 0}, {0, 1, 1, 0}}, 2);
        int result2 = solution(new int[][]{{1,0,0},{0,0,1},{1,0,0}}, 2);
        int result3 = solution(new int[][]{{1}}, 1);
        int result4 = solution(new int[][]{{1,1},{1,1}}, 2);

        System.out.println(result1 + " == 3");
        System.out.println(result2 + " == 1");
        System.out.println(result3 + " == 1");
        System.out.println(result4 + " == 4");
    }

}
