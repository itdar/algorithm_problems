package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_Hash_04Test {

    private Programmers_Hash_04 programmers_hash_04 = new Programmers_Hash_04();

    @Test
    void solutionTest1() {
        String[][] clothes = new String[][] {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        int result = programmers_hash_04.solution(clothes);

        assertThat(result).isEqualTo(5);
    }
    @Test
    void solutionTest2() {
        String[][] clothes = new String[][] {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

        int result = programmers_hash_04.solution(clothes);

        assertThat(result).isEqualTo(3);
    }

}
