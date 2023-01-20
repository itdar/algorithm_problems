package algorithm_sites.programmers.kit202212;

public class Programmers_DynamicProgramming_02 {

    public int solution(int[][] triangle) {
        int answer = 0;

        for (int i = 0; i < triangle.length; ++i) {
            for (int j = 0; j < triangle[i].length; ++j) {
                recursive(i, j, triangle, current);
            }
        }

        return answer;
    }

    private void recursive(int i, int j, int[][] triangle, int current) {

    }

}
