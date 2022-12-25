package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_StackQueue_01Test {

    private Programmers_StackQueue_01 programmers_stackQueue_01 = new Programmers_StackQueue_01();

    @Test
    void solutionTest1() {
        int[] arr = new int[] {1,1,3,3,0,1,1};

        int[] results = programmers_stackQueue_01.solution(arr);

        assertThat(results).containsExactly(1,3,0,1);
    }
    @Test
    void solutionTest2() {
        int[] arr = new int[] {4,4,4,3,3};

        int[] results = programmers_stackQueue_01.solution(arr);

        assertThat(results).containsExactly(4,3);
    }

}
