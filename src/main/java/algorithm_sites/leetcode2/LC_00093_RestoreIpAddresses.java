package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class LC_00093_RestoreIpAddresses {

    private List<String> results = new ArrayList<>();
    private StringBuilder sb = new StringBuilder();

    public List<String> restoreIpAddresses(String s) {
        if (s == null || s.isEmpty() || s.length() > 12) {
            return Arrays.asList();
        }

        System.out.println("input: " + s);

        backtracking(0, 0, s);

        return results;
    }

    private void backtracking(int i, int dotCount, String s) {
        if (dotCount > 4) {
            return;
        }

        if (dotCount == 4 && i == s.length()-1) {
            results.add(sb.substring(0, sb.length()-1));
            sb.delete(0, sb.length());
        }

        for (int j = i+1; j < Math.min(i+3, s.length()); ++j) {
            if (Integer.parseInt(s.substring(i, j)) < 256
                && (i == j || s.charAt(i) != '0'))
            {
                sb.append(s, i, j+1).append(".");
                backtracking(j + 1, dotCount + 1, s);
            }
        }
    }

}
