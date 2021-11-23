package algorithm_sites.codility;

import java.util.Stack;

public class Bracket {
    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); ++i) {
            if (stack.size() > 0 && (
            (stack.peek() == '(' && s.charAt(i) == ')')
            || (stack.peek() == '{' && s.charAt(i) == '}')
            || (stack.peek() == '[' && s.charAt(i) == ']'))) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        return (stack.size() == 0) ? 1 : 0;
    }

    public static void main(String args[]) {
        int result = solution("({[]})");
//        int result = solution("([)()]");

        System.out.println("result: " + result);
    }
}
