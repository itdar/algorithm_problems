package algorithm_sites.leetcode2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class LC_00150_EvaluateReversePolishNotation {

    public static Map<String, BiFunction<Integer, Integer, Integer>> map = new HashMap<>();
    static {
        map.put("+", (o, o2) -> o + o2);
        map.put("-", (o, o2) -> o - o2);
        map.put("*", (o, o2) -> o * o2);
        map.put("/", (o, o2) -> o / o2);
    }

    public int evalRPN(String[] tokens) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (String token : tokens) {

            try {
                deque.addLast(Integer.parseInt(token));
                continue;
            } catch (NumberFormatException ignored) {}

            Integer last1 = deque.pollLast();
            Integer last2 = deque.pollLast();

            deque.addLast(map.get(token).apply(last2, last1));
        }

        return deque.getFirst();
    }

}
