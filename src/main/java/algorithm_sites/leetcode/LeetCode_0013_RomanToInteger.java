package algorithm_sites.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_0013_RomanToInteger {

    public static int romanToInt_2(String s) {
        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        if (s.length() == 0) {
            return 0;
        }
        if (s.length() < 2) {
            return map.get(s.charAt(0));
        }

        int sum = 0;
        for (int i = 0; i < s.length()-1; ++i) {
            Integer number = map.get(s.charAt(i));
            Integer nextNumber = map.get(s.charAt(i+1));

            if (number < nextNumber) {
                sum += (nextNumber - number);
                ++i;
                continue;
            }

            sum += map.get(s.charAt(i));
        }

            if (map.get(s.charAt(s.length()-2)) >= map.get(s.charAt(s.length()-1))) {
                return sum + map.get(s.charAt(s.length()-1));
            }

            return sum;
    }

    public static int romanToInt_1(String s) {
        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        for (int i = 0; i < s.length(); ++i) {
            Integer number = map.get(s.charAt(i));
            if (i < s.length() - 1) {
                Integer nextNumber = map.get(s.charAt(i+1));
                if (number < nextNumber) {
                    sum += (nextNumber - number);
                    ++i;
                    continue;
                }
            }
            sum += map.get(s.charAt(i));
        }

        return sum;
    }

    public static void main(String[] args) {
        int result1 = romanToInt_2("IV");
        int result2= romanToInt_2("III");
        int result3 = romanToInt_2("MDCXCV");

        System.out.println("Should be 4, it's " + result1);
        System.out.println("Should be 3, it's " + result2);
        System.out.println("Should be 1695, it's " + result3);
    }

}
