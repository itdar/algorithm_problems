package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_Heap_01Test {

    private Programmers_Heap_01 programmers_heap_01 = new Programmers_Heap_01();

    @Test
    void solutionTest1() {
        int[] scoville = new int[] {1,2,3,9,10,12};
        int k = 7;

        int result = programmers_heap_01.solution(scoville, k);

        assertThat(result).isEqualTo(2);
    }

}
