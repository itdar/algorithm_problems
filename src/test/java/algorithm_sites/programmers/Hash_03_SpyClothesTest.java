package algorithm_sites.programmers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Hash_03_SpyClothesTest {

    @Test
    void solutionTest_1() {
        Hash_03_SpyClothes hash = new Hash_03_SpyClothes();

        String[][] input = new String[][] {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        int result = hash.solution(input);

        assertThat(result).isEqualTo(5);
    }

    @Test
    void solutionTest_2() {
        Hash_03_SpyClothes hash = new Hash_03_SpyClothes();

        String[][] input = new String[][] {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};
        int result = hash.solution(input);

        assertThat(result).isEqualTo(3);
    }

}