package algorithm_sites.codility;

import java.util.Arrays;

public class Wwb_4_BugFixSmallestSameValue {

    int solution(int[] A, int[] B) {
        if (B == null || B.length == 0 || A == null || A.length == 0)
            return -1;
        int n = A.length;
        int m = B.length;;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n; k++) {
            if (i < m - 1 && B[i] < A[k])
                i += 1;
            if (A[k] == B[i])
                return A[k];
        }
        return -1;
    }

}
