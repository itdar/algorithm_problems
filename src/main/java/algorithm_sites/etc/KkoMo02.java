package algorithm_sites.etc;

public class KkoMo02 {

    private int count = 1;
    private boolean[] learned;

    public int solution(int[] T, int[] A) {
        learned = new boolean[T.length];

        for (int newSkillIndex : A) {
            recursive(T, newSkillIndex);
        }

        return count;
    }

    private void recursive(int[] T, int newSkillIndex) {
        if (newSkillIndex == 0) {
            return;
        }

        if (!learned[newSkillIndex]) {
            learned[newSkillIndex] = true;
            ++count;

            recursive(T, T[newSkillIndex]);
        }
    }

}
