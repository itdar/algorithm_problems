package algo_lib;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class DecimalToBinaryTest {

    private DecimalToBinary decimalToBinary = new DecimalToBinary();

    @Test
    void decimalTest1() {
        long result = decimalToBinary.integerConvert(9);

        assertThat(result).isEqualTo(1001);
    }

    @Test
    void decimalTest2() {
        long result = decimalToBinary.integerConvert(529);

        assertThat(result).isEqualTo(1000010001);
    }

    @Test
    void decimalTest3() {
        long result = decimalToBinary.integerConvert(15);

        assertThat(result).isEqualTo(1111);
    }

    @Test
    void decimalTest4() {
        long result = decimalToBinary.integerConvert(32);

        assertThat(result).isEqualTo(100000);
    }

    @Test
    void decimalTest5() {
        long result = decimalToBinary.integerConvert(1041);

        assertThat(result).isEqualTo(10000010001L);
    }

}