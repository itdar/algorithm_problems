package algorithm_sites.programmers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CollectionDictionaryTest {

    @Test
    void solutionTest1() {
        CollectionDictionary dict = new CollectionDictionary();

        int result = dict.solution("AAAAE");

        assertThat(result).isEqualTo(6);
    }
    @Test
    void solutionTest2() {
        CollectionDictionary dict = new CollectionDictionary();

        int result = dict.solution("AAAE");

        assertThat(result).isEqualTo(10);
    }
    @Test
    void solutionTest3() {
        CollectionDictionary dict = new CollectionDictionary();

        int result = dict.solution("I");

        assertThat(result).isEqualTo(1563);
    }
    @Test
    void solutionTest4() {
        CollectionDictionary dict = new CollectionDictionary();

        int result = dict.solution("EIO");

        assertThat(result).isEqualTo(1189);
    }

}
