package acmicpc;

import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        //input
        Scanner scanner = new Scanner(System.in);
        
        int candies = scanner.nextInt();
        
        // Process
        // 1. Input n
        // 2. 5씩 배달할 수 있는 최대 횟수를 구한다.
        // 3. 만족할 때까지 반복한다.
        //  3.1. 최대횟수로 5씩 배달하고 남은 나머지가 3의 배수인지 확인한다.
        //   3.1.1. 3의 배수이면 -> 만족하고 끝, 5횟수와 3횟수를 더한 값 리턴
        //   3.1.2. 아니면 -> 5의 최대횟수를 줄이고, 나머지에 5를 더한다.
        //    3.1.2.1. 이 때, 5의 최대횟수가 0보다 작으면 (5, 3으로 해결 할 수 없는 숫자이면) -> -1로 종료한다.
        
        //logic
        int deliveryCount = 0;
        boolean isDone = false;

        if (candies == 3) {
            deliveryCount = 1;
            isDone = true;
        }
        if (candies == 4) {
            deliveryCount = -1;
            isDone = true;
        }
        
        if (!isDone) {
            int maxFive = candies / 5;
            int fiveRemainder = candies % 5;
            
            while (!isDone) {
                if (fiveRemainder % 3 == 0) {
                    isDone = true;
                    deliveryCount = maxFive + (fiveRemainder / 3);
                } else {
                    if (maxFive > 0) {
                        --maxFive;
                        fiveRemainder += 5;
                    } else {
                        deliveryCount = -1;
                        isDone = true;
                    }
                }
            }
        }

        //output
        System.out.println(deliveryCount);
    }
}