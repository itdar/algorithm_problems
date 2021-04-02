package acmicpc;

import java.io.*;

class Fibonacci {
    // Process
    // 1. Input n
    // 2. Get fibonacci number
    // 3. Return n'th fibonacci
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] fibos = new int[n+1];
        fibos[0] = 0;
        fibos[1] = 1;

        for (int i = 2; i < n+1; ++i) {
            fibos[i] = fibos[i-1] + fibos[i-2];
        }

        System.out.println(fibos[n]);
    }
}