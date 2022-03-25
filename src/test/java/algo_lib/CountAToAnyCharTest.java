package algo_lib;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CountAToAnyCharTest {

    private CountAToAnyChar counter = new CountAToAnyChar();

    @Test
    void countUpperTest1() {
        int result = counter.countAToAnyUpper('Z');

        assertThat(result).isEqualTo(1);
    }

    @Test
    void countUpperTest2() {
        int result = counter.countAToAnyUpper('B');

        assertThat(result).isEqualTo(1);
    }

    @Test
    void countUpperTest3() {
        int result = counter.countAToAnyUpper('N');

        assertThat(result).isEqualTo(13);
    }

    @Test
    void countUpperTest4() {
        int result = counter.countAToAnyUpper('M');

        assertThat(result).isEqualTo(12);
    }

    @Test
    void countUpperTest5() {
        int result = counter.countAToAnyUpper('O');

        assertThat(result).isEqualTo(12);
    }

}