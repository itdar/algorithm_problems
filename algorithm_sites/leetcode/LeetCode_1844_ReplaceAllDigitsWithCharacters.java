package algorithm_sites.leetcode;

public class LeetCode_1844_ReplaceAllDigitsWithCharacters {

    public String replaceDigits(String s) {
        if (s.length() == 1) {
            return s;
        }

        StringBuilder sb = new StringBuilder();

        char buffer = ' ';
        for (int i = 0; i < s.length(); ++i) {
            // odd
            if (i % 2 == 0 || i == 0) {
                buffer = s.charAt(i);
                sb.append(buffer);
                continue;
            }

            // even
            sb.append((char)((int)buffer + Character.getNumericValue(s.charAt(i))));
        }

        return sb.toString();
    }

}
