package algorithm_sites.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("LeetCode 1837")
public class LeetCode_1837_SumOfDigitsInBaseKTest {

    private LeetCode_1837_SumOfDigitsInBaseK tester = new LeetCode_1837_SumOfDigitsInBaseK();
    @Test
    public void sumBaseTest1() {
        int n = 34;
        int k = 6;

        int result = tester.sumBase(n, k);

        assertThat(result).isEqualTo(9);

    }

    @Test
    public void sumBaseTest2() {
        int n = 10;
        int k = 10;

        int result = tester.sumBase(n, k);

        assertThat(result).isEqualTo(1);
    }

    @Test
    public void sumBaseTest3() {
        int n = 42;
        int k = 2;

        int result = tester.sumBase(n, k);

        assertThat(result).isEqualTo(3);
    }

    @Test
    public void sumBaseTest4() {
        int n = 5;
        int k = 5;

        int result = tester.sumBase(n, k);

        assertThat(result).isEqualTo(1);
    }

    @Test
    public void convertBaseFromDecimalTest() {
        assertThat(tester.convertBaseFromDecimal(34, 6)).isEqualTo("54");
        assertThat(tester.convertBaseFromDecimal(42, 2)).isEqualTo("101010");
    }

    @Test
    public void findMaximumPowValueTest() {
        assertThat(tester.findMaximumPowValue(34, 6)).isEqualTo(1);
        assertThat(tester.findMaximumPowValue(42, 2)).isEqualTo(5);
    }
}
