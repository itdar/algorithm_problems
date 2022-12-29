package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_StackQueue_04Test {

    private Programmers_StackQueue_04 programmers_stackQueue_04 = new Programmers_StackQueue_04();

    @Test
    void solutionTest1() {
        int[] priorities = new int[] {2,1,3,2};
        int location = 2;

        int result = programmers_stackQueue_04.solution(priorities, location);

        assertThat(result).isEqualTo(1);
    }
    @Test
    void solutionTest2() {
        int[] priorities = new int[] {1,1,9,1,1,1};
        int location = 0;

        int result = programmers_stackQueue_04.solution(priorities, location);

        assertThat(result).isEqualTo(5);
    }

}
