package algorithm_sites.leetcode2;

import java.util.ArrayList;
import java.util.List;

/**
 * dp, backtracking
 */
public class LC_00022_GenerateParentheses {

    private List<String> results = new ArrayList<>();

    public List<String> generateParenthesis(int n) {

        String currentString = "(";
        int closableCount = 1;
        dp(currentString, n-1, closableCount);

        return results;
    }

    private void dp(String currentString, int openableCount, int closableCount) {
        if (openableCount == 0 && closableCount == 0) {
            results.add(currentString);
            return;
        }

        if (openableCount > 0) {
            dp(currentString + "(", openableCount-1, closableCount+1);
        }

        if (closableCount > 0) {
            dp(currentString + ")", openableCount, closableCount-1);
        }
    }

}
