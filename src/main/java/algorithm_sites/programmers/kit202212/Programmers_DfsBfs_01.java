package algorithm_sites.programmers.kit202212;

public class Programmers_DfsBfs_01 {

    private int count = 0;

    public int solution(int[] numbers, int target) {
        recursiveNumbers(numbers, target, 0, 0);

        return count;
    }

    private void recursiveNumbers(int[] numbers, int target, int index, int current) {
        if (index >= numbers.length && target == current) {
            ++count;
            return;
        }

        if (index >= numbers.length) {
            return;
        }

        recursiveNumbers(numbers, target, index + 1, current + numbers[index]);
        recursiveNumbers(numbers, target, index + 1, current - numbers[index]);
    }

}
