package common;

import java.io.*;

class Factorial {
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        int answer = 1;
        for (int i = 1; i <= input; ++i) {
            answer *= factorial(i);
        }

        System.out.println(answer);
    }

    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; ++i) {
            factorial *= i;
        }
        return factorial;
    }
    
}
