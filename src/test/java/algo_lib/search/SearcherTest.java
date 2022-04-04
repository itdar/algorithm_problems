package algo_lib.search;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SearcherTest {

    private Searcher searcher = new Searcher();

    @Test
    void binarySearchTest1() {
        int resultIndex = searcher.binarySearch(new int[]{7, 3, 4, 5, 6, 35, 1}, 35);

        assertThat(resultIndex).isEqualTo(5);
    }

    @Test
    void binarySearchTest2() {
        int resultIndex = searcher.binarySearch(new int[]{7, 3, 4, 5, 6, 35, 1}, 7);

        assertThat(resultIndex).isEqualTo(-1);
    }

}