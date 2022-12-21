package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class Programmers_Hash_02Test {

    private Programmers_Hash_02 programmers_hash_02 = new Programmers_Hash_02();

//    @Test
    void substringTest() {
        String testString = "testString";

        String substring = testString.substring(0, 4);

        System.out.println(substring);
    }

//    @Test
    void arraySortTest() {
        String[] phone_book = new String[] {"12","123","1235","567","88"};

        Arrays.sort(phone_book, (a, b) -> {
            if (a.length() >= b.length()) {
                return 1;
            }
            return -1;
        });

        for (String s : phone_book) {
            System.out.println(s + ",");
        }
    }

    @Test
    void solutionTest1() {
        String[] phone_book = new String[] {"119", "97674223", "1195524421"};

        boolean result = programmers_hash_02.solution(phone_book);

        assertThat(result).isFalse();
    }
    @Test
    void solutionTest2() {
        String[] phone_book = new String[] {"123","456","789"};

        boolean result = programmers_hash_02.solution(phone_book);

        assertThat(result).isTrue();
    }
    @Test
    void solutionTest3() {
        String[] phone_book = new String[] {"12","123","1235","567","88"};

        boolean result = programmers_hash_02.solution(phone_book);

        assertThat(result).isFalse();
    }
    @Test
    void solutionTest4() {
        String[] phone_book = new String[] {"7","12","13","144"};

        boolean result = programmers_hash_02.solution(phone_book);

        assertThat(result).isTrue();
    }

}
