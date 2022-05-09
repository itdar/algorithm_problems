package algorithm_sites.programmers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class KkoInternship2021_NumberStringAndEnglishWordTest {

    private KkoInternship2021_NumberStringAndEnglishWord tester = new KkoInternship2021_NumberStringAndEnglishWord();

    @Test
    void solutionTest1() {
        int result = tester.solution("one4seveneight");

        assertThat(result).isEqualTo(1478);
    }

    @Test
    void solutionTest2() {
        int result = tester.solution("23four5six7");

        assertThat(result).isEqualTo(234567);
    }

    @Test
    void solutionTest3() {
        int result = tester.solution("2three45sixseven");

        assertThat(result).isEqualTo(234567);
    }

    @Test
    void solutionTest4() {
        int result = tester.solution("123");

        assertThat(result).isEqualTo(123);
    }

    @Test
    void solutionTest5() {
        int result = tester.solution("1");

        assertThat(result).isEqualTo(1);
    }

    @Test
    void solutionTest6() {
        int result = tester.solution("seven");

        assertThat(result).isEqualTo(7);
    }

    @Test
    void solutionTest7() {
        int result = tester.solution("oneseveneight");

        assertThat(result).isEqualTo(178);
    }
}