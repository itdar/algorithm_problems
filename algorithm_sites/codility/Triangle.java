package codility;

import java.util.Arrays;

public class Triangle {
    public static int solution(int[] A) {
        if (A.length < 3) {
            return 0;
        }

        Arrays.sort(A);

        for (int i = 0; i < A.length-2; ++i) {
            if (A[i] + A[i+1] > A[i+2]) {
                return 1;
            }
        }

        return 0;
    }

    public static void main(String args[]) {
        int result = solution(new int[]{10, 2, 5, 1, 8, 20});

        System.out.println(result);
    }
}
