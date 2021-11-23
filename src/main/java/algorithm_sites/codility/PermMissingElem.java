package algorithm_sites.codility;

import java.util.HashSet;
import java.util.Set;

public class PermMissingElem {
    public static int solution(int[] A) {
        if (A.length == 0) {
            return 1;
        }

        Set<Integer> set = new HashSet<>();

        for (int i = 1; i <= A.length+1; ++i) {
            set.add(i);
        }

        for (int i = 0; i < A.length; ++i) {
            if (set.contains(A[i])) {
                set.remove(A[i]);
            }
        }

        return set.iterator().next();
    }

    public static void main(String args[]) {
//        int result = solution(new int[]{2, 3, 1, 5});
        int result = solution(new int[]{2,3,4});

        System.out.println(result);
    }

}
