package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class LC_00049_GroupAnagramsTest {

    private LC_00049_GroupAnagrams anagrams = new LC_00049_GroupAnagrams();;

    @Test
    void groupAnagramsTest_1() {
        String[] input = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> result = anagrams.groupAnagrams(input);

        System.out.println("result = " + result);

        List<List<String>> targets = Arrays.asList(Arrays.asList("bat"),
            Arrays.asList("nat", "tan"),
            Arrays.asList("ate", "eat", "tea"));

//        for (List<String> strings : result) {
//            assertThat(strings).containsExactlyInAnyOrderElementsOf()
//        }
    }

    @Test
    void groupAnagramsTest_2() {
        String[] input = {""};

        List<List<String>> result = anagrams.groupAnagrams(input);

        assertThat(result).contains(Arrays.asList(""));
    }

    @Test
    void groupAnagramsTest_3() {
        String[] input = {"a"};

        List<List<String>> result = anagrams.groupAnagrams(input);

        assertThat(result).contains(Arrays.asList("a"));
    }

}