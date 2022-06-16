package algorithm_sites.codility;

import java.util.HashSet;
import java.util.Set;

public class Wwb_3_EfficientOppositePair {

    public int solution(int[] A) {
        int max = 0;

        Set<Integer> set = new HashSet<>();
        int current;
        for (int i = 0; i < A.length; ++i) {
            current = A[i];

            if (set.contains(-current)) {
                max = Math.max(max, Math.abs(current));
                continue;
            }

            set.add(current);
        }

        return max;
    }

}
