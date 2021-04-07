package acmicpc;

import java.io.*;
import java.util.*;

// Process
// 1. Input 도시개수, 도시간기름소모량, 도시별기름가격. e.g. 4, 2 3 1, 5 2 4 1
// 2. 끝 도시 도착까지 반복한다.
//  2.1. 현재있는 도시의 기름가격보다 싼 도시까지 가는 기름을 채운다.
//  2.2. 이동한다.
// 3. 왼쪽부터 오른쪽 전체 도시를 가는 최소비용을 반환한다.

class GasStation {
    public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 1.
        int cities = Integer.parseInt(br.readLine());
        long[] gasWeights = new long[cities-1];
        long[] gasPrices = new long[cities];
        
        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < gasWeights.length; ++i) {
            gasWeights[i] = Long.parseLong(tokenizer.nextToken());
        }
        tokenizer = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < gasPrices.length; ++i) {
            gasPrices[i] = Long.parseLong(tokenizer.nextToken());
        }

        // 2.
        long sum = 0;
        int currentIndex = 0;
        long currentOilPrice = gasPrices[currentIndex];
        while (currentIndex < gasWeights.length) {
            sum += (currentOilPrice * gasWeights[currentIndex]);
            if (currentOilPrice > gasPrices[currentIndex+1]) {
                currentOilPrice = gasPrices[currentIndex+1];
            }
            ++currentIndex;
        }

        // 3.
        System.out.println(sum);
    }
}
