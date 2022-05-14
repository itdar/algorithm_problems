package algorithm_sites.programmers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class KkoBlind2022_countNAryPrimeNumberTest {

    private KkoBlind2022_countNAryPrimeNumber kko = new KkoBlind2022_countNAryPrimeNumber();

    @Test
    void solutionTest1() {
        int result = kko.solution(437674, 3);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void solutionTest2() {
        int result = kko.solution(110011, 10);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void solutionTest3() {
        int result = kko.solution(524287, 2);
//        System.out.println(Integer.toString(1000000, 3));
    }

}