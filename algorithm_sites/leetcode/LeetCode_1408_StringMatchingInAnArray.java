package algorithm_sites.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode_1408_StringMatchingInAnArray {

    public List<String> stringMatching(String[] words) {
        Set<String> result = new HashSet<>();

        for (String word : words) {
            for (String s : words) {
                if (!word.equals(s) && s.contains(word)) {
                    result.add(word);
                }
            }
        }

        return new ArrayList<>(result);
    }

}
