package algorithm_sites.codility;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PrefixSum_PassingCarsTest {

    private PrefixSum_PassingCars passingCars = new PrefixSum_PassingCars();

    @Test
    void solutionTest_1() {
        int result = passingCars.solution(new int[]{0, 1, 0, 1, 1});

        assertThat(result).isEqualTo(5);
    }

}