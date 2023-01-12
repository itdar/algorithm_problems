package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_Greedy_03Test {

    private Programmers_Greedy_03 programmers_greedy_03 = new Programmers_Greedy_03();

    @Test
    void solutionTest1() {
        String result = programmers_greedy_03.solution("1924", 2);

        assertThat(result).isEqualTo("94");
    }
    @Test
    void solutionTest2() {
        String result =  programmers_greedy_03.solution("1231234", 3);

        assertThat(result).isEqualTo("3234");
    }
    @Test
    void solutionTest3() {
        String result = programmers_greedy_03.solution("4177252841", 4);

        assertThat(result).isEqualTo("775841");
    }

}
