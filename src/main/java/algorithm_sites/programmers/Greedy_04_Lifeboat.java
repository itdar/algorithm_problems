package algorithm_sites.programmers;

import java.util.*;

class Greedy_04_Lifeboat {

    public int solution(int[] people, int limit) {

        Arrays.sort(people);

        int frontIndex = 0;
        int rearIndex = people.length-1;
        int count = 0;

        while (frontIndex <= rearIndex) {
            if (people[rearIndex] + people[frontIndex] <= limit) {
                ++frontIndex;
                --rearIndex;
            } else {
                --rearIndex;
            }
            ++count;
        }

        return count;
    }
}