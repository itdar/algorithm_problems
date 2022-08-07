package algorithm_sites.programmers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SkillCheckLevel2Test {

    private SkillCheckLevel2 skillCheckLevel2;

    @Test
    void solution2_Test1() {
        skillCheckLevel2 = new SkillCheckLevel2();

        int[] results = skillCheckLevel2.solution2(4, 7, 14);

        assertThat(results).containsExactly(4,3,3,3,4,4,4,4);
    }

    @Test
    void solution2_Test2() {
        skillCheckLevel2 = new SkillCheckLevel2();

        int[] results = skillCheckLevel2.solution2(3,2,5);

        assertThat(results).containsExactly(3,2,2,3);
    }

//    @Test
//    void solution2_Test3() {
//        skillCheckLevel2 = new SkillCheckLevel2();
//
//        int[] results = skillCheckLevel2.solution2(10000000,9999999999998L,9999999999999L);
//
//        assertThat(results).containsExactly(1);
//    }

}
