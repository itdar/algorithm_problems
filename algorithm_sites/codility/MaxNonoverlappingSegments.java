package algorithm_sites.codility;

public class MaxNonoverlappingSegments {

    public static void main(String args[]) {
        int count = solution(new int[] {1, 3, 7, 9, 9, 10}, new int[] {5, 6, 8, 9, 10, 10});

        System.out.println(count);
    }

    public static int solution(int[] A, int[] B) {
        if (A.length < 1) {
            return 0;
        }

        if (A.length < 2) {
            return 1;
        }

        int end = B[0];
        int count = 1;
        for (int i = 1; i < A.length; ++i) {
            if (end < A[i]) {
                ++count;
                end = B[i]; // greedy (O)
            }
            // non greedy (X)
        }

        return count;
    }

}
