package algorithm_sites.acmicpc;

import java.util.Scanner;

class CoinZero {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int coinNumber = sc.nextInt();
        int goalValue = sc.nextInt();
        int[] coins = new int[coinNumber];
        for(int i = 0; i < coinNumber; ++i)
            coins[i] = sc.nextInt();

        int count = 0;

        int validCount;
        for (int i = coins.length-1; i >= 0; --i) {
            validCount = goalValue / coins[i];
            count += validCount;
            goalValue = goalValue - (coins[i] * validCount);
        }

        System.out.println(count);
    }

}