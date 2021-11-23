package algorithm_sites.codility;

public class MaxProfit {

    public static int solution(int[] A) {
        if (A.length < 2) return 0;

        int[] profits = new int[A.length];
        profits[0] = 0;
        for (int i = 1; i < A.length; ++i) {
            profits[i] = A[i] - A[i-1];
        }

//        for (int i = 0; i < profits.length; ++i) {
//            System.out.print(profits[i] + " ");
//        } System.out.println("");

        long maxProfit = Integer.MIN_VALUE;
        long maxEnd = Integer.MIN_VALUE;

        for (int i = 0; i < profits.length; ++i) {
            maxEnd = Math.max(profits[i], maxEnd + profits[i]);
            maxProfit = Math.max(maxProfit, maxEnd);
        }

        return (int)maxProfit;
    }

    public static int solutionKadane(int[] A) {
        if (A.length == 0) return 0;
        if (A.length == 1) return A[0];

        int[] profits = new int[A.length];
        profits[0] = 0;
        for (int i = 1; i < A.length; ++i) {
            profits[i] = A[i] - A[i-1];
        }

        long maxSlice = Integer.MIN_VALUE;
        long maxEnd = Integer.MIN_VALUE;

        for (int i = 1; i < profits.length; ++i) {
            maxEnd = Math.max(profits[i], maxEnd + profits[i]);
            maxSlice = Math.max(maxSlice, maxEnd);
        }

        return (int)maxSlice;
    }

    public static void main(String args[]) {
        int result1 = solution(new int[]{23171, 21011, 21123, 21366, 21013, 21367});
        int result2 = solutionKadane(new int[]{23171, 21011, 21123, 21366, 21013, 21367});

        System.out.println(result1);
        System.out.println(result2);
    }

}
