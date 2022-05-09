package algorithm_sites.programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KkoBlind20219_FailureRate {

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= N+1; ++i) {
            map.put(i, 0);
        }

        for (int stage : stages) {
            map.put(stage, map.get(stage) + 1);
        }

        List<Fail> failRate = new ArrayList<>();

        double sum;
        double fail;
        for (int i = 1; i <= N; ++i) {
            double stay = map.get(i);

            sum = 0;
            for (int j = i; j <= N+1; ++j) {
                sum += map.get(j);
            }

            if (sum == 0) {
                fail = 0;
            } else {
                fail = stay/sum;
            }
            failRate.add(new Fail(i, fail));
        }

        failRate.sort((o1, o2) -> Double.compare(o2.failRate, o1.failRate));

        for (int i = 0; i < N; ++i) {
            answer[i] = failRate.get(i).stageIndex;
        }

        return answer;
    }

    class Fail {
        int stageIndex;
        double failRate;

        public Fail(int stageIndex, double failRate) {
            this.stageIndex = stageIndex;
            this.failRate = failRate;
        }
    }

}
