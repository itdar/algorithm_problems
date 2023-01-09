package algorithm_sites.programmers.kit202212;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Programmers_Greedy_02 {
    private Set<Integer> set = new HashSet<>();

    public int solution(String name) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < name.length(); ++i) {
            sb.append('A');
        }

        recursive(sb, name, 0, 0);

        return Collections.min(set);
    }

    private void recursive(StringBuilder sb, String name, int count, int currentIndex) {
        StringBuilder rightSb = new StringBuilder(sb);
        boolean rightFound = false;
        int rightCount = 0;
        int rightIndex = currentIndex;
        StringBuilder leftSb = new StringBuilder(sb);
        boolean leftFound = false;
        int leftCount = 0;
        int leftIndex = currentIndex;

        if (sb.toString().equals(name)) {
            set.add(count);
            return;
        }

        while (!rightFound) {
            if (name.charAt(rightIndex) == rightSb.charAt(rightIndex)) {
                ++rightCount;
                ++rightIndex;
                if (rightIndex >= name.length()) {
                    rightIndex = 0;
                }
                continue;
            }
            rightFound = true;
        }
        int diffCount = countAToAnyUpper(rightIndex, name);
        rightSb.setCharAt(rightIndex, name.charAt(rightIndex));
        recursive(rightSb, name, count + diffCount + rightCount, rightIndex);

        while (!leftFound) {
            if (name.charAt(leftIndex) == leftSb.charAt(leftIndex)) {
                ++leftCount;
                --leftIndex;
                if (leftIndex < 0) {
                    leftIndex = name.length()-1;
                }
                continue;
            }
            leftFound = true;
        }
        diffCount = countAToAnyUpper(leftIndex, name);
        leftSb.setCharAt(leftIndex, name.charAt(leftIndex));
        recursive(leftSb, name, count + diffCount + leftCount, leftIndex);
    }

    protected int countAToAnyUpper(int currentIndex, String name) {
        char A = 'A'; // 65

        // if over than half (N, 77)
        if (name.charAt(currentIndex) >= 78) {
            return 91 - name.charAt(currentIndex);
        }

        return name.charAt(currentIndex) - A;
    }

}
