package algorithm_sites.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode_1704_DetermineIfStringHalvesAreAlike {

    public boolean halvesAreAlike(String s) {
        int countA = 0;
        int countB = 0;

        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        int i = 0;
        while (i < s.length() / 2) {
            if (set.contains(s.charAt(i))) {
                ++countA;
            }
            ++i;
        }

        while (i < s.length()) {
            if (set.contains(s.charAt(i))) {
                ++countB;
            }
            ++i;
        }

        return (countA == countB);
    }

}
