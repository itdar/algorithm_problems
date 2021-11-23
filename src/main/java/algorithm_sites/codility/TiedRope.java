package algorithm_sites.codility;

public class TiedRope {

    public static void main(String args[]) {
        System.out.println(solution(4, new int[] {1,2,3,4,1,1,3}));
    }

    public static int solution(int K, int[] A) {
        int totalCount = 0;

        int currentSum = 0;
        for (int i = 0; i < A.length; ++i) {
            currentSum += A[i];
            if (currentSum >= K) {
                currentSum = 0;
                ++totalCount;
            }
        }

        return totalCount;
    }

}

