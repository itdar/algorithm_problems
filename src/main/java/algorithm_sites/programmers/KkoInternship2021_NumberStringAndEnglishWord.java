package algorithm_sites.programmers;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class KkoInternship2021_NumberStringAndEnglishWord {

    private static final Map<String, Integer> map;
    static {
        Map<String, Integer> tempMap = new HashMap<>();
        tempMap.put("zero", 0);
        tempMap.put("one", 1);
        tempMap.put("two", 2);
        tempMap.put("three", 3);
        tempMap.put("four", 4);
        tempMap.put("five", 5);
        tempMap.put("six", 6);
        tempMap.put("seven", 7);
        tempMap.put("eight", 8);
        tempMap.put("nine", 9);
        map = Collections.unmodifiableMap(tempMap);
    }

    public int solution(String s) {
        s = s.toLowerCase();

        StringBuilder result = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            if (!Character.isDigit(s.charAt(i))) {
                if (map.containsKey(sb.toString())) {
                    result.append(map.get(sb.toString()));
                    sb = new StringBuilder();
                }

                sb.append(s.charAt(i));

                continue;
            }

            if (sb.length() > 0) {
                result.append(map.get(sb.toString()));
            }

            result.append(s.charAt(i));
            sb = new StringBuilder();
        }

        if (sb.length() > 0) {
            result.append(map.get(sb.toString()));
        }

        return Integer.parseInt(result.toString());
    }

}
