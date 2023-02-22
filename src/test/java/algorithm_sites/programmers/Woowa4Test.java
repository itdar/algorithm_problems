package algorithm_sites.programmers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Woowa4Test {

    private Woowa4 ww = new Woowa4();

    @Test
    void solutionTest1() {
        String result = ww.solution("/payment/1234/cancel");
        assertThat(result).isEqualTo("/payment/cancel?paymentId=1234");
    }
    @Test
    void solutionTest2() {
        String result = ww.solution("/payment/1234");
        assertThat(result).isEqualTo("error");
    }
    @Test
    void solutionTest3() {
        String result = ww.solution("/payment/a1234/cancel");
        assertThat(result).isEqualTo("error");
    }
    @Test
    void solutionTest4() {
        String result = ww.solution("/payment/1234567890/cancel");
        assertThat(result).isEqualTo("error");
    }
    @Test
    void solutionTest5() {
        String result = ww.solution("/payment/1234/5678");
        assertThat(result).isEqualTo("error");
    }

}
