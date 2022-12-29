package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_ExhaustiveSearch_02Test {

    private Programmers_ExhaustiveSearch_02 programmers_exhaustiveSearch_02 = new Programmers_ExhaustiveSearch_02();

    @Test
    void solutionTest1() {
        int[] solutions = new int[] {1,2,3,4,5};

        int[] result = programmers_exhaustiveSearch_02.solution(solutions);

        assertThat(result).containsExactly(1);
    }
    @Test
    void solutionTest2() {
        int[] solutions = new int[] {1,3,2,4,2};

        int[] result = programmers_exhaustiveSearch_02.solution(solutions);

        assertThat(result).containsExactly(1,2,3);
    }

}
