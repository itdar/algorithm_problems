package algorithm_sites.codility;

public class MaxSlice {

    public static int solutionKadane(int[] A) {
        if (A.length == 0) return 0;
        if (A.length == 1) return A[0];

        long maxSlice = Integer.MIN_VALUE;
        long maxEnd = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; ++i) {
            maxEnd = Math.max(A[i], maxEnd + A[i]);
            maxSlice = Math.max(maxSlice, maxEnd);
        }

        return (int)maxSlice;
    }

    public static int solutionPrefixSum(int[] A) {
        if (A.length == 0) return 0;
        if (A.length == 1) return A[0];

        int length = A.length;
        int max = Integer.MIN_VALUE;

        int[] pref = new int[length+1];
        for (int i = 1; i < pref.length; ++i) {
            pref[i] = pref[i-1] + A[i-1];
        }

//        // 전체 (1개~ n개 묶어서 전체 확인)
//        for (int i = 0; i < length; ++i) {
//            for (int j = i; j < length; ++j) {
//                max = Math.max(max, pref[j+1] - pref[i]);
//            }
//        }

        // num개씩만 묶어서 확인
        int num = 6;
        for (int i = 0; i < length-num+1; ++i) {
//            for (int j = i; j < i+num; ++j)
            int j = i+num-1;
            System.out.println(j);
            {
                max = Math.max(max, pref[j+1] - pref[i]);
            }
        }

        return max;
    }

    public static int solutionBruteForce(int[] A) {
        int length = A.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < length; ++i) {      // 시작점
            for (int j = i; j < length; ++j) {      // 더할 개수
//                System.out.print(j + " ");
                int sum = 0;
                for (int k = i; k < j+1; ++k) {         // 더한다.
                    sum += A[k];
                }
                max = Math.max(max, sum);
            }
//            System.out.println("");
        }

        return max;
    }

    public static void main(String args[]) {
//        int[] A = new int[] {5,-7, 3, 5, -2, 4, -1};
//        int[] A = new int[] {3,2,-6,4,0};
//        int[] A = new int[] {-2,-2};
//        int[] A = new int[] {3,-2};
//        int[] A = new int[] {5,1,9,8,10,5};
        int[] A = new int[] {10,1,10,1,1,4,3,10};

//        int maxSum1 = solutionBruteForce(A);
        int maxSum2 = solutionPrefixSum(A);
//        int maxSum3 = solutionKadane(A);

//        System.out.println(maxSum1);
        System.out.println(maxSum2);
//        System.out.println(maxSum3);
    }

}
