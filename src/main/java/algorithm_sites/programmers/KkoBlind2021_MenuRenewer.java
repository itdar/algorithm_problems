package algorithm_sites.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KkoBlind2021_MenuRenewer {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3);

        int sum = integers.stream()
            .mapToInt(i -> i)
            .sum();

        System.out.println(sum);

        sum = integers.stream()
            .reduce(0, Integer::sum);

        System.out.println(sum);
    }

    // process
    // 1. input
    // 2. courses 각 숫자만큼 사이즈의 조합을 orders 의 문자열 내에서 찾아서
    //  맵으로 카운트랑? 넣어둔다. (e.g. [AB,3])
    // 3. 키 길이끼리 묶어서 나눠두고,
    //  카운트가 2 이상이면서, 최대값인 키들을 결과(result)배열에 추가한다.
    // 4. 반환한다.

    private Map<String, Integer> courseMap = new HashMap<>();
    private StringBuilder courseOutput = new StringBuilder();
    private boolean[] visited;

    public String[] solution(String[] orders, int[] courses) {
        String[] answer = {};

        for (int i = 0; i < courses.length; ++i) {
            int courseCount = courses[i];

            for (int j = 0; j < orders.length; ++j) {
                String order = orders[j];
                Arrays.sort(order.toCharArray());

                int n = order.length();
                int r = courseCount;
                if (r > n) continue;

                visited = new boolean[n];
                combination(order, visited, 0, n, r, 0);
            }
        }

        System.out.println(courseMap);

        return answer;
    }

    private void combination(String order, boolean[] visited, int start, int n, int r, int depth) {
        if (depth == r) {
//            System.out.println(courseOutput);

            courseMap.merge(courseOutput.toString(), 1, (key, count) -> count + 1);
            courseOutput = new StringBuilder();
            return;
        }

        for (int i = start; i < n; ++i) {
            if (!visited[i]) {
                visited[i] = true;

                courseOutput.append(order.charAt(i));
                combination(order, visited, i + 1, n, r, depth+1);

                visited[i] = false;
            }
        }
    }

}
