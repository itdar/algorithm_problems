package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_Hash_03Test {

    private Programmers_Hash_03 programmers_hash_03 = new Programmers_Hash_03();

    @Test
    void solutionTest1() {
        int[] nums = new int[] {3,1,2,3};

        int result = programmers_hash_03.solution(nums);

        assertThat(result).isEqualTo(2);
    }
    @Test
    void solutionTest2() {
        int[] nums = new int[] {3,3,3,2,2,4};

        int result = programmers_hash_03.solution(nums);

        assertThat(result).isEqualTo(3);
    }
    @Test
    void solutionTest3() {
        int[] nums = new int[] {3,3,3,2,2,2};

        int result = programmers_hash_03.solution(nums);

        assertThat(result).isEqualTo(2);
    }

}
