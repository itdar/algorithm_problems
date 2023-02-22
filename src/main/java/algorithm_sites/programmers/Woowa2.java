package algorithm_sites.programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Woowa2 {

    public String solution(String[] leftArray, String[] rightArray) {
        Set<String> set = new HashSet<>(Arrays.asList(leftArray));

        return Arrays.stream(rightArray)
            .filter(s -> set.contains(s))
            .sorted()
            .collect(Collectors.joining(","));
    }

}
