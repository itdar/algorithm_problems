package algorithm_sites.programmers.kit202212;

import java.util.Arrays;

public class Programmers_DynamicProgramming_02 {

    public int solution(int[][] triangle) {
        if (triangle == null || triangle[0] == null || triangle[0].length == 0) {
            return 0;
        }

        for (int i = 1; i < triangle.length; ++i) {
            for (int j = 0; j < triangle[i].length; ++j) {
                if (j > 0 && j < triangle[i].length-1) {
                    triangle[i][j] = Math.max(triangle[i][j] + triangle[i-1][j-1], triangle[i][j] + triangle[i-1][j]);
                } else if (j <= 0) {
                    triangle[i][j] += triangle[i-1][j];
                } else if (j >= triangle[i].length-1) {
                    triangle[i][j] += triangle[i-1][j-1];
                }
            }
        }

        int max = 0;
        for (int number : triangle[triangle.length - 1]) {
            max = Math.max(max, number);
        }

        return max;
    }

}
