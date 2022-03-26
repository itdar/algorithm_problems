package algorithm_sites.codility;

public class BinaryGap {

    public int solution(int N) {

        String binary = Integer.toBinaryString(N);

        int startIndex = -1;
        int max = 0;

        char digit;
        for (int i = 0; i < binary.length(); ++i) {
            digit = binary.charAt(i);

            if (digit == '1') {
                if (startIndex >= 0) {
                    max = Math.max(max, i - startIndex - 1);
                }
                startIndex = i;
            }

        }

        return max;
    }

}
