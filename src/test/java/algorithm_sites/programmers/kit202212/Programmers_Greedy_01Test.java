package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_Greedy_01Test {

    private Programmers_Greedy_01 programmers_greedy_01 = new Programmers_Greedy_01();

    @Test
    void solutionTest1() {
        int result = programmers_greedy_01.solution(5, new int[]{2, 4}, new int[]{1, 3, 5});
        assertThat(result).isEqualTo(5);
    }
    @Test
    void solutionTest2() {
        int result = programmers_greedy_01.solution(5, new int[]{2, 4}, new int[]{3});
        assertThat(result).isEqualTo(4);
    }
    @Test
    void solutionTest3() {
        int result = programmers_greedy_01.solution(3, new int[]{3}, new int[]{1});
        assertThat(result).isEqualTo(2);
    }

}
