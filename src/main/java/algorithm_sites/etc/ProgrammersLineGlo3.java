package algorithm_sites.etc;

public class ProgrammersLineGlo3 {

//    private int count = 0;
//
//    public int solution(int n, int[] bankbook) {
//        if (bankbook == null || bankbook.length ==0) {
//            return 0;
//        }
//
//        Arrays.sort(bankbook);
//
//        count = bankbook.length;
//        int frontIndex = 0;
//        int prevSum = bankbook[bankbook.length-1];
//        for (int i = bankbook.length-1; i >= 0 && i > frontIndex; --i) {
//            if (bankbook[frontIndex] + prevSum <= n) {
//                --count;
//                ++i;
//                ++frontIndex;
//                prevSum += bankbook[frontIndex];
//            } else {
//                if (i-1 >= 0) {
//                    prevSum = bankbook[i-1];
//                }
//            }
//        }
//
//        return count;
//    }

    /**
     * 기존에 생각했던건,
     * 오름차순 정렬해두고
     * 넣을 수 있는 최대치로 채우면서 양쪽 인덱스를 줄여나가면 되려나 했는데 안되길래
     *
     * 다시 생각한건 완전탐색 (최대 12!)
     * 필드: 최소카운트개수, 방문기록배열
     * 재귀호출을 하는데
     *   전체개수 depth 까지 진행해서 당시의 최소카운트 비교 갱신.
     *   전체를 순회하면서 방문하지 않은 것을 체크하고 들어가는데,
     *   중요한 것은, 이전까지의 돈 합과 현재의 돈 합이 max 를 넘지 않으면 count 는 그대로 로 다음 depth 이동
     *     왜냐면, count 는 새로운 통장을 개설하는 것을 의미한다.
     *   이전까지의 돈 합과 현재의 돈 합이 max 를 넘으면 count+1 로 다음 depth 이동
     *   빠져나오면 방문해제한다.
     * 저장된 카운트 중에서 최소값
     */

    private boolean[] visited = null;
    private int min = Integer.MAX_VALUE;

    public int solution(int maxDeposit, int[] bankbook) {
        min = bankbook.length;
        visited = new boolean[bankbook.length];

        for (int i = 0; i < bankbook.length; ++i) {
            visited[i] = true;
            backtracking(bankbook[i], maxDeposit, bankbook, 1, 1);
            visited[i] = true;
        }

        return min;
    }

    /**
     * backtracking
     *
     * 12개의 경우에
     * 완전탐색 은 2~ 3 sec
     * backtracking 은 300~ 400 ms
     */
    private void backtracking(int prevMoneySum, int maxDeposit, int[] bankbook, int depth, int depositCount) {
        if (depositCount >= min) {
            return;
        }

        if (depth >= bankbook.length) {
            min = Math.min(min, depositCount);
            return;
        }

        for (int k = 0; k < bankbook.length; ++k) {
            int currentMoney = bankbook[k];
            int moneySum = prevMoneySum + currentMoney;
            if (!visited[k]) {
                visited[k] = true;
                if (moneySum <= maxDeposit) {
                    backtracking(moneySum, maxDeposit, bankbook, depth+1, depositCount);
                } else {
                    backtracking(currentMoney, maxDeposit, bankbook, depth+1, depositCount+1);
                }
                visited[k] = false;
            }
        }
    }

}
