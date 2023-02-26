package algorithm_sites.leetcode2;

import java.util.HashSet;
import java.util.Set;

public class LC_00003_LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;

        int right = 0;

        Set<Character> set = new HashSet<>();

        while (right < s.length()) {
            if (set.contains(s.charAt(right))) {
                max = Math.max(max, set.size());

                set.clear();
                set.add(s.charAt(right));

                ++right;
                continue;
            }

            set.add(s.charAt(right));

            max = Math.max(max, set.size());

            ++right;
        }

        return max;
    }

}
