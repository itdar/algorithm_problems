package algorithm_sites.programmers;

import java.util.*;

public class CoupTransProblem02 {

    public static int[] solution(int n, int[][] record) {
        // <번호, 총입찰액>
        Map<Integer, Stack<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; ++i) {
            map.put(i+1, new Stack<>());
        }

        for (int i = 0; i < record.length; ++i) {
            if (map.containsKey(record[i][0])) {
                if (record[i][1] == -1) {
                    map.get(record[i][0]).pop();
                } else {
                    map.get(record[i][0]).push(record[i][1]);
                }
            }
        }

//        System.out.println(map);

        List<Bid> bids = new ArrayList<>();
        for (Integer index : map.keySet()) {
            if (map.get(index).empty()) {
                bids.add(new Bid(index, 0));
            } else {
                bids.add(new Bid(index, map.get(index).pop()));
            }
        }
        Collections.sort(bids, (o1, o2) -> {
            if (o1.money < o2.money) {
                return 1;
            } else if (o1.money == o2.money) {
                return 0;
            } else {
                return -1;
            }
        });

        int[] answer = new int[bids.size()];

        for (int i = 0; i < answer.length; ++i) {
            answer[i] = bids.get(i).index;
        }

        return answer;
    }

    static class Bid {
        int index;
        int money;

        private Bid(int index, int money) {
            this.index = index;
            this.money = money;
        }

        public static Bid of(int index, int money) {
            return new Bid(index, money);
        }
    }
    
    public static void main(String args[]) {
        int[] result1 = solution(3, new int[][]{{1, 100}, {2, 150}, {3, 300}, {1, 200}, {2, 250}, {3, 350}, {2, -1}, {3, -1}, {3, 190}});
        for (int num : result1) {
            System.out.print(num + " ");
        } System.out.println("");

        int[] result2 = solution(4, new int[][]{{4, 120}, {3, 200}, {4, 220}, {4, 150}, {4, 250}, {2, 150}, {4, -1}, {4, -1}, {2, 200}, {4,300},{4,200},{2,150},{4,-1},{2,-1},{4,100},{4,-1},{3,-1},{2,-1},{4,-1},{4,-1}});
        for (int num : result2) {
            System.out.print(num + " ");
        } System.out.println("");
    }

}
