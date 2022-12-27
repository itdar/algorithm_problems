package algorithm_sites.programmers.kit202212;

import java.util.Arrays;

public class Programmers_ExhaustiveSearch_01 {

    public int solution(int[][] sizes) {
        return Arrays.stream(sizes)
            .reduce((a, b) -> new int[]{
            Math.max(Math.max(a[0], a[1]), Math.max(b[0], b[1])), Math.max(Math.min(a[0], a[1]), Math.min(b[0], b[1]))
        }).map(it -> it[0] * it[1]).get();
    }

    public int solution2(int[][] sizes) {
        if (sizes == null || sizes.length == 0) {
            return 0;
        }

        boolean isWidthMax = true;
        int max = 0;
        for (int[] size : sizes) {
            if (max < size[0]) {
                isWidthMax = true;
                max = size[0];
            }
            if (max < size[1]) {
                isWidthMax = false;
                max = size[1];
            }
        }

        int maxOther = 0;
        for (int[] size : sizes) {
            if (isWidthMax) {
                if (size[0] >= size[1]) {
                    maxOther = Math.max(maxOther, size[1]);
                } else {
                    maxOther = Math.max(maxOther, size[0]);
                }
            } else {
                if (size[1] >= size[0]) {
                    maxOther = Math.max(maxOther, size[0]);
                } else {
                    maxOther = Math.max(maxOther, size[1]);
                }
            }
        }

        return max * maxOther;
    }

}
