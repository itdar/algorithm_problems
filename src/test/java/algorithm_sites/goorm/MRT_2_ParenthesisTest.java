package algorithm_sites.goorm;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MRT_2_ParenthesisTest {

    private MRT_2_Parenthesis mrt = new MRT_2_Parenthesis();

    @Test
    void checkTest1() {
        boolean result = mrt.check("()((({}})({}[]]");

        assertThat(result).isFalse();
    }

    @Test
    void checkTest2() {
        boolean result = mrt.check("(()){[]}");

        assertThat(result).isTrue();
    }

    @Test
    void checkTest3() {
        boolean result = mrt.check("()");

        assertThat(result).isTrue();
    }

    @Test
    void checkTest4() {
        boolean result = mrt.check("(");

        assertThat(result).isFalse();
    }

    @Test
    void checkTest5() {
        boolean result = mrt.check("()()()");

        assertThat(result).isTrue();
    }

}
