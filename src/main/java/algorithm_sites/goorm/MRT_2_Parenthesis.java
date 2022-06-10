package algorithm_sites.goorm;

import java.util.Stack;

public class MRT_2_Parenthesis {

    public boolean check(String string) {
        Stack<Character> stack = new Stack<>();

        if (string == null || string.isEmpty()) {
            return false; // 조건이 없음
        }


        for (int i = 0; i < string.length(); ++i) {
            char newChar = string.charAt(i);
            if (stack.isEmpty()) {
                stack.push(newChar);
                continue;
            }

            Character previous = stack.pop();
            if (!isPair(previous, newChar)) {
                stack.push(previous);
                stack.push(newChar);
            }
        }

        return stack.isEmpty();
    }

    private boolean isPair(Character prev, Character newOne) {
        if (prev.equals('{') && newOne.equals('}')) {
            return true;
        }

        if (prev.equals('(') && newOne.equals(')')) {
            return true;
        }

        if (prev.equals('[') && newOne.equals(']')) {
            return true;
        }

        return false;
    }



}
