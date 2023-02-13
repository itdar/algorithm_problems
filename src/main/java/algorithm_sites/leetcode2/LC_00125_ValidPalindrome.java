package algorithm_sites.leetcode2;

public class LC_00125_ValidPalindrome {

    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                sb.append(s.charAt(i));
                continue;
            }

            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                sb.append(Character.toLowerCase(s.charAt(i)));
                continue;
            }

            if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        int max = sb.length()-1;
        for (int i = 0; i < sb.length() / 2; ++i) {
            if (sb.charAt(i) != sb.charAt(max-i)) {
                return false;
            }
        }

        return true;
    }

}
