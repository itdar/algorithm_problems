package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_StackQueue_06Test {

    private Programmers_StackQueue_06 programmers_stackQueue_06 = new Programmers_StackQueue_06();

    @Test
    void solutionTest1() {
        int[] prices = new int[] {1,2,3,2,3};

        int[] results = programmers_stackQueue_06.solution(prices);

        assertThat(results).containsExactly(4,3,1,1,0);
    }
    @Test
    void solutionTest2() {
        int[] prices = new int[] {1,2,3,1,3};

        int[] results = programmers_stackQueue_06.solution(prices);

        assertThat(results).containsExactly(4,2,1,1,0);
    }

}
