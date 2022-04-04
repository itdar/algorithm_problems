package algorithm_sites.programmers;

public class DfsBfs_01_TargetNumber {

    private int count = 0;

    public int solution(int[] numbers, int targetNumber) {
        int maxDepth = numbers.length;

        dfs(numbers, 0, 0, targetNumber, 0, maxDepth);

        return count;
    }

    private void dfs(int[] numbers, int index, int numberSum, int targetNumber, int depth, int maxDepth) {
        if (depth == maxDepth) {
            if (numberSum == targetNumber) {
                ++count;
            }
            return;
        }

        dfs(numbers, index+1, numberSum+numbers[index], targetNumber, depth+1, maxDepth);
        dfs(numbers, index+1, numberSum-numbers[index], targetNumber, depth+1, maxDepth);
    }

}
