package algorithm_sites.programmers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Greedy_02_MakeBiggestNumberTest {

    private Greedy_02_MakeBiggestNumber test = new Greedy_02_MakeBiggestNumber();

    @Test
    void solutionTest1() {
        String result = test.solution("1924", 2);

        assertThat(result).isEqualTo("94");
    }

    @Test
    void solutionTest2() {
        String result = test.solution("1231234", 3);

        assertThat(result).isEqualTo("3234");
    }

    @Test
    void solutionTest3() {
        String result = test.solution("4177252841", 4);

        assertThat(result).isEqualTo("775841");
    }

    @Test
    void solutionTest4() {
        String result = test.solution("101", 1);

        assertThat(result).isEqualTo("11");
    }

    @Test
    void solutionTest5() {
        String result = test.solution("1000000", 6);

        assertThat(result).isEqualTo("1");
    }

}