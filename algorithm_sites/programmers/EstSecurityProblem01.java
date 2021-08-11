package algorithm_sites.programmers;

import java.util.HashMap;
import java.util.Map;

public class EstSecurityProblem01 {
    public static int solution(String[] scores) {
        int answer = 0;

        Map<Character, Integer> map;
        for (int i = 0; i < scores.length; ++i) {
            map = new HashMap<>();
            long sum = 0L;
            int count = 0;
            int max = 0;
            int min = 5;
            for (int j = 0; j < scores[i].length(); ++j) {
                ++count;
                char scoreChar = scores[i].charAt(j);
                int scoreNum = getScoreNum(scoreChar);
                sum += scoreNum;
                max = Math.max(scoreNum, max);
                min = Math.min(scoreNum, min);
                if (map.containsKey(scoreChar)) {
                    map.put(scoreChar, map.get(scoreChar) + 1);
                } else {
                    map.put(scoreChar, 1);
                }
            }
            System.out.println(map);

            if (map.containsKey('F') && map.get('F') >= 2) {
                continue;
            }

            if (map.containsKey('A') && map.get('A') >= 2) {
                ++answer;
                continue;
            }

            sum -= max;
            sum -= min;
            if (sum / (count-2) >= 3) {
                ++answer;
            }
        }

        return answer;
    }

    private static int getScoreNum(char scoreChar) {
        if (scoreChar == 'A') {
            return 5;
        }
        if (scoreChar == 'B') {
            return 4;
        }
        if (scoreChar == 'C') {
            return 3;
        }
        if (scoreChar == 'D') {
            return 2;
        }
        if (scoreChar == 'E') {
            return 1;
        }
        return 0;
    }


    public static void main(String args[]) {
//        int result = solution(new String[]{"AAFAFA", "FEECAA", "FABBCB", "CBEDEE", "CCCCCC"});
        int result = solution(new String[]{"BCD","ABB","FEE"});

        System.out.println(result);
    }

}
