package algorithm_sites.leetcode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LC_00049_GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] input) {
        List<List<String>> results = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String origin : input) {
            char[] chars = origin.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if (!map.containsKey(sorted)) {
                ArrayList<String> strings = new ArrayList<>();
                strings.add(origin);
                map.put(sorted, strings);
                continue;
            }

            List<String> strings = map.get(sorted);
            strings.add(origin);
        }

        for (List<String> value : map.values()) {
            results.add(value);
        }

        return results;
    }

}
