package algorithm_sites.programmers.kit202212;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.reducing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Programmers_Hash_04 {

    public int solution(String[][] clothes) {
        Map<String, List<String>> map = new HashMap<>();

        for (String[] clothe : clothes) {
            if (map.containsKey(clothe[1])) {
                map.get(clothe[1]).add(clothe[0]);
                continue;
            }

            ArrayList<String> list = new ArrayList<>();
            list.add(clothe[0]);
            map.put(clothe[1], list);
        }

//        System.out.println(map);

        return map.values().stream()
            .mapToInt(List::size)
            .reduce(1, (x, y) -> x * (y+1)) - 1;
    }

    public int solution2(String[][] clothes) {
        return Arrays.stream(clothes)
            .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
            .values()
            .stream()
            .collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;
    }

}
