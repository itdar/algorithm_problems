package algorithm_sites.codility;

import java.util.ArrayDeque;
import java.util.Deque;

public class CyclicRotation {

    public static int[] solution(int[] a, int k) {
        if (a.length == 0 || k == 0) {
            return a;
        }

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < a.length; ++i) {
            deque.add(a[i]);
        }

        for (int i = 0; i < k; ++i) {
            Integer poll = deque.pollLast();
            deque.addFirst(poll);
        }

        for (int i = 0; i < a.length; ++i) {
            a[i] = deque.pollFirst();
        }

        return a;
    }

    public static void main(String args[]) {
        int[] answer = solution(new int[]{3, 8, 9, 7, 6}, 3);

        for (int i = 0; i < answer.length; ++i) {
            System.out.print(answer[i] + " ");
        }
    }

}
