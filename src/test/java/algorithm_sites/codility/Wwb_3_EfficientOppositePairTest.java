package algorithm_sites.codility;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Wwb_3_EfficientOppositePairTest {

    private Wwb_3_EfficientOppositePair ww = new Wwb_3_EfficientOppositePair();

    @Test
    void solutionTest1() {
        int result = ww.solution(new int[]{3, 2, -2, 5, -3});

        assertThat(result).isEqualTo(3);
    }

    @Test
    void solutionTest2() {
        int result = ww.solution(new int[]{1,1,2,-1,2,-1});

        assertThat(result).isEqualTo(1);
    }

    @Test
    void solutionTest3() {
        int result = ww.solution(new int[]{1,2,3,-4});

        assertThat(result).isEqualTo(0);
    }

    @Test
    void solutionTest4() {
        int result = ww.solution(new int[]{1});

        assertThat(result).isEqualTo(0);
    }

    @Test
    void solutionTest5() {
        int result = ww.solution(new int[]{-1,-1});

        assertThat(result).isEqualTo(0);
    }

}
