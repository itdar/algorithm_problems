package algorithm_sites.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Woowa5 {

    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> numberCountMap = new HashMap<>();

        // k번째 큰 수는?, 중복이 몇개?
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int k = Integer.parseInt(firstLine[1]);

        for (int i = 0; i < n; ++i) {
            int input = Integer.parseInt(br.readLine());
            numberCountMap.put(input, numberCountMap.getOrDefault(input, 0) + 1);
        }

        List<InputNumber> numberList = new ArrayList<>();
        for (Entry<Integer, Integer> entry : numberCountMap.entrySet()) {
            numberList.add(new InputNumber(entry.getKey(), entry.getValue()));
        }

        try {
            InputNumber kThBiggest = numberList.stream()
                .sorted((o1, o2) -> o2.value - o1.value)
                .collect(Collectors.toList())
                .get(k-1);

            System.out.print(kThBiggest.value + " " + kThBiggest.count);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IMPOSSIBLE");
        }
    }

    private static class InputNumber {
        private int value;
        private int count;

        public InputNumber(int value, int count) {
            this.value = value;
            this.count = count;
        }
    }

}
