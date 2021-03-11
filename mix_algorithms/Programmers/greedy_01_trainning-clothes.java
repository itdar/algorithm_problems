// Process
// 1. Input n, lost, reserve
// 2. Convert to list
// 3. Remove overlapped students
// 4. Iterate while lost and reserve are remained
//  4.1. Check around(+-1) value of reserve is in lost array
//   4.1.1. If so -> Remove both, and count student
// 5. Return student

import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int student = 0;
        
        // 2. 
        List<Integer> list_lost = new ArrayList<Integer>();
        for (int number : lost)
            list_lost.add(number);
        List<Integer> list_reserve = new ArrayList<Integer>();
        for (int number : reserve)
            list_reserve.add(number);
        
        // 3. 
        for (int i = 0; i < list_lost.size(); ++i) {
            boolean isDone = false;
            for (int j = 0; j < list_reserve.size() && !isDone; ++j) {
                if (list_lost.get(i) == list_reserve.get(j)) {
                    list_lost.remove(i--);
                    list_reserve.remove(j);
                    isDone = true;
                }
            }
        }
        
        student = n - list_lost.size();
        
        // 4.
        int index = 0;
        while (index < list_lost.size()) {
            boolean isDone = false;
            for (int i = 0; i < list_reserve.size() && !isDone; ++i) {
                if (list_lost.get(index)-1 == list_reserve.get(i) || list_lost.get(index)+1 == list_reserve.get(i)) {
                    list_reserve.remove(i);
                    ++student;
                    isDone = true;
                }
            }
            ++index;
        }
        
        return student;
    }
}