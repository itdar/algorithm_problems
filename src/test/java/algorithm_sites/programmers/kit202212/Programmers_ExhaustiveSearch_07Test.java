package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_ExhaustiveSearch_07Test {

    private Programmers_ExhaustiveSearch_07 programmers_exhaustiveSearch_07 = new Programmers_ExhaustiveSearch_07();

    @Test
    void solutionTest1() {
        String word = "AAAAE";
        int result = programmers_exhaustiveSearch_07.solution(word);
        assertThat(result).isEqualTo(6);
    }
    @Test
    void solutionTest2() {
        String word = "AAAE";
        int result = programmers_exhaustiveSearch_07.solution(word);
        assertThat(result).isEqualTo(10);
    }
    @Test
    void solutionTest3() {
        String word = "I";
        int result = programmers_exhaustiveSearch_07.solution(word);
        assertThat(result).isEqualTo(1563);
    }
    @Test
    void solutionTest4() {
        String word = "EIO";
        int result = programmers_exhaustiveSearch_07.solution(word);
        assertThat(result).isEqualTo(1189);
    }

}
