package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_ExhaustiveSearch_04Test {

    private Programmers_ExhaustiveSearch_04 programmers_exhaustiveSearch_04 = new Programmers_ExhaustiveSearch_04();

    @Test
    void solutionTest1() {
        int[] results = programmers_exhaustiveSearch_04.solution(10, 2);
        assertThat(results).containsExactly(4,3);
    }
    @Test
    void solutionTest2() {
        int[] results = programmers_exhaustiveSearch_04.solution(8,1);
        assertThat(results).containsExactly(3,3);
    }
    @Test
    void solutionTest3() {
        int[] results = programmers_exhaustiveSearch_04.solution(24,24);
        assertThat(results).containsExactly(8,6);
    }

}
