package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_DynamicProgramming_03Test {

    private Programmers_DynamicProgramming_03 programmers_dynamicProgramming_03 = new Programmers_DynamicProgramming_03();

    @Test
    void solutionTest1() {
        int m = 4;
        int n = 3;
        int[][] puddles = new int[][] {{2, 2}};

        int result = programmers_dynamicProgramming_03.solution(m, n, puddles);

        assertThat(result).isEqualTo(4);
    }

}
