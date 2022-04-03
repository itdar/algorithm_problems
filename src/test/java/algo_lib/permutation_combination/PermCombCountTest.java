package algo_lib.permutation_combination;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PermCombCountTest {

    private PermCombCount counter = new PermCombCount();

    @Test
    void combCountTest_1() {
        int result = counter.combCountOf(5, 3);

        assertThat(result).isEqualTo(10);
    }

    @Test
    void combCountTest_2() {
        int result = counter. combCountOf(100, 98);

        assertThat(result).isEqualTo(4950);
    }

    @Test
    void combCountTest_3() {
        int result = counter.combCountOf(5, 2);

        assertThat(result).isEqualTo(10);
    }

    @Test
    void combRepetCountTest_1() {
        int result = counter.combRepetCountOf(4, 2);

        assertThat(result).isEqualTo(10);
    }

    @Test
    void combRepetCountTest_2() {
        int result = counter.combRepetCountOf(3, 2);

        assertThat(result).isEqualTo(6);
    }

    @Test
    void combRepetCountTest_3() {
        int result = counter.combRepetCountOf(3, 3);

        assertThat(result).isEqualTo(10);
    }
}