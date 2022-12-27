package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_StackQueue_02Test {

    private Programmers_StackQueue_02 programmers_stackQueue_02 = new Programmers_StackQueue_02();

    @Test
    void solutionTest1() {
        int[] progresses = new int[] {93,30,55};
        int[] speeds = new int[] {1,30,5};

        int[] results = programmers_stackQueue_02.solution(progresses, speeds);

        assertThat(results).containsExactly(2,1);
    }
    @Test
    void solutionTest2() {
        int[] progresses = new int[] {95, 90, 99, 99, 80, 99};
        int[] speeds = new int[] {1, 1, 1, 1, 1, 1};

        int[] results = programmers_stackQueue_02.solution(progresses, speeds);

        assertThat(results).containsExactly(1, 3, 2);
    }

}
