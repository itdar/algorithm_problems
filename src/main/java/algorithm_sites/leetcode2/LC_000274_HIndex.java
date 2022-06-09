package algorithm_sites.leetcode2;

import java.util.Arrays;

public class LC_000274_HIndex {

    public int hIndex(int[] citations) {
        if (citations.length == 1 && citations[0] > 1) {
            return 1;
        }

        int n = citations.length;

        int hIndex = 0;

        Arrays.sort(citations);


        return hIndex;
    }

    public int hIndex1(int[] citations) {
        int n = citations.length;

        int hIndex = 0;

        for (int current = 1; current <= n; ++current) {
            int count = 0;
            for (int j = 0; j < n; ++j) {
                if (current <= citations[j]) {
                    ++count;
                }
            }

            if (count >= current && current > hIndex) {
                hIndex = current;
            }
        }

        return hIndex;
    }

}
