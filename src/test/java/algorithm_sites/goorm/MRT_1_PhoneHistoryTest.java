package algorithm_sites.goorm;

import static algorithm_sites.goorm.MRT_1_PhoneHistory.solution;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class MRT_1_PhoneHistoryTest {

    @Test
    void solutionTest1() {

        List<String> strings = Arrays.asList(
            "SMS 010-1234-5678",
            "CALL 010-1234-5678",
            "CALL 010-1234-5678",
            "SMS 010-1111-1111",
            "SMS 010-5555-5555",
            "CALL 010-5555-5555",
            "CALL 010-5555-5555",
            "CALL 010-4444-4444",
            "SMS 010-5555-5555",
            "CALL 010-5555-5555"
        );

        List<String> result = solution(strings);

        for (String s : result) {
            System.out.println(s);
        }

        assertThat(result).containsExactly(
            "8",
            "SMS 010-1234-5678",
            "CALL 010-1234-5678 (2)",
            "SMS 010-1111-1111",
            "SMS 010-5555-5555",
            "CALL 010-5555-5555 (2)",
            "CALL 010-4444-4444",
            "SMS 010-5555-5555",
            "CALL 010-5555-5555"
        );
    }

    @Test
    void solutionTest2() {

        List<String> strings = Arrays.asList(
            "SMS 010-1234-5678"
        );

        List<String> result = solution(strings);

        System.out.println(result);

        assertThat(result).containsExactly(
            "1",
            "SMS 010-1234-5678"
        );
    }

    @Test
    void solutionTest3() {

        List<String> strings = Arrays.asList(
            "SMS 010-1234-5678",
            "SMS 010-1234-5678"
        );

        List<String> result = solution(strings);

        System.out.println(result);

        assertThat(result).containsExactly(
            "1",
            "SMS 010-1234-5678 (2)"
        );
    }

    @Test
    void solutionTest4() {

        List<String> strings = Arrays.asList();

        List<String> result = solution(strings);

        System.out.println(result);

        assertThat(result).containsExactly(
            "0"
        );
    }

}
