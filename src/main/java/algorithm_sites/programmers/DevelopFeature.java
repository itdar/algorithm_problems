package algorithm_sites.programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DevelopFeature {

    public int[] solution(int[] progresses, int[] speeds) {
        if (progresses == null || speeds == null) return null;
        if (progresses.length == 0) return null;
        if (progresses.length != speeds.length) return null;

        List<Integer> answer = new ArrayList<>();

        Stack<Integer> progressesStack = new Stack<>();
        Stack<Integer> speedsStack = new Stack<>();
        for (int i = progresses.length-1; i >= 0; --i) {
            progressesStack.push(progresses[i]);
            speedsStack.push(speeds[i]);
        }

        while (!progressesStack.isEmpty()) {
            for (int i = 0; i < progressesStack.size(); ++i) {
                progressesStack.set(i, progressesStack.get(i) + speedsStack.get(i));
            }

            int count = 0;
            while (!progressesStack.isEmpty() && progressesStack.peek() >= 100) {
                ++count;
                progressesStack.pop();
                speedsStack.pop();
            }

            if (count != 0) {
                answer.add(count);
            }
        }

        int[] ans = new int[answer.size()];
        for (int i = 0; i < answer.size(); ++i) {
            ans[i] = answer.get(i);
        }
        return ans;
    }

}
