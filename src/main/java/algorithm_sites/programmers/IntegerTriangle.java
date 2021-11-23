package algorithm_sites.programmers;

import java.util.Arrays;

public class IntegerTriangle {

    public static int solution(int[][] triangle) {
        if (triangle.length == 1) {
            return triangle[0][0];
        }

        int[] process = new int[triangle[triangle.length-1].length];
        int[] prev = new int[triangle[triangle.length-1].length];

        for (int i = 0; i < triangle.length; ++i) {

            for (int j = triangle[i].length-1; j >= 0; --j) {

                if (j > 0 && j < triangle[i].length-1) {
                    process[j] = Math.max(triangle[i][j] + prev[j], triangle[i][j] + prev[j-1]);
                } else if (j == 0) {
                    process[j] = triangle[i][j] + prev[j];
                } else if (j == triangle[i].length-1) {
                    process[j] = triangle[i][j] + prev[j-1];
                }
            }
            prev = process;
        }

        return Arrays.stream(process).max().getAsInt();
    }

    public static void main(String args[]) {
        int[][] triangle = new int[][] {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        int result = solution(triangle);

        System.out.println(result);
    }

}
