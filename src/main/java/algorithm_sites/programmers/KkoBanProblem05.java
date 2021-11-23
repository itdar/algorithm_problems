package algorithm_sites.programmers;

public class KkoBanProblem05 {

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; ++i) {
            int count = 0;
            for (int j = i; j < prices.length; ++j) {
                if (prices[j] > prices[i]) {
                    ++count;
                }
            }
            answer[i] = count;
        }

        return answer;
    }

    public static void main(String args[]) {
        int[] result1 = solution(new int[]{5,3,7,9,5,2,4,9,10,6});
        int[] result2 = solution(new int[]{5,4,3,2,1,2,3,4,5});

        for (int result : result1) {
            System.out.print(result + " ");
        } System.out.println();
        for (int result : result2) {
            System.out.print(result + " ");
        } System.out.println();
    }

}
