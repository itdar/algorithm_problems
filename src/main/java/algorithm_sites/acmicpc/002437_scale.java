package algorithm_sites.acmicpc;

import java.io.*;
import java.util.*;

// Process
// 1. Input total, weights
// 2. 입력 weights는 체크한다.
// 3. 1,000,000 길이의 체크 배열 준비한다.
// 4. Sort weights
// 5. 체크배열을 순회한다.
//  5.1. weights로 무게 잴 수 있는지 확인한다.
//  5.2. 가능하면 넘어가고, 불가하면 저장하고 빠져나간다.
// 6. 불가 저장값 반환한다.

class Scale {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int[] weights = new int[total];
        // 2, 3
//        int[] checks = new int[1000000 * total];
        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < total; ++i) {
            weights[i] = Integer.parseInt(tokenizer.nextToken());
//            checks[weights[i]] = 1;
        }

        // 4.
        Arrays.sort(weights);

        // 5.
        int minAnswer = 0;
        int number = 1;
        while (minAnswer == 0) {
            if (!isEnableToWeight(weights, number)) {
                minAnswer = number;
            }
            ++number;
        }

        System.out.println(minAnswer);
    }

    public static boolean isEnableToWeight(int[] weights, int weight) {
        for (int i = weights.length-1; weight > 0 && i >= 0; --i) {
            if (weights[i] <= weight) {
                weight -= weights[i];
            }
        }
        if (weight != 0)
            return false;
        else
            return true;
    }
}