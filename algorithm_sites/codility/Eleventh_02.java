package algorithm_sites.codility;

public class Eleventh_02 {

    public static boolean solution(int[] A, int K) {
        int n = A.length;
        if (n < K) return false;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] + 1 < A[i + 1])
                return false;
        }

        if (A[0] != 1 || A[n - 1] != K)
            return false;

        return true;
    }

    public static void main(String[] args) {
        boolean result1 = solution(new int[]{1, 1, 2, 3, 3}, 3);
        System.out.println("true == " + result1);

        boolean result2 = solution(new int[]{1, 1, 3, 3}, 3);
        System.out.println("false == " + result2);

        boolean result3 = solution(new int[]{1, 1, 1}, 2);
        System.out.println("false == " + result3);

        boolean result4 = solution(new int[]{1,2}, 3);
        System.out.println("false == " + result4);
    }

}
