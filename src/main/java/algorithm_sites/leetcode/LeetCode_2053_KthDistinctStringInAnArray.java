package algorithm_sites.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LeetCode_2053_KthDistinctStringInAnArray {

    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; ++i) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            if (stringIntegerEntry.getValue() == 1) {
                --k;

                if (k == 0) {
                    return stringIntegerEntry.getKey();
                }
            }
        }

        return "";
    }

    public static void main(String args[]) {
        LeetCode_2053_KthDistinctStringInAnArray test = new LeetCode_2053_KthDistinctStringInAnArray();

        String[] input = new String[] {"d", "b", "c", "b", "c", "a"};
        int k = 2;

        String result = test.kthDistinct(input, k);

        System.out.println("result: " + result);
    }

}
