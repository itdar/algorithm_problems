package algorithm_sites.codility;

import java.util.Stack;

public class StoneWall {
    public static int solution(int[] H) {
        if (H.length == 0) {
            return 0;
        }
        if (H.length == 1) {
            return 1;
        }

        Stack<Integer> stack = new Stack<>();

        int count = 0;
        for (int i = 0; i < H.length; ++i) {
            if (stack.empty() || stack.peek() < H[i]) {
                stack.push(H[i]);
                ++count;
            } else if (stack.peek() == H[i]) {
                stack.pop();
            } else if (stack.peek() > H[i]){
                stack.pop();
                ++count;
            }
        }

        return count;
    }

    public static void main(String args[]) {
        int result = solution(new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8});

        System.out.println(result);
    }
}
