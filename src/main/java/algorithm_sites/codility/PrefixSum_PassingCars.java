package algorithm_sites.codility;

public class PrefixSum_PassingCars {

    public int solution(int[] A) {

        int[] prefixSum = prefixSum(A);

        int sum = 0;
        for (int i = 0; i < A.length; ++i) {
            if (A[i] == 0) {
                sum += prefixSum[A.length] - prefixSum[i];

                if (sum > 1000000000) {
                    return -1;
                }
            }
        }

        return sum;
    }

    private int[] prefixSum(int[] A) {
        int[] prefSum = new int[A.length + 1];

        for (int i = 1; i <= A.length; ++i) {
            prefSum[i] = prefSum[i-1] + A[i-1];
        }

        return prefSum;
    }

}
