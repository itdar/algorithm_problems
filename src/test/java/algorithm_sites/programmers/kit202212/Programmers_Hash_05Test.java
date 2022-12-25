package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_Hash_05Test {

    private Programmers_Hash_05 programmers_hash_05 = new Programmers_Hash_05();

    @Test
    void solutionTest1() {
        String[] genre = new String[] {"classic", "pop", "classic", "classic", "pop"};
        int [] plays = new int[] {500, 600, 150, 800, 2500};

        int[] results = programmers_hash_05.solution(genre, plays);

        assertThat(results).containsExactly(4,1,3,0);
    }

}
