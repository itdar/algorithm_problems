package algorithm_sites.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class LeetCode_2085_CountCommonWordsWithOneOccurrenceTest {

    @Test
    public void 두개의_배열에서_각각_1회씩만_나오면서_겹치는_숫자의_개수() {
        LeetCode_2085_CountCommonWordsWithOneOccurrence test = new LeetCode_2085_CountCommonWordsWithOneOccurrence();

        assertThat(test.countWords(new String[] {"leetcode", "is", "amazing", "as", "is"}, new String[] {"amazing", "leetcode", "is"})).isEqualTo(2);
        assertThat(test.countWords(new String[] {"b","bb","bb"}, new String[] {"a","aa","aaa"})).isEqualTo(0);
        assertThat(test.countWords(new String[] {"a", "ab"}, new String[] {"a","a", "a", "ab"})).isEqualTo(1);
    }

}
