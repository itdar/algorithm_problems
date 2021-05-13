package algorithm_sites.acmicpc;

import java.util.*;
import java.io.*;

// Process (Iteration)
// 1. Input n, m, cardNumbers
// 2. Iterate all combination
//  2.1. Get nearest number under m
// 3. Return number

class Blackjack {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        int[] cardNumbers = new int[n];
        tokenizer = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; ++i) {
            cardNumbers[i] = Integer.parseInt(tokenizer.nextToken());
        }

        boolean isDone = false;
        int max = 0;
        int length = cardNumbers.length;
        scope: 
        for (int i = 0; i < length; ++i) {
            for (int j = i+1; j < length; ++j) {
                for (int k = j+1; k < length; ++k) {
                    int sum = cardNumbers[i] + cardNumbers[j] + cardNumbers[k];
                    if (sum <= m) {
                        max = Math.max(max, sum);
                    }
                    if (max == m) {
                        isDone = true;
                        // break;
                        break scope;
                    }
                }
            }
        }

        System.out.println(max);
    }
}