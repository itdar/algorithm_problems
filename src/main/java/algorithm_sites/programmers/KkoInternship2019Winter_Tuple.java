package algorithm_sites.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

class KkoInternship2019Winter_Tuple_Solution {
    public int[] solution(String s) {
        String[] stringArray = s.substring(2, s.length() - 2).split("},\\{");
        Set<Integer> result = new LinkedHashSet<>();


        // inputMap
        // 3: 1,2,3
        // 2: 2,1
        // 4: 1,2,4,3
        // 1: 2
        Map<Integer, int[]> inputMap = new HashMap<>();
        for (String a : stringArray) {
            int[] temp = Stream.of(a.split(",")).mapToInt(Integer::parseInt).toArray();
            inputMap.put(temp.length, temp);
        }

        // key 값 1 부터 사이즈 만큼 순회
        for (int i=1; i<=inputMap.keySet().size(); i++) {
            int[] temp = inputMap.get(i);
            for (int t : temp) {
                result.add(t);
            }
        }

        return result.stream().mapToInt(i->i).toArray();
    }
}
