package algorithm_sites.programmers;

import java.util.Arrays;

public class Greedy_01_TrainningClothes {

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] check = new int[100];

        Arrays.fill(check,1);

        for(int i=0; i<reserve.length; i++){
            check[reserve[i]]++;
        }

        for(int i=0; i<lost.length; i++){
            check[lost[i]]--;
        }

        for(int i=1; i<=n; i++){
            if(check[i] == 2 && check[i-1] == 0){
                check[i]--;
                check[i-1]++;
            }
            if(check[i] == 2 && check[i+1] == 0){
                check[i]--;
                check[i+1]++;
            }
        }

        for(int i=1; i<=n; i++){
            if(check[i] >= 1)answer++;
        }

        return answer;
    }

}
