package algo_lib;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CheckPrimeNumberTest {

    @Test
    void eratosthenesSieveTest0() {
        CheckPrimeNumber primeCheck = new CheckPrimeNumber();

        boolean result = primeCheck.sieveCheckPrimeNumber(1);

        assertThat(result).isFalse();
    }

    @Test
    void eratosthenesSieveTest00() {
        CheckPrimeNumber primeCheck = new CheckPrimeNumber();

        boolean result = primeCheck.sieveCheckPrimeNumber(2);

        assertThat(result).isTrue();
    }

    @Test
    void eratosthenesSieveTest1() {
        CheckPrimeNumber primeCheck = new CheckPrimeNumber();

        boolean result = primeCheck.sieveCheckPrimeNumber(3);

        assertThat(result).isTrue();
    }

    @Test
    void eratosthenesSieveTest2() {
        CheckPrimeNumber primeCheck = new CheckPrimeNumber();

        boolean result = primeCheck.sieveCheckPrimeNumber(101);

        assertThat(result).isTrue();
    }

    @Test
    void eratosthenesSieveTest3() {
        CheckPrimeNumber primeCheck = new CheckPrimeNumber();

        boolean result = primeCheck.sieveCheckPrimeNumber(197);

        assertThat(result).isTrue();
    }

    @Test
    void eratosthenesSieveTest4() {
        CheckPrimeNumber primeCheck = new CheckPrimeNumber();

        boolean result = primeCheck.sieveCheckPrimeNumber(281);

        assertThat(result).isTrue();
    }

    @Test
    void eratosthenesSieveTest5() {
        CheckPrimeNumber primeCheck = new CheckPrimeNumber();

        boolean result = primeCheck.sieveCheckPrimeNumber(279);

        assertThat(result).isFalse();
    }

    @Test
    void eratosthenesSieveTest6() {
        CheckPrimeNumber primeCheck = new CheckPrimeNumber();

        boolean result = primeCheck.sieveCheckPrimeNumber(121);

        assertThat(result).isFalse();
    }

    @Test
    void eratosthenesSieveCountingTest1() {
        CheckPrimeNumber primeCheck = new CheckPrimeNumber();

        int result = primeCheck.sieveCountPrimeNumber(3);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void eratosthenesSieveCountingTest2() {
        CheckPrimeNumber primeCheck = new CheckPrimeNumber();

        int result = primeCheck.sieveCountPrimeNumber(13);

        assertThat(result).isEqualTo(6);
    }

    @Test
    void eratosthenesSieveCountingTest3() {
        CheckPrimeNumber primeCheck = new CheckPrimeNumber();

        int result = primeCheck.sieveCountPrimeNumber(7);

        assertThat(result).isEqualTo(4);
    }

    @Test
    void eratosthenesSieveCountingTest4() {
        CheckPrimeNumber primeCheck = new CheckPrimeNumber();

        int result = primeCheck.sieveCountPrimeNumber(5);

        assertThat(result).isEqualTo(3);
    }
}