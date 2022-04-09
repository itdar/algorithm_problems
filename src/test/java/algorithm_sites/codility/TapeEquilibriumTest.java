package algorithm_sites.codility;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class TapeEquilibriumTest {

    private TapeEquilibrium tape = new TapeEquilibrium();

    @Test
    void solutionTest1() {
        int result = tape.solution(new int[]{-1000, 1000});

        assertThat(result).isEqualTo(2000);
    }

    @Test
    void solutionTest2() {
        int result = tape.solution(new int[]{3,1,2,4,3});

        assertThat(result).isEqualTo(1);
    }

    @Test
    void solutionTest3() {
        int result = tape.solution(new int[]{1,1,1,1,1});

        assertThat(result).isEqualTo(1);
    }

}