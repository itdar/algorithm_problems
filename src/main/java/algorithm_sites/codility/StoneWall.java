package algorithm_sites.codility;

import java.util.Stack;

public class StoneWall {
    public int solution(int[] H) {
        if (H.length == 1) {
            return 1;
        }

        int count = 0;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < H.length; ++i) {
            if (stack.isEmpty()) {
                ++count;
                stack.push(H[i]);
                continue;
            }

            Integer prevHeight = stack.peek();

            if (H[i] < prevHeight) {
                if (!findSameOrPop(stack, H[i])) {
                    stack.push(H[i]);
                    ++count;
                }
            } else if (H[i] > prevHeight) {
                stack.push(H[i]);
                ++count;
            }

//            System.out.println("stack = " + stack);
        }

        return count;
    }

    private boolean findSameOrPop(Stack<Integer> stack, int number) {
        while (!stack.isEmpty()) {
            if (stack.peek() > number) {
                stack.pop();
            } else if (stack.peek() < number) {
                return false;
            } else if (stack.peek() == number) {
                return true;
            }
        }
        return false;
    }
}
