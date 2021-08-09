package algorithm_sites.programmers;

import java.util.ArrayList;
import java.util.List;

public class SShopProblem03 {
    public static int[] solution(int N, int[] coffee_times) {
        int[] answer = new int[coffee_times.length];

        int coffee_times_index = 0;

        List<Item> items = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            items.add(new Item(i+1, coffee_times[i]));
            ++coffee_times_index;
        }
        int min;
        List<Integer> answerList = new ArrayList<>();
        while (answerList.size() < coffee_times.length) {
            min = Integer.MAX_VALUE;
            for (int i = 0; i < items.size(); ++i) {
                if (min > items.get(i).remainedTime) {
                    min = items.get(i).remainedTime;
                }
            }

            for (int i = 0; i < items.size(); ++i) {
                items.get(i).remainedTime -= min;
            }

            for (int i = 0; i < items.size(); ++i) {
                if (items.get(i).remainedTime <= 0) {
                    answerList.add(items.get(i).orderNumber);
                    items.remove(i--);
                    if (coffee_times_index < coffee_times.length) {
                        items.add(new Item(coffee_times_index+1, coffee_times[coffee_times_index++]));
                    }
                }
            }
        }

        for (int i = 0; i < answerList.size(); ++i) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    static class Item {
        int orderNumber;
        int remainedTime;
        public Item(int orderNumber, int remainedTime) {
            this.orderNumber = orderNumber;
            this.remainedTime = remainedTime;
        }

        @Override
        public String toString() {
            return "["+orderNumber+","+remainedTime+"]";
        }
    }

    public static void main(String args[]) {
        int[] result = solution(3, new int[] {4, 2, 2, 5, 3});

        for (int i = 0; i < result.length; ++i) {
            System.out.print(result[i] + ", ");
        }
    }

}
