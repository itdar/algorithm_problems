package codility;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {
    public static int solution(int[] A) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; ++i) {
            set.add(i+1);
        }

        for (int i = 0; i < A.length; ++i) {
            if (set.contains(A[i])) {
                set.remove(A[i]);
            }
        }

        if (set.size() == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String args[]) {
//        int result = solution(new int[]{4, 1, 3, 2});
        int result = solution(new int[]{4, 1, 3});

        System.out.println(result);
    }
}
