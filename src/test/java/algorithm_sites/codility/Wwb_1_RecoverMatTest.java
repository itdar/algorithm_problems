package algorithm_sites.codility;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Wwb_1_RecoverMatTest {

    private Wwb_1_RecoverMat ww = new Wwb_1_RecoverMat();

    @Test
    void solutionTest1() {
        String result = ww.solution(3, 2, new int[]{2, 1, 1, 0, 1});

        assertThat(result).isEqualTo("11000,10101");
//        assertThat(result).isEqualTo("11001,10100"); 아무거나 상관없음
    }

    @Test
    void solutionTest2() {
        String result = ww.solution(2, 3, new int[]{0, 0, 1, 1, 2});

        assertThat(result).isEqualTo("IMPOSSIBLE");
    }

    @Test
    void solutionTest3() {
        String result = ww.solution(2, 2, new int[]{2, 0, 2, 0});

        assertThat(result).isEqualTo("1010,1010");
    }

    @Test
    void solutionTest4() {
        String result = ww.solution(0, 0, new int[]{0, 0, 1});

        assertThat(result).isEqualTo("IMPOSSIBLE");
    }

    @Test
    void solutionTest5() {
        String result = ww.solution(0, 0, new int[]{0, 0, 0, 0});

        assertThat(result).isEqualTo("0000,0000");
    }

    @Test
    void solutionTest6() {
        String result = ww.solution(1, 0, new int[]{0, 0, 1});

        assertThat(result).isEqualTo("001,000");
    }

    @Test
    void solutionTest7() {
        String result = ww.solution(0, 2, new int[]{0, 1, 1});

        assertThat(result).isEqualTo("000,011");
    }

    @Test
    void solutionTest8() {
        String result = ww.solution(0, 1, new int[]{});

        assertThat(result).isEqualTo("IMPOSSIBLE");
    }

    @Test
    void solutionTest9() {
        String result = ww.solution(0, 0, new int[]{});

        assertThat(result).isEqualTo("IMPOSSIBLE");
    }

}
