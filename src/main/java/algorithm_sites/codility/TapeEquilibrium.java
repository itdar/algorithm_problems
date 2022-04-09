package algorithm_sites.codility;

public class TapeEquilibrium {

    public int solution(int[] A) {
        int[] sums = new int[A.length+1];
        for (int i = 0; i < A.length; ++i) {
            sums[i+1] = sums[i] + A[i];
        }

        int minDiff = Integer.MAX_VALUE;
        int firstPart;
        int secondPart;
        for (int i = 1; i < A.length; ++i) {
            firstPart = sums[i];
            secondPart = sums[sums.length-1] - sums[i];

            minDiff = Math.min(minDiff, Math.abs(firstPart-secondPart));
        }

        return minDiff;
    }

}
