package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_Heap_03Test {

    private Programmers_Heap_03 programmers_heap_03 = new Programmers_Heap_03();

    @Test
    void solutionTest1() {
        String[] operations = new String[] {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        int[] results = programmers_heap_03.solution(operations);
        assertThat(results).containsExactly(0,0);
    }
    @Test
    void solutionTest2() {
        String[] operations = new String[] {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        int[] results = programmers_heap_03.solution(operations);
        assertThat(results).containsExactly(333,-45);
    }

}
