package algorithm_sites.acmicpc;

import java.util.*;

// Process
// 1. Input countGate, countAirplane, airplanes
// 2. Iterate airplanes while docking status true
//  2.1. 비행기입력번호 이하의 게이트 위치에 도킹이 가능한 곳을 찾아 채운다.
//  2.2. 도킹하면 개수 센다.
//   2.2.1. 없으면 종료한다.
// 3. 개수 출력한다.

class Airport {

    public static void main(String[] args) {
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        int countGate = scanner.nextInt();
        int countAirplanes = scanner.nextInt();

        boolean[] gatesFull = new boolean[countGate];
        int[] airplaneIndexes = new int[countAirplanes];
        for (int i = 0; i < countAirplanes; ++i) {
            airplaneIndexes[i] = scanner.nextInt()-1;
        }

        // 2.
        boolean dockingStatus = true;
        int i = 0;
        while (i < airplaneIndexes.length) {
            int planeIndex = airplaneIndexes[i];
            boolean foundEmptyGate = false;
            while (planeIndex >= 0) {
                if (!gatesFull[planeIndex]) {
                    gatesFull[planeIndex] = true;
                    foundEmptyGate = true;
                    ++count;
                    break;
                }
                --planeIndex;
            }
            if (!foundEmptyGate) {
                break;
            }
            ++i;
        }

        // 3. 
        System.out.println(count);
    }
    
}
