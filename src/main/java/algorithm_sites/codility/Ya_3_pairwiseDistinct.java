package algorithm_sites.codility;

import java.util.Arrays;

public class Ya_3_pairwiseDistinct {

    public int solution(int[] A) {
        int sum = 0;
        int n = A.length;

        Arrays.sort(A);

        int currentComparison = n;
        for (int i = n-1; i >= 0; --i) {
            sum += Math.abs(A[i] - currentComparison);
            --currentComparison;

            if (sum > 1_000_000_000) {
                return -1;
            }
        }

        return sum;
    }

}
