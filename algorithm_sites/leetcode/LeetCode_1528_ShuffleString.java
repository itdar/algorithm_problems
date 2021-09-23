package algorithm_sites.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_1528_ShuffleString {

    public String restoreString(String s, int[] indices) {
        Map<Integer, Character> map = new HashMap<>();
        int idx = 0;
        for (int index : indices) {
            map.put(index, s.charAt(idx++));
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indices.length; ++i) {
            sb.append(map.get(i));
        }

        return sb.toString();
    }

}
