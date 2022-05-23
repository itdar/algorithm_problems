package algorithm_sites.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class KkoInternship2019Winter_Tuple {

    public int[] solution(String s) {

        Set<Integer> set = new LinkedHashSet<>();
        List<String> list = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        boolean isOpen = false;
        char character;
        for (int i = 0; i < s.length(); ++i) {
            character = s.charAt(i);

            if (character == '{')
                isOpen = true;

            if (character != '{' && character != '}' && isOpen) {
                sb.append(character);
                continue;
            }

            if (character == '}' && isOpen) {
                list.add(sb.toString().trim());
                sb = new StringBuilder();
                isOpen = false;
            }
        }

        list.sort((Comparator.comparingInt(String::length)));

        for (int i = 0; i < list.size(); ++i) {
            String[] split = list.get(i).split(",");
            List<Integer> collect = Arrays.stream(split).collect(Collectors.toList())
                .stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

            set.addAll(collect);
        }

        int[] answer = new int[set.size()];
        int i = 0;
        for (Integer integer : set) {
            answer[i++] = integer;
        }

        return answer;
    }

}
