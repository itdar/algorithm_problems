package algorithm_sites.codility;

public class TapeEquilibrium {

    public static int solution(int[] A) {
        int frontSum = A[0];
        int rearSum = 0;
        for (int i = 1; i < A.length; ++i) {
            rearSum += A[i];
        }

        int minDiff = Math.abs(frontSum - rearSum);

        if (A.length <= 2) {
            return minDiff;
        }

        // point: (1~ length-1)
        for (int i = 1; i < A.length-1; ++i) {
//            System.out.println(frontSum + " " + rearSum + " " + minDiff);

            frontSum += A[i];
            rearSum -= A[i];

            minDiff = Math.min(minDiff, Math.abs(frontSum - rearSum));
        }

        return minDiff;
    }

    public static void main(String args[]) {
//        int result = solution(new int[] {3,1,2,4,3});
//        int result = solution(new int[] {3,1,5});
        int result = solution(new int[] {-10, -20, -30, -40, 100});

        System.out.println(result);
    }
}
