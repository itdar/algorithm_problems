package algorithm_sites.programmers.kit202212;

import java.util.Arrays;

public class Programmers_DfsBfs_04 {

    private boolean[] visited;
    private int result = 0;

    public int solution(String begin, String target, String[] words) {
        if (Arrays.stream(words).noneMatch(s -> s.equals(target))) {
            return result;
        }

        visited = new boolean[words.length];
        String before = begin;
        for (int i = 0; i < words.length; ++i) {
            recursive(before, target, words, 0);
        }

        return result;
    }

    private void recursive(String before, String target, String[] words, int count) {
        if (before.equals(target)) {
            if (result == 0) {
                result = count;
            } else {
                result = Math.min(result, count);
            }
            return;
        }

        if (count > words.length) {
            return;
        }

        for (int i = 0; i < words.length; ++i) {
            if (!visited[i] && isJustOneDiff(before, words[i])) {
                visited[i] = true;
                recursive(words[i], target, words, count + 1);
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
