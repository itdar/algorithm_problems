package algorithm_sites.leetcode;

public class LeetCode_0014_LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length < 2) {
            return strs[0];
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strs[0].length(); ++i) {
            char temp = strs[0].charAt(i);
            for (int j = 1; j < strs.length; ++j) {
                if (temp != strs[j].charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(temp);
        }

        return sb.toString();
    }

    public static void main(String args[]) {
        String result1 = longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        String result2 = longestCommonPrefix(new String[]{"dog", "racecar", "car"});

        System.out.println("fl == " + result1);
        System.out.println(" == " + result2);
    }

}
