package algorithm_sites.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode_1380_LuckyNumbersInAMatrix {

    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> numbers = new ArrayList<>();

        Set<Integer> minsInRows = new HashSet<>();
        for (int i = 0; i < matrix.length; ++i) {
            int min = 1000000;
            for (int j = 0; j < matrix[i].length; ++j) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            minsInRows.add(min);
        }

        for (int i = 0; i < matrix[0].length; ++i) {
            int max = 0;
            for (int j = 0; j < matrix.length; ++j) {
                if (matrix[j][i] > max) {
                    max = matrix[j][i];
                }
            }

            if (minsInRows.contains(max)) {
                numbers.add(max);
            }
        }

        return numbers;
    }

}
