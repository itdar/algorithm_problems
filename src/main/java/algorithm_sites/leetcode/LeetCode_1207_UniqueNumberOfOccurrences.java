package algorithm_sites.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode_1207_UniqueNumberOfOccurrences {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int integer : arr) {
            map.put(integer, map.getOrDefault(integer, 1) + 1);
        }

        Set<Integer> set = new HashSet<>();
        for (Integer value : map.values()) {
            if (set.contains(value)) {
                return false;
            }

            set.add(value);
        }

        return true;
    }

}
