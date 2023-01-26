package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LC_00217_ContainsDuplicateTest {

    private LC_00217_ContainsDuplicate lc_00217_containsDuplicate = new LC_00217_ContainsDuplicate();

    @Test
    void solutionTest1() {
        boolean result = lc_00217_containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1});

        assertThat(result).isTrue();
    }
    @Test
    void solutionTest2() {
        boolean result = lc_00217_containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4});

        assertThat(result).isFalse();
    }
    @Test
    void solutionTest3() {
        boolean result = lc_00217_containsDuplicate.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2});

        assertThat(result).isTrue();
    }

}
