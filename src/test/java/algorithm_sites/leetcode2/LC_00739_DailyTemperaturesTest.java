package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LC_00739_DailyTemperaturesTest {

    private LC_00739_DailyTemperatures lc = new LC_00739_DailyTemperatures();

    @Test
    void solutionTest1() {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] results = lc.dailyTemperatures(temperatures);
        assertThat(results).containsExactly(1,1,4,2,1,1,0,0);
    }

    @Test
    void solutionTest2() {
        int[] temperatures = {30,40,50,60};
        int[] results = lc.dailyTemperatures(temperatures);
        assertThat(results).containsExactly(1,1,1,0);
    }

    @Test
    void solutionTest3() {
        int[] temperatures = {30,60,90};
        int[] results = lc.dailyTemperatures(temperatures);
        assertThat(results).containsExactly(1,1,0);
    }

}
