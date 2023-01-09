package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_DfsBfs_04Test {

    private Programmers_DfsBfs_04 programmers_dfsBfs_04 = new Programmers_DfsBfs_04();

    @Test
    void solutionTest1() {
        String begin = "hit";
        String target = "cog";
        String[] words = new String[] {"hot", "dot", "dog", "lot", "log", "cog"};

        int result = programmers_dfsBfs_04.solution(begin, target, words);

        assertThat(result).isEqualTo(4);
    }
    @Test
    void solutionTest2() {
        String begin = "hit";
        String target = "cog";
        String[] words = new String[] {"hot", "dot", "dog", "lot", "log"};

        int result = programmers_dfsBfs_04.solution(begin, target, words);

        assertThat(result).isEqualTo(0);
    }

}
