package algo_lib;

public class RotationArray {

    public int[] rightRotation1D(int[] input, int k) {
        if (input == null || input.length <= 0)
            return input;

        final int length = input.length;
        k %= length;

        int index = length-k;

        int[] result = new int[length];
        for (int i = 0; i < length; ++i) {
            if (index >= length) {
                index -= length;
            }
            result[i] = input[index];

            ++index;
        }

        return result;
    }

    public int[][] rightRotation2D(int[][] mat, int k) {
        if (mat == null) return mat;

        for (int i = 0; i < k; ++i) {
            mat = rightRotation2D(mat);
        }

        return mat;
    }

    private int[][] rightRotation2D(int[][] mat) {
        final int M = mat.length;
        final int N = mat[0].length;
        int[][] rotatedMat = new int[N][M];
        for (int r = 0; r < M; r++) {
            for (int c = 0; c < N; c++) {
                rotatedMat[c][M-1-r] = mat[r][c];
            }
        }
        return rotatedMat;
    }

}
