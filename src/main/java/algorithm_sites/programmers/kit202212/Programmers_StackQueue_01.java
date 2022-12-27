package algorithm_sites.programmers.kit202212;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Programmers_StackQueue_01 {

    public int[] solution(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new int[] {};
        }

        List<Integer> results = new ArrayList<>();
        results.add(inputArray[0]);

        for (int i = 1; i < inputArray.length; ++i) {
            if (inputArray[i] != inputArray[i-1]) {
                results.add(inputArray[i]);
            }
        }

        return results.stream()
            .mapToInt(value -> value)
            .toArray();
    }

    public int[] solution2(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new int[] {};
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < inputArray.length; ++i) {
            if (stack.isEmpty()) {
                stack.push(inputArray[i]);
                continue;
            }

            if (stack.peek() != inputArray[i]) {
                stack.push(inputArray[i]);
            }
        }

        int[] ints = stack.stream()
            .mapToInt(value -> value)
            .toArray();

//        for (int anInt : ints) {
//            System.out.print(anInt + ",");
//        }

        return ints;
    }

}
