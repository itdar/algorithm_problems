package algorithm_sites.etc;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ProgrammersLineGlo2Test {

    @Test
    void solutionTest1() {
        String result = ProgrammersLineGlo2.solution("10 12");

        assertThat(result).isEqualTo("11");
    }

    @Test
    void solutionTest2() {
        String result = ProgrammersLineGlo2.solution("10 13");

        assertThat(result).isEqualTo("ERROR");
    }

    @Test
    void solutionTest3() {
        String result = ProgrammersLineGlo2.solution("10 13 9");

        assertThat(result).isEqualTo("9");
    }

    @Test
    void solutionTest4() {
        String result = ProgrammersLineGlo2.solution("1 2 3 100 100 1 2");

        assertThat(result).isEqualTo("29");
    }

    @Test
    void solutionTest5() {
        String result = ProgrammersLineGlo2.solution("10 16 13 12 15 14 12");

        assertThat(result).isEqualTo("13");
    }

    @Test
    void solutionTest6() {
        String result = ProgrammersLineGlo2.solution("1 5 100 24 29");

        assertThat(result).isEqualTo("ERROR");
    }

    @Test
    void solutionTest7() {
        String result = ProgrammersLineGlo2.solution("1");

        assertThat(result).isEqualTo("ERROR");
    }

    @Test
    void solutionTest8() {
        String result = ProgrammersLineGlo2.solution("195 200 201 202 203 198 196 194");

        assertThat(result).isEqualTo("196");
    }

}
