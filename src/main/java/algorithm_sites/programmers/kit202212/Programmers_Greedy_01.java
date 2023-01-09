package algorithm_sites.programmers.kit202212;

import java.util.Arrays;

public class Programmers_Greedy_01 {

    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n];
        for (int i = 0; i < students.length; ++i) {
            students[i] = 1;
        }
        for (int i = 0; i < lost.length; ++i) {
            students[lost[i]-1] -= 1;
        }
        for (int i = 0; i < reserve.length; ++i) {
            students[reserve[i]-1] += 1;
        }

        for (int i = 0; i < students.length; ++i) {
            if (students[i] == 0) {
                if (i > 0 && students[i-1] > 1) {
                    students[i-1] -= 1;
                    students[i] += 1;
                    continue;
                }

                if (i < students.length-1 && students[i+1] > 1) {
                    students[i+1] -= 1;
                    students[i] += 1;
                }
            }
        }

        return (int) Arrays.stream(students)
            .filter(value -> value > 0)
            .count();
    }

}
