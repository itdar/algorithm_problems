package algorithm_sites.programmers;

import java.util.*;

public class KkoBanProblem03 {
    static int[] prices;

    public static int solution(int n, int[] price) {
        if (n <= 1) return 0;

        prices = price;

        int index = 0;
        for (int i = 0; i < n; ++i) {
            if (price[i] == 0) {
                index = i;
                break;
            }
        }

        Map<Integer, Integer> buyMap = new HashMap<>();

        return recursiveInterest(index, n, 0, buyMap);
    }

    public static int recursiveInterest(int index, int n, int money, Map<Integer, Integer> buyMap) {

        if (index >= n ) return money;

        if (prices[index] <= money) {
            if (buyMap.containsKey(prices[index])) {
                buyMap.put(prices[index], buyMap.get(prices[index]) + 1);
            } else {
                buyMap.put(prices[index], 1);
            }
            money -= prices[index];
        }

        if (!buyMap.isEmpty()) {
            for (Integer buyPrice : buyMap.keySet()) {
                if (buyPrice < prices[index]) {
                    money += buyMap.get(buyPrice) * prices[index];
                    buyMap.put(buyPrice, 0);
                }
            }
        }

        for (int i = index+1; i < n; ++i) {
            return recursiveInterest(i, n, money, cloneMap(buyMap));
        }
        return money;
    }

    private static Map<Integer, Integer> cloneMap(Map<Integer, Integer> map) {
        Map<Integer, Integer> buyMap = new HashMap<>();
        for (Integer key : map.keySet()) {
            buyMap.put(key, map.get(key));
        }
        return buyMap;
    }

    public static void main(String args[]) {
        int[] price1 = new int[] {0,1,2};
        int n1 = price1.length;
        int[] price2 = new int[] {1,0,0};
        int n2 = price2.length;
        int[] price3 = new int[] {0,2,1,1,2};
        int n3 = price3.length;

        int result1 = solution(n1, price1);
        int result2 = solution(n2, price2);
        int result3 = solution(n3, price3);

        System.out.println(result1 + " == 2");
        System.out.println(result2 + " == 0");
        System.out.println(result3 + " == 4");
    }

}

