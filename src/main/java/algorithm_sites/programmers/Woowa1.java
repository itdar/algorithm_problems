package algorithm_sites.programmers;

import java.util.Arrays;

public class Woowa1 {

    public String solution(String[] params) {
        return Arrays.stream(params)
            .parallel()
            .map(String::toUpperCase)
            .filter(s -> s.length() >= 5 && s.length() <= 10)
            .findFirst()
            .orElse("없음");
    }

}
