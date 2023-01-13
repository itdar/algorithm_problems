package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_Greedy_04Test {

    private Programmers_Greedy_04 programmers_greedy_04 = new Programmers_Greedy_04();

    @Test
    void solutionTest1() {
        int[] people = new int[] {70,50,80,50};
        int limit = 100;

        int result = programmers_greedy_04.solution(people, limit);

        assertThat(result).isEqualTo(3);
    }
    @Test
    void solutionTest2() {
        int[] people = new int[] {70,50,80};
        int limit = 100;

        int result = programmers_greedy_04.solution(people, limit);

        assertThat(result).isEqualTo(3);
    }

}
