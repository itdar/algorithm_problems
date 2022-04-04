package algorithm_sites.programmers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class DfsBfs_01_TargetNumberTest {

    private DfsBfs_01_TargetNumber targetNumber = new DfsBfs_01_TargetNumber();

    @Test
    void solutionTest_1() {
        int result = targetNumber.solution(new int[]{1, 1, 1, 1, 1}, 3);

        assertThat(result).isEqualTo(5);
    }

    @Test
    void solutionTest_2() {
        int result = targetNumber.solution(new int[]{4,1,2,1}, 4);

        assertThat(result).isEqualTo(2);
    }

}