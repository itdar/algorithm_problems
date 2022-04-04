package algorithm_sites.programmers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Heap_03_DoublePriorityQueueTest {

    private Heap_03_DoublePriorityQueue priorityQueue = new Heap_03_DoublePriorityQueue();

    @Test
    void solutionTest1() {
        int[] result = priorityQueue.solution(new String[]{"I 16","D 1"});

        assertThat(result).containsExactly(0,0);
    }

    @Test
    void solutionTest2() {
        int[] result = priorityQueue.solution(new String[]{"I 7","I 5","I -5","D -1"});

        assertThat(result).containsExactly(7,5);
    }

    @Test
    void solutionTest3() {
        int[] result = priorityQueue.solution(new String[]{"D 1", "D -1", "I 7","I 5","I -5","D -1"});

        assertThat(result).containsExactly(7,5);
    }

    @Test
    void solutionTest4() {
        int[] result = priorityQueue.solution(new String[]{"D -1", "D 1"});

        assertThat(result).containsExactly(0,0);
    }

    @Test
    void solutionTest5() {
        int[] result = priorityQueue.solution(new String[]{"I 4", "I 3", "I 2", "I 1", "D 1", "D 1", "D -1", "D -1", "I 5", "I 6"});

        assertThat(result).containsExactly(6,5);
    }

}