package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayDeque;
import java.util.Deque;
import org.junit.jupiter.api.Test;

class Programmers_StackQueue_03Test {

    private Programmers_StackQueue_03 programmers_stackQueue_03 = new Programmers_StackQueue_03();

    @Test
    void solutionTest1() {
        String input = "()()";

        assertThat(programmers_stackQueue_03.solution(input)).isTrue();
    }
    @Test
    void solutionTest2() {
        String input = "(())()";

        assertThat(programmers_stackQueue_03.solution(input)).isTrue();
    }
    @Test
    void solutionTest3() {
        String input = ")()(";

        assertThat(programmers_stackQueue_03.solution(input)).isFalse();
    }
    @Test
    void solutionTest4() {
        String input = "(()()(";

        assertThat(programmers_stackQueue_03.solution(input)).isFalse();
    }

//    @Test
//    void dequeTest1() {
//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.addFirst(3);
//        deque.addFirst(2);
//        deque.addFirst(1);
//        deque.addLast(4);
//        deque.addLast(5);
//        deque.addLast(6);
//
//        System.out.println(deque);
//    }
//    @Test
//    void dequeTest2() {
//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.addFirst(3);
//        deque.addFirst(2);
//        deque.addFirst(1);
//        deque.addLast(4);
//        deque.addLast(5);
//        deque.addLast(6);
//        deque.removeFirst();
//
//        System.out.println(deque);
//    }
//    @Test
//    void dequeTest3() {
//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.addFirst(3);
//        deque.addFirst(2);
//        deque.addFirst(1);
//        deque.addLast(4);
//        deque.addLast(5);
//        deque.addLast(6);
//        deque.removeLast();
//
//        System.out.println(deque);
//    }

}
