package algorithm_sites.programmers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Woowa2Test {

    private Woowa2 ww = new Woowa2();

    @Test
    void solutionTest1() {
        String[] leftArray = new String[] {"a","b","c"};
        String[] rightArray = new String[] {"b","c","d"};
        String result = ww.solution(leftArray, rightArray);
        assertThat(result).isEqualTo("b,c");
    }

    @Test
    void solutionTest2() {
        String[] leftArray = new String[] {"b","b","a"};
        String[] rightArray = new String[] {"d","c","b"};
        String result = ww.solution(leftArray, rightArray);
        assertThat(result).isEqualTo("b");
    }

}
