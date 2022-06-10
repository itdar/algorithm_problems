package algorithm_sites.codility;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Ya_1_RockPaperScissorsTest {

    private Ya_1_RockPaperScissors ya1 = new Ya_1_RockPaperScissors();

    @Test
    void solution1() {
        int result = ya1.solution("RSPRS");

        assertThat(result).isEqualTo(6);
    }

    @Test
    void solution2() {
        int result = ya1.solution("SRR");

        assertThat(result).isEqualTo(4);
    }

    @Test
    void solution3() {
        int result = ya1.solution("PRPRRPP");

        assertThat(result).isEqualTo(10);
    }

    @Test
    void solution4() {
        int result = ya1.solution("PPPPRRSSSSS");

        assertThat(result).isEqualTo(13);
    }

    @Test
    void solution5() {
        int result = ya1.solution("PPPPP");

        assertThat(result).isEqualTo(10);
    }

    @Test
    void solution6() {
        int result = ya1.solution("PPPPPR");

        assertThat(result).isEqualTo(10);
    }

    @Test
    void solution7() {
        int result = ya1.solution("PPPPPS");

        assertThat(result).isEqualTo(11);
    }

}
