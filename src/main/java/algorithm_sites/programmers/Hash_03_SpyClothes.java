package algorithm_sites.programmers;

import java.util.HashMap;
import java.util.Map;

public class Hash_03_SpyClothes {

    public int solution(String[][] clothes) {
        if (clothes.length == 0) return 0;

        Map<String, Integer> map = new HashMap<>();

        for (String[] cloth : clothes) {
            String type = cloth[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        int result = 1;
        for (Integer value : map.values()) {
            result = result * (value + 1);
        }

        return result - 1;
    }

}
