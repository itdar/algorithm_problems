package algorithm_sites.codility;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {
    public static int solution(int[] A) {

        if (A.length == 1) {
            return A[0];
        }

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; ++i) {
            if (!set.contains(A[i])) {
                set.add(A[i]);
            } else {
                set.remove(A[i]);
            }
        }

        return set.iterator().next();
    }

    public static void main(String args[]) {
        int answer = solution(new int[] {9,3,9,3,9,7,9});

        System.out.println(answer);
    }

}
