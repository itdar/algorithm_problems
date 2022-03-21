package algorithm_sites.programmers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Hash_02_phone_number_prefix2Test {

    @Test
    void solutionTest_1() {
        Hash_02_phone_number_prefix2 hash2 = new Hash_02_phone_number_prefix2();

        String[] phoneBook = new String[] {"119", "97674223", "1195524421"};
        boolean result = hash2.solution(phoneBook);

        assertThat(result).isEqualTo(false);
    }

    @Test
    void solutionTest_2() {
        Hash_02_phone_number_prefix2 hash2 = new Hash_02_phone_number_prefix2();

        String[] phoneBook = new String[] {"123","456","789"};
        boolean result = hash2.solution(phoneBook);

        assertThat(result).isEqualTo(true);
    }

    @Test
    void solutionTest_3() {
        Hash_02_phone_number_prefix2 hash2 = new Hash_02_phone_number_prefix2();

        String[] phoneBook = new String[] {"12","123","1235","567","88"};
        boolean result = hash2.solution(phoneBook);

        assertThat(result).isEqualTo(false);
    }

    @Test
    void solutionTest_4() {
        Hash_02_phone_number_prefix2 hash2 = new Hash_02_phone_number_prefix2();

        String[] phoneBook = new String[] {"88","223","1235","167","1"};
        boolean result = hash2.solution(phoneBook);

        assertThat(result).isEqualTo(false);
    }

    @Test
    void solutionTest_5() {
        Hash_02_phone_number_prefix2 hash2 = new Hash_02_phone_number_prefix2();

        String[] phoneBook = new String[] {"88","223","1235","167","881"};
        boolean result = hash2.solution(phoneBook);

        assertThat(result).isEqualTo(false);
    }

}