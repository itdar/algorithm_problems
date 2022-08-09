package algorithm_sites.etc;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ProgrammersLineGlo1Test {

    private ProgrammersLineGlo1 glo1 = new ProgrammersLineGlo1();

    @Test
    void solutionTest1() {
        int result = glo1.solution("abcz");

        assertThat(result).isEqualTo(1);
    }

    @Test
    void solutionTest2() {
        int result = glo1.solution("zabzczxa");

        assertThat(result).isEqualTo(3);
    }

    @Test
    void solutionTest3() {
        int result = glo1.solution("abcd");

        assertThat(result).isEqualTo(0);
    }

}
