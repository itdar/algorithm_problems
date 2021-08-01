package algorithm_sites.codility;

import java.util.*;

// Process
// 1. Input String
// 2. Iterate until 지울 것이 없을 때까지
//  2.1. Iterate all characters
//   2.1.3. Check A+B(B+A) / C+D(D+C)
//    2.1.3.1. Remove both
// 3. Return String remained

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // String result = solution.solution("ABBABABDABC");
        String result = solution.solution2("ABBABABDABC");

        System.out.println(result);
    }

    public String solution2(String inputString) {
        StringBuilder sb = new StringBuilder("");

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < inputString.length(); ++i) {
            if (!stack.isEmpty() &&
            ((inputString.charAt(i) == 'A' && stack.peek() == 'B')
            || (inputString.charAt(i) == 'B' && stack.peek() == 'A')
            || (inputString.charAt(i) == 'C' && stack.peek() == 'D')
            || (inputString.charAt(i) == 'D' && stack.peek() == 'C'))) {
                stack.pop();
            }
            else {
                stack.add(inputString.charAt(i));
            }
        }

        for (int i = 0; i < stack.size(); ++i) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }

    public String solution(String inputString) {
        StringBuilder sb = new StringBuilder(inputString);

        boolean hasNothingToDelete = false;
        boolean isDeleted;
        int deleteCount;
        while (!hasNothingToDelete) {
            deleteCount = 0;
            isDeleted = false;

            for (int i = 0; i < sb.length()-1; ++i) {
                if (removeAB(sb, i)) {
                    ++deleteCount;
                }

                if (removeBA(sb, i)) {
                    ++deleteCount;
                }

                if (removeCD(sb, i)) {
                    ++deleteCount;
                }

                if (removeDC(sb, i)) {
                    ++deleteCount;
                }
            }

            if (deleteCount < 1) {
                hasNothingToDelete = true;
            }
        }

        // System.out.println(sb.toString());

        return sb.toString();
    }

    private boolean removeAB(StringBuilder sb, int i) {
        if (i < sb.length()-1 && sb.charAt(i) == 'A') {
            if (sb.charAt(i+1) == 'B') {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                return true;
            }
        }
        return false;
    }

    private boolean removeBA(StringBuilder sb, int i) {
        if (i < sb.length()-1 && sb.charAt(i) == 'B') {
            if (sb.charAt(i+1) == 'A') {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                return true;
            }
        }
        return false;
    }

    private boolean removeCD(StringBuilder sb, int i) {
        if (i < sb.length()-1 && sb.charAt(i) == 'C') {
            if (sb.charAt(i+1) == 'D') {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                return true;
            }
        }
        return false;
    }

    private boolean removeDC(StringBuilder sb, int i) {
        if (i < sb.length()-1 && sb.charAt(i) == 'D') {
            if (sb.charAt(i+1) == 'C') {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                return true;
            }
        }
        return false;
    }

}

//
//==================================================
//
//
//        "CBA"
//        "AAB"
//        "BADADA"
//        "CABDA"
//        "AAAAAA"
//        "DDDDAAA"
//        "BBBCCC"
//        "AAABBB"
