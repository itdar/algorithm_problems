package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_ExhaustiveSearch_03Test {

    private Programmers_ExhaustiveSearch_03 programmers_exhaustiveSearch_03 = new Programmers_ExhaustiveSearch_03();

    @Test
    void solutionTest1() {
        int result = programmers_exhaustiveSearch_03.solution("17");

        assertThat(result).isEqualTo(3);
    }

    @Test
    void solutionTest2() {
        int result = programmers_exhaustiveSearch_03.solution("011");

        assertThat(result).isEqualTo(2);
    }

    @Test
    void solutionTest3() {
        int result = programmers_exhaustiveSearch_03.solution("25");

        assertThat(result).isEqualTo(2);
    }

    @Test
    void solutionTest4() {
        int result = programmers_exhaustiveSearch_03.solution("143");
        // 1,3,13,31,43,431
        assertThat(result).isEqualTo(6);
    }

    @Test
    void solutionTest5() {
        int result = programmers_exhaustiveSearch_03.solution("1231");

        assertThat(result).isEqualTo(18);
    }

    @Test
    void stringBuilderTest1() {
        StringBuilder sb = new StringBuilder("123");
        sb.deleteCharAt(sb.length()-1);

        System.out.println(sb);

        sb.delete(0, sb.length());

        System.out.println(sb);
        System.out.println("end");
    }

}
