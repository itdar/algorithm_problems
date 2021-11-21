package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode_1047_RemoveAllAdjacentDuplicatesInString {

    public String removeDuplicates(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); ++i) {
            if (!deque.isEmpty() && deque.peek() == s.charAt(i)) {
                deque.pop();
                continue;
            }

            deque.push(s.charAt(i));
        }

        StringBuffer sb = new StringBuffer();
        while (!deque.isEmpty()) {
            sb.append(deque.pollLast());
        }

        return sb.toString();
    }

}
