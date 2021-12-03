package algorithm_sites.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_2085_CountCommonWordsWithOneOccurrence {

    public int countWords(String[] words1, String[] words2) {
        int result = 0;


        Map<String, Integer> map = new HashMap<>();

        for (String word : words1) {
            map.put(word, map.getOrDefault(map, 1)+1);
        }

        return result;
    }

}
