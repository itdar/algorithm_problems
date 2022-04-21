//package algorithm_sites.codility;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import org.junit.jupiter.api.Test;
//
//class KkoMoProblem02Test {
//
//    private KkoMoProblem02 kko = new KkoMoProblem02();
//
//    @Test
//    void solutionTest1() {
//        int result = kko.solution(new int[]{0,0,1,1}, new int[]{2});
//
//        assertThat(result).isEqualTo(3);
//    }
//
//    @Test
//    void solutionTest2() {
//        int result = kko.solution(new int[]{0,0}, new int[]{1});
//
//        assertThat(result).isEqualTo(2);
//    }
//
//    @Test
//    void solutionTest3() {
//        int result = kko.solution(new int[]{0,0,0,0,2,3,3}, new int[]{2,5,6});
//
//        assertThat(result).isEqualTo(5);
//    }
//
//    @Test
//    void solutionTest4() {
//        int result = kko.solution(new int[]{0,0,1,2}, new int[]{1,2});
//
//        assertThat(result).isEqualTo(3);
//    }
//
//    @Test
//    void solutionTest5() {
//        int result = kko.solution(new int[]{0,3,0,0,5,0,5}, new int[]{4,2,6,1,0});
//
//        assertThat(result).isEqualTo(7);
//    }
//
//    @Test
//    void solutionTest6() {
//        int result = kko.solution(new int[]{0}, new int[]{0});
//
//        assertThat(result).isEqualTo(1);
//    }
//
//    @Test
//    void solutionTest7() {
//        int result = kko.solution(new int[]{1}, new int[]{1});
//
//        assertThat(result).isEqualTo(0);
//    }
//
//    @Test
//    void solutionTest88() {
//        int result = kko.solution(new int[]{0}, new int[]{0});
//
//        assertThat(result).isEqualTo(1);
//    }
//
//}