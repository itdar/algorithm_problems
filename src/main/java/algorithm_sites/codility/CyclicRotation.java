package algorithm_sites.codility;

import java.util.ArrayDeque;
import java.util.Deque;

public class CyclicRotation {

    public int[] solution(int[] input, int k) {
        if (input.length <= 0)
            return input;

        final int length = input.length;
        k %= length;

        int index = length-k;

        int[] result = new int[length];
        for (int i = 0; i < length; ++i) {
            if (index >= length) {
                index -= length;
            }
            result[i] = input[index];

            ++index;
        }

        return result;
    }

}
