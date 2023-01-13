package algorithm_sites.programmers.kit202212;

import java.util.Arrays;

public class Programmers_Greedy_04 {

    public int solution(int[] people, int limit) {
        int frontIndex = 0;
        int rearIndex = people.length-1;
        int savedCount = 0;
        int count = 0;

        Arrays.sort(people);

        while (savedCount != people.length) {
            ++count;

            if (frontIndex != rearIndex && people[frontIndex] + people[rearIndex] <= limit) {
                ++frontIndex;
                --rearIndex;
                savedCount += 2;
                continue;
            }

            --rearIndex;
            ++savedCount;
        }

        return count;
    }

}
