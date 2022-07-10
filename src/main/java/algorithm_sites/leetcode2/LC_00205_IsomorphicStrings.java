package algorithm_sites.leetcode2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LC_00205_IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapper1 = new HashMap<>();
        Map<Character, Character> mapper2 = new HashMap<>();

        for (int i = 0; i < s.length(); ++i) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (!mapper1.containsKey(c1) && !mapper2.containsKey(c2)) {
                mapper1.put(c1, c2);
                mapper2.put(c2, c1);
                continue;
            }

            if (mapper1.containsKey(c1) && mapper1.get(c1).equals(c2)) {
                continue;
            }

            if (mapper2.containsKey(c2) && mapper2.get(c2).equals(c1)) {
                continue;
            }

            return false;
        }

        return true;
    }

    public boolean isIsomorphic2(String s, String t) {
        Map<Character, List<Integer>> mapS = new LinkedHashMap<>();
        Map<Character, List<Integer>> mapT = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            char c1 = t.charAt(i);

            List<Integer> integers1 = mapS.getOrDefault(c, new ArrayList<>());
            integers1.add(i);
            mapS.put(c, integers1);

            List<Integer> integers2 = mapT.getOrDefault(c1, new ArrayList<>());
            integers2.add(i);
            mapT.put(c1, integers2);
        }

        List<List<Integer>> list1 = new ArrayList<>(mapS.values());
        List<List<Integer>> list2 = new ArrayList<>(mapT.values());

        if (list1.size() != list2.size()) {
            return false;
        }

        for (int i = 0; i < list1.size(); ++i) {
            if (list1.get(i).size() != list2.get(i).size()) {
                return false;
            }

            for (int j = 0; j < list1.get(i).size(); ++j) {
                if (!list1.get(i).get(j).equals(list2.get(i).get(j))) {
                    return false;
                }
            }
        }

        return true;
    }

}
