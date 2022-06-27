package algorithm_sites.hackerrank;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class kThQueryTest {

    @Test
    void solutionTest1() {
        List<Integer> results = kThQuery.solution(8, Arrays.asList(1,2,20,8,8,1,2,5,8,0), Arrays.asList(100,2));

        assertThat(results).containsExactly(-1,5);
    }

    @Test
    void solutionTest2() {
        List<Integer> results = kThQuery.solution(8, Arrays.asList(1,2,20,8,8,1,2,5,8,0), Arrays.asList(100,2,1,3,4));

        assertThat(results).containsExactly(-1,5,4,9,-1);
    }

    @Test
    void solutionTest3() {
        List<Integer> results = kThQuery.solution(9, Arrays.asList(9, 8, 9, 9), Arrays.asList(7, 3, 7, 6));

        assertThat(results).containsExactly(-1,4,-1,-1);
    }

}
