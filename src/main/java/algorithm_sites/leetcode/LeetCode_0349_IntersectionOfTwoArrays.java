package algorithm_sites.leetcode;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class LeetCode_0349_IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> collect1 = Arrays.stream(nums1)
            .boxed()
            .collect(Collectors.toSet());

        Set<Integer> collect2 = Arrays.stream(nums2)
            .boxed()
            .collect(Collectors.toSet());

        int[] result = new int[1000];
        int i = 0;
        for (Integer integer : collect2) {
            if (collect1.contains(integer)) {
                result[i] = integer;
                ++i;
            }
        }

        return Arrays.copyOf(result, i);
    }
}
