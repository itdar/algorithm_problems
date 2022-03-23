package algorithm_sites.programmers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SearchAll_01_FindPrimeNumbersTest {

    @Test
    void solutionTest1() {
        SearchAll_01_FindPrimeNumbers search = new SearchAll_01_FindPrimeNumbers();

        int result = search.solution("17");

        assertThat(result).isEqualTo(3);
    }

    @Test
    void solutionTest2() {
        SearchAll_01_FindPrimeNumbers search = new SearchAll_01_FindPrimeNumbers();

        int result = search.solution("011");

        assertThat(result).isEqualTo(2);
    }

    @Test
    void solutionTest3() {
        SearchAll_01_FindPrimeNumbers search = new SearchAll_01_FindPrimeNumbers();

        int result = search.solution("0010");

        assertThat(result).isEqualTo(0);
    }

    @Test
    void solutionTest4() {
        SearchAll_01_FindPrimeNumbers search = new SearchAll_01_FindPrimeNumbers();

        int result = search.solution("13");

        assertThat(result).isEqualTo(3);
    }

    @Test
    void solutionTest5() {
        SearchAll_01_FindPrimeNumbers search = new SearchAll_01_FindPrimeNumbers();

        int result = search.solution("1231");

        assertThat(result).isEqualTo(18);
    }

    @Test
    void solutionTest6() {
        SearchAll_01_FindPrimeNumbers search = new SearchAll_01_FindPrimeNumbers();

        int result = search.solution("002");

        assertThat(result).isEqualTo(1);
    }
}