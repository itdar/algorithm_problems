package algorithm_sites.codility;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Ya_4_fixLanesTest {

    private Ya_4_fixLanes ya = new Ya_4_fixLanes();

    @Test
    void solutionTest1() {
        int count = ya.solution("..xx.x.", "x.x.x..");

        assertThat(count).isEqualTo(4);
    }

    @Test
    void solutionTest2() {
        int count = ya.solution(".xxx...x", "..x.xxxx");

        assertThat(count).isEqualTo(6);
    }

    @Test
    void solutionTest3() {
        int count = ya.solution("xxxxx", ".x..x");

        assertThat(count).isEqualTo(5);
    }

    @Test
    void solutionTest4() {
        int count = ya.solution("x...x", "..x..");

        assertThat(count).isEqualTo(2);
    }

    @Test
    void solutionTest5() {
        int count = ya.solution("x.........x", "...........");

        assertThat(count).isEqualTo(2);
    }

    @Test
    void solutionTest6() {
        int count = ya.solution("x.x.x.x.x.x.x.x.x.x", ".x.x.x.x.x.x.x.x.x.");

        assertThat(count).isEqualTo(10);
    }

}
