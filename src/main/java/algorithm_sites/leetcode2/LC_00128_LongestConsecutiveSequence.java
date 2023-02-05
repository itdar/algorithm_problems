package algorithm_sites.leetcode2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LC_00128_LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        List<Integer> sorted = set.stream()
            .sorted(Comparator.comparingInt(value -> value))
            .collect(Collectors.toList());

        int max = 1;
        int count = 1;
        int prev = Integer.MIN_VALUE;
        for (int i = 0; i < sorted.size(); ++i) {
            Integer num = sorted.get(i);

            if (prev + 1 == num) {
                ++count;
            } else {
                max = Math.max(max, count);
                count = 1;
            }

            if (i >= sorted.size()-1) {
                max = Math.max(max, count);
            }

            prev = num;
        }

        return max;
    }

}
