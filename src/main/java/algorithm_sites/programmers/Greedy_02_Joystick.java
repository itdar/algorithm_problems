package algorithm_sites.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Greedy_02_Joystick {

    List<Integer> counts = new ArrayList<>();

    public int solution(String target) {
        int count = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < target.length(); ++i) {
            sb.append('A');
        }

        int currentIndex = 0;

        StringBuilder rightSb = new StringBuilder(sb.toString());
        rightSb.setCharAt(currentIndex, target.charAt(currentIndex));
        recursiveCount(rightSb, target, count+countAToAnyUpper(target.charAt(currentIndex)), currentIndex);

        return Collections.min(counts);
    }

    private void recursiveCount(StringBuilder sb, String target, int count, int currentIndex) {
        if (sb.toString().equals(target)) {
            counts.add(count);
            return;
        }

        // 오른쪽으로 가장 가까운 교체할 알파벳 위치
        int maxMove = target.length() - 1;
        int rightCount = 1;
        int rightNewIndex = currentIndex;
        for (int i = 1; i <= maxMove; ++i) {
            rightNewIndex = currentIndex + i;
            if (rightNewIndex > target.length()-1) {
                rightNewIndex -= target.length();
            }

            if (target.charAt(rightNewIndex) == sb.charAt(rightNewIndex)) {
                ++rightCount;
            } else {
                break;
            }
        }
        StringBuilder rightSb = new StringBuilder(sb.toString());
        rightSb.setCharAt(rightNewIndex, target.charAt(rightNewIndex));
        recursiveCount(rightSb, target, count+rightCount+countAToAnyUpper(target.charAt(rightNewIndex)), rightNewIndex);

        // 왼쪽으로 가장 가까운 교체할 알파벳 위치
        int leftCount = 1;
        int leftNewIndex = currentIndex;
        for (int i = 1; i <= maxMove; ++i) {
            leftNewIndex = currentIndex - i;
            if (leftNewIndex < 0) {
                leftNewIndex += target.length();
            }

            if (target.charAt(leftNewIndex) == sb.charAt(leftNewIndex)) {
                ++leftCount;
            } else {
                break;
            }
        }
        StringBuilder leftSb = new StringBuilder(sb.toString());
        leftSb.setCharAt(leftNewIndex, target.charAt(leftNewIndex));
        recursiveCount(leftSb, target, count+leftCount+countAToAnyUpper(target.charAt(leftNewIndex)), leftNewIndex);
    }

    /**
     * A 로부터 카운팅 개수
     */
    private int countAToAnyUpper(char anyUpperChar) {
        char A = 'A'; // 65

        // if over than half (N, 77)
        if (anyUpperChar >= 78) {
            return 91 - anyUpperChar;
        }

        return anyUpperChar - A;
    }

}
