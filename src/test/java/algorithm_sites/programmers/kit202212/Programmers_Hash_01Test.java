package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Programmers_Hash_01Test {

    private Programmers_Hash_01 programmers_hash_01 = new Programmers_Hash_01();

    @Test
    void solutionTest1() {
        String[] participant = new String[] {"leo", "kiki", "eden"};
        String[] completion = new String[] {"eden", "kiki"};

        String solution = programmers_hash_01.solution(participant, completion);

        assertThat(solution).isEqualTo("leo");
    }
    @Test
    void solutionTest2() {
        String[] participant = new String[] {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = new String[] {"josipa", "filipa", "marina", "nikola"};

        String solution = programmers_hash_01.solution(participant, completion);

        assertThat(solution).isEqualTo("vinko");
    }
    @Test
    void solutionTest3() {
        String[] participant = new String[] {"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[] {"stanko", "ana", "mislav"};

        String solution = programmers_hash_01.solution(participant, completion);

        assertThat(solution).isEqualTo("mislav");
    }

}
