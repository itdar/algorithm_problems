package algorithm_sites.hackerrank;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class virusTest {

    @Test
    void solutionTest1() {
        List<Integer> inputs = new ArrayList<>();
        inputs.add(1);
        inputs.add(5);

        int result = virus.solution(5, inputs);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void solutionTest2() {
        List<Integer> inputs = new ArrayList<>();
        inputs.add(3);
        inputs.add(5);

        int result = virus.solution(6, inputs);

        assertThat(result).isEqualTo(6);
    }

    @Test
    void solutionTest3() {
        List<Integer> inputs = new ArrayList<>();
        inputs.add(1);

        int result = virus.solution(4, inputs);

        assertThat(result).isEqualTo(1);
    }

}
