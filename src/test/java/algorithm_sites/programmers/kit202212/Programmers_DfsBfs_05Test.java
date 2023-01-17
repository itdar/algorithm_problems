package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_DfsBfs_05Test {

    private Programmers_DfsBfs_05 programmers_dfsBfs_05 = new Programmers_DfsBfs_05();

    @Test
    void solutionTest1() {
        String[][] tickets = new String[][] {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        String[] results = programmers_dfsBfs_05.solution(tickets);
        assertThat(results).containsExactly("ICN", "JFK", "HND", "IAD");
    }

    @Test
    void solutionTest2() {
        String[][] tickets = new String[][] {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
        String[] results = programmers_dfsBfs_05.solution(tickets);
        assertThat(results).containsExactly("ICN", "ATL", "ICN", "SFO", "ATL", "SFO");
    }

}
