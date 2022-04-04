package algorithm_sites.programmers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class DfsBfs_03_WordChangeTest {

    private DfsBfs_03_WordChange wordChange = new DfsBfs_03_WordChange();

    @Test
    void solutionTest_1() {
        int result = wordChange.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"});

        assertThat(result).isEqualTo(4);
    }

    @Test
    void solutionTest_2() {
        int result = wordChange.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log"});

        assertThat(result).isEqualTo(0);
    }

    @Test
    void solutionTest_3() {
        int result = wordChange.solution("hit", "cog", new String[]{"dot", "hot", "dog", "cog", "lot", "log"});

        assertThat(result).isEqualTo(4);
    }

}