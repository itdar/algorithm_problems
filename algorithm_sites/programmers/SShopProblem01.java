package algorithm_sites.programmers;

public class SShopProblem01 {

    public static int solution(int[] estimates, int k) {
        int max = 0;

        int sum;
        for (int i = 0; i < estimates.length+1 - k; ++i) {
            sum = 0;
            for (int j = i; j < i+k; ++j) {
                sum += estimates[j];
            }
            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }

    public static void main(String args[]) {
//        int result = solution(new int[] {5,1,9,8,10,5}, 3);
        int result = solution(new int[] {10,1,10,1,1,4,3,10}, 6);

        System.out.println(result);
    }
}
