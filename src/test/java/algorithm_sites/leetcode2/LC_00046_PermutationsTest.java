package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LC_00046_PermutationsTest {

    private LC_00046_Permutations permutations;

    @BeforeEach
    void setUp() {
        permutations = new LC_00046_Permutations();
    }

    @Test
    void permuteTest1() {
        List<List<Integer>> permute = permutations.permute(new int[]{1, 2, 3});

    }

    @Test
    void permuteTest2() {
        List<List<Integer>> permute = permutations.permute(new int[]{0,1});

        assertThat(permute.get(0)).containsExactly(0,1);
        assertThat(permute.get(1)).containsExactly(1,0);
    }

    @Test
    void permuteTest3() {
        List<List<Integer>> permute = permutations.permute(new int[]{1});

        assertThat(permute.get(0).get(0)).isEqualTo(1);
    }

}
