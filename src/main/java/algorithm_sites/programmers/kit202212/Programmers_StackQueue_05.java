package algorithm_sites.programmers.kit202212;

import java.util.Deque;
import java.util.LinkedList;

public class Programmers_StackQueue_05 {

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Deque<Truck> deque = new LinkedList<>();
        int currentWeight = 0;
        int acrossCount = 0;
        int timeSpent = 1;

        int truckIndex = 0;
        while (acrossCount < truck_weights.length) {
            if (truckIndex < truck_weights.length) {
                if (currentWeight + truck_weights[truckIndex] <= weight && deque.size() <= bridge_length) {
                    currentWeight += truck_weights[truckIndex];
                    deque.add(new Truck(bridge_length, truck_weights[truckIndex]));
                    ++truckIndex;
                }
            }

            deque.forEach(Truck::go);
            if (deque.peekFirst() != null && deque.peekFirst().remained <= 0) {
                ++acrossCount;
                currentWeight -= deque.removeFirst().weight;
            }

            ++timeSpent;
        }

        return timeSpent;
    }

    private static class Truck {
        private int remained;
        private int weight;

        public Truck(int remained, int weight) {
            this.remained = remained;
            this.weight = weight;
        }

        public void go() {
            --this.remained;
        }
    }

}
