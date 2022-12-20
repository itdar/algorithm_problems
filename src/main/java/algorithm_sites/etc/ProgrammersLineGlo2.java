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

        List<Integer> results = new LinkedList<>();

        String[] temperatures = input.trim().split(" ");

        /**
         * 몇개 엣지케이스 예상하기를,
         * 현재 구조는 필터링 (-200~ 200) 을 먼저해서 없애버리고,
         * +-2분 범위의 온도차이 +-3 를 확인하는데,
         * 필터링을 통해서 없애면서, 앞뒤 2분의 범위가 달라져서 오답이 나오는 경우가 있을 것 같다.
         *
         * 테케에서 확인
         *
         * 유효하지 않은 것들의 사이에 범위가 유효하지 않은 것들이 있는데,
         * 범위제거를 먼저하면서 유효하지 않은 것들이 붙게되어 유효해지는 경우가 발생
         * ex) 195 200   201 202 203   198 196 194
         *  -> 원래는 오른쪽 3개만 유효해서 196이 나와야 하는데,
         *  -> 사이에 범위제거하면서 왼쪽 200이 붙어서, 197이 나올 수 있음
         */

        // 전부 int? = 전부 온도니까.. 정수 ㅇㅇ
        List<Integer> temps = Arrays.stream(temperatures)
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        analyzeError(results, temps);

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

    private static void analyzeError(List<Integer> results, List<Integer> temps) {
        for (int i = 0; i < temps.size(); ++i) {
            int checkVal = temps.get(i);

            // 돌 때 범위에 맞는지 체크
            if (checkVal > RANGE_MAX || checkVal < RANGE_MIN) {
                continue;
            }

            int start = Math.max(i-2, 0);
            int end = Math.min(i+2, temps.size());

            boolean isValid = false;
            for (int j = start; j < end; ++j) {
                Integer temp = temps.get(j);

                // +-2 범위 돌 때 범위에 맞는지 체크
                if (temp > RANGE_MAX || temp < RANGE_MIN) {
                    continue;
                }

                if (i != j && Math.abs(checkVal - temp) < MAX_DIFF) {
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
