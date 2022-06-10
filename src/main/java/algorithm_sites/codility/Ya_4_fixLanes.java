package algorithm_sites.codility;

import java.util.Arrays;

public class Ya_4_fixLanes {

    public int solution(String L1, String L2) {
        int n = L1.length();

        int[] first = new int[n];
        int[] second = new int[n];
        for (int i = 0; i < n; ++i) {
            first[i] = (L1.charAt(i) == 'x') ? 1 : 0;
            second[i] = (L2.charAt(i) == 'x') ? 1 : 0;
        }

        boolean debug = false;

        if (debug) {
            for (int fir : first) {
                System.out.print(fir + " ");
            }
            System.out.println();
            for (int sec : second) {
                System.out.print(sec + " ");
            }
            System.out.println("\n");
        }

        int max = Math.max(kadane(first), kadane(second));

        for (int mid = 0; mid < n; ++mid) {
            int[] firstCopy = Arrays.copyOfRange(first, 0, mid);
            int[] secondCopy = Arrays.copyOfRange(second, mid+1, n);

            max = Math.max(max, kadane(firstCopy) + kadane(secondCopy));

            if (debug) {
                for (int fir : firstCopy) {
                    System.out.print(fir + " ");
                }
                System.out.print("\t");
                for (int sec : secondCopy) {
                    System.out.print(sec + " ");
                }
                System.out.println("\t\t max: " + max + "\n");
            }

            secondCopy = Arrays.copyOfRange(second, 0, mid);
            firstCopy = Arrays.copyOfRange(first, mid+1, n);

            max = Math.max(max, kadane(firstCopy) + kadane(secondCopy));

            if (debug) {
                for (int fir : firstCopy) {
                    System.out.print(fir + " ");
                }
                System.out.print("\t");
                for (int sec : secondCopy) {
                    System.out.print(sec + " ");
                }
                System.out.println("\t\t max: " + max + "\n");
            }
        }

        return max;
    }

    public static int kadane(int[] A) {
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

}
