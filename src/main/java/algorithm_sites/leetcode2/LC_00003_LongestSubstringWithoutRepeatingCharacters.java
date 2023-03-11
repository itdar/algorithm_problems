package algorithm_sites.leetcode2;

import java.util.ArrayList;
import java.util.List;

public class LC_00003_LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;

        int right = 0;
        List<Character> list = new ArrayList<>();
        while (right < s.length()) {
            if (list.contains(s.charAt(right))) {
                int index = list.indexOf(s.charAt(right));
                list.remove(index);
                if(index > 0)
                    list.subList(0, index).clear();
            }

            list.add(s.charAt(right));
            ++right;
            max = Math.max(max, list.size());
        }

        return max;
    }

}
