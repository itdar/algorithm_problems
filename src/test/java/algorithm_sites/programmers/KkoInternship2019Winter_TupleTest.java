package algorithm_sites.programmers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KkoInternship2019Winter_TupleTest {

    @Test
    void solutionTest1() {
        KkoInternship2019Winter_Tuple tuple = new KkoInternship2019Winter_Tuple();

        int[] solution = tuple.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}");

        assertThat(solution).contains(2,1,3,4);
    }
    @Test
    void solutionTest2() {
        KkoInternship2019Winter_Tuple tuple = new KkoInternship2019Winter_Tuple();

        int[] solution = tuple.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}");

        assertThat(solution).contains(2,1,3,4);
    }
    @Test
    void solutionTest3() {
        KkoInternship2019Winter_Tuple tuple = new KkoInternship2019Winter_Tuple();

        int[] solution = tuple.solution("{{20,111},{111}}");

        assertThat(solution).contains(111,20);
    }
    @Test
    void solutionTest4() {
        KkoInternship2019Winter_Tuple tuple = new KkoInternship2019Winter_Tuple();

        int[] solution = tuple.solution("{{123}}");

        assertThat(solution).contains(123);
    }
    @Test
    void solutionTest5() {
        KkoInternship2019Winter_Tuple tuple = new KkoInternship2019Winter_Tuple();

        int[] solution = tuple.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}");

        assertThat(solution).contains(3,2,4,1);
    }

}
