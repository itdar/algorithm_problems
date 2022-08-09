package algorithm_sites.etc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgrammersLineGlo2 {

    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(solution(input));
    }

    public static final String ERROR = "ERROR";
    private static final int RANGE_MIN = -200;
    private static final int RANGE_MAX = 200;
    private static final int MAX_DIFF = 3;

    public static String solution(String input) {
        if (input == null || input.isEmpty()) {
            return ERROR;
        }

        // 전부 int?
        List<Integer> results = new LinkedList<>();

        String[] temperatures = input.trim().split(" ");
        List<Integer> filtered = filterRange(temperatures, RANGE_MIN, RANGE_MAX);

        // 옆에 오류 데이터라도 차이를 비교 해야함?
        if (filtered.size() == 1) {
            return filtered.get(0).toString();
        }

        analyzeError(results, filtered);

        if (results.isEmpty()) {
            return ERROR;
        }
        return Integer.toString(getAverage(results));
    }

    private static int getAverage(List<Integer> results) {
        double sum = 0;
        for (int result : results) {
            sum += result;
        }
        return (int) (sum / results.size());
    }

    private static void analyzeError(List<Integer> results, List<Integer> filtered) {
        for (int i = 0; i < filtered.size(); ++i) {

            int start = Math.max(i-2, 0);
            int end = Math.min(i+2, filtered.size());
            int checkVal = filtered.get(i);

            boolean isValid = false;
            for (int j = start; j < end; ++j) {
                if (i != j && Math.abs(checkVal - filtered.get(j)) < MAX_DIFF) {
                    isValid = true;
                    break;
                }
            }

            if (isValid) {
                results.add(checkVal);
            }
        }
    }

    private static List<Integer> filterRange(String[] temperatures, final int min, final int max) {
        return Arrays.stream(temperatures)
            .filter(s -> Integer.parseInt(s) <= max)
            .filter(s -> Integer.parseInt(s) >= min)
            .map(Integer::parseInt)
            .collect(Collectors.toList());
    }

}
