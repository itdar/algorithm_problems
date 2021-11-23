package algorithm_sites.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_0739_DailyTemperatures {

  public int[] dailyTemperatures(int[] temperatures) {
    int[] results = new int[temperatures.length];

    List<Integer> temperatureList = new ArrayList<>();

    for (int i = 0; i < temperatures.length; ++i) {
      int temperature = temperatures[i];

      for (int j = 0; j < temperatureList.size(); ++j) {
        if (temperatureList.get(j) < temperature) {

        }
      }
    }

    return results;
  }

}
