package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import org.junit.jupiter.api.Test;

class Programmers_Heap_02Test {

    private Programmers_Heap_02 programmers_heap_02 = new Programmers_Heap_02();

    @Test
    void solutionTest1() {
        int[][] jobs = new int[][] {{0, 3}, {1, 9}, {2, 6}};
        int result = programmers_heap_02.solution(jobs);
        assertThat(result).isEqualTo(9);
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
