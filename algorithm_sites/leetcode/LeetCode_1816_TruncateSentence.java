package algorithm_sites.leetcode;

public class LeetCode_1816_TruncateSentence {

    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); ++i) {

            if (s.charAt(i) == ' ' || s.charAt(i) == '\r') {
                --k;
            }

            if (k <= 0) {
                break;
            }

            sb.append(s.charAt(i));
        }

        return sb.toString();
    }

}
