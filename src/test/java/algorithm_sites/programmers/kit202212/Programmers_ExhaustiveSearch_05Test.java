package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_ExhaustiveSearch_05Test {

    private Programmers_ExhaustiveSearch_05 programmers_exhaustiveSearch_05 = new Programmers_ExhaustiveSearch_05();

    @Test
    void solutionTest1() {
        int k = 80;
        int[][] dungeons = new int[][] {{80,20},{50,40},{30,10}};
        int result = programmers_exhaustiveSearch_05.solution(k, dungeons);
        assertThat(result).isEqualTo(3);
    }

}
