package algorithm_sites.leetcode;

public class LeetCode_1572_MatrixDiagonalSum {

    public int diagonalSum(int[][] mat) {
        int length = mat.length;

        int sum = 0;
        int index = 0;
        for (int i = 0; i < length; ++i) {
            sum += mat[i][index];

            if (index == length - 1 - index) {
                ++index;
                continue;
            }

            sum += mat[i][length - 1 - index];

            ++index;
        }

        return sum;
    }

}
