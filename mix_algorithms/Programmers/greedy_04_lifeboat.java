// Process
// 1. Input
// 2. Sort people in ascending way
// 3. Iterate till front and rear index are met
//  3.1. Check if front and rear index value can take the same boat
//   3.1.1. If so -> move both indices
//   3.1.2. If not -> move rear index
//  3.2. ++boatCount
// 4. Return boatCount

import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int boatCount = 0;
        int frontIndex = 0;
        int rearIndex = people.length-1;
            
        // 2.
        // 내부라이브러리 (오름차순만 됨)
        Arrays.sort(people);
        // Selection sort (내림차순이 라이브러리 안돼서 그냥 만들었었음)
        // for (int i = 0; i < people.length-1; ++i) {
        //     int maxIndex = i;
        //     int max = people[i];
        //     for (int j = i+1; j < people.length; ++j) {
        //         if (max < people[j]) {
        //             max = people[j];
        //             maxIndex = j;
        //         }
        //     }
        //     int temp = people[i];
        //     people[i] = max;
        //     people[maxIndex] = temp;
        // }
        
        // 3.
        while (frontIndex <= rearIndex) {
            if (people[frontIndex] + people[rearIndex] <= limit) {
                ++frontIndex;
                --rearIndex;
            } else {
                --rearIndex;
            }
            ++boatCount;
        }
        
        return boatCount;
    }
}