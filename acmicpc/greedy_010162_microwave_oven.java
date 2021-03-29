package acmicpc;

import java.util.*;

// Process
// 1. Input cooking time
// 2. Iterate till cooking time is remained
//  2.1. 남은 시간이 어떤 버튼을 누를 수 있는지 확인한다.
//  2.2. 누를 수 있는 최대 버튼을 누르고 시간을 줄인다.
//  2.3. 횟수를 센다.
// 3. Return count

class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int cookingTime = sc.nextInt();

        int buttonA = 300;
        int buttonB = 60;
        int buttonC = 10;
        
        int countButtonA = 0;
        int countButtonB = 0;
        int countButtonC = 0;

        while (cookingTime > 0) {
            if (cookingTime >= buttonA) {
                cookingTime -= buttonA; 
                ++countButtonA;
            } else if (cookingTime >= buttonB) {
                cookingTime -= buttonB; 
                ++countButtonB;
            } else if (cookingTime >= buttonC) {
                cookingTime -= buttonC; 
                ++countButtonC;
            } else {
                cookingTime = -1;
            }
        }
        if (cookingTime >= 0)
            System.out.print(countButtonA + " " + countButtonB + " " + countButtonC);
        else
            System.out.println(-1);
    }
}