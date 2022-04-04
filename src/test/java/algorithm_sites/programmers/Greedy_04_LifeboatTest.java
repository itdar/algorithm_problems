package algorithm_sites.programmers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Greedy_04_LifeboatTest {

    private Greedy_04_Lifeboat lifeboat = new Greedy_04_Lifeboat();

    @Test
    void solutionTest_1() {
        int result = lifeboat.solution(new int[]{70, 50, 80, 50}, 100);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void solutionTest_2() {
        int result = lifeboat.solution(new int[]{70, 80, 50}, 100);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void solutionTest_3() {
        int result = lifeboat.solution(new int[]{20, 30, 70, 80, 50}, 100);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void solutionTest_4() {
        int result = lifeboat.solution(new int[]{70, 80, 50, 40, 240}, 240);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void solutionTest_5() {
        int result = lifeboat.solution(new int[]{40}, 40);

        assertThat(result).isEqualTo(1);
    }

}