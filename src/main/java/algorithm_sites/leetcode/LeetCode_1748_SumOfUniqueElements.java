package algorithm_sites.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_1748_SumOfUniqueElements {

    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            } else {
                map.put(num, 0);
            }
        }

        int sum = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) == 0) {
                sum += key;
            }
        }

        return sum;
    }

}
