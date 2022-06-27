package algorithm_sites.hackerrank;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class soccerScoreTest {

    @Test
    void solutionTest00() {
        List<Integer> results = soccerScore.solution(Arrays.asList(1, 2, 3), Arrays.asList(1,2,4,5));

        assertThat(results).containsExactly(1,2,3,3);
    }

    @Test
    void solutionTest000() {
        List<Integer> results = soccerScore.solution(Arrays.asList(1,1), Arrays.asList(0,0,0,0,0));

        assertThat(results).containsExactly(0,0,0,0,0);
    }

    @Test
    void solutionTest1() {
        List<Integer> results = soccerScore.solution(Arrays.asList(1, 2, 3), Arrays.asList(2, 4));

        assertThat(results).containsExactly(2,3);
    }

    @Test
    void solutionTest2() {
        List<Integer> results = soccerScore.solution(Arrays.asList(1,4,2,4), Arrays.asList(3,5));

        assertThat(results).containsExactly(2,4);
    }

    @Test
    void solutionTest0() {
        List<Integer> results = soccerScore.solution(Arrays.asList(1, 2, 3), Arrays.asList(2,4,5,1));

        assertThat(results).containsExactly(2,3,3,1);
    }

    @Test
    void solutionTest3() {
        List<Integer> results = soccerScore.solution(Arrays.asList(2,10,5,4,8), Arrays.asList(3,1,7,8));

        assertThat(results).containsExactly(1,0,3,4);
    }

    @Test
    void solutionTest33() {
        List<Integer> results = soccerScore.solution(Arrays.asList(2,4,5,8,10), Arrays.asList(1,3,7,8));

        assertThat(results).containsExactly(0, 1, 3, 4);
    }

    @Test
    void solutionTest4() {
        List<Integer> results = soccerScore.solution(Arrays.asList(0,0), Arrays.asList(0,0));

        assertThat(results).containsExactly(2,2);
    }

    @Test
    void solutionTest5() {
        List<Integer> results = soccerScore.solution(Arrays.asList(0,0), Arrays.asList(1,0));

        assertThat(results).containsExactly(2,2);
    }

    @Test
    void solutionTest6() {
        List<Integer> results = soccerScore.solution(Arrays.asList(1,1), Arrays.asList(0,0));

        assertThat(results).containsExactly(0,0);
    }

}
