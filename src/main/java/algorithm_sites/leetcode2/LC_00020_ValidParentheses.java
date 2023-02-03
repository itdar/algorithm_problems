package algorithm_sites.leetcode2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class LC_00020_ValidParentheses {

    public boolean isValid(String s) {
        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < s.length(); ++i) {
            char charAt = s.charAt(i);

            if (deque.isEmpty()) {
                deque.addLast(charAt);
                continue;
            }

            if (isPair(deque.peekLast(), charAt)) {
                deque.removeLast();
                continue;
            }

            deque.addLast(charAt);
        }

        return deque.isEmpty();
    }

    private boolean isPair(char char1, Character char2) {
        return (char1 == '(' && char2 == ')')
            || (char1 == '[' && char2 == ']')
            || (char1 == '{' && char2 == '}');
    }

}
