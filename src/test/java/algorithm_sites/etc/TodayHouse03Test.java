package algorithm_sites.etc;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class TodayHouse03Test {

    private TodayHouse03 th = new TodayHouse03();

    @Test
    void solutionTest1() {
        String[][] input = new String[][] {{"template", "string"}, {"state", "changed"}};
        String result = th.solution("this is {template} {template} is {state}", input);

        assertThat(result).isEqualTo("this is string string is changed");
    }

    @Test
    void solutionTest2() {
        String[][] input = new String[][] {{"template", "string"}, {"state", "{template}"}};
        String result = th.solution("this is {template} {template} is {state}", input);

        assertThat(result).isEqualTo("this is string string is string");
    }

    @Test
    void solutionTest3() {
        String[][] input = new String[][] {{"template", "{state}"}, {"state", "{template}"}};
        String result = th.solution("this is {template} {template} is {state}", input);

        assertThat(result).isEqualTo("this is {template} {template} is {state}");
    }

    @Test
    void solutionTest4() {
        String[][] input = new String[][] {{"template", "{state}"}, {"state", "{templates}"}};
        String result = th.solution("this is {template} {template} is {state}", input);

        assertThat(result).isEqualTo("this is {templates} {templates} is {templates}");
    }

    @Test
    void solutionTest5() {
        String[][] input = new String[][] {
            {"b","{c}"},
            {"a","{b}"},
            {"e","{f}"},
            {"h","i"},
            {"d","{e}"},
            {"f","{d}"},
            {"c","d"}
        };

        String result = th.solution("{a} {b} {c} {d} {i}", input);

        assertThat(result).isEqualTo("d d d {d} {i}");
    }

}