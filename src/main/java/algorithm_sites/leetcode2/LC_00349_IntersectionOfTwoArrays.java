package algorithm_sites.leetcode2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LC_00349_IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < nums1.length; ++i) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; ++i) {
            set2.add(nums2[i]);
        }

        List<Integer> list = new LinkedList<>();
        for (Integer integer : set1) {
            if (set2.contains(integer)) {
                list.add(integer);
            }
        }

        int[] results = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            results[i] = list.get(i);
        }

        return results;

//        return list.stream()
//            .mapToInt(Integer::intValue)
//            .toArray();
    }

}
