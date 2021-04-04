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

        // int fibonacci = FibonnaciDynamicUpper(n);
        int fibonacci = FibonnaciRecursive(n);

        System.out.println(fibonacci);
    }

    public static int FibonnaciDynamicUpper(int n) {
        if (n == 0 || n == 1) return n;
        
        int[] fibos = new int[n+1];
        fibos[0] = 0;
        fibos[1] = 1;
        for (int i = 2; i < fibos.length; ++i) {
            fibos[i] = fibos[i-1] + fibos[i-2];
        }
        return fibos[n];
    }

    public static int FibonnaciRecursive(int n) {
        if (n == 0 || n == 1) return n;

        return FibonnaciRecursive(n-1) + FibonnaciRecursive(n-2);
    }
}

