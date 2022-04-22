package algorithm_sites.leetcode2;

import java.util.ArrayDeque;
import java.util.Deque;

public class LC_00020_ValidParentheses {

    public boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque<>();

        char character;
        int index = 0;
        while (index < s.length()) {
            character = s.charAt(index++);

            if (deque.isEmpty()) {
                deque.addLast(character);
                continue;
            }

            Character popChar = deque.pollLast();
            if (!isOppositeParenthesis(popChar, character)) {
                deque.addLast(popChar);
                deque.addLast(character);
            }
        }

        return deque.isEmpty();
    }

    private boolean isOppositeParenthesis(Character popChar, char character) {
        if (popChar == '[') {
            return character == ']';
        }

        if (popChar == '{') {
            return character == '}';
        }

        if (popChar == '(') {
            return character == ')';
        }

        return false;
    }

}
