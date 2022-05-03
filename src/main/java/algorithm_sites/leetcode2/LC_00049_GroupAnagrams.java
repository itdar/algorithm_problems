package algorithm_sites.leetcode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC_00049_GroupAnagrams {

    private List<List<String>> groupAnagrams = new ArrayList<>();
    private Map<String, List<String>> map = new HashMap<>();

    public List<List<String>> groupAnagrams(String[] input) {
        String anaString;

        ArrayList<String> group;
        char[] anaChars;
        for (int j = 0; j < input.length; ++j) {
            anaString = input[j];
            anaChars = anaString.toCharArray();

            Arrays.sort(anaChars);
            String sortedStr = new String(anaChars);

            if (map.containsKey(sortedStr)) {
                map.get(sortedStr).add(anaString);
                continue;
            }

            group = new ArrayList<>();
            group.add(anaString);

            map.put(sortedStr, group);
        }

        groupAnagrams.addAll(new ArrayList<>(map.values()));
        return groupAnagrams;
    }

}
