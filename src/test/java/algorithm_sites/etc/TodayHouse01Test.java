package algorithm_sites.etc;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class TodayHouse01Test {

    private TodayHouse01 th = new TodayHouse01();

    @Test
    void solutionTest01() {
        String[] results = th.solution("EEESEEEEEENNNN");

        assertThat(results[0]).isEqualTo("Time 0: Go straight 300m and turn RIGHT");
        assertThat(results[1]).isEqualTo("Time 3: Go straight 100m and turn LEFT");
        assertThat(results[2]).isEqualTo("Time 5: Go straight 500m and turn LEFT");
    }

    @Test
    void solutionTest02() {
        String[] results = th.solution("SSSSSSWWWNNNNNN");

        assertThat(results[0]).isEqualTo("Time 1: Go straight 500m and turn RIGHT");
        assertThat(results[1]).isEqualTo("Time 6: Go straight 300m and turn RIGHT");
    }


}