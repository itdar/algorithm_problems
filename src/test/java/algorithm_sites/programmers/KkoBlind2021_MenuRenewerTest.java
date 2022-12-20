package algorithm_sites.programmers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class KkoBlind2021_MenuRenewerTest {

    private KkoBlind2021_MenuRenewer renewer = new KkoBlind2021_MenuRenewer();

    @Test
    void solutionTest1() {
        String[] results = renewer.solution(
            new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"},
            new int[]{2, 3, 4}
        );

        assertThat(results).containsExactly("AC", "ACDE", "BCFG", "CDE");
    }

    @Test
    void solutionTest2() {
        String[] results = renewer.solution(
            new String[]{"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"},
            new int[]{2, 3, 5}
        );

        assertThat(results).containsExactly("ACD", "AD", "ADE", "CD", "XYZ");
    }

    @Test
    void solutionTest3() {
        String[] results = renewer.solution(
            new String[]{"XYZ", "XWY", "WXA"},
            new int[]{2, 3, 4}
        );

        assertThat(results).containsExactly("WX", "XY");
    }

}
