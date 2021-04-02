package acmicpc;

import java.io.*;
import java.util.*;

// Process
// 1. Input total, numbers
// 2. 음수, 양수, 0, 1 따로 분리한다.
// 3. 양수는 큰수부터 차례로 2개씩 묶어서 총합에 더한다.
// 4. 음수는 작은수부터 차례로 2개씩 묶어서 총합에 더한다.
//  4.1. 0이 있었으면, 마지막 음수 하나는 제한다.
// 5. 총합 반환한다, 이 때, 1은 따로 더해준다.

class TidingNumbers {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int[] numbers = new int[total];
        for (int i = 0; i < total; ++i) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        int sum = 0;

        // 2.
        PriorityQueue<Integer> positives = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> negatives = new PriorityQueue<>();

        int oneCount = 0;
        boolean hasZero = false;
        for (int i = 0; i < numbers.length; ++i) {
            int temp = numbers[i];
            if (temp > 1) {
                positives.add(temp);
            } else if (temp < 0) {
                negatives.add(temp);
            } else if (temp == 0) {
                hasZero = true;
            } else if (temp == 1) {
                ++oneCount;
            }
        }
        
        // 4.
        while (positives.size() > 1) {
            sum += (positives.poll() * positives.poll());
        }
        if (positives.size() > 0) {
            sum += positives.poll();
        }

        // 5.
        while (negatives.size() > 1) {
            sum += (negatives.poll() * negatives.poll());
        }
        if (negatives.size() > 0 && !hasZero) {
            sum += negatives.poll();
        }

        System.out.println(sum + oneCount);
    }
}
