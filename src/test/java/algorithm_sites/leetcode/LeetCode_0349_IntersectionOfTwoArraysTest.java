package algorithm_sites.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class LeetCode_0349_IntersectionOfTwoArraysTest {

    @Test
    public void intersectionTest() {
        LeetCode_0349_IntersectionOfTwoArrays test = new LeetCode_0349_IntersectionOfTwoArrays();

        assertThat(test.intersection(new int[]{1,2,2,1}, new int[]{2,2})).containsOnly(new int[]{2});
        assertThat(test.intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4})).containsOnly(new int[]{4,9});
    }

}
