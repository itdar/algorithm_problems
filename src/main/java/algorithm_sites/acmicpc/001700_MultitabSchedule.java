package algorithm_sites.acmicpc;

import java.io.*;
import java.util.*;

// Process
// 1. Input countPlug, countMachine, useOrder
// 2. Iterate useOrder
//  2.1. If pug is not empty
//   2.1.1. 꽂혀있는 것들 중에서, 사용하는 물건인지 확인하고 그 중에 없으면
//                    뒤에 가장 근접하게 재사용하는 것들부터 남기고 가장 멀리있거나 다시 안쓰는 것을 뽑는다.
//   2.1.2. 뽑을 때 ++count
//  2.2. Plug new one
// 3. Return count

class MultitabSchedule {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 1.
        String[] inputStrings = br.readLine().split(" ");
        int plugCount = Integer.parseInt(inputStrings[0]);
        int countMachine = Integer.parseInt(inputStrings[1]);

        int[] useOrder = new int[countMachine];
        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < useOrder.length; ++i) {
            useOrder[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int count = 0;
        int[] plug = new int[plugCount];
        
        // 2.
        int[] distanceCounts;
        for (int i = 0; i < useOrder.length; ++i) {
            int emptyIndex = checkPlugEmptyIndex(plug);
            boolean isPluggedIn = checkAlreadyPluggedIn(plug, useOrder[i]);
            if (emptyIndex < 0 && !isPluggedIn) { // 빈자리가 없으면

                // 2.1.
                distanceCounts = new int[plug.length];
                for (int m = 0; m < plug.length; ++m) {
                    int distCount = 0;
                    boolean isFound = false;
                    for (int n = i + 1; !isFound && n < useOrder.length; ++n) {
                        ++distCount;
                        if (useOrder[n] == plug[m]) {
                            isFound = true;
                        }
                    }
                    if (isFound) {
                        distanceCounts[m] = distCount;
                    } else {
                        distanceCounts[m] = Integer.MAX_VALUE;
                    }
                }
                int maxIndex = -1;
                int maxDistance = -1;
                for (int m = 0; m < distanceCounts.length; ++m) {
                    if (distanceCounts[m] > maxDistance) {
                        maxDistance = distanceCounts[m];
                        maxIndex = m;
                    }
                }

                emptyIndex = maxIndex;

                // 2.1.1.
                ++count;
            }

            if (!isPluggedIn) {
                plug[emptyIndex] = useOrder[i];
            }
            
        }

        System.out.println(count);

        br.close();
    }
    
    public static int checkPlugEmptyIndex(int[] plug) {
        for (int i = 0; i < plug.length; ++i) {
            if (plug[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public static boolean checkAlreadyPluggedIn(int[] plug, int number) {
        for (int i = 0; i < plug.length; ++i) {
            if (number == plug[i]) {
                return true;
            }
        }
        return false;
    }
}
