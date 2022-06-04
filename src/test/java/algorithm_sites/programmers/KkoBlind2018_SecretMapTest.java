package algorithm_sites.programmers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class KkoBlind2018_SecretMapTest {

    @Test
    void solutionTest1() {
        KkoBlind2018_SecretMap secretMap = new KkoBlind2018_SecretMap();

        String[] result = secretMap.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});

        assertThat(result).containsExactly("#####", "# # #", "### #", "#  ##", "#####");
    }

    @Test
    void solutionTest2() {
        KkoBlind2018_SecretMap secretMap = new KkoBlind2018_SecretMap();

        String[] result = secretMap.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});

        assertThat(result).containsExactly("#####", "# # #", "### #", "#  ##", "#####");
    }

}
