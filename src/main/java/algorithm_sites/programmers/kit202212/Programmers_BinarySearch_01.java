package algorithm_sites.programmers.kit202212;

import java.util.Arrays;

public class Programmers_BinarySearch_01 {

    public long solution(int n, int[] times) {
        Arrays.sort(times);

        long min = 1;
        long max = (long) times[times.length - 1] * n;
        long answer = 0;

        while (min <= max) {
            long mid = (max+min)/2;
            long sum = 0;
            for (int time : times) {
                sum += (mid / time);
            }

            if (sum < n) {
                min = mid+1;
            } else {
                max = mid-1;
                answer = mid;
            }
        }

        return answer;
    }

}
