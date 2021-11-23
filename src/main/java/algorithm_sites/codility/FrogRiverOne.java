package algorithm_sites.codility;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public static int solution(int X, int[] A) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < X; ++i) {
            set.add(i+1);
        }

        int time = 0;

        for (int i = 0; i < A.length; ++i) {
            ++time;
            if (set.contains(A[i])) {
                set.remove(A[i]);
                if (set.size() == 0) {
                    return time-1;
                }
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int result = solution(5, new int[]{1,3,1,4,2,3,5,4});

        System.out.println(result);
    }

}
