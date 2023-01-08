package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.PriorityQueue;
import org.junit.jupiter.api.Test;

class Programmers_Heap_02Test {

    private Programmers_Heap_02 programmers_heap_02 = new Programmers_Heap_02();

    @Test
    void solutionTest1() {
        int[][] jobs = new int[][] {{0, 3}, {1, 9}, {2, 6}};
        // 3 + 7 + 17 / 3
        int result = programmers_heap_02.solution(jobs);
        assertThat(result).isEqualTo(9);
    }

    @Test
    void solutionTest2() {
        int[][] jobs = new int[][] {{0, 3}, {4, 9}, {4, 6}};
        // 3 + 6 + 15 / 3
        int result = programmers_heap_02.solution(jobs);
        assertThat(result).isEqualTo(8);
    }

//    @Test
    void priorityTest() {
        // 기본이 오름차순임
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(51);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }

}
