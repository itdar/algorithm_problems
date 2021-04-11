package algorithm_sites.programmers;

import java.util.*;

// Process (DFS recursive)
// 1. Input numbers, targetNumber
// 2. DFS 재귀 전체탐색 실행한다 (마지막 층 까지)
//  2.0. 타겟넘버와 같으면 카운트 센다.
//  2.1. 진행값에 현재값을 + 한 값으로 재귀호출한다.
//  2.2. 진행값에 현재값을 - 한 값으로 재귀호출한다.
// 3. 카운트 반환한다.

class TargetNumber1 {
    int count = 0;

    public int solution(int[] numbers, int targetNumber) {
        dfs_recursive(numbers, 0, 0, targetNumber);
        
        return count;
    }
    
    public void dfs_recursive(int[] numbers, int currentIndex, int sum, int targetNumber) {
        if (currentIndex <= numbers.length) {
            if (sum == targetNumber && numbers.length == currentIndex) {
                ++count;
                return;
            }

            if (currentIndex < numbers.length) {
                dfs_recursive(numbers, currentIndex+1, sum + numbers[currentIndex], targetNumber);
                dfs_recursive(numbers, currentIndex+1, sum - numbers[currentIndex], targetNumber);
            }
        }
    }

    // public static void main(String args[]) {
    //     TargetNumber1 tn = new TargetNumber();

    //     int[] numbers = {1,1,1,1,1};
    //     int targetNumber = 3;

    //     int result = tn.solution(numbers, targetNumber);
        
    //     System.out.println(result);
    // }
}

// 위에 재귀로 풀었으나, 연습삼아 스택으로 다시 푸는 중

// Process
// 1. Input numbers, targetNumber
// 2. 스택을 준비한다, 0을 넣어 초기화한다.
// 3. 스택이 빌 때까지 반복한다.
//  3.1. 스택에서 빼서 합의 값에 더한다.
//  3.2. 현재 인덱스가 numbers길이와 같으면서, targetNumber와 합의 값을 더한게 같으면 카운트 센다.
//  3.3. 스택에 다음 인덱스의 값을 뺀값, 더한값을 넣는다.
//   이 때, 스택을 넣을 때는 인덱스가 아래로 넘어가는 개념 (층 +1), 스택에서 뺄 때는 인덱스가 위로 돌아가는 개념 (층 -1)
// 4. 카운트 반환한다.


class TargetNumber2 {
    public int solution(int[] numbers, int targetNumber) {
        int count = 0;
        
        Stack<Integer> stack = new Stack<>();
        stack.add(0);

        int currentIndex = 1;
        int sum = 0;
        while (stack.size() > 0) {
            int currentValue = stack.pop();
            --currentIndex;

            if (sum + currentValue == targetNumber && currentIndex == numbers.length-1) {
                ++count;
            } else if (sum - currentValue == targetNumber && currentIndex == numbers.length-1) {
                ++count;
            }

            stack.add(sum + numbers[currentIndex]);
            stack.add(sum - numbers[currentIndex]);
        }

        return count;
    }
    
    public static void main(String args[]) {
        TargetNumber2 tn = new TargetNumber2();

        int[] numbers = {1,1,1,1,1};
        int targetNumber = 3;

        int result = tn.solution(numbers, targetNumber);
        
        System.out.println(result);
    }
}