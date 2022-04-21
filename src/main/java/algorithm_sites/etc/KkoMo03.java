package algorithm_sites.etc;

public class KkoMo03 {

    private static final int DEFAULT_LENGTH = 2;

    public static int solution(int[] A) {
        if (A.length <= 2) {
            return A.length;
        }

        int maxLength = DEFAULT_LENGTH;
        int tempLength = DEFAULT_LENGTH;

        for (int i = 2; i < A.length; ++i) {
            if (A[i] == A[i-2]) {
                tempLength += 1;
            } else {
                tempLength = DEFAULT_LENGTH;
            }

            maxLength = Math.max(maxLength, tempLength);
        }

        return maxLength;
    }

}
