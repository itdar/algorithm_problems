package algorithm_sites.programmers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class KkoBlind2021_FailureRateTest {

    @Test
    void solution1() {
        KkoBlind20219_FailureRate kko = new KkoBlind20219_FailureRate();

        int[] result = kko.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});

        assertThat(result).containsExactly(new int[]{3,4,2,1,5});
    }

    @Test
    void solution2() {
        KkoBlind20219_FailureRate kko = new KkoBlind20219_FailureRate();

        int[] result = kko.solution(4, new int[]{4,4,4,4,4});

        assertThat(result).containsExactly(new int[]{4,1,2,3});
    }

    @Test
    void solution3() {
        KkoBlind20219_FailureRate kko = new KkoBlind20219_FailureRate();

        int[] result = kko.solution(1, new int[]{1,1,1});

        assertThat(result).containsExactly(new int[]{1});
    }

    @Test
    void solution4() {
        KkoBlind20219_FailureRate kko = new KkoBlind20219_FailureRate();

        int[] result = kko.solution(4, new int[]{5,5,5,5,5,5,5,5});

        assertThat(result).containsExactly(new int[]{1,2,3,4});
    }

}