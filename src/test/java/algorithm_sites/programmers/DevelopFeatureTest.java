package algorithm_sites.programmers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class DevelopFeatureTest {

    @Test
    void solutionTest_1() {
        DevelopFeature df = new DevelopFeature();
        int[] answer = df.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});

        assertThat(answer).containsExactly(2, 1);
    }

    @Test
    void solutionTest_2() {
        DevelopFeature df = new DevelopFeature();
        int[] answer = df.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1,1,1,1,1});

        assertThat(answer).containsExactly(1, 3, 2);
    }

}