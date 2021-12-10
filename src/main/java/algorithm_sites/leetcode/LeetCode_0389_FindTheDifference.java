package algorithm_sites.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_0389_FindTheDifference {

    public char findTheDifference(String s, String t) {
        String longer = t;
        String shorter = s;

        List<Character> list = new ArrayList<>();
        for (int i = 0; i < longer.length(); ++i) {
            list.add(longer.charAt(i));
        }

        for (int i = 0; i < shorter.length(); ++i) {
            list.remove(new Character(shorter.charAt(i)));
        }

        return list.get(0);
    }
}
