package algorithm_sites.programmers.kit202212;

import java.util.Arrays;

public class Programmers_Sort_01 {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; ++i) {
            int[] command = commands[i];
            int[] copiedArray = Arrays.copyOfRange(array, command[0]-1, command[1]);
            Arrays.sort(copiedArray);
            answer[i] = copiedArray[command[2]-1];
        }

        return answer;
    }

}
