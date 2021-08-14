package codility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Dominator {
    public static int solution(int[] A) {
        if (A.length < 1) {
            return -1;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; ++i) {
            map.put(A[i], i);
        }

        Arrays.sort(A);

        int half = A.length/2;
        int candidate = A[half];

        int count = 0;
        for (int i = 0; i < A.length; ++i) {
            if (A[i] == candidate) {
                ++count;
            }
        }

        if (count <= half) {
            return -1;
        }

        return map.get(candidate);
    }

    public static void main(String args[]) {
        int result = solution(new int[]{3, 4, 3, 2, 3, -1, 3, 3});

        System.out.println(result);
    }

}
