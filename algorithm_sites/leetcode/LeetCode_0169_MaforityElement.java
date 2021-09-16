package algorithm_sites.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LeetCode_0169_MaforityElement {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int max = Integer.MIN_VALUE;
        int result = 0;

        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            Integer value = map.get(key);

            if (value > max) {
                max = value;
                result = key;
            }
        }

        return result;
    }

}
