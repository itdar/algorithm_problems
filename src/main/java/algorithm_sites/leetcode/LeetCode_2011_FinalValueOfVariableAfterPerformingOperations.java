package algorithm_sites.leetcode;

public class LeetCode_2011_FinalValueOfVariableAfterPerformingOperations {

    public int finalValueAfterOperations(String[] operations) {
        int result = 0;

        for (String operation : operations) {
            if (operation.startsWith("++")) {
                ++result;
                continue;
            }

            if (operation.startsWith("--")) {
                --result;
                continue;
            }

            if (operation.endsWith("++")) {
                result++;
                continue;
            }

            if (operation.endsWith("--")) {
                result--;
                continue;
            }
        }

        return result;
    }

}
