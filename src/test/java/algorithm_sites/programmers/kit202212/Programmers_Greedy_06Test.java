package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_Greedy_06Test {

    private Programmers_Greedy_06 programmers_greedy_06 = new Programmers_Greedy_06();

    @Test
    void solutionTest1() {
        int[][] routes = new int[][] {{-20,-15}, {-14,-5}, {-18,-13}, {-5,-3}};
        int result = programmers_greedy_06.solution(routes);
        assertThat(result).isEqualTo(2);
    }

}
