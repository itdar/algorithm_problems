package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_BinarySearch_01Test {

    private Programmers_BinarySearch_01 programmers_binarySearch_01 = new Programmers_BinarySearch_01();

    @Test
    void solutionTest1() {
        long result = programmers_binarySearch_01.solution(6, new int[]{7, 10});
        assertThat(result).isEqualTo(28);
    }

}
