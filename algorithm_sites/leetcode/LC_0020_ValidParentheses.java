package algorithm_sites.leetcode;

import java.util.Stack;

public class LC_0020_ValidParentheses {

    public static boolean isValid_1(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (!stack.isEmpty() && check(stack.peek(), c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

    private static boolean check(char peek, char c) {
        if (peek == '(' && c == ')') {
            return true;
        }
        if (peek == '[' && c == ']') {
            return true;
        }
        if (peek == '{' && c == '}') {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        boolean valid = isValid_1("()");

        System.out.println(valid);
    }

}
