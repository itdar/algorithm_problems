package leetcode;

public class LeetCode_1732_FindTheHighestAltitude {

  public int largestAltitude(int[] gain) {
    int highest = 0;
    int current = 0;

    for (int i = 0; i < gain.length; ++i) {
      current += gain[i];

      if (current > highest) {
        highest = current;
      }
    }

    return highest;
  }

}
