package algorithm_sites.programmers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class StackQueue_2_PrinterTest {

    private StackQueue_2_Printer printer = new StackQueue_2_Printer();

    @Test
    void solutionTest1() {
        int result = printer.solution(new int[]{2, 1, 3, 2}, 2);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void solutionTest2() {
        int result = printer.solution(new int[]{1,1,9,1,1,1}, 0);

        assertThat(result).isEqualTo(5);
    }

}