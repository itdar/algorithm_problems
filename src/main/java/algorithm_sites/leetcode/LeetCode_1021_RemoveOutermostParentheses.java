package algorithm_sites.leetcode;

import java.util.Stack;

public class LeetCode_1021_RemoveOutermostParentheses {

    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        StringBuilder result = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            sb.append(s.charAt(i));

            if (stack.size() == 1 && s.charAt(i) == ')') {
                result.append(sb.substring(1, sb.length() - 1));
                sb = new StringBuilder();
                stack.clear();
                continue;
            }

            if (s.charAt(i) == ')' && (!stack.isEmpty() && stack.peek() == '(')) {
                stack.pop();
                continue;
            }

            stack.add(s.charAt(i));
        }

        return result.toString();
    }

}
