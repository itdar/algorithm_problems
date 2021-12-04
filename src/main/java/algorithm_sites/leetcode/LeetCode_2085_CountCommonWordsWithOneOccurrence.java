package algorithm_sites.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode_2085_CountCommonWordsWithOneOccurrence {

    // Process
    // 1. Input 2 string arrays
    // 2. 한개 배열씩 반복한다.
    //  2.1. 중복안되는 것들의 배열을 각각 만든다.
    // 3. 중복안되는 것들의 배열 2개에서 서로 중복되는 개수를 센다.
    // 4. 개수 반환한다.
    public int countWords(String[] words1, String[] words2) {
        int result = 0;

        Set<String> repeated = new HashSet<>();
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        // 2.
        for (String word : words1) {
            if (repeated.contains(word)) {
                continue;
            }

            if (set1.contains(word)) {
                set1.remove(word);
                repeated.add(word);
                continue;
            }

            set1.add(word);
        }

        for (String word : words2) {
            if (repeated.contains(word)) {
                continue;
            }

            if (set2.contains(word)) {
                set2.remove(word);
                repeated.add(word);
                continue;
            }

            set2.add(word);
        }

        // 3.
        for (String string : set1) {
            if (set2.contains(string)) {
                ++result;
            }
        }

        return result;
    }

}
