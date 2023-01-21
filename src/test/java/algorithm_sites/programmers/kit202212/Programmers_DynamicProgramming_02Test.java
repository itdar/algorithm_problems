package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_DynamicProgramming_02Test {

    private Programmers_DynamicProgramming_02 programmers_dynamicProgramming_02 = new Programmers_DynamicProgramming_02();

    @Test
    void solutionTest1() {
        int[][] triangle = new int[][] {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};

        int result = programmers_dynamicProgramming_02.solution(triangle);

        assertThat(result).isEqualTo(30);
    }

    @Test
    void solutionTest2() {
        int[][] triangle = new int[][] {{7}};

        int result = programmers_dynamicProgramming_02.solution(triangle);

        assertThat(result).isEqualTo(7);
    }

}
