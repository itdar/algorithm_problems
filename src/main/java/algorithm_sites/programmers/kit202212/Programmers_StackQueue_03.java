package algorithm_sites.programmers.kit202212;

import java.util.Deque;
import java.util.LinkedList;

public class Programmers_StackQueue_03 {

    boolean solution(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        if (s.charAt(0) == ')' || s.length() % 2 != 0) {
            return false;
        }

        Deque<Character> deque = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            if (deque.isEmpty()) {
                deque.offerLast(ch);
                continue;
            }

            Character popped = deque.pollLast();
            if (popped == '(' && ch == ')') {
                continue;
            }

            deque.offerLast(popped);
            deque.offerLast(ch);
        }

        return deque.isEmpty();
    }

}
