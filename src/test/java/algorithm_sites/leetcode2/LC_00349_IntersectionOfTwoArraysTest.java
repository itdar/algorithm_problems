package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LC_00349_IntersectionOfTwoArraysTest {

    private LC_00349_IntersectionOfTwoArrays intersectionOfTwoArrays = new LC_00349_IntersectionOfTwoArrays();

    @Test
    void intersectionTest1() {
        int[] results = intersectionOfTwoArrays.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});

        assertThat(results).contains(2);
    }

    @Test
    void intersectionTest2() {
        int[] results = intersectionOfTwoArrays.intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4});

        assertThat(results).contains(4,9);
    }

    @Test
    void intersectionTest3() {
        int[] results = intersectionOfTwoArrays.intersection(new int[]{3,4}, new int[]{1,2});

        assertThat(results).contains();
    }

    @Test
    void intersectionTest4() {
        int[] results = intersectionOfTwoArrays.intersection(new int[]{1, 2, 2, 3}, new int[]{1,2,3});

        assertThat(results).contains(3,2,1);
    }

}
