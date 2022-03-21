package algorithm_sites.programmers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Hash_01_no_completion_player2Test {

    @Test
    void solutionTest_1() {
        Hash_01_no_completion_player2 hash1 = new Hash_01_no_completion_player2();

        String[] participant = new String[] {"leo","kiki","eden"};
        String[] completion = new String[] {"eden", "kiki"};

        String result = hash1.solution(participant, completion);

        assertThat(result).isEqualTo("leo");
    }

    @Test
    void solutionTest_2() {
        Hash_01_no_completion_player2 hash1 = new Hash_01_no_completion_player2();

        String[] participant = new String[] {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = new String[] {"josipa", "filipa", "marina", "nikola"};

        String result = hash1.solution(participant, completion);

        assertThat(result).isEqualTo("vinko");
    }

    @Test
    void solutionTest_3() {
        Hash_01_no_completion_player2 hash1 = new Hash_01_no_completion_player2();

        String[] participant = new String[] {"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[] {"stanko", "ana", "mislav"};

        String result = hash1.solution(participant, completion);

        assertThat(result).isEqualTo("mislav");
    }

    @Test
    void solutionTest_4() {
        Hash_01_no_completion_player2 hash1 = new Hash_01_no_completion_player2();

        String[] participant = new String[] {"mislav"};
        String[] completion = new String[] {};

        String result = hash1.solution(participant, completion);

        assertThat(result).isEqualTo("mislav");
    }

}