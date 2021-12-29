package algorithm_sites.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Written by Gin (thesockerr@gmail.com) on 2021/12/29.
 */
public class LeetCode_0202_HappyNumberTest {

    @Test
    public void isHappyTest() {
        LeetCode_0202_HappyNumber test = new LeetCode_0202_HappyNumber();

        assertThat(test.isHappy(19)).isEqualTo(true);
        assertThat(test.isHappy(2)).isEqualTo(false);
    }

}
