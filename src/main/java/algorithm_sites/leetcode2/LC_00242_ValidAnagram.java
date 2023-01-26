package algorithm_sites.leetcode2;

import java.util.HashMap;
import java.util.Map;

public class LC_00242_ValidAnagram {

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                continue;
            }
            map.put(s.charAt(i), 1);
        }

        for (int i = 0; i < t.length(); ++i) {
            char c = t.charAt(i);
            if (!map.containsKey(c)) {
                return false;
            }

            Integer integer = map.get(c) - 1;

            map.put(c, integer);
        }

        for (Integer value : map.values()) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }

}
