package algorithm_sites.programmers.kit202212;

import java.util.Arrays;

public class Programmers_Sort_03 {

    public int solution(int[] citations) {
        if (citations == null || citations.length == 0) {
            return 0;
        }

//        for (int i = 0; i < citations.length; ++i) {
//            citations[i] *= -1;
//        }
        Arrays.sort(citations);
//        for (int i = 0; i < citations.length; ++i) {
//            citations[i] *= -1;
//        }

        for (int citation : citations) {
            System.out.print(citation + ",");
        }
        System.out.println();

        int maxH = 0;
        for (int h = 0; h < 10000; ++h) {
            for (int j = 0; j < citations.length; ++j) {
                if (h <= citations[j]) {
                    if (h <= citations.length - (j)) {
                        maxH = Math.max(maxH, h);
                    }
                }
            }
        }

        return maxH;
    }

}
