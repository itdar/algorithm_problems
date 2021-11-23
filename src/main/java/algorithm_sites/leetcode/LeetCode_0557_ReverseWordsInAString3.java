package algorithm_sites.leetcode;

public class LeetCode_0557_ReverseWordsInAString3 {

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder buffer = new StringBuilder();

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == ' ') {
                sb.append(buffer.reverse());

                sb.append(' ');

                buffer = new StringBuilder();
                continue;
            }

            buffer.append(s.charAt(i));
        }
        sb.append(buffer.reverse());

        return sb.toString();
    }

}
