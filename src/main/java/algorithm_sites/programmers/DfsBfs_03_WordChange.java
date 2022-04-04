package algorithm_sites.programmers;

import java.util.Arrays;

public class DfsBfs_03_WordChange {

    private int minCount = Integer.MAX_VALUE;

    public int solution(String begin, String target, String[] words) {
        boolean noneMatch = Arrays.stream(words).noneMatch(s -> s.equals(target));
        if (noneMatch) return 0;

        boolean[] visited = new boolean[words.length];
        dfs(begin, target, words, visited, 0);

        return minCount;
    }

    private void dfs(String string, String target, String[] words, boolean[] visited, int count) {
        if (string.equals(target)) {
            minCount = Math.min(minCount, count);
            return;
        }

        if (count >= words.length) return;

        for (int i = 0; i < words.length; ++i) {
            if (!visited[i] && isJustOneDiff(string, words[i])) {
                visited[i] = true;
                dfs(words[i], target, words, visited, count+1);
                visited[i] = false;
            }
        }
    }

    private boolean isJustOneDiff(String first, String second) {
        int diffCount = 0;

        for (int i = 0; i < first.length(); ++i) {
            if (first.charAt(i) != second.charAt(i)) {
                ++diffCount;
            }
        }

        return diffCount == 1;
    }

}
