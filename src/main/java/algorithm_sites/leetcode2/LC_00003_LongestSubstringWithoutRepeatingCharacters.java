package algorithm_sites.leetcode2;

import java.util.ArrayList;
import java.util.List;

public class LC_00003_LongestSubstringWithoutRepeatingCharacters {

//    public int lengthOfLongestSubstring(String s) {
//        List<Character> substringL = new ArrayList<>();
//        int largestlength = 0;
//        for(int right = 0; right < s.length(); right++) {
//            if(substringL.contains(s.charAt(right))) {
//                // get the index of the char
//                int index = substringL.indexOf(s.charAt(right));
//                substringL.remove(index);
//                if(index > 0)
//                    substringL.subList(0, index).clear();
//            }
//            substringL.add(s.charAt(right));
//            largestlength = Math.max(largestlength, substringL.size());
//        }
//        return largestlength;
//    }

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
