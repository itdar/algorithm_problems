package algorithm_sites.codility;

public class BinaryGap {

    public static int solution(int N) {

        String binary = Integer.toBinaryString(N);

        int max = 0;
        int length = 0;
        for (int i = 0; i < binary.length(); ++i) {
            if (binary.charAt(i) == '1') {
                max = Math.max(max, length);
                length = 0;
            } else {
                ++length;
            }
        }

        return max;
    }

    public static void main(String args[]) {
        int answer = solution(529);
//        int answer = solution(1041);
//        int answer = solution(32);

        System.out.println(answer);
    }
}
